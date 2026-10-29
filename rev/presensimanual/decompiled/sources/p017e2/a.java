package p017e2;

import W1.C0104l;
import W1.p;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class a extends X1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Range f4388c = new Range(30, 30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Range f4389b;

    public a(C0104l c0104l) {
        Range range;
        super(c0104l);
        String str = p.f1783a;
        String str2 = p.f1784b;
        if (str != null && str.equals("google") && str2 != null && str2.equals("Pixel 4a")) {
            this.f4389b = f4388c;
            return;
        }
        Range[] rangeArr = (Range[]) ((CameraCharacteristics) c0104l.e).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr != null) {
            for (Range range2 : rangeArr) {
                int iIntValue = ((Integer) range2.getUpper()).intValue();
                if (iIntValue >= 10 && ((range = this.f4389b) == null || iIntValue > ((Integer) range.getUpper()).intValue())) {
                    this.f4389b = range2;
                }
            }
        }
    }

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.f4389b);
    }
}
