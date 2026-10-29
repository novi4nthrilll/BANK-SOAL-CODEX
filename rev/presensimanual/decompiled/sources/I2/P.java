package I2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class P extends U {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f448i = AtomicIntegerFieldUpdater.newUpdater(P.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A2.l f449h;

    public P(A2.l lVar) {
        this.f449h = lVar;
    }

    @Override // A2.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return p055q2.g.f5603a;
    }

    @Override // I2.W
    public final void o(Throwable th) {
        if (f448i.compareAndSet(this, 0, 1)) {
            this.f449h.i(th);
        }
    }
}
