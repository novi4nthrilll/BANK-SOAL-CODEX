package p065t0;

import android.location.GnssStatus;

/* JADX INFO: loaded from: classes.dex */
public final class k extends GnssStatus.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f5727a;

    public k(l lVar) {
        this.f5727a = lVar;
    }

    @Override // android.location.GnssStatus.Callback
    public final void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        this.f5727a.f5733g = gnssStatus.getSatelliteCount();
        this.f5727a.f5734h = 0.0d;
        for (int i3 = 0; i3 < this.f5727a.f5733g; i3++) {
            if (gnssStatus.usedInFix(i3)) {
                this.f5727a.f5734h += 1.0d;
            }
        }
    }
}
