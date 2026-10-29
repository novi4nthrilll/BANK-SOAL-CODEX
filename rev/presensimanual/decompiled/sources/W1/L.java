package W1;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class L extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1707d;

    public L(M m3) {
        this.f1707d = m3;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        M m3;
        this.f1707d.a();
        while (!Thread.interrupted()) {
            try {
                synchronized (this.f1707d.f1724r) {
                    while (!this.f1707d.f1725s.booleanValue()) {
                        try {
                            this.f1707d.f1724r.wait(500L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    m3 = this.f1707d;
                    m3.f1725s = Boolean.FALSE;
                }
                m3.f1721o.updateTexImage();
                float[] fArr = new float[16];
                this.f1707d.f1721o.getTransformMatrix(fArr);
                M m4 = this.f1707d;
                m4.b(m4.f1726t, m4.f1727u, fArr);
            } catch (InterruptedException unused) {
                Log.d("VideoRenderer", "thread interrupted while waiting for frames");
                return;
            }
        }
    }
}
