package p009c1;

import java.util.Objects;
import p013d1.B2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f2659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f2660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f2661h;

    public k(Object[] objArr, int i3, int i4) {
        this.f2659f = objArr;
        this.f2660g = i3;
        this.f2661h = i4;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        B2.a(i3, this.f2661h);
        Object obj = this.f2659f[i3 + i3 + this.f2660g];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2661h;
    }
}
