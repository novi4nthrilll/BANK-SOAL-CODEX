package K1;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f764b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f765c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f763a = executorService;
    }

    @Override // K1.e
    public final void a(c cVar) {
        this.f764b.add(cVar);
        this.f763a.execute(new h(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f763a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f764b;
        AtomicBoolean atomicBoolean = this.f765c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new h(this, 1));
                }
            }
        }
    }
}
