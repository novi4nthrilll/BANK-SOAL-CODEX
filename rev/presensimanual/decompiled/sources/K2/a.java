package K2;

import I2.AbstractC0052x;
import I2.C0035f;
import I2.n0;
import N2.u;
import N2.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013d1.AbstractC0449g3;
import p013d1.AbstractC0514r3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f776d = d.f803p;
    public C0035f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b f777f;

    public a(b bVar) {
        this.f777f = bVar;
    }

    @Override // I2.n0
    public final void a(u uVar, int i3) {
        C0035f c0035f = this.e;
        if (c0035f != null) {
            c0035f.a(uVar, i3);
        }
    }

    public final Object b(L2.f fVar) throws Throwable {
        C0035f c0035f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f783k;
        b bVar = this.f777f;
        j jVar = (j) atomicReferenceFieldUpdater.get(bVar);
        while (true) {
            bVar.getClass();
            if (bVar.r(b.f778f.get(bVar), true)) {
                this.f776d = d.f799l;
                Throwable thM = bVar.m();
                if (thM == null) {
                    return Boolean.FALSE;
                }
                int i3 = v.f1166a;
                throw thM;
            }
            long andIncrement = b.f779g.getAndIncrement(bVar);
            long j3 = d.f790b;
            long j4 = andIncrement / j3;
            int i4 = (int) (andIncrement % j3);
            if (jVar.f1165f != j4) {
                j jVarL = bVar.l(j4, jVar);
                if (jVarL == null) {
                    continue;
                } else {
                    jVar = jVarL;
                }
            }
            Object objA = bVar.A(jVar, i4, andIncrement, null);
            A0.f fVar2 = d.f800m;
            if (objA == fVar2) {
                throw new IllegalStateException("unreachable");
            }
            A0.f fVar3 = d.f802o;
            if (objA == fVar3) {
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
            } else {
                if (objA != d.f801n) {
                    jVar.a();
                    this.f776d = objA;
                    return Boolean.TRUE;
                }
                b bVar2 = this.f777f;
                C0035f c0035fC = AbstractC0052x.c(AbstractC0514r3.a(fVar));
                try {
                    this.e = c0035fC;
                    c0035f = c0035fC;
                    try {
                        Object objA2 = bVar2.A(jVar, i4, andIncrement, this);
                        if (objA2 != fVar2) {
                            N2.p pVar = null;
                            p063s2.i iVar = c0035f.f477h;
                            A2.l lVar = bVar2.e;
                            if (objA2 == fVar3) {
                                if (andIncrement < bVar2.p()) {
                                    jVar.a();
                                }
                                j jVar2 = (j) b.f783k.get(bVar2);
                                while (true) {
                                    if (bVar2.r(b.f778f.get(bVar2), true)) {
                                        C0035f c0035f2 = this.e;
                                        B2.h.b(c0035f2);
                                        this.e = null;
                                        this.f776d = d.f799l;
                                        Throwable thM2 = bVar.m();
                                        if (thM2 != null) {
                                            c0035f2.l(AbstractC0449g3.a(thM2));
                                            break;
                                        }
                                        c0035f2.l(Boolean.FALSE);
                                        break;
                                    }
                                    long andIncrement2 = b.f779g.getAndIncrement(bVar2);
                                    long j5 = d.f790b;
                                    long j6 = andIncrement2 / j5;
                                    int i5 = (int) (andIncrement2 % j5);
                                    if (jVar2.f1165f != j6) {
                                        j jVarL2 = bVar2.l(j6, jVar2);
                                        if (jVarL2 != null) {
                                            jVar2 = jVarL2;
                                        }
                                    }
                                    A2.l lVar2 = lVar;
                                    Object objA3 = bVar2.A(jVar2, i5, andIncrement2, this);
                                    if (objA3 == d.f800m) {
                                        a(jVar2, i5);
                                        break;
                                    }
                                    if (objA3 == d.f802o) {
                                        if (andIncrement2 < bVar2.p()) {
                                            jVar2.a();
                                        }
                                        lVar = lVar2;
                                    } else {
                                        if (objA3 == d.f801n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar2.a();
                                        this.f776d = objA3;
                                        this.e = null;
                                        bool = Boolean.TRUE;
                                        if (lVar2 != null) {
                                            pVar = new N2.p(lVar2, objA3, iVar);
                                        }
                                    }
                                }
                            } else {
                                jVar.a();
                                this.f776d = objA2;
                                this.e = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    pVar = new N2.p(lVar, objA2, iVar);
                                }
                            }
                            c0035f.k(bool, pVar);
                            break;
                        }
                        a(jVar, i4);
                        return c0035f.u();
                    } catch (Throwable th) {
                        th = th;
                        c0035f.B();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c0035f = c0035fC;
                }
            }
        }
    }
}
