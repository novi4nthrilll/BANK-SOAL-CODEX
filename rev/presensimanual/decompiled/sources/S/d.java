package S;

import B.C0006g;
import I1.x;
import N0.C;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.D;
import androidx.lifecycle.k;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public class d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, q, Z.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f1556r = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1557d = -1;
    public final String e = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E0.h f1558f = new E0.h();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f1559g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public D0.b f1560h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f1561i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s f1562j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C f1563k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f1564l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0006g f1565m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f1566n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1567o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1569q;

    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.lifecycle.q, java.lang.Object] */
    public d() {
        Object obj;
        D d3;
        String str;
        new a(this, 1);
        this.f1561i = k.f2388h;
        new u();
        new AtomicInteger();
        this.f1564l = new ArrayList();
        this.f1565m = new C0006g(24, this);
        this.f1562j = new s(this);
        C c3 = new C();
        c3.e = this;
        Z.d dVar = new Z.d();
        dVar.f1941c = new p042m.f();
        c3.f1042f = dVar;
        this.f1563k = c3;
        ArrayList arrayList = this.f1564l;
        C0006g c0006g = this.f1565m;
        if (!arrayList.contains(c0006g)) {
            if (this.f1557d >= 0) {
                d dVar2 = (d) c0006g.e;
                dVar2.f1563k.b();
                k kVar = dVar2.f1562j.f2395c;
                if (kVar != k.e && kVar != k.f2386f) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Z.d dVar3 = (Z.d) dVar2.f1563k.f1042f;
                dVar3.getClass();
                Iterator it = ((p042m.f) dVar3.f1941c).iterator();
                do {
                    p042m.b bVar = (p042m.b) it;
                    obj = null;
                    if (!bVar.hasNext()) {
                        d3 = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) bVar.next();
                    B2.h.d(entry, "components");
                    str = (String) entry.getKey();
                    d3 = (D) entry.getValue();
                } while (!B2.h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
                if (d3 == null) {
                    D d4 = new D((Z.d) dVar2.f1563k.f1042f, dVar2);
                    p042m.f fVar = (p042m.f) ((Z.d) dVar2.f1563k.f1042f).f1941c;
                    p042m.c cVarC = fVar.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (cVarC != null) {
                        obj = cVarC.e;
                    } else {
                        p042m.c cVar = new p042m.c("androidx.lifecycle.internal.SavedStateHandlesProvider", d4);
                        fVar.f5345g++;
                        p042m.c cVar2 = fVar.e;
                        if (cVar2 == null) {
                            fVar.f5343d = cVar;
                            fVar.e = cVar;
                        } else {
                            cVar2.f5339f = cVar;
                            cVar.f5340g = cVar2;
                            fVar.e = cVar;
                        }
                    }
                    if (((D) obj) != null) {
                        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                    }
                    dVar2.f1562j.b(new Z.a(2, d4));
                }
                C c4 = dVar2.f1563k;
                if (!c4.f1041d) {
                    c4.b();
                }
                s sVarB = c4.e.b();
                if (sVarB.f2395c.compareTo(k.f2387g) >= 0) {
                    throw new IllegalStateException(("performRestore cannot be called when owner is " + sVarB.f2395c).toString());
                }
                Z.d dVar4 = (Z.d) c4.f1042f;
                if (!dVar4.f1939a) {
                    throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
                }
                if (dVar4.f1940b) {
                    throw new IllegalStateException("SavedStateRegistry was already restored.");
                }
                dVar4.f1942d = null;
                dVar4.f1940b = true;
            } else {
                arrayList.add(c0006g);
            }
        }
        new a(this, 0);
        new b(this);
        this.f1566n = new c(this);
        this.f1567o = -1;
    }

    @Override // Z.e
    public final Z.d a() {
        return (Z.d) this.f1563k.f1042f;
    }

    @Override // androidx.lifecycle.q
    public final s b() {
        return this.f1562j;
    }

    public final T.b c() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final E0.h d() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f1568p) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1569q) {
            return;
        }
        this.f1569q = true;
        this.f1568p = true;
        if (this.f1567o >= 0) {
            E0.h hVarD = d();
            int i3 = this.f1567o;
            if (i3 < 0) {
                throw new IllegalArgumentException(I.f("Bad id: ", i3));
            }
            synchronized (((ArrayList) hVarD.f213f)) {
            }
            this.f1567o = -1;
            return;
        }
        x xVar = new x(d());
        i iVar = new i();
        iVar.f1573a = 3;
        iVar.f1574b = this;
        ((ArrayList) xVar.f431d).add(iVar);
        iVar.f1575c = 0;
        iVar.f1576d = 0;
        iVar.e = 0;
        iVar.f1577f = 0;
        xVar.b(true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
