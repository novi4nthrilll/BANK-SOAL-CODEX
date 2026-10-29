package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0159a8 extends AbstractC0169b8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f2989f;

    public C0159a8(byte[] bArr) {
        this.f2995d = 0;
        bArr.getClass();
        this.f2989f = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0169b8
    public byte c(int i3) {
        return this.f2989f[i3];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0169b8
    public byte d(int i3) {
        return this.f2989f[i3];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0169b8
    public int e() {
        return this.f2989f.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0169b8) || e() != ((AbstractC0169b8) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof C0159a8)) {
            return obj.equals(this);
        }
        C0159a8 c0159a8 = (C0159a8) obj;
        int i3 = this.f2995d;
        int i4 = c0159a8.f2995d;
        if (i3 != 0 && i4 != 0 && i3 != i4) {
            return false;
        }
        int iE = e();
        if (iE > c0159a8.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > c0159a8.e()) {
            throw new IllegalArgumentException(A0.c.h("Ran off end of other: 0, ", iE, ", ", c0159a8.e()));
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < iE) {
            if (this.f2989f[i5] != c0159a8.f2989f[i6]) {
                return false;
            }
            i5++;
            i6++;
        }
        return true;
    }
}
