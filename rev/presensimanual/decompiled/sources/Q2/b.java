package Q2;

import A2.l;
import E0.n;
import I2.n0;
import J.K;
import J.L;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b extends B2.i implements l {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i3, Object obj, Object obj2) {
        super(1);
        this.e = i3;
        this.f1383f = obj;
        this.f1384g = obj2;
    }

    @Override // A2.l
    public final Object i(Object obj) {
        Object gVar;
        K2.j jVar;
        p055q2.g gVar2;
        p055q2.g gVar3;
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((c) this.f1384g).getClass();
                ((d) this.f1383f).e(null);
                return p055q2.g.f5603a;
            case 1:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1386g;
                ((c) this.f1384g).getClass();
                d dVar = (d) this.f1383f;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return p055q2.g.f5603a;
            default:
                Throwable th = (Throwable) obj;
                ((K) this.f1383f).i(th);
                n nVar = (n) this.f1384g;
                ((K2.b) nVar.f237f).g(th, false);
                do {
                    K2.b bVar = (K2.b) nVar.f237f;
                    bVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = K2.b.f779g;
                    long j3 = atomicLongFieldUpdater.get(bVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = K2.b.f778f;
                    long j4 = atomicLongFieldUpdater2.get(bVar);
                    boolean z2 = true;
                    if (bVar.r(j4, true)) {
                        gVar = new K2.g(bVar.m());
                    } else {
                        long j5 = j4 & 1152921504606846975L;
                        Object obj2 = K2.i.f811a;
                        if (j3 >= j5) {
                            gVar = obj2;
                        } else {
                            Object obj3 = K2.d.f798k;
                            K2.j jVar2 = (K2.j) K2.b.f783k.get(bVar);
                            while (true) {
                                if (bVar.r(atomicLongFieldUpdater2.get(bVar), z2)) {
                                    gVar = new K2.g(bVar.m());
                                } else {
                                    long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar);
                                    long j6 = K2.d.f790b;
                                    Object obj4 = obj2;
                                    long j7 = andIncrement / j6;
                                    int i3 = (int) (andIncrement % j6);
                                    if (jVar2.f1165f != j7) {
                                        K2.j jVarL = bVar.l(j7, jVar2);
                                        if (jVarL == null) {
                                            continue;
                                        } else {
                                            jVar = jVarL;
                                        }
                                        obj2 = obj4;
                                        z2 = true;
                                    } else {
                                        jVar = jVar2;
                                    }
                                    Object objA = bVar.A(jVar, i3, andIncrement, obj3);
                                    if (objA == K2.d.f800m) {
                                        n0 n0Var = obj3 instanceof n0 ? (n0) obj3 : null;
                                        if (n0Var != null) {
                                            n0Var.a(jVar, i3);
                                        }
                                        bVar.C(andIncrement);
                                        jVar.h();
                                        obj2 = obj4;
                                    } else if (objA == K2.d.f802o) {
                                        if (andIncrement < bVar.p()) {
                                            jVar.a();
                                        }
                                        jVar2 = jVar;
                                        obj2 = obj4;
                                        z2 = true;
                                    } else {
                                        if (objA == K2.d.f801n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar.a();
                                        obj2 = objA;
                                    }
                                    gVar = obj2;
                                }
                            }
                        }
                    }
                    gVar2 = null;
                    if (gVar instanceof K2.h) {
                        gVar = null;
                    }
                    gVar3 = p055q2.g.f5603a;
                    if (gVar != null) {
                        L.e.h(gVar, th);
                        gVar2 = gVar3;
                    }
                } while (gVar2 != null);
                return gVar3;
        }
    }
}
