package p031i2;

import W1.C0104l;
import W1.J;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class a extends X1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f4605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f4606d;
    public final Float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Float f4607f;

    public a(C0104l c0104l) {
        super(c0104l);
        Float fValueOf = Float.valueOf(1.0f);
        this.f4606d = fValueOf;
        this.e = fValueOf;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) c0104l.e;
        Rect rect = (Rect) cameraCharacteristics.get(key);
        this.f4605c = rect;
        if (rect == null) {
            this.f4607f = fValueOf;
            this.f4604b = false;
            return;
        }
        if (J.f1705a >= 30) {
            Range range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            this.e = range != null ? (Float) range.getLower() : null;
            Range range2 = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            this.f4607f = range2 != null ? (Float) range2.getUpper() : null;
        } else {
            this.e = fValueOf;
            Float f3 = (Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
            if (f3 != null && f3.floatValue() >= 1.0f) {
                fValueOf = f3;
            }
            this.f4607f = fValueOf;
        }
        this.f4604b = Float.compare(this.f4607f.floatValue(), this.e.floatValue()) > 0;
    }

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
        if (this.f4604b) {
            boolean z2 = J.f1705a >= 30;
            Float f3 = this.e;
            Float f4 = this.f4607f;
            if (z2) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_ZOOM_RATIO;
                float fFloatValue = this.f4606d.floatValue();
                float fFloatValue2 = f3.floatValue();
                float fFloatValue3 = f4.floatValue();
                if (fFloatValue < fFloatValue2) {
                    fFloatValue = fFloatValue2;
                } else if (fFloatValue > fFloatValue3) {
                    fFloatValue = fFloatValue3;
                }
                builder.set(key, Float.valueOf(fFloatValue));
                return;
            }
            float fFloatValue4 = this.f4606d.floatValue();
            float fFloatValue5 = f3.floatValue();
            float fFloatValue6 = f4.floatValue();
            if (fFloatValue4 < fFloatValue5) {
                fFloatValue4 = fFloatValue5;
            } else if (fFloatValue4 > fFloatValue6) {
                fFloatValue4 = fFloatValue6;
            }
            Rect rect = this.f4605c;
            int iWidth = rect.width() / 2;
            int iHeight = rect.height() / 2;
            int iWidth2 = (int) ((rect.width() * 0.5f) / fFloatValue4);
            int iHeight2 = (int) ((rect.height() * 0.5f) / fFloatValue4);
            builder.set(CaptureRequest.SCALER_CROP_REGION, new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2));
        }
    }
}
