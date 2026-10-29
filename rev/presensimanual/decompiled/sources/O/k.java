package O;

import java.util.concurrent.ThreadPoolExecutor;
import p013d1.AbstractC0493o;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0493o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0493o f1191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1192b;

    public k(AbstractC0493o abstractC0493o, ThreadPoolExecutor threadPoolExecutor) {
        this.f1191a = abstractC0493o;
        this.f1192b = threadPoolExecutor;
    }

    @Override // p013d1.AbstractC0493o
    public final void a(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f1192b;
        try {
            this.f1191a.a(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p013d1.AbstractC0493o
    public final void b(E0.n nVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f1192b;
        try {
            this.f1191a.b(nVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
