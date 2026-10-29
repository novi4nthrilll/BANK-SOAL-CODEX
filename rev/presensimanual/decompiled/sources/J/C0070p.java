package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0070p extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a0 f659i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0070p(a0 a0Var, p063s2.d dVar) {
        super(2, dVar);
        this.f659i = a0Var;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        C0070p c0070p = new C0070p(this.f659i, dVar);
        c0070p.f658h = obj;
        return c0070p;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0070p) b((a0) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        AbstractC0449g3.b(obj);
        a0 a0Var = (a0) this.f658h;
        return Boolean.valueOf((a0Var instanceof C0057c) && a0Var.f609a <= this.f659i.f609a);
    }
}
