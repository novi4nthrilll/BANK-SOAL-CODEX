package K2;

import I2.C0035f;
import I2.C0045p;
import I2.InterfaceC0034e;
import I2.n0;
import N2.u;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;
import p013d1.AbstractC0514r3;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public class b implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f778f = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f779g = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f780h = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f781i = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f782j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f783k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f784l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f785m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f786n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f787d;
    public final A2.l e;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i3, A2.l lVar) {
        this.f787d = i3;
        this.e = lVar;
        if (i3 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i3 + ", should be >=0").toString());
        }
        j jVar = d.f789a;
        this.bufferEnd = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f780h.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f789a;
            B2.h.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f806s;
    }

    public static final j b(b bVar, long j3, j jVar) {
        Object objC;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        bVar.getClass();
        j jVar2 = d.f789a;
        c cVar = c.f788l;
        loop0: while (true) {
            objC = N2.a.c(jVar, j3, cVar);
            if (!N2.a.f(objC)) {
                u uVarD = N2.a.d(objC);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f782j;
                    u uVar = (u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.f1165f >= uVarD.f1165f) {
                        break loop0;
                    }
                    if (!uVarD.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, uVarD)) {
                            if (!uVar.e()) {
                                break loop0;
                            }
                            uVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(bVar) == uVar);
                    if (uVarD.e()) {
                        uVarD.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zF = N2.a.f(objC);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f779g;
        if (zF) {
            bVar.s();
            if (jVar.f1165f * ((long) d.f790b) >= atomicLongFieldUpdater2.get(bVar)) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) N2.a.d(objC);
        long j6 = jVar3.f1165f;
        if (j6 <= j3) {
            return jVar3;
        }
        long j7 = ((long) d.f790b) * j6;
        do {
            atomicLongFieldUpdater = f778f;
            j4 = atomicLongFieldUpdater.get(bVar);
            j5 = 1152921504606846975L & j4;
            if (j5 >= j7) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j4, j5 + (((long) ((int) (j4 >> 60))) << 60)));
        if (j6 * ((long) d.f790b) >= atomicLongFieldUpdater2.get(bVar)) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public static final void c(b bVar, Object obj, C0035f c0035f) throws IllegalAccessException, InvocationTargetException {
        A2.l lVar = bVar.e;
        if (lVar != null) {
            N2.a.a(lVar, obj, c0035f.f477h);
        }
        c0035f.l(AbstractC0449g3.a(bVar.o()));
    }

    public static final int e(b bVar, j jVar, int i3, Object obj, long j3, Object obj2, boolean z2) {
        bVar.getClass();
        jVar.m(i3, obj);
        if (z2) {
            return bVar.B(jVar, i3, obj, j3, obj2, z2);
        }
        Object objK = jVar.k(i3);
        if (objK == null) {
            if (bVar.f(j3)) {
                if (jVar.j(i3, null, d.f792d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(i3, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof n0) {
            jVar.m(i3, null);
            if (bVar.y(objK, obj)) {
                jVar.n(i3, d.f796i);
                return 0;
            }
            A0.f fVar = d.f798k;
            if (jVar.f813i.getAndSet((i3 * 2) + 1, fVar) != fVar) {
                jVar.l(i3, true);
            }
            return 5;
        }
        return bVar.B(jVar, i3, obj, j3, obj2, z2);
    }

    public static void q(b bVar) {
        bVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f781i;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0034e) {
            B2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return d.a((InterfaceC0034e) obj, p055q2.g.f5603a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(j jVar, int i3, long j3, Object obj) {
        Object objK = jVar.k(i3);
        AtomicReferenceArray atomicReferenceArray = jVar.f813i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f778f;
        if (objK == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f801n;
                }
                if (jVar.j(i3, objK, obj)) {
                    k();
                    return d.f800m;
                }
            }
        } else if (objK == d.f792d && jVar.j(i3, objK, d.f796i)) {
            k();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            jVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object objK2 = jVar.k(i3);
            if (objK2 == null || objK2 == d.e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i3, objK2, d.f795h)) {
                        k();
                        return d.f802o;
                    }
                } else {
                    if (obj == null) {
                        return d.f801n;
                    }
                    if (jVar.j(i3, objK2, obj)) {
                        k();
                        return d.f800m;
                    }
                }
            } else if (objK2 != d.f792d) {
                A0.f fVar = d.f797j;
                if (objK2 == fVar) {
                    return d.f802o;
                }
                if (objK2 == d.f795h) {
                    return d.f802o;
                }
                if (objK2 == d.f799l) {
                    k();
                    return d.f802o;
                }
                if (objK2 != d.f794g && jVar.j(i3, objK2, d.f793f)) {
                    boolean z2 = objK2 instanceof s;
                    if (z2) {
                        objK2 = ((s) objK2).f820a;
                    }
                    if (z(objK2)) {
                        jVar.n(i3, d.f796i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        jVar.m(i3, null);
                        return obj3;
                    }
                    jVar.n(i3, fVar);
                    jVar.h();
                    if (z2) {
                        k();
                    }
                    return d.f802o;
                }
            } else if (jVar.j(i3, objK2, d.f796i)) {
                k();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                jVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int B(j jVar, int i3, Object obj, long j3, Object obj2, boolean z2) {
        while (true) {
            Object objK = jVar.k(i3);
            if (objK == null) {
                if (!f(j3) || z2) {
                    if (z2) {
                        if (jVar.j(i3, null, d.f797j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(i3, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i3, null, d.f792d)) {
                    return 1;
                }
            } else {
                if (objK != d.e) {
                    A0.f fVar = d.f798k;
                    if (objK == fVar) {
                        jVar.m(i3, null);
                        return 5;
                    }
                    if (objK == d.f795h) {
                        jVar.m(i3, null);
                        return 5;
                    }
                    if (objK == d.f799l) {
                        jVar.m(i3, null);
                        s();
                        return 4;
                    }
                    jVar.m(i3, null);
                    if (objK instanceof s) {
                        objK = ((s) objK).f820a;
                    }
                    if (y(objK, obj)) {
                        jVar.n(i3, d.f796i);
                        return 0;
                    }
                    if (jVar.f813i.getAndSet((i3 * 2) + 1, fVar) == fVar) {
                        return 5;
                    }
                    jVar.l(i3, true);
                    return 5;
                }
                if (jVar.j(i3, objK, d.f792d)) {
                    return 1;
                }
            }
        }
    }

    public final void C(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        if (u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f780h;
        } while (atomicLongFieldUpdater.get(this) <= j3);
        int i3 = d.f791c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f781i;
            if (i4 >= i3) {
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, 4611686018427387904L + (j4 & 4611686018427387903L)));
                while (true) {
                    long j6 = atomicLongFieldUpdater.get(this);
                    long j7 = atomicLongFieldUpdater2.get(this);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z2 = (j7 & 4611686018427387904L) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j7, j8 + 4611686018427387904L);
                    }
                }
                do {
                    j5 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, j5 & 4611686018427387903L));
                return;
            }
            long j9 = atomicLongFieldUpdater.get(this);
            if (j9 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j9 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i4++;
            }
        }
    }

    @Override // K2.q
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01bb, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d0, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r0 == r13) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [I2.f] */
    @Override // K2.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.Object r27, p063s2.d r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.b.d(java.lang.Object, s2.d):java.lang.Object");
    }

    public final boolean f(long j3) {
        return j3 < f780h.get(this) || j3 < f779g.get(this) + ((long) this.f787d);
    }

    public final boolean g(Throwable th, boolean z2) {
        boolean z3;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f778f;
        if (z2) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) != 0) {
                    break;
                }
                j jVar = d.f789a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (((long) 1) << 60) + (j7 & 1152921504606846975L)));
        }
        A0.f fVar = d.f806s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f785m;
            if (atomicReferenceFieldUpdater.compareAndSet(this, fVar, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != fVar) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (((long) 3) << 60) + (j6 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 >> 60);
                if (i3 == 0) {
                    j4 = j3 & 1152921504606846975L;
                    j5 = 2;
                } else {
                    if (i3 != 1) {
                        break;
                    }
                    j4 = j3 & 1152921504606846975L;
                    j5 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, (j5 << 60) + j4));
        }
        s();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f786n;
                obj = atomicReferenceFieldUpdater2.get(this);
                A0.f fVar2 = obj == null ? d.f804q : d.f805r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, fVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                B2.s.a(1, obj);
                ((A2.l) obj).i(m());
            }
        }
        return z3;
    }

    public final j h(long j3) {
        Object objG;
        long j4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = f784l.get(this);
        j jVar = (j) f782j.get(this);
        if (jVar.f1165f > ((j) obj).f1165f) {
            obj = jVar;
        }
        j jVar2 = (j) f783k.get(this);
        if (jVar2.f1165f > ((j) obj).f1165f) {
            obj = jVar2;
        }
        N2.d dVar = (N2.d) obj;
        loop0: while (true) {
            dVar.getClass();
            Object obj2 = N2.d.f1135d.get(dVar);
            A0.f fVar = N2.a.f1129b;
            objG = null;
            if (obj2 == fVar) {
                break;
            }
            N2.d dVar2 = (N2.d) obj2;
            if (dVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = N2.d.f1135d;
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, fVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar3 = (j) dVar;
        if (t()) {
            j jVar4 = jVar3;
            loop2: while (true) {
                int i3 = d.f790b - 1;
                while (true) {
                    if (-1 < i3) {
                        j4 = (jVar4.f1165f * ((long) d.f790b)) + ((long) i3);
                        if (j4 >= f779g.get(this)) {
                            while (true) {
                                Object objK = jVar4.k(i3);
                                if (objK != null && objK != d.e) {
                                    if (objK != d.f792d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (jVar4.j(i3, objK, d.f799l)) {
                                    jVar4.h();
                                    break;
                                }
                            }
                            i3--;
                        }
                    } else {
                        jVar4 = (j) ((N2.d) N2.d.e.get(jVar4));
                        if (jVar4 == null) {
                        }
                    }
                    j4 = -1;
                    break;
                }
            }
            if (j4 != -1) {
                j(j4);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((N2.d) N2.d.e.get(jVar5))) {
            for (int i4 = d.f790b - 1; -1 < i4; i4--) {
                if ((jVar5.f1165f * ((long) d.f790b)) + ((long) i4) < j3) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = jVar5.k(i4);
                    if (objK2 != null && objK2 != d.e) {
                        if (!(objK2 instanceof s)) {
                            if (!(objK2 instanceof n0)) {
                                break;
                            }
                            if (jVar5.j(i4, objK2, d.f799l)) {
                                objG = N2.a.g(objG, objK2);
                                jVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(i4, objK2, d.f799l)) {
                                objG = N2.a.g(objG, ((s) objK2).f820a);
                                jVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(i4, objK2, d.f799l)) {
                            jVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objG != null) {
            if (objG instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objG;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    x((n0) arrayList.get(size), true);
                }
            } else {
                x((n0) objG, true);
            }
        }
        return jVar3;
    }

    @Override // K2.r
    public Object i(Object obj) throws IllegalAccessException, InvocationTargetException {
        j jVar;
        j jVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f778f;
        long j3 = atomicLongFieldUpdater.get(this);
        boolean z2 = r(j3, false) ? false : !f(j3 & 1152921504606846975L);
        h hVar = i.f811a;
        if (z2) {
            return hVar;
        }
        S1.f fVar = d.f797j;
        j jVar3 = (j) f782j.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean zR = r(andIncrement, false);
            int i3 = d.f790b;
            long j5 = i3;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (jVar3.f1165f != j6) {
                j jVarB = b(this, j6, jVar3);
                if (jVarB != null) {
                    jVar = jVarB;
                } else if (zR) {
                    return new g(o());
                }
            } else {
                jVar = jVar3;
            }
            j jVar4 = jVar;
            int iE = e(this, jVar, i4, obj, j4, fVar, zR);
            p055q2.g gVar = p055q2.g.f5603a;
            if (iE == 0) {
                jVar4.a();
            } else if (iE != 1) {
                if (iE == 2) {
                    if (zR) {
                        jVar4.h();
                        return new g(o());
                    }
                    n0 n0Var = fVar instanceof n0 ? (n0) fVar : null;
                    if (n0Var != null) {
                        jVar2 = jVar4;
                        n0Var.a(jVar2, i4 + i3);
                    } else {
                        jVar2 = jVar4;
                    }
                    jVar2.h();
                    return hVar;
                }
                if (iE == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iE == 4) {
                    if (j4 < f779g.get(this)) {
                        jVar4.a();
                    }
                    return new g(o());
                }
                if (iE == 5) {
                    jVar4.a();
                }
                jVar3 = jVar4;
            }
            return gVar;
        }
    }

    public final void j(long j3) {
        C0045p c0045pB;
        j jVar = (j) f783k.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f779g;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(((long) this.f787d) + j4, f780h.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                long j5 = d.f790b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (jVar.f1165f != j6) {
                    j jVarL = l(j6, jVar);
                    if (jVarL == null) {
                        continue;
                    } else {
                        jVar = jVarL;
                    }
                }
                Object objA = A(jVar, i3, j4, null);
                if (objA != d.f802o) {
                    jVar.a();
                    A2.l lVar = this.e;
                    if (lVar != null && (c0045pB = N2.a.b(lVar, objA, null)) != null) {
                        throw c0045pB;
                    }
                } else if (j4 < p()) {
                    jVar.a();
                }
            }
        }
    }

    public final void k() {
        Object objC;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f784l;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f780h.getAndIncrement(this);
            long j3 = andIncrement / ((long) d.f790b);
            if (p() <= andIncrement) {
                if (jVar.f1165f < j3 && jVar.b() != null) {
                    v(j3, jVar);
                }
                q(this);
                return;
            }
            if (jVar.f1165f != j3) {
                c cVar = c.f788l;
                while (true) {
                    objC = N2.a.c(jVar, j3, cVar);
                    if (!N2.a.f(objC)) {
                        u uVarD = N2.a.d(objC);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f1165f >= uVarD.f1165f) {
                                break;
                            }
                            if (!uVarD.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarD)) {
                                    if (!uVar.e()) {
                                        break;
                                    }
                                    uVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == uVar);
                            if (uVarD.e()) {
                                uVarD.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (N2.a.f(objC)) {
                    s();
                    v(j3, jVar);
                    q(this);
                } else {
                    j jVar3 = (j) N2.a.d(objC);
                    long j4 = jVar3.f1165f;
                    if (j4 > j3) {
                        long j5 = j4 * ((long) d.f790b);
                        if (f780h.compareAndSet(this, andIncrement + 1, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f781i;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i3 = (int) (andIncrement % ((long) d.f790b));
            Object objK = jVar.k(i3);
            boolean z2 = objK instanceof n0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f779g;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i3, objK, d.f794g)) {
                while (true) {
                    Object objK2 = jVar.k(i3);
                    if (objK2 instanceof n0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (jVar.j(i3, objK2, new s((n0) objK2))) {
                                q(this);
                                return;
                            }
                        } else if (jVar.j(i3, objK2, d.f794g)) {
                            if (!z(objK2)) {
                                jVar.n(i3, d.f797j);
                                jVar.h();
                                break;
                            } else {
                                jVar.n(i3, d.f792d);
                                q(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == d.f797j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (jVar.j(i3, objK2, d.e)) {
                                q(this);
                                return;
                            }
                        } else if (objK2 == d.f792d || objK2 == d.f795h || objK2 == d.f796i || objK2 == d.f798k || objK2 == d.f799l) {
                            q(this);
                            return;
                        } else if (objK2 != d.f793f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                q(this);
            } else if (z(objK)) {
                jVar.n(i3, d.f792d);
                q(this);
                return;
            } else {
                jVar.n(i3, d.f797j);
                jVar.h();
                q(this);
            }
        }
    }

    public final j l(long j3, j jVar) {
        Object objC;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        j jVar2 = d.f789a;
        c cVar = c.f788l;
        loop0: while (true) {
            objC = N2.a.c(jVar, j3, cVar);
            if (!N2.a.f(objC)) {
                u uVarD = N2.a.d(objC);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f783k;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1165f >= uVarD.f1165f) {
                        break loop0;
                    }
                    if (!uVarD.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarD)) {
                            if (!uVar.e()) {
                                break loop0;
                            }
                            uVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == uVar);
                    if (uVarD.e()) {
                        uVarD.d();
                    }
                }
            } else {
                break;
            }
        }
        if (N2.a.f(objC)) {
            s();
            if (jVar.f1165f * ((long) d.f790b) >= p()) {
                return null;
            }
            jVar.a();
            return null;
        }
        j jVar3 = (j) N2.a.d(objC);
        boolean zU = u();
        long j5 = jVar3.f1165f;
        if (!zU && j3 <= f780h.get(this) / ((long) d.f790b)) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f784l;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f1165f >= j5 || !jVar3.i()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, jVar3)) {
                        if (!uVar2.e()) {
                            break loop3;
                        }
                        uVar2.d();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == uVar2);
                if (jVar3.e()) {
                    jVar3.d();
                }
            }
        }
        if (j5 <= j3) {
            return jVar3;
        }
        long j6 = ((long) d.f790b) * j5;
        do {
            atomicLongFieldUpdater = f779g;
            j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
        if (j5 * ((long) d.f790b) >= p()) {
            return null;
        }
        jVar3.a();
        return null;
    }

    public final Throwable m() {
        return (Throwable) f785m.get(this);
    }

    public final Throwable n() {
        Throwable thM = m();
        return thM == null ? new k("Channel was closed") : thM;
    }

    public final Throwable o() {
        Throwable thM = m();
        return thM == null ? new l("Channel was closed") : thM;
    }

    public final long p() {
        return f778f.get(this) & 1152921504606846975L;
    }

    public final boolean r(long j3, boolean z2) throws IllegalAccessException, InvocationTargetException {
        int i3 = (int) (j3 >> 60);
        if (i3 == 0 || i3 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f779g;
        if (i3 == 2) {
            h(j3 & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f783k;
                    j jVarL = (j) atomicReferenceFieldUpdater.get(this);
                    long j4 = atomicLongFieldUpdater.get(this);
                    if (p() <= j4) {
                        break;
                    }
                    long j5 = d.f790b;
                    long j6 = j4 / j5;
                    if (jVarL.f1165f != j6 && (jVarL = l(j6, jVarL)) == null) {
                        if (((j) atomicReferenceFieldUpdater.get(this)).f1165f < j6) {
                            break;
                        }
                    } else {
                        jVarL.a();
                        int i4 = (int) (j4 % j5);
                        while (true) {
                            Object objK = jVarL.k(i4);
                            if (objK != null && objK != d.e) {
                                if (objK != d.f792d) {
                                    if (objK != d.f797j && objK != d.f799l && objK != d.f796i && objK != d.f795h) {
                                        if (objK != d.f794g) {
                                            if (objK == d.f793f || j4 != atomicLongFieldUpdater.get(this)) {
                                                break;
                                                break;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (jVarL.j(i4, objK, d.f795h)) {
                                k();
                                break;
                            }
                        }
                        f779g.compareAndSet(this, j4, j4 + 1);
                    }
                }
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException(I.f("unexpected close status: ", i3).toString());
            }
            j jVarH = h(j3 & 1152921504606846975L);
            C0045p c0045pB = null;
            Object objG = null;
            loop0: do {
                for (int i5 = d.f790b - 1; -1 < i5; i5--) {
                    long j7 = (jVarH.f1165f * ((long) d.f790b)) + ((long) i5);
                    while (true) {
                        Object objK2 = jVarH.k(i5);
                        if (objK2 == d.f796i) {
                            break loop0;
                        }
                        A0.f fVar = d.f792d;
                        AtomicReferenceArray atomicReferenceArray = jVarH.f813i;
                        A2.l lVar = this.e;
                        if (objK2 != fVar) {
                            if (objK2 != d.e && objK2 != null) {
                                if (!(objK2 instanceof n0) && !(objK2 instanceof s)) {
                                    A0.f fVar2 = d.f794g;
                                    if (objK2 == fVar2 || objK2 == d.f793f) {
                                        break loop0;
                                    }
                                    if (objK2 != fVar2) {
                                        break;
                                    }
                                } else {
                                    if (j7 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    n0 n0Var = objK2 instanceof s ? ((s) objK2).f820a : (n0) objK2;
                                    if (jVarH.j(i5, objK2, d.f799l)) {
                                        if (lVar != null) {
                                            c0045pB = N2.a.b(lVar, atomicReferenceArray.get(i5 * 2), c0045pB);
                                        }
                                        objG = N2.a.g(objG, n0Var);
                                        jVarH.m(i5, null);
                                        jVarH.h();
                                        break;
                                    }
                                }
                            } else if (jVarH.j(i5, objK2, d.f799l)) {
                                jVarH.h();
                                break;
                            }
                        } else {
                            if (j7 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (jVarH.j(i5, objK2, d.f799l)) {
                                if (lVar != null) {
                                    c0045pB = N2.a.b(lVar, atomicReferenceArray.get(i5 * 2), c0045pB);
                                }
                                jVarH.m(i5, null);
                                jVarH.h();
                                break;
                            }
                        }
                    }
                }
                jVarH = (j) ((N2.d) N2.d.e.get(jVarH));
            } while (jVarH != null);
            if (objG != null) {
                if (objG instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objG;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        x((n0) arrayList.get(size), false);
                    }
                } else {
                    x((n0) objG, false);
                }
            }
            if (c0045pB != null) {
                throw c0045pB;
            }
        }
        return true;
    }

    public final boolean s() {
        return r(f778f.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f778f.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f787d + ',');
        sb.append("data=[");
        List listB = p059r2.e.b(f783k.get(this), f782j.get(this), f784l.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (((j) obj) != d.f789a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j3 = ((j) next).f1165f;
            do {
                Object next2 = it.next();
                long j4 = ((j) next2).f1165f;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j5 = f779g.get(this);
        long jP = p();
        loop2: do {
            int i4 = d.f790b;
            for (int i5 = 0; i5 < i4; i5++) {
                long j6 = (jVar.f1165f * ((long) d.f790b)) + ((long) i5);
                if (j6 >= jP && j6 >= j5) {
                    break loop2;
                }
                Object objK = jVar.k(i5);
                Object obj2 = jVar.f813i.get(i5 * 2);
                if (objK instanceof InterfaceC0034e) {
                    string = (j6 >= j5 || j6 < jP) ? (j6 >= jP || j6 < j5) ? "cont" : "send" : "receive";
                } else if (objK instanceof s) {
                    string = "EB(" + objK + ')';
                } else if (B2.h.a(objK, d.f793f) ? true : B2.h.a(objK, d.f794g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objK == null ? true : objK.equals(d.e) ? true : B2.h.a(objK, d.f796i) ? true : B2.h.a(objK, d.f795h) ? true : B2.h.a(objK, d.f798k) ? true : B2.h.a(objK, d.f797j) ? true : B2.h.a(objK, d.f799l))) {
                        string = objK.toString();
                    }
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
            }
            jVar = (j) jVar.b();
        } while (jVar != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(H2.i.a(sb)) == ',') {
            B2.h.d(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j3 = f780h.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    public final void v(long j3, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f1165f < j3 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f784l;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1165f >= jVar.f1165f) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, jVar)) {
                            if (uVar.e()) {
                                uVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == uVar);
                    if (jVar.e()) {
                        jVar.d();
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    public final Object w(Object obj, p063s2.d dVar) throws Throwable {
        C0045p c0045pB;
        C0035f c0035f = new C0035f(1, AbstractC0514r3.a(dVar));
        c0035f.v();
        A2.l lVar = this.e;
        if (lVar == null || (c0045pB = N2.a.b(lVar, obj, null)) == null) {
            c0035f.l(AbstractC0449g3.a(o()));
        } else {
            AbstractC0443f3.a(c0045pB, o());
            c0035f.l(AbstractC0449g3.a(c0045pB));
        }
        Object objU = c0035f.u();
        return objU == t2.a.f5737d ? objU : p055q2.g.f5603a;
    }

    public final void x(n0 n0Var, boolean z2) {
        if (n0Var instanceof InterfaceC0034e) {
            ((p063s2.d) n0Var).l(AbstractC0449g3.a(z2 ? n() : o()));
            return;
        }
        if (!(n0Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + n0Var).toString());
        }
        a aVar = (a) n0Var;
        C0035f c0035f = aVar.e;
        B2.h.b(c0035f);
        aVar.e = null;
        aVar.f776d = d.f799l;
        Throwable thM = aVar.f777f.m();
        if (thM == null) {
            c0035f.l(Boolean.FALSE);
        } else {
            c0035f.l(AbstractC0449g3.a(thM));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof InterfaceC0034e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            B2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0034e interfaceC0034e = (InterfaceC0034e) obj;
            A2.l lVar = this.e;
            return d.a(interfaceC0034e, obj2, lVar != null ? new N2.p(lVar, obj2, interfaceC0034e.g()) : null);
        }
        B2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        a aVar = (a) obj;
        C0035f c0035f = aVar.e;
        B2.h.b(c0035f);
        aVar.e = null;
        aVar.f776d = obj2;
        Boolean bool = Boolean.TRUE;
        A2.l lVar2 = aVar.f777f.e;
        return d.a(c0035f, bool, lVar2 != null ? new N2.p(lVar2, obj2, c0035f.f477h) : null);
    }
}
