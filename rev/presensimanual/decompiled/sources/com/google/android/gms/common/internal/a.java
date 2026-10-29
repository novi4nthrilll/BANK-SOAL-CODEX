package com.google.android.gms.common.internal;

import A0.f;
import C1.h;
import E0.k;
import E0.l;
import L0.d;
import L0.e;
import M0.c;
import M0.g;
import O0.A;
import O0.B;
import O0.C0091e;
import O0.E;
import O0.InterfaceC0088b;
import O0.j;
import O0.r;
import O0.t;
import O0.u;
import O0.v;
import O0.w;
import O0.x;
import O0.y;
import O0.z;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final L0.c[] f2711x = new L0.c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f2712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f2713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f2715d;
    public final v e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f2717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public t f2718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public InterfaceC0088b f2719i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IInterface f2720j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f2721k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x f2722l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2723m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f2724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f2725o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2726p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f2727q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile String f2728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public L0.a f2729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2730t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile A f2731u;
    public final AtomicInteger v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f2732w;

    public a(Context context, Looper looper, int i3, k kVar, g gVar, M0.h hVar) {
        synchronized (E.f1238g) {
            try {
                if (E.f1239h == null) {
                    E.f1239h = new E(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        E e = E.f1239h;
        Object obj = d.f869c;
        u.f(gVar);
        u.f(hVar);
        j jVar = new j(gVar);
        j jVar2 = new j(hVar);
        String str = (String) kVar.f228g;
        this.f2712a = null;
        this.f2716f = new Object();
        this.f2717g = new Object();
        this.f2721k = new ArrayList();
        this.f2723m = 1;
        this.f2729s = null;
        this.f2730t = false;
        this.f2731u = null;
        this.v = new AtomicInteger(0);
        u.g(context, "Context must not be null");
        this.f2714c = context;
        u.g(looper, "Looper must not be null");
        u.g(e, "Supervisor must not be null");
        this.f2715d = e;
        this.e = new v(this, looper);
        this.f2726p = i3;
        this.f2724n = jVar;
        this.f2725o = jVar2;
        this.f2727q = str;
        Set set = (Set) kVar.e;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2732w = set;
    }

    public static /* bridge */ /* synthetic */ void w(a aVar) {
        int i3;
        int i4;
        synchronized (aVar.f2716f) {
            i3 = aVar.f2723m;
        }
        if (i3 == 3) {
            aVar.f2730t = true;
            i4 = 5;
        } else {
            i4 = 4;
        }
        v vVar = aVar.e;
        vVar.sendMessage(vVar.obtainMessage(i4, aVar.v.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean x(a aVar, int i3, int i4, IInterface iInterface) {
        synchronized (aVar.f2716f) {
            try {
                if (aVar.f2723m != i3) {
                    return false;
                }
                aVar.y(i4, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M0.c
    public final boolean a() {
        boolean z2;
        synchronized (this.f2716f) {
            int i3 = this.f2723m;
            z2 = true;
            if (i3 != 2 && i3 != 3) {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // M0.c
    public final L0.c[] b() {
        A a3 = this.f2731u;
        if (a3 == null) {
            return null;
        }
        return a3.f1224b;
    }

    @Override // M0.c
    public final boolean c() {
        boolean z2;
        synchronized (this.f2716f) {
            z2 = this.f2723m == 4;
        }
        return z2;
    }

    @Override // M0.c
    public final void d() {
        if (!c() || this.f2713b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.c
    public final void e(O0.g gVar, Set set) {
        Bundle bundleP = p();
        String str = this.f2728r;
        int i3 = e.f871a;
        Scope[] scopeArr = C0091e.f1254o;
        Bundle bundle = new Bundle();
        int i4 = this.f2726p;
        L0.c[] cVarArr = C0091e.f1255p;
        C0091e c0091e = new C0091e(6, i4, i3, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        c0091e.f1259d = this.f2714c.getPackageName();
        c0091e.f1261g = bundleP;
        if (set != null) {
            c0091e.f1260f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            c0091e.f1262h = new Account("<<default account>>", "com.google");
            if (gVar != 0) {
                c0091e.e = ((Z0.a) gVar).f1944c;
            }
        }
        c0091e.f1263i = f2711x;
        c0091e.f1264j = o();
        if (v()) {
            c0091e.f1267m = true;
        }
        try {
            synchronized (this.f2717g) {
                try {
                    t tVar = this.f2718h;
                    if (tVar != null) {
                        tVar.d(new w(this, this.v.get()), c0091e);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.v.get();
            v vVar = this.e;
            vVar.sendMessage(vVar.obtainMessage(6, i5, 3));
        } catch (RemoteException e3) {
            e = e3;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i6 = this.v.get();
            y yVar = new y(this, 8, null, null);
            v vVar2 = this.e;
            vVar2.sendMessage(vVar2.obtainMessage(1, i6, -1, yVar));
        } catch (SecurityException e4) {
            throw e4;
        } catch (RuntimeException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i7 = this.v.get();
            y yVar2 = new y(this, 8, null, null);
            v vVar3 = this.e;
            vVar3.sendMessage(vVar3.obtainMessage(1, i7, -1, yVar2));
        }
    }

    @Override // M0.c
    public final String f() {
        return this.f2712a;
    }

    @Override // M0.c
    public final Set g() {
        return l() ? this.f2732w : Collections.emptySet();
    }

    @Override // M0.c
    public final void h(InterfaceC0088b interfaceC0088b) {
        this.f2719i = interfaceC0088b;
        y(2, null);
    }

    @Override // M0.c
    public final void i() {
        this.v.incrementAndGet();
        synchronized (this.f2721k) {
            try {
                int size = this.f2721k.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((r) this.f2721k.get(i3)).c();
                }
                this.f2721k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f2717g) {
            this.f2718h = null;
        }
        y(1, null);
    }

    @Override // M0.c
    public final void j(String str) {
        this.f2712a = str;
        i();
    }

    @Override // M0.c
    public final void k(f fVar) {
        ((N0.r) fVar.e).f1106n.f1080m.post(new l(3, fVar));
    }

    @Override // M0.c
    public boolean l() {
        return false;
    }

    public abstract IInterface n(IBinder iBinder);

    public L0.c[] o() {
        return f2711x;
    }

    public Bundle p() {
        return new Bundle();
    }

    public final IInterface q() {
        IInterface iInterface;
        synchronized (this.f2716f) {
            try {
                if (this.f2723m == 5) {
                    throw new DeadObjectException();
                }
                if (!c()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f2720j;
                u.g(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String r();

    public abstract String s();

    public boolean t() {
        return m() >= 211700000;
    }

    public void u() {
        System.currentTimeMillis();
    }

    public boolean v() {
        return this instanceof S0.h;
    }

    public final void y(int i3, IInterface iInterface) {
        h hVar;
        if ((i3 == 4) != (iInterface != null)) {
            throw new IllegalArgumentException();
        }
        synchronized (this.f2716f) {
            try {
                this.f2723m = i3;
                this.f2720j = iInterface;
                if (i3 == 1) {
                    x xVar = this.f2722l;
                    if (xVar != null) {
                        E e = this.f2715d;
                        String str = (String) this.f2713b.f164b;
                        u.f(str);
                        this.f2713b.getClass();
                        if (this.f2727q == null) {
                            this.f2714c.getClass();
                        }
                        e.b(str, xVar, this.f2713b.f163a);
                        this.f2722l = null;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    x xVar2 = this.f2722l;
                    if (xVar2 != null && (hVar = this.f2713b) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) hVar.f164b) + " on com.google.android.gms");
                        E e3 = this.f2715d;
                        String str2 = (String) this.f2713b.f164b;
                        u.f(str2);
                        this.f2713b.getClass();
                        if (this.f2727q == null) {
                            this.f2714c.getClass();
                        }
                        e3.b(str2, xVar2, this.f2713b.f163a);
                        this.v.incrementAndGet();
                    }
                    x xVar3 = new x(this, this.v.get());
                    this.f2722l = xVar3;
                    String strS = s();
                    boolean zT = t();
                    this.f2713b = new h(strS, zT);
                    if (zT && m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f2713b.f164b)));
                    }
                    E e4 = this.f2715d;
                    String str3 = (String) this.f2713b.f164b;
                    u.f(str3);
                    this.f2713b.getClass();
                    String name = this.f2727q;
                    if (name == null) {
                        name = this.f2714c.getClass().getName();
                    }
                    if (!e4.c(new B(str3, this.f2713b.f163a), xVar3, name)) {
                        Log.w("GmsClient", "unable to connect to service: " + ((String) this.f2713b.f164b) + " on com.google.android.gms");
                        int i4 = this.v.get();
                        z zVar = new z(this, 16);
                        v vVar = this.e;
                        vVar.sendMessage(vVar.obtainMessage(7, i4, -1, zVar));
                    }
                } else if (i3 == 4) {
                    u.f(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
