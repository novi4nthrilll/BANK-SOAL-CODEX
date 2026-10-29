package I2;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: I2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032c extends AbstractC0030a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread f469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J f470h;

    public C0032c(p063s2.i iVar, Thread thread, J j3) {
        super(iVar, true);
        this.f469g = thread;
        this.f470h = j3;
    }

    @Override // I2.b0
    public final void q(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f469g;
        if (B2.h.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
