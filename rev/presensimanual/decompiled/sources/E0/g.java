package E0;

import B.C0006g;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f209d;
    public final p079z0.b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f211g;

    public g(j jVar, p079z0.b bVar, int i3, Runnable runnable) {
        this.f209d = jVar;
        this.e = bVar;
        this.f210f = i3;
        this.f211g = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f209d;
        p079z0.b bVar = this.e;
        int i3 = this.f210f;
        Runnable runnable = this.f211g;
        try {
            try {
                G0.c cVar = jVar.f224f;
                F0.c cVar2 = jVar.f222c;
                cVar2.getClass();
                ((F0.i) cVar).d(new C0006g(2, cVar2));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) jVar.f220a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((F0.i) jVar.f224f).d(new i(i3, 0, jVar, bVar));
                } else {
                    jVar.a(bVar, i3);
                }
            } catch (G0.a unused) {
                jVar.f223d.a(bVar, i3 + 1, false);
            }
        } finally {
            runnable.run();
        }
    }
}
