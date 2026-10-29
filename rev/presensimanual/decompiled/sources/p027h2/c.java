package p027h2;

import D0.b;
import I1.AbstractActivityC0028d;
import W1.C0104l;
import X1.a;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f4523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4525d;

    public c(C0104l c0104l, AbstractActivityC0028d abstractActivityC0028d, b bVar) {
        super(c0104l);
        this.f4523b = 0;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) c0104l.e;
        Integer num = (Integer) cameraCharacteristics.get(key);
        num.getClass();
        this.f4523b = num;
        b bVar2 = new b(abstractActivityC0028d, bVar, ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0, this.f4523b.intValue());
        this.f4524c = bVar2;
        if (bVar2.f4522f != null) {
            return;
        }
        a aVar = new a(bVar2);
        bVar2.f4522f = aVar;
        abstractActivityC0028d.registerReceiver(aVar, b.f4517g);
        bVar2.f4522f.onReceive(abstractActivityC0028d, null);
    }

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
    }
}
