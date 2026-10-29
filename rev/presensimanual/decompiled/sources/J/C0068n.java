package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0068n extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ P f656i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0068n(P p3, p063s2.d dVar) {
        super(2, dVar);
        this.f656i = p3;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        return new C0068n(this.f656i, dVar);
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0068n) b((L2.e) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f655h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            this.f655h = 1;
            if (P.c(this.f656i, this) == aVar) {
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
