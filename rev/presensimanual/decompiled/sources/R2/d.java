package R2;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class d implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f1517d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1518f;

    public d(h hVar, long j3) {
        B2.h.e(hVar, "fileHandle");
        this.f1517d = hVar;
        this.e = j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1518f) {
            return;
        }
        this.f1518f = true;
        h hVar = this.f1517d;
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

    @Override // R2.t
    public final long e(a aVar, long j3) {
        long j4;
        long j5;
        int i3;
        B2.h.e(aVar, "sink");
        if (this.f1518f) {
            throw new IllegalStateException("closed");
        }
        h hVar = this.f1517d;
        long j6 = this.e;
        hVar.getClass();
        if (j3 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        }
        long j7 = j3 + j6;
        long j8 = j6;
        while (true) {
            if (j8 < j7) {
                q qVarK = aVar.k(1);
                byte[] bArr = qVarK.f1539a;
                int i4 = qVarK.f1541c;
                int iMin = (int) Math.min(j7 - j8, 8192 - i4);
                synchronized (hVar) {
                    B2.h.e(bArr, "array");
                    hVar.f1530h.seek(j8);
                    i3 = 0;
                    while (true) {
                        if (i3 < iMin) {
                            int i5 = hVar.f1530h.read(bArr, i4, iMin - i3);
                            if (i5 != -1) {
                                i3 += i5;
                            } else if (i3 == 0) {
                                i3 = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i3 == -1) {
                    if (qVarK.f1540b == qVarK.f1541c) {
                        aVar.f1511d = qVarK.a();
                        r.a(qVarK);
                    }
                    if (j6 == j8) {
                        j5 = -1;
                        j4 = -1;
                        break;
                    }
                } else {
                    qVarK.f1541c += i3;
                    long j9 = i3;
                    j8 += j9;
                    aVar.e += j9;
                }
            }
            j4 = j8 - j6;
            j5 = -1;
            break;
        }
        if (j4 != j5) {
            this.e += j4;
        }
        return j4;
    }
}
