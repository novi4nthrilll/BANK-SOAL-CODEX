package p006b1;

import java.util.Objects;
import p013d1.AbstractC0555y2;

/* JADX INFO: loaded from: classes.dex */
public final class s extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s f2552h = new s(0, new Object[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f2553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f2554g;

    public s(int i3, Object[] objArr) {
        this.f2553f = objArr;
        this.f2554g = i3;
    }

    @Override // p006b1.o
    public final Object[] c() {
        return this.f2553f;
    }

    @Override // p006b1.o
    public final int d() {
        return 0;
    }

    @Override // p006b1.o
    public final int e() {
        return this.f2554g;
    }

    @Override // p006b1.o
    public final boolean f() {
        return false;
    }

    @Override // p006b1.r, p006b1.o
    public final int g(Object[] objArr) {
        Object[] objArr2 = this.f2553f;
        int i3 = this.f2554g;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0555y2.a(i3, this.f2554g);
        Object obj = this.f2553f[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2554g;
    }
}
