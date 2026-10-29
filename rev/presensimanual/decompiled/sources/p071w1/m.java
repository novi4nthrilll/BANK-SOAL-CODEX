package p071w1;

import O0.u;
import java.util.ArrayDeque;
import java.util.Deque;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5801d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ m(Runnable runnable, int i3) {
        this.f5801d = i3;
        this.e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5801d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Deque deque = (Deque) g.e.get();
                u.f(deque);
                Runnable runnable = this.e;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                g.e.set(new ArrayDeque());
                this.e.run();
                break;
        }
    }
}
