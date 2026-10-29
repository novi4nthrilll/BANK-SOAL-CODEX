package I2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class W extends N2.k implements E, N, A2.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0 f454g;

    @Override // I2.N
    public final boolean b() {
        return true;
    }

    @Override // I2.E
    public final void c() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        b0 b0VarN = n();
        while (true) {
            Object objE = b0VarN.E();
            if (objE instanceof W) {
                if (objE != this) {
                    return;
                }
                G g3 = AbstractC0052x.f504i;
                do {
                    atomicReferenceFieldUpdater2 = b0.f468d;
                    if (atomicReferenceFieldUpdater2.compareAndSet(b0VarN, objE, g3)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(b0VarN) == objE);
            } else {
                if (!(objE instanceof N) || ((N) objE).f() == null) {
                    return;
                }
                while (true) {
                    Object objK = k();
                    if (objK instanceof N2.r) {
                        N2.k kVar = ((N2.r) objK).f1162a;
                        return;
                    }
                    if (objK == this) {
                        return;
                    }
                    B2.h.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    N2.k kVar2 = (N2.k) objK;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = N2.k.f1150f;
                    N2.r rVar = (N2.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new N2.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = N2.k.f1149d;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objK, rVar)) {
                            kVar2.g();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objK);
                }
            }
        }
    }

    @Override // I2.N
    public final c0 f() {
        return null;
    }

    public S getParent() {
        return n();
    }

    public final b0 n() {
        b0 b0Var = this.f454g;
        if (b0Var != null) {
            return b0Var;
        }
        B2.h.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // N2.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0052x.b(this) + "[job@" + AbstractC0052x.b(n()) + ']';
    }
}
