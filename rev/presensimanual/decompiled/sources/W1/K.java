package W1;

import android.graphics.SurfaceTexture;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class K implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f1706a;

    public K(M m3) {
        this.f1706a = m3;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f1706a.f1724r) {
            try {
                if (this.f1706a.f1725s.booleanValue()) {
                    Log.w("VideoRenderer", "Frame available before processing other frames. dropping frames");
                }
                M m3 = this.f1706a;
                m3.f1725s = Boolean.TRUE;
                m3.f1724r.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
