package J;

import I2.C0041l;
import I2.InterfaceC0050v;
import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0079z extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P f691i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0079z(P p3, p063s2.d dVar) {
        super(2, dVar);
        this.f691i = p3;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        return new C0079z(this.f691i, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0079z) b((InterfaceC0050v) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) throws Throwable {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f690h;
        p055q2.g gVar = p055q2.g.f5603a;
        P p3 = this.f691i;
        if (i3 != 0) {
            if (i3 == 1) {
                AbstractC0449g3.b(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0449g3.b(obj);
            }
        }
        AbstractC0449g3.b(obj);
        this.f690h = 1;
        Object objU = ((C0041l) p3.f578l.e).U(this);
        if (objU != aVar) {
            objU = gVar;
        }
        if (objU == aVar) {
            return aVar;
        }
        L2.d dVar = p3.h().f608c;
        L2.d dVarA = dVar instanceof M2.j ? M2.l.a((M2.j) dVar, null, 0, 2, 1) : new M2.h(dVar, p063s2.j.f5670d, 0, 2);
        C0078y c0078y = new C0078y(0, p3);
        this.f690h = 2;
        return dVarA.q(c0078y, this) == aVar ? aVar : gVar;
    }
}
