package p033j1;

import K2.l;
import N0.C;
import O0.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4997a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f4998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f5000d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f5001f;

    public k() {
        C c3 = new C();
        c3.e = new Object();
        this.f4998b = c3;
    }

    public final void a(b bVar) {
        this.f4998b.d(new h(f.f4991a, bVar));
        l();
    }

    public final void b(Executor executor, c cVar) {
        this.f4998b.d(new h(executor, cVar));
        l();
    }

    public final Exception c() {
        Exception exc;
        synchronized (this.f4997a) {
            exc = this.f5001f;
        }
        return exc;
    }

    public final Object d() {
        Object obj;
        synchronized (this.f4997a) {
            try {
                u.h("Task is not yet complete", this.f4999c);
                if (this.f5000d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f5001f;
                if (exc != null) {
                    throw new d(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.f4997a) {
            z2 = this.f4999c;
        }
        return z2;
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.f4997a) {
            try {
                z2 = false;
                if (this.f4999c && !this.f5000d && this.f5001f == null) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public final void g(Exception exc) {
        u.g(exc, "Exception must not be null");
        synchronized (this.f4997a) {
            k();
            this.f4999c = true;
            this.f5001f = exc;
        }
        this.f4998b.e(this);
    }

    public final void h(Object obj) {
        synchronized (this.f4997a) {
            k();
            this.f4999c = true;
            this.e = obj;
        }
        this.f4998b.e(this);
    }

    public final void i() {
        synchronized (this.f4997a) {
            try {
                if (this.f4999c) {
                    return;
                }
                this.f4999c = true;
                this.f5000d = true;
                this.f4998b.e(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(Object obj) {
        synchronized (this.f4997a) {
            try {
                if (this.f4999c) {
                    return false;
                }
                this.f4999c = true;
                this.e = obj;
                this.f4998b.e(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        String strConcat;
        if (this.f4999c) {
            int i3 = l.f814d;
            if (!e()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excC = c();
            if (excC != null) {
                strConcat = "failure";
            } else if (f()) {
                strConcat = "result ".concat(String.valueOf(d()));
            } else {
                strConcat = this.f5000d ? "cancellation" : "unknown issue";
            }
        }
    }

    public final void l() {
        synchronized (this.f4997a) {
            try {
                if (this.f4999c) {
                    this.f4998b.e(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
