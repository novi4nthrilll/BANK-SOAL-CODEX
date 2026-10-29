package p033j1;

import E0.e;
import java.util.concurrent.Executor;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f4994b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4996d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4993a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4995c = new Object();

    public h(Executor executor, a aVar) {
        this.f4994b = executor;
        this.f4996d = aVar;
    }

    private final void b(k kVar) {
        synchronized (this.f4995c) {
        }
        this.f4994b.execute(new e(this, kVar, 7, false));
    }

    private final void c(k kVar) {
        if (kVar.f() || kVar.f5000d) {
            return;
        }
        synchronized (this.f4995c) {
            try {
                if (((b) this.f4996d) == null) {
                    return;
                }
                this.f4994b.execute(new e(this, kVar, 8, false));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p033j1.i
    public final void a(k kVar) {
        switch (this.f4993a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                b(kVar);
                return;
            case 1:
                c(kVar);
                return;
            default:
                if (kVar.f()) {
                    synchronized (this.f4995c) {
                        try {
                            if (((c) this.f4996d) != null) {
                                this.f4994b.execute(new e(this, kVar, 9, false));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public h(Executor executor, b bVar) {
        this.f4994b = executor;
        this.f4996d = bVar;
    }

    public h(Executor executor, c cVar) {
        this.f4994b = executor;
        this.f4996d = cVar;
    }
}
