package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class Z7 extends C0159a8 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2975g;

    public Z7(byte[] bArr, int i3) {
        super(bArr);
        AbstractC0169b8.f(0, i3, bArr.length);
        this.f2975g = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.C0159a8, com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0169b8
    public final byte c(int i3) {
        int i4 = this.f2975g;
        if (((i4 - (i3 + 1)) | i3) >= 0) {
            return this.f2989f[i3];
        }
        if (i3 < 0) {
            throw new ArrayIndexOutOfBoundsException(p013d1.I.f("Index < 0: ", i3));
        }
        throw new ArrayIndexOutOfBoundsException(A0.c.h("Index > length: ", i3, ", ", i4));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.C0159a8, com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0169b8
    public final byte d(int i3) {
        return this.f2989f[i3];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.C0159a8, com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0169b8
    public final int e() {
        return this.f2975g;
    }
}
