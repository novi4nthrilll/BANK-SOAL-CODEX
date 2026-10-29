package Q2;

import I2.AbstractC0052x;
import I2.C0035f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013d1.AbstractC0514r3;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h implements a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1386g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z2) {
        super(z2 ? 1 : 0);
        this.owner = z2 ? null : e.f1387a;
    }

    public final Object c(u2.b bVar) throws Throwable {
        boolean zD = d(null);
        p055q2.g gVar = p055q2.g.f5603a;
        if (zD) {
            return gVar;
        }
        C0035f c0035fC = AbstractC0052x.c(AbstractC0514r3.a(bVar));
        try {
            a(new c(this, c0035fC));
            Object objU = c0035fC.u();
            t2.a aVar = t2.a.f5737d;
            if (objU != aVar) {
                objU = gVar;
            }
            return objU == aVar ? objU : gVar;
        } catch (Throwable th) {
            c0035fC.B();
            throw th;
        }
    }

    public final boolean d(Object obj) {
        int i3;
        char c3;
        char c4;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f1393f;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > 1) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1386g;
                if (i4 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) != 0) {
                                c4 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != e.f1387a) {
                                if (obj2 != obj) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 1;
                                break;
                            }
                        }
                        if (c4 == 1) {
                            c3 = 2;
                            break;
                        }
                        if (c4 != 2) {
                        }
                    }
                    c3 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c3 = 0;
                    break;
                }
            }
        }
        if (c3 == 0) {
            return true;
        }
        if (c3 == 1) {
            return false;
        }
        if (c3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final void e(Object obj) {
        while (Math.max(h.f1393f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1386g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            A0.f fVar = e.f1387a;
            if (obj2 != fVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, fVar)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0052x.b(this));
        sb.append("[isLocked=");
        sb.append(Math.max(h.f1393f.get(this), 0) == 0);
        sb.append(",owner=");
        sb.append(f1386g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
