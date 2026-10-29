package p057r0;

import D0.b;
import E0.k;
import E0.n;
import I1.AbstractActivityC0028d;
import O1.a;
import S1.f;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import java.util.HashMap;
import java.util.HashSet;
import k.Z0;
import p065t0.e;
import p065t0.i;

/* JADX INFO: loaded from: classes.dex */
public class d implements a, P1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p066u0.a f5607d;
    public final p065t0.d e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f5608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GeolocatorLocationService f5609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z0 f5610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Z0 f5611i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f5612j = new c(this);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f5613k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k f5614l;

    public d() {
        p066u0.a aVar;
        synchronized (p066u0.a.class) {
            try {
                if (p066u0.a.f5749d == null) {
                    p066u0.a.f5749d = new p066u0.a();
                }
                aVar = p066u0.a.f5749d;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f5607d = aVar;
        this.e = p065t0.d.c();
        this.f5608f = e.g();
    }

    @Override // O1.a
    public final void b(b bVar) {
        i iVar;
        p066u0.a aVar = this.f5607d;
        p065t0.d dVar = this.e;
        e eVar = this.f5608f;
        Z0 z2 = new Z0();
        z2.e = aVar;
        z2.f5132f = dVar;
        z2.f5133g = eVar;
        z2.f5134h = new HashMap();
        this.f5610h = z2;
        Context context = (Context) bVar.e;
        if (((n) z2.f5136j) != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            n nVar = (n) z2.f5136j;
            if (nVar == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                nVar.f(null);
                z2.f5136j = null;
            }
        }
        f fVar = (f) bVar.f182f;
        n nVar2 = new n(fVar, "flutter.baseflow.com/geolocator_android");
        z2.f5136j = nVar2;
        nVar2.f(z2);
        z2.f5131d = context;
        Z0 z3 = new Z0();
        z3.e = aVar;
        z3.f5135i = dVar;
        this.f5611i = z3;
        if (((b) z3.f5132f) != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            z3.i();
        }
        b bVar2 = new b(fVar, "flutter.baseflow.com/geolocator_updates_android");
        z3.f5132f = bVar2;
        bVar2.R(z3);
        Context context2 = (Context) bVar.e;
        z3.f5131d = context2;
        b bVar3 = new b(25, false);
        this.f5613k = bVar3;
        bVar3.f182f = context2;
        if (((b) bVar3.e) != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            if (((b) bVar3.e) != null) {
                Context context3 = (Context) bVar3.f182f;
                if (context3 != null && (iVar = (i) bVar3.f183g) != null) {
                    context3.unregisterReceiver(iVar);
                }
                ((b) bVar3.e).R(null);
                bVar3.e = null;
            }
        }
        b bVar4 = new b(fVar, "flutter.baseflow.com/geolocator_service_updates_android");
        bVar3.e = bVar4;
        bVar4.R(bVar3);
        bVar3.f182f = context2;
        context2.bindService(new Intent(context2, (Class<?>) GeolocatorLocationService.class), this.f5612j, 1);
    }

    @Override // P1.a
    public final void c() {
        k kVar = this.f5614l;
        if (kVar != null) {
            ((HashSet) kVar.f227f).remove(this.e);
            ((HashSet) this.f5614l.e).remove(this.f5607d);
        }
        Z0 z2 = this.f5610h;
        if (z2 != null) {
            z2.f5135i = null;
        }
        Z0 z3 = this.f5611i;
        if (z3 != null) {
            if (((p065t0.f) z3.f5136j) != null && ((b) z3.f5132f) != null) {
                z3.i();
            }
            z3.f5133g = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f5609g;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f2684h = null;
        }
        if (this.f5614l != null) {
            this.f5614l = null;
        }
    }

    @Override // P1.a
    public final void d() {
        c();
    }

    @Override // P1.a
    public final void e(k kVar) {
        this.f5614l = kVar;
        if (kVar != null) {
            ((HashSet) kVar.f227f).add(this.e);
            ((HashSet) this.f5614l.e).add(this.f5607d);
        }
        Z0 z2 = this.f5610h;
        if (z2 != null) {
            z2.f5135i = (AbstractActivityC0028d) kVar.f226d;
        }
        Z0 z3 = this.f5611i;
        if (z3 != null) {
            AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) kVar.f226d;
            if (abstractActivityC0028d == null && ((p065t0.f) z3.f5136j) != null && ((b) z3.f5132f) != null) {
                z3.i();
            }
            z3.f5133g = abstractActivityC0028d;
        }
        GeolocatorLocationService geolocatorLocationService = this.f5609g;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f2684h = (AbstractActivityC0028d) this.f5614l.f226d;
        }
    }

    @Override // P1.a
    public final void f(k kVar) {
        e(kVar);
    }

    @Override // O1.a
    public final void k(b bVar) {
        Context context = (Context) bVar.e;
        GeolocatorLocationService geolocatorLocationService = this.f5609g;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.f2682f--;
            Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + geolocatorLocationService.f2682f);
        }
        context.unbindService(this.f5612j);
        Z0 z2 = this.f5610h;
        if (z2 != null) {
            n nVar = (n) z2.f5136j;
            if (nVar == null) {
                Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            } else {
                nVar.f(null);
                z2.f5136j = null;
            }
            this.f5610h.f5135i = null;
            this.f5610h = null;
        }
        Z0 z3 = this.f5611i;
        if (z3 != null) {
            z3.i();
            this.f5611i.f5134h = null;
            this.f5611i = null;
        }
        b bVar2 = this.f5613k;
        if (bVar2 != null) {
            bVar2.f182f = null;
            if (((b) bVar2.e) != null) {
                ((b) bVar2.e).R(null);
                bVar2.e = null;
            }
            this.f5613k = null;
        }
        GeolocatorLocationService geolocatorLocationService2 = this.f5609g;
        if (geolocatorLocationService2 != null) {
            geolocatorLocationService2.f2684h = null;
        }
    }
}
