package p065t0;

import B.C0006g;
import I1.AbstractActivityC0028d;
import I1.x;
import M.j;
import M0.d;
import M0.e;
import N0.A;
import N0.C;
import N0.C0083d;
import N0.E;
import N0.l;
import N0.z;
import O0.u;
import W1.C0104l;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Build;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p006b1.a;
import p009c1.v;
import p023g1.b;
import p033j1.f;
import p033j1.h;
import p033j1.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f5704d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f5705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p061s0.a f5706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f5707h;

    public c(Context context, h hVar) {
        int iNextInt;
        this.f5701a = context;
        int i3 = b.f4488a;
        this.f5703c = new a(context, a.f2514i, M0.b.f963a, e.f965b);
        this.f5705f = hVar;
        this.f5704d = new l(context, hVar);
        synchronized (this) {
            iNextInt = new SecureRandom().nextInt(65536);
        }
        this.e = iNextInt;
        this.f5702b = new b(this, hVar, context);
    }

    public static LocationRequest f(h hVar) {
        long j3;
        long jMin;
        int i3;
        float f3;
        long j4;
        int i4 = 104;
        if (Build.VERSION.SDK_INT >= 33) {
            u.a("intervalMillis must be greater than or equal to 0", 0 >= 0);
            if (hVar != null) {
                int iB = j.b(hVar.f5720a);
                if (iB == 0) {
                    i4 = 105;
                } else if (iB != 1) {
                    i4 = iB != 2 ? 100 : 102;
                }
                p023g1.j.a(i4);
                long j5 = hVar.f5722c;
                u.a("intervalMillis must be greater than or equal to 0", j5 >= 0);
                u.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j5 == -1 || j5 >= 0);
                float f4 = hVar.f5721b;
                u.a("minUpdateDistanceMeters must be greater than or equal to 0", f4 >= 0.0f);
                f3 = f4;
                jMin = j5;
                j3 = jMin;
                i3 = i4;
            } else {
                j3 = 0;
                jMin = -1;
                i3 = 102;
                f3 = 0.0f;
            }
            if (jMin == -1) {
                j4 = j3;
            } else {
                if (i3 != 105) {
                    jMin = Math.min(jMin, j3);
                }
                j4 = jMin;
            }
            return new LocationRequest(i3, j3, j4, Math.max(0L, j3), Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, f3, true, -1 == -1 ? j3 : -1L, 0, 0, false, new WorkSource(null), null);
        }
        LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
        if (hVar != null) {
            int iB2 = j.b(hVar.f5720a);
            if (iB2 == 0) {
                i4 = 105;
            } else if (iB2 != 1) {
                i4 = iB2 != 2 ? 100 : 102;
            }
            p023g1.j.a(i4);
            locationRequest.f3515a = i4;
            long j6 = hVar.f5722c;
            u.a("intervalMillis must be greater than or equal to 0", j6 >= 0);
            long j7 = locationRequest.f3517c;
            long j8 = locationRequest.f3516b;
            if (j7 == j8 / 6) {
                locationRequest.f3517c = j6 / 6;
            }
            if (locationRequest.f3522i == j8) {
                locationRequest.f3522i = j6;
            }
            locationRequest.f3516b = j6;
            long j9 = j6 / 2;
            u.b(j9 >= 0, "illegal fastest interval: %d", Long.valueOf(j9));
            locationRequest.f3517c = j9;
            float f5 = hVar.f5721b;
            if (f5 < 0.0f) {
                StringBuilder sb = new StringBuilder(String.valueOf(f5).length() + 22);
                sb.append("invalid displacement: ");
                sb.append(f5);
                throw new IllegalArgumentException(sb.toString());
            }
            locationRequest.f3520g = f5;
        }
        return locationRequest;
    }

    @Override // p065t0.f
    public final void a(p006b1.c cVar) {
        int i3 = b.f4488a;
        a aVar = new a(this.f5701a, a.f2514i, M0.b.f963a, e.f965b);
        p023g1.c cVar2 = new p023g1.c(new ArrayList(), false, false);
        x xVar = new x();
        xVar.f429b = true;
        xVar.f431d = new p006b1.c(cVar2);
        xVar.f430c = 2426;
        k kVarC = aVar.c(0, xVar.a());
        G1.a aVar2 = new G1.a(11, cVar);
        kVarC.getClass();
        kVarC.f4998b.d(new h((Executor) f.f4991a, (p033j1.a) aVar2));
        kVarC.l();
    }

    @Override // p065t0.f
    public final boolean b(int i3, int i4) {
        if (i3 == this.e) {
            if (i4 == -1) {
                h hVar = this.f5705f;
                if (hVar == null || this.f5707h == null || this.f5706g == null) {
                    return false;
                }
                g(hVar);
                return true;
            }
            p061s0.a aVar = this.f5706g;
            if (aVar != null) {
                aVar.c(3);
            }
        }
        return false;
    }

    @Override // p065t0.f
    public final void c(final AbstractActivityC0028d abstractActivityC0028d, m mVar, final p061s0.a aVar) {
        this.f5707h = mVar;
        this.f5706g = aVar;
        LocationRequest locationRequestF = f(this.f5705f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(locationRequestF);
        p023g1.c cVar = new p023g1.c(arrayList, false, false);
        int i3 = b.f4488a;
        a aVar2 = new a(this.f5701a, a.f2514i, M0.b.f963a, e.f965b);
        x xVar = new x();
        xVar.f429b = true;
        xVar.f431d = new p006b1.c(cVar);
        xVar.f430c = 2426;
        k kVarC = aVar2.c(0, xVar.a());
        G1.a aVar3 = new G1.a(12, this);
        kVarC.getClass();
        kVarC.b(f.f4991a, aVar3);
        kVarC.a(new p033j1.b() { // from class: t0.a
            @Override // p033j1.b
            public final void b(Exception exc) {
                c cVar2 = this.f5696d;
                cVar2.getClass();
                boolean z2 = exc instanceof M0.k;
                p061s0.a aVar4 = aVar;
                if (!z2) {
                    if (((d) exc).f964d.f2707a == 8502) {
                        cVar2.g(cVar2.f5705f);
                        return;
                    } else {
                        aVar4.c(3);
                        return;
                    }
                }
                AbstractActivityC0028d abstractActivityC0028d2 = abstractActivityC0028d;
                if (abstractActivityC0028d2 == null) {
                    aVar4.c(3);
                    return;
                }
                Status status = ((M0.k) exc).f964d;
                if (status.f2707a != 6) {
                    aVar4.c(3);
                    return;
                }
                try {
                    int i4 = cVar2.e;
                    PendingIntent pendingIntent = status.f2709c;
                    if (pendingIntent != null) {
                        u.f(pendingIntent);
                        abstractActivityC0028d2.startIntentSenderForResult(pendingIntent.getIntentSender(), i4, null, 0, 0, 0);
                    }
                } catch (IntentSender.SendIntentException unused) {
                    aVar4.c(3);
                }
            }
        });
    }

    @Override // p065t0.f
    public final void d() {
        this.f5704d.c();
        this.f5703c.d(this.f5702b);
    }

    @Override // p065t0.f
    public final void e(E1.b bVar, E1.b bVar2) {
        a aVar = this.f5703c;
        aVar.getClass();
        x xVar = new x();
        xVar.f429b = true;
        xVar.f431d = v.e;
        xVar.f430c = 2414;
        k kVarC = aVar.c(0, xVar.a());
        G1.a aVar2 = new G1.a(13, bVar);
        kVarC.getClass();
        kVarC.b(f.f4991a, aVar2);
        kVarC.a(new G1.a(14, bVar2));
    }

    public final void g(h hVar) {
        LocationRequest locationRequestF = f(hVar);
        this.f5704d.b();
        a aVar = this.f5703c;
        Looper mainLooper = Looper.getMainLooper();
        aVar.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            u.g(mainLooper, "invalid null looper");
        }
        String simpleName = b.class.getSimpleName();
        b bVar = this.f5702b;
        u.g(bVar, "Listener must not be null");
        N0.j jVar = new N0.j(mainLooper, bVar, simpleName);
        C c3 = new C();
        c3.f1042f = aVar;
        c3.f1041d = true;
        c3.e = jVar;
        C0104l c0104l = new C0104l(c3, locationRequestF);
        l lVar = new l();
        lVar.f1088b = true;
        lVar.f1089c = c0104l;
        lVar.f1090d = c3;
        lVar.e = jVar;
        lVar.f1087a = 2436;
        u.a("Must set unregister function", ((C) lVar.f1090d) != null);
        u.a("Must set holder", ((N0.j) lVar.e) != null);
        N0.h hVar2 = (N0.h) ((N0.j) lVar.e).f1086c;
        u.g(hVar2, "Key must not be null");
        N0.j jVar2 = (N0.j) lVar.e;
        boolean z2 = lVar.f1088b;
        int i3 = lVar.f1087a;
        C c4 = new C();
        c4.f1042f = lVar;
        c4.e = jVar2;
        c4.f1041d = z2;
        C0006g c0006g = new C0006g(lVar, hVar2);
        u.g((N0.h) jVar2.f1086c, "Listener has already been released.");
        C0083d c0083d = aVar.f973h;
        c0083d.getClass();
        p033j1.e eVar = new p033j1.e();
        c0083d.e(eVar, i3, aVar);
        z zVar = new z(new E(new A(c4, c0006g), eVar), c0083d.f1076i.get(), aVar);
        Z0.f fVar = c0083d.f1080m;
        fVar.sendMessage(fVar.obtainMessage(8, zVar));
    }
}
