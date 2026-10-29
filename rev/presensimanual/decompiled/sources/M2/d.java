package M2;

import I2.AbstractC0052x;
import I2.D;
import I2.InterfaceC0050v;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L2.e f1000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f1001k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(L2.e eVar, f fVar, p063s2.d dVar) {
        super(2, dVar);
        this.f1000j = eVar;
        this.f1001k = fVar;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        d dVar2 = new d(this.f1000j, this.f1001k, dVar);
        dVar2.f999i = obj;
        return dVar2;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((d) b((InterfaceC0050v) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) throws Throwable {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f998h;
        p055q2.g gVar = p055q2.g.f5603a;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            InterfaceC0050v interfaceC0050v = (InterfaceC0050v) this.f999i;
            f fVar = this.f1001k;
            int i4 = fVar.e;
            if (i4 == -3) {
                i4 = -2;
            }
            A2.p eVar = new e(fVar, null);
            K2.b bVarA = K2.i.a(i4, fVar.f1006f, 4);
            p063s2.i iVarA = AbstractC0052x.a(interfaceC0050v.j(), fVar.f1005d, true);
            P2.d dVar = D.f434a;
            if (iVarA != dVar && iVarA.f(p063s2.e.f5669d) == null) {
                iVarA = iVarA.h(dVar);
            }
            K2.o oVar = new K2.o(iVarA, bVarA);
            oVar.W(3, oVar, eVar);
            this.f998h = 1;
            Object objB = L2.r.b(this.f1000j, oVar, true, this);
            if (objB != aVar) {
                objB = gVar;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        return gVar;
    }
}
