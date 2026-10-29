package p009c1;

import java.util.Objects;
import p013d1.B2;

/* JADX INFO: loaded from: classes.dex */
public final class g extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f2650h = new g(0, new Object[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f2651f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f2652g;

    public g(int i3, Object[] objArr) {
        this.f2651f = objArr;
        this.f2652g = i3;
    }

    @Override // p009c1.d, p009c1.a
    public final int c(Object[] objArr) {
        Object[] objArr2 = this.f2651f;
        int i3 = this.f2652g;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p009c1.a
    public final int d() {
        return this.f2652g;
    }

    @Override // p009c1.a
    public final int e() {
        return 0;
    }

    @Override // p009c1.a
    public final Object[] f() {
        return this.f2651f;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        B2.a(i3, this.f2652g);
        Object obj = this.f2651f[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2652g;
    }
}
