package p063s2;

import A2.p;
import B2.h;
import p013d1.AbstractC0485m3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f5666d;

    public a(h hVar) {
        this.f5666d = hVar;
    }

    @Override // p063s2.i
    public final Object c(Object obj, p pVar) {
        return pVar.h(obj, this);
    }

    @Override // p063s2.i
    public g f(h hVar) {
        return AbstractC0485m3.a(this, hVar);
    }

    @Override // p063s2.g
    public final h getKey() {
        return this.f5666d;
    }

    @Override // p063s2.i
    public final i h(i iVar) {
        h.e(iVar, "context");
        return iVar == j.f5670d ? this : (i) iVar.c(this, new b(1));
    }

    @Override // p063s2.i
    public i n(h hVar) {
        return AbstractC0485m3.b(this, hVar);
    }
}
