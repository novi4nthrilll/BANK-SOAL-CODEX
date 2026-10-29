package I1;

import B.C0006g;
import B.C0011l;
import I2.AbstractC0030a;
import I2.AbstractC0052x;
import I2.C0049u;
import I2.L;
import I2.S;
import I2.V;
import I2.g0;
import W1.C0104l;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.Selection;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.SpellCheckerInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p013d1.AbstractC0413a3;

/* JADX INFO: loaded from: classes.dex */
public final class p extends FrameLayout implements U1.a, z {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public r f391A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f392d;
    public final l e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h f393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f395h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f396i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f397j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public J1.c f398k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f399l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public A0.g f400m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public io.flutter.plugin.editing.h f401n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.flutter.plugin.editing.f f402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public T1.a f403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public D0.b f404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0025a f405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public io.flutter.view.m f406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextServicesManager f407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public A0.f f408u;
    public final io.flutter.embedding.engine.renderer.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0006g f409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final H.a f410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0029e f411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n f412z;

    public p(AbstractActivityC0028d abstractActivityC0028d, j jVar) {
        super(abstractActivityC0028d, null);
        this.f396i = new HashSet();
        this.f399l = new HashSet();
        this.v = new io.flutter.embedding.engine.renderer.k();
        this.f409w = new C0006g(4, this);
        this.f410x = new H.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f411y = new C0029e(2, this);
        this.f391A = new r();
        this.f392d = jVar;
        this.f394g = jVar;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void a() {
        SparseArray sparseArray;
        Objects.toString(this.f398k);
        if (!c()) {
            return;
        }
        Iterator it = this.f399l.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        getContext().getContentResolver().unregisterContentObserver(this.f410x);
        io.flutter.plugin.platform.i iVar = this.f398k.f711r;
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = iVar.f4733m;
            if (i3 >= sparseArray2.size()) {
                break;
            }
            iVar.f4724c.removeView((io.flutter.plugin.platform.e) sparseArray2.valueAt(i3));
            i3++;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray3 = iVar.f4731k;
            if (i4 >= sparseArray3.size()) {
                iVar.e();
                if (iVar.f4724c == null) {
                    Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
                } else {
                    int i5 = 0;
                    while (true) {
                        sparseArray = iVar.f4732l;
                        if (i5 >= sparseArray.size()) {
                            break;
                        }
                        iVar.f4724c.removeView((View) sparseArray.valueAt(i5));
                        i5++;
                    }
                    sparseArray.clear();
                }
                iVar.f4724c = null;
                iVar.f4735o = false;
                SparseArray sparseArray4 = iVar.f4730j;
                if (sparseArray4.size() > 0) {
                    sparseArray4.valueAt(0).getClass();
                    throw new ClassCastException();
                }
                io.flutter.plugin.platform.h hVar = this.f398k.f712s;
                int i6 = 0;
                while (true) {
                    SparseArray sparseArray5 = hVar.f4716h;
                    if (i6 >= sparseArray5.size()) {
                        Surface surface = hVar.f4719k;
                        if (surface != null) {
                            surface.release();
                            hVar.f4719k = null;
                            hVar.f4720l = null;
                        }
                        hVar.f4712c = null;
                        SparseArray sparseArray6 = hVar.f4715g;
                        if (sparseArray6.size() > 0) {
                            sparseArray6.valueAt(0).getClass();
                            throw new ClassCastException();
                        }
                        this.f398k.f711r.a();
                        this.f398k.f712s.a();
                        io.flutter.view.m mVar = this.f406s;
                        mVar.f4851t = true;
                        mVar.e.a();
                        mVar.f4849r = null;
                        AccessibilityManager accessibilityManager = mVar.f4835c;
                        accessibilityManager.removeAccessibilityStateChangeListener(mVar.v);
                        accessibilityManager.removeTouchExplorationStateChangeListener(mVar.f4853w);
                        mVar.f4837f.unregisterContentObserver(mVar.f4854x);
                        D0.b bVar = mVar.f4834b;
                        bVar.f183g = null;
                        ((FlutterJNI) bVar.f182f).setAccessibilityDelegate(null);
                        this.f406s = null;
                        this.f401n.f4692b.restartInput(this);
                        this.f401n.b();
                        int size = ((HashSet) this.f404q.f182f).size();
                        if (size > 0) {
                            Log.w("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
                        }
                        io.flutter.plugin.editing.f fVar = this.f402o;
                        if (fVar != null) {
                            fVar.f4680a.e = null;
                            SpellCheckerSession spellCheckerSession = fVar.f4682c;
                            if (spellCheckerSession != null) {
                                spellCheckerSession.close();
                            }
                        }
                        A0.g gVar = this.f400m;
                        if (gVar != null) {
                            ((A0.f) gVar.f19f).e = null;
                        }
                        io.flutter.embedding.engine.renderer.l lVar = this.f398k.f696b;
                        this.f397j = false;
                        lVar.f4647a.removeIsDisplayingFlutterUiListener(this.f411y);
                        lVar.c();
                        lVar.f4647a.setSemanticsEnabled(false);
                        View view = this.f395h;
                        if (view != null && this.f394g == this.f393f) {
                            this.f394g = view;
                        }
                        this.f394g.c();
                        h hVar2 = this.f393f;
                        if (hVar2 != null) {
                            hVar2.f373d.close();
                            removeView(this.f393f);
                            this.f393f = null;
                        }
                        this.f395h = null;
                        this.f398k = null;
                        return;
                    }
                    if (sparseArray5.valueAt(i6) != null) {
                        throw new ClassCastException();
                    }
                    hVar.f4712c.removeView(null);
                    i6++;
                }
            } else {
                if (sparseArray3.valueAt(i4) != null) {
                    throw new ClassCastException();
                }
                iVar.f4724c.removeView(null);
                i4++;
            }
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        E0.n nVar;
        E0.n nVar2;
        io.flutter.plugin.editing.h hVar = this.f401n;
        if (Build.VERSION.SDK_INT < 26) {
            hVar.getClass();
            return;
        }
        R1.m mVar = hVar.f4695f;
        if (mVar == null || hVar.f4696g == null || (nVar = mVar.f1501j) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            R1.m mVar2 = (R1.m) hVar.f4696g.get(sparseArray.keyAt(i3));
            if (mVar2 != null && (nVar2 = mVar2.f1501j) != null) {
                String string = C.f.k(sparseArray.valueAt(i3)).getTextValue().toString();
                R1.o oVar = new R1.o(string, string.length(), string.length(), -1, -1);
                String str = (String) nVar2.f236d;
                if (str.equals((String) nVar.f236d)) {
                    hVar.f4697h.f(oVar);
                } else {
                    map.put(str, oVar);
                }
            }
        }
        int i4 = hVar.e.f90c;
        A0.g gVar = hVar.f4694d;
        gVar.getClass();
        String.valueOf(map.size());
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            R1.o oVar2 = (R1.o) entry.getValue();
            map2.put((String) entry.getKey(), A0.g.o(oVar2.f1507a, oVar2.f1508b, oVar2.f1509c, -1, -1));
        }
        ((E0.n) gVar.e).b("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i4), map2), null);
    }

    public final void b() {
        j jVar = this.f392d;
        if (jVar != null) {
            addView(jVar);
        } else {
            l lVar = this.e;
            if (lVar != null) {
                addView(lVar);
            } else {
                addView(this.f393f);
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final boolean c() {
        J1.c cVar = this.f398k;
        if (cVar != null) {
            if (cVar.f696b == this.f394g.getAttachedRenderer()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean checkInputConnectionProxy(View view) {
        J1.c cVar = this.f398k;
        if (cVar == null) {
            return super.checkInputConnectionProxy(view);
        }
        io.flutter.plugin.platform.i iVar = cVar.f711r;
        if (view == null) {
            iVar.getClass();
            return false;
        }
        HashMap map = iVar.f4729i;
        if (!map.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) map.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    public final void d() {
        boolean z2;
        String str;
        boolean z3;
        char c3 = (getResources().getConfiguration().uiMode & 48) == 32 ? (char) 2 : (char) 1;
        TextServicesManager textServicesManager = this.f407t;
        if (textServicesManager != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                Iterator it = textServicesManager.getEnabledSpellCheckerInfos().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    } else if (((SpellCheckerInfo) it.next()).getPackageName().equals("com.google.android.inputmethod.latin")) {
                        z3 = true;
                        break;
                    }
                }
                z2 = this.f407t.isSpellCheckerEnabled() && z3;
            }
        }
        E0.n nVar = this.f398k.f707n.f1492a;
        HashMap map = new HashMap();
        map.put("textScaleFactor", Float.valueOf(getResources().getConfiguration().fontScale));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        map.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z2));
        map.put("brieflyShowPassword", Boolean.valueOf(Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1));
        map.put("alwaysUse24HourFormat", Boolean.valueOf(DateFormat.is24HourFormat(getContext())));
        if (c3 == 1) {
            str = "light";
        } else {
            if (c3 != 2) {
                throw null;
            }
            str = "dark";
        }
        map.put("platformBrightness", str);
        Objects.toString(map.get("textScaleFactor"));
        Objects.toString(map.get("alwaysUse24HourFormat"));
        Objects.toString(map.get("platformBrightness"));
        if (!(Build.VERSION.SDK_INT >= 34) || displayMetrics == null) {
            nVar.d(map, null);
            return;
        }
        R1.k kVar = new R1.k(displayMetrics);
        D0.b bVar = R1.l.f1491b;
        ((ConcurrentLinkedQueue) bVar.e).add(kVar);
        R1.k kVar2 = (R1.k) bVar.f183g;
        bVar.f183g = kVar;
        A0.g gVar = kVar2 != null ? new A0.g(bVar, kVar2, 22, false) : null;
        map.put("configurationId", Integer.valueOf(kVar.f1489a));
        nVar.d(map, gVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (c() && this.f404q.I(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public final void e() {
        if (!c()) {
            Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        float f3 = getResources().getDisplayMetrics().density;
        io.flutter.embedding.engine.renderer.k kVar = this.v;
        kVar.f4630a = f3;
        kVar.f4644p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        io.flutter.embedding.engine.renderer.l lVar = this.f398k.f696b;
        lVar.getClass();
        if (kVar.f4631b <= 0 || kVar.f4632c <= 0 || kVar.f4630a <= 0.0f) {
            return;
        }
        ArrayList arrayList = kVar.f4645q;
        arrayList.size();
        ArrayList arrayList2 = kVar.f4646r;
        arrayList2.size();
        int size = arrayList2.size() + arrayList.size();
        int[] iArr = new int[size * 4];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            io.flutter.embedding.engine.renderer.c cVar = (io.flutter.embedding.engine.renderer.c) arrayList.get(i3);
            int i4 = i3 * 4;
            Rect rect = cVar.f4613a;
            iArr[i4] = rect.left;
            iArr[i4 + 1] = rect.top;
            iArr[i4 + 2] = rect.right;
            iArr[i4 + 3] = rect.bottom;
            iArr2[i3] = M.j.b(cVar.f4614b);
            iArr3[i3] = M.j.b(cVar.f4615c);
        }
        int size2 = arrayList.size() * 4;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            io.flutter.embedding.engine.renderer.c cVar2 = (io.flutter.embedding.engine.renderer.c) arrayList2.get(i5);
            int i6 = (i5 * 4) + size2;
            Rect rect2 = cVar2.f4613a;
            iArr[i6] = rect2.left;
            iArr[i6 + 1] = rect2.top;
            iArr[i6 + 2] = rect2.right;
            iArr[i6 + 3] = rect2.bottom;
            iArr2[arrayList.size() + i5] = M.j.b(cVar2.f4614b);
            iArr3[arrayList.size() + i5] = M.j.b(cVar2.f4615c);
        }
        lVar.f4647a.setViewportMetrics(kVar.f4630a, kVar.f4631b, kVar.f4632c, kVar.f4633d, kVar.e, kVar.f4634f, kVar.f4635g, kVar.f4636h, kVar.f4637i, kVar.f4638j, kVar.f4639k, kVar.f4640l, kVar.f4641m, kVar.f4642n, kVar.f4643o, kVar.f4644p, iArr, iArr2, iArr3);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.m mVar = this.f406s;
        if (mVar == null || !mVar.f4835c.isEnabled()) {
            return null;
        }
        return this.f406s;
    }

    public J1.c getAttachedFlutterEngine() {
        return this.f398k;
    }

    public S1.f getBinaryMessenger() {
        return this.f398k.f697c;
    }

    public h getCurrentImageSurface() {
        return this.f393f;
    }

    public io.flutter.embedding.engine.renderer.k getViewportMetrics() {
        return this.v;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0131  */
    /* JADX WARN: Code duplicated, block: B:33:0x0139  */
    /* JADX WARN: Code duplicated, block: B:51:0x0179  */
    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        char c3;
        int systemWindowInsetBottom;
        Window window;
        DisplayCutout displayCutout;
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i3 = Build.VERSION.SDK_INT;
        io.flutter.embedding.engine.renderer.k kVar = this.v;
        if (i3 == 29) {
            Insets systemGestureInsets = windowInsets.getSystemGestureInsets();
            kVar.f4640l = systemGestureInsets.top;
            kVar.f4641m = systemGestureInsets.right;
            kVar.f4642n = systemGestureInsets.bottom;
            kVar.f4643o = systemGestureInsets.left;
        }
        boolean z2 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z3 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i3 >= 30) {
            Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
            kVar.f4633d = insets.top;
            kVar.e = insets.right;
            kVar.f4634f = insets.bottom;
            kVar.f4635g = insets.left;
            Insets insets2 = windowInsets.getInsets(WindowInsets.Type.ime());
            kVar.f4636h = insets2.top;
            kVar.f4637i = insets2.right;
            kVar.f4638j = insets2.bottom;
            kVar.f4639k = insets2.left;
            Insets insets3 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            kVar.f4640l = insets3.top;
            kVar.f4641m = insets3.right;
            kVar.f4642n = insets3.bottom;
            kVar.f4643o = insets3.left;
            DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
            if (displayCutout2 != null) {
                Insets waterfallInsets = displayCutout2.getWaterfallInsets();
                kVar.f4633d = Math.max(Math.max(kVar.f4633d, waterfallInsets.top), displayCutout2.getSafeInsetTop());
                kVar.e = Math.max(Math.max(kVar.e, waterfallInsets.right), displayCutout2.getSafeInsetRight());
                kVar.f4634f = Math.max(Math.max(kVar.f4634f, waterfallInsets.bottom), displayCutout2.getSafeInsetBottom());
                kVar.f4635g = Math.max(Math.max(kVar.f4635g, waterfallInsets.left), displayCutout2.getSafeInsetLeft());
            }
        } else {
            if (z3) {
                c3 = 1;
            } else {
                Context context = getContext();
                if (context.getResources().getConfiguration().orientation != 2) {
                    c3 = 1;
                } else {
                    int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
                    if (rotation == 1) {
                        c3 = 3;
                    } else if (rotation == 3) {
                        if (i3 >= 23) {
                            c3 = 2;
                        } else {
                            c3 = 3;
                        }
                    } else if (rotation == 0 || rotation == 2) {
                        c3 = 4;
                    } else {
                        c3 = 1;
                    }
                }
            }
            kVar.f4633d = z2 ? windowInsets.getSystemWindowInsetTop() : 0;
            kVar.e = (c3 == 3 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetRight();
            if (!z3) {
                systemWindowInsetBottom = 0;
            } else if ((((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom()) == 0) {
                systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            } else {
                systemWindowInsetBottom = 0;
            }
            kVar.f4634f = systemWindowInsetBottom;
            kVar.f4635g = (c3 == 2 || c3 == 4) ? 0 : windowInsets.getSystemWindowInsetLeft();
            kVar.f4636h = 0;
            kVar.f4637i = 0;
            kVar.f4638j = ((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d ? 0 : windowInsets.getSystemWindowInsetBottom();
            kVar.f4639k = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i3 >= 28 && (displayCutout = windowInsets.getDisplayCutout()) != null) {
            for (Rect rect : displayCutout.getBoundingRects()) {
                rect.toString();
                arrayList.add(new io.flutter.embedding.engine.renderer.c(rect, 4, 1));
            }
        }
        ArrayList arrayList2 = kVar.f4646r;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            r rVar = this.f391A;
            Context context2 = getContext();
            rVar.getClass();
            Activity activityB = AbstractC0413a3.b(context2);
            WindowInsets rootWindowInsets = null;
            if (activityB != null && (window = activityB.getWindow()) != null) {
                rootWindowInsets = window.getDecorView().getRootWindowInsets();
            }
            List listEmptyList = rootWindowInsets == null ? Collections.emptyList() : rootWindowInsets.getBoundingRects(WindowInsets.Type.captionBar());
            int iMax = kVar.f4633d;
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                iMax = Math.max(iMax, ((Rect) it.next()).bottom);
            }
            kVar.f4633d = iMax;
        }
        e();
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        A0.f fVar;
        L2.d dVarA;
        p063s2.j jVar = p063s2.j.f5670d;
        int i3 = 6;
        super.onAttachedToWindow();
        try {
            p029i0.g gVar = p029i0.h.f4581b;
            Context context = getContext();
            gVar.getClass();
            p029i0.b bVarA = p029i0.g.a(context);
            C0104l c0104l = new C0104l();
            c0104l.e = new ReentrantLock();
            c0104l.f1774d = new LinkedHashMap();
            C0104l c0104l2 = new C0104l();
            c0104l2.e = bVarA;
            c0104l2.f1774d = c0104l;
            fVar = new A0.f(i3, c0104l2);
        } catch (NoClassDefFoundError unused) {
            fVar = null;
        }
        this.f408u = fVar;
        Activity activityB = AbstractC0413a3.b(getContext());
        A0.f fVar2 = this.f408u;
        if (fVar2 == null || activityB == null) {
            return;
        }
        this.f412z = new n(0, this);
        Context context2 = getContext();
        Executor executorA = Build.VERSION.SDK_INT >= 28 ? p056r.c.a(context2) : new N0.o(3, new Handler(context2.getMainLooper()));
        n nVar = this.f412z;
        C0104l c0104l3 = (C0104l) fVar2.e;
        B2.h.e(executorA, "executor");
        B2.h.e(nVar, "consumer");
        p029i0.b bVar = (p029i0.b) c0104l3.e;
        bVar.getClass();
        L2.c cVar = new L2.c(new p029i0.i(bVar, activityB, null), jVar, -2, 1);
        P2.d dVar = I2.D.f434a;
        J2.c cVar2 = N2.o.f1159a;
        if (cVar2.f(C0049u.e) != null) {
            throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + cVar2).toString());
        }
        if (!cVar2.equals(jVar)) {
            dVarA = cVar;
            dVarA = M2.l.a(cVar, cVar2, 0, 0, 6);
        }
        dVarA = cVar;
        C0104l c0104l4 = (C0104l) c0104l3.f1774d;
        c0104l4.getClass();
        B2.h.e(dVarA, "flow");
        ReentrantLock reentrantLock = (ReentrantLock) c0104l4.e;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0104l4.f1774d;
        try {
            if (linkedHashMap.get(nVar) == null) {
                p063s2.i l3 = new L(executorA);
                if (l3.f(C0049u.e) == null) {
                    l3 = l3.h(new V(null));
                }
                p022g0.a aVar = new p022g0.a(dVarA, nVar, null);
                p063s2.i iVarA = AbstractC0052x.a(l3, jVar, true);
                P2.d dVar2 = I2.D.f434a;
                if (iVarA != dVar2 && iVarA.f(p063s2.e.f5669d) == null) {
                    iVarA = iVarA.h(dVar2);
                }
                AbstractC0030a g0Var = new g0(iVarA, true);
                g0Var.W(1, g0Var, aVar);
                linkedHashMap.put(nVar, g0Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f398k != null) {
            this.f403p.b(configuration);
            d();
            AbstractC0413a3.a(getContext(), this.f398k);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:74:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b8  */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i3;
        int i4;
        int i5;
        if (!c()) {
            return super.onCreateInputConnection(editorInfo);
        }
        io.flutter.plugin.editing.h hVar = this.f401n;
        D0.b bVar = this.f404q;
        C0011l c0011l = hVar.e;
        int i6 = c0011l.f89b;
        if (i6 == 1) {
            hVar.f4699j = null;
            return null;
        }
        int i7 = 4;
        if (i6 == 4) {
            return null;
        }
        if (i6 == 3) {
            if (hVar.f4705p) {
                return hVar.f4699j;
            }
            hVar.f4700k.d(c0011l.f90c);
            throw null;
        }
        R1.m mVar = hVar.f4695f;
        R1.n nVar = mVar.f1498g;
        int i8 = nVar.f1504a;
        if (i8 != 2) {
            if (i8 == 5) {
                int i9 = nVar.f1505b ? 4098 : 2;
                if (nVar.f1506c) {
                    i3 = i9 | 8192;
                    i7 = i3;
                } else {
                    i7 = i9;
                }
            } else if (i8 == 6) {
                i7 = 3;
            } else if (i8 == 11) {
                i7 = 0;
            } else {
                if (i8 == 7) {
                    i3 = 131073;
                } else if (i8 == 8 || i8 == 13) {
                    i3 = 33;
                } else if (i8 == 9 || i8 == 12) {
                    i3 = 17;
                } else if (i8 == 10) {
                    i3 = 145;
                } else if (i8 == 3) {
                    i3 = 97;
                } else {
                    i3 = i8 == 4 ? 113 : 1;
                }
                if (mVar.f1493a) {
                    i4 = 524416;
                } else {
                    if (mVar.f1494b) {
                        i3 |= 32768;
                    }
                    if (mVar.f1495c) {
                        i5 = mVar.f1497f;
                        if (i5 == 1) {
                            i3 |= 4096;
                        } else if (i5 == 2) {
                            i3 |= 8192;
                        } else if (i5 == 3) {
                            i3 |= 16384;
                        }
                    } else {
                        i4 = 524432;
                    }
                    i7 = i3;
                }
                i3 |= i4;
                i5 = mVar.f1497f;
                if (i5 == 1) {
                    i3 |= 4096;
                } else if (i5 == 2) {
                    i3 |= 8192;
                } else if (i5 == 3) {
                    i3 |= 16384;
                }
                i7 = i3;
            }
        }
        editorInfo.inputType = i7;
        editorInfo.imeOptions = 33554432;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && !mVar.f1496d) {
            editorInfo.imeOptions = 50331648;
        }
        int iIntValue = mVar.f1499h.intValue();
        R1.m mVar2 = hVar.f4695f;
        String str = mVar2.f1500i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = iIntValue;
        }
        editorInfo.imeOptions = iIntValue | editorInfo.imeOptions;
        String[] strArr = mVar2.f1502k;
        if (strArr != null) {
            if (i10 >= 25) {
                editorInfo.contentMimeTypes = strArr;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
            }
        }
        if (i10 >= 34) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
        }
        io.flutter.plugin.editing.b bVar2 = new io.flutter.plugin.editing.b(this, hVar.e.f90c, hVar.f4694d, bVar, hVar.f4697h, editorInfo);
        io.flutter.plugin.editing.e eVar = hVar.f4697h;
        eVar.getClass();
        editorInfo.initialSelStart = Selection.getSelectionStart(eVar);
        io.flutter.plugin.editing.e eVar2 = hVar.f4697h;
        eVar2.getClass();
        editorInfo.initialSelEnd = Selection.getSelectionEnd(eVar2);
        hVar.f4699j = bVar2;
        return bVar2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        n nVar;
        A0.f fVar = this.f408u;
        if (fVar != null && (nVar = this.f412z) != null) {
            C0104l c0104l = (C0104l) ((C0104l) fVar.e).f1774d;
            c0104l.getClass();
            ReentrantLock reentrantLock = (ReentrantLock) c0104l.e;
            reentrantLock.lock();
            LinkedHashMap linkedHashMap = (LinkedHashMap) c0104l.f1774d;
            try {
                S s3 = (S) linkedHashMap.get(nVar);
                if (s3 != null) {
                    s3.a(null);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f412z = null;
        this.f408u = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (c()) {
            C0025a c0025a = this.f405r;
            Context context = getContext();
            c0025a.getClass();
            boolean zIsFromSource = motionEvent.isFromSource(2);
            boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
            if (zIsFromSource && z2) {
                int iB = C0025a.b(motionEvent.getActionMasked());
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                c0025a.a(motionEvent, motionEvent.getActionIndex(), iB, 0, C0025a.f348f, byteBufferAllocateDirect, context);
                if (byteBufferAllocateDirect.position() % 288 != 0) {
                    throw new AssertionError("Packet position is not on field boundary.");
                }
                c0025a.f349a.f4647a.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        return !c() ? super.onHoverEvent(motionEvent) : this.f406s.d(motionEvent, false);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        Rect rect;
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        io.flutter.plugin.editing.h hVar = this.f401n;
        if (Build.VERSION.SDK_INT < 26) {
            hVar.getClass();
            return;
        }
        if (hVar.f4696g != null) {
            String str = (String) hVar.f4695f.f1501j.f236d;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i4 = 0; i4 < hVar.f4696g.size(); i4++) {
                int iKeyAt = hVar.f4696g.keyAt(i4);
                E0.n nVar = ((R1.m) hVar.f4696g.valueAt(i4)).f1501j;
                if (nVar != null) {
                    viewStructure.addChildCount(1);
                    ViewStructure viewStructureNewChild = viewStructure.newChild(i4);
                    viewStructureNewChild.setAutofillId(autofillId, iKeyAt);
                    String[] strArr = (String[]) nVar.e;
                    if (strArr.length > 0) {
                        viewStructureNewChild.setAutofillHints(strArr);
                    }
                    viewStructureNewChild.setAutofillType(1);
                    viewStructureNewChild.setVisibility(0);
                    String str2 = (String) nVar.f238g;
                    if (str2 != null) {
                        viewStructureNewChild.setHint(str2);
                    }
                    if (str.hashCode() != iKeyAt || (rect = hVar.f4702m) == null) {
                        viewStructureNewChild.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(((R1.o) nVar.f237f).f1507a));
                    } else {
                        viewStructureNewChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), hVar.f4702m.height());
                        viewStructureNewChild.setAutofillValue(AutofillValue.forText(hVar.f4697h));
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        io.flutter.embedding.engine.renderer.k kVar = this.v;
        kVar.f4631b = i3;
        kVar.f4632c = i4;
        e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        if (!c()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        C0025a c0025a = this.f405r;
        Matrix matrix = C0025a.f348f;
        c0025a.getClass();
        int actionMasked = motionEvent.getActionMasked();
        int iB = C0025a.b(motionEvent.getActionMasked());
        char c3 = 5;
        boolean z2 = actionMasked == 0 || actionMasked == 5;
        boolean z3 = !z2 && (actionMasked == 1 || actionMasked == 6);
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        if (toolType == 1) {
            c3 = 0;
        } else if (toolType == 2) {
            c3 = 2;
        } else if (toolType == 3) {
            c3 = 1;
        } else if (toolType == 4) {
            c3 = 3;
        }
        int i3 = (z3 && c3 == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i3) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z2) {
            c0025a.a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBufferAllocateDirect, null);
            byteBuffer = byteBufferAllocateDirect;
        } else if (z3) {
            int i4 = 0;
            while (i4 < pointerCount) {
                if (i4 != motionEvent.getActionIndex() && motionEvent.getToolType(i4) == 1) {
                    c0025a.a(motionEvent, i4, 5, 1, matrix, byteBufferAllocateDirect, null);
                }
                i4++;
                byteBufferAllocateDirect = byteBufferAllocateDirect;
            }
            byteBuffer = byteBufferAllocateDirect;
            c0025a.a(motionEvent, motionEvent.getActionIndex(), iB, 0, matrix, byteBuffer, null);
            if (i3 != 0) {
                c0025a.a(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBuffer, null);
            }
        } else {
            byteBuffer = byteBufferAllocateDirect;
            for (int i5 = 0; i5 < pointerCount; i5++) {
                c0025a.a(motionEvent, i5, iB, 0, matrix, byteBuffer, null);
            }
        }
        if (byteBuffer.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0025a.f349a.f4647a.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
        return true;
    }

    public void setDelegate(r rVar) {
        this.f391A = rVar;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f394g;
        if (view instanceof j) {
            ((j) view).setVisibility(i3);
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    @TargetApi(28)
    public void setWindowInfoListenerDisplayFeatures(p029i0.j jVar) {
        ?? r8 = jVar.f4586a;
        ArrayList arrayList = new ArrayList();
        for (p029i0.c cVar : r8) {
            cVar.f4571a.c().toString();
            p019f0.b bVar = cVar.f4571a;
            int iB = bVar.b();
            p029i0.b bVar2 = p029i0.b.f4565g;
            int i3 = 2;
            int i4 = ((iB == 0 || bVar.a() == 0) ? p029i0.b.f4564f : bVar2) == bVar2 ? 3 : 2;
            p029i0.b bVar3 = p029i0.b.f4566h;
            p029i0.b bVar4 = cVar.f4573c;
            if (bVar4 != bVar3) {
                i3 = bVar4 == p029i0.b.f4567i ? 3 : 1;
            }
            arrayList.add(new io.flutter.embedding.engine.renderer.c(bVar.c(), i4, i3));
        }
        ArrayList arrayList2 = this.v.f4645q;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        e();
    }

    public p(AbstractActivityC0028d abstractActivityC0028d, l lVar) {
        super(abstractActivityC0028d, null);
        this.f396i = new HashSet();
        this.f399l = new HashSet();
        this.v = new io.flutter.embedding.engine.renderer.k();
        this.f409w = new C0006g(4, this);
        this.f410x = new H.a(this, new Handler(Looper.getMainLooper()), 1);
        this.f411y = new C0029e(2, this);
        this.f391A = new r();
        this.e = lVar;
        this.f394g = lVar;
        b();
    }
}
