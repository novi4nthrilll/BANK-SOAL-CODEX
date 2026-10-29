package I2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;
import p013d1.AbstractC0505q;

/* JADX INFO: renamed from: I2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0052x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A0.f f499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A0.f f500d;
    public static final A0.f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A0.f f501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A0.f f502g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A0.f f497a = new A0.f(10, "RESUME_TOKEN");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A0.f f498b = new A0.f(10, "CLOSED_EMPTY");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final G f503h = new G(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final G f504i = new G(true);

    static {
        int i3 = 10;
        f499c = new A0.f(i3, "COMPLETING_ALREADY");
        f500d = new A0.f(i3, "COMPLETING_WAITING_CHILDREN");
        e = new A0.f(i3, "COMPLETING_RETRY");
        f501f = new A0.f(i3, "TOO_LATE_TO_CANCEL");
        f502g = new A0.f(i3, "SEALED");
    }

    public static final p063s2.i a(p063s2.i iVar, p063s2.i iVar2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        C0046q c0046q = C0046q.f494g;
        boolean zBooleanValue = ((Boolean) iVar.c(bool, c0046q)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.c(bool, c0046q)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.h(iVar2);
        }
        p063s2.j jVar = p063s2.j.f5670d;
        p063s2.i iVar3 = (p063s2.i) iVar.c(jVar, new C0046q(2, 2));
        Object objC = iVar2;
        if (zBooleanValue2) {
            objC = iVar2.c(jVar, C0046q.f493f);
        }
        return iVar3.h((p063s2.i) objC);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0035f c(p063s2.d dVar) {
        C0035f c0035f;
        C0035f c0035f2;
        if (!(dVar instanceof N2.h)) {
            return new C0035f(1, dVar);
        }
        N2.h hVar = (N2.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N2.h.f1139k;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            A0.f fVar = N2.a.f1131d;
            c0035f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, fVar);
                c0035f2 = null;
                break;
            }
            if (obj instanceof C0035f) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, fVar)) {
                        c0035f2 = (C0035f) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == obj);
            } else if (obj != fVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0035f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0035f.f474j;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0035f2);
            if (!(obj2 instanceof C0042m) || ((C0042m) obj2).f487d == null) {
                C0035f.f473i.set(c0035f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0035f2, C0031b.f467d);
                c0035f = c0035f2;
            } else {
                c0035f2.r();
            }
            if (c0035f != null) {
                return c0035f;
            }
        }
        return new C0035f(2, dVar);
    }

    public static final void d(Throwable th, p063s2.i iVar) {
        try {
            J2.b bVar = (J2.b) iVar.f(C0049u.f496d);
            if (bVar != null) {
                bVar.d(th, iVar);
            } else {
                N2.a.e(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0443f3.a(runtimeException, th);
                th = runtimeException;
            }
            N2.a.e(th, iVar);
        }
    }

    public static /* synthetic */ E e(S s3, boolean z2, W w3, int i3) {
        if ((i3 & 1) != 0) {
            z2 = false;
        }
        return ((b0) s3).I(z2, (i3 & 2) != 0, w3);
    }

    public static final boolean f(int i3) {
        return i3 == 1 || i3 == 2;
    }

    public static g0 g(InterfaceC0050v interfaceC0050v, A2.p pVar) {
        p063s2.i iVarA = a(interfaceC0050v.j(), p063s2.j.f5670d, true);
        P2.d dVar = D.f434a;
        if (iVarA != dVar && iVarA.f(p063s2.e.f5669d) == null) {
            iVarA = iVarA.h(dVar);
        }
        g0 g0Var = new g0(iVarA, true);
        g0Var.W(1, g0Var, pVar);
        return g0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0043n ? AbstractC0449g3.a(((C0043n) obj).f490a) : obj;
    }

    public static final void i(C0035f c0035f, p063s2.d dVar, boolean z2) {
        Object obj = C0035f.f474j.get(c0035f);
        Throwable thD = c0035f.d(obj);
        Object objA = thD != null ? AbstractC0449g3.a(thD) : c0035f.f(obj);
        if (!z2) {
            dVar.l(objA);
            return;
        }
        B2.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        N2.h hVar = (N2.h) dVar;
        u2.b bVar = hVar.f1141h;
        p063s2.i iVarG = bVar.g();
        Object objM = N2.a.m(iVarG, hVar.f1143j);
        l0 l0VarM = objM != N2.a.f1132f ? m(bVar, iVarG, objM) : null;
        try {
            bVar.l(objA);
        } finally {
            if (l0VarM == null || l0VarM.X()) {
                N2.a.h(iVarG, objM);
            }
        }
    }

    public static Object j(A2.p pVar) throws Throwable {
        p063s2.j jVar = p063s2.j.f5670d;
        Thread threadCurrentThread = Thread.currentThread();
        p063s2.e eVar = p063s2.e.f5669d;
        J jA = j0.a();
        p063s2.i iVarA = a(jVar, jA, true);
        P2.d dVar = D.f434a;
        if (iVarA != dVar && iVarA.f(eVar) == null) {
            iVarA = iVarA.h(dVar);
        }
        C0032c c0032c = new C0032c(iVarA, threadCurrentThread, jA);
        c0032c.W(1, c0032c, pVar);
        J j3 = c0032c.f470h;
        if (j3 != null) {
            int i3 = J.f441i;
            j3.k(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jL = j3 != null ? j3.l() : Long.MAX_VALUE;
                if (!(c0032c.E() instanceof N)) {
                    if (j3 != null) {
                        int i4 = J.f441i;
                        j3.i(false);
                    }
                    Object objL = l(c0032c.E());
                    C0043n c0043n = objL instanceof C0043n ? (C0043n) objL : null;
                    if (c0043n == null) {
                        return objL;
                    }
                    throw c0043n.f490a;
                }
                LockSupport.parkNanos(c0032c, jL);
            } catch (Throwable th) {
                if (j3 != null) {
                    int i5 = J.f441i;
                    j3.i(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0032c.s(interruptedException);
        throw interruptedException;
    }

    public static final String k(p063s2.d dVar) {
        Object objA;
        if (dVar instanceof N2.h) {
            return dVar.toString();
        }
        try {
            objA = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            objA = AbstractC0449g3.a(th);
        }
        if (p055q2.d.a(objA) != null) {
            objA = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) objA;
    }

    public static final Object l(Object obj) {
        N n3;
        O o3 = obj instanceof O ? (O) obj : null;
        return (o3 == null || (n3 = o3.f447a) == null) ? obj : n3;
    }

    public static final l0 m(p063s2.d dVar, p063s2.i iVar, Object obj) {
        l0 l0Var = null;
        if (!(dVar instanceof u2.c)) {
            return null;
        }
        if (iVar.f(m0.f488d) != null) {
            u2.c cVarE = (u2.c) dVar;
            while (!(cVarE instanceof B) && (cVarE = cVarE.e()) != null) {
                if (cVarE instanceof l0) {
                    l0Var = (l0) cVarE;
                    break;
                }
            }
            if (l0Var != null) {
                l0Var.Y(iVar, obj);
            }
        }
        return l0Var;
    }

    public static final Object n(p063s2.i iVar, A2.p pVar, u2.f fVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        p063s2.i iVar2 = fVar.e;
        B2.h.b(iVar2);
        p063s2.i iVarH = !((Boolean) iVar.c(Boolean.FALSE, C0046q.f494g)).booleanValue() ? iVar2.h(iVar) : a(iVar2, iVar, false);
        S s3 = (S) iVarH.f(C0049u.e);
        if (s3 != null && !s3.b()) {
            throw ((b0) s3).A();
        }
        if (iVarH == iVar2) {
            N2.t tVar = new N2.t(fVar, iVarH);
            return p013d1.r.a(tVar, tVar, pVar);
        }
        p063s2.e eVar = p063s2.e.f5669d;
        if (B2.h.a(iVarH.f(eVar), iVar2.f(eVar))) {
            l0 l0Var = new l0(iVarH, fVar);
            p063s2.i iVar3 = l0Var.f463f;
            Object objM = N2.a.m(iVar3, null);
            try {
                return p013d1.r.a(l0Var, l0Var, pVar);
            } finally {
                N2.a.h(iVar3, objM);
            }
        }
        B b3 = new B(fVar, iVarH);
        AbstractC0505q.a(pVar, b3, b3);
        do {
            atomicIntegerFieldUpdater = B.f432h;
            int i3 = atomicIntegerFieldUpdater.get(b3);
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objL = l(b3.E());
                if (objL instanceof C0043n) {
                    throw ((C0043n) objL).f490a;
                }
                return objL;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(b3, 0, 1));
        return t2.a.f5737d;
    }
}
