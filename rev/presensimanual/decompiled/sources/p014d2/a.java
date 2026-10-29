package p014d2;

import W1.C0104l;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import p013d1.B;
import p027h2.c;

/* JADX INFO: loaded from: classes.dex */
public final class a extends X1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Size f3922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0104l f3923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MeteringRectangle f3924d;
    public final c e;

    public a(C0104l c0104l, c cVar) {
        super(c0104l);
        this.e = cVar;
    }

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
        Integer num = (Integer) ((CameraCharacteristics) this.f1809a.e).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null || num.intValue() <= 0) {
            return;
        }
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
        MeteringRectangle meteringRectangle = this.f3924d;
        builder.set(key, meteringRectangle == null ? null : new MeteringRectangle[]{meteringRectangle});
    }

    public final void b() {
        Size size = this.f3922b;
        if (size == null) {
            throw new AssertionError("The cameraBoundaries should be set (using `FocusPointFeature.setCameraBoundaries(Size)`) before updating the focus point.");
        }
        C0104l c0104l = this.f3923c;
        if (c0104l == null) {
            this.f3924d = null;
            return;
        }
        c cVar = this.e;
        int i3 = cVar.f4525d;
        this.f3924d = B.a(size, ((Double) c0104l.e).doubleValue(), ((Double) this.f3923c.f1774d).doubleValue(), i3 == 0 ? cVar.f4524c.e : i3);
    }
}
