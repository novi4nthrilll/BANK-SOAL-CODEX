package A1;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f40b;

    public e(int i3, PointF pointF) {
        this.f39a = i3;
        this.f40b = pointF;
    }

    public final String toString() {
        D0.b bVar = new D0.b("FaceLandmark");
        bVar.T("type", this.f39a);
        bVar.U(this.f40b, "position");
        return bVar.toString();
    }
}
