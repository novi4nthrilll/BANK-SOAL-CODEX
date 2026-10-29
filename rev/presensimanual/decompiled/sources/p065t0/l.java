package p065t0;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f5729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f5730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f5731d;
    public final k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f5733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f5734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Calendar f5735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5736j = false;

    /* JADX WARN: Type inference failed for: r2v4, types: [t0.j] */
    public l(Context context, h hVar) {
        this.f5728a = context;
        this.f5730c = hVar;
        this.f5729b = (LocationManager) context.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f5731d = new OnNmeaMessageListener() { // from class: t0.j
                @Override // android.location.OnNmeaMessageListener
                public final void onNmeaMessage(String str, long j3) {
                    l lVar = this.f5726a;
                    lVar.getClass();
                    if (str.trim().matches("^\\$..GGA.*$")) {
                        lVar.f5732f = str;
                        lVar.f5735i = Calendar.getInstance();
                    }
                }
            };
            this.e = new k(this);
        }
    }

    public final void a(Location location) {
        h hVar;
        if (location == null) {
            return;
        }
        if (location.getExtras() == null) {
            location.setExtras(Bundle.EMPTY);
        }
        location.getExtras().putDouble("geolocator_mslSatelliteCount", this.f5733g);
        location.getExtras().putDouble("geolocator_mslSatellitesUsedInFix", this.f5734h);
        if (this.f5732f == null || (hVar = this.f5730c) == null || !this.f5736j) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, -5);
        Calendar calendar2 = this.f5735i;
        if ((calendar2 == null || !calendar2.before(calendar)) && hVar.f5723d) {
            String[] strArrSplit = this.f5732f.split(",");
            String str = strArrSplit[0];
            if (!this.f5732f.trim().matches("^\\$..GGA.*$") || strArrSplit.length <= 9 || strArrSplit[9].isEmpty()) {
                return;
            }
            double d3 = Double.parseDouble(strArrSplit[9]);
            if (location.getExtras() == null) {
                location.setExtras(Bundle.EMPTY);
            }
            location.getExtras().putDouble("geolocator_mslAltitude", d3);
        }
    }

    public final void b() {
        LocationManager locationManager;
        if (this.f5736j || this.f5730c == null || Build.VERSION.SDK_INT < 24 || (locationManager = this.f5729b) == null || this.f5728a.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        locationManager.addNmeaListener(this.f5731d, (Handler) null);
        locationManager.registerGnssStatusCallback(this.e, (Handler) null);
        this.f5736j = true;
    }

    public final void c() {
        LocationManager locationManager;
        if (this.f5730c == null || Build.VERSION.SDK_INT < 24 || (locationManager = this.f5729b) == null) {
            return;
        }
        locationManager.removeNmeaListener(this.f5731d);
        locationManager.unregisterGnssStatusCallback(this.e);
        this.f5736j = false;
    }
}
