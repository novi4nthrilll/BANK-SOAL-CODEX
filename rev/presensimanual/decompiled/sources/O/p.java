package O;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p013d1.AbstractC0493o;

/* JADX INFO: loaded from: classes.dex */
public final class p implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D0.d f1205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L0.g f1206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1207d;
    public Handler e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f1208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f1209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AbstractC0493o f1210h;

    public p(Context context, D0.d dVar) {
        L0.g gVar = q.f1211d;
        this.f1207d = new Object();
        A.d.b(context, "Context cannot be null");
        this.f1204a = context.getApplicationContext();
        this.f1205b = dVar;
        this.f1206c = gVar;
    }

    @Override // O.g
    public final void a(AbstractC0493o abstractC0493o) {
        synchronized (this.f1207d) {
            this.f1210h = abstractC0493o;
        }
        c();
    }

    public final void b() {
        synchronized (this.f1207d) {
            try {
                this.f1210h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1209g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1208f = null;
                this.f1209g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f1207d) {
            try {
                if (this.f1210h == null) {
                    return;
                }
                if (this.f1208f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f1209g = threadPoolExecutor;
                    this.f1208f = threadPoolExecutor;
                }
                this.f1208f.execute(new M1.c(1, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p075y.h d() {
        try {
            L0.g gVar = this.f1206c;
            Context context = this.f1204a;
            D0.d dVar = this.f1205b;
            gVar.getClass();
            A.c cVarA = p075y.c.a(context, dVar);
            int i3 = cVarA.f2a;
            if (i3 != 0) {
                throw new RuntimeException("fetchFonts failed (" + i3 + ")");
            }
            p075y.h[] hVarArr = (p075y.h[]) cVarA.f3b;
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
