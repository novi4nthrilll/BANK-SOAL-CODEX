package p080z1;

import C1.g;
import E0.e;
import O0.C0092f;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Closeable, p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0092f f5959h = new C0092f("MobileVisionBase");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5960d = new AtomicBoolean(false);
    public final g e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p006b1.c f5961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f5962g;

    public c(g gVar, Executor executor) {
        this.e = gVar;
        p006b1.c cVar = new p006b1.c(4);
        this.f5961f = cVar;
        this.f5962g = executor;
        ((AtomicInteger) gVar.f5382b).incrementAndGet();
        gVar.a(executor, f.f5964a, (p006b1.c) cVar.f2515d).a(e.f5963d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @v(j.ON_DESTROY)
    public synchronized void close() {
        if (this.f5960d.getAndSet(true)) {
            return;
        }
        this.f5961f.e();
        g gVar = this.e;
        Executor executor = this.f5962g;
        if (((AtomicInteger) gVar.f5382b).get() <= 0) {
            throw new IllegalStateException();
        }
        ((p071w1.j) gVar.f5381a).a(executor, new e(15, gVar, new p033j1.e()));
    }
}
