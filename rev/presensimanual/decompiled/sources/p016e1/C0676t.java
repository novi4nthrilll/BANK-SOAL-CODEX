package p016e1;

import p013d1.H2;

/* JADX INFO: renamed from: e1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0676t extends AbstractC0682u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f4309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f4310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC0682u f4311h;

    public C0676t(AbstractC0682u abstractC0682u, int i3, int i4) {
        this.f4311h = abstractC0682u;
        this.f4309f = i3;
        this.f4310g = i4;
    }

    @Override // p016e1.AbstractC0659q
    public final int d() {
        return this.f4311h.e() + this.f4309f + this.f4310g;
    }

    @Override // p016e1.AbstractC0659q
    public final int e() {
        return this.f4311h.e() + this.f4309f;
    }

    @Override // p016e1.AbstractC0659q
    public final Object[] f() {
        return this.f4311h.f();
    }

    @Override // p016e1.AbstractC0682u, java.util.List
    /* JADX INFO: renamed from: g */
    public final AbstractC0682u subList(int i3, int i4) {
        H2.b(i3, i4, this.f4310g);
        int i5 = this.f4309f;
        return this.f4311h.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        H2.a(i3, this.f4310g);
        return this.f4311h.get(i3 + this.f4309f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4310g;
    }
}
