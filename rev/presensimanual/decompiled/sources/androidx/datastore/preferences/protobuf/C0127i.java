package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0127i extends AbstractC0129k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f2299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2300d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2304i = Integer.MAX_VALUE;

    public C0127i(byte[] bArr, int i3, int i4, boolean z2) {
        this.f2299c = bArr;
        this.f2300d = i4 + i3;
        this.f2301f = i3;
        this.f2302g = i3;
    }

    public final long A() throws E {
        int i3 = this.f2301f;
        if (this.f2300d - i3 < 8) {
            throw E.e();
        }
        this.f2301f = i3 + 8;
        byte[] bArr = this.f2299c;
        return ((((long) bArr[i3 + 7]) & 255) << 56) | (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48);
    }

    public final int B() {
        int i3;
        int i4 = this.f2301f;
        int i5 = this.f2300d;
        if (i5 != i4) {
            int i6 = i4 + 1;
            byte[] bArr = this.f2299c;
            byte b3 = bArr[i4];
            if (b3 >= 0) {
                this.f2301f = i6;
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
                this.f2301f = i7;
                return i3;
            }
        }
        return (int) D();
    }

    public final long C() {
        long j3;
        long j4;
        long j5;
        long j6;
        int i3 = this.f2301f;
        int i4 = this.f2300d;
        if (i4 != i3) {
            int i5 = i3 + 1;
            byte[] bArr = this.f2299c;
            byte b3 = bArr[i3];
            if (b3 >= 0) {
                this.f2301f = i5;
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
                this.f2301f = i6;
                return j3;
            }
        }
        return D();
    }

    public final long D() throws E {
        long j3 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            int i4 = this.f2301f;
            if (i4 == this.f2300d) {
                throw E.e();
            }
            this.f2301f = i4 + 1;
            byte b3 = this.f2299c[i4];
            j3 |= ((long) (b3 & 127)) << i3;
            if ((b3 & 128) == 0) {
                return j3;
            }
        }
        throw E.c();
    }

    public final void E() {
        int i3 = this.f2300d + this.e;
        this.f2300d = i3;
        int i4 = i3 - this.f2302g;
        int i5 = this.f2304i;
        if (i4 <= i5) {
            this.e = 0;
            return;
        }
        int i6 = i4 - i5;
        this.e = i6;
        this.f2300d = i3 - i6;
    }

    public final void F(int i3) throws E {
        if (i3 >= 0) {
            int i4 = this.f2300d;
            int i5 = this.f2301f;
            if (i3 <= i4 - i5) {
                this.f2301f = i5 + i3;
                return;
            }
        }
        if (i3 >= 0) {
            throw E.e();
        }
        throw E.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final void a(int i3) throws E {
        if (this.f2303h != i3) {
            throw new E("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int b() {
        return this.f2301f - this.f2302g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final boolean c() {
        return this.f2301f == this.f2300d;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final void d(int i3) {
        this.f2304i = i3;
        E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int e(int i3) throws E {
        if (i3 < 0) {
            throw E.d();
        }
        int iB = b() + i3;
        if (iB < 0) {
            throw new E("Failed to parse the message.");
        }
        int i4 = this.f2304i;
        if (iB > i4) {
            throw E.e();
        }
        this.f2304i = iB;
        E();
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final boolean f() {
        return C() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final C0126h g() throws E {
        byte[] bArrCopyOfRange;
        int iB = B();
        byte[] bArr = this.f2299c;
        if (iB > 0) {
            int i3 = this.f2300d;
            int i4 = this.f2301f;
            if (iB <= i3 - i4) {
                C0126h c0126hE = C0126h.e(bArr, i4, iB);
                this.f2301f += iB;
                return c0126hE;
            }
        }
        if (iB == 0) {
            return C0126h.f2295f;
        }
        if (iB > 0) {
            int i5 = this.f2300d;
            int i6 = this.f2301f;
            if (iB <= i5 - i6) {
                int i7 = iB + i6;
                this.f2301f = i7;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i6, i7);
            } else {
                if (iB <= 0) {
                    throw E.e();
                }
                if (iB == 0) {
                    throw E.d();
                }
                bArrCopyOfRange = C.f2219b;
            }
        } else {
            if (iB <= 0) {
                throw E.e();
            }
            if (iB == 0) {
                throw E.d();
            }
            bArrCopyOfRange = C.f2219b;
        }
        C0126h c0126h = C0126h.f2295f;
        return new C0126h(bArrCopyOfRange);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final double h() {
        return Double.longBitsToDouble(A());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int i() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int j() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long k() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final float l() {
        return Float.intBitsToFloat(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int m() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long n() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int o() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long p() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int q() {
        int iB = B();
        return (-(iB & 1)) ^ (iB >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long r() {
        long jC = C();
        return (-(jC & 1)) ^ (jC >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final String s() throws E {
        int iB = B();
        if (iB > 0) {
            int i3 = this.f2300d;
            int i4 = this.f2301f;
            if (iB <= i3 - i4) {
                String str = new String(this.f2299c, i4, iB, C.f2218a);
                this.f2301f += iB;
                return str;
            }
        }
        if (iB == 0) {
            return "";
        }
        if (iB < 0) {
            throw E.d();
        }
        throw E.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final String t() throws E {
        int iB = B();
        if (iB > 0) {
            int i3 = this.f2300d;
            int i4 = this.f2301f;
            if (iB <= i3 - i4) {
                String strA = s0.f2343a.a(this.f2299c, i4, iB);
                this.f2301f += iB;
                return strA;
            }
        }
        if (iB == 0) {
            return "";
        }
        if (iB <= 0) {
            throw E.d();
        }
        throw E.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int u() throws E {
        if (c()) {
            this.f2303h = 0;
            return 0;
        }
        int iB = B();
        this.f2303h = iB;
        if ((iB >>> 3) != 0) {
            return iB;
        }
        throw new E("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final int v() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final long w() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0129k
    public final boolean x(int i3) throws E {
        int i4 = i3 & 7;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 == 1) {
                F(8);
                return true;
            }
            if (i4 == 2) {
                F(B());
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
            F(4);
            return true;
        }
        int i6 = this.f2300d - this.f2301f;
        byte[] bArr = this.f2299c;
        if (i6 >= 10) {
            while (i5 < 10) {
                int i7 = this.f2301f;
                this.f2301f = i7 + 1;
                if (bArr[i7] < 0) {
                    i5++;
                }
            }
            throw E.c();
        }
        while (i5 < 10) {
            int i8 = this.f2301f;
            if (i8 == this.f2300d) {
                throw E.e();
            }
            this.f2301f = i8 + 1;
            if (bArr[i8] < 0) {
                i5++;
            }
        }
        throw E.c();
        return true;
    }

    public final int z() throws E {
        int i3 = this.f2301f;
        if (this.f2300d - i3 < 4) {
            throw E.e();
        }
        this.f2301f = i3 + 4;
        byte[] bArr = this.f2299c;
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }
}
