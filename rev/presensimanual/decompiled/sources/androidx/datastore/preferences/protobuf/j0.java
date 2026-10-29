package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0 f2312f = new j0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f2315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2316d = -1;
    public boolean e;

    public j0(int i3, int[] iArr, Object[] objArr, boolean z2) {
        this.f2313a = i3;
        this.f2314b = iArr;
        this.f2315c = objArr;
        this.e = z2;
    }

    public final void a(int i3) {
        int[] iArr = this.f2314b;
        if (i3 > iArr.length) {
            int i4 = this.f2313a;
            int i5 = (i4 / 2) + i4;
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f2314b = Arrays.copyOf(iArr, i3);
            this.f2315c = Arrays.copyOf(this.f2315c, i3);
        }
    }

    public final int b() {
        int iA;
        int i3 = this.f2316d;
        if (i3 != -1) {
            return i3;
        }
        int iB = 0;
        for (int i4 = 0; i4 < this.f2313a; i4++) {
            int i5 = this.f2314b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                iA = C0132n.A(((Long) this.f2315c[i4]).longValue(), i6);
            } else if (i7 == 1) {
                ((Long) this.f2315c[i4]).getClass();
                iA = C0132n.m(i6);
            } else if (i7 != 2) {
                if (i7 == 3) {
                    iB = ((j0) this.f2315c[i4]).b() + (C0132n.x(i6) * 2) + iB;
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(E.b());
                    }
                    ((Integer) this.f2315c[i4]).getClass();
                    iA = C0132n.l(i6);
                }
            } else {
                iA = C0132n.h(i6, (C0126h) this.f2315c[i4]);
            }
            iB = iA + iB;
        }
        this.f2316d = iB;
        return iB;
    }

    public final void c(int i3, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.f2313a + 1);
        int[] iArr = this.f2314b;
        int i4 = this.f2313a;
        iArr[i4] = i3;
        this.f2315c[i4] = obj;
        this.f2313a = i4 + 1;
    }

    public final void d(L l3) {
        if (this.f2313a == 0) {
            return;
        }
        l3.getClass();
        for (int i3 = 0; i3 < this.f2313a; i3++) {
            int i4 = this.f2314b[i3];
            Object obj = this.f2315c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                l3.j(((Long) obj).longValue(), i5);
            } else if (i6 == 1) {
                l3.f(((Long) obj).longValue(), i5);
            } else if (i6 == 2) {
                l3.b(i5, (C0126h) obj);
            } else if (i6 == 3) {
                C0132n c0132n = (C0132n) l3.f2235a;
                c0132n.R(i5, 3);
                ((j0) obj).d(l3);
                c0132n.R(i5, 4);
            } else {
                if (i6 != 5) {
                    throw new RuntimeException(E.b());
                }
                l3.e(i5, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        int i3 = this.f2313a;
        if (i3 == j0Var.f2313a) {
            int[] iArr = this.f2314b;
            int[] iArr2 = j0Var.f2314b;
            for (int i4 = 0; i4 < i3; i4++) {
                if (iArr[i4] == iArr2[i4]) {
                }
            }
            Object[] objArr = this.f2315c;
            Object[] objArr2 = j0Var.f2315c;
            int i5 = this.f2313a;
            for (int i6 = 0; i6 < i5; i6++) {
                if (objArr[i6].equals(objArr2[i6])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f2313a;
        int i4 = (527 + i3) * 31;
        int[] iArr = this.f2314b;
        int iHashCode = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i4 + i5) * 31;
        Object[] objArr = this.f2315c;
        int i8 = this.f2313a;
        for (int i9 = 0; i9 < i8; i9++) {
            iHashCode = (iHashCode * 31) + objArr[i9].hashCode();
        }
        return i7 + iHashCode;
    }
}
