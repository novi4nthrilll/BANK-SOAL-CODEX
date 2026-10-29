package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0060f extends u2.f implements A2.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f622h;

    @Override // A2.l
    public final Object i(Object obj) {
        C0060f c0060f = new C0060f(1, (p063s2.d) obj);
        p055q2.g gVar = p055q2.g.f5603a;
        c0060f.j(gVar);
        return gVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        int i3 = this.f622h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            this.f622h = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0449g3.b(obj);
        return p055q2.g.f5603a;
    }
}
