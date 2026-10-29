package R2;

import java.util.Arrays;
import p013d1.AbstractC0540w;

/* JADX INFO: loaded from: classes.dex */
public final class s extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient byte[][] f1548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int[] f1549i;

    public s(byte[][] bArr, int[] iArr) {
        super(b.f1512g.f1513d);
        this.f1548h = bArr;
        this.f1549i = iArr;
    }

    @Override // R2.b
    public final int b() {
        return this.f1549i[this.f1548h.length - 1];
    }

    @Override // R2.b
    public final String c() {
        return new b(p()).c();
    }

    @Override // R2.b
    public final int d(byte[] bArr, int i3) {
        B2.h.e(bArr, "other");
        return new b(p()).d(bArr, i3);
    }

    @Override // R2.b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.b() == b() && j(0, bVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // R2.b
    public final byte[] f() {
        return p();
    }

    @Override // R2.b
    public final byte g(int i3) {
        byte[][] bArr = this.f1548h;
        int length = bArr.length - 1;
        int[] iArr = this.f1549i;
        AbstractC0540w.b(iArr[length], i3, 1L);
        int iE = S2.a.e(this, i3);
        return bArr[iE][(i3 - (iE == 0 ? 0 : iArr[iE - 1])) + iArr[bArr.length + iE]];
    }

    @Override // R2.b
    public final int h(byte[] bArr, int i3) {
        B2.h.e(bArr, "other");
        return new b(p()).h(bArr, i3);
    }

    @Override // R2.b
    public final int hashCode() {
        int i3 = this.e;
        if (i3 != 0) {
            return i3;
        }
        byte[][] bArr = this.f1548h;
        int length = bArr.length;
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f1549i;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            byte[] bArr2 = bArr[i4];
            int i9 = (i8 - i6) + i7;
            while (i7 < i9) {
                i5 = (i5 * 31) + bArr2[i7];
                i7++;
            }
            i4++;
            i6 = i8;
        }
        this.e = i5;
        return i5;
    }

    @Override // R2.b
    public final boolean j(int i3, b bVar, int i4) {
        B2.h.e(bVar, "other");
        if (i3 < 0 || i3 > b() - i4) {
            return false;
        }
        int i5 = i4 + i3;
        int iE = S2.a.e(this, i3);
        int i6 = 0;
        while (i3 < i5) {
            int[] iArr = this.f1549i;
            int i7 = iE == 0 ? 0 : iArr[iE - 1];
            int i8 = iArr[iE] - i7;
            byte[][] bArr = this.f1548h;
            int i9 = iArr[bArr.length + iE];
            int iMin = Math.min(i5, i8 + i7) - i3;
            if (!bVar.k(i6, bArr[iE], (i3 - i7) + i9, iMin)) {
                return false;
            }
            i6 += iMin;
            i3 += iMin;
            iE++;
        }
        return true;
    }

    @Override // R2.b
    public final boolean k(int i3, byte[] bArr, int i4, int i5) {
        B2.h.e(bArr, "other");
        if (i3 < 0 || i3 > b() - i5 || i4 < 0 || i4 > bArr.length - i5) {
            return false;
        }
        int i6 = i5 + i3;
        int iE = S2.a.e(this, i3);
        while (i3 < i6) {
            int[] iArr = this.f1549i;
            int i7 = iE == 0 ? 0 : iArr[iE - 1];
            int i8 = iArr[iE] - i7;
            byte[][] bArr2 = this.f1548h;
            int i9 = iArr[bArr2.length + iE];
            int iMin = Math.min(i6, i8 + i7) - i3;
            if (!AbstractC0540w.a((i3 - i7) + i9, i4, iMin, bArr2[iE], bArr)) {
                return false;
            }
            i4 += iMin;
            i3 += iMin;
            iE++;
        }
        return true;
    }

    @Override // R2.b
    public final b l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i3 + " < 0").toString());
        }
        if (i4 > b()) {
            throw new IllegalArgumentException(("endIndex=" + i4 + " > length(" + b() + ')').toString());
        }
        int i5 = i4 - i3;
        if (i5 < 0) {
            throw new IllegalArgumentException(A0.c.h("endIndex=", i4, " < beginIndex=", i3).toString());
        }
        if (i3 == 0 && i4 == b()) {
            return this;
        }
        if (i3 == i4) {
            return b.f1512g;
        }
        int iE = S2.a.e(this, i3);
        int iE2 = S2.a.e(this, i4 - 1);
        int i6 = iE2 + 1;
        byte[][] bArr = this.f1548h;
        B2.h.e(bArr, "<this>");
        p059r2.c.c(i6, bArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(bArr, iE, i6);
        B2.h.d(objArrCopyOfRange, "copyOfRange(...)");
        byte[][] bArr2 = (byte[][]) objArrCopyOfRange;
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f1549i;
        if (iE <= iE2) {
            int i7 = iE;
            int i8 = 0;
            while (true) {
                iArr[i8] = Math.min(iArr2[i7] - i3, i5);
                int i9 = i8 + 1;
                iArr[i8 + bArr2.length] = iArr2[bArr.length + i7];
                if (i7 == iE2) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = iE != 0 ? iArr2[iE - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i3 - i10) + iArr[length];
        return new s(bArr2, iArr);
    }

    @Override // R2.b
    public final void o(a aVar, int i3) {
        B2.h.e(aVar, "buffer");
        int iE = S2.a.e(this, 0);
        int i4 = 0;
        while (i4 < i3) {
            int[] iArr = this.f1549i;
            int i5 = iE == 0 ? 0 : iArr[iE - 1];
            int i6 = iArr[iE] - i5;
            byte[][] bArr = this.f1548h;
            int i7 = iArr[bArr.length + iE];
            int iMin = Math.min(i3, i6 + i5) - i4;
            int i8 = (i4 - i5) + i7;
            q qVar = new q(bArr[iE], i8, i8 + iMin, true);
            q qVar2 = aVar.f1511d;
            if (qVar2 == null) {
                qVar.f1544g = qVar;
                qVar.f1543f = qVar;
                aVar.f1511d = qVar;
            } else {
                q qVar3 = qVar2.f1544g;
                B2.h.b(qVar3);
                qVar3.b(qVar);
            }
            i4 += iMin;
            iE++;
        }
        aVar.e += (long) i3;
    }

    public final byte[] p() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f1548h;
        int length = bArr2.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int[] iArr = this.f1549i;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = i7 - i4;
            p059r2.c.a(i5, i6, i6 + i8, bArr2[i3], bArr);
            i5 += i8;
            i3++;
            i4 = i7;
        }
        return bArr;
    }

    @Override // R2.b
    public final String toString() {
        return new b(p()).toString();
    }
}
