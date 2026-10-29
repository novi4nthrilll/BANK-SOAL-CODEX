package I2;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class L extends K implements A {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f445f;

    public L(Executor executor) {
        Method method;
        this.f445f = executor;
        Method method2 = N2.c.f1134a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = N2.c.f1134a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f445f;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // I2.AbstractC0048t
    public final void d(p063s2.i iVar, Runnable runnable) {
        try {
            this.f445f.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            S s3 = (S) iVar.f(C0049u.e);
            if (s3 != null) {
                s3.a(cancellationException);
            }
            D.f435b.d(iVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof L) && ((L) obj).f445f == this.f445f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f445f);
    }

    @Override // I2.AbstractC0048t
    public final String toString() {
        return this.f445f.toString();
    }
}
