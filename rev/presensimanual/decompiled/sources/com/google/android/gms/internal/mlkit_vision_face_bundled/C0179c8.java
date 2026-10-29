package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.datastore.preferences.protobuf.C0131m;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.c8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0179c8 extends G {
    public static final Logger e = Logger.getLogger(C0179c8.class.getName());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f3004f = Y8.e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A8 f3005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f3006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3008d;

    public C0179c8(byte[] bArr, int i3) {
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.f3006b = bArr;
        this.f3008d = 0;
        this.f3007c = i3;
    }

    public static int a(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int o(int i3, U7 u7, N8 n8) {
        int iR = r(i3 << 3);
        return u7.b(n8) + iR + iR;
    }

    public static int p(U7 u7, N8 n8) {
        int iB = u7.b(n8);
        return r(iB) + iB;
    }

    public static int q(String str) {
        int length;
        try {
            length = a9.c(str);
        } catch (Z8 unused) {
            length = str.getBytes(AbstractC0348t8.f3460a).length;
        }
        return r(length) + length;
    }

    public static int r(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public final void b(byte b3) throws C0131m {
        try {
            byte[] bArr = this.f3006b;
            int i3 = this.f3008d;
            this.f3008d = i3 + 1;
            bArr[i3] = b3;
        } catch (IndexOutOfBoundsException e3) {
            throw new C0131m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3008d), Integer.valueOf(this.f3007c), 1), e3);
        }
    }

    public final void c(byte[] bArr, int i3) throws C0131m {
        try {
            System.arraycopy(bArr, 0, this.f3006b, this.f3008d, i3);
            this.f3008d += i3;
        } catch (IndexOutOfBoundsException e3) {
            throw new C0131m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3008d), Integer.valueOf(this.f3007c), Integer.valueOf(i3)), e3);
        }
    }

    public final void d(int i3, AbstractC0169b8 abstractC0169b8) throws C0131m {
        l((i3 << 3) | 2);
        l(abstractC0169b8.e());
        C0159a8 c0159a8 = (C0159a8) abstractC0169b8;
        c(c0159a8.f2989f, c0159a8.e());
    }

    public final void e(int i3, int i4) throws C0131m {
        l((i3 << 3) | 5);
        f(i4);
    }

    public final void f(int i3) throws C0131m {
        try {
            byte[] bArr = this.f3006b;
            int i4 = this.f3008d;
            int i5 = i4 + 1;
            this.f3008d = i5;
            bArr[i4] = (byte) (i3 & 255);
            int i6 = i4 + 2;
            this.f3008d = i6;
            bArr[i5] = (byte) ((i3 >> 8) & 255);
            int i7 = i4 + 3;
            this.f3008d = i7;
            bArr[i6] = (byte) ((i3 >> 16) & 255);
            this.f3008d = i4 + 4;
            bArr[i7] = (byte) ((i3 >> 24) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new C0131m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3008d), Integer.valueOf(this.f3007c), 1), e3);
        }
    }

    public final void g(long j3, int i3) throws C0131m {
        l((i3 << 3) | 1);
        h(j3);
    }

    public final void h(long j3) throws C0131m {
        try {
            byte[] bArr = this.f3006b;
            int i3 = this.f3008d;
            int i4 = i3 + 1;
            this.f3008d = i4;
            bArr[i3] = (byte) (((int) j3) & 255);
            int i5 = i3 + 2;
            this.f3008d = i5;
            bArr[i4] = (byte) (((int) (j3 >> 8)) & 255);
            int i6 = i3 + 3;
            this.f3008d = i6;
            bArr[i5] = (byte) (((int) (j3 >> 16)) & 255);
            int i7 = i3 + 4;
            this.f3008d = i7;
            bArr[i6] = (byte) (((int) (j3 >> 24)) & 255);
            int i8 = i3 + 5;
            this.f3008d = i8;
            bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
            int i9 = i3 + 6;
            this.f3008d = i9;
            bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
            int i10 = i3 + 7;
            this.f3008d = i10;
            bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
            this.f3008d = i3 + 8;
            bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e3) {
            throw new C0131m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3008d), Integer.valueOf(this.f3007c), 1), e3);
        }
    }

    public final void i(String str, int i3) throws C0131m {
        l((i3 << 3) | 2);
        int i4 = this.f3008d;
        try {
            int iR = r(str.length() * 3);
            int iR2 = r(str.length());
            byte[] bArr = this.f3006b;
            int i5 = this.f3007c;
            if (iR2 == iR) {
                int i6 = i4 + iR2;
                this.f3008d = i6;
                int iB = a9.b(str, bArr, i6, i5 - i6);
                this.f3008d = i4;
                l((iB - i4) - iR2);
                this.f3008d = iB;
            } else {
                l(a9.c(str));
                int i7 = this.f3008d;
                this.f3008d = a9.b(str, bArr, i7, i5 - i7);
            }
        } catch (Z8 e3) {
            this.f3008d = i4;
            e.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC0348t8.f3460a);
            try {
                int length = bytes.length;
                l(length);
                c(bytes, length);
            } catch (IndexOutOfBoundsException e4) {
                throw new C0131m(e4);
            }
        } catch (IndexOutOfBoundsException e5) {
            throw new C0131m(e5);
        }
    }

    public final void j(int i3, int i4) throws C0131m {
        l((i3 << 3) | i4);
    }

    public final void k(int i3, int i4) throws C0131m {
        l(i3 << 3);
        l(i4);
    }

    public final void l(int i3) throws C0131m {
        while (true) {
            int i4 = i3 & (-128);
            byte[] bArr = this.f3006b;
            if (i4 == 0) {
                int i5 = this.f3008d;
                this.f3008d = i5 + 1;
                bArr[i5] = (byte) i3;
                return;
            } else {
                try {
                    int i6 = this.f3008d;
                    this.f3008d = i6 + 1;
                    bArr[i6] = (byte) ((i3 | 128) & 255);
                    i3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C0131m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3008d), Integer.valueOf(this.f3007c), 1), e3);
                }
            }
            throw new C0131m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3008d), Integer.valueOf(this.f3007c), 1), e3);
        }
    }

    public final void m(long j3, int i3) throws C0131m {
        l(i3 << 3);
        n(j3);
    }

    public final void n(long j3) throws C0131m {
        byte[] bArr = this.f3006b;
        boolean z2 = f3004f;
        int i3 = this.f3007c;
        if (!z2 || i3 - this.f3008d < 10) {
            while ((j3 & (-128)) != 0) {
                try {
                    int i4 = this.f3008d;
                    this.f3008d = i4 + 1;
                    bArr[i4] = (byte) ((((int) j3) | 128) & 255);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C0131m(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3008d), Integer.valueOf(i3), 1), e3);
                }
            }
            int i5 = this.f3008d;
            this.f3008d = i5 + 1;
            bArr[i5] = (byte) j3;
            return;
        }
        while (true) {
            int i6 = (int) j3;
            if ((j3 & (-128)) == 0) {
                int i7 = this.f3008d;
                this.f3008d = 1 + i7;
                Y8.f2967c.d(bArr, Y8.f2969f + ((long) i7), (byte) i6);
                return;
            }
            int i8 = this.f3008d;
            this.f3008d = i8 + 1;
            Y8.f2967c.d(bArr, Y8.f2969f + ((long) i8), (byte) ((i6 | 128) & 255));
            j3 >>>= 7;
        }
    }
}
