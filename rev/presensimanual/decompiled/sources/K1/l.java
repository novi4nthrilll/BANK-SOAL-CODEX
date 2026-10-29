package K1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f775a;

    public l() {
        Looper mainLooper = Looper.getMainLooper();
        this.f775a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // K1.e
    public final void a(c cVar) {
        this.f775a.post(cVar);
    }
}
