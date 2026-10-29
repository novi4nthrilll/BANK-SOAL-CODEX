package N2;

import I2.AbstractC0048t;
import I2.AbstractC0052x;
import I2.C;
import I2.C0043n;
import I2.C0044o;
import I2.J;
import I2.j0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class h extends C implements u2.c, p063s2.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1139k = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AbstractC0048t f1140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u2.b f1141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f1142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f1143j;

    public h(AbstractC0048t abstractC0048t, u2.b bVar) {
        super(-1);
        this.f1140g = abstractC0048t;
        this.f1141h = bVar;
        this.f1142i = a.f1130c;
        this.f1143j = a.l(bVar.g());
    }

    @Override // I2.C
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0044o) {
            ((C0044o) obj).f492b.i(cancellationException);
        }
    }

    @Override // u2.c
    public final u2.c e() {
        u2.b bVar = this.f1141h;
        if (bVar instanceof u2.c) {
            return bVar;
        }
        return null;
    }

    @Override // p063s2.d
    public final p063s2.i g() {
        return this.f1141h.g();
    }

    @Override // I2.C
    public final Object i() {
        Object obj = this.f1142i;
        this.f1142i = a.f1130c;
        return obj;
    }

    @Override // p063s2.d
    public final void l(Object obj) {
        u2.b bVar = this.f1141h;
        p063s2.i iVarG = bVar.g();
        Throwable thA = p055q2.d.a(obj);
        Object c0043n = thA == null ? obj : new C0043n(thA, false);
        AbstractC0048t abstractC0048t = this.f1140g;
        if (abstractC0048t.g()) {
            this.f1142i = c0043n;
            this.f433f = 0;
            abstractC0048t.d(iVarG, this);
            return;
        }
        J jA = j0.a();
        if (jA.f442f >= 4294967296L) {
            this.f1142i = c0043n;
            this.f433f = 0;
            p059r2.b bVar2 = jA.f444h;
            if (bVar2 == null) {
                bVar2 = new p059r2.b();
                jA.f444h = bVar2;
            }
            bVar2.addLast(this);
            return;
        }
        jA.k(true);
        try {
            p063s2.i iVarG2 = bVar.g();
            Object objM = a.m(iVarG2, this.f1143j);
            try {
                bVar.l(obj);
                a.h(iVarG2, objM);
                while (jA.m()) {
                }
            } catch (Throwable th) {
                a.h(iVarG2, objM);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2, null);
            } finally {
                jA.i(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f1140g + ", " + AbstractC0052x.k(this.f1141h) + ']';
    }

    @Override // I2.C
    public final p063s2.d c() {
        return this;
    }
}
