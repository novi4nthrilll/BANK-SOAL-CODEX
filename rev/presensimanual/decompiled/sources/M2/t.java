package M2;

import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class t extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L2.e f1025j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(L2.e eVar, p063s2.d dVar) {
        super(2, dVar);
        this.f1025j = eVar;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        t tVar = new t(this.f1025j, dVar);
        tVar.f1024i = obj;
        return tVar;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((t) b(obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f1023h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            Object obj2 = this.f1024i;
            this.f1023h = 1;
            if (this.f1025j.c(obj2, this) == aVar) {
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
