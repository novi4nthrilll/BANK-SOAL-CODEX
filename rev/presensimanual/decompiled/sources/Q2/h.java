package Q2;

import A2.l;
import I2.InterfaceC0034e;
import J.K;
import N2.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1390b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1391c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1392d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1393f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f1394a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i3) {
        if (i3 < 0 || i3 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = 1 - i3;
        this.f1394a = new K(2, this);
    }

    public final void a(c cVar) {
        Object objC;
        f fVar;
        long j3;
        while (true) {
            int andDecrement = f1393f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = p055q2.g.f5603a;
                l lVar = this.f1394a;
                if (andDecrement > 0) {
                    cVar.k(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1392d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                f fVar2 = f.f1388l;
                long j4 = andIncrement / ((long) i.f1399f);
                while (true) {
                    objC = N2.a.c(jVar, j4, fVar2);
                    if (N2.a.f(objC)) {
                        break;
                    }
                    u uVarD = N2.a.d(objC);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        fVar = fVar2;
                        j3 = j4;
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
                        fVar2 = fVar;
                        j4 = j3;
                    }
                    fVar2 = fVar;
                    j4 = j3;
                }
                j jVar2 = (j) N2.a.d(objC);
                int i3 = (int) (andIncrement % ((long) i.f1399f));
                AtomicReferenceArray atomicReferenceArray = jVar2.f1400h;
                do {
                    if (atomicReferenceArray.compareAndSet(i3, null, cVar)) {
                        cVar.a(jVar2, i3);
                        return;
                    }
                } while (atomicReferenceArray.get(i3) == null);
                A0.f fVar3 = i.f1396b;
                A0.f fVar4 = i.f1397c;
                do {
                    if (atomicReferenceArray.compareAndSet(i3, fVar3, fVar4)) {
                        cVar.k(obj, lVar);
                        return;
                    }
                } while (atomicReferenceArray.get(i3) == fVar3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    public final void b() {
        boolean z2;
        int i3;
        Object objC;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1393f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z2 = true;
            if (andIncrement >= 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1390b;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f1391c.getAndIncrement(this);
            long j3 = andIncrement2 / ((long) i.f1399f);
            g gVar = g.f1389l;
            while (true) {
                objC = N2.a.c(jVar, j3, gVar);
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
            j jVar2 = (j) N2.a.d(objC);
            jVar2.a();
            boolean z3 = false;
            if (jVar2.f1165f > j3) {
                z2 = false;
            } else {
                int i4 = (int) (andIncrement2 % ((long) i.f1399f));
                A0.f fVar = i.f1396b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f1400h;
                Object andSet = atomicReferenceArray.getAndSet(i4, fVar);
                if (andSet == null) {
                    int i5 = i.f1395a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            A0.f fVar2 = i.f1396b;
                            A0.f fVar3 = i.f1398d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i4, fVar2, fVar3)) {
                                    z3 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i4) == fVar2);
                            z2 = true ^ z3;
                            break;
                        }
                        if (atomicReferenceArray.get(i4) == i.f1397c) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                } else if (andSet == i.e) {
                    z2 = false;
                } else {
                    if (!(andSet instanceof InterfaceC0034e)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0034e interfaceC0034e = (InterfaceC0034e) andSet;
                    A0.f fVarM = interfaceC0034e.m(p055q2.g.f5603a, this.f1394a);
                    if (fVarM != null) {
                        interfaceC0034e.o(fVarM);
                    } else {
                        z2 = false;
                    }
                }
            }
        } while (!z2);
    }
}
