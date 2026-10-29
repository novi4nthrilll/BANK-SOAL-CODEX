package R2;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class m extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f1533d;

    public m(n nVar) {
        this.f1533d = nVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f1533d.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        n nVar = this.f1533d;
        if (nVar.f1535f) {
            return;
        }
        nVar.flush();
    }

    public final String toString() {
        return this.f1533d + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i3) throws IOException {
        n nVar = this.f1533d;
        if (nVar.f1535f) {
            throw new IOException("closed");
        }
        nVar.e.o((byte) i3);
        nVar.a();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) throws IOException {
        B2.h.e(bArr, "data");
        n nVar = this.f1533d;
        if (!nVar.f1535f) {
            nVar.e.n(bArr, i3, i4);
            nVar.a();
            return;
        }
        throw new IOException("closed");
    }
}
