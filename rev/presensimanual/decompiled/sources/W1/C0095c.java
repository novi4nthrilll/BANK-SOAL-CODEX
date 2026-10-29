package W1;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: renamed from: W1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0095c extends CameraCaptureSession.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1732a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f1733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0098f f1734c;

    public C0095c(C0098f c0098f, Runnable runnable) {
        this.f1734c = c0098f;
        this.f1733b = runnable;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        Log.i("Camera", "CameraCaptureSession onClosed");
        this.f1732a = true;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        Log.i("Camera", "CameraCaptureSession onConfigureFailed");
        this.f1734c.f1743h.Q("Failed to configure camera session.");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Log.i("Camera", "CameraCaptureSession onConfigured");
        C0098f c0098f = this.f1734c;
        if (c0098f.f1750o == null || this.f1732a) {
            c0098f.f1743h.Q("The camera was closed during configuration.");
            return;
        }
        c0098f.f1751p = cameraCaptureSession;
        Log.i("Camera", "Updating builder settings");
        CaptureRequest.Builder builder = c0098f.f1754s;
        Iterator it = c0098f.f1737a.f5762d.values().iterator();
        while (it.hasNext()) {
            ((X1.a) it.next()).a(builder);
        }
        c0098f.h(this.f1733b, new G1.a(9, this));
    }
}
