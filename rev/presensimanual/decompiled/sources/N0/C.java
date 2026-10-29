package N0;

import B2.h;
import androidx.lifecycle.j;
import androidx.lifecycle.q;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class C implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1041d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1042f;

    public void a(double d3, double d4) {
        boolean z2 = this.f1041d;
        double[] dArr = (double[]) this.e;
        double d5 = 1.0d;
        if (!z2) {
            d5 = 1.0d / (((dArr[7] * d4) + (dArr[3] * d3)) + dArr[15]);
        }
        double d6 = ((dArr[4] * d4) + (dArr[0] * d3) + dArr[12]) * d5;
        double d7 = ((dArr[5] * d4) + (dArr[1] * d3) + dArr[13]) * d5;
        double[] dArr2 = (double[]) this.f1042f;
        if (d6 < dArr2[0]) {
            dArr2[0] = d6;
        } else if (d6 > dArr2[1]) {
            dArr2[1] = d6;
        }
        if (d7 < dArr2[2]) {
            dArr2[2] = d7;
        } else if (d7 > dArr2[3]) {
            dArr2[3] = d7;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.q, java.lang.Object] */
    public void b() {
        ?? r3 = this.e;
        androidx.lifecycle.s sVarB = r3.b();
        if (sVarB.f2395c != androidx.lifecycle.k.e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        sVarB.b(new Z.a(0, r3));
        final Z.d dVar = (Z.d) this.f1042f;
        dVar.getClass();
        if (dVar.f1939a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        sVarB.b(new androidx.lifecycle.o() { // from class: Z.b
            @Override // androidx.lifecycle.o
            public final void f(q qVar, j jVar) {
                h.e(dVar, "this$0");
            }
        });
        dVar.f1939a = true;
        this.f1041d = true;
    }

    public synchronized j c() {
        return (j) this.e;
    }

    public void d(p033j1.i iVar) {
        synchronized (this.e) {
            try {
                if (((ArrayDeque) this.f1042f) == null) {
                    this.f1042f = new ArrayDeque();
                }
                ((ArrayDeque) this.f1042f).add(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(p033j1.k kVar) {
        p033j1.i iVar;
        synchronized (this.e) {
            if (((ArrayDeque) this.f1042f) != null && !this.f1041d) {
                this.f1041d = true;
                while (true) {
                    synchronized (this.e) {
                        try {
                            iVar = (p033j1.i) ((ArrayDeque) this.f1042f).poll();
                            if (iVar == null) {
                                this.f1041d = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    iVar.a(kVar);
                }
            }
        }
    }

    @Override // N0.m
    public void r(Object obj, Object obj2) {
        h hVar;
        boolean z2;
        p006b1.i iVar = (p006b1.i) obj;
        p033j1.e eVar = (p033j1.e) obj2;
        synchronized (this) {
            hVar = (h) ((j) this.e).f1086c;
            z2 = this.f1041d;
            j jVar = (j) this.e;
            jVar.f1085b = null;
            jVar.f1086c = null;
        }
        if (hVar == null) {
            eVar.a(Boolean.FALSE);
        } else {
            p065t0.e.f5711g.i(iVar, hVar, z2, eVar);
        }
    }
}
