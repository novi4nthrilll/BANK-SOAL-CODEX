package io.flutter.embedding.engine;

import B.L;
import C.f;
import I1.AbstractActivityC0028d;
import I1.o;
import I1.p;
import I2.C0045p;
import J1.b;
import J1.j;
import J1.k;
import K1.d;
import L1.a;
import R1.l;
import S1.e;
import S1.r;
import W1.C0104l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.platform.h;
import io.flutter.plugin.platform.i;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.c;
import io.flutter.view.g;
import io.flutter.view.u;
import io.flutter.view.v;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static k asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private j accessibilityDelegate;
    private a deferredComponentManager;
    private T1.a localizationPlugin;
    private Long nativeShellHolderId;
    private K1.k platformMessageHandler;
    private i platformViewsController;
    private h platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j3) {
        k kVar = asyncWaitForVsyncDelegate;
        if (kVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        c cVar = (c) kVar;
        cVar.getClass();
        Choreographer choreographer = Choreographer.getInstance();
        v vVar = (v) cVar.f4749a;
        u uVar = vVar.f4869c;
        if (uVar != null) {
            uVar.f4864a = j3;
            vVar.f4869c = null;
        } else {
            uVar = new u(vVar, j3);
        }
        choreographer.postFrameCallback(uVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [J1.i] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: J1.i
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j3, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e) {
                Log.e(TAG, "Failed to decode image", e);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i3, ByteBuffer byteBuffer) {
        e eVar;
        K1.k kVar = this.platformMessageHandler;
        if (kVar == null || (eVar = (e) ((K1.j) kVar).f770i.remove(Integer.valueOf(i3))) == null) {
            return;
        }
        try {
            eVar.a(byteBuffer);
            if (byteBuffer == null || !byteBuffer.isDirect()) {
                return;
            }
            byteBuffer.limit(0);
        } catch (Error e) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                throw e;
            }
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e);
        } catch (Exception e3) {
            Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j3, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j3, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j3);

    private native void nativeDeferredComponentInstallFailure(int i3, String str, boolean z2);

    private native void nativeDestroy(long j3);

    private native void nativeDispatchEmptyPlatformMessage(long j3, String str, int i3);

    private native void nativeDispatchPlatformMessage(long j3, String str, ByteBuffer byteBuffer, int i3, int i4);

    private native void nativeDispatchPointerDataPacket(long j3, ByteBuffer byteBuffer, int i3);

    private native void nativeDispatchSemanticsAction(long j3, int i3, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i3);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i3);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i3);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i3);

    private native Bitmap nativeGetBitmap(long j3);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j3, int i3, int i4);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j3, int i3);

    private native void nativeInvokePlatformMessageResponseCallback(long j3, int i3, ByteBuffer byteBuffer, int i4);

    private native boolean nativeIsSurfaceControlEnabled(long j3);

    private native void nativeLoadDartDeferredLibrary(long j3, int i3, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j3);

    private native void nativeMarkTextureFrameAvailable(long j3, long j4);

    private native void nativeNotifyLowMemoryWarning(long j3);

    private native void nativeOnVsync(long j3, long j4, long j5);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j3, long j4, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z2);

    private native void nativeRegisterTexture(long j3, long j4, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j3, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4);

    private native void nativeScheduleFrame(long j3);

    private native void nativeSetAccessibilityFeatures(long j3, int i3);

    private native void nativeSetSemanticsEnabled(long j3, boolean z2);

    private native void nativeSetViewportMetrics(long j3, float f3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j3, String str, String str2, String str3, List<String> list, long j4);

    private native void nativeSurfaceChanged(long j3, int i3, int i4);

    private native void nativeSurfaceCreated(long j3, Surface surface);

    private native void nativeSurfaceDestroyed(long j3);

    private native void nativeSurfaceWindowChanged(long j3, Surface surface);

    private native void nativeUnregisterTexture(long j3, long j4);

    private native void nativeUpdateDisplayMetrics(long j3);

    private native void nativeUpdateJavaAssetManager(long j3, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f3);

    private void onPreEngineRestart() {
        Iterator<b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        j jVar = this.accessibilityDelegate;
        if (jVar != null) {
            c cVar = (c) jVar;
            cVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            io.flutter.view.m mVar = (io.flutter.view.m) cVar.f4749a;
            mVar.getClass();
            while (byteBuffer.hasRemaining()) {
                g gVarA = mVar.a(byteBuffer.getInt());
                gVarA.f4777c = byteBuffer.getInt();
                int i3 = byteBuffer.getInt();
                String str = null;
                gVarA.f4778d = i3 == -1 ? null : strArr[i3];
                int i4 = byteBuffer.getInt();
                if (i4 != -1) {
                    str = strArr[i4];
                }
                gVarA.e = str;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        j jVar = this.accessibilityDelegate;
        if (jVar != null) {
            ((c) jVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionG = L.g();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = hVar.f4717i;
            if (i3 >= arrayList.size()) {
                transactionG.apply();
                arrayList.clear();
                return;
            } else {
                transactionG = transactionG.merge(L.i(arrayList.get(i3)));
                i3++;
            }
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j3) {
        nativeCleanupMessageData(j3);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        Locale localeLookup;
        Locale locale;
        Locale locale2;
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < strArr.length; i3 += 3) {
            String str = strArr[i3];
            String str2 = strArr[i3 + 1];
            String str3 = strArr[i3 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        T1.a aVar = this.localizationPlugin;
        aVar.getClass();
        if (arrayList.isEmpty()) {
            localeLookup = null;
        } else {
            int i4 = Build.VERSION.SDK_INT;
            AbstractActivityC0028d abstractActivityC0028d = aVar.f1626b;
            if (i4 >= 26) {
                ArrayList arrayList2 = new ArrayList();
                LocaleList locales = abstractActivityC0028d.getResources().getConfiguration().getLocales();
                int size = locales.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Locale locale3 = locales.get(i5);
                    String language = locale3.getLanguage();
                    if (!locale3.getScript().isEmpty()) {
                        language = language + "-" + locale3.getScript();
                    }
                    if (!locale3.getCountry().isEmpty()) {
                        language = language + "-" + locale3.getCountry();
                    }
                    arrayList2.add(f.q(language));
                    f.s();
                    arrayList2.add(f.q(locale3.getLanguage()));
                    f.s();
                    arrayList2.add(f.q(locale3.getLanguage() + "-*"));
                }
                localeLookup = Locale.lookup(arrayList2, arrayList);
                if (localeLookup == null) {
                    localeLookup = (Locale) arrayList.get(0);
                }
            } else {
                if (i4 >= 24) {
                    LocaleList locales2 = abstractActivityC0028d.getResources().getConfiguration().getLocales();
                    int i6 = 0;
                    loop2: while (true) {
                        if (i6 >= locales2.size()) {
                            localeLookup = (Locale) arrayList.get(0);
                            break;
                        }
                        Locale locale4 = locales2.get(i6);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                locale2 = (Locale) it.next();
                                if (locale4.equals(locale2)) {
                                }
                            } else {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        locale2 = (Locale) it2.next();
                                        if (locale4.getLanguage().equals(locale2.toLanguageTag())) {
                                        }
                                    } else {
                                        Iterator it3 = arrayList.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                locale2 = (Locale) it3.next();
                                                if (locale4.getLanguage().equals(locale2.getLanguage())) {
                                                }
                                            } else {
                                                i6++;
                                            }
                                        }
                                    }
                                }
                            }
                            localeLookup = locale2;
                            break loop2;
                        }
                    }
                }
                Locale locale5 = abstractActivityC0028d.getResources().getConfiguration().locale;
                if (locale5 != null) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            locale = (Locale) it4.next();
                            if (locale5.equals(locale)) {
                            }
                        } else {
                            Iterator it5 = arrayList.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    locale = (Locale) it5.next();
                                    if (locale5.getLanguage().equals(locale.toString())) {
                                    }
                                } else {
                                    localeLookup = (Locale) arrayList.get(0);
                                }
                            }
                        }
                        localeLookup = locale;
                    }
                } else {
                    localeLookup = (Locale) arrayList.get(0);
                }
            }
        }
        return localeLookup == null ? new String[0] : new String[]{localeLookup.getLanguage(), localeLookup.getCountry(), localeLookup.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        io.flutter.plugin.platform.b bVar = new io.flutter.plugin.platform.b(iVar.f4724c.getContext(), iVar.f4724c.getWidth(), iVar.f4724c.getHeight(), 2);
        bVar.f4707j = iVar.f4727g;
        int i3 = iVar.f4734n;
        iVar.f4734n = i3 + 1;
        iVar.f4732l.put(i3, bVar);
        return new FlutterOverlaySurface(i3, bVar.getSurface());
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        if (hVar.f4719k == null) {
            SurfaceControl.Builder builderF = L.f();
            builderF.setBufferSize(hVar.f4712c.getWidth(), hVar.f4712c.getHeight());
            builderF.setFormat(1);
            builderF.setName("Flutter Overlay Surface");
            builderF.setOpaque(false);
            builderF.setHidden(false);
            SurfaceControl surfaceControlBuild = builderF.build();
            SurfaceControl.Transaction transactionBuildReparentTransaction = hVar.f4712c.getRootSurfaceControl().buildReparentTransaction(surfaceControlBuild);
            transactionBuildReparentTransaction.setLayer(surfaceControlBuild, 1000);
            transactionBuildReparentTransaction.apply();
            hVar.f4719k = L.e(surfaceControlBuild);
            hVar.f4720l = surfaceControlBuild;
        }
        return new FlutterOverlaySurface(0, hVar.f4719k);
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionG = L.g();
        hVar.f4717i.add(transactionG);
        return transactionG;
    }

    public void deferredComponentInstallFailure(int i3, String str, boolean z2) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i3, str, z2);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        Surface surface = hVar.f4719k;
        if (surface != null) {
            surface.release();
            hVar.f4719k = null;
            hVar.f4720l = null;
        }
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        iVar.e();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i3);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i3);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i3, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i3, i4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i3);
    }

    public void dispatchSemanticsAction(int i3, io.flutter.view.f fVar) {
        dispatchSemanticsAction(i3, fVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("");
        }
        SurfaceControl.Transaction transactionG = L.g();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = hVar.f4718j;
            if (i3 >= arrayList.size()) {
                arrayList.clear();
                hVar.f4712c.invalidate();
                hVar.f4712c.getRootSurfaceControl().applyTransactionOnDraw(transactionG);
                return;
            }
            transactionG = transactionG.merge(L.i(arrayList.get(i3)));
            i3++;
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0075  */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:23:0x0098  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x0079, please report this as an issue */
    public float getScaledFontSize(float f3, int i3) {
        R1.k kVar;
        DisplayMetrics displayMetrics;
        D0.b bVar = l.f1491b;
        R1.k kVar2 = (R1.k) bVar.f182f;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.e;
        if (kVar2 == null) {
            bVar.f182f = (R1.k) concurrentLinkedQueue.poll();
        }
        while (true) {
            kVar = (R1.k) bVar.f182f;
            if (kVar == null || kVar.f1489a >= i3) {
                break;
            }
            bVar.f182f = (R1.k) concurrentLinkedQueue.poll();
        }
        if (kVar != null) {
            if (kVar.f1489a != i3) {
                Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i3) + ", the oldest config is now: " + String.valueOf(((R1.k) bVar.f182f).f1489a));
            }
            displayMetrics = kVar != null ? kVar.f1490b : null;
            if (displayMetrics == null) {
                return TypedValue.applyDimension(2, f3, displayMetrics) / displayMetrics.density;
            }
            Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i3) + ", which can't be found.");
            return -1.0f;
        }
        Log.e("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i3) + ", after exhausting the queue.");
        kVar = null;
        if (kVar != null) {
        }
        if (displayMetrics == null) {
            return TypedValue.applyDimension(2, f3, displayMetrics) / displayMetrics.density;
        }
        Log.e(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i3) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i3, long j3) {
        K1.f fVar;
        boolean z2;
        K1.k kVar = this.platformMessageHandler;
        if (kVar == null) {
            nativeCleanupMessageData(j3);
            return;
        }
        K1.j jVar = (K1.j) kVar;
        synchronized (jVar.f768g) {
            try {
                fVar = (K1.f) jVar.e.get(str);
                z2 = jVar.f769h.get() && fVar == null;
                if (z2) {
                    if (!jVar.f767f.containsKey(str)) {
                        jVar.f767f.put(str, new LinkedList());
                    }
                    ((List) jVar.f767f.get(str)).add(new d(j3, byteBuffer, i3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            return;
        }
        jVar.a(str, fVar, byteBuffer, i3, j3);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (hVar.f4720l == null) {
            return;
        }
        SurfaceControl.Transaction transactionG = L.g();
        transactionG.setVisibility(hVar.f4720l, false);
        transactionG.apply();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j3, int i3) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j3, i3);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i3) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i3);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i3, ByteBuffer byteBuffer, int i4) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i3, byteBuffer, i4);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i3);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i3) {
        return nativeFlutterTextUtilsIsEmoji(i3);
    }

    public boolean isCodePointEmojiModifier(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifier(i3);
    }

    public boolean isCodePointEmojiModifierBase(int i3) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i3);
    }

    public boolean isCodePointRegionalIndicator(int i3) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i3);
    }

    public boolean isCodePointVariantSelector(int i3) {
        return nativeFlutterTextUtilsIsVariationSelector(i3);
    }

    public void loadDartDeferredLibrary(int i3, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i3, strArr);
    }

    public void loadLibrary(Context context) throws Throwable {
        C0104l c0104l;
        String[] strArrG;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        char c3 = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        D0.b bVar = new D0.b(26);
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        D0.b.K("Beginning load of %s...", "flutter");
        p065t0.e eVar = (p065t0.e) bVar.f182f;
        HashSet hashSet = (HashSet) bVar.e;
        if (hashSet.contains("flutter")) {
            D0.b.K("%s already loaded previously!", "flutter");
        } else {
            try {
                eVar.getClass();
                System.loadLibrary("flutter");
                hashSet.add("flutter");
                D0.b.K("%s (%s) was loaded normally!", "flutter", null);
            } catch (UnsatisfiedLinkError e) {
                D0.b.K("Loading the library normally failed: %s", Log.getStackTraceString(e));
                D0.b.K("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                File fileH = bVar.H(context);
                if (!fileH.exists()) {
                    File dir = context.getDir("lib", 0);
                    File fileH2 = bVar.H(context);
                    eVar.getClass();
                    File[] fileArrListFiles = dir.listFiles(new v0.a(System.mapLibraryName("flutter")));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (!file.getAbsolutePath().equals(fileH2.getAbsolutePath())) {
                                file.delete();
                            }
                        }
                    }
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr.length <= 0) {
                        String str = Build.CPU_ABI2;
                        strArr = (str == null || str.length() == 0) ? new String[]{Build.CPU_ABI} : new String[]{Build.CPU_ABI, str};
                    }
                    String strMapLibraryName = System.mapLibraryName("flutter");
                    ((p009c1.v) bVar.f183g).getClass();
                    try {
                        C0104l c0104lF = p009c1.v.f(context, strArr, strMapLibraryName, bVar);
                        try {
                            if (c0104lF == null) {
                                try {
                                    strArrG = p009c1.v.g(context, strMapLibraryName);
                                } catch (Exception e3) {
                                    strArrG = new String[]{e3.toString()};
                                }
                                StringBuilder sb = new StringBuilder("Could not find '");
                                sb.append(strMapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(Arrays.toString(strArr));
                                sb.append(", but only found: ");
                                throw new C0045p(I.h(sb, Arrays.toString(strArrG), "."));
                            }
                            int i3 = 0;
                            while (true) {
                                int i4 = i3 + 1;
                                zipFile = (ZipFile) c0104lF.e;
                                if (i3 >= 5) {
                                    break;
                                }
                                Object[] objArr = new Object[1];
                                objArr[c3] = strMapLibraryName;
                                D0.b.K("Found %s! Extracting...", objArr);
                                try {
                                    if (fileH.exists() || fileH.createNewFile()) {
                                        try {
                                            inputStream2 = zipFile.getInputStream((ZipEntry) c0104lF.f1774d);
                                            try {
                                                fileOutputStream2 = new FileOutputStream(fileH);
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    long j3 = 0;
                                                    while (true) {
                                                        int i5 = inputStream2.read(bArr);
                                                        if (i5 == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, i5);
                                                        j3 += (long) i5;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                    if (j3 == fileH.length()) {
                                                        p009c1.v.d(inputStream2);
                                                        p009c1.v.d(fileOutputStream2);
                                                        fileH.setReadable(true, false);
                                                        fileH.setExecutable(true, false);
                                                        fileH.setWritable(true);
                                                        break;
                                                    }
                                                    p009c1.v.d(inputStream2);
                                                    p009c1.v.d(fileOutputStream2);
                                                } catch (FileNotFoundException unused) {
                                                    p009c1.v.d(inputStream2);
                                                    p009c1.v.d(fileOutputStream2);
                                                    i3 = i4;
                                                    c3 = 0;
                                                } catch (IOException unused2) {
                                                    p009c1.v.d(inputStream2);
                                                    p009c1.v.d(fileOutputStream2);
                                                    i3 = i4;
                                                    c3 = 0;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    p009c1.v.d(inputStream);
                                                    p009c1.v.d(fileOutputStream);
                                                    throw th;
                                                }
                                            } catch (FileNotFoundException unused3) {
                                                fileOutputStream2 = null;
                                                p009c1.v.d(inputStream2);
                                                p009c1.v.d(fileOutputStream2);
                                                i3 = i4;
                                                c3 = 0;
                                            } catch (IOException unused4) {
                                                fileOutputStream2 = null;
                                                p009c1.v.d(inputStream2);
                                                p009c1.v.d(fileOutputStream2);
                                                i3 = i4;
                                                c3 = 0;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                inputStream = inputStream2;
                                                fileOutputStream = null;
                                                p009c1.v.d(inputStream);
                                                p009c1.v.d(fileOutputStream);
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused5) {
                                            inputStream2 = null;
                                        } catch (IOException unused6) {
                                            inputStream2 = null;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            inputStream = null;
                                        }
                                    }
                                } catch (IOException unused7) {
                                }
                                i3 = i4;
                                c3 = 0;
                            }
                            try {
                                zipFile.close();
                            } catch (IOException unused8) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c0104l = c0104lF;
                            if (c0104l != null) {
                                try {
                                    ((ZipFile) c0104l.e).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c0104l = null;
                    }
                }
                String absolutePath = fileH.getAbsolutePath();
                eVar.getClass();
                System.load(absolutePath);
                hashSet.add("flutter");
                D0.b.K("%s (%s) was re-linked!", "flutter", null);
            }
        }
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j3);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        iVar.f4737q.clear();
        iVar.f4738r.clear();
    }

    public void onDisplayOverlaySurface(int i3, int i4, int i5, int i6, int i7) {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        SparseArray sparseArray = iVar.f4732l;
        if (sparseArray.get(i3) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i3 + ") doesn't exist");
        }
        iVar.g();
        View view = (io.flutter.plugin.platform.b) sparseArray.get(i3);
        if (view.getParent() == null) {
            iVar.f4724c.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        iVar.f4737q.add(Integer.valueOf(i3));
    }

    public void onDisplayPlatformView(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        iVar.g();
        if (iVar.f4730j.get(i3) != null) {
            throw new ClassCastException();
        }
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        if (hVar.f4715g.get(i3) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public void onEndFrame() {
        ?? r3;
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController;
        if (iVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        boolean z2 = false;
        if (!iVar.f4735o || !iVar.f4738r.isEmpty()) {
            if (iVar.f4735o) {
                I1.h hVar = iVar.f4724c.f393f;
                if (hVar != null ? hVar.e() : false) {
                    z2 = true;
                }
            }
            iVar.f(z2);
            return;
        }
        iVar.f4735o = false;
        p pVar = iVar.f4724c;
        M1.c cVar = new M1.c(10, iVar);
        I1.h hVar2 = pVar.f393f;
        if (hVar2 == null || (r3 = pVar.f395h) == 0) {
            return;
        }
        pVar.f394g = r3;
        pVar.f395h = null;
        io.flutter.embedding.engine.renderer.l lVar = pVar.f398k.f696b;
        if (lVar != null) {
            r3.d();
            o oVar = new o(pVar, lVar, cVar);
            lVar.f4647a.addIsDisplayingFlutterUiListener(oVar);
            if (lVar.f4650d) {
                oVar.b();
                return;
            }
            return;
        }
        hVar2.c();
        I1.h hVar3 = pVar.f393f;
        if (hVar3 != null) {
            hVar3.f373d.close();
            pVar.removeView(pVar.f393f);
            pVar.f393f = null;
        }
        cVar.run();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void onSurfaceChanged(int i3, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i3, i4);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j3, long j4, long j5) {
        nativeOnVsync(j3, j4, j5);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j3, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z2) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(textureRegistry$ImageConsumer), z2);
    }

    public void registerTexture(long j3, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i3) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j3);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(j jVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = jVar;
    }

    public void setAccessibilityFeatures(int i3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i3);
        }
    }

    public void setAccessibilityFeaturesInNative(int i3) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i3);
    }

    public void setAsyncWaitForVsyncDelegate(k kVar) {
        asyncWaitForVsyncDelegate = kVar;
    }

    public void setDeferredComponentManager(a aVar) {
        ensureRunningOnMainThread();
        if (aVar != null) {
            aVar.a();
        }
    }

    public void setLocalizationPlugin(T1.a aVar) {
        ensureRunningOnMainThread();
        this.localizationPlugin = aVar;
    }

    public void setPlatformMessageHandler(K1.k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(i iVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = iVar;
    }

    public void setPlatformViewsController2(h hVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = hVar;
    }

    public void setRefreshRateFPS(float f3) {
        refreshRateFPS = f3;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z2) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z2);
        }
    }

    public void setSemanticsEnabledInNative(boolean z2) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z2);
    }

    public void setViewportMetrics(float f3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f3, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, iArr, iArr2, iArr3);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        if (hVar.f4720l == null) {
            return;
        }
        SurfaceControl.Transaction transactionG = L.g();
        transactionG.setVisibility(hVar.f4720l, true);
        transactionG.apply();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j3);
        Long l3 = flutterJNINativeSpawn.nativeShellHolderId;
        if ((l3 == null || l3.longValue() == 0) ? false : true) {
            return flutterJNINativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        h hVar = this.platformViewsController2;
        if (hVar == null) {
            throw new RuntimeException("");
        }
        synchronized (hVar) {
            try {
                hVar.f4718j.clear();
                for (int i3 = 0; i3 < hVar.f4717i.size(); i3++) {
                    hVar.f4718j.add(L.i(hVar.f4717i.get(i3)));
                }
                hVar.f4717i.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unregisterTexture(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j3);
    }

    public void updateDisplayMetrics(int i3, float f3, float f4, float f5) {
        displayWidth = f3;
        displayHeight = f4;
        displayDensity = f5;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i3, io.flutter.view.f fVar, Object obj) {
        ByteBuffer byteBufferB;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferB = r.f1594a.b(obj);
            iPosition = byteBufferB.position();
        } else {
            byteBufferB = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i3, fVar.f4774d, byteBufferB, iPosition);
    }

    public void dispatchSemanticsAction(int i3, int i4, ByteBuffer byteBuffer, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i3, i4, byteBuffer, i5);
    }
}
