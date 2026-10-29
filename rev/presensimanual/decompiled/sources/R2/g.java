package R2;

import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FileInputStream f1526d;

    public g(FileInputStream fileInputStream) {
        this.f1526d = fileInputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1526d.close();
    }

    @Override // R2.t
    public final long e(a aVar, long j3) throws IOException {
        String message;
        B2.h.e(aVar, "sink");
        if (j3 == 0) {
            return 0L;
        }
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        try {
            q qVarK = aVar.k(1);
            int i3 = this.f1526d.read(qVarK.f1539a, qVarK.f1541c, (int) Math.min(j3, 8192 - qVarK.f1541c));
            if (i3 != -1) {
                qVarK.f1541c += i3;
                long j4 = i3;
                aVar.e += j4;
                return j4;
            }
            if (qVarK.f1540b != qVarK.f1541c) {
                return -1L;
            }
            aVar.f1511d = qVarK.a();
            r.a(qVarK);
            return -1L;
        } catch (AssertionError e) {
            int i4 = k.f1531a;
            if (e.getCause() == null || (message = e.getMessage()) == null || H2.i.c(2, message, "getsockname failed", false) < 0) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    public final String toString() {
        return "source(" + this.f1526d + ')';
    }
}
