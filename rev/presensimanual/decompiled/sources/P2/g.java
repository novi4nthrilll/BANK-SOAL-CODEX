package P2;

import I2.K;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends K {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f1345f;

    @Override // I2.AbstractC0048t
    public final void d(p063s2.i iVar, Runnable runnable) {
        b bVar = this.f1345f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1331k;
        bVar.b(runnable, j.f1353g, false);
    }
}
