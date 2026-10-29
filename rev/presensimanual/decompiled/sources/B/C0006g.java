package B;

import D0.b;
import E0.i;
import I2.C0045p;
import J.C0057c;
import J.InterfaceC0062h;
import S1.g;
import W1.C0098f;
import W1.C0104l;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k.O0;
import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: B.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0006g implements G0.b, B0.b, S1.d, L2.d, InterfaceC0062h, S1.b, S1.m, N0.m, S1.h, Y.L {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83d;
    public Object e;

    public /* synthetic */ C0006g(int i3, Object obj) {
        this.f83d = i3;
        this.e = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    @Override // S1.m
    public void a(A0.g gVar, R1.i iVar) {
        boolean z2 = true;
        switch (this.f83d) {
            case 14:
                ((L0.g) this.e).getClass();
                return;
            case 15:
            case 17:
            case 19:
            default:
                A0.f fVar = (A0.f) this.e;
                if (((io.flutter.plugin.editing.f) fVar.e) == null) {
                    return;
                }
                String str = (String) gVar.e;
                Object obj = gVar.f19f;
                str.getClass();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    iVar.b();
                    return;
                }
                try {
                    ArrayList arrayList = (ArrayList) obj;
                    ((io.flutter.plugin.editing.f) fVar.e).a((String) arrayList.get(0), (String) arrayList.get(1), iVar);
                    return;
                } catch (IllegalStateException e) {
                    iVar.a("error", e.getMessage(), null);
                    return;
                }
            case 16:
                A0.f fVar2 = (A0.f) this.e;
                if (((C0006g) fVar2.e) == null) {
                    return;
                }
                String str2 = (String) gVar.e;
                try {
                    if (str2.hashCode() == -1307105544 && str2.equals("activateSystemCursor")) {
                        try {
                            ((C0006g) fVar2.e).g((String) ((HashMap) gVar.f19f).get("kind"));
                            iVar.c(Boolean.TRUE);
                        } catch (Exception e3) {
                            iVar.a("error", "Error when setting cursors: " + e3.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e4) {
                    iVar.a("error", "Unhandled error: " + e4.getMessage(), null);
                    return;
                }
            case 18:
                A0.f fVar3 = (A0.f) this.e;
                if (((androidx.lifecycle.y) fVar3.e) == null) {
                    return;
                }
                String str3 = (String) gVar.e;
                str3.getClass();
                Object obj2 = gVar.f19f;
                switch (str3) {
                    case "create":
                        Map map = (Map) obj2;
                        boolean z3 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer byteBufferWrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (!z3) {
                                ((androidx.lifecycle.y) fVar3.e).l(new R1.f(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) ? 2 : 1, byteBufferWrap));
                                throw null;
                            }
                            int iIntValue = ((Integer) map.get("id")).intValue();
                            String str4 = (String) map.get("viewType");
                            int iIntValue2 = ((Integer) map.get("direction")).intValue();
                            io.flutter.plugin.platform.i iVar2 = (io.flutter.plugin.platform.i) ((androidx.lifecycle.y) fVar3.e).e;
                            iVar2.getClass();
                            if (iIntValue2 != 0 && iIntValue2 != 1) {
                                z2 = false;
                            }
                            if (z2) {
                                if (iVar2.f4722a.f731a.get(str4) != null) {
                                    throw new ClassCastException();
                                }
                                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str4);
                            }
                            throw new IllegalStateException("Trying to create a view with unknown direction value: " + iIntValue2 + "(view id: " + iIntValue + ")");
                        } catch (IllegalStateException e5) {
                            iVar.a("error", Log.getStackTraceString(e5), null);
                            return;
                        }
                    case "offset":
                        Map map2 = (Map) obj2;
                        try {
                            ((androidx.lifecycle.y) fVar3.e).r(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e6) {
                            iVar.a("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj2;
                        try {
                            ((androidx.lifecycle.y) fVar3.e).u(new R1.g(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()));
                            return;
                        } catch (IllegalStateException e7) {
                            iVar.a("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case "clearFocus":
                        try {
                            ((androidx.lifecycle.y) fVar3.e).k(((Integer) obj2).intValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e8) {
                            iVar.a("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((io.flutter.plugin.platform.i) ((androidx.lifecycle.y) fVar3.e).e).f4736p = ((Boolean) obj2).booleanValue();
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e9) {
                            iVar.a("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj2;
                        try {
                            ((androidx.lifecycle.y) fVar3.e).t(new R1.h(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e10) {
                            iVar.a("error", Log.getStackTraceString(e10), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj2;
                        try {
                            ((androidx.lifecycle.y) fVar3.e).v(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e11) {
                            iVar.a("error", Log.getStackTraceString(e11), null);
                            return;
                        }
                    case "dispose":
                        try {
                            ((androidx.lifecycle.y) fVar3.e).m(((Integer) ((Map) obj2).get("id")).intValue());
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e12) {
                            iVar.a("error", Log.getStackTraceString(e12), null);
                            return;
                        }
                    default:
                        iVar.b();
                        return;
                }
            case 20:
                A0.g gVar2 = (A0.g) this.e;
                if (((V1.a) gVar2.f19f) == null) {
                    return;
                }
                String str5 = (String) gVar.e;
                Object obj3 = gVar.f19f;
                str5.getClass();
                if (str5.equals("ProcessText.processTextAction")) {
                    try {
                        ArrayList arrayList2 = (ArrayList) obj3;
                        ((V1.a) gVar2.f19f).g((String) arrayList2.get(0), (String) arrayList2.get(1), ((Boolean) arrayList2.get(2)).booleanValue(), iVar);
                        return;
                    } catch (IllegalStateException e13) {
                        iVar.a("error", e13.getMessage(), null);
                        return;
                    }
                }
                if (!str5.equals("ProcessText.queryTextActions")) {
                    iVar.b();
                    return;
                }
                try {
                    iVar.c(((V1.a) gVar2.f19f).h());
                    return;
                } catch (IllegalStateException e14) {
                    iVar.a("error", e14.getMessage(), null);
                    return;
                }
            case 21:
                A0.f fVar4 = (A0.f) this.e;
                if (((C0104l) fVar4.e) == null) {
                    return;
                }
                String str6 = (String) gVar.e;
                str6.getClass();
                switch (str6) {
                    case "Scribe.isFeatureAvailable":
                        try {
                            C0104l c0104l = (C0104l) fVar4.e;
                            if (Build.VERSION.SDK_INT >= 34) {
                                if (((InputMethodManager) c0104l.e).isStylusHandwritingAvailable()) {
                                }
                                iVar.c(Boolean.valueOf(z2));
                                return;
                            }
                            c0104l.getClass();
                            z2 = false;
                            iVar.c(Boolean.valueOf(z2));
                            return;
                        } catch (IllegalStateException e15) {
                            iVar.a("error", e15.getMessage(), null);
                            return;
                        }
                    case "Scribe.startStylusHandwriting":
                        if (Build.VERSION.SDK_INT < 33) {
                            iVar.a("error", "Requires API level 33 or higher.", null);
                            return;
                        }
                        try {
                            C0104l c0104l2 = (C0104l) fVar4.e;
                            ((InputMethodManager) c0104l2.e).startStylusHandwriting((View) c0104l2.f1774d);
                            iVar.c(null);
                            return;
                        } catch (IllegalStateException e16) {
                            iVar.a("error", e16.getMessage(), null);
                            return;
                        }
                    case "Scribe.isStylusHandwritingAvailable":
                        if (Build.VERSION.SDK_INT < 34) {
                            iVar.a("error", "Requires API level 34 or higher.", null);
                            return;
                        }
                        try {
                            iVar.c(Boolean.valueOf(((InputMethodManager) ((C0104l) fVar4.e).e).isStylusHandwritingAvailable()));
                            return;
                        } catch (IllegalStateException e17) {
                            iVar.a("error", e17.getMessage(), null);
                            return;
                        }
                    default:
                        iVar.b();
                        return;
                }
        }
    }

    @Override // S1.h
    public void c(Object obj, final S1.g gVar) {
        C0098f c0098f = (C0098f) this.e;
        final E0.i iVar = c0098f.f1753r;
        if (iVar == null) {
            return;
        }
        Handler handler = c0098f.f1748m;
        final D0.b bVar = c0098f.f1759y;
        ((ImageReader) iVar.f218f).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: j2.a
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                b bVar2 = bVar;
                g gVar2 = gVar;
                i iVar2 = iVar;
                iVar2.getClass();
                Image imageAcquireNextImage = imageReader.acquireNextImage();
                if (imageAcquireNextImage == null) {
                    return;
                }
                try {
                    HashMap map = new HashMap();
                    int i3 = iVar2.e;
                    if (i3 == 17) {
                        map.put("planes", iVar2.c(imageAcquireNextImage));
                    } else {
                        map.put("planes", i.d(imageAcquireNextImage));
                    }
                    map.put("width", Integer.valueOf(imageAcquireNextImage.getWidth()));
                    map.put("height", Integer.valueOf(imageAcquireNextImage.getHeight()));
                    map.put("format", Integer.valueOf(i3));
                    map.put("lensAperture", (Float) bVar2.e);
                    map.put("sensorExposureTime", (Long) bVar2.f182f);
                    Integer num = (Integer) bVar2.f183g;
                    map.put("sensorSensitivity", num == null ? null : Double.valueOf(num.intValue()));
                    new Handler(Looper.getMainLooper()).post(new W.g(5, gVar2, map));
                    imageAcquireNextImage.close();
                } catch (IllegalStateException e) {
                    new Handler(Looper.getMainLooper()).post(new W.g(6, gVar2, e));
                    imageAcquireNextImage.close();
                }
            }
        }, handler);
    }

    @Override // S1.b
    public void d(Object obj, A0.g gVar) {
        D0.b bVar = (D0.b) this.e;
        if (((io.flutter.view.c) bVar.f183g) == null) {
            gVar.e(null);
            return;
        }
        HashMap map = (HashMap) obj;
        String str = (String) map.get("type");
        HashMap map2 = (HashMap) map.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) map2.get("message");
                if (str2 != null) {
                    io.flutter.view.c cVar = (io.flutter.view.c) bVar.f183g;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.m mVar = (io.flutter.view.m) cVar.f4749a;
                        AccessibilityEvent accessibilityEventC = mVar.c(0, 32);
                        accessibilityEventC.getText().add(str2);
                        mVar.g(accessibilityEventC);
                    } else {
                        cVar.getClass();
                    }
                    break;
                }
                break;
            case "announce":
                String str3 = (String) map2.get("message");
                if (str3 != null) {
                    io.flutter.view.c cVar2 = (io.flutter.view.c) bVar.f183g;
                    if (Build.VERSION.SDK_INT >= 36) {
                        cVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.m) cVar2.f4749a).f4833a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    io.flutter.view.c cVar3 = (io.flutter.view.c) bVar.f183g;
                    ((io.flutter.view.m) cVar3.f4749a).f(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.c cVar4 = (io.flutter.view.c) bVar.f183g;
                    ((io.flutter.view.m) cVar4.f4749a).f(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) map.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.c cVar5 = (io.flutter.view.c) bVar.f183g;
                    ((io.flutter.view.m) cVar5.f4749a).f(num3.intValue(), 2);
                    break;
                }
                break;
        }
        gVar.e(null);
    }

    @Override // J.InterfaceC0062h
    public L2.d e() {
        return ((InterfaceC0062h) this.e).e();
    }

    @Override // J.InterfaceC0062h
    public Object f(A2.p pVar, u2.f fVar) {
        return ((InterfaceC0062h) this.e).f(new N.c(pVar, null), fVar);
    }

    public void g(String str) {
        A0.g gVar = (A0.g) this.e;
        U1.a aVar = (U1.a) gVar.e;
        if (A0.g.f17h == null) {
            I1.A a3 = new I1.A();
            a3.put("alias", 1010);
            a3.put("allScroll", 1013);
            a3.put("basic", 1000);
            a3.put("cell", 1006);
            a3.put("click", 1002);
            a3.put("contextMenu", 1001);
            a3.put("copy", 1011);
            a3.put("forbidden", 1012);
            a3.put("grab", 1020);
            a3.put("grabbing", 1021);
            a3.put("help", 1003);
            a3.put("move", 1013);
            a3.put("none", 0);
            a3.put("noDrop", 1012);
            a3.put("precise", 1007);
            a3.put("text", 1008);
            a3.put("resizeColumn", 1014);
            a3.put("resizeDown", 1015);
            a3.put("resizeUpLeft", 1016);
            a3.put("resizeDownRight", 1017);
            a3.put("resizeLeft", 1014);
            a3.put("resizeLeftRight", 1014);
            a3.put("resizeRight", 1014);
            a3.put("resizeRow", 1015);
            a3.put("resizeUp", 1015);
            a3.put("resizeUpDown", 1015);
            a3.put("resizeUpLeft", 1017);
            a3.put("resizeUpRight", 1016);
            a3.put("resizeUpLeftDownRight", 1017);
            a3.put("resizeUpRightDownLeft", 1016);
            a3.put("verticalText", 1009);
            a3.put("wait", 1004);
            a3.put("zoomIn", 1018);
            a3.put("zoomOut", 1019);
            A0.g.f17h = a3;
        }
        aVar.setPointerIcon(PointerIcon.getSystemIcon(((I1.p) ((U1.a) gVar.e)).getContext(), ((Integer) A0.g.f17h.getOrDefault(str, 1000)).intValue()));
    }

    @Override // p053p2.a
    public Object get() {
        Context context = (Context) ((A0.f) this.e).e;
        F0.d.f255a.get();
        Integer num = 4;
        return new F0.l(num.intValue(), context, "com.google.android.datatransport.events");
    }

    public J.a0 h() {
        L2.q qVar = (L2.q) this.e;
        qVar.getClass();
        A0.f fVar = M2.l.f1013a;
        Object obj = L2.q.f947h.get(qVar);
        if (obj == fVar) {
            obj = null;
        }
        return (J.a0) obj;
    }

    @Override // Y.L
    public View i(int i3) {
        return ((Y.s) this.e).o(i3);
    }

    @Override // Y.L
    public int j() {
        Y.s sVar = (Y.s) this.e;
        return sVar.f1910g - sVar.r();
    }

    @Override // Y.L
    public int k() {
        return ((Y.s) this.e).u();
    }

    @Override // S1.d
    public void l(ByteBuffer byteBuffer, K1.g gVar) {
        S1.t.f1599b.getClass();
        S1.t.c(byteBuffer);
        ((K1.b) this.e).getClass();
    }

    @Override // Y.L
    public int m(View view) {
        Y.t tVar = (Y.t) view.getLayoutParams();
        ((Y.s) this.e).getClass();
        return view.getBottom() + ((Y.t) view.getLayoutParams()).f1911a.bottom + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin;
    }

    @Override // G0.b
    public Object n() {
        F0.i iVar = (F0.i) ((F0.c) this.e);
        long jB = iVar.e.b() - iVar.f265g.f251d;
        SQLiteDatabase sQLiteDatabaseA = iVar.a();
        sQLiteDatabaseA.beginTransaction();
        try {
            int iDelete = sQLiteDatabaseA.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(jB)});
            sQLiteDatabaseA.setTransactionSuccessful();
            return Integer.valueOf(iDelete);
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    @Override // Y.L
    public int o(View view) {
        Y.t tVar = (Y.t) view.getLayoutParams();
        ((Y.s) this.e).getClass();
        return (view.getTop() - ((Y.t) view.getLayoutParams()).f1911a.top) - ((ViewGroup.MarginLayoutParams) tVar).topMargin;
    }

    @Override // S1.h
    public void p() {
        C0098f c0098f = (C0098f) this.e;
        E0.i iVar = c0098f.f1753r;
        if (iVar == null) {
            return;
        }
        ((ImageReader) iVar.f218f).setOnImageAvailableListener(null, c0098f.f1748m);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [A2.p, u2.f] */
    @Override // L2.d
    public Object q(L2.e eVar, p063s2.d dVar) throws Throwable {
        L2.a aVar;
        Throwable th;
        M2.n nVar;
        if (dVar instanceof L2.a) {
            aVar = (L2.a) dVar;
            int i3 = aVar.f890j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f890j = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new L2.a(this, dVar);
            }
        } else {
            aVar = new L2.a(this, dVar);
        }
        Object obj = aVar.f888h;
        t2.a aVar2 = t2.a.f5737d;
        int i4 = aVar.f890j;
        p055q2.g gVar = p055q2.g.f5603a;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = aVar.f887g;
            try {
                AbstractC0449g3.b(obj);
                nVar.n();
                return gVar;
            } catch (Throwable th2) {
                th = th2;
                nVar.n();
                throw th;
            }
        }
        AbstractC0449g3.b(obj);
        p063s2.i iVar = aVar.e;
        B2.h.b(iVar);
        M2.n nVar2 = new M2.n(eVar, iVar);
        try {
            aVar.f887g = nVar2;
            aVar.f890j = 1;
            Object objH = ((u2.f) this.e).h(nVar2, aVar);
            if (objH != aVar2) {
                objH = gVar;
            }
            if (objH == aVar2) {
                return aVar2;
            }
            nVar = nVar2;
            nVar.n();
            return gVar;
        } catch (Throwable th3) {
            th = th3;
            nVar = nVar2;
            nVar.n();
            throw th;
        }
    }

    @Override // N0.m
    public void r(Object obj, Object obj2) {
        S0.f fVar = new S0.f((p033j1.e) obj2);
        S0.e eVar = (S0.e) ((S0.h) obj).q();
        S0.a aVar = (S0.a) this.e;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(eVar.f1945d);
        Z0.c.c(parcelObtain, fVar);
        parcelObtain.writeInt(1);
        aVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(null);
        eVar.d(parcelObtain, 2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    public void s(J.a0 a0Var) {
        L2.q qVar;
        Object obj;
        Object obj2;
        B2.h.e(a0Var, "newState");
        do {
            qVar = (L2.q) this.e;
            qVar.getClass();
            obj = M2.l.f1013a;
            obj2 = L2.q.f947h.get(qVar);
            if (obj2 == obj) {
                obj2 = null;
            }
            J.a0 a0Var2 = (J.a0) obj2;
            if (a0Var2 instanceof J.T ? true : B2.h.a(a0Var2, J.b0.f610b)) {
                a0Var2 = a0Var;
            } else if (a0Var2 instanceof C0057c) {
                if (a0Var.f609a > a0Var2.f609a) {
                    a0Var2 = a0Var;
                }
            } else if (!(a0Var2 instanceof J.Q)) {
                throw new C0045p();
            }
            if (obj2 == null) {
                obj2 = obj;
            }
            if (a0Var2 != null) {
                obj = a0Var2;
            }
        } while (!qVar.e(obj2, obj));
    }

    public C0006g(N0.l lVar, N0.h hVar) {
        this.f83d = 11;
        this.e = lVar;
    }

    public /* synthetic */ C0006g(S0.g gVar, S0.a aVar) {
        this.f83d = 25;
        this.e = aVar;
    }

    public C0006g(K1.b bVar, int i3) {
        this.f83d = i3;
        switch (i3) {
            case 19:
                new E0.n(bVar, "flutter/platform_views_2", S1.s.f1597a, null, false).f(new A0.f(18, this));
                break;
            case 23:
                this.e = new E0.n(bVar, "flutter/system", S1.j.f1592a, null, false);
                break;
            default:
                p009c1.v vVar = new p009c1.v();
                E0.n nVar = new E0.n(bVar, "flutter/navigation", S1.k.f1593a, null, false);
                this.e = nVar;
                nVar.f(vVar);
                break;
        }
    }

    public C0006g(int i3) {
        this.f83d = i3;
        switch (i3) {
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                this.e = new L2.q(J.b0.f610b);
                break;
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                this.e = new AtomicInteger(0);
                break;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                break;
        }
    }

    public C0006g(S1.f fVar) {
        this.f83d = 15;
        new E0.n(fVar, "flutter/keyboard", S1.s.f1597a, null, false).f(new A0.g(this));
    }

    public C0006g(O0 o3) {
        this.f83d = 0;
        this.e = new CopyOnWriteArrayList();
        new HashMap();
    }

    public C0006g(TextView textView) {
        this.f83d = 12;
        this.e = new Q.g(textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0006g(A2.p pVar) {
        this.f83d = 9;
        this.e = (u2.f) pVar;
    }
}
