package p057r0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import k.Z0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f5606a;

    public c(d dVar) {
        this.f5606a = dVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder instanceof b) {
            GeolocatorLocationService geolocatorLocationService = ((b) iBinder).f5605b;
            d dVar = this.f5606a;
            dVar.f5609g = geolocatorLocationService;
            geolocatorLocationService.f2685i = dVar.e;
            geolocatorLocationService.f2682f++;
            Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + geolocatorLocationService.f2682f);
            Z0 z2 = dVar.f5611i;
            if (z2 != null) {
                z2.f5134h = geolocatorLocationService;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        d dVar = this.f5606a;
        GeolocatorLocationService geolocatorLocationService = dVar.f5609g;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f2684h = null;
            dVar.f5609g = null;
        }
    }
}
