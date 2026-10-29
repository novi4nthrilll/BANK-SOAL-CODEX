package I2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends N2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c0 f465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f466d;
    public final /* synthetic */ N e;

    public a0(W w3, b0 b0Var, N n3) {
        this.f466d = b0Var;
        this.e = n3;
        this.f464b = w3;
    }

    @Override // N2.b
    public final void b(Object obj, Object obj2) {
        N2.k kVar = (N2.k) obj;
        boolean z2 = obj2 == null;
        N2.k kVar2 = this.f464b;
        N2.k kVar3 = z2 ? kVar2 : this.f465c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N2.k.f1149d;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z2) {
                N2.k kVar4 = this.f465c;
                B2.h.b(kVar4);
                kVar2.j(kVar4);
            }
        }
    }

    @Override // N2.b
    public final A0.f c(Object obj) {
        if (this.f466d.E() == this.e) {
            return null;
        }
        return N2.a.e;
    }
}
