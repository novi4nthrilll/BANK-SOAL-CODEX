package R2;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class p implements t, ReadableByteChannel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f1537d;
    public final a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1538f;

    public p(t tVar) {
        B2.h.e(tVar, "source");
        this.f1537d = tVar;
        this.e = new a();
    }

    public final int a() throws EOFException {
        f(4L);
        int iH = this.e.h();
        return ((iH & 255) << 24) | (((-16777216) & iH) >>> 24) | ((16711680 & iH) >>> 8) | ((65280 & iH) << 8);
    }

    public final long b() throws EOFException {
        long jH;
        f(8L);
        a aVar = this.e;
        if (aVar.e < 8) {
            throw new EOFException();
        }
        q qVar = aVar.f1511d;
        B2.h.b(qVar);
        int i3 = qVar.f1540b;
        int i4 = qVar.f1541c;
        if (i4 - i3 < 8) {
            jH = ((((long) aVar.h()) & 4294967295L) << 32) | (4294967295L & ((long) aVar.h()));
        } else {
            byte[] bArr = qVar.f1539a;
            int i5 = i3 + 7;
            long j3 = ((((long) bArr[i3]) & 255) << 56) | ((((long) bArr[i3 + 1]) & 255) << 48) | ((((long) bArr[i3 + 2]) & 255) << 40) | ((((long) bArr[i3 + 3]) & 255) << 32) | ((((long) bArr[i3 + 4]) & 255) << 24) | ((((long) bArr[i3 + 5]) & 255) << 16) | ((((long) bArr[i3 + 6]) & 255) << 8);
            int i6 = i3 + 8;
            long j4 = j3 | (((long) bArr[i5]) & 255);
            aVar.e -= 8;
            if (i6 == i4) {
                aVar.f1511d = qVar.a();
                r.a(qVar);
            } else {
                qVar.f1540b = i6;
            }
            jH = j4;
        }
        return ((jH & 255) << 56) | (((-72057594037927936L) & jH) >>> 56) | ((71776119061217280L & jH) >>> 40) | ((280375465082880L & jH) >>> 24) | ((1095216660480L & jH) >>> 8) | ((4278190080L & jH) << 8) | ((16711680 & jH) << 24) | ((65280 & jH) << 40);
    }

    public final short c() throws EOFException {
        short sD;
        f(2L);
        a aVar = this.e;
        if (aVar.e < 2) {
            throw new EOFException();
        }
        q qVar = aVar.f1511d;
        B2.h.b(qVar);
        int i3 = qVar.f1540b;
        int i4 = qVar.f1541c;
        if (i4 - i3 < 2) {
            sD = (short) ((aVar.d() & 255) | ((aVar.d() & 255) << 8));
        } else {
            int i5 = i3 + 1;
            byte[] bArr = qVar.f1539a;
            int i6 = (bArr[i3] & 255) << 8;
            int i7 = i3 + 2;
            int i8 = (bArr[i5] & 255) | i6;
            aVar.e -= 2;
            if (i7 == i4) {
                aVar.f1511d = qVar.a();
                r.a(qVar);
            } else {
                qVar.f1540b = i7;
            }
            sD = (short) i8;
        }
        return (short) (((sD & 255) << 8) | ((65280 & sD) >>> 8));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f1538f) {
            return;
        }
        this.f1538f = true;
        this.f1537d.close();
        a aVar = this.e;
        aVar.i(aVar.e);
    }

    public final String d(long j3) throws EOFException {
        f(j3);
        a aVar = this.e;
        aVar.getClass();
        Charset charset = H2.a.f330a;
        B2.h.e(charset, "charset");
        if (j3 < 0 || j3 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j3).toString());
        }
        if (aVar.e < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return "";
        }
        q qVar = aVar.f1511d;
        B2.h.b(qVar);
        int i3 = qVar.f1540b;
        if (((long) i3) + j3 > qVar.f1541c) {
            return new String(aVar.f(j3), charset);
        }
        int i4 = (int) j3;
        String str = new String(qVar.f1539a, i3, i4, charset);
        int i5 = qVar.f1540b + i4;
        qVar.f1540b = i5;
        aVar.e -= j3;
        if (i5 == qVar.f1541c) {
            aVar.f1511d = qVar.a();
            r.a(qVar);
        }
        return str;
    }

    @Override // R2.t
    public final long e(a aVar, long j3) {
        B2.h.e(aVar, "sink");
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f1538f) {
            throw new IllegalStateException("closed");
        }
        a aVar2 = this.e;
        if (aVar2.e == 0 && this.f1537d.e(aVar2, 8192L) == -1) {
            return -1L;
        }
        return aVar2.e(aVar, Math.min(j3, aVar2.e));
    }

    public final void f(long j3) throws EOFException {
        a aVar;
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        if (this.f1538f) {
            throw new IllegalStateException("closed");
        }
        do {
            aVar = this.e;
            if (aVar.e >= j3) {
                return;
            }
        } while (this.f1537d.e(aVar, 8192L) != -1);
        throw new EOFException();
    }

    public final void g(long j3) throws EOFException {
        if (this.f1538f) {
            throw new IllegalStateException("closed");
        }
        while (j3 > 0) {
            a aVar = this.e;
            if (aVar.e == 0 && this.f1537d.e(aVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j3, aVar.e);
            aVar.i(jMin);
            j3 -= jMin;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1538f;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        B2.h.e(byteBuffer, "sink");
        a aVar = this.e;
        if (aVar.e == 0 && this.f1537d.e(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f1537d + ')';
    }
}
