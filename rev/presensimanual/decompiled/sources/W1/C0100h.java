package W1;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;

/* JADX INFO: renamed from: W1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0100h extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0098f f1765a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0104l f1767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D0.b f1768d;
    public final CaptureResult.Key e = CaptureResult.CONTROL_AE_STATE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CaptureResult.Key f1769f = CaptureResult.CONTROL_AF_STATE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1766b = 1;

    public C0100h(C0098f c0098f, C0104l c0104l, D0.b bVar) {
        this.f1765a = c0098f;
        this.f1767c = c0104l;
        this.f1768d = bVar;
    }

    public final void a(CaptureResult captureResult) {
        String str;
        Integer num = (Integer) captureResult.get(this.e);
        Integer num2 = (Integer) captureResult.get(this.f1769f);
        if (captureResult instanceof TotalCaptureResult) {
            Float f3 = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
            Long l3 = (Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME);
            Integer num3 = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
            D0.b bVar = this.f1768d;
            bVar.e = f3;
            bVar.f182f = l3;
            bVar.f183g = num3;
        }
        if (this.f1766b != 1) {
            StringBuilder sb = new StringBuilder("CameraCaptureCallback | state: ");
            int i3 = this.f1766b;
            if (i3 == 1) {
                str = "STATE_PREVIEW";
            } else if (i3 == 2) {
                str = "STATE_WAITING_FOCUS";
            } else if (i3 == 3) {
                str = "STATE_WAITING_PRECAPTURE_START";
            } else if (i3 != 4) {
                str = i3 != 5 ? "null" : "STATE_CAPTURING";
            } else {
                str = "STATE_WAITING_PRECAPTURE_DONE";
            }
            sb.append(str);
            sb.append(" | afState: ");
            sb.append(num2);
            sb.append(" | aeState: ");
            sb.append(num);
            Log.d("CameraCaptureCallback", sb.toString());
        }
        int iB = M.j.b(this.f1766b);
        C0098f c0098f = this.f1765a;
        C0104l c0104l = this.f1767c;
        if (iB == 1) {
            if (num2 == null) {
                return;
            }
            if (num2.intValue() == 4 || num2.intValue() == 5) {
                if (num == null || num.intValue() == 2) {
                    c0098f.e();
                    return;
                } else {
                    c0098f.i();
                    return;
                }
            }
            if (((p037k2.a) c0104l.e).a()) {
                Log.w("CameraCaptureCallback", "Focus timeout, moving on with capture");
                if (num == null || num.intValue() == 2) {
                    c0098f.e();
                    return;
                } else {
                    c0098f.i();
                    return;
                }
            }
            return;
        }
        if (iB != 2) {
            if (iB != 3) {
                return;
            }
            if (num == null || num.intValue() != 5) {
                c0098f.e();
                return;
            } else {
                if (((p037k2.a) c0104l.f1774d).a()) {
                    Log.w("CameraCaptureCallback", "Metering timeout waiting for pre-capture to finish, moving on with capture");
                    c0098f.e();
                    return;
                }
                return;
            }
        }
        if (num == null || num.intValue() == 2 || num.intValue() == 5 || num.intValue() == 4) {
            this.f1766b = 4;
        } else if (((p037k2.a) c0104l.f1774d).a()) {
            Log.w("CameraCaptureCallback", "Metering timeout waiting for pre-capture to start, moving on with capture");
            this.f1766b = 4;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        a(totalCaptureResult);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        a(captureResult);
    }
}
