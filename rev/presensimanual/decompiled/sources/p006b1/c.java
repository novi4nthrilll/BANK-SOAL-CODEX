package p006b1;

import A.d;
import A0.f;
import A0.g;
import B.C0011l;
import E0.n;
import M.k;
import N0.C;
import N0.i;
import N0.m;
import Q.e;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.Log;
import android.view.View;
import com.google.android.gms.location.LocationAvailability;
import io.flutter.plugin.platform.h;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k.C0734i;
import k.InterfaceC0740l;
import p013d1.I;
import p032j.o;
import p032j.t;
import p061s0.a;
import p075y.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements m, i, o, InterfaceC0740l, b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2515d;

    public c(int i3) {
        switch (i3) {
            case k.STRING_FIELD_NUMBER /* 5 */:
                this.f2515d = new p033j1.k();
                break;
            default:
                this.f2515d = new c(5);
                break;
        }
    }

    @Override // p032j.o
    public void a(p032j.i iVar, boolean z2) {
        if (iVar instanceof t) {
            ((t) iVar).v.j().c(false);
        }
        o oVar = ((C0734i) this.f2515d).f5167h;
        if (oVar != null) {
            oVar.a(iVar, z2);
        }
    }

    @Override // p032j.o
    public boolean b(p032j.i iVar) {
        C0734i c0734i = (C0734i) this.f2515d;
        if (iVar == c0734i.f5165f) {
            return false;
        }
        ((t) iVar).f4989w.getClass();
        c0734i.getClass();
        o oVar = c0734i.f5167h;
        if (oVar != null) {
            return oVar.b(iVar);
        }
        return false;
    }

    @Override // N0.i
    public void c(Object obj) {
        a aVar;
        p065t0.b bVar = (p065t0.b) obj;
        LocationAvailability locationAvailability = (LocationAvailability) this.f2515d;
        synchronized (bVar) {
            if (!(locationAvailability.f3514d < 1000)) {
                p065t0.c cVar = bVar.f5700c;
                Context context = bVar.f5699b;
                cVar.getClass();
                if (!I.a(context) && (aVar = bVar.f5700c.f5706g) != null) {
                    aVar.c(3);
                }
            }
        }
    }

    @Override // p075y.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f2515d;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // p075y.b
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f2515d;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public void e() {
        ((p033j1.k) ((c) this.f2515d).f2515d).j(null);
    }

    public void f(int i3) {
        if (((h) this.f2515d).f4715g.get(i3) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i3);
    }

    public KeyListener g(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((g) ((f) this.f2515d).e).getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
    }

    public void h(int i3, R1.m mVar) {
        io.flutter.plugin.editing.h hVar = (io.flutter.plugin.editing.h) this.f2515d;
        hVar.c();
        hVar.f4695f = mVar;
        hVar.e = new C0011l(2, i3);
        hVar.f4697h.e(hVar);
        n nVar = mVar.f1501j;
        hVar.f4697h = new io.flutter.plugin.editing.e(nVar != null ? (R1.o) nVar.f237f : null, hVar.f4691a);
        hVar.d(mVar);
        hVar.f4698i = true;
        if (hVar.e.f89b == 3) {
            hVar.f4705p = false;
        }
        hVar.f4702m = null;
        hVar.f4697h.a(hVar);
    }

    public void i(double d3, double d4, double[] dArr) {
        io.flutter.plugin.editing.h hVar = (io.flutter.plugin.editing.h) this.f2515d;
        hVar.getClass();
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d5 = dArr[12];
        double d6 = dArr[15];
        double d7 = d5 / d6;
        dArr2[1] = d7;
        dArr2[0] = d7;
        double d8 = dArr[13] / d6;
        dArr2[3] = d8;
        dArr2[2] = d8;
        C c3 = new C();
        c3.f1041d = z2;
        c3.e = dArr;
        c3.f1042f = dArr2;
        c3.a(d3, 0.0d);
        c3.a(d3, d4);
        c3.a(0.0d, d4);
        double d9 = hVar.f4691a.getContext().getResources().getDisplayMetrics().density;
        hVar.f4702m = new Rect((int) (dArr2[0] * d9), (int) (dArr2[2] * d9), (int) Math.ceil(dArr2[1] * d9), (int) Math.ceil(dArr2[3] * d9));
    }

    public void j(R1.o oVar) {
        R1.o oVar2;
        int i3;
        int i4;
        io.flutter.plugin.editing.h hVar = (io.flutter.plugin.editing.h) this.f2515d;
        View view = hVar.f4691a;
        if (!hVar.f4698i && (oVar2 = hVar.f4704o) != null && (i3 = oVar2.f1510d) >= 0 && (i4 = oVar2.e) > i3) {
            int i5 = i4 - i3;
            int i6 = oVar.e;
            int i7 = oVar.f1510d;
            boolean z2 = true;
            if (i5 == i6 - i7) {
                int i8 = 0;
                while (true) {
                    if (i8 >= i5) {
                        z2 = false;
                        break;
                    } else if (oVar2.f1507a.charAt(i8 + i3) != oVar.f1507a.charAt(i8 + i7)) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            hVar.f4698i = z2;
        }
        hVar.f4704o = oVar;
        hVar.f4697h.f(oVar);
        if (hVar.f4698i) {
            hVar.f4692b.restartInput(view);
            hVar.f4698i = false;
        }
    }

    public void k(boolean z2) {
        Q.i iVar = (Q.i) ((g) ((f) this.f2515d).e).f19f;
        if (iVar.f1378f != z2) {
            if (iVar.e != null) {
                O.h hVarA = O.h.a();
                Q.h hVar = iVar.e;
                hVarA.getClass();
                d.b(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = hVarA.f1180a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    hVarA.f1181b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            iVar.f1378f = z2;
            if (z2) {
                Q.i.a(iVar.f1377d, O.h.a().b());
            }
        }
    }

    @Override // N0.m
    public void r(Object obj, Object obj2) {
        p023g1.c cVar = (p023g1.c) this.f2515d;
        y yVar = (y) ((i) obj).q();
        e eVar = new e(0, (p033j1.e) obj2);
        Parcel parcelG = yVar.g();
        b.b(parcelG, cVar);
        parcelG.writeStrongBinder(eVar);
        parcelG.writeString(null);
        yVar.l(parcelG, 63);
    }

    public /* synthetic */ c(Object obj) {
        this.f2515d = obj;
    }
}
