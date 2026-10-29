package I2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: I2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0053y extends I implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final RunnableC0053y f505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f506n;

    static {
        Long l3;
        RunnableC0053y runnableC0053y = new RunnableC0053y();
        f505m = runnableC0053y;
        runnableC0053y.k(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f506n = timeUnit.toNanos(l3.longValue());
    }

    @Override // I2.J
    public final Thread j() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // I2.I
    public final void o(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o(runnable);
    }

    public final synchronized void r() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            I.f438j.set(this, null);
            I.f439k.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.f481a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    _thread = null;
                    r();
                    if (q()) {
                        return;
                    }
                    j();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jL = l();
                    if (jL == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f506n + jNanoTime;
                        }
                        long j4 = j3 - jNanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            r();
                            if (q()) {
                                return;
                            }
                            j();
                            return;
                        }
                        if (jL > j4) {
                            jL = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (jL > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            r();
                            if (q()) {
                                return;
                            }
                            j();
                            return;
                        }
                        LockSupport.parkNanos(this, jL);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            r();
            if (!q()) {
                j();
            }
            throw th;
        }
    }

    @Override // I2.I, I2.J
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
