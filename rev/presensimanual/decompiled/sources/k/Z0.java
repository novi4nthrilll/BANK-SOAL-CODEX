package k;

import B.C0006g;
import I1.AbstractActivityC0028d;
import O0.C0092f;
import W1.C0098f;
import W1.C0104l;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.baseflow.geolocator.GeolocatorLocationService;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p013d1.AbstractC0419b3;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 implements S1.m, S1.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5131d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f5135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f5136j;

    public static void d(Exception exc, W1.s sVar) {
        if (exc instanceof CameraAccessException) {
            sVar.c(new W1.u("CameraAccess", exc.getMessage(), null));
        } else {
            sVar.c(new W1.u("error", exc.getMessage(), null));
        }
    }

    public static void e(Exception exc, W1.I i3) {
        if (exc instanceof CameraAccessException) {
            i3.c(new W1.u("CameraAccess", exc.getMessage(), null));
        } else {
            i3.c(new W1.u("error", exc.getMessage(), null));
        }
    }

    @Override // S1.m
    public void a(A0.g gVar, R1.i iVar) {
        int i3;
        boolean z2;
        boolean z3;
        String str = (String) gVar.e;
        str.getClass();
        HashMap map = (HashMap) this.f5134h;
        int i4 = 2;
        int i5 = 1;
        p065t0.d dVar = (p065t0.d) this.f5132f;
        int i6 = 4;
        p066u0.a aVar = (p066u0.a) this.e;
        Object obj = gVar.f19f;
        switch (str) {
            case "getCurrentPosition":
                try {
                    Context context = (Context) this.f5131d;
                    aVar.getClass();
                    if (!p066u0.a.d(context)) {
                        iVar.a(p013d1.I.c(5), p013d1.I.b(5), null);
                        return;
                    }
                    Map map2 = (Map) obj;
                    boolean zBooleanValue = map2.get("forceLocationManager") != null ? ((Boolean) map2.get("forceLocationManager")).booleanValue() : false;
                    p065t0.h hVarA = p065t0.h.a(map2);
                    String str2 = (String) map2.get("requestId");
                    boolean[] zArr = {false};
                    Context context2 = (Context) this.f5131d;
                    dVar.getClass();
                    p065t0.f fVarB = p065t0.d.b(context2, zBooleanValue, hVarA);
                    map.put(str2, fVarB);
                    AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) this.f5135i;
                    p057r0.e eVar = new p057r0.e(this, zArr, fVarB, str2, iVar);
                    p057r0.e eVar2 = new p057r0.e(this, zArr, fVarB, str2, iVar);
                    dVar.f5708d.add(fVarB);
                    fVarB.c(abstractActivityC0028d, eVar, eVar2);
                    return;
                } catch (p061s0.b unused) {
                    iVar.a(p013d1.I.c(4), p013d1.I.b(4), null);
                    return;
                }
            case "getLastKnownPosition":
                try {
                    Context context3 = (Context) this.f5131d;
                    aVar.getClass();
                    if (!p066u0.a.d(context3)) {
                        iVar.a(p013d1.I.c(5), p013d1.I.b(5), null);
                        return;
                    }
                    Boolean bool = (Boolean) gVar.k("forceLocationManager");
                    Context context4 = (Context) this.f5131d;
                    boolean z4 = bool != null && bool.booleanValue();
                    E1.b bVar = new E1.b(iVar, 3);
                    E1.b bVar2 = new E1.b(iVar, i6);
                    dVar.getClass();
                    p065t0.d.b(context4, z4, null).e(bVar, bVar2);
                    return;
                } catch (p061s0.b unused2) {
                    iVar.a(p013d1.I.c(4), p013d1.I.b(4), null);
                    return;
                }
            case "openLocationSettings":
                Context context5 = (Context) this.f5131d;
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.addFlags(268435456);
                    intent.addFlags(1073741824);
                    intent.addFlags(8388608);
                    context5.startActivity(intent);
                    z2 = true;
                } catch (Exception unused3) {
                    z2 = false;
                }
                iVar.c(Boolean.valueOf(z2));
                return;
            case "openAppSettings":
                Context context6 = (Context) this.f5131d;
                try {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.addCategory("android.intent.category.DEFAULT");
                    intent2.setData(Uri.parse("package:" + context6.getPackageName()));
                    intent2.addFlags(268435456);
                    intent2.addFlags(1073741824);
                    intent2.addFlags(8388608);
                    context6.startActivity(intent2);
                    z3 = true;
                } catch (Exception unused4) {
                    z3 = false;
                }
                iVar.c(Boolean.valueOf(z3));
                return;
            case "isLocationServiceEnabled":
                Context context7 = (Context) this.f5131d;
                p006b1.c cVar = new p006b1.c();
                cVar.f2515d = iVar;
                if (context7 == null) {
                    dVar.getClass();
                    ((R1.i) cVar.f2515d).a(p013d1.I.c(3), p013d1.I.b(3), null);
                }
                dVar.getClass();
                p065t0.d.b(context7, false, null).a(cVar);
                return;
            case "checkPermission":
                try {
                    Context context8 = (Context) this.f5131d;
                    aVar.getClass();
                    int iB = M.j.b(p066u0.a.b(context8));
                    if (iB == 0) {
                        i3 = 0;
                    } else if (iB == 1) {
                        i3 = 1;
                    } else if (iB == 2) {
                        i3 = 2;
                    } else {
                        if (iB != 3) {
                            throw new IndexOutOfBoundsException();
                        }
                        i3 = 3;
                    }
                    iVar.c(Integer.valueOf(i3));
                    return;
                } catch (p061s0.b unused5) {
                    iVar.a(p013d1.I.c(4), p013d1.I.b(4), null);
                    return;
                }
            case "requestPermission":
                try {
                    aVar.e((AbstractActivityC0028d) this.f5135i, new E1.b(iVar, i5), new E1.b(iVar, i4));
                    return;
                } catch (p061s0.b unused6) {
                    iVar.a(p013d1.I.c(4), p013d1.I.b(4), null);
                    return;
                }
            case "getLocationAccuracy":
                Context context9 = (Context) this.f5131d;
                ((p065t0.e) this.f5133g).getClass();
                if (AbstractC0419b3.a(context9, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    if (AbstractC0419b3.a(context9, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        i4 = 1;
                    } else {
                        iVar.a(p013d1.I.c(5), p013d1.I.b(5), null);
                        i4 = 0;
                    }
                }
                if (i4 != 0) {
                    iVar.c(Integer.valueOf(M.j.b(i4)));
                    return;
                }
                return;
            case "cancelGetCurrentPosition":
                String str3 = (String) ((Map) obj).get("requestId");
                p065t0.f fVar = (p065t0.f) map.get(str3);
                if (fVar != null) {
                    fVar.d();
                }
                map.remove(str3);
                iVar.c(null);
                return;
            default:
                iVar.b();
                return;
        }
    }

    public void b(boolean z2) {
        p065t0.d dVar;
        p065t0.d dVar2;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = (GeolocatorLocationService) this.f5134h;
        if (geolocatorLocationService == null || (!z2 ? geolocatorLocationService.f2682f == 0 : geolocatorLocationService.f2683g == 1)) {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            geolocatorLocationService.f2683g--;
            Log.d("FlutterGeolocator", "Stopping location service.");
            p065t0.f fVar = geolocatorLocationService.f2686j;
            if (fVar != null && (dVar2 = geolocatorLocationService.f2685i) != null) {
                dVar2.f5708d.remove(fVar);
                fVar.d();
            }
            ((GeolocatorLocationService) this.f5134h).a();
        }
        p065t0.f fVar2 = (p065t0.f) this.f5136j;
        if (fVar2 == null || (dVar = (p065t0.d) this.f5135i) == null) {
            return;
        }
        dVar.f5708d.remove(fVar2);
        fVar2.d();
        this.f5136j = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // S1.h
    public void c(Object obj, S1.g gVar) throws IOException {
        Map map;
        C1.b bVar = null;
        bVar = null;
        try {
            p066u0.a aVar = (p066u0.a) this.e;
            Context context = (Context) this.f5131d;
            aVar.getClass();
            if (!p066u0.a.d(context)) {
                gVar.a(p013d1.I.c(5), p013d1.I.b(5), null);
                return;
            }
            if (((GeolocatorLocationService) this.f5134h) == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
                return;
            }
            Map map2 = (Map) obj;
            boolean zBooleanValue = (map2 == null || map2.get("forceLocationManager") == null) ? false : ((Boolean) map2.get("forceLocationManager")).booleanValue();
            p065t0.h hVarA = p065t0.h.a(map2);
            if (map2 != null && (map = (Map) map2.get("foregroundNotificationConfig")) != null) {
                Map map3 = (Map) map.get("notificationIcon");
                C0092f c0092f = map3 == null ? null : new C0092f((String) map3.get("name"), (String) map3.get("defType"));
                String str = (String) map.get("notificationTitle");
                String str2 = (String) map.get("notificationChannelName");
                String str3 = (String) map.get("notificationText");
                Boolean bool = (Boolean) map.get("enableWifiLock");
                Boolean bool2 = (Boolean) map.get("enableWakeLock");
                Boolean bool3 = (Boolean) map.get("setOngoing");
                Object obj2 = map.get("color");
                bVar = new C1.b(str, str3, str2, c0092f, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), obj2 != null ? Integer.valueOf(((Number) obj2).intValue()) : null);
            }
            if (bVar == null) {
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                Context context2 = (Context) this.f5131d;
                boolean zEquals = Boolean.TRUE.equals(Boolean.valueOf(zBooleanValue));
                p065t0.d dVar = (p065t0.d) this.f5135i;
                dVar.getClass();
                p065t0.f fVarB = p065t0.d.b(context2, zEquals, hVarA);
                this.f5136j = fVarB;
                AbstractActivityC0028d abstractActivityC0028d = (AbstractActivityC0028d) this.f5133g;
                p057r0.a aVar2 = new p057r0.a(gVar, 2);
                p057r0.a aVar3 = new p057r0.a(gVar, 3);
                dVar.f5708d.add(fVarB);
                fVarB.c(abstractActivityC0028d, aVar2, aVar3);
                return;
            }
            Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
            GeolocatorLocationService geolocatorLocationService = (GeolocatorLocationService) this.f5134h;
            geolocatorLocationService.f2683g++;
            if (geolocatorLocationService.f2685i != null) {
                p065t0.f fVarB2 = p065t0.d.b(geolocatorLocationService.getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(zBooleanValue)), hVarA);
                geolocatorLocationService.f2686j = fVarB2;
                p065t0.d dVar2 = geolocatorLocationService.f2685i;
                AbstractActivityC0028d abstractActivityC0028d2 = geolocatorLocationService.f2684h;
                p057r0.a aVar4 = new p057r0.a(gVar, 0);
                p057r0.a aVar5 = new p057r0.a(gVar, 1);
                dVar2.f5708d.add(fVarB2);
                fVarB2.c(abstractActivityC0028d2, aVar4, aVar5);
            }
            GeolocatorLocationService geolocatorLocationService2 = (GeolocatorLocationService) this.f5134h;
            if (geolocatorLocationService2.f2689m != null) {
                Log.d("FlutterGeolocator", "Service already in foreground mode.");
                C0104l c0104l = geolocatorLocationService2.f2689m;
                if (c0104l != null) {
                    c0104l.g(bVar, geolocatorLocationService2.e);
                    geolocatorLocationService2.b(bVar);
                }
            } else {
                Log.d("FlutterGeolocator", "Start service in foreground mode.");
                Context applicationContext = geolocatorLocationService2.getApplicationContext();
                C0104l c0104l2 = new C0104l();
                c0104l2.e = applicationContext;
                p054q.g gVar2 = new p054q.g(applicationContext, "geolocator_channel_01");
                gVar2.f5570h = 1;
                c0104l2.f1774d = gVar2;
                c0104l2.g(bVar, false);
                geolocatorLocationService2.f2689m = c0104l2;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 26) {
                    p054q.v vVar = new p054q.v(applicationContext);
                    io.flutter.view.b.g();
                    NotificationChannel notificationChannelB = io.flutter.view.b.b((String) bVar.f145f);
                    notificationChannelB.setLockscreenVisibility(0);
                    if (i3 >= 26) {
                        p054q.q.a(vVar.f5597a, notificationChannelB);
                    }
                }
                geolocatorLocationService2.startForeground(75415, ((p054q.g) geolocatorLocationService2.f2689m.f1774d).a());
                geolocatorLocationService2.e = true;
            }
            geolocatorLocationService2.b(bVar);
        } catch (p061s0.b unused) {
            gVar.a(p013d1.I.c(4), p013d1.I.b(4), null);
        }
    }

    public void f(W1.D d3) {
        int i3;
        C0098f c0098f = (C0098f) this.f5136j;
        if (c0098f == null) {
            throw new W1.u("cameraNotFound", "Camera not found. Please call the 'create' method before calling 'initialize'.", null);
        }
        try {
            int iOrdinal = d3.ordinal();
            if (iOrdinal == 0) {
                i3 = 35;
            } else if (iOrdinal == 1) {
                i3 = 256;
            } else {
                if (iOrdinal != 2) {
                    throw new IllegalStateException("Unreachable code");
                }
                i3 = 17;
            }
            c0098f.f(i3);
        } catch (CameraAccessException e) {
            throw new W1.u("CameraAccessException", e.getMessage(), null);
        }
    }

    public Long g(String str, W1.E e) {
        io.flutter.embedding.engine.renderer.l lVar = (io.flutter.embedding.engine.renderer.l) this.f5134h;
        lVar.getClass();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = lVar.f4648b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        io.flutter.embedding.engine.renderer.i iVar = new io.flutter.embedding.engine.renderer.i(lVar, andIncrement, surfaceTexture);
        lVar.f4647a.registerTexture(iVar.f4625a, iVar.f4626b);
        HashSet hashSet = lVar.f4651f;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((io.flutter.view.q) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
        hashSet.add(new WeakReference(iVar));
        Handler handler = new Handler(Looper.getMainLooper());
        S1.f fVar = (S1.f) this.e;
        A0.f fVar2 = new A0.f(27, fVar);
        long j3 = iVar.f4625a;
        String strValueOf = String.valueOf(j3);
        C0104l c0104l = new C0104l();
        c0104l.e = fVar;
        c0104l.f1774d = strValueOf.isEmpty() ? "" : ".".concat(strValueOf);
        D0.b bVar = new D0.b(handler, fVar2, c0104l, 13);
        C0104l c0104l2 = new C0104l(str, (CameraManager) ((AbstractActivityC0028d) this.f5131d).getSystemService("camera"));
        Long l3 = e.f1697b;
        Integer numValueOf = l3 == null ? null : Integer.valueOf(l3.intValue());
        Long l4 = e.f1698c;
        Integer numValueOf2 = l4 == null ? null : Integer.valueOf(l4.intValue());
        Long l5 = e.f1699d;
        Integer numValueOf3 = l5 != null ? Integer.valueOf(l5.intValue()) : null;
        int iOrdinal = e.f1696a.ordinal();
        int i3 = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i3 = 3;
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        i3 = 5;
                        if (iOrdinal != 4) {
                            if (iOrdinal != 5) {
                                throw new IllegalStateException("Unreachable code");
                            }
                            i3 = 6;
                        }
                    } else {
                        i3 = 4;
                    }
                }
            } else {
                i3 = 2;
            }
        }
        p067u1.a aVar = new p067u1.a();
        boolean zBooleanValue = e.e.booleanValue();
        N0.l lVar2 = new N0.l();
        lVar2.f1087a = i3;
        lVar2.f1088b = zBooleanValue;
        lVar2.f1089c = numValueOf;
        lVar2.f1090d = numValueOf2;
        lVar2.e = numValueOf3;
        this.f5136j = new C0098f((AbstractActivityC0028d) this.f5131d, iVar, aVar, bVar, c0104l2, lVar2);
        return Long.valueOf(j3);
    }

    public void h(Boolean bool) {
        C0098f c0098f = (C0098f) this.f5136j;
        D0.b bVar = bool.booleanValue() ? (D0.b) this.f5135i : null;
        try {
            File fileCreateTempFile = File.createTempFile("REC", ".mp4", c0098f.f1742g.getCacheDir());
            c0098f.f1757w = fileCreateTempFile;
            try {
                c0098f.g(fileCreateTempFile.getAbsolutePath());
                p068v1.c cVar = c0098f.f1737a;
                C0104l c0104l = c0098f.f1744i;
                c0098f.f1745j.getClass();
                cVar.f5762d.put("AUTO_FOCUS", new Y1.a(c0104l, true));
                c0098f.n(c0098f.f1744i);
                if (bVar != null) {
                    bVar.R(new C0006g(27, c0098f));
                }
                c0098f.f1740d = ((Integer) ((CameraCharacteristics) c0098f.f1744i.e).get(CameraCharacteristics.LENS_FACING)).intValue();
                c0098f.f1756u = true;
                try {
                    c0098f.o(true, bVar != null);
                } catch (CameraAccessException e) {
                    c0098f.f1756u = false;
                    c0098f.f1757w = null;
                    throw new W1.u("videoRecordingFailed", e.getMessage(), null);
                }
            } catch (IOException e3) {
                c0098f.f1756u = false;
                c0098f.f1757w = null;
                throw new W1.u("videoRecordingFailed", e3.getMessage(), null);
            }
        } catch (IOException | SecurityException e4) {
            throw new W1.u("cannotCreateFile", e4.getMessage(), null);
        }
    }

    public void i() {
        if (((D0.b) this.f5132f) == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        b(false);
        ((D0.b) this.f5132f).R(null);
        this.f5132f = null;
    }

    public String j() {
        C0098f c0098f = (C0098f) this.f5136j;
        if (!c0098f.f1756u) {
            return "";
        }
        p068v1.c cVar = c0098f.f1737a;
        C0104l c0104l = c0098f.f1744i;
        c0098f.f1745j.getClass();
        cVar.f5762d.put("AUTO_FOCUS", new Y1.a(c0104l, false));
        p068v1.c cVar2 = c0098f.f1737a;
        cVar2.f5762d.put("FPS_RANGE", new p017e2.a(c0098f.f1744i));
        c0098f.f1756u = false;
        try {
            c0098f.b();
            c0098f.f1751p.abortCaptures();
            c0098f.f1755t.stop();
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        c0098f.f1755t.reset();
        try {
            c0098f.p(null);
            String absolutePath = c0098f.f1757w.getAbsolutePath();
            c0098f.f1757w = null;
            return absolutePath;
        } catch (CameraAccessException | IllegalStateException | InterruptedException e) {
            throw new W1.u("videoRecordingFailed", e.getMessage(), null);
        }
    }

    @Override // S1.h
    public void p() {
        b(true);
    }
}
