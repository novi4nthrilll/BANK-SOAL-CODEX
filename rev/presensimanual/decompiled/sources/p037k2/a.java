package p037k2;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5283a = SystemClock.elapsedRealtime();

    public final boolean a() {
        return SystemClock.elapsedRealtime() - this.f5283a > 3000;
    }
}
