package Y1;

import M.j;
import W1.C0104l;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class a extends X1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1936c;

    public a(C0104l c0104l, boolean z2) {
        super(c0104l);
        this.f1935b = 1;
        this.f1936c = z2;
    }

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
        if (b()) {
            int iB = j.b(this.f1935b);
            if (iB == 0) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f1936c ? 3 : 4));
            } else {
                if (iB != 1) {
                    return;
                }
                builder.set(CaptureRequest.CONTROL_AF_MODE, 1);
            }
        }
    }

    public final boolean b() {
        C0104l c0104l = this.f1809a;
        int[] iArr = (int[]) ((CameraCharacteristics) c0104l.e).get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        Float f3 = (Float) ((CameraCharacteristics) c0104l.e).get(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f3 == null || f3.floatValue() == 0.0f || iArr.length == 0) {
            return false;
        }
        return (iArr.length == 1 && iArr[0] == 0) ? false : true;
    }
}
