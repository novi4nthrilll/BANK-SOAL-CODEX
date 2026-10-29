package R2;

import java.io.Closeable;
import java.io.Flushable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Closeable, Flushable, WritableByteChannel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1534d;
    public final a e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1535f;

    public n(c cVar) {
        this.f1534d = cVar;
    }

    public final void a() {
        if (this.f1535f) {
            throw new IllegalStateException("closed");
        }
        a aVar = this.e;
        long j3 = aVar.e;
        if (j3 == 0) {
            j3 = 0;
        } else {
            q qVar = aVar.f1511d;
            B2.h.b(qVar);
            q qVar2 = qVar.f1544g;
            B2.h.b(qVar2);
            int i3 = qVar2.f1541c;
            if (i3 < 8192 && qVar2.e) {
                j3 -= (long) (i3 - qVar2.f1540b);
            }
        }
        if (j3 > 0) {
            this.f1534d.a(aVar, j3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        c cVar = this.f1534d;
        if (this.f1535f) {
            return;
        }
        a aVar = this.e;
        long j3 = aVar.e;
        if (j3 > 0) {
            cVar.a(aVar, j3);
        }
        th = null;
        try {
            cVar.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f1535f = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f1535f) {
            throw new IllegalStateException("closed");
        }
        a aVar = this.e;
        long j3 = aVar.e;
        c cVar = this.f1534d;
        if (j3 > 0) {
            cVar.a(aVar, j3);
        }
        cVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1535f;
    }

    public final String toString() {
        return "buffer(" + this.f1534d + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        B2.h.e(byteBuffer, "source");
        if (this.f1535f) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.e.write(byteBuffer);
        a();
        return iWrite;
    }
}
