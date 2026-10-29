package N2;

import I2.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends d implements e0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1164g = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1165f;

    public u(long j3, u uVar, int i3) {
        super(uVar);
        this.f1165f = j3;
        this.cleanedAndPointers = i3 << 16;
    }

    @Override // N2.d
    public final boolean c() {
        return f1164g.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f1164g.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i3, p063s2.i iVar);

    public final void h() {
        if (f1164g.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f1164g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
