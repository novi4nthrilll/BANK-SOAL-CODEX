package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0075v extends u2.f implements A2.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ G f677i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075v(G g3, p063s2.d dVar) {
        super(1, dVar);
        this.f677i = g3;
    }

    @Override // A2.l
    public final Object i(Object obj) {
        return new C0075v(this.f677i, (p063s2.d) obj).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f676h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            this.f676h = 1;
            obj = this.f677i.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        return obj;
    }
}
