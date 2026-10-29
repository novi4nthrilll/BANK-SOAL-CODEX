package W1;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: renamed from: W1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0094b extends CameraDevice.StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p024g2.a f1730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0098f f1731b;

    public C0094b(C0098f c0098f, p024g2.a aVar) {
        this.f1731b = c0098f;
        this.f1730a = aVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        Log.i("Camera", "open | onClosed");
        C0098f c0098f = this.f1731b;
        c0098f.f1750o = null;
        if (c0098f.f1751p != null) {
            Log.i("Camera", "closeCaptureSession");
            c0098f.f1751p.close();
            c0098f.f1751p = null;
        }
        D0.b bVar = c0098f.f1743h;
        ((Handler) bVar.e).post(new M1.c(8, bVar));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        Log.i("Camera", "open | onDisconnected");
        C0098f c0098f = this.f1731b;
        c0098f.a();
        c0098f.f1743h.Q("The camera was disconnected.");
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i3) {
        String str;
        Log.i("Camera", "open | onError");
        C0098f c0098f = this.f1731b;
        c0098f.a();
        if (i3 == 1) {
            str = "The camera device is in use already.";
        } else if (i3 == 2) {
            str = "Max cameras in use";
        } else if (i3 == 3) {
            str = "The camera device could not be opened due to a device policy.";
        } else if (i3 != 4) {
            str = i3 != 5 ? "Unknown camera error" : "The camera service has encountered a fatal error.";
        } else {
            str = "The camera device has encountered a fatal error";
        }
        c0098f.f1743h.Q(str);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        W.g gVar;
        C0098f c0098f = this.f1731b;
        c0098f.f1750o = new A0.g(c0098f, cameraDevice, 29, false);
        try {
            if (c0098f.f1756u) {
                gVar = null;
            } else {
                gVar = new W.g(2, this, this.f1730a);
            }
            c0098f.p(gVar);
        } catch (Exception e) {
            c0098f.f1743h.Q(e.getMessage() == null ? e.getClass().getName().concat(" occurred while opening camera.") : e.getMessage());
            c0098f.a();
        }
    }
}
