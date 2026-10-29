package N0;

import O0.C0090d;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: N0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0083d implements Handler.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f1065o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f1066p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f1067q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static C0083d f1068r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O0.l f1071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q0.c f1072d;
    public final Context e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L0.d f1073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A0.g f1074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f1075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f1077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p045n.c f1078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p045n.c f1079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z0.f f1080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f1081n;

    public C0083d(Context context, Looper looper) {
        L0.d dVar = L0.d.f870d;
        this.f1069a = 10000L;
        this.f1070b = false;
        this.f1075h = new AtomicInteger(1);
        this.f1076i = new AtomicInteger(0);
        this.f1077j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f1078k = new p045n.c(0);
        this.f1079l = new p045n.c(0);
        this.f1081n = true;
        this.e = context;
        Z0.f fVar = new Z0.f(looper, this);
        Looper.getMainLooper();
        this.f1080m = fVar;
        this.f1073f = dVar;
        this.f1074g = new A0.g(16);
        PackageManager packageManager = context.getPackageManager();
        if (p013d1.A.f3564d == null) {
            p013d1.A.f3564d = Boolean.valueOf(Build.VERSION.SDK_INT >= 26 && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (p013d1.A.f3564d.booleanValue()) {
            this.f1081n = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static Status c(C0081b c0081b, L0.a aVar) {
        return new Status(17, "API: " + ((String) c0081b.f1058b.f19f) + " is not available on this device. Connection failed with: " + String.valueOf(aVar), aVar.f862c, aVar);
    }

    public static C0083d f(Context context) {
        C0083d c0083d;
        synchronized (f1067q) {
            try {
                if (f1068r == null) {
                    Looper looper = O0.E.a().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = L0.d.f869c;
                    f1068r = new C0083d(applicationContext, looper);
                }
                c0083d = f1068r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0083d;
    }

    public final boolean a() {
        if (this.f1070b) {
            return false;
        }
        O0.k kVar = (O0.k) O0.j.b().f1284a;
        if (kVar != null && !kVar.f1286b) {
            return false;
        }
        int i3 = ((SparseIntArray) this.f1074g.e).get(203400000, -1);
        return i3 == -1 || i3 == 0;
    }

    public final boolean b(L0.a aVar, int i3) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        L0.d dVar = this.f1073f;
        Context context = this.e;
        dVar.getClass();
        synchronized (W0.a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = W0.a.f1684a;
            if (context2 == null || (bool = W0.a.f1685b) == null || context2 != applicationContext) {
                W0.a.f1685b = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    W0.a.f1685b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        W0.a.f1685b = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        W0.a.f1685b = Boolean.FALSE;
                    }
                }
                W0.a.f1684a = applicationContext;
                zBooleanValue = W0.a.f1685b.booleanValue();
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            int i4 = aVar.f861b;
            if (i4 == 0 || (activity = aVar.f862c) == null) {
                Intent intentB = dVar.b(i4, context, null);
                activity = intentB != null ? PendingIntent.getActivity(context, 0, intentB, p002a1.b.f1958a | 134217728) : null;
            }
            if (activity != null) {
                int i5 = aVar.f861b;
                int i6 = GoogleApiActivity.e;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i3);
                intent.putExtra("notify_manager", true);
                dVar.g(context, i5, PendingIntent.getActivity(context, 0, intent, Z0.e.f1952a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final r d(M0.f fVar) {
        ConcurrentHashMap concurrentHashMap = this.f1077j;
        C0081b c0081b = fVar.e;
        r rVar = (r) concurrentHashMap.get(c0081b);
        if (rVar == null) {
            rVar = new r(this, fVar);
            concurrentHashMap.put(c0081b, rVar);
        }
        if (rVar.f1096c.l()) {
            this.f1079l.add(c0081b);
        }
        rVar.m();
        return rVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final void e(p033j1.e eVar, int i3, M0.f fVar) {
        x xVar;
        if (i3 != 0) {
            C0081b c0081b = fVar.e;
            if (a()) {
                O0.k kVar = (O0.k) O0.j.b().f1284a;
                boolean z2 = true;
                if (kVar != null) {
                    if (kVar.f1286b) {
                        r rVar = (r) this.f1077j.get(c0081b);
                        if (rVar != null) {
                            M0.c cVar = rVar.f1096c;
                            if (cVar instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                                if (aVar.f2731u == null || aVar.a()) {
                                    z2 = kVar.f1287c;
                                } else {
                                    C0090d c0090dA = x.a(rVar, aVar, i3);
                                    if (c0090dA != null) {
                                        rVar.f1105m++;
                                        z2 = c0090dA.f1251c;
                                    }
                                }
                            }
                        } else {
                            z2 = kVar.f1287c;
                        }
                    }
                    xVar = null;
                }
                xVar = new x(this, i3, c0081b, z2 ? System.currentTimeMillis() : 0L, z2 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                xVar = null;
            }
            if (xVar != null) {
                p033j1.k kVar2 = eVar.f4990a;
                Z0.f fVar2 = this.f1080m;
                fVar2.getClass();
                o oVar = new o(0, fVar2);
                kVar2.getClass();
                kVar2.f4998b.d(new p033j1.h(oVar, xVar));
                kVar2.l();
            }
        }
    }

    public final void g(L0.a aVar, int i3) {
        if (b(aVar, i3)) {
            return;
        }
        Z0.f fVar = this.f1080m;
        fVar.sendMessage(fVar.obtainMessage(5, i3, 0, aVar));
    }

    /* JADX WARN: Code duplicated, block: B:151:0x034b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0351  */
    /* JADX WARN: Code duplicated, block: B:154:0x037e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0389  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 N0.r, still in use, count: 2, list:
          (r2v6 N0.r) from 0x0343: IGET (r2v6 N0.r) A[WRAPPED] (LINE:836) N0.r.h int
          (r2v6 N0.r) from 0x0349: PHI (r2 I:??) = (r2v3 N0.r), (r2v6 N0.r) binds: [B:149:0x0348, B:200:0x0349] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r12) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.C0083d.handleMessage(android.os.Message):boolean");
    }
}
