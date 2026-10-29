package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0125g extends C0126h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2290i;

    public C0125g(byte[] bArr, int i3, int i4) {
        super(bArr);
        C0126h.d(i3, i3 + i4, bArr.length);
        this.f2289h = i3;
        this.f2290i = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.C0126h
    public final byte c(int i3) {
        int i4 = this.f2290i;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.e[this.f2289h + i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(p013d1.I.f("Index < 0: ", i3));
        }
        throw new ArrayIndexOutOfBoundsException(A0.c.h("Index > length: ", i3, ", ", i4));
    }

    @Override // androidx.datastore.preferences.protobuf.C0126h
    public final void f(byte[] bArr, int i3) {
        System.arraycopy(this.e, this.f2289h, bArr, 0, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.C0126h
    public final int g() {
        return this.f2289h;
    }

    @Override // androidx.datastore.preferences.protobuf.C0126h
    public final byte h(int i3) {
        return this.e[this.f2289h + i3];
    }

    @Override // androidx.datastore.preferences.protobuf.C0126h
    public final int size() {
        return this.f2290i;
    }
}
