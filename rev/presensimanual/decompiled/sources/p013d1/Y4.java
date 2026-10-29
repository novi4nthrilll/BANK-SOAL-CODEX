package p013d1;

/* JADX INFO: loaded from: classes.dex */
public final class Y4 extends S4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f3678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f3679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f3680h = 1;

    public Y4(int i3, Object[] objArr) {
        this.f3678f = objArr;
        this.f3679g = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        E2.a(i3, this.f3680h);
        Object obj = this.f3678f[i3 + i3 + this.f3679g];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3680h;
    }
}
