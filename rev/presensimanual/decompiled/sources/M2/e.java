package M2;

import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class e extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1003i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f1004j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, p063s2.d dVar) {
        super(2, dVar);
        this.f1004j = fVar;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        e eVar = new e(this.f1004j, dVar);
        eVar.f1003i = obj;
        return eVar;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((e) b((K2.p) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f1002h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            K2.p pVar = (K2.p) this.f1003i;
            this.f1002h = 1;
            if (this.f1004j.a(pVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        return p055q2.g.f5603a;
    }
}
