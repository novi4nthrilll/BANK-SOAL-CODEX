package A0;

import B.C0006g;
import E0.n;
import I1.A;
import I1.v;
import I1.w;
import I1.y;
import J.C0068n;
import J.C0069o;
import J.C0070p;
import L2.q;
import M.j;
import M.k;
import O.u;
import S1.l;
import S1.m;
import S1.s;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.common.api.Status;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import k.AbstractC0742m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013d1.AbstractC0449g3;
import p013d1.I;
import p046n2.C0782n;

/* JADX INFO: loaded from: classes.dex */
public final class g implements B0.b, G0.b, m, F0.g, y, L2.d, p033j1.a, S1.c, S1.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static g f16g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static A f17h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f19f;

    public /* synthetic */ g(int i3, Object obj, Object obj2) {
        this.f18d = i3;
        this.e = obj;
        this.f19f = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x007d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x008c A[RETURN, SYNTHETIC] */
    public static int f(g gVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        int i3;
        String str;
        gVar.getClass();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            String string = jSONArray.getString(i6);
            int[] iArrC = j.c(4);
            int length = iArrC.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    throw new NoSuchFieldException(I.g("No such DeviceOrientation: ", string));
                }
                i3 = iArrC[i7];
                if (i3 == 1) {
                    str = "DeviceOrientation.portraitUp";
                } else if (i3 == 2) {
                    str = "DeviceOrientation.portraitDown";
                } else if (i3 == 3) {
                    str = "DeviceOrientation.landscapeLeft";
                } else {
                    if (i3 != 4) {
                        throw null;
                    }
                    str = "DeviceOrientation.landscapeRight";
                }
                if (str.equals(string)) {
                    break;
                }
                i7++;
            }
            int iB = j.b(i3);
            if (iB == 0) {
                i4 |= 1;
            } else if (iB == 1) {
                i4 |= 4;
            } else if (iB == 2) {
                i4 |= 2;
            } else if (iB == 3) {
                i4 |= 8;
            }
            if (i5 == 0) {
                i5 = i4;
            }
        }
        if (i4 == 0) {
            return -1;
        }
        switch (i4) {
            case 2:
                return 0;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 12:
            case 13:
            case 14:
                if (i5 == 2) {
                    return 0;
                }
                if (i5 != 4) {
                    if (i5 != 8) {
                        return 1;
                    }
                    return 8;
                }
                return 9;
            case k.LONG_FIELD_NUMBER /* 4 */:
                return 9;
            case k.STRING_FIELD_NUMBER /* 5 */:
                return 12;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            case 10:
                return 11;
            case 11:
                return 2;
            case 15:
                return 13;
            default:
                return 1;
        }
    }

    public static ArrayList g(g gVar, JSONArray jSONArray) throws JSONException, NoSuchFieldException {
        R1.e eVar;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            String string = jSONArray.getString(i3);
            R1.e[] eVarArrValues = R1.e.values();
            int length = eVarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    throw new NoSuchFieldException(I.g("No such SystemUiOverlay: ", string));
                }
                eVar = eVarArrValues[i4];
                if (eVar.f1458d.equals(string)) {
                    break;
                }
                i4++;
            }
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                arrayList.add(R1.e.TOP_OVERLAYS);
            } else if (iOrdinal == 1) {
                arrayList.add(R1.e.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public static int h(g gVar, String str) throws NoSuchFieldException {
        String str2;
        gVar.getClass();
        for (int i3 : j.c(4)) {
            if (i3 == 1) {
                str2 = "SystemUiMode.leanBack";
            } else if (i3 == 2) {
                str2 = "SystemUiMode.immersive";
            } else if (i3 == 3) {
                str2 = "SystemUiMode.immersiveSticky";
            } else {
                if (i3 != 4) {
                    throw null;
                }
                str2 = "SystemUiMode.edgeToEdge";
            }
            if (str2.equals(str)) {
                int iB = j.b(i3);
                if (iB == 0) {
                    return 1;
                }
                if (iB != 1) {
                    return iB != 2 ? 4 : 3;
                }
                return 2;
            }
        }
        throw new NoSuchFieldException(I.g("No such SystemUiMode: ", str));
    }

    public static R1.d i(g gVar, JSONObject jSONObject) {
        gVar.getClass();
        return new R1.d(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? c.a(jSONObject.getString("statusBarIconBrightness")) : 0, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? c.a(jSONObject.getString("systemNavigationBarIconBrightness")) : 0, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public static ArrayList m(A1.a aVar, int i3) {
        A1.b bVar = (A1.b) aVar.f31j.get(i3);
        if (bVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            ArrayList arrayList2 = bVar.f33b;
            if (i4 >= arrayList2.size()) {
                return arrayList;
            }
            arrayList.add(new double[]{((PointF) arrayList2.get(i4)).x, ((PointF) arrayList2.get(i4)).y});
            i4++;
        }
    }

    public static HashMap o(String str, int i3, int i4, int i5, int i6) {
        HashMap map = new HashMap();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i3));
        map.put("selectionExtent", Integer.valueOf(i4));
        map.put("composingBase", Integer.valueOf(i5));
        map.put("composingExtent", Integer.valueOf(i6));
        return map;
    }

    public static boolean p(Editable editable, KeyEvent keyEvent, boolean z2) {
        u[] uVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (u[]) editable.getSpans(selectionStart, selectionEnd, u.class)) != null && uVarArr.length > 0) {
            for (u uVar : uVarArr) {
                int spanStart = editable.getSpanStart(uVar);
                int spanEnd = editable.getSpanEnd(uVar);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static double[] t(A1.a aVar, int i3) {
        A1.e eVar = (A1.e) aVar.f30i.get(i3);
        if (eVar == null) {
            return null;
        }
        PointF pointF = eVar.f40b;
        return new double[]{pointF.x, pointF.y};
    }

    @Override // S1.m
    public void a(g gVar, R1.i iVar) {
        p077y1.a aVarA;
        p033j1.k kVar;
        int i3;
        int i4 = 0;
        switch (this.f18d) {
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                String str = (String) gVar.e;
                str.getClass();
                if (!str.equals("vision#startFaceDetector")) {
                    if (!str.equals("vision#closeFaceDetector")) {
                        iVar.b();
                        return;
                    }
                    String str2 = (String) gVar.k("id");
                    HashMap map = (HashMap) this.f19f;
                    Closeable closeable = (A1.c) map.get(str2);
                    if (closeable != null) {
                        ((p080z1.c) closeable).close();
                        map.remove(str2);
                    }
                    iVar.c(null);
                    return;
                }
                Map map2 = (Map) gVar.k("imageData");
                Context context = (Context) this.e;
                String str3 = (String) map2.get("type");
                if (str3 != null && str3.equals("file")) {
                    try {
                        aVarA = p077y1.a.a(context, Uri.fromFile(new File((String) map2.get("path"))));
                    } catch (IOException e) {
                        Log.e("ImageError", "Getting Image failed");
                        Log.e("ImageError", e.toString());
                        iVar.a("InputImageConverterError", e.toString(), null);
                        aVarA = null;
                    }
                    break;
                } else {
                    if (str3 == null || !str3.equals("bytes")) {
                        iVar.a("InputImageConverterError", "Invalid Input Image", null);
                    } else {
                        try {
                            Map map3 = (Map) map2.get("metadata");
                            Object obj = map2.get("bytes");
                            Objects.requireNonNull(obj);
                            byte[] bArr = (byte[]) obj;
                            Object obj2 = map3.get("width");
                            Objects.requireNonNull(obj2);
                            int iIntValue = Double.valueOf(obj2.toString()).intValue();
                            Object obj3 = map3.get("height");
                            Objects.requireNonNull(obj3);
                            int iIntValue2 = Double.valueOf(obj3.toString()).intValue();
                            Object obj4 = map3.get("rotation");
                            Objects.requireNonNull(obj4);
                            int i5 = Integer.parseInt(obj4.toString());
                            Object obj5 = map3.get("image_format");
                            Objects.requireNonNull(obj5);
                            int i6 = Integer.parseInt(obj5.toString());
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            p077y1.a aVar = new p077y1.a(ByteBuffer.wrap(bArr), iIntValue, iIntValue2, i5, i6);
                            p077y1.a.b(i6, 2, jElapsedRealtime, iIntValue2, iIntValue, bArr.length, i5);
                            aVarA = aVar;
                        } catch (Exception e3) {
                            Log.e("ImageError", "Getting Image failed");
                            Log.e("ImageError", e3.toString());
                            iVar.a("InputImageConverterError", e3.toString(), null);
                            aVarA = null;
                        }
                    }
                    aVarA = null;
                }
                if (aVarA == null) {
                    return;
                }
                String str4 = (String) gVar.k("id");
                Closeable aVar2 = (A1.c) ((HashMap) this.f19f).get(str4);
                if (aVar2 == null) {
                    Map map4 = (Map) gVar.k("options");
                    if (map4 == null) {
                        iVar.a("FaceDetectorError", "Invalid options", null);
                        return;
                    }
                    int i7 = ((Boolean) map4.get("enableClassification")).booleanValue() ? 2 : 1;
                    int i8 = ((Boolean) map4.get("enableLandmarks")).booleanValue() ? 2 : 1;
                    int i9 = ((Boolean) map4.get("enableContours")).booleanValue() ? 2 : 1;
                    String str5 = (String) map4.get("mode");
                    str5.getClass();
                    if (str5.equals("accurate")) {
                        i3 = 2;
                    } else {
                        if (!str5.equals("fast")) {
                            throw new IllegalArgumentException("Not a mode:" + map4.get("mode"));
                        }
                        i3 = 1;
                    }
                    A1.d dVar = new A1.d(i8, i9, i7, i3, ((Boolean) map4.get("enableTracking")).booleanValue(), (float) ((Double) map4.get("minFaceSize")).doubleValue());
                    C1.d dVar2 = (C1.d) p071w1.f.c().a(C1.d.class);
                    dVar2.getClass();
                    aVar2 = new C1.a((C1.g) dVar2.f148a.c(dVar), dVar2.f149b, dVar);
                    ((HashMap) this.f19f).put(str4, aVar2);
                }
                C1.a aVar3 = (C1.a) aVar2;
                synchronized (aVar3) {
                    if (aVar3.f5960d.get()) {
                        p062s1.a aVar4 = new p062s1.a("This detector is already closed!", 14);
                        kVar = new p033j1.k();
                        kVar.g(aVar4);
                    } else if (aVarA.f5924c < 32 || aVarA.f5925d < 32) {
                        p062s1.a aVar5 = new p062s1.a("InputImage width and height should be at least 32!", 3);
                        kVar = new p033j1.k();
                        kVar.g(aVar5);
                    } else {
                        kVar = aVar3.e.a(aVar3.f5962g, new M1.d(aVar3, aVarA), (p006b1.c) aVar3.f5961f.f2515d);
                    }
                }
                E1.a aVar6 = new E1.a(this, iVar);
                kVar.getClass();
                kVar.b(p033j1.f.f4991a, aVar6);
                kVar.a(new E1.b(iVar, i4));
                return;
            default:
                C0006g c0006g = (C0006g) this.e;
                if (((D0.b) c0006g.e) == null) {
                    iVar.c((Map) this.f19f);
                    return;
                }
                String str6 = (String) gVar.e;
                str6.getClass();
                if (!str6.equals("getKeyboardState")) {
                    iVar.b();
                    return;
                }
                try {
                    this.f19f = Collections.unmodifiableMap(((v) ((y[]) ((D0.b) c0006g.e).e)[0]).e);
                    break;
                } catch (IllegalStateException e4) {
                    iVar.a("error", e4.getMessage(), null);
                }
                iVar.c((Map) this.f19f);
                return;
        }
    }

    @Override // F0.g
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        p070w0.b bVar = F0.i.f262h;
        F0.i iVar = (F0.i) this.e;
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        p079z0.b bVar2 = (p079z0.b) this.f19f;
        Long lB = F0.i.b(sQLiteDatabase, bVar2);
        if (lB != null) {
            F0.i.g(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lB.toString()}, null, null, null, String.valueOf(iVar.f265g.f249b)), new D0.b(iVar, arrayList, bVar2));
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            sb.append(((F0.b) arrayList.get(i3)).f252a);
            if (i3 < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        F0.i.g(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new p068v1.c(map));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            F0.b bVar3 = (F0.b) listIterator.next();
            if (map.containsKey(Long.valueOf(bVar3.f252a))) {
                E0.k kVarC = bVar3.f254c.c();
                long j3 = bVar3.f252a;
                for (F0.h hVar : (Set) map.get(Long.valueOf(j3))) {
                    kVarC.a(hVar.f260a, hVar.f261b);
                }
                listIterator.set(new F0.b(j3, bVar3.f253b, kVarC.c()));
            }
        }
        return arrayList;
    }

    @Override // I1.y
    public void c(KeyEvent keyEvent, C1.h hVar) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            hVar.b(false);
            return;
        }
        Character chC = ((w) this.f19f).c(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        G1.a aVar = new G1.a(1, hVar);
        f fVar = (f) this.e;
        HashMap map = new HashMap();
        map.put("type", z2 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(keyEvent.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        map.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        map.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        map.put("character", chC.toString());
        map.put("source", Integer.valueOf(keyEvent.getSource()));
        map.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        ((n) fVar.e).d(map, new G1.a(2, aVar));
    }

    @Override // p033j1.a
    public void d(p033j1.k kVar) {
        ((Map) ((g) this.f19f).e).remove((p033j1.e) this.e);
    }

    @Override // S1.c
    public void e(Object obj) {
        switch (this.f18d) {
            case 22:
                D0.b bVar = (D0.b) this.f19f;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) bVar.e;
                R1.k kVar = (R1.k) this.e;
                concurrentLinkedQueue.remove(kVar);
                if (!((ConcurrentLinkedQueue) bVar.e).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(kVar.f1489a));
                }
                break;
            default:
                ((K1.g) this.e).a(((l) ((n) ((g) this.f19f).f19f).f237f).b(obj));
                break;
        }
    }

    @Override // p053p2.a
    public Object get() {
        return new h((Context) ((f) this.e).e, (e) ((f) this.f19f).get());
    }

    public void j(Object obj, String str) {
        ((ArrayList) this.e).add(str + "=" + String.valueOf(obj));
    }

    public Object k(String str) {
        Object obj = this.f19f;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    @Override // S1.d
    public void l(ByteBuffer byteBuffer, K1.g gVar) {
        switch (this.f18d) {
            case 25:
                n nVar = (n) this.f19f;
                try {
                    ((S1.b) this.e).d(((l) nVar.f237f).a(byteBuffer), new g(this, gVar, 24, false));
                } catch (RuntimeException e) {
                    Log.e("BasicMessageChannel#" + ((String) nVar.e), "Failed to handle message", e);
                    gVar.a(null);
                    return;
                }
                break;
            default:
                n nVar2 = (n) this.f19f;
                try {
                    ((m) this.e).a(((S1.n) nVar2.f237f).b(byteBuffer), new R1.i(1, this, gVar));
                } catch (RuntimeException e3) {
                    Log.e("MethodChannel#" + ((String) nVar2.e), "Failed to handle method call", e3);
                    gVar.a(((S1.n) nVar2.f237f).e(e3.getMessage(), Log.getStackTraceString(e3)));
                }
                break;
        }
    }

    @Override // G0.b
    public Object n() {
        F0.i iVar = (F0.i) ((E0.j) this.e).f222c;
        iVar.getClass();
        return (Iterable) iVar.c(new g(4, iVar, (p079z0.b) this.f19f));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // L2.d
    public Object q(L2.e eVar, p063s2.d dVar) throws Throwable {
        L2.j jVar;
        Throwable th;
        M2.n nVar;
        g gVar;
        L2.e eVar2;
        L2.m mVar;
        C0782n c0782n;
        switch (this.f18d) {
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                if (dVar instanceof L2.j) {
                    jVar = (L2.j) dVar;
                    int i3 = jVar.f913h;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jVar.f913h = i3 - Integer.MIN_VALUE;
                    } else {
                        jVar = new L2.j(this, dVar);
                    }
                } else {
                    jVar = new L2.j(this, dVar);
                }
                Object obj = jVar.f912g;
                t2.a aVar = t2.a.f5737d;
                int i4 = jVar.f913h;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0449g3.b(obj);
                        return p055q2.g.f5603a;
                    }
                    nVar = jVar.f917l;
                    eVar2 = jVar.f916k;
                    gVar = jVar.f915j;
                    try {
                        AbstractC0449g3.b(obj);
                        nVar.n();
                        q qVar = (q) gVar.f19f;
                        jVar.f915j = null;
                        jVar.f916k = null;
                        jVar.f917l = null;
                        jVar.f913h = 2;
                        qVar.q(eVar2, jVar);
                        return aVar;
                    } catch (Throwable th2) {
                        th = th2;
                        nVar.n();
                        throw th;
                    }
                }
                AbstractC0449g3.b(obj);
                p063s2.i iVar = jVar.e;
                B2.h.b(iVar);
                M2.n nVar2 = new M2.n(eVar, iVar);
                try {
                    C0068n c0068n = (C0068n) this.e;
                    jVar.f915j = this;
                    jVar.f916k = eVar;
                    jVar.f917l = nVar2;
                    jVar.f913h = 1;
                    if (c0068n.h(nVar2, jVar) == aVar) {
                        return aVar;
                    }
                    gVar = this;
                    eVar2 = eVar;
                    nVar = nVar2;
                    nVar.n();
                    q qVar2 = (q) gVar.f19f;
                    jVar.f915j = null;
                    jVar.f916k = null;
                    jVar.f917l = null;
                    jVar.f913h = 2;
                    qVar2.q(eVar2, jVar);
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    nVar = nVar2;
                    nVar.n();
                    throw th;
                }
            case k.BYTES_FIELD_NUMBER /* 8 */:
                Object objQ = ((g) this.e).q(new L2.l(new B2.m(), eVar, (C0070p) this.f19f), dVar);
                return objQ == t2.a.f5737d ? objQ : p055q2.g.f5603a;
            default:
                if (dVar instanceof L2.m) {
                    mVar = (L2.m) dVar;
                    int i5 = mVar.f927h;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        mVar.f927h = i5 - Integer.MIN_VALUE;
                    } else {
                        mVar = new L2.m(this, dVar);
                    }
                } else {
                    mVar = new L2.m(this, dVar);
                }
                Object obj2 = mVar.f926g;
                t2.a aVar2 = t2.a.f5737d;
                int i6 = mVar.f927h;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0782n = mVar.f929j;
                    try {
                        AbstractC0449g3.b(obj2);
                    } catch (M2.a e) {
                        e = e;
                        if (e.f995d != c0782n) {
                            throw e;
                        }
                    }
                    break;
                } else {
                    AbstractC0449g3.b(obj2);
                    g gVar2 = (g) this.e;
                    C0782n c0782n2 = new C0782n((C0069o) this.f19f, eVar);
                    try {
                        mVar.f929j = c0782n2;
                        mVar.f927h = 1;
                        if (gVar2.q(c0782n2, mVar) == aVar2) {
                            return aVar2;
                        }
                    } catch (M2.a e3) {
                        e = e3;
                        c0782n = c0782n2;
                        if (e.f995d != c0782n) {
                            throw e;
                        }
                    }
                }
                return p055q2.g.f5603a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    public CctBackendFactory r(String str) {
        Bundle bundle;
        Map mapEmptyMap;
        Object obj;
        if (((Map) this.f19f) == null) {
            Context context = (Context) this.e;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        mapEmptyMap = Collections.emptyMap();
                    } else {
                        HashMap map = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        mapEmptyMap = map;
                    }
                    this.f19f = mapEmptyMap;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                mapEmptyMap = Collections.emptyMap();
            } else {
                HashMap map2 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                mapEmptyMap = map2;
            }
            this.f19f = mapEmptyMap;
        }
        String str4 = (String) ((Map) this.f19f).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (InstantiationException e4) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e6);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public boolean s(CharSequence charSequence, int i3, int i4, O.n nVar) {
        boolean zA;
        if (nVar.f1198c == 0) {
            O.d dVar = (O.d) this.f19f;
            P.a aVarC = nVar.c();
            int iA = aVarC.a(8);
            short s3 = iA != 0 ? ((ByteBuffer) aVarC.f100d).getShort(iA + aVarC.f97a) : (short) 0;
            dVar.getClass();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 23 || s3 <= i5) {
                ThreadLocal threadLocal = O.d.f1175b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) threadLocal.get();
                sb.setLength(0);
                while (i3 < i4) {
                    sb.append(charSequence.charAt(i3));
                    i3++;
                }
                TextPaint textPaint = dVar.f1176a;
                String string = sb.toString();
                ThreadLocal threadLocal2 = p064t.e.f5676a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zA = p064t.d.a(textPaint, string);
                } else {
                    int length = string.length();
                    if (length == 1 && Character.isWhitespace(string.charAt(0))) {
                        zA = true;
                    } else {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i6 = 0;
                                    while (i6 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i6)) + i6;
                                        fMeasureText4 += textPaint.measureText(string, i6, iCharCount);
                                        i6 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zA = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zA = true;
                            } else {
                                ThreadLocal threadLocal3 = p064t.e.f5676a;
                                A.b bVar = (A.b) threadLocal3.get();
                                if (bVar == null) {
                                    bVar = new A.b(new Rect(), new Rect());
                                    threadLocal3.set(bVar);
                                } else {
                                    bVar.f0a.setEmpty();
                                    bVar.f1b.setEmpty();
                                }
                                Rect rect = bVar.f0a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                Rect rect2 = bVar.f1b;
                                textPaint.getTextBounds(string, 0, length, rect2);
                                zA = !rect.equals(rect2);
                            }
                        } else {
                            zA = false;
                        }
                    }
                }
            } else {
                zA = false;
            }
            nVar.f1198c = zA ? 2 : 1;
        }
        return nVar.f1198c == 2;
    }

    public String toString() {
        switch (this.f18d) {
            case 15:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f19f.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.e;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(boolean z2, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f19f)) {
            map = new HashMap((Map) this.f19f);
        }
        synchronized (((Map) this.e)) {
            map2 = new HashMap((Map) this.e);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z2 || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                throw new ClassCastException();
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z2 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((p033j1.e) entry2.getKey()).b(new M0.d(status));
            }
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, int i3, boolean z2) {
        this.f18d = i3;
        this.f19f = obj;
        this.e = obj2;
    }

    public /* synthetic */ g(Object obj) {
        this.f18d = 15;
        this.f19f = obj;
        this.e = new ArrayList();
    }

    public g(String str, Q0.b bVar, p009c1.v vVar) {
        this.f18d = 10;
        this.f19f = str;
        this.e = bVar;
    }

    public g(U1.a aVar, f fVar) {
        this.f18d = 28;
        this.e = aVar;
        this.f19f = fVar;
        fVar.e = new C0006g(26, this);
    }

    public g(f fVar) {
        this.f18d = 5;
        this.f19f = new w();
        this.e = fVar;
    }

    public g(C0006g c0006g) {
        this.f18d = 18;
        this.e = c0006g;
        this.f19f = new HashMap();
    }

    public g(int i3) {
        this.f18d = i3;
        switch (i3) {
            case 12:
                this.f19f = Collections.synchronizedMap(new WeakHashMap());
                this.e = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 16:
                L0.d dVar = L0.d.f870d;
                this.e = new SparseIntArray();
                this.f19f = dVar;
                break;
            default:
                this.e = new LongSparseArray();
                this.f19f = new PriorityQueue();
                break;
        }
    }

    public g(K1.b bVar, int i3) {
        this.f18d = i3;
        switch (i3) {
            case 20:
                f fVar = new f(17, this);
                n nVar = new n(bVar, "flutter/platform", S1.k.f1593a, null, false);
                this.e = nVar;
                nVar.f(fVar);
                break;
            case 23:
                f fVar2 = new f(23, this);
                n nVar2 = new n(bVar, "flutter/textinput", S1.k.f1593a, null, false);
                this.e = nVar2;
                nVar2.f(fVar2);
                break;
            default:
                f fVar3 = new f(15, this);
                n nVar3 = new n(bVar, "flutter/localization", S1.k.f1593a, null, false);
                this.e = nVar3;
                nVar3.f(fVar3);
                break;
        }
    }

    public g(K1.b bVar, PackageManager packageManager) {
        this.f18d = 21;
        C0006g c0006g = new C0006g(20, this);
        this.e = packageManager;
        new n(bVar, "flutter/processtext", s.f1597a, null, false).f(c0006g);
    }

    public g(Context context, int i3) {
        this.f18d = i3;
        switch (i3) {
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f19f = new HashMap();
                this.e = context;
                break;
            default:
                this.f19f = null;
                this.e = context;
                break;
        }
    }

    public g(n nVar, p074x1.a aVar, O.d dVar) {
        this.f18d = 14;
        this.e = nVar;
        this.f19f = dVar;
    }

    public g(AbstractC0742m abstractC0742m) {
        this.f18d = 17;
        this.e = abstractC0742m;
        Q.i iVar = new Q.i(abstractC0742m);
        this.f19f = iVar;
        abstractC0742m.addTextChangedListener(iVar);
        if (Q.a.f1361b == null) {
            synchronized (Q.a.f1360a) {
                try {
                    if (Q.a.f1361b == null) {
                        Q.a aVar = new Q.a();
                        try {
                            Q.a.f1362c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, Q.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        Q.a.f1361b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        abstractC0742m.setEditableFactory(Q.a.f1361b);
    }
}
