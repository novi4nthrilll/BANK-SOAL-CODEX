package p071w1;

import E0.e;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5795b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5794a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f5796c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f5797d = new AtomicReference();

    public final void a(Executor executor, Runnable runnable) {
        synchronized (this.f5794a) {
            try {
                if (this.f5795b) {
                    this.f5796c.add(new r(executor, runnable));
                } else {
                    this.f5795b = true;
                    c(executor, runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f5794a) {
            try {
                if (this.f5796c.isEmpty()) {
                    this.f5795b = false;
                } else {
                    r rVar = (r) this.f5796c.remove();
                    c(rVar.f5811a, rVar.f5812b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Executor executor, Runnable runnable) {
        try {
            executor.execute(new e(16, this, runnable));
        } catch (RejectedExecutionException unused) {
            b();
        }
    }
}
