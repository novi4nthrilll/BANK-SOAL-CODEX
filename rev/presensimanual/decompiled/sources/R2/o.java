package R2;

import java.io.IOException;
import java.io.InputStream;
import p013d1.AbstractC0540w;

/* JADX INFO: loaded from: classes.dex */
public final class o extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f1536d;

    public o(p pVar) {
        this.f1536d = pVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        p pVar = this.f1536d;
        if (pVar.f1538f) {
            throw new IOException("closed");
        }
        return (int) Math.min(pVar.e.e, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1536d.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        p pVar = this.f1536d;
        if (pVar.f1538f) {
            throw new IOException("closed");
        }
        a aVar = pVar.e;
        if (aVar.e == 0 && pVar.f1537d.e(aVar, 8192L) == -1) {
            return -1;
        }
        return aVar.d() & 255;
    }

    public final String toString() {
        return this.f1536d + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) throws IOException {
        B2.h.e(bArr, "data");
        p pVar = this.f1536d;
        if (!pVar.f1538f) {
            AbstractC0540w.b(bArr.length, i3, i4);
            a aVar = pVar.e;
            if (aVar.e == 0 && pVar.f1537d.e(aVar, 8192L) == -1) {
                return -1;
            }
            return aVar.read(bArr, i3, i4);
        }
        throw new IOException("closed");
    }
}
