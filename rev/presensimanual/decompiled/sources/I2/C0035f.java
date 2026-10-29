package I2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: I2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0035f extends C implements InterfaceC0034e, u2.c, n0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f473i = AtomicIntegerFieldUpdater.newUpdater(C0035f.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f474j = AtomicReferenceFieldUpdater.newUpdater(C0035f.class, Object.class, "_state");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f475k = AtomicReferenceFieldUpdater.newUpdater(C0035f.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p063s2.d f476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p063s2.i f477h;

    public C0035f(int i3, p063s2.d dVar) {
        super(i3);
        this.f476g = dVar;
        this.f477h = dVar.g();
        this._decisionAndIndex = 536870911;
        this._state = C0031b.f467d;
    }

    public static Object D(e0 e0Var, Object obj, int i3, A2.l lVar) {
        if ((obj instanceof C0043n) || !AbstractC0052x.f(i3)) {
            return obj;
        }
        if (lVar != null || (e0Var instanceof F)) {
            return new C0042m(obj, e0Var instanceof F ? (F) e0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void z(e0 e0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + e0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        p063s2.d dVar = this.f476g;
        Throwable th = null;
        N2.h hVar = dVar instanceof N2.h ? (N2.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N2.h.f1139k;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                A0.f fVar = N2.a.f1131d;
                if (obj != fVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, fVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == fVar);
            }
            if (th == null) {
                return;
            }
            r();
            q(th);
        }
    }

    public final void C(Object obj, int i3, A2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f474j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof e0)) {
                if (obj2 instanceof C0036g) {
                    C0036g c0036g = (C0036g) obj2;
                    c0036g.getClass();
                    if (C0036g.f478c.compareAndSet(c0036g, 0, 1)) {
                        if (lVar != null) {
                            n(lVar, c0036g.f490a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objD = D((e0) obj2, obj, i3, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (!y()) {
                        r();
                    }
                    s(i3);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // I2.n0
    public final void a(N2.u uVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f473i;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        x(uVar);
    }

    @Override // I2.C
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f474j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof e0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0043n) {
                return;
            }
            if (!(obj2 instanceof C0042m)) {
                C0042m c0042m = new C0042m(obj2, (F) null, (A2.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0042m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C0042m c0042m2 = (C0042m) obj2;
            if (c0042m2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0042m c0042mA = C0042m.a(c0042m2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0042mA)) {
                    F f3 = c0042m2.f485b;
                    if (f3 != null) {
                        j(f3, cancellationException);
                    }
                    A2.l lVar = c0042m2.f486c;
                    if (lVar != null) {
                        n(lVar, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // I2.C
    public final p063s2.d c() {
        return this.f476g;
    }

    @Override // I2.C
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // u2.c
    public final u2.c e() {
        p063s2.d dVar = this.f476g;
        if (dVar instanceof u2.c) {
            return (u2.c) dVar;
        }
        return null;
    }

    @Override // I2.C
    public final Object f(Object obj) {
        return obj instanceof C0042m ? ((C0042m) obj).f484a : obj;
    }

    @Override // p063s2.d
    public final p063s2.i g() {
        return this.f477h;
    }

    @Override // I2.C
    public final Object i() {
        return f474j.get(this);
    }

    public final void j(F f3, Throwable th) {
        try {
            f3.b(th);
        } catch (Throwable th2) {
            AbstractC0052x.d(new C0045p("Exception in invokeOnCancellation handler for " + this, th2), this.f477h);
        }
    }

    @Override // I2.InterfaceC0034e
    public final void k(Object obj, A2.l lVar) {
        C(obj, this.f433f, lVar);
    }

    @Override // p063s2.d
    public final void l(Object obj) {
        Throwable thA = p055q2.d.a(obj);
        if (thA != null) {
            obj = new C0043n(thA, false);
        }
        C(obj, this.f433f, null);
    }

    @Override // I2.InterfaceC0034e
    public final A0.f m(Object obj, A2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f474j;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof e0;
            A0.f fVar = AbstractC0052x.f497a;
            if (!z2) {
                boolean z3 = obj2 instanceof C0042m;
                return null;
            }
            Object objD = D((e0) obj2, obj, this.f433f, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objD)) {
                    if (y()) {
                        return fVar;
                    }
                    r();
                    return fVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final void n(A2.l lVar, Throwable th) {
        try {
            lVar.i(th);
        } catch (Throwable th2) {
            AbstractC0052x.d(new C0045p("Exception in resume onCancellation handler for " + this, th2), this.f477h);
        }
    }

    @Override // I2.InterfaceC0034e
    public final void o(Object obj) {
        s(this.f433f);
    }

    public final void p(N2.u uVar, Throwable th) {
        p063s2.i iVar = this.f477h;
        int i3 = f473i.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i3, iVar);
        } catch (Throwable th2) {
            AbstractC0052x.d(new C0045p("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void q(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f474j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof e0)) {
                return;
            }
            C0036g c0036g = new C0036g(this, th, (obj instanceof F) || (obj instanceof N2.u));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0036g)) {
                    e0 e0Var = (e0) obj;
                    if (e0Var instanceof F) {
                        j((F) obj, th);
                    } else if (e0Var instanceof N2.u) {
                        p((N2.u) obj, th);
                    }
                    if (!y()) {
                        r();
                    }
                    s(this.f433f);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f475k;
        E e = (E) atomicReferenceFieldUpdater.get(this);
        if (e == null) {
            return;
        }
        e.c();
        atomicReferenceFieldUpdater.set(this, d0.f472d);
    }

    public final void s(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f473i;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z2 = i3 == 4;
                p063s2.d dVar = this.f476g;
                if (z2 || !(dVar instanceof N2.h) || AbstractC0052x.f(i3) != AbstractC0052x.f(this.f433f)) {
                    AbstractC0052x.i(this, dVar, z2);
                    return;
                }
                AbstractC0048t abstractC0048t = ((N2.h) dVar).f1140g;
                p063s2.i iVarG = ((N2.h) dVar).f1141h.g();
                if (abstractC0048t.g()) {
                    abstractC0048t.d(iVarG, this);
                    return;
                }
                J jA = j0.a();
                if (jA.f442f >= 4294967296L) {
                    p059r2.b bVar = jA.f444h;
                    if (bVar == null) {
                        bVar = new p059r2.b();
                        jA.f444h = bVar;
                    }
                    bVar.addLast(this);
                    return;
                }
                jA.k(true);
                try {
                    AbstractC0052x.i(this, dVar, true);
                    do {
                    } while (jA.m());
                } catch (Throwable th) {
                    try {
                        h(th, null);
                    } finally {
                        jA.i(true);
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable t(b0 b0Var) {
        return b0Var.A();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0052x.k(this.f476g));
        sb.append("){");
        Object obj = f474j.get(this);
        if (obj instanceof e0) {
            str = "Active";
        } else {
            str = obj instanceof C0036g ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0052x.b(this));
        return sb.toString();
    }

    public final Object u() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean zY = y();
        do {
            atomicIntegerFieldUpdater = f473i;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zY) {
                    B();
                }
                Object obj = f474j.get(this);
                if (obj instanceof C0043n) {
                    throw ((C0043n) obj).f490a;
                }
                if (AbstractC0052x.f(this.f433f)) {
                    S s3 = (S) this.f477h.f(C0049u.e);
                    if (s3 != null && !s3.b()) {
                        CancellationException cancellationExceptionA = ((b0) s3).A();
                        b(obj, cancellationExceptionA);
                        throw cancellationExceptionA;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((E) f475k.get(this)) == null) {
            w();
        }
        if (zY) {
            B();
        }
        return t2.a.f5737d;
    }

    public final void v() {
        E eW = w();
        if (eW == null || (f474j.get(this) instanceof e0)) {
            return;
        }
        eW.c();
        f475k.set(this, d0.f472d);
    }

    public final E w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        S s3 = (S) this.f477h.f(C0049u.e);
        if (s3 == null) {
            return null;
        }
        E e = AbstractC0052x.e(s3, true, new C0037h(this), 2);
        do {
            atomicReferenceFieldUpdater = f475k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e;
    }

    public final void x(e0 e0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f474j;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0031b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof F ? true : obj instanceof N2.u) {
                z(e0Var, obj);
                throw null;
            }
            if (obj instanceof C0043n) {
                C0043n c0043n = (C0043n) obj;
                c0043n.getClass();
                if (!C0043n.f489b.compareAndSet(c0043n, 0, 1)) {
                    z(e0Var, obj);
                    throw null;
                }
                if (obj instanceof C0036g) {
                    if (!(obj instanceof C0043n)) {
                        c0043n = null;
                    }
                    Throwable th = c0043n != null ? c0043n.f490a : null;
                    if (e0Var instanceof F) {
                        j((F) e0Var, th);
                        return;
                    } else {
                        B2.h.c(e0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        p((N2.u) e0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0042m)) {
                if (e0Var instanceof N2.u) {
                    return;
                }
                B2.h.c(e0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0042m c0042m = new C0042m(obj, (F) e0Var, (A2.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0042m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0042m c0042m2 = (C0042m) obj;
            if (c0042m2.f485b != null) {
                z(e0Var, obj);
                throw null;
            }
            if (e0Var instanceof N2.u) {
                return;
            }
            B2.h.c(e0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            F f3 = (F) e0Var;
            Throwable th2 = c0042m2.e;
            if (th2 != null) {
                j(f3, th2);
                return;
            }
            C0042m c0042mA = C0042m.a(c0042m2, f3, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0042mA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean y() {
        if (this.f433f == 2) {
            p063s2.d dVar = this.f476g;
            B2.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (N2.h.f1139k.get((N2.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }
}
