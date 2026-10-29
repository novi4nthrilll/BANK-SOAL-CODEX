package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class S8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S8 f2908f = new S8(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f2911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2912d = -1;
    public boolean e;

    public S8(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.f2909a = i3;
        this.f2910b = iArr;
        this.f2911c = objArr;
        this.e = z2;
    }

    public static S8 b() {
        return new S8(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iR;
        int iA;
        int iR2;
        int i3 = this.f2912d;
        if (i3 != -1) {
            return i3;
        }
        int iR3 = 0;
        for (int i4 = 0; i4 < this.f2909a; i4++) {
            int i5 = this.f2910b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        int i8 = i6 << 3;
                        AbstractC0169b8 abstractC0169b8 = (AbstractC0169b8) this.f2911c[i4];
                        int iR4 = C0179c8.r(i8);
                        int iE = abstractC0169b8.e();
                        iR3 = C0179c8.r(iE) + iE + iR4 + iR3;
                    } else if (i7 == 3) {
                        int iR5 = C0179c8.r(i6 << 3);
                        iR = iR5 + iR5;
                        iA = ((S8) this.f2911c[i4]).a();
                    } else {
                        if (i7 != 5) {
                            throw new IllegalStateException(new C0358u8());
                        }
                        ((Integer) this.f2911c[i4]).getClass();
                        iR2 = C0179c8.r(i6 << 3) + 4;
                    }
                } else {
                    ((Long) this.f2911c[i4]).getClass();
                    iR2 = C0179c8.r(i6 << 3) + 8;
                }
                iR3 = iR2 + iR3;
            } else {
                int i9 = i6 << 3;
                long jLongValue = ((Long) this.f2911c[i4]).longValue();
                iR = C0179c8.r(i9);
                iA = C0179c8.a(jLongValue);
            }
            iR3 = iA + iR + iR3;
        }
        this.f2912d = iR3;
        return iR3;
    }

    public final void c(int i3, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.f2909a + 1);
        int[] iArr = this.f2910b;
        int i4 = this.f2909a;
        iArr[i4] = i3;
        this.f2911c[i4] = obj;
        this.f2909a = i4 + 1;
    }

    public final void d(A8 a8) {
        if (this.f2909a != 0) {
            for (int i3 = 0; i3 < this.f2909a; i3++) {
                int i4 = this.f2910b[i3];
                Object obj = this.f2911c[i3];
                int i5 = i4 & 7;
                int i6 = i4 >>> 3;
                if (i5 == 0) {
                    a8.p(((Long) obj).longValue(), i6);
                } else if (i5 == 1) {
                    a8.l(((Long) obj).longValue(), i6);
                } else if (i5 == 2) {
                    a8.h(i6, (AbstractC0169b8) obj);
                } else if (i5 == 3) {
                    ((C0179c8) a8.f2742a).j(i6, 3);
                    ((S8) obj).d(a8);
                    ((C0179c8) a8.f2742a).j(i6, 4);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(new C0358u8());
                    }
                    a8.k(i6, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i3) {
        int[] iArr = this.f2910b;
        if (i3 > iArr.length) {
            int i4 = this.f2909a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f2910b = Arrays.copyOf(iArr, i3);
            this.f2911c = Arrays.copyOf(this.f2911c, i3);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof S8)) {
            return false;
        }
        S8 s8 = (S8) obj;
        int i3 = this.f2909a;
        if (i3 == s8.f2909a) {
            int[] iArr = this.f2910b;
            int[] iArr2 = s8.f2910b;
            for (int i4 = 0; i4 < i3; i4++) {
                if (iArr[i4] == iArr2[i4]) {
                }
            }
            Object[] objArr = this.f2911c;
            Object[] objArr2 = s8.f2911c;
            int i5 = this.f2909a;
            for (int i6 = 0; i6 < i5; i6++) {
                if (objArr[i6].equals(objArr2[i6])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2909a;
        int i4 = i3 + 527;
        int[] iArr = this.f2910b;
        int iHashCode = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = ((i4 * 31) + i5) * 31;
        Object[] objArr = this.f2911c;
        int i8 = this.f2909a;
        for (int i9 = 0; i9 < i8; i9++) {
            iHashCode = (iHashCode * 31) + objArr[i9].hashCode();
        }
        return i7 + iHashCode;
    }
}
