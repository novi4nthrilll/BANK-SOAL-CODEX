package W;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1672d;
    public final /* synthetic */ Context e;

    public /* synthetic */ h(Context context, int i3) {
        this.f1672d = i3;
        this.e = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f1672d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h(this.e, 1));
                break;
            default:
                f.s(this.e, new d(), f.f1661a, false);
                break;
        }
    }
}
