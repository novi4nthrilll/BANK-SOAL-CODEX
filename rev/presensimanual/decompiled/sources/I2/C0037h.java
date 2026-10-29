package I2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: I2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0037h extends U {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0035f f479h;

    public C0037h(C0035f c0035f) {
        this.f479h = c0035f;
    }

    @Override // A2.l
    public final /* bridge */ /* synthetic */ Object i(Object obj) {
        o((Throwable) obj);
        return p055q2.g.f5603a;
    }

    @Override // I2.W
    public final void o(Throwable th) {
        b0 b0VarN = n();
        C0035f c0035f = this.f479h;
        Throwable thT = c0035f.t(b0VarN);
        if (c0035f.y()) {
            p063s2.d dVar = c0035f.f476g;
            B2.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            N2.h hVar = (N2.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N2.h.f1139k;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                A0.f fVar = N2.a.f1131d;
                if (B2.h.a(obj, fVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, thT)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != fVar) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == obj);
                }
            }
        }
        c0035f.q(thT);
        if (c0035f.y()) {
            return;
        }
        c0035f.r();
    }
}
