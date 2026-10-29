package p013d1;

/* JADX INFO: loaded from: classes.dex */
public final class R4 extends S4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f3638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f3639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S4 f3640h;

    public R4(S4 s4, int i3, int i4) {
        this.f3640h = s4;
        this.f3638f = i3;
        this.f3639g = i4;
    }

    @Override // p013d1.AbstractC0468j4
    public final int d() {
        return this.f3640h.e() + this.f3638f + this.f3639g;
    }

    @Override // p013d1.AbstractC0468j4
    public final int e() {
        return this.f3640h.e() + this.f3638f;
    }

    @Override // p013d1.AbstractC0468j4
    public final Object[] f() {
        return this.f3640h.f();
    }

    @Override // p013d1.S4, java.util.List
    /* JADX INFO: renamed from: g */
    public final S4 subList(int i3, int i4) {
        E2.b(i3, i4, this.f3639g);
        int i5 = this.f3638f;
        return this.f3640h.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        E2.a(i3, this.f3639g);
        return this.f3640h.get(i3 + this.f3638f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3639g;
    }
}
