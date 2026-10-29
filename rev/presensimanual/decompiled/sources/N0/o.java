package N0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1091d;
    public final Object e;

    public /* synthetic */ o(int i3, Object obj) {
        this.f1091d = i3;
        this.e = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f1091d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((Z0.f) this.e).post(runnable);
                return;
            case 1:
                ((Z0.f) this.e).post(runnable);
                return;
            case 2:
                ((Z0.f) this.e).post(runnable);
                return;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                runnable.getClass();
                Handler handler = (Handler) this.e;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                ((ExecutorService) this.e).execute(new E0.l(14, runnable));
                return;
        }
    }

    public o() {
        this.f1091d = 2;
        Z0.f fVar = new Z0.f(Looper.getMainLooper());
        Looper.getMainLooper();
        this.e = fVar;
    }

    public o(Looper looper) {
        this.f1091d = 1;
        this.e = new Z0.f(looper, 1);
    }
}
