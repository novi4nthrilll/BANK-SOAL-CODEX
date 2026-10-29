package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class M extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f559j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(P p3, p063s2.d dVar) {
        super(2, dVar);
        this.f559j = p3;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        M m3 = new M(this.f559j, dVar);
        m3.f558i = obj;
        return m3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((M) b((S) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f557h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            S s3 = (S) this.f558i;
            this.f557h = 1;
            if (P.b(this.f559j, s3, this) == aVar) {
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
