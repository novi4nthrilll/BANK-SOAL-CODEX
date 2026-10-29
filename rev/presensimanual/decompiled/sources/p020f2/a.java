package p020f2;

import W1.C0104l;
import W1.J;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends X1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4471b;

    public a(C0104l c0104l) {
        super(c0104l);
        b bVar = b.fast;
        HashMap map = new HashMap();
        this.f4471b = map;
        map.put(b.off, 0);
        map.put(bVar, 1);
        map.put(b.highQuality, 2);
        if (J.f1705a >= 23) {
            map.put(b.minimal, 3);
            map.put(b.zeroShutterLag, 4);
        }
    }

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
        int[] iArr = (int[]) ((CameraCharacteristics) this.f1809a.e).get(CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES);
        if (iArr == null || iArr.length <= 0) {
            return;
        }
        builder.set(CaptureRequest.NOISE_REDUCTION_MODE, (Integer) this.f4471b.get(b.fast));
    }
}
