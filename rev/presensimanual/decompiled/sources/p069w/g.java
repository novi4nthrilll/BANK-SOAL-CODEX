package p069w;

import android.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static LocationRequest a(h hVar) {
        LocationRequest.Builder quality = new LocationRequest.Builder(hVar.f5768b).setQuality(hVar.f5767a);
        long j3 = hVar.f5769c;
        if (j3 == -1) {
            j3 = hVar.f5768b;
        }
        return quality.setMinUpdateIntervalMillis(j3).setDurationMillis(Long.MAX_VALUE).setMaxUpdates(Integer.MAX_VALUE).setMinUpdateDistanceMeters(hVar.f5770d).setMaxUpdateDelayMillis(0L).build();
    }
}
