package N0;

import W1.C0104l;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r implements M0.g, M0.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M0.c f1096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0081b f1097d;
    public final A0.g e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final D f1101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1102j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0083d f1106n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedList f1095b = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashSet f1098f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f1099g = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f1103k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public L0.a f1104l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1105m = 0;

    public r(C0083d c0083d, M0.f fVar) {
        this.f1106n = c0083d;
        Looper looper = c0083d.f1080m.getLooper();
        D0.b bVarA = fVar.a();
        E0.k kVar = new E0.k((p045n.c) bVarA.e, (String) bVarA.f182f, (String) bVarA.f183g);
        Q0.b bVar = (Q0.b) fVar.f969c.e;
        O0.u.f(bVar);
        M0.c cVarA = bVar.a(fVar.f967a, looper, kVar, fVar.f970d, this, this);
        String str = fVar.f968b;
        if (str != null && (cVarA instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) cVarA).f2728r = str;
        }
        if (str != null && (cVarA instanceof k)) {
            A0.c.o(cVarA);
            throw null;
        }
        this.f1096c = cVarA;
        this.f1097d = fVar.e;
        this.e = new A0.g(12);
        this.f1100h = fVar.f971f;
        if (!cVarA.l()) {
            this.f1101i = null;
            return;
        }
        Context context = c0083d.e;
        Z0.f fVar2 = c0083d.f1080m;
        D0.b bVarA2 = fVar.a();
        this.f1101i = new D(context, fVar2, new E0.k((p045n.c) bVarA2.e, (String) bVarA2.f182f, (String) bVarA2.f183g));
    }

    public final void a(L0.a aVar) {
        HashSet hashSet = this.f1098f;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (O0.u.i(aVar, L0.a.e)) {
                this.f1096c.d();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        O0.u.c(this.f1106n.f1080m);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z2) {
        O0.u.c(this.f1106n.f1080m);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f1095b.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (!z2 || wVar.f1116a == 2) {
                if (status != null) {
                    wVar.c(status);
                } else {
                    wVar.d(runtimeException);
                }
                it.remove();
            }
        }
    }

    @Override // M0.g
    public final void d(int i3) {
        Looper looperMyLooper = Looper.myLooper();
        C0083d c0083d = this.f1106n;
        if (looperMyLooper == c0083d.f1080m.getLooper()) {
            i(i3);
        } else {
            c0083d.f1080m.post(new q(this, i3));
        }
    }

    public final void e() {
        LinkedList linkedList = this.f1095b;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            w wVar = (w) arrayList.get(i3);
            if (!this.f1096c.c()) {
                return;
            }
            if (k(wVar)) {
                linkedList.remove(wVar);
            }
        }
    }

    @Override // M0.g
    public final void f() {
        Looper looperMyLooper = Looper.myLooper();
        C0083d c0083d = this.f1106n;
        if (looperMyLooper == c0083d.f1080m.getLooper()) {
            h();
        } else {
            c0083d.f1080m.post(new E0.l(2, this));
        }
    }

    @Override // M0.h
    public final void g(L0.a aVar) {
        o(aVar, null);
    }

    public final void h() {
        M0.c cVar = this.f1096c;
        C0083d c0083d = this.f1106n;
        O0.u.c(c0083d.f1080m);
        this.f1104l = null;
        a(L0.a.e);
        if (this.f1102j) {
            Z0.f fVar = c0083d.f1080m;
            C0081b c0081b = this.f1097d;
            fVar.removeMessages(11, c0081b);
            c0083d.f1080m.removeMessages(9, c0081b);
            this.f1102j = false;
        }
        Iterator it = this.f1099g.values().iterator();
        while (it.hasNext()) {
            C c3 = ((A) it.next()).f1038a;
            try {
                ((C0104l) ((l) c3.f1042f).f1089c).r(cVar, new p033j1.e());
            } catch (DeadObjectException unused) {
                d(3);
                cVar.j("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        e();
        j();
    }

    public final void i(int i3) {
        C0083d c0083d = this.f1106n;
        O0.u.c(c0083d.f1080m);
        this.f1104l = null;
        this.f1102j = true;
        String strF = this.f1096c.f();
        A0.g gVar = this.e;
        gVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i3 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i3 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strF != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strF);
        }
        gVar.u(true, new Status(20, sb.toString(), null, null));
        Z0.f fVar = c0083d.f1080m;
        C0081b c0081b = this.f1097d;
        fVar.sendMessageDelayed(Message.obtain(fVar, 9, c0081b), 5000L);
        Z0.f fVar2 = c0083d.f1080m;
        fVar2.sendMessageDelayed(Message.obtain(fVar2, 11, c0081b), 120000L);
        ((SparseIntArray) c0083d.f1074g.e).clear();
        Iterator it = this.f1099g.values().iterator();
        while (it.hasNext()) {
            ((A) it.next()).getClass();
        }
    }

    public final void j() {
        C0083d c0083d = this.f1106n;
        Z0.f fVar = c0083d.f1080m;
        C0081b c0081b = this.f1097d;
        fVar.removeMessages(12, c0081b);
        Z0.f fVar2 = c0083d.f1080m;
        fVar2.sendMessageDelayed(fVar2.obtainMessage(12, c0081b), c0083d.f1069a);
    }

    public final boolean k(w wVar) {
        if (!(wVar instanceof w)) {
            M0.c cVar = this.f1096c;
            wVar.f(this.e, cVar.l());
            try {
                wVar.e(this);
            } catch (DeadObjectException unused) {
                d(1);
                cVar.j("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        L0.c[] cVarArrB = wVar.b(this);
        L0.c cVar2 = null;
        if (cVarArrB != null && cVarArrB.length != 0) {
            L0.c[] cVarArrB2 = this.f1096c.b();
            if (cVarArrB2 == null) {
                cVarArrB2 = new L0.c[0];
            }
            int length = cVarArrB2.length;
            p045n.b bVar = new p045n.b();
            if (length == 0) {
                bVar.f5388d = p045n.d.f5362a;
                bVar.e = p045n.d.f5363b;
            } else {
                bVar.a(length);
            }
            bVar.f5389f = 0;
            for (L0.c cVar3 : cVarArrB2) {
                bVar.put(cVar3.f866a, Long.valueOf(cVar3.a()));
            }
            for (L0.c cVar4 : cVarArrB) {
                Long l3 = (Long) bVar.getOrDefault(cVar4.f866a, null);
                if (l3 == null || l3.longValue() < cVar4.a()) {
                    cVar2 = cVar4;
                    break;
                }
            }
        }
        if (cVar2 == null) {
            M0.c cVar5 = this.f1096c;
            wVar.f(this.e, cVar5.l());
            try {
                wVar.e(this);
            } catch (DeadObjectException unused2) {
                d(1);
                cVar5.j("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f1096c.getClass().getName() + " could not execute call because it requires feature (" + cVar2.f866a + ", " + cVar2.a() + ").");
        if (!this.f1106n.f1081n || !wVar.a(this)) {
            wVar.d(new M0.l(cVar2));
            return true;
        }
        s sVar = new s(this.f1097d, cVar2);
        int iIndexOf = this.f1103k.indexOf(sVar);
        if (iIndexOf >= 0) {
            s sVar2 = (s) this.f1103k.get(iIndexOf);
            this.f1106n.f1080m.removeMessages(15, sVar2);
            Z0.f fVar = this.f1106n.f1080m;
            fVar.sendMessageDelayed(Message.obtain(fVar, 15, sVar2), 5000L);
            return false;
        }
        this.f1103k.add(sVar);
        Z0.f fVar2 = this.f1106n.f1080m;
        fVar2.sendMessageDelayed(Message.obtain(fVar2, 15, sVar), 5000L);
        Z0.f fVar3 = this.f1106n.f1080m;
        fVar3.sendMessageDelayed(Message.obtain(fVar3, 16, sVar), 120000L);
        L0.a aVar = new L0.a(2, null);
        if (l(aVar)) {
            return false;
        }
        this.f1106n.b(aVar, this.f1100h);
        return false;
    }

    public final boolean l(L0.a aVar) {
        synchronized (C0083d.f1067q) {
            this.f1106n.getClass();
        }
        return false;
    }

    public final void m() {
        C0083d c0083d = this.f1106n;
        O0.u.c(c0083d.f1080m);
        M0.c cVar = this.f1096c;
        if (cVar.c() || cVar.a()) {
            return;
        }
        try {
            A0.g gVar = c0083d.f1074g;
            Context context = c0083d.e;
            gVar.getClass();
            O0.u.f(context);
            int iM = cVar.m();
            SparseIntArray sparseIntArray = (SparseIntArray) gVar.e;
            int iC = sparseIntArray.get(iM, -1);
            if (iC == -1) {
                iC = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i3);
                    if (iKeyAt > iM && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (iC == -1) {
                    iC = ((L0.d) gVar.f19f).c(context, iM);
                }
                sparseIntArray.put(iM, iC);
            }
            if (iC != 0) {
                L0.a aVar = new L0.a(iC, null);
                Log.w("GoogleApiManager", "The service for " + cVar.getClass().getName() + " is not available: " + aVar.toString());
                o(aVar, null);
                return;
            }
            t tVar = new t(c0083d, cVar, this.f1097d);
            if (cVar.l()) {
                D d3 = this.f1101i;
                O0.u.f(d3);
                p030i1.a aVar2 = d3.f1048h;
                if (aVar2 != null) {
                    aVar2.i();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(d3));
                E0.k kVar = d3.f1047g;
                kVar.f230i = numValueOf;
                Z0.f fVar = d3.f1045d;
                d3.f1048h = (p030i1.a) d3.e.a(d3.f1044c, fVar.getLooper(), kVar, (p026h1.a) kVar.f229h, d3, d3);
                d3.f1049i = tVar;
                Set set = d3.f1046f;
                if (set == null || set.isEmpty()) {
                    fVar.post(new E0.l(4, d3));
                } else {
                    p030i1.a aVar3 = d3.f1048h;
                    aVar3.getClass();
                    aVar3.h(new O0.j(aVar3));
                }
            }
            try {
                cVar.h(tVar);
            } catch (SecurityException e) {
                o(new L0.a(10), e);
            }
        } catch (IllegalStateException e3) {
            o(new L0.a(10), e3);
        }
    }

    public final void n(w wVar) {
        O0.u.c(this.f1106n.f1080m);
        boolean zC = this.f1096c.c();
        LinkedList linkedList = this.f1095b;
        if (zC) {
            if (k(wVar)) {
                j();
                return;
            } else {
                linkedList.add(wVar);
                return;
            }
        }
        linkedList.add(wVar);
        L0.a aVar = this.f1104l;
        if (aVar == null || aVar.f861b == 0 || aVar.f862c == null) {
            m();
        } else {
            o(aVar, null);
        }
    }

    public final void o(L0.a aVar, RuntimeException runtimeException) {
        p030i1.a aVar2;
        O0.u.c(this.f1106n.f1080m);
        D d3 = this.f1101i;
        if (d3 != null && (aVar2 = d3.f1048h) != null) {
            aVar2.i();
        }
        O0.u.c(this.f1106n.f1080m);
        this.f1104l = null;
        ((SparseIntArray) this.f1106n.f1074g.e).clear();
        a(aVar);
        if ((this.f1096c instanceof Q0.d) && aVar.f861b != 24) {
            C0083d c0083d = this.f1106n;
            c0083d.f1070b = true;
            Z0.f fVar = c0083d.f1080m;
            fVar.sendMessageDelayed(fVar.obtainMessage(19), 300000L);
        }
        if (aVar.f861b == 4) {
            b(C0083d.f1066p);
            return;
        }
        if (this.f1095b.isEmpty()) {
            this.f1104l = aVar;
            return;
        }
        if (runtimeException != null) {
            O0.u.c(this.f1106n.f1080m);
            c(null, runtimeException, false);
            return;
        }
        if (!this.f1106n.f1081n) {
            b(C0083d.c(this.f1097d, aVar));
            return;
        }
        c(C0083d.c(this.f1097d, aVar), null, true);
        if (this.f1095b.isEmpty() || l(aVar) || this.f1106n.b(aVar, this.f1100h)) {
            return;
        }
        if (aVar.f861b == 18) {
            this.f1102j = true;
        }
        if (!this.f1102j) {
            b(C0083d.c(this.f1097d, aVar));
            return;
        }
        C0083d c0083d2 = this.f1106n;
        C0081b c0081b = this.f1097d;
        Z0.f fVar2 = c0083d2.f1080m;
        fVar2.sendMessageDelayed(Message.obtain(fVar2, 9, c0081b), 5000L);
    }

    public final void p(L0.a aVar) {
        O0.u.c(this.f1106n.f1080m);
        M0.c cVar = this.f1096c;
        cVar.j("onSignInFailed for " + cVar.getClass().getName() + " with " + String.valueOf(aVar));
        o(aVar, null);
    }

    public final void q() {
        O0.u.c(this.f1106n.f1080m);
        Status status = C0083d.f1065o;
        b(status);
        this.e.u(false, status);
        for (h hVar : (h[]) this.f1099g.keySet().toArray(new h[0])) {
            n(new E(hVar, new p033j1.e()));
        }
        a(new L0.a(4));
        M0.c cVar = this.f1096c;
        if (cVar.c()) {
            cVar.k(new A0.f(9, this));
        }
    }
}
