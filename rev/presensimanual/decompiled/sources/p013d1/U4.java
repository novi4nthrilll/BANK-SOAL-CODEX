package p013d1;

/* JADX INFO: loaded from: classes.dex */
public final class U4 extends S4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U4 f3650h = new U4(0, new Object[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f3651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f3652g;

    public U4(int i3, Object[] objArr) {
        this.f3651f = objArr;
        this.f3652g = i3;
    }

    @Override // p013d1.S4, p013d1.AbstractC0468j4
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f3651f;
        int i3 = this.f3652g;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p013d1.AbstractC0468j4
    public final int d() {
        return this.f3652g;
    }

    @Override // p013d1.AbstractC0468j4
    public final int e() {
        return 0;
    }

    @Override // p013d1.AbstractC0468j4
    public final Object[] f() {
        return this.f3651f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        E2.a(i3, this.f3652g);
        Object obj = this.f3651f[i3];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3652g;
    }
}
