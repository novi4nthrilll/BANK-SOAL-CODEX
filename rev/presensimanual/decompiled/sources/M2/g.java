package M2;

import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class g extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1007h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1008i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f1009j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, p063s2.d dVar) {
        super(2, dVar);
        this.f1009j = hVar;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        g gVar = new g(this.f1009j, dVar);
        gVar.f1008i = obj;
        return gVar;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((g) b((L2.e) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f1007h;
        p055q2.g gVar = p055q2.g.f5603a;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            L2.e eVar = (L2.e) this.f1008i;
            this.f1007h = 1;
            Object objQ = this.f1009j.f1010g.q(eVar, this);
            if (objQ != aVar) {
                objQ = gVar;
            }
            if (objQ == aVar) {
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
