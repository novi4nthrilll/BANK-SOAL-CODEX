package I2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends J implements A {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f438j = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_queue");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f439k = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f440l = AtomicIntegerFieldUpdater.newUpdater(I.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // I2.AbstractC0048t
    public final void d(p063s2.i iVar, Runnable runnable) {
        o(runnable);
    }

    @Override // I2.J
    public final long l() {
        Runnable runnable;
        if (m()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f438j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (obj instanceof N2.n) {
                N2.n nVar = (N2.n) obj;
                Object objD = nVar.d();
                if (objD != N2.n.f1154g) {
                    runnable = (Runnable) objD;
                    break;
                }
                N2.n nVarC = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == AbstractC0052x.f498b) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        if (runnable == null) {
            return p();
        }
        runnable.run();
        return 0L;
    }

    public void o(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f438j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f440l.get(this) == 0) {
                if (obj == null) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == null);
                } else if (obj instanceof N2.n) {
                    N2.n nVar = (N2.n) obj;
                    int iA = nVar.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        N2.n nVarC = nVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA != 2) {
                    }
                } else if (obj != AbstractC0052x.f498b) {
                    N2.n nVar2 = new N2.n(8, true);
                    nVar2.a((Runnable) obj);
                    nVar2.a(runnable);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar2)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            RunnableC0053y.f505m.o(runnable);
            return;
        }
        Thread threadJ = j();
        if (Thread.currentThread() != threadJ) {
            LockSupport.unpark(threadJ);
        }
    }

    public final long p() {
        p059r2.b bVar = this.f444h;
        if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj = f438j.get(this);
        if (obj != null) {
            if (!(obj instanceof N2.n)) {
                return obj == AbstractC0052x.f498b ? Long.MAX_VALUE : 0L;
            }
            long j3 = N2.n.f1153f.get((N2.n) obj);
            if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    public final boolean q() {
        p059r2.b bVar = this.f444h;
        if (!(bVar != null ? bVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f438j.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof N2.n) {
            long j3 = N2.n.f1153f.get((N2.n) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0052x.f498b) {
            return true;
        }
        return false;
    }

    @Override // I2.J
    public void shutdown() {
        j0.f481a.set(null);
        f440l.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f438j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            A0.f fVar = AbstractC0052x.f498b;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, fVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof N2.n) {
                ((N2.n) obj).b();
                break;
            } else {
                if (obj == fVar) {
                    break;
                }
                N2.n nVar = new N2.n(8, true);
                nVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (l() <= 0) {
        }
        System.nanoTime();
    }
}
