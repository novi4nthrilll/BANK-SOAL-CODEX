package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0132n extends p013d1.F {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f2324f = Logger.getLogger(C0132n.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f2325g = p0.e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public L f2326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2329d;
    public final OutputStream e;

    public C0132n(OutputStream outputStream, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i3, 20);
        this.f2327b = new byte[iMax];
        this.f2328c = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.e = outputStream;
    }

    public static int A(long j3, int i3) {
        return B(j3) + x(i3);
    }

    public static int B(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public static int g(int i3) {
        return x(i3) + 1;
    }

    public static int h(int i3, C0126h c0126h) {
        return i(c0126h) + x(i3);
    }

    public static int i(C0126h c0126h) {
        int size = c0126h.size();
        return z(size) + size;
    }

    public static int j(int i3) {
        return x(i3) + 8;
    }

    public static int k(int i3, int i4) {
        return B(i4) + x(i3);
    }

    public static int l(int i3) {
        return x(i3) + 4;
    }

    public static int m(int i3) {
        return x(i3) + 8;
    }

    public static int n(int i3) {
        return x(i3) + 4;
    }

    public static int o(int i3, AbstractC0119a abstractC0119a, c0 c0Var) {
        return abstractC0119a.a(c0Var) + (x(i3) * 2);
    }

    public static int p(int i3, int i4) {
        return B(i4) + x(i3);
    }

    public static int q(long j3, int i3) {
        return B(j3) + x(i3);
    }

    public static int r(int i3) {
        return x(i3) + 4;
    }

    public static int s(int i3) {
        return x(i3) + 8;
    }

    public static int t(int i3, int i4) {
        return z((i4 >> 31) ^ (i4 << 1)) + x(i3);
    }

    public static int u(long j3, int i3) {
        return B((j3 >> 63) ^ (j3 << 1)) + x(i3);
    }

    public static int v(String str, int i3) {
        return w(str) + x(i3);
    }

    public static int w(String str) {
        int length;
        try {
            length = s0.a(str);
        } catch (r0 unused) {
            length = str.getBytes(C.f2218a).length;
        }
        return z(length) + length;
    }

    public static int x(int i3) {
        return z(i3 << 3);
    }

    public static int y(int i3, int i4) {
        return z(i4) + x(i3);
    }

    public static int z(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public final void C() throws IOException {
        this.e.write(this.f2327b, 0, this.f2329d);
        this.f2329d = 0;
    }

    public final void D(int i3) throws IOException {
        if (this.f2328c - this.f2329d < i3) {
            C();
        }
    }

    public final void E(byte b3) throws IOException {
        if (this.f2329d == this.f2328c) {
            C();
        }
        int i3 = this.f2329d;
        this.f2329d = i3 + 1;
        this.f2327b[i3] = b3;
    }

    public final void F(byte[] bArr, int i3, int i4) throws IOException {
        int i5 = this.f2329d;
        int i6 = this.f2328c;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f2327b;
        if (i7 >= i4) {
            System.arraycopy(bArr, i3, bArr2, i5, i4);
            this.f2329d += i4;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i5, i7);
        int i8 = i3 + i7;
        int i9 = i4 - i7;
        this.f2329d = i6;
        C();
        if (i9 > i6) {
            this.e.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f2329d = i9;
        }
    }

    public final void G(int i3, boolean z2) {
        D(11);
        d(i3, 0);
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        int i4 = this.f2329d;
        this.f2329d = i4 + 1;
        this.f2327b[i4] = b3;
    }

    public final void H(int i3, C0126h c0126h) {
        R(i3, 2);
        I(c0126h);
    }

    public final void I(C0126h c0126h) {
        T(c0126h.size());
        a(c0126h.e, c0126h.g(), c0126h.size());
    }

    public final void J(int i3, int i4) {
        D(14);
        d(i3, 5);
        b(i4);
    }

    public final void K(int i3) throws IOException {
        D(4);
        b(i3);
    }

    public final void L(long j3, int i3) {
        D(18);
        d(i3, 1);
        c(j3);
    }

    public final void M(long j3) throws IOException {
        D(8);
        c(j3);
    }

    public final void N(int i3, int i4) {
        D(20);
        d(i3, 0);
        if (i4 >= 0) {
            e(i4);
        } else {
            f(i4);
        }
    }

    public final void O(int i3) throws IOException {
        if (i3 >= 0) {
            T(i3);
        } else {
            V(i3);
        }
    }

    public final void P(String str, int i3) throws IOException {
        R(i3, 2);
        Q(str);
    }

    public final void Q(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iZ = z(length);
            int i3 = iZ + length;
            int i4 = this.f2328c;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int iB = s0.f2343a.b(str, bArr, 0, length);
                T(iB);
                F(bArr, 0, iB);
                return;
            }
            if (i3 > i4 - this.f2329d) {
                C();
            }
            int iZ2 = z(str.length());
            int i5 = this.f2329d;
            byte[] bArr2 = this.f2327b;
            try {
                try {
                    if (iZ2 == iZ) {
                        int i6 = i5 + iZ2;
                        this.f2329d = i6;
                        int iB2 = s0.f2343a.b(str, bArr2, i6, i4 - i6);
                        this.f2329d = i5;
                        e((iB2 - i5) - iZ2);
                        this.f2329d = iB2;
                    } else {
                        int iA = s0.a(str);
                        e(iA);
                        this.f2329d = s0.f2343a.b(str, bArr2, this.f2329d, iA);
                    }
                } catch (r0 e) {
                    this.f2329d = i5;
                    throw e;
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
                throw new C0131m(e3);
            }
        } catch (r0 e4) {
            f2324f.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e4);
            byte[] bytes = str.getBytes(C.f2218a);
            try {
                T(bytes.length);
                a(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e5) {
                throw new C0131m(e5);
            }
        }
    }

    public final void R(int i3, int i4) {
        T((i3 << 3) | i4);
    }

    public final void S(int i3, int i4) {
        D(20);
        d(i3, 0);
        e(i4);
    }

    public final void T(int i3) {
        D(5);
        e(i3);
    }

    public final void U(long j3, int i3) {
        D(20);
        d(i3, 0);
        f(j3);
    }

    public final void V(long j3) throws IOException {
        D(10);
        f(j3);
    }

    @Override // p013d1.F
    public final void a(byte[] bArr, int i3, int i4) throws IOException {
        F(bArr, i3, i4);
    }

    public final void b(int i3) {
        int i4 = this.f2329d;
        int i5 = i4 + 1;
        this.f2329d = i5;
        byte[] bArr = this.f2327b;
        bArr[i4] = (byte) (i3 & 255);
        int i6 = i4 + 2;
        this.f2329d = i6;
        bArr[i5] = (byte) ((i3 >> 8) & 255);
        int i7 = i4 + 3;
        this.f2329d = i7;
        bArr[i6] = (byte) ((i3 >> 16) & 255);
        this.f2329d = i4 + 4;
        bArr[i7] = (byte) ((i3 >> 24) & 255);
    }

    public final void c(long j3) {
        int i3 = this.f2329d;
        int i4 = i3 + 1;
        this.f2329d = i4;
        byte[] bArr = this.f2327b;
        bArr[i3] = (byte) (j3 & 255);
        int i5 = i3 + 2;
        this.f2329d = i5;
        bArr[i4] = (byte) ((j3 >> 8) & 255);
        int i6 = i3 + 3;
        this.f2329d = i6;
        bArr[i5] = (byte) ((j3 >> 16) & 255);
        int i7 = i3 + 4;
        this.f2329d = i7;
        bArr[i6] = (byte) (255 & (j3 >> 24));
        int i8 = i3 + 5;
        this.f2329d = i8;
        bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
        int i9 = i3 + 6;
        this.f2329d = i9;
        bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
        int i10 = i3 + 7;
        this.f2329d = i10;
        bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
        this.f2329d = i3 + 8;
        bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
    }

    public final void d(int i3, int i4) {
        e((i3 << 3) | i4);
    }

    public final void e(int i3) {
        boolean z2 = f2325g;
        byte[] bArr = this.f2327b;
        if (z2) {
            while ((i3 & (-128)) != 0) {
                int i4 = this.f2329d;
                this.f2329d = i4 + 1;
                p0.j(bArr, i4, (byte) ((i3 | 128) & 255));
                i3 >>>= 7;
            }
            int i5 = this.f2329d;
            this.f2329d = i5 + 1;
            p0.j(bArr, i5, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i6 = this.f2329d;
            this.f2329d = i6 + 1;
            bArr[i6] = (byte) ((i3 | 128) & 255);
            i3 >>>= 7;
        }
        int i7 = this.f2329d;
        this.f2329d = i7 + 1;
        bArr[i7] = (byte) i3;
    }

    public final void f(long j3) {
        boolean z2 = f2325g;
        byte[] bArr = this.f2327b;
        if (z2) {
            while ((j3 & (-128)) != 0) {
                int i3 = this.f2329d;
                this.f2329d = i3 + 1;
                p0.j(bArr, i3, (byte) ((((int) j3) | 128) & 255));
                j3 >>>= 7;
            }
            int i4 = this.f2329d;
            this.f2329d = i4 + 1;
            p0.j(bArr, i4, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i5 = this.f2329d;
            this.f2329d = i5 + 1;
            bArr[i5] = (byte) ((((int) j3) | 128) & 255);
            j3 >>>= 7;
        }
        int i6 = this.f2329d;
        this.f2329d = i6 + 1;
        bArr[i6] = (byte) j3;
    }
}
