package p075y;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5856d;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f5856d = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f5856d);
        super.run();
    }
}
