package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128j extends AbstractC0129k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f2305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f2306d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2311j = Integer.MAX_VALUE;

    public C0128j(InputStream inputStream) {
        Charset charset = C.f2218a;
        this.f2305c = inputStream;
        this.f2306d = new byte[4096];
        this.e = 0;
        this.f2308g = 0;
        this.f2310i = 0;
    }

    public final byte[] A(int i3) throws IOException {
        if (i3 == 0) {
            return C.f2219b;
        }
        if (i3 < 0) {
            throw E.d();
        }
        int i4 = this.f2310i;
        int i5 = this.f2308g;
        int i6 = i4 + i5 + i3;
        if (i6 - Integer.MAX_VALUE > 0) {
            throw new E("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i7 = this.f2311j;
        if (i6 > i7) {
            J((i7 - i4) - i5);
            throw E.e();
        }
        int i8 = this.e - i5;
        int i9 = i3 - i8;
        InputStream inputStream = this.f2305c;
        if (i9 >= 4096) {
            try {
                if (i9 > inputStream.available()) {
                    return null;
                }
            } catch (E e) {
                e.f2220d = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2306d, this.f2308g, bArr, 0, i8);
        this.f2310i += this.e;
        this.f2308g = 0;
        this.e = 0;
        while (i8 < i3) {
            try {
                int i10 = inputStream.read(bArr, i8, i3 - i8);
                if (i10 == -1) {
                    throw E.e();
                }
                this.f2310i += i10;
                i8 += i10;
            } catch (E e3) {
                e3.f2220d = true;
                throw e3;
            }
        }
        return bArr;
    }

    public final ArrayList B(int i3) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i3 > 0) {
            int iMin = Math.min(i3, 4096);
            byte[] bArr = new byte[iMin];
            int i4 = 0;
            while (i4 < iMin) {
                int i5 = this.f2305c.read(bArr, i4, iMin - i4);
                if (i5 == -1) {
                    throw E.e();
                }
                this.f2310i += i5;
                i4 += i5;
            }
            i3 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int C() throws E {
        int i3 = this.f2308g;
        if (this.e - i3 < 4) {
            I(4);
            i3 = this.f2308g;
        }
        this.f2308g = i3 + 4;
        byte[] bArr = this.f2306d;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public final long D() throws E {
        int i3 = this.f2308g;
        if (this.e - i3 < 8) {
            I(8);
            i3 = this.f2308g;
        }
        this.f2308g = i3 + 8;
        byte[] bArr = this.f2306d;
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    public final int E() {
        int i3;
        int i4 = this.f2308g;
        int i5 = this.e;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f2306d;
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                this.f2308g = i6;
                return b3;
            }
            if (i5 - i6 >= 9) {
                int i7 = i4 + 2;
                int i8 = (bArr[i6] << 7) ^ b3;
                if (i8 < 0) {
                    i3 = i8 ^ (-128);
                } else {
                    int i9 = i4 + 3;
                    int i10 = (bArr[i7] << 14) ^ i8;
                    if (i10 >= 0) {
                        i3 = i10 ^ 16256;
                    } else {
                        int i11 = i4 + 4;
                        int i12 = i10 ^ (bArr[i9] << 21);
                        if (i12 < 0) {
                            i3 = (-2080896) ^ i12;
                        } else {
                            i9 = i4 + 5;
                            byte b4 = bArr[i11];
                            int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                            if (b4 < 0) {
                                i11 = i4 + 6;
                                if (bArr[i9] < 0) {
                                    i9 = i4 + 7;
                                    if (bArr[i11] < 0) {
                                        i11 = i4 + 8;
                                        if (bArr[i9] < 0) {
                                            i9 = i4 + 9;
                                            if (bArr[i11] < 0) {
                                                int i14 = i4 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i7 = i14;
                                                    i3 = i13;
                                                }
                                            }
                                        }
                                    }
                                }
                                i3 = i13;
                            }
                            i3 = i13;
                        }
                        i7 = i11;
                    }
                    i7 = i9;
                }
                this.f2308g = i7;
                return i3;
            }
        }
        return (int) G();
    }

    public final long F() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f2308g;
        int i4 = this.e;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2306d;
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                this.f2308g = i5;
                return b3;
            }
            if (i4 - i5 >= 9) {
                int i6 = i3 + 2;
                int i7 = (bArr[i5] << 7) ^ b3;
                if (i7 < 0) {
                    j3 = i7 ^ (-128);
                } else {
                    int i8 = i3 + 3;
                    int i9 = (bArr[i6] << 14) ^ i7;
                    if (i9 >= 0) {
                        j3 = i9 ^ 16256;
                        i6 = i8;
                    } else {
                        int i10 = i3 + 4;
                        int i11 = i9 ^ (bArr[i8] << 21);
                        if (i11 < 0) {
                            j6 = (-2080896) ^ i11;
                        } else {
                            long j7 = i11;
                            i6 = i3 + 5;
                            long j8 = j7 ^ (((long) bArr[i10]) << 28);
                            if (j8 >= 0) {
                                j5 = 266354560;
                            } else {
                                i10 = i3 + 6;
                                long j9 = j8 ^ (((long) bArr[i6]) << 35);
                                if (j9 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i6 = i3 + 7;
                                    j8 = j9 ^ (((long) bArr[i10]) << 42);
                                    if (j8 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i10 = i3 + 8;
                                        j9 = j8 ^ (((long) bArr[i6]) << 49);
                                        if (j9 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i6 = i3 + 9;
                                            long j10 = (j9 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                int i12 = i3 + 10;
                                                if (bArr[i6] >= 0) {
                                                    i6 = i12;
                                                }
                                            }
                                            j3 = j10;
                                        }
                                    }
                                }
                                j6 = j4 ^ j9;
                            }
                            j3 = j5 ^ j8;
                        }
                        i6 = i10;
                        j3 = j6;
                    }
                }
                this.f2308g = i6;
                return j3;
            }
        }
        return G();
    }

    public final long G() throws E {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            if (this.f2308g == this.e) {
                I(1);
            }
            int i4 = this.f2308g;
            this.f2308g = i4 + 1;
            byte b3 = this.f2306d[i4];
            j3 |= ((long) (b3 & 127)) << i3;
            if ((b3 & 128) == 0) {
                return j3;
            }
        }
        throw E.c();
    }

    public final void H() {
        int i3 = this.e + this.f2307f;
        this.e = i3;
        int i4 = this.f2310i + i3;
        int i5 = this.f2311j;
        if (i4 <= i5) {
            this.f2307f = 0;
            return;
        }
        int i6 = i4 - i5;
        this.f2307f = i6;
        this.e = i3 - i6;
    }

    public final void I(int i3) throws E {
        if (K(i3)) {
            return;
        }
        if (i3 <= (Integer.MAX_VALUE - this.f2310i) - this.f2308g) {
            throw E.e();
        }
        throw new E("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void J(int i3) throws E {
        int i4 = this.e;
        int i5 = this.f2308g;
        if (i3 <= i4 - i5 && i3 >= 0) {
            this.f2308g = i5 + i3;
            return;
        }
        InputStream inputStream = this.f2305c;
        if (i3 < 0) {
            throw E.d();
        }
        int i6 = this.f2310i;
        int i7 = i6 + i5;
        int i8 = i7 + i3;
        int i9 = this.f2311j;
        if (i8 > i9) {
            J((i9 - i6) - i5);
            throw E.e();
        }
        this.f2310i = i7;
        int i10 = i4 - i5;
        this.e = 0;
        this.f2308g = 0;
        while (i10 < i3) {
            long j3 = i3 - i10;
            try {
                try {
                    long jSkip = inputStream.skip(j3);
                    if (jSkip < 0 || jSkip > j3) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i10 += (int) jSkip;
                    }
                } catch (E e) {
                    e.f2220d = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.f2310i += i10;
                H();
                throw th;
            }
        }
        this.f2310i += i10;
        H();
        if (i10 >= i3) {
            return;
        }
        int i11 = this.e;
        int i12 = i11 - this.f2308g;
        this.f2308g = i11;
        I(1);
        while (true) {
            int i13 = i3 - i12;
            int i14 = this.e;
            if (i13 <= i14) {
                this.f2308g = i13;
                return;
            } else {
                i12 += i14;
                this.f2308g = i14;
                I(1);
            }
        }
    }

    public final boolean K(int i3) throws IOException {
        int i4 = this.f2308g;
        int i5 = i4 + i3;
        int i6 = this.e;
        if (i5 <= i6) {
            throw new IllegalStateException("refillBuffer() called when " + i3 + " bytes were already available in buffer");
        }
        int i7 = this.f2310i;
        if (i3 > (Integer.MAX_VALUE - i7) - i4 || i7 + i4 + i3 > this.f2311j) {
            return false;
        }
        byte[] bArr = this.f2306d;
        if (i4 > 0) {
            if (i6 > i4) {
                System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
            }
            this.f2310i += i4;
            this.e -= i4;
            this.f2308g = 0;
        }
        int i8 = this.e;
        int iMin = Math.min(bArr.length - i8, (Integer.MAX_VALUE - this.f2310i) - i8);
        InputStream inputStream = this.f2305c;
        try {
            int i9 = inputStream.read(bArr, i8, iMin);
            if (i9 == 0 || i9 < -1 || i9 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i9 + "\nThe InputStream implementation is buggy.");
            }
            if (i9 <= 0) {
                return false;
            }
            this.e += i9;
            H();
            if (this.e >= i3) {
                return true;
            }
            return K(i3);
        } catch (E e) {
            e.f2220d = true;
            throw e;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final void a(int i3) throws E {
        if (this.f2309h != i3) {
            throw new E("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int b() {
        return this.f2310i + this.f2308g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final boolean c() {
        return this.f2308g == this.e && !K(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final void d(int i3) {
        this.f2311j = i3;
        H();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int e(int i3) throws E {
        if (i3 < 0) {
            throw E.d();
        }
        int i4 = this.f2310i + this.f2308g + i3;
        if (i4 < 0) {
            throw new E("Failed to parse the message.");
        }
        int i5 = this.f2311j;
        if (i4 > i5) {
            throw E.e();
        }
        this.f2311j = i4;
        H();
        return i5;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final boolean f() {
        return F() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final C0126h g() throws IOException {
        int iE = E();
        int i3 = this.e;
        int i4 = this.f2308g;
        int i5 = i3 - i4;
        byte[] bArr = this.f2306d;
        if (iE <= i5 && iE > 0) {
            C0126h c0126hE = C0126h.e(bArr, i4, iE);
            this.f2308g += iE;
            return c0126hE;
        }
        if (iE == 0) {
            return C0126h.f2295f;
        }
        if (iE < 0) {
            throw E.d();
        }
        byte[] bArrA = A(iE);
        if (bArrA != null) {
            return C0126h.e(bArrA, 0, bArrA.length);
        }
        int i6 = this.f2308g;
        int i7 = this.e;
        int length = i7 - i6;
        this.f2310i += i7;
        this.f2308g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListB = B(iE - length);
        byte[] bArr2 = new byte[iE];
        System.arraycopy(bArr, i6, bArr2, 0, length);
        for (byte[] bArr3 : arrayListB) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0126h c0126h = C0126h.f2295f;
        return new C0126h(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final double h() {
        return Double.longBitsToDouble(D());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int i() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int j() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long k() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final float l() {
        return Float.intBitsToFloat(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int m() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long n() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int o() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long p() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int q() {
        int iE = E();
        return (-(iE & 1)) ^ (iE >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long r() {
        long jF = F();
        return (-(jF & 1)) ^ (jF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final String s() throws E {
        int iE = E();
        byte[] bArr = this.f2306d;
        if (iE > 0) {
            int i3 = this.e;
            int i4 = this.f2308g;
            if (iE <= i3 - i4) {
                String str = new String(bArr, i4, iE, C.f2218a);
                this.f2308g += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw E.d();
        }
        if (iE > this.e) {
            return new String(z(iE), C.f2218a);
        }
        I(iE);
        String str2 = new String(bArr, this.f2308g, iE, C.f2218a);
        this.f2308g += iE;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final String t() throws IOException {
        int iE = E();
        int i3 = this.f2308g;
        int i4 = this.e;
        int i5 = i4 - i3;
        byte[] bArrZ = this.f2306d;
        if (iE <= i5 && iE > 0) {
            this.f2308g = i3 + iE;
        } else {
            if (iE == 0) {
                return "";
            }
            if (iE < 0) {
                throw E.d();
            }
            i3 = 0;
            if (iE <= i4) {
                I(iE);
                this.f2308g = iE;
            } else {
                bArrZ = z(iE);
            }
        }
        return s0.f2343a.a(bArrZ, i3, iE);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int u() throws E {
        if (c()) {
            this.f2309h = 0;
            return 0;
        }
        int iE = E();
        this.f2309h = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw new E("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int v() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long w() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final boolean x(int i3) throws E {
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                J(8);
                return true;
            }
            if (i4 == 2) {
                J(E());
                return true;
            }
            if (i4 == 3) {
                y();
                a(((i3 >>> 3) << 3) | 4);
                return true;
            }
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw E.b();
            }
            J(4);
            return true;
        }
        int i6 = this.e - this.f2308g;
        byte[] bArr = this.f2306d;
        if (i6 >= 10) {
            while (i5 < 10) {
                int i7 = this.f2308g;
                this.f2308g = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw E.c();
        }
        while (i5 < 10) {
            if (this.f2308g == this.e) {
                I(1);
            }
            int i8 = this.f2308g;
            this.f2308g = i8 + 1;
            if (bArr[i8] < 0) {
                i5++;
            }
        }
        throw E.c();
        return true;
    }

    public final byte[] z(int i3) throws IOException {
        byte[] bArrA = A(i3);
        if (bArrA != null) {
            return bArrA;
        }
        int i4 = this.f2308g;
        int i5 = this.e;
        int length = i5 - i4;
        this.f2310i += i5;
        this.f2308g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListB = B(i3 - length);
        byte[] bArr = new byte[i3];
        System.arraycopy(this.f2306d, i4, bArr, 0, length);
        for (byte[] bArr2 : arrayListB) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }
}
