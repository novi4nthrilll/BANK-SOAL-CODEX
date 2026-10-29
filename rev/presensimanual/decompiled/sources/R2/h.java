package R2;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1527d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ReentrantLock f1529g = new ReentrantLock();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RandomAccessFile f1530h;

    public h(boolean z2, RandomAccessFile randomAccessFile) {
        this.f1527d = z2;
        this.f1530h = randomAccessFile;
    }

    public static c b(h hVar) {
        if (!hVar.f1527d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = hVar.f1529g;
        reentrantLock.lock();
        try {
            if (hVar.e) {
                throw new IllegalStateException("closed");
            }
            hVar.f1528f++;
            reentrantLock.unlock();
            return new c(hVar, 0L);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a() {
        if (!this.f1527d) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f1529g;
        reentrantLock.lock();
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f1530h.getFD().sync();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long c() {
        long length;
        ReentrantLock reentrantLock = this.f1529g;
        reentrantLock.lock();
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f1530h.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f1529g;
        reentrantLock.lock();
        try {
            if (this.e) {
                reentrantLock.unlock();
                return;
            }
            this.e = true;
            if (this.f1528f != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f1530h.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final d d(long j3) {
        ReentrantLock reentrantLock = this.f1529g;
        reentrantLock.lock();
        try {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            this.f1528f++;
            reentrantLock.unlock();
            return new d(this, j3);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
