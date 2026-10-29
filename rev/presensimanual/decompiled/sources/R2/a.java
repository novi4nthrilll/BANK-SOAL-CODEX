package R2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import p013d1.AbstractC0540w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements t, ReadableByteChannel, Closeable, Flushable, WritableByteChannel, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f1511d;
    public long e;

    public final byte a(long j3) {
        AbstractC0540w.b(this.e, j3, 1L);
        q qVar = this.f1511d;
        if (qVar == null) {
            B2.h.b(null);
            throw null;
        }
        long j4 = this.e;
        if (j4 - j3 < j3) {
            while (j4 > j3) {
                qVar = qVar.f1544g;
                B2.h.b(qVar);
                j4 -= (long) (qVar.f1541c - qVar.f1540b);
            }
            return qVar.f1539a[(int) ((((long) qVar.f1540b) + j3) - j4)];
        }
        long j5 = 0;
        while (true) {
            int i3 = qVar.f1541c;
            int i4 = qVar.f1540b;
            long j6 = ((long) (i3 - i4)) + j5;
            if (j6 > j3) {
                return qVar.f1539a[(int) ((((long) i4) + j3) - j5)];
            }
            qVar = qVar.f1543f;
            B2.h.b(qVar);
            j5 = j6;
        }
    }

    public final long b(b bVar) {
        int i3;
        int i4;
        B2.h.e(bVar, "targetBytes");
        q qVar = this.f1511d;
        if (qVar == null) {
            return -1L;
        }
        long j3 = this.e;
        byte[] bArr = bVar.f1513d;
        long j4 = 0;
        if (j3 < 0) {
            while (j3 > 0) {
                qVar = qVar.f1544g;
                B2.h.b(qVar);
                j3 -= (long) (qVar.f1541c - qVar.f1540b);
            }
            if (bArr.length == 2) {
                byte b3 = bArr[0];
                byte b4 = bArr[1];
                while (j3 < this.e) {
                    i3 = (int) ((((long) qVar.f1540b) + j4) - j3);
                    int i5 = qVar.f1541c;
                    while (true) {
                        if (i3 >= i5) {
                            j4 = j3 + ((long) (qVar.f1541c - qVar.f1540b));
                            qVar = qVar.f1543f;
                            B2.h.b(qVar);
                            j3 = j4;
                        } else {
                            byte b5 = qVar.f1539a[i3];
                            if (b5 == b3 || b5 == b4) {
                                i4 = qVar.f1540b;
                            } else {
                                i3++;
                            }
                        }
                    }
                }
                return -1L;
            }
            while (j3 < this.e) {
                i3 = (int) ((((long) qVar.f1540b) + j4) - j3);
                int i6 = qVar.f1541c;
                while (true) {
                    if (i3 < i6) {
                        byte b6 = qVar.f1539a[i3];
                        int length = bArr.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                i3++;
                            } else if (b6 == bArr[i7]) {
                                i4 = qVar.f1540b;
                            } else {
                                i7++;
                            }
                        }
                    } else {
                        j4 = j3 + ((long) (qVar.f1541c - qVar.f1540b));
                        qVar = qVar.f1543f;
                        B2.h.b(qVar);
                        j3 = j4;
                    }
                }
            }
            return -1L;
        }
        j3 = 0;
        while (true) {
            long j5 = ((long) (qVar.f1541c - qVar.f1540b)) + j3;
            if (j5 > 0) {
                break;
            }
            qVar = qVar.f1543f;
            B2.h.b(qVar);
            j3 = j5;
        }
        if (bArr.length == 2) {
            byte b7 = bArr[0];
            byte b8 = bArr[1];
            while (j3 < this.e) {
                i3 = (int) ((((long) qVar.f1540b) + j4) - j3);
                int i8 = qVar.f1541c;
                while (true) {
                    if (i3 >= i8) {
                        j4 = j3 + ((long) (qVar.f1541c - qVar.f1540b));
                        qVar = qVar.f1543f;
                        B2.h.b(qVar);
                        j3 = j4;
                    } else {
                        byte b9 = qVar.f1539a[i3];
                        if (b9 == b7 || b9 == b8) {
                            i4 = qVar.f1540b;
                        } else {
                            i3++;
                        }
                    }
                }
            }
            return -1L;
        }
        while (j3 < this.e) {
            i3 = (int) ((((long) qVar.f1540b) + j4) - j3);
            int i9 = qVar.f1541c;
            while (true) {
                if (i3 < i9) {
                    byte b10 = qVar.f1539a[i3];
                    int length2 = bArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            i3++;
                        } else if (b10 == bArr[i10]) {
                            i4 = qVar.f1540b;
                        } else {
                            i10++;
                        }
                    }
                } else {
                    j4 = j3 + ((long) (qVar.f1541c - qVar.f1540b));
                    qVar = qVar.f1543f;
                    B2.h.b(qVar);
                    j3 = j4;
                }
            }
        }
        return -1L;
        return ((long) (i3 - i4)) + j3;
    }

    public final boolean c(b bVar) {
        B2.h.e(bVar, "bytes");
        byte[] bArr = bVar.f1513d;
        int length = bArr.length;
        if (length < 0 || this.e < length || bArr.length < length) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (a(i3) != bArr[i3]) {
                return false;
            }
        }
        return true;
    }

    public final Object clone() {
        a aVar = new a();
        if (this.e != 0) {
            q qVar = this.f1511d;
            B2.h.b(qVar);
            q qVarC = qVar.c();
            aVar.f1511d = qVarC;
            qVarC.f1544g = qVarC;
            qVarC.f1543f = qVarC;
            for (q qVar2 = qVar.f1543f; qVar2 != qVar; qVar2 = qVar2.f1543f) {
                q qVar3 = qVarC.f1544g;
                B2.h.b(qVar3);
                B2.h.b(qVar2);
                qVar3.b(qVar2.c());
            }
            aVar.e = this.e;
        }
        return aVar;
    }

    public final byte d() throws EOFException {
        if (this.e == 0) {
            throw new EOFException();
        }
        q qVar = this.f1511d;
        B2.h.b(qVar);
        int i3 = qVar.f1540b;
        int i4 = qVar.f1541c;
        int i5 = i3 + 1;
        byte b3 = qVar.f1539a[i3];
        this.e--;
        if (i5 == i4) {
            this.f1511d = qVar.a();
            r.a(qVar);
        } else {
            qVar.f1540b = i5;
        }
        return b3;
    }

    @Override // R2.t
    public final long e(a aVar, long j3) {
        B2.h.e(aVar, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        long j4 = this.e;
        if (j4 == 0) {
            return -1L;
        }
        if (j3 > j4) {
            j3 = j4;
        }
        aVar.l(this, j3);
        return j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                long j3 = this.e;
                a aVar = (a) obj;
                if (j3 == aVar.e) {
                    if (j3 != 0) {
                        q qVar = this.f1511d;
                        B2.h.b(qVar);
                        q qVar2 = aVar.f1511d;
                        B2.h.b(qVar2);
                        int i3 = qVar.f1540b;
                        int i4 = qVar2.f1540b;
                        long j4 = 0;
                        while (j4 < this.e) {
                            long jMin = Math.min(qVar.f1541c - i3, qVar2.f1541c - i4);
                            long j5 = 0;
                            while (j5 < jMin) {
                                int i5 = i3 + 1;
                                byte b3 = qVar.f1539a[i3];
                                int i6 = i4 + 1;
                                if (b3 == qVar2.f1539a[i4]) {
                                    j5++;
                                    i4 = i6;
                                    i3 = i5;
                                }
                            }
                            if (i3 == qVar.f1541c) {
                                q qVar3 = qVar.f1543f;
                                B2.h.b(qVar3);
                                i3 = qVar3.f1540b;
                                qVar = qVar3;
                            }
                            if (i4 == qVar2.f1541c) {
                                qVar2 = qVar2.f1543f;
                                B2.h.b(qVar2);
                                i4 = qVar2.f1540b;
                            }
                            j4 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final byte[] f(long j3) throws EOFException {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.e < j3) {
            throw new EOFException();
        }
        int i3 = (int) j3;
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = read(bArr, i4, i3 - i4);
            if (i5 == -1) {
                throw new EOFException();
            }
            i4 += i5;
        }
        return bArr;
    }

    public final b g(long j3) throws EOFException {
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (this.e < j3) {
            throw new EOFException();
        }
        if (j3 < 4096) {
            return new b(f(j3));
        }
        b bVarJ = j((int) j3);
        i(j3);
        return bVarJ;
    }

    public final int h() throws EOFException {
        if (this.e < 4) {
            throw new EOFException();
        }
        q qVar = this.f1511d;
        B2.h.b(qVar);
        int i3 = qVar.f1540b;
        int i4 = qVar.f1541c;
        if (i4 - i3 < 4) {
            return ((d() & 255) << 24) | ((d() & 255) << 16) | ((d() & 255) << 8) | (d() & 255);
        }
        byte[] bArr = qVar.f1539a;
        int i5 = i3 + 3;
        int i6 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8);
        int i7 = i3 + 4;
        int i8 = i6 | (bArr[i5] & 255);
        this.e -= 4;
        if (i7 == i4) {
            this.f1511d = qVar.a();
            r.a(qVar);
        } else {
            qVar.f1540b = i7;
        }
        return i8;
    }

    public final int hashCode() {
        q qVar = this.f1511d;
        if (qVar == null) {
            return 0;
        }
        int i3 = 1;
        do {
            int i4 = qVar.f1541c;
            for (int i5 = qVar.f1540b; i5 < i4; i5++) {
                i3 = (i3 * 31) + qVar.f1539a[i5];
            }
            qVar = qVar.f1543f;
            B2.h.b(qVar);
        } while (qVar != this.f1511d);
        return i3;
    }

    public final void i(long j3) throws EOFException {
        while (j3 > 0) {
            q qVar = this.f1511d;
            if (qVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j3, qVar.f1541c - qVar.f1540b);
            long j4 = iMin;
            this.e -= j4;
            j3 -= j4;
            int i3 = qVar.f1540b + iMin;
            qVar.f1540b = i3;
            if (i3 == qVar.f1541c) {
                this.f1511d = qVar.a();
                r.a(qVar);
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final b j(int i3) {
        if (i3 == 0) {
            return b.f1512g;
        }
        AbstractC0540w.b(this.e, 0L, i3);
        q qVar = this.f1511d;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            B2.h.b(qVar);
            int i7 = qVar.f1541c;
            int i8 = qVar.f1540b;
            if (i7 == i8) {
                throw new AssertionError("s.limit == s.pos");
            }
            i5 += i7 - i8;
            i6++;
            qVar = qVar.f1543f;
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        q qVar2 = this.f1511d;
        int i9 = 0;
        while (i4 < i3) {
            B2.h.b(qVar2);
            bArr[i9] = qVar2.f1539a;
            i4 += qVar2.f1541c - qVar2.f1540b;
            iArr[i9] = Math.min(i4, i3);
            iArr[i9 + i6] = qVar2.f1540b;
            qVar2.f1542d = true;
            i9++;
            qVar2 = qVar2.f1543f;
        }
        return new s(bArr, iArr);
    }

    public final q k(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        q qVar = this.f1511d;
        if (qVar == null) {
            q qVarB = r.b();
            this.f1511d = qVarB;
            qVarB.f1544g = qVarB;
            qVarB.f1543f = qVarB;
            return qVarB;
        }
        q qVar2 = qVar.f1544g;
        B2.h.b(qVar2);
        if (qVar2.f1541c + i3 <= 8192 && qVar2.e) {
            return qVar2;
        }
        q qVarB2 = r.b();
        qVar2.b(qVarB2);
        return qVarB2;
    }

    public final void l(a aVar, long j3) {
        q qVarB;
        B2.h.e(aVar, "source");
        if (aVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0540w.b(aVar.e, 0L, j3);
        while (j3 > 0) {
            q qVar = aVar.f1511d;
            B2.h.b(qVar);
            int i3 = qVar.f1541c;
            q qVar2 = aVar.f1511d;
            B2.h.b(qVar2);
            int i4 = 0;
            if (j3 < i3 - qVar2.f1540b) {
                q qVar3 = this.f1511d;
                q qVar4 = qVar3 != null ? qVar3.f1544g : null;
                if (qVar4 != null && qVar4.e) {
                    if ((((long) qVar4.f1541c) + j3) - ((long) (qVar4.f1542d ? 0 : qVar4.f1540b)) <= 8192) {
                        q qVar5 = aVar.f1511d;
                        B2.h.b(qVar5);
                        qVar5.d(qVar4, (int) j3);
                        aVar.e -= j3;
                        this.e += j3;
                        return;
                    }
                }
                q qVar6 = aVar.f1511d;
                B2.h.b(qVar6);
                int i5 = (int) j3;
                if (i5 <= 0 || i5 > qVar6.f1541c - qVar6.f1540b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i5 >= 1024) {
                    qVarB = qVar6.c();
                } else {
                    qVarB = r.b();
                    int i6 = qVar6.f1540b;
                    p059r2.c.a(0, i6, i6 + i5, qVar6.f1539a, qVarB.f1539a);
                }
                qVarB.f1541c = qVarB.f1540b + i5;
                qVar6.f1540b += i5;
                q qVar7 = qVar6.f1544g;
                B2.h.b(qVar7);
                qVar7.b(qVarB);
                aVar.f1511d = qVarB;
            }
            q qVar8 = aVar.f1511d;
            B2.h.b(qVar8);
            long j4 = qVar8.f1541c - qVar8.f1540b;
            aVar.f1511d = qVar8.a();
            q qVar9 = this.f1511d;
            if (qVar9 == null) {
                this.f1511d = qVar8;
                qVar8.f1544g = qVar8;
                qVar8.f1543f = qVar8;
            } else {
                q qVar10 = qVar9.f1544g;
                B2.h.b(qVar10);
                qVar10.b(qVar8);
                q qVar11 = qVar8.f1544g;
                if (qVar11 == qVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                B2.h.b(qVar11);
                if (qVar11.e) {
                    int i7 = qVar8.f1541c - qVar8.f1540b;
                    q qVar12 = qVar8.f1544g;
                    B2.h.b(qVar12);
                    int i8 = 8192 - qVar12.f1541c;
                    q qVar13 = qVar8.f1544g;
                    B2.h.b(qVar13);
                    if (!qVar13.f1542d) {
                        q qVar14 = qVar8.f1544g;
                        B2.h.b(qVar14);
                        i4 = qVar14.f1540b;
                    }
                    if (i7 <= i8 + i4) {
                        q qVar15 = qVar8.f1544g;
                        B2.h.b(qVar15);
                        qVar8.d(qVar15, i7);
                        qVar8.a();
                        r.a(qVar8);
                    }
                }
            }
            aVar.e -= j4;
            this.e += j4;
            j3 -= j4;
        }
    }

    public final void m(b bVar) {
        B2.h.e(bVar, "byteString");
        bVar.o(this, bVar.b());
    }

    public final void n(byte[] bArr, int i3, int i4) {
        B2.h.e(bArr, "source");
        long j3 = i4;
        AbstractC0540w.b(bArr.length, i3, j3);
        int i5 = i4 + i3;
        while (i3 < i5) {
            q qVarK = k(1);
            int iMin = Math.min(i5 - i3, 8192 - qVarK.f1541c);
            int i6 = i3 + iMin;
            p059r2.c.a(qVarK.f1541c, i3, i6, bArr, qVarK.f1539a);
            qVarK.f1541c += iMin;
            i3 = i6;
        }
        this.e += j3;
    }

    public final void o(int i3) {
        q qVarK = k(1);
        int i4 = qVarK.f1541c;
        qVarK.f1541c = i4 + 1;
        qVarK.f1539a[i4] = (byte) i3;
        this.e++;
    }

    public final void p(String str) {
        char cCharAt;
        B2.h.e(str, "string");
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + length + " < 0").toString());
        }
        if (length > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + length + " > " + str.length()).toString());
        }
        int i3 = 0;
        while (i3 < length) {
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 128) {
                q qVarK = k(1);
                int i4 = qVarK.f1541c - i3;
                int iMin = Math.min(length, 8192 - i4);
                int i5 = i3 + 1;
                byte[] bArr = qVarK.f1539a;
                bArr[i3 + i4] = (byte) cCharAt2;
                while (true) {
                    i3 = i5;
                    if (i3 >= iMin || (cCharAt = str.charAt(i3)) >= 128) {
                        break;
                    }
                    i5 = i3 + 1;
                    bArr[i3 + i4] = (byte) cCharAt;
                }
                int i6 = qVarK.f1541c;
                int i7 = (i4 + i3) - i6;
                qVarK.f1541c = i6 + i7;
                this.e += (long) i7;
            } else {
                if (cCharAt2 < 2048) {
                    q qVarK2 = k(2);
                    int i8 = qVarK2.f1541c;
                    byte[] bArr2 = qVarK2.f1539a;
                    bArr2[i8] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    qVarK2.f1541c = i8 + 2;
                    this.e += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    q qVarK3 = k(3);
                    int i9 = qVarK3.f1541c;
                    byte[] bArr3 = qVarK3.f1539a;
                    bArr3[i9] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    qVarK3.f1541c = i9 + 3;
                    this.e += 3;
                } else {
                    int i10 = i3 + 1;
                    char cCharAt3 = i10 < length ? str.charAt(i10) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        o(63);
                        i3 = i10;
                    } else {
                        int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        q qVarK4 = k(4);
                        int i12 = qVarK4.f1541c;
                        byte[] bArr4 = qVarK4.f1539a;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        qVarK4.f1541c = i12 + 4;
                        this.e += 4;
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        B2.h.e(byteBuffer, "sink");
        q qVar = this.f1511d;
        if (qVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), qVar.f1541c - qVar.f1540b);
        byteBuffer.put(qVar.f1539a, qVar.f1540b, iMin);
        int i3 = qVar.f1540b + iMin;
        qVar.f1540b = i3;
        this.e -= (long) iMin;
        if (i3 == qVar.f1541c) {
            this.f1511d = qVar.a();
            r.a(qVar);
        }
        return iMin;
    }

    public final String toString() {
        long j3 = this.e;
        if (j3 <= 2147483647L) {
            return j((int) j3).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.e).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        B2.h.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i3 = iRemaining;
        while (i3 > 0) {
            q qVarK = k(1);
            int iMin = Math.min(i3, 8192 - qVarK.f1541c);
            byteBuffer.get(qVarK.f1539a, qVarK.f1541c, iMin);
            i3 -= iMin;
            qVarK.f1541c += iMin;
        }
        this.e += (long) iRemaining;
        return iRemaining;
    }

    public final int read(byte[] bArr, int i3, int i4) {
        B2.h.e(bArr, "sink");
        AbstractC0540w.b(bArr.length, i3, i4);
        q qVar = this.f1511d;
        if (qVar == null) {
            return -1;
        }
        int iMin = Math.min(i4, qVar.f1541c - qVar.f1540b);
        int i5 = qVar.f1540b;
        p059r2.c.a(i3, i5, i5 + iMin, qVar.f1539a, bArr);
        int i6 = qVar.f1540b + iMin;
        qVar.f1540b = i6;
        this.e -= (long) iMin;
        if (i6 == qVar.f1541c) {
            this.f1511d = qVar.a();
            r.a(qVar);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // java.io.Flushable
    public final void flush() {
    }
}
