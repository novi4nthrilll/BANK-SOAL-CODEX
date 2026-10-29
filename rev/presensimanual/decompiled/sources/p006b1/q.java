package p006b1;

import p013d1.AbstractC0555y2;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f2549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f2550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r f2551h;

    public q(r rVar, int i3, int i4) {
        this.f2551h = rVar;
        this.f2549f = i3;
        this.f2550g = i4;
    }

    @Override // p006b1.o
    public final Object[] c() {
        return this.f2551h.c();
    }

    @Override // p006b1.o
    public final int d() {
        return this.f2551h.d() + this.f2549f;
    }

    @Override // p006b1.o
    public final int e() {
        return this.f2551h.d() + this.f2549f + this.f2550g;
    }

    @Override // p006b1.o
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0555y2.a(i3, this.f2550g);
        return this.f2551h.get(i3 + this.f2549f);
    }

    @Override // p006b1.r, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final r subList(int i3, int i4) {
        AbstractC0555y2.b(i3, i4, this.f2550g);
        int i5 = this.f2549f;
        return this.f2551h.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2550g;
    }
}
