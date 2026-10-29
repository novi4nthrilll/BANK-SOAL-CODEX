package J;

import p013d1.AbstractC0485m3;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements p063s2.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f617d;
    public final P e;

    public d0(d0 d0Var, P p3) {
        B2.h.e(p3, "instance");
        this.f617d = d0Var;
        this.e = p3;
    }

    @Override // p063s2.i
    public final Object c(Object obj, A2.p pVar) {
        return pVar.h(obj, this);
    }

    public final void d(P p3) {
        if (this.e == p3) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        d0 d0Var = this.f617d;
        if (d0Var != null) {
            d0Var.d(p3);
        }
    }

    @Override // p063s2.i
    public final p063s2.g f(p063s2.h hVar) {
        return AbstractC0485m3.a(this, hVar);
    }

    @Override // p063s2.g
    public final p063s2.h getKey() {
        return c0.f613d;
    }

    @Override // p063s2.i
    public final p063s2.i h(p063s2.i iVar) {
        B2.h.e(iVar, "context");
        return iVar == p063s2.j.f5670d ? this : (p063s2.i) iVar.c(this, new p063s2.b(1));
    }

    @Override // p063s2.i
    public final p063s2.i n(p063s2.h hVar) {
        return AbstractC0485m3.b(this, hVar);
    }
}
