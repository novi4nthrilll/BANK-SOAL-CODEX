package I2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p013d1.AbstractC0514r3;

/* JADX INFO: loaded from: classes.dex */
public final class B extends N2.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f432h = AtomicIntegerFieldUpdater.newUpdater(B.class, "_decision");
    private volatile int _decision;

    @Override // N2.t, I2.b0
    public final void q(Object obj) {
        r(obj);
    }

    @Override // N2.t, I2.b0
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f432h;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                N2.a.i(AbstractC0514r3.a(this.f1163g), AbstractC0052x.h(obj), null);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
