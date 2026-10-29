package com.baseflow.geolocator;

import I1.AbstractActivityC0028d;
import W1.C0104l;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import p057r0.b;
import p065t0.d;
import p065t0.f;

/* JADX INFO: loaded from: classes.dex */
public class GeolocatorLocationService extends Service {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f2680n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f2686j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2681d = new b(this);
    public boolean e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2682f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2683g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AbstractActivityC0028d f2684h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f2685i = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PowerManager.WakeLock f2687k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WifiManager.WifiLock f2688l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0104l f2689m = null;

    public final void a() {
        if (this.e) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            if (Build.VERSION.SDK_INT >= 24) {
                stopForeground(1);
            } else {
                stopForeground(true);
            }
            c();
            this.e = false;
            this.f2689m = null;
        }
    }

    public final void b(C1.b bVar) {
        WifiManager wifiManager;
        PowerManager powerManager;
        c();
        if (bVar.f142b && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.f2687k = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.f2687k.acquire();
        }
        if (!bVar.f141a || (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) == null) {
            return;
        }
        WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(Build.VERSION.SDK_INT < 29 ? 3 : 4, "GeolocatorLocationService:WifiLock");
        this.f2688l = wifiLockCreateWifiLock;
        wifiLockCreateWifiLock.setReferenceCounted(false);
        this.f2688l.acquire();
    }

    public final void c() {
        PowerManager.WakeLock wakeLock = this.f2687k;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f2687k.release();
            this.f2687k = null;
        }
        WifiManager.WifiLock wifiLock = this.f2688l;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.f2688l.release();
        this.f2688l = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f2681d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d dVar;
        Log.d("FlutterGeolocator", "Destroying location service.");
        this.f2683g--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        f fVar = this.f2686j;
        if (fVar != null && (dVar = this.f2685i) != null) {
            dVar.f5708d.remove(fVar);
            fVar.d();
        }
        a();
        this.f2685i = null;
        this.f2689m = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i4) {
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
