package p016e1;

import p013d1.H2;

/* JADX INFO: renamed from: e1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0712z extends AbstractC0682u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0712z f4368h = new C0712z(0, new Object[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f4369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f4370g;

    public C0712z(int i3, Object[] objArr) {
        this.f4369f = objArr;
        this.f4370g = i3;
    }

    @Override // p016e1.AbstractC0682u, p016e1.AbstractC0659q
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f4369f;
        int i3 = this.f4370g;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p016e1.AbstractC0659q
    public final int d() {
        return this.f4370g;
    }

    @Override // p016e1.AbstractC0659q
    public final int e() {
        return 0;
    }

    @Override // p016e1.AbstractC0659q
    public final Object[] f() {
        return this.f4369f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        H2.a(i3, this.f4370g);
        Object obj = this.f4369f[i3];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4370g;
    }
}
