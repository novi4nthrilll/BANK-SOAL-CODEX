package p022g0;

import A2.p;
import I1.n;
import I2.InterfaceC0050v;
import J.C0078y;
import L2.d;
import p013d1.AbstractC0449g3;
import p055q2.g;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f4482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f4483j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, n nVar, p063s2.d dVar2) {
        super(2, dVar2);
        this.f4482i = dVar;
        this.f4483j = nVar;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        return new a(this.f4482i, this.f4483j, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((a) b((InterfaceC0050v) obj, (p063s2.d) obj2)).j(g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f4481h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            C0078y c0078y = new C0078y(2, this.f4483j);
            this.f4481h = 1;
            if (this.f4482i.q(c0078y, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        return g.f5603a;
    }
}
