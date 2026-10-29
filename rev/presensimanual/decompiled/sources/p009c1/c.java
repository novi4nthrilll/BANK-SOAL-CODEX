package p009c1;

import p013d1.B2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f2644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f2645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f2646h;

    public c(d dVar, int i3, int i4) {
        this.f2646h = dVar;
        this.f2644f = i3;
        this.f2645g = i4;
    }

    @Override // p009c1.a
    public final int d() {
        return this.f2646h.e() + this.f2644f + this.f2645g;
    }

    @Override // p009c1.a
    public final int e() {
        return this.f2646h.e() + this.f2644f;
    }

    @Override // p009c1.a
    public final Object[] f() {
        return this.f2646h.f();
    }

    @Override // p009c1.d, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final d subList(int i3, int i4) {
        B2.c(i3, i4, this.f2645g);
        int i5 = this.f2644f;
        return this.f2646h.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        B2.a(i3, this.f2645g);
        return this.f2646h.get(i3 + this.f2644f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2645g;
    }
}
