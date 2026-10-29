package p069w;

import android.location.GnssMeasurementsEvent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static boolean a(LocationManager locationManager, String str) {
        return locationManager.hasProvider(str);
    }

    public static boolean b(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        return locationManager.registerGnssMeasurementsCallback(executor, callback);
    }

    public static void c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
        locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
    }
}
