package Z1;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class a extends X1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1953b;

    @Override // X1.a
    public final void a(CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(this.f1953b == 2));
    }
}
