package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0069o extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f657h;

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        C0069o c0069o = new C0069o(2, dVar);
        c0069o.f657h = obj;
        return c0069o;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0069o) b((a0) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        AbstractC0449g3.b(obj);
        return Boolean.valueOf(!(((a0) this.f657h) instanceof Q));
    }
}
