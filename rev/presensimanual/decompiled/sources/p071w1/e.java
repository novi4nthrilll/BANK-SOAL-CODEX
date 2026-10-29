package p071w1;

import Z0.f;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import p033j1.k;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5782b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f5783c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5784a;

    public e(Looper looper) {
        f fVar = new f(looper);
        Looper.getMainLooper();
        this.f5784a = fVar;
    }

    public static e a() {
        e eVar;
        synchronized (f5782b) {
            try {
                if (f5783c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f5783c = new e(handlerThread.getLooper());
                }
                eVar = f5783c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static k b(Callable callable) {
        p033j1.e eVar = new p033j1.e();
        l.f5800d.execute(new E0.e(14, callable, eVar));
        return eVar.f4990a;
    }
}
