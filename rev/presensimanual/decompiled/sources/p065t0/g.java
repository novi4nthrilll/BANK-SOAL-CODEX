package p065t0;

import A.d;
import I1.AbstractActivityC0028d;
import M.j;
import N0.o;
import R1.i;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import p006b1.c;
import p013d1.I;
import p061s0.a;
import p069w.b;
import p069w.f;
import p069w.h;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationManager f5712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f5714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5715d;
    public boolean e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Location f5716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f5717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f5718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f5719i;

    public g(Context context, h hVar) {
        this.f5712a = (LocationManager) context.getSystemService("location");
        this.f5714c = hVar;
        this.f5715d = context;
        this.f5713b = new l(context, hVar);
    }

    public static boolean f(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z2 = time > 120000;
        boolean z3 = time < -120000;
        boolean z4 = time > 0;
        if (z2) {
            return true;
        }
        if (z3) {
            return false;
        }
        float accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        boolean z5 = accuracy > 0.0f;
        boolean z6 = accuracy < 0.0f;
        boolean z7 = accuracy > 200.0f;
        boolean zEquals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z6) {
            return true;
        }
        if (!z4 || z5) {
            return z4 && !z7 && zEquals;
        }
        return true;
    }

    @Override // p065t0.f
    public final void a(c cVar) {
        if (this.f5712a == null) {
            ((i) cVar.f2515d).c(Boolean.FALSE);
        } else {
            ((i) cVar.f2515d).c(Boolean.valueOf(I.a(this.f5715d)));
        }
    }

    @Override // p065t0.f
    public final boolean b(int i3, int i4) {
        return false;
    }

    @Override // p065t0.f
    public final void c(AbstractActivityC0028d abstractActivityC0028d, m mVar, a aVar) {
        long j3;
        int i3;
        float f3;
        String str;
        if (!I.a(this.f5715d)) {
            aVar.c(3);
            return;
        }
        this.f5718h = mVar;
        this.f5719i = aVar;
        int i4 = 5;
        h hVar = this.f5714c;
        if (hVar != null) {
            f3 = hVar.f5721b;
            int i5 = hVar.f5720a;
            j3 = i5 == 1 ? Long.MAX_VALUE : hVar.f5722c;
            int iB = j.b(i5);
            if (iB == 0 || iB == 1) {
                i3 = 104;
            } else {
                i3 = (iB == 3 || iB == 4 || iB == 5) ? 100 : 102;
            }
            i4 = i5;
        } else {
            j3 = 0;
            i3 = 102;
            f3 = 0.0f;
        }
        List<String> providers = this.f5712a.getProviders(true);
        if (i4 == 1) {
            str = "passive";
        } else {
            str = "fused";
            if (!providers.contains("fused") || Build.VERSION.SDK_INT < 31) {
                str = "gps";
                if (!providers.contains("gps")) {
                    str = "network";
                    if (!providers.contains("network")) {
                        str = !providers.isEmpty() ? providers.get(0) : null;
                    }
                }
            }
        }
        this.f5717g = str;
        if (str == null) {
            aVar.c(3);
            return;
        }
        d.a(j3, "intervalMillis");
        if (f3 < 0.0f) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", "minUpdateDistanceMeters", Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        if (f3 > Float.MAX_VALUE) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", "minUpdateDistanceMeters", Float.valueOf(0.0f), Float.valueOf(Float.MAX_VALUE)));
        }
        d.a(j3, "minUpdateIntervalMillis");
        boolean z2 = i3 == 104 || i3 == 102 || i3 == 100;
        Object[] objArr = {Integer.valueOf(i3)};
        if (!z2) {
            throw new IllegalArgumentException(String.format("quality must be a defined QUALITY constant, not %d", objArr));
        }
        if (!((j3 == Long.MAX_VALUE && j3 == -1) ? false : true)) {
            throw new IllegalStateException("passive location requests must have an explicit minimum update interval");
        }
        h hVar2 = new h(j3, i3, Math.min(j3, j3), f3);
        this.e = true;
        this.f5713b.b();
        String str2 = this.f5717g;
        Looper mainLooper = Looper.getMainLooper();
        WeakHashMap weakHashMap = f.f5766a;
        int i6 = Build.VERSION.SDK_INT;
        LocationManager locationManager = this.f5712a;
        if (i6 >= 31) {
            p069w.d.c(locationManager, str2, p069w.g.a(hVar2), new o(3, new Handler(mainLooper)), this);
        } else {
            if (p069w.c.a(locationManager, str2, hVar2, this, mainLooper)) {
                return;
            }
            locationManager.requestLocationUpdates(str2, j3, f3, this, mainLooper);
        }
    }

    @Override // p065t0.f
    public final void d() {
        this.e = false;
        this.f5713b.c();
        this.f5712a.removeUpdates(this);
    }

    @Override // p065t0.f
    public final void e(E1.b bVar, E1.b bVar2) {
        LocationManager locationManager = this.f5712a;
        Iterator<String> it = locationManager.getProviders(true).iterator();
        Location location = null;
        while (it.hasNext()) {
            Location lastKnownLocation = locationManager.getLastKnownLocation(it.next());
            if (lastKnownLocation != null && f(lastKnownLocation, location)) {
                location = lastKnownLocation;
            }
        }
        bVar.a(location);
    }

    @Override // android.location.LocationListener
    public final /* synthetic */ void onFlushComplete(int i3) {
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            onLocationChanged((Location) list.get(i3));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        if (str.equals(this.f5717g)) {
            if (this.e) {
                this.f5712a.removeUpdates(this);
            }
            a aVar = this.f5719i;
            if (aVar != null) {
                aVar.c(3);
            }
            this.f5717g = null;
        }
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i3, Bundle bundle) {
        if (i3 != 2 && i3 == 0) {
            onProviderDisabled(str);
        }
    }

    @Override // android.location.LocationListener
    public final synchronized void onLocationChanged(Location location) {
        if (f(location, this.f5716f)) {
            this.f5716f = location;
            if (this.f5718h != null) {
                this.f5713b.a(location);
                this.f5718h.a(this.f5716f);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }
}
