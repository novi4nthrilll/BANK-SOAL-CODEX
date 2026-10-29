package K2;

import I2.AbstractC0030a;
import I2.AbstractC0052x;
import I2.C0043n;
import I2.T;
import I2.Z;
import J.K;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0030a implements p, f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f819g;

    public o(p063s2.i iVar, b bVar) {
        super(iVar, true);
        this.f819g = bVar;
    }

    @Override // I2.AbstractC0030a
    public final void U(Throwable th, boolean z2) {
        if (this.f819g.g(th, false) || z2) {
            return;
        }
        AbstractC0052x.d(th, this.f463f);
    }

    @Override // I2.AbstractC0030a
    public final void V(Object obj) {
        this.f819g.g(null, false);
    }

    public final void X(K k3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b bVar = this.f819g;
        bVar.getClass();
        do {
            atomicReferenceFieldUpdater = b.f786n;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, k3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(bVar);
            A0.f fVar = d.f804q;
            if (obj != fVar) {
                if (obj == d.f805r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            A0.f fVar2 = d.f805r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(bVar, fVar, fVar2)) {
                    k3.i(bVar.m());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(bVar) == fVar);
        }
    }

    @Override // I2.b0, I2.S
    public final void a(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        Object objE = E();
        if (objE instanceof C0043n) {
            return;
        }
        if ((objE instanceof Z) && ((Z) objE).d()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new T(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // K2.r
    public final Object d(Object obj, p063s2.d dVar) {
        return this.f819g.d(obj, dVar);
    }

    @Override // K2.r
    public final Object i(Object obj) {
        return this.f819g.i(obj);
    }

    @Override // I2.b0
    public final void t(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        this.f819g.g(cancellationException, true);
        s(cancellationException);
    }
}
