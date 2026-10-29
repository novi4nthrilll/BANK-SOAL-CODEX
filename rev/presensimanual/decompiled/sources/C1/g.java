package C1;

import E0.e;
import O0.u;
import W1.C0104l;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_face_bundled.F7;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p016e1.C0651o3;
import p016e1.C0663q3;
import p016e1.EnumC0645n3;
import p016e1.EnumC0698w3;
import p016e1.EnumC0704x3;
import p016e1.EnumC0710y3;
import p016e1.N3;
import p016e1.R4;
import p016e1.S4;
import p016e1.X;
import p071w1.l;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p045n.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicBoolean f156j = new AtomicBoolean(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p080z1.b f157k = p080z1.b.f5958b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A1.d f158d;
    public final S4 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F7 f159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p080z1.a f162i;

    public g(S4 s4, A1.d dVar, c cVar) {
        this.f5382b = new AtomicInteger(0);
        this.f5383c = new AtomicBoolean(false);
        this.f5381a = new p071w1.j();
        this.f162i = new p080z1.a();
        this.f158d = dVar;
        this.e = s4;
        this.f160g = cVar;
        this.f159f = new F7(p071w1.f.c().b(), 1);
    }

    public static void n(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((A1.a) it.next()).f24b = -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f A[Catch: all -> 0x002b, a -> 0x00eb, TryCatch #1 {a -> 0x00eb, blocks: (B:50:0x0119, B:57:0x012d, B:56:0x0128, B:53:0x011f, B:34:0x00a5, B:36:0x00cb, B:37:0x00d3, B:39:0x00d9, B:44:0x00f3, B:47:0x0106, B:49:0x0111), top: B:71:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128 A[Catch: all -> 0x002b, a -> 0x00eb, TryCatch #1 {a -> 0x00eb, blocks: (B:50:0x0119, B:57:0x012d, B:56:0x0128, B:53:0x011f, B:34:0x00a5, B:36:0x00cb, B:37:0x00d3, B:39:0x00d9, B:44:0x00f3, B:47:0x0106, B:49:0x0111), top: B:71:0x00a5 }] */
    public final List m(p077y1.a aVar) {
        long j3;
        List arrayList;
        Iterator it;
        Iterator it2;
        Rect rect;
        List list;
        int size;
        int size2;
        synchronized (this) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f162i.a(aVar);
                try {
                    Pair pairC = this.f160g.c(aVar);
                    List list2 = (List) pairC.first;
                    List list3 = (List) pairC.second;
                    if (list2 == null && list3 == null) {
                        throw new p062s1.a("No detector is enabled", 13);
                    }
                    if (list2 == null) {
                        u.f(list3);
                        list = list3;
                    } else if (list3 == null) {
                        list = list2;
                    } else {
                        HashSet hashSet = new HashSet();
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            A1.a aVar2 = (A1.a) it3.next();
                            Iterator it4 = list2.iterator();
                            boolean z2 = false;
                            while (it4.hasNext()) {
                                A1.a aVar3 = (A1.a) it4.next();
                                Rect rect2 = aVar2.f23a;
                                if (rect2 == null || (rect = aVar3.f23a) == null || !rect2.intersect(rect)) {
                                    it = it3;
                                    it2 = it4;
                                    j3 = jElapsedRealtime;
                                } else {
                                    it = it3;
                                    it2 = it4;
                                    j3 = jElapsedRealtime;
                                    double dMin = (Math.min(rect2.bottom, rect.bottom) - Math.max(rect2.top, rect.top)) * (Math.min(rect2.right, rect.right) - Math.max(rect2.left, rect.left));
                                    try {
                                        if (dMin / ((((double) ((rect2.bottom - rect2.top) * (rect2.right - rect2.left))) + ((double) ((rect.bottom - rect.top) * (rect.right - rect.left)))) - dMin) > 0.6d) {
                                            SparseArray sparseArray = aVar2.f31j;
                                            SparseArray sparseArray2 = aVar3.f31j;
                                            sparseArray2.clear();
                                            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                                                sparseArray2.put(sparseArray.keyAt(i3), (A1.b) sparseArray.valueAt(i3));
                                            }
                                            z2 = true;
                                        }
                                    } catch (p062s1.a e) {
                                        e = e;
                                        o(e.f5665d == 14 ? EnumC0704x3.MODEL_NOT_DOWNLOADED : EnumC0704x3.UNKNOWN_ERROR, j3, aVar, 0, 0);
                                        throw e;
                                    }
                                }
                                hashSet.add(aVar3);
                                it3 = it;
                                it4 = it2;
                                jElapsedRealtime = j3;
                            }
                            Iterator it5 = it3;
                            long j4 = jElapsedRealtime;
                            if (!z2) {
                                hashSet.add(aVar2);
                            }
                            it3 = it5;
                            jElapsedRealtime = j4;
                        }
                        j3 = jElapsedRealtime;
                        arrayList = new ArrayList(hashSet);
                        EnumC0704x3 enumC0704x3 = EnumC0704x3.NO_ERROR;
                        if (list3 == null) {
                            size = 0;
                        } else {
                            size = list3.size();
                        }
                        if (list2 == null) {
                            size2 = 0;
                        } else {
                            size2 = list2.size();
                        }
                        o(enumC0704x3, j3, aVar, size, size2);
                        f156j.set(false);
                    }
                    arrayList = list;
                    j3 = jElapsedRealtime;
                    EnumC0704x3 enumC0704x4 = EnumC0704x3.NO_ERROR;
                    if (list3 == null) {
                        size = 0;
                    } else {
                        size = list3.size();
                    }
                    if (list2 == null) {
                        size2 = 0;
                    } else {
                        size2 = list2.size();
                    }
                    o(enumC0704x4, j3, aVar, size, size2);
                    f156j.set(false);
                } catch (p062s1.a e3) {
                    e = e3;
                    j3 = jElapsedRealtime;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final synchronized void o(final EnumC0704x3 enumC0704x3, long j3, final p077y1.a aVar, final int i3, final int i4) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j3;
        this.e.b(new R4() { // from class: C1.f
            @Override // p016e1.R4
            public final E0.i a() {
                int iLimit;
                EnumC0645n3 enumC0645n3;
                g gVar = this.f151a;
                long j4 = jElapsedRealtime;
                EnumC0704x3 enumC0704x4 = enumC0704x3;
                int i5 = i3;
                int i6 = i4;
                p077y1.a aVar2 = aVar;
                gVar.getClass();
                D0.d dVar = new D0.d(3);
                D0.d dVar2 = new D0.d(2);
                dVar2.e = Long.valueOf(j4 & Long.MAX_VALUE);
                dVar2.f190f = enumC0704x4;
                dVar2.f191g = Boolean.valueOf(g.f156j.get());
                Boolean bool = Boolean.TRUE;
                dVar2.f192h = bool;
                dVar2.f193i = bool;
                dVar.e = new C0663q3(dVar2);
                dVar.f191g = i.a(gVar.f158d);
                dVar.f192h = Integer.valueOf(i5 & Integer.MAX_VALUE);
                dVar.f193i = Integer.valueOf(i6 & Integer.MAX_VALUE);
                g.f157k.getClass();
                int i7 = aVar2.f5926f;
                if (i7 == -1) {
                    Bitmap bitmap = aVar2.f5922a;
                    u.f(bitmap);
                    iLimit = bitmap.getAllocationByteCount();
                } else if (i7 == 17 || i7 == 842094169) {
                    ByteBuffer byteBuffer = aVar2.f5923b;
                    u.f(byteBuffer);
                    iLimit = byteBuffer.limit();
                } else {
                    if (i7 == 35) {
                        u.f(null);
                        throw null;
                    }
                    iLimit = 0;
                }
                C0104l c0104l = new C0104l();
                if (i7 == -1) {
                    enumC0645n3 = EnumC0645n3.BITMAP;
                } else if (i7 == 35) {
                    enumC0645n3 = EnumC0645n3.YUV_420_888;
                } else if (i7 == 842094169) {
                    enumC0645n3 = EnumC0645n3.YV12;
                } else if (i7 != 16) {
                    enumC0645n3 = i7 != 17 ? EnumC0645n3.UNKNOWN_FORMAT : EnumC0645n3.NV21;
                } else {
                    enumC0645n3 = EnumC0645n3.NV16;
                }
                c0104l.e = enumC0645n3;
                c0104l.f1774d = Integer.valueOf(Integer.MAX_VALUE & iLimit);
                dVar.f190f = new C0651o3(c0104l);
                N3 n3 = new N3(dVar);
                E0.k kVar = new E0.k();
                kVar.f227f = gVar.f161h ? EnumC0698w3.TYPE_THICK : EnumC0698w3.TYPE_THIN;
                kVar.f228g = n3;
                return new E0.i(kVar, 0);
            }
        }, EnumC0710y3.ON_DEVICE_FACE_DETECT);
        D0.d dVar = new D0.d(1);
        dVar.e = enumC0704x3;
        dVar.f190f = Boolean.valueOf(f156j.get());
        dVar.f192h = Integer.valueOf(i3 & Integer.MAX_VALUE);
        dVar.f193i = Integer.valueOf(i4 & Integer.MAX_VALUE);
        dVar.f191g = i.a(this.f158d);
        final X x3 = new X(dVar);
        final A0.f fVar = new A0.f(2, this);
        final S4 s4 = this.e;
        l.f5800d.execute(new Runnable() { // from class: e1.Q4
            @Override // java.lang.Runnable
            public final void run() {
                S4 s5 = s4;
                HashMap map = s5.f4127j;
                EnumC0710y3 enumC0710y3 = EnumC0710y3.AGGREGATED_ON_DEVICE_FACE_DETECTION;
                if (!map.containsKey(enumC0710y3)) {
                    C0653p c0653p = new C0653p();
                    C0623k c0623k = new C0623k();
                    if (!c0653p.isEmpty()) {
                        throw new IllegalArgumentException();
                    }
                    c0623k.f4224f = c0653p;
                    map.put(enumC0710y3, c0623k);
                }
                C0623k c0623k2 = (C0623k) map.get(enumC0710y3);
                Long lValueOf = Long.valueOf(jElapsedRealtime);
                C0653p c0653p2 = c0623k2.f4224f;
                X x4 = x3;
                Collection collection = (Collection) c0653p2.get(x4);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(lValueOf)) {
                        throw new AssertionError("New Collection violated the Collection spec");
                    }
                    c0623k2.f4225g++;
                    c0653p2.put(x4, arrayList);
                } else if (collection.add(lValueOf)) {
                    c0623k2.f4225g++;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (s5.d(enumC0710y3, jElapsedRealtime2)) {
                    s5.f4126i.put(enumC0710y3, Long.valueOf(jElapsedRealtime2));
                    l.f5800d.execute(new e(5, s5, fVar));
                }
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f159f.a(true != this.f161h ? 24303 : 24304, enumC0704x3.f4355d, jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }
}
