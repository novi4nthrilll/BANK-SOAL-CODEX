package I2;

import p013d1.AbstractC0485m3;

/* JADX INFO: loaded from: classes.dex */
public final class m0 implements p063s2.g, p063s2.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m0 f488d = new m0();

    @Override // p063s2.i
    public final Object c(Object obj, A2.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // p063s2.i
    public final p063s2.g f(p063s2.h hVar) {
        return AbstractC0485m3.a(this, hVar);
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

    @Override // p063s2.g
    public final p063s2.h getKey() {
        return this;
    }
}
