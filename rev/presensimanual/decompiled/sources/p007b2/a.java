package p007b2;

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
    public Size f2557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0104l f2558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MeteringRectangle f2559d;
    public final c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2560f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MeteringRectangle[] f2561g;

    public a(C0104l c0104l, c cVar) {
        super(c0104l);
        this.f2560f = false;
        this.e = cVar;
    }

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
        Integer num = (Integer) ((CameraCharacteristics) this.f1809a.e).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null || num.intValue() <= 0) {
            return;
        }
        if (!this.f2560f) {
            this.f2561g = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AE_REGIONS);
            this.f2560f = true;
        }
        MeteringRectangle meteringRectangle = this.f2559d;
        if (meteringRectangle != null) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
        } else {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, this.f2561g);
        }
    }

    public final void b() {
        Size size = this.f2557b;
        if (size == null) {
            throw new AssertionError("The cameraBoundaries should be set (using `ExposurePointFeature.setCameraBoundaries(Size)`) before updating the exposure point.");
        }
        C0104l c0104l = this.f2558c;
        if (c0104l == null) {
            this.f2559d = null;
            return;
        }
        c cVar = this.e;
        int i3 = cVar.f4525d;
        this.f2559d = B.a(size, ((Double) c0104l.e).doubleValue(), ((Double) this.f2558c.f1774d).doubleValue(), i3 == 0 ? cVar.f4524c.e : i3);
    }
}
