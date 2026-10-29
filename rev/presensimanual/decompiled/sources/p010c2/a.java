package p010c2;

import M.j;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class a extends X1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2679b;

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
        Boolean bool = (Boolean) ((CameraCharacteristics) this.f1809a.e).get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        int iB = j.b(this.f2679b);
        if (iB == 0) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.set(CaptureRequest.FLASH_MODE, 0);
            return;
        }
        if (iB == 1) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 2);
            builder.set(CaptureRequest.FLASH_MODE, 0);
        } else if (iB == 2) {
            builder.set(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.set(CaptureRequest.FLASH_MODE, 0);
        } else {
            if (iB != 3) {
                return;
            }
            builder.set(CaptureRequest.CONTROL_AE_MODE, 1);
            builder.set(CaptureRequest.FLASH_MODE, 2);
        }
    }
}
