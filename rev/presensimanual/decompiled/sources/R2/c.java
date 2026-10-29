package R2;

import java.io.Closeable;
import java.io.Flushable;
import java.util.concurrent.locks.ReentrantLock;
import p013d1.AbstractC0540w;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f1515d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1516f;

    public c(h hVar, long j3) {
        B2.h.e(hVar, "fileHandle");
        this.f1515d = hVar;
        this.e = j3;
    }

    public final void a(a aVar, long j3) {
        if (this.f1516f) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f1515d;
        long j4 = this.e;
        hVar.getClass();
        AbstractC0540w.b(aVar.e, 0L, j3);
        long j5 = j4 + j3;
        while (j4 < j5) {
            q qVar = aVar.f1511d;
            B2.h.b(qVar);
            int iMin = (int) Math.min(j5 - j4, qVar.f1541c - qVar.f1540b);
            byte[] bArr = qVar.f1539a;
            int i3 = qVar.f1540b;
            synchronized (hVar) {
                B2.h.e(bArr, "array");
                hVar.f1530h.seek(j4);
                hVar.f1530h.write(bArr, i3, iMin);
            }
            int i4 = qVar.f1540b + iMin;
            qVar.f1540b = i4;
            long j6 = iMin;
            j4 += j6;
            aVar.e -= j6;
            if (i4 == qVar.f1541c) {
                aVar.f1511d = qVar.a();
                r.a(qVar);
            }
        }
        this.e += j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1516f) {
            return;
        }
        this.f1516f = true;
        h hVar = this.f1515d;
        ReentrantLock reentrantLock = hVar.f1529g;
        reentrantLock.lock();
        try {
            int i3 = hVar.f1528f - 1;
            hVar.f1528f = i3;
            if (i3 == 0 && hVar.e) {
                reentrantLock.unlock();
                synchronized (hVar) {
                    hVar.f1530h.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f1516f) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f1515d;
        synchronized (hVar) {
            hVar.f1530h.getFD().sync();
        }
    }
}
