package N2;

import I2.A;
import I2.AbstractC0048t;
import I2.AbstractC0054z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0048t implements A {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1144j = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P2.k f1145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f1147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f1148i;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(P2.k kVar, int i3) {
        this.f1145f = kVar;
        this.f1146g = i3;
        if ((kVar instanceof A ? (A) kVar : null) == null) {
            int i4 = AbstractC0054z.f507a;
        }
        this.f1147h = new l();
        this.f1148i = new Object();
    }

    @Override // I2.AbstractC0048t
    public final void d(p063s2.i iVar, Runnable runnable) {
        this.f1147h.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1144j;
        if (atomicIntegerFieldUpdater.get(this) < this.f1146g) {
            synchronized (this.f1148i) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1146g) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableI = i();
                if (runnableI == null) {
                    return;
                }
                this.f1145f.d(this, new E0.e(this, runnableI, 4, false));
            }
        }
    }

    public final Runnable i() {
        while (true) {
            Runnable runnable = (Runnable) this.f1147h.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1148i) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1144j;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1147h.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
