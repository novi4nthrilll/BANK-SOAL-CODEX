package p016e1;

import p013d1.H2;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0682u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f4023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f4024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f4025h = 1;

    public D(int i3, Object[] objArr) {
        this.f4023f = objArr;
        this.f4024g = i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        H2.a(i3, this.f4025h);
        Object obj = this.f4023f[i3 + i3 + this.f4024g];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4025h;
    }
}
