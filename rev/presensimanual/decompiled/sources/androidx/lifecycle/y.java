package androidx.lifecycle;

import I1.AbstractActivityC0028d;
import J.C0072s;
import W1.C0104l;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C0399z;
import com.google.android.gms.internal.mlkit_vision_face_bundled.C7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.E7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.EnumC0306p5;
import com.google.android.gms.internal.mlkit_vision_face_bundled.EnumC0316q5;
import com.google.android.gms.internal.mlkit_vision_face_bundled.L7;
import com.google.android.gms.internal.mlkit_vision_face_bundled.T4;
import com.google.android.gms.internal.mlkit_vision_face_bundled.U4;
import com.google.android.gms.internal.mlkit_vision_face_bundled.V4;
import com.google.android.gms.internal.mlkit_vision_face_bundled.W4;
import com.google.android.gms.internal.mlkit_vision_face_bundled.X4;
import com.google.android.gms.internal.mlkit_vision_face_bundled.Y4;
import com.google.android.gms.location.LocationResult;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k.C0728f;
import k.C0734i;
import k.InterfaceC0737j0;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public class y implements N0.i, InterfaceC0737j0, p033j1.c, k.C, p040l1.c, L2.d, p075y.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2407d;
    public Object e;

    public /* synthetic */ y(int i3) {
        this.f2407d = i3;
    }

    public static boolean o(int i3) {
        return (48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42;
    }

    private final void p(Object obj) {
        p065t0.b bVar = (p065t0.b) obj;
        LocationResult locationResult = (LocationResult) this.e;
        synchronized (bVar) {
            if (bVar.f5700c.f5707h == null) {
                Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
                p065t0.c cVar = bVar.f5700c;
                cVar.f5703c.d(cVar.f5702b);
                p061s0.a aVar = bVar.f5700c.f5706g;
                if (aVar != null) {
                    aVar.c(2);
                }
                return;
            }
            List list = locationResult.f3529a;
            int size = list.size();
            Location location = size == 0 ? null : (Location) list.get(size - 1);
            if (location == null) {
                return;
            }
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            if (bVar.f5698a != null) {
                location.getExtras().putBoolean("geolocator_use_mslAltitude", bVar.f5698a.f5723d);
            }
            bVar.f5700c.f5704d.a(location);
            bVar.f5700c.f5707h.a(location);
        }
    }

    @Override // k.InterfaceC0737j0
    public void a(p032j.i iVar, p032j.j jVar) {
        p032j.f fVar = (p032j.f) this.e;
        fVar.f4892i.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f4894k;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (iVar == ((p032j.e) arrayList.get(i3)).f4884b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        fVar.f4892i.postAtTime(new C7(this, i4 < arrayList.size() ? (p032j.e) arrayList.get(i4) : null, jVar, iVar), iVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // N0.i
    public void c(Object obj) {
        N0.h hVar;
        switch (this.f2407d) {
            case 1:
                p(obj);
                return;
            default:
                N0.C c3 = ((p006b1.h) this.e).f2524c;
                synchronized (c3) {
                    c3.f1041d = false;
                    hVar = (N0.h) ((N0.j) c3.e).f1086c;
                    break;
                }
                if (hVar != null) {
                    ((p006b1.a) c3.f1042f).b(hVar, 2441);
                    return;
                }
                return;
        }
    }

    @Override // p075y.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.e;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // p075y.b
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.e;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // p033j1.c
    public void g(Object obj) {
        ((p033j1.e) ((y) this.e).e).f4990a.i();
    }

    @Override // p040l1.c
    public Object h(p040l1.s sVar) {
        return this.e;
    }

    @Override // k.InterfaceC0737j0
    public void i(p032j.i iVar, p032j.j jVar) {
        ((p032j.f) this.e).f4892i.removeCallbacksAndMessages(iVar);
    }

    public p073x0.c j(Object obj) throws IOException {
        p073x0.b bVar = (p073x0.b) obj;
        p073x0.d dVar = (p073x0.d) this.e;
        p000a.a.a("CctTransportBackend", "Making request to: %s", bVar.f5825a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f5825a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.f5836g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/2.3.3 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = bVar.f5827c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    p006b1.c cVar = dVar.f5831a;
                    p076y0.i iVar = bVar.f5826b;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    p052p1.d dVar2 = (p052p1.d) cVar.f2515d;
                    p052p1.e eVar = new p052p1.e(bufferedWriter, dVar2.f5549a, dVar2.f5550b, dVar2.f5551c, dVar2.f5552d);
                    eVar.e(iVar);
                    eVar.g();
                    eVar.f5554b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), I.f("Status Code: ", responseCode));
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new p073x0.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new p073x0.c(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            p073x0.c cVar2 = new p073x0.c(responseCode, null, p076y0.m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f5915a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return cVar2;
                        } catch (Throwable th) {
                            if (gZIPInputStream != null) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th4;
            }
        } catch (ConnectException e) {
            e = e;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new p073x0.c(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new p073x0.c(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new p073x0.c(400, null, 0L);
        } catch (n1.b e5) {
            e = e5;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new p073x0.c(400, null, 0L);
        }
    }

    public void k(int i3) {
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) this.e;
        if (iVar.c(i3)) {
            ((io.flutter.plugin.platform.o) iVar.f4728h.get(Integer.valueOf(i3))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i3);
            return;
        }
        if (iVar.f4730j.get(i3) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i3);
    }

    public void l(R1.f fVar) {
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) this.e;
        iVar.getClass();
        int i3 = fVar.f1459a;
        int i4 = fVar.f1461c;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + i4 + "(view id: " + i3 + ")");
        }
        if (iVar.f4733m.get(i3) != null) {
            throw new IllegalStateException(I.f("Trying to create an already created platform view, view id: ", i3));
        }
        if (iVar.f4725d == null) {
            throw new IllegalStateException(I.f("Texture registry is null. This means that platform views controller was detached, view id: ", i3));
        }
        if (iVar.f4724c == null) {
            throw new IllegalStateException(I.f("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i3));
        }
        HashMap map = iVar.f4722a.f731a;
        String str = fVar.f1460b;
        if (map.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(I.g("Trying to create a platform view of unregistered type: ", str));
    }

    public void m(int i3) {
        if (((io.flutter.plugin.platform.i) this.e).f4730j.get(i3) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
    }

    public CharSequence n(R1.c cVar) {
        AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) ((E0.h) this.e).f213f;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0028d.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (cVar != null && cVar != R1.c.f1449d) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor assetFileDescriptorOpenTypedAssetFileDescriptor = abstractActivityC0028d.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence charSequenceCoerceToText = itemAt.coerceToText(abstractActivityC0028d);
                            if (assetFileDescriptorOpenTypedAssetFileDescriptor != null) {
                                try {
                                    assetFileDescriptorOpenTypedAssetFileDescriptor.close();
                                } catch (IOException e) {
                                    charSequence = charSequenceCoerceToText;
                                    e = e;
                                }
                            }
                            charSequence = charSequenceCoerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e3) {
                    e = e3;
                    charSequence = text;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
        Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
        return charSequence;
    }

    @Override // L2.d
    public Object q(L2.e eVar, p063s2.d dVar) {
        Object objQ = ((L2.d) this.e).q(new C0072s(eVar, 1), dVar);
        return objQ == t2.a.f5737d ? objQ : p055q2.g.f5603a;
    }

    public void r(int i3, double d3, double d4) {
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) this.e;
        if (iVar.c(i3)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i3);
    }

    public void s(p032j.i iVar) {
        C0728f c0728f;
        switch (this.f2407d) {
            case 10:
                y yVar = ((ActionMenuView) this.e).f2035w;
                if (yVar != null) {
                    yVar.s(iVar);
                    return;
                }
                return;
            default:
                Toolbar toolbar = (Toolbar) this.e;
                C0734i c0734i = toolbar.f2148d.v;
                if (c0734i == null || (c0728f = c0734i.f5180u) == null || !c0728f.b()) {
                    Iterator it = ((CopyOnWriteArrayList) toolbar.f2139J.e).iterator();
                    if (it.hasNext()) {
                        ((S.f) it.next()).getClass();
                        throw null;
                    }
                    return;
                }
                return;
        }
    }

    public void t(R1.h hVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j3;
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) this.e;
        float f3 = iVar.f4723b.getResources().getDisplayMetrics().density;
        int i3 = hVar.f1465a;
        if (!iVar.c(i3)) {
            if (iVar.f4730j.get(i3) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i3);
            return;
        }
        io.flutter.plugin.platform.o oVar = (io.flutter.plugin.platform.o) iVar.f4728h.get(Integer.valueOf(i3));
        I1.E e = new I1.E(hVar.f1479p);
        while (true) {
            A0.g gVar = iVar.f4739s;
            priorityQueue = (PriorityQueue) gVar.f19f;
            boolean zIsEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) gVar.e;
            j3 = e.f347a;
            if (zIsEmpty || ((Long) priorityQueue.peek()).longValue() >= j3) {
                break;
            } else {
                longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
            }
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j3) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j3);
        List<List> list = (List) hVar.f1470g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d3 = f3;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d3);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d3);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d3);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d3);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d3);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d3);
            arrayList.add(pointerCoords);
        }
        int i4 = hVar.e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i4]);
        List<List> list3 = (List) hVar.f1469f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(hVar.f1466b.longValue(), hVar.f1467c.longValue(), hVar.f1468d, hVar.e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i4]), pointerCoordsArr, hVar.f1471h, hVar.f1472i, hVar.f1473j, hVar.f1474k, hVar.f1475l, hVar.f1476m, hVar.f1477n, hVar.f1478o);
        oVar.getClass();
    }

    public void u(R1.g gVar) {
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) this.e;
        int iH = iVar.h(gVar.f1463b);
        int iH2 = iVar.h(gVar.f1464c);
        int i3 = gVar.f1462a;
        if (!iVar.c(i3)) {
            if (iVar.f4730j.get(i3) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i3);
            return;
        }
        float f3 = iVar.f4723b.getResources().getDisplayMetrics().density;
        io.flutter.plugin.platform.o oVar = (io.flutter.plugin.platform.o) iVar.f4728h.get(Integer.valueOf(i3));
        io.flutter.plugin.editing.h hVar = iVar.e;
        if (hVar != null) {
            if (hVar.e.f89b == 3) {
                hVar.f4705p = true;
            }
            oVar.getClass();
        }
        oVar.getClass();
        if ((iH == 0 && iH2 == 0) || Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    public void v(int i3, int i4) {
        if (i4 != 0 && i4 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i4 + "(view id: " + i3 + ")");
        }
        io.flutter.plugin.platform.i iVar = (io.flutter.plugin.platform.i) this.e;
        if (iVar.c(i3)) {
            ((io.flutter.plugin.platform.o) iVar.f4728h.get(Integer.valueOf(i3))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i3);
            return;
        }
        if (iVar.f4730j.get(i3) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i3);
    }

    public void w(ArrayList arrayList) {
        E0.h hVar = (E0.h) this.e;
        hVar.getClass();
        int i3 = arrayList.size() == 0 ? 5894 : 1798;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            int iOrdinal = ((R1.e) arrayList.get(i4)).ordinal();
            if (iOrdinal == 0) {
                i3 &= -5;
            } else if (iOrdinal == 1) {
                i3 &= -515;
            }
        }
        hVar.e = i3;
        hVar.j();
    }

    public void x(int i3) {
        View decorView = ((AbstractActivityC0028d) ((E0.h) this.e).f213f).getWindow().getDecorView();
        int iB = M.j.b(i3);
        if (iB == 0) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (iB == 1) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (iB == 2) {
            decorView.performHapticFeedback(3);
            return;
        }
        if (iB != 3) {
            if (iB != 4) {
                return;
            }
            decorView.performHapticFeedback(4);
        } else if (Build.VERSION.SDK_INT >= 23) {
            decorView.performHapticFeedback(6);
        }
    }

    public void y(L7 l7, EnumC0316q5 enumC0316q5, EnumC0306p5 enumC0306p5) {
        E0.k kVar = new E0.k();
        if (l7.f2844c == 2) {
            kVar.e = U4.ALL_CLASSIFICATIONS;
        } else {
            kVar.e = U4.NO_CLASSIFICATIONS;
        }
        if (l7.f2843b == 2) {
            kVar.f226d = W4.ALL_LANDMARKS;
        } else {
            kVar.f226d = W4.NO_LANDMARKS;
        }
        if (l7.f2845d == 2) {
            kVar.f228g = V4.ALL_CONTOURS;
        } else {
            kVar.f228g = V4.NO_CONTOURS;
        }
        if (l7.f2842a == 2) {
            kVar.f227f = X4.ACCURATE;
        } else {
            kVar.f227f = X4.FAST;
        }
        kVar.f230i = Float.valueOf(l7.f2846f);
        kVar.f229h = Boolean.valueOf(l7.e);
        Y4 y4 = new Y4(kVar);
        int i3 = enumC0316q5 == EnumC0316q5.OPTIONAL_MODULE_FACE_DETECTION_CREATE ? 1 : 0;
        E7 e7 = (E7) this.e;
        HashMap map = e7.f2778i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (map.get(enumC0316q5) != null && jElapsedRealtime - ((Long) map.get(enumC0316q5)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        map.put(enumC0316q5, Long.valueOf(jElapsedRealtime));
        C0399z c0399z = new C0399z();
        C0104l c0104l = new C0104l();
        c0104l.e = y4;
        c0104l.f1774d = enumC0306p5;
        c0399z.f3506c = new T4(c0104l);
        E0.i iVar = new E0.i(c0399z, i3);
        p033j1.k kVar2 = e7.e;
        p071w1.l.f5800d.execute(new C7(e7, iVar, enumC0316q5, kVar2.f() ? (String) kVar2.d() : O0.h.f1272c.a(e7.f2776g), 0));
    }

    public /* synthetic */ y(int i3, Object obj) {
        this.f2407d = i3;
        this.e = obj;
    }

    public y(Context context, Uri uri) {
        this.f2407d = 18;
        this.e = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // k.C
    public void e(int i3) {
    }

    @Override // k.C
    public void f(int i3) {
    }
}
