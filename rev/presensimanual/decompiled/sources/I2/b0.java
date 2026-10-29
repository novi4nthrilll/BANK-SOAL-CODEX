package I2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0485m3;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements S, f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f468d = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public b0(boolean z2) {
        this._state = z2 ? AbstractC0052x.f504i : AbstractC0052x.f503h;
    }

    public static C0039j M(N2.k kVar) {
        while (kVar.m()) {
            N2.k kVarG = kVar.g();
            if (kVarG == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N2.k.e;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (N2.k) obj;
                    if (!kVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = kVarG;
            }
        }
        while (true) {
            kVar = kVar.l();
            if (!kVar.m()) {
                if (kVar instanceof C0039j) {
                    return (C0039j) kVar;
                }
                if (kVar instanceof c0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (!(obj instanceof Z)) {
            if (obj instanceof N) {
                return ((N) obj).b() ? "Active" : "New";
            }
            return obj instanceof C0043n ? "Cancelled" : "Completed";
        }
        Z z2 = (Z) obj;
        if (z2.d()) {
            return "Cancelling";
        }
        return z2.e() ? "Completing" : "Active";
    }

    public final CancellationException A() {
        CancellationException cancellationException;
        Object objE = E();
        if (!(objE instanceof Z)) {
            if (objE instanceof N) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objE instanceof C0043n)) {
                return new T(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0043n) objE).f490a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new T(v(), th, this) : cancellationException;
        }
        Throwable thC = ((Z) objE).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = v();
        }
        return new T(strConcat, thC, this);
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0041l;
    }

    public final c0 D(N n3) {
        c0 c0VarF = n3.f();
        if (c0VarF != null) {
            return c0VarF;
        }
        if (n3 instanceof G) {
            return new c0();
        }
        if (n3 instanceof W) {
            Q((W) n3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + n3).toString());
    }

    public final Object E() {
        while (true) {
            Object obj = f468d.get(this);
            if (!(obj instanceof N2.q)) {
                return obj;
            }
            ((N2.q) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(S s3) {
        int iR;
        d0 d0Var = d0.f472d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        if (s3 == null) {
            atomicReferenceFieldUpdater.set(this, d0Var);
            return;
        }
        b0 b0Var = (b0) s3;
        do {
            iR = b0Var.R(b0Var.E());
            if (iR == 0) {
                break;
            }
        } while (iR != 1);
        InterfaceC0038i interfaceC0038i = (InterfaceC0038i) AbstractC0052x.e(b0Var, true, new C0039j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0038i);
        if (E() instanceof N) {
            return;
        }
        interfaceC0038i.c();
        atomicReferenceFieldUpdater.set(this, d0Var);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00c7 A[SYNTHETIC] */
    public final E I(boolean z2, boolean z3, A2.l lVar) {
        W q3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thC;
        if (z2) {
            q3 = lVar instanceof U ? (U) lVar : null;
            if (q3 == null) {
                q3 = new P(lVar);
            }
        } else {
            q3 = lVar instanceof W ? (W) lVar : null;
            if (q3 == null) {
                q3 = new Q(0, lVar);
            }
        }
        q3.f454g = this;
        while (true) {
            Object objE = E();
            if (objE instanceof G) {
                G g3 = (G) objE;
                if (g3.f437d) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f468d;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objE, q3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objE) {
                        }
                    }
                    return q3;
                }
                c0 c0Var = new c0();
                N m3 = g3.f437d ? c0Var : new M(c0Var);
                do {
                    atomicReferenceFieldUpdater = f468d;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, g3, m3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == g3);
            } else {
                if (!(objE instanceof N)) {
                    if (z3) {
                        C0043n c0043n = objE instanceof C0043n ? (C0043n) objE : null;
                        lVar.i(c0043n != null ? c0043n.f490a : null);
                    }
                    return d0.f472d;
                }
                c0 c0VarF = ((N) objE).f();
                if (c0VarF == null) {
                    B2.h.c(objE, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((W) objE);
                } else {
                    E e3 = d0.f472d;
                    if (z2 && (objE instanceof Z)) {
                        synchronized (objE) {
                            try {
                                thC = ((Z) objE).c();
                                if (thC == null || ((lVar instanceof C0039j) && !((Z) objE).e())) {
                                    if (p((N) objE, c0VarF, q3)) {
                                        if (thC == null) {
                                            return q3;
                                        }
                                        e3 = q3;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thC != null) {
                            if (z3) {
                                lVar.i(thC);
                            }
                            return e3;
                        }
                        if (p((N) objE, c0VarF, q3)) {
                            return q3;
                        }
                    } else {
                        thC = null;
                        if (thC != null) {
                            if (z3) {
                                lVar.i(thC);
                            }
                            return e3;
                        }
                        if (p((N) objE, c0VarF, q3)) {
                            return q3;
                        }
                    }
                }
            }
        }
    }

    public boolean J() {
        return this instanceof C0032c;
    }

    public final boolean K(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objT;
        do {
            objT = T(E(), obj);
            if (objT == AbstractC0052x.f499c) {
                return false;
            }
            if (objT == AbstractC0052x.f500d) {
                return true;
            }
        } while (objT == AbstractC0052x.e);
        q(objT);
        return true;
    }

    public final Object L(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objT;
        do {
            objT = T(E(), obj);
            if (objT == AbstractC0052x.f499c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0043n c0043n = obj instanceof C0043n ? (C0043n) obj : null;
                throw new IllegalStateException(str, c0043n != null ? c0043n.f490a : null);
            }
        } while (objT == AbstractC0052x.e);
        return objT;
    }

    public final void N(c0 c0Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objK = c0Var.k();
        B2.h.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C0045p c0045p = null;
        for (N2.k kVarL = (N2.k) objK; !kVarL.equals(c0Var); kVarL = kVarL.l()) {
            if (kVarL instanceof U) {
                W w3 = (W) kVarL;
                try {
                    w3.o(th);
                } catch (Throwable th2) {
                    if (c0045p != null) {
                        AbstractC0443f3.a(c0045p, th2);
                    } else {
                        c0045p = new C0045p("Exception in completion handler " + w3 + " for " + this, th2);
                    }
                }
            }
        }
        if (c0045p != null) {
            G(c0045p);
        }
        u(th);
    }

    public final void Q(W w3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c0 c0Var = new c0();
        w3.getClass();
        N2.k.e.lazySet(c0Var, w3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = N2.k.f1149d;
        atomicReferenceFieldUpdater2.lazySet(c0Var, w3);
        loop0: while (w3.k() == w3) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(w3, w3, c0Var)) {
                    c0Var.j(w3);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(w3) == w3);
        }
        N2.k kVarL = w3.l();
        do {
            atomicReferenceFieldUpdater = f468d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w3, kVarL)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w3);
    }

    public final int R(Object obj) {
        boolean z2 = obj instanceof G;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f468d;
        if (z2) {
            if (((G) obj).f437d) {
                return 0;
            }
            G g3 = AbstractC0052x.f504i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof M)) {
            return 0;
        }
        c0 c0Var = ((M) obj).f446d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object T(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof N)) {
            return AbstractC0052x.f499c;
        }
        if (((obj instanceof G) || (obj instanceof W)) && !(obj instanceof C0039j) && !(obj2 instanceof C0043n)) {
            N n3 = (N) obj;
            Object o3 = obj2 instanceof N ? new O((N) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f468d;
                if (atomicReferenceFieldUpdater.compareAndSet(this, n3, o3)) {
                    O(obj2);
                    x(n3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == n3);
            return AbstractC0052x.e;
        }
        N n4 = (N) obj;
        c0 c0VarD = D(n4);
        if (c0VarD == null) {
            return AbstractC0052x.e;
        }
        C0039j c0039jM = null;
        Z z2 = n4 instanceof Z ? (Z) n4 : null;
        if (z2 == null) {
            z2 = new Z(c0VarD, null);
        }
        synchronized (z2) {
            if (z2.e()) {
                return AbstractC0052x.f499c;
            }
            Z.e.set(z2, 1);
            if (z2 != n4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f468d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, n4, z2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != n4) {
                        return AbstractC0052x.e;
                    }
                }
            }
            boolean zD = z2.d();
            C0043n c0043n = obj2 instanceof C0043n ? (C0043n) obj2 : null;
            if (c0043n != null) {
                z2.a(c0043n.f490a);
            }
            Throwable thC = z2.c();
            if (zD) {
                thC = null;
            }
            if (thC != null) {
                N(c0VarD, thC);
            }
            C0039j c0039j = n4 instanceof C0039j ? (C0039j) n4 : null;
            if (c0039j == null) {
                c0 c0VarF = n4.f();
                if (c0VarF != null) {
                    c0039jM = M(c0VarF);
                }
            } else {
                c0039jM = c0039j;
            }
            if (c0039jM != null) {
                while (AbstractC0052x.e(c0039jM.f480h, false, new Y(this, z2, c0039jM, obj2), 1) == d0.f472d) {
                    c0039jM = M(c0039jM);
                    if (c0039jM == null) {
                    }
                }
                return AbstractC0052x.f500d;
            }
            return z(z2, obj2);
        }
    }

    @Override // I2.S
    public void a(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new T(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // I2.S
    public boolean b() {
        Object objE = E();
        return (objE instanceof N) && ((N) objE).b();
    }

    @Override // p063s2.i
    public final Object c(Object obj, A2.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // p063s2.i
    public final p063s2.g f(p063s2.h hVar) {
        return AbstractC0485m3.a(this, hVar);
    }

    @Override // p063s2.g
    public final p063s2.h getKey() {
        return C0049u.e;
    }

    @Override // p063s2.i
    public final p063s2.i h(p063s2.i iVar) {
        B2.h.e(iVar, "context");
        return iVar == p063s2.j.f5670d ? this : (p063s2.i) iVar.c(this, new p063s2.b(1));
    }

    @Override // p063s2.i
    public final p063s2.i n(p063s2.h hVar) {
        return AbstractC0485m3.b(this, hVar);
    }

    public final boolean p(N n3, c0 c0Var, W w3) {
        char c3;
        a0 a0Var = new a0(w3, this, n3);
        do {
            N2.k kVarG = c0Var.g();
            if (kVarG == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = N2.k.e;
                Object obj = atomicReferenceFieldUpdater.get(c0Var);
                while (true) {
                    kVarG = (N2.k) obj;
                    if (!kVarG.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVarG);
                }
            }
            N2.k.e.lazySet(w3, kVarG);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = N2.k.f1149d;
            atomicReferenceFieldUpdater2.lazySet(w3, c0Var);
            a0Var.f465c = c0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(kVarG, c0Var, a0Var)) {
                    if (a0Var.a(kVarG) != null) {
                        c3 = 2;
                        break;
                    }
                    c3 = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(kVarG) != c0Var) {
                    c3 = 0;
                    break;
                }
            }
            if (c3 == 1) {
                return true;
            }
        } while (c3 != 2);
        return false;
    }

    public void r(Object obj) {
        q(obj);
    }

    public final boolean s(Object obj) throws IllegalAccessException, InvocationTargetException {
        A0.f fVar;
        Object objT = AbstractC0052x.f499c;
        if (C()) {
            do {
                Object objE = E();
                if (!(objE instanceof N) || ((objE instanceof Z) && ((Z) objE).e())) {
                    objT = AbstractC0052x.f499c;
                    break;
                }
                objT = T(objE, new C0043n(y(obj), false));
            } while (objT == AbstractC0052x.e);
            if (objT == AbstractC0052x.f500d) {
                return true;
            }
        }
        if (objT == AbstractC0052x.f499c) {
            Throwable thY = null;
            loop1: while (true) {
                Object objE2 = E();
                if (objE2 instanceof Z) {
                    synchronized (objE2) {
                        try {
                            Z z2 = (Z) objE2;
                            z2.getClass();
                            if (Z.f461g.get(z2) == AbstractC0052x.f502g) {
                                fVar = AbstractC0052x.f501f;
                            } else {
                                boolean zD = ((Z) objE2).d();
                                if (thY == null) {
                                    thY = y(obj);
                                }
                                ((Z) objE2).a(thY);
                                Throwable thC = zD ? null : ((Z) objE2).c();
                                if (thC != null) {
                                    N(((Z) objE2).f462d, thC);
                                }
                                fVar = AbstractC0052x.f499c;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (objE2 instanceof N) {
                    if (thY == null) {
                        thY = y(obj);
                    }
                    N n3 = (N) objE2;
                    if (n3.b()) {
                        c0 c0VarD = D(n3);
                        if (c0VarD == null) {
                            continue;
                        } else {
                            Z z3 = new Z(c0VarD, thY);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f468d;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, n3, z3)) {
                                    N(c0VarD, thY);
                                    fVar = AbstractC0052x.f499c;
                                } else if (atomicReferenceFieldUpdater.get(this) != n3) {
                                }
                            }
                        }
                    } else {
                        Object objT2 = T(objE2, new C0043n(thY, false));
                        if (objT2 == AbstractC0052x.f499c) {
                            throw new IllegalStateException(("Cannot happen in " + objE2).toString());
                        }
                        if (objT2 != AbstractC0052x.e) {
                            objT = objT2;
                            break;
                        }
                    }
                } else {
                    fVar = AbstractC0052x.f501f;
                }
                objT = fVar;
                break;
            }
        }
        if (objT != AbstractC0052x.f499c && objT != AbstractC0052x.f500d) {
            if (objT == AbstractC0052x.f501f) {
                return false;
            }
            q(objT);
        }
        return true;
    }

    public void t(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + S(E()) + '}');
        sb.append('@');
        sb.append(AbstractC0052x.b(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0038i interfaceC0038i = (InterfaceC0038i) e.get(this);
        if (interfaceC0038i == null || interfaceC0038i == d0.f472d) {
            return z2;
        }
        return interfaceC0038i.e(th) || z2;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return s(th) && B();
    }

    public final void x(N n3, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        InterfaceC0038i interfaceC0038i = (InterfaceC0038i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0038i != null) {
            interfaceC0038i.c();
            atomicReferenceFieldUpdater.set(this, d0.f472d);
        }
        C0045p c0045p = null;
        C0043n c0043n = obj instanceof C0043n ? (C0043n) obj : null;
        Throwable th = c0043n != null ? c0043n.f490a : null;
        if (n3 instanceof W) {
            try {
                ((W) n3).o(th);
                return;
            } catch (Throwable th2) {
                G(new C0045p("Exception in completion handler " + n3 + " for " + this, th2));
                return;
            }
        }
        c0 c0VarF = n3.f();
        if (c0VarF != null) {
            Object objK = c0VarF.k();
            B2.h.c(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (N2.k kVarL = (N2.k) objK; !kVarL.equals(c0VarF); kVarL = kVarL.l()) {
                if (kVarL instanceof W) {
                    W w3 = (W) kVarL;
                    try {
                        w3.o(th);
                    } catch (Throwable th3) {
                        if (c0045p != null) {
                            AbstractC0443f3.a(c0045p, th3);
                        } else {
                            c0045p = new C0045p("Exception in completion handler " + w3 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0045p != null) {
                G(c0045p);
            }
        }
    }

    public final Throwable y(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        b0 b0Var = (b0) ((f0) obj);
        Object objE = b0Var.E();
        if (objE instanceof Z) {
            thC = ((Z) objE).c();
        } else if (objE instanceof C0043n) {
            thC = ((C0043n) objE).f490a;
        } else {
            if (objE instanceof N) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objE).toString());
            }
            thC = null;
        }
        CancellationException t3 = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (t3 == null) {
            t3 = new T("Parent job is ".concat(S(objE)), thC, b0Var);
        }
        return t3;
    }

    public final Object z(Z z2, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2 = null;
        Throwable t3 = null;
        C0043n c0043n = obj instanceof C0043n ? (C0043n) obj : null;
        Throwable th = c0043n != null ? c0043n.f490a : null;
        synchronized (z2) {
            z2.d();
            ArrayList<Throwable> arrayListG = z2.g(th);
            if (!arrayListG.isEmpty()) {
                for (Object obj3 : arrayListG) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                t3 = (Throwable) obj2;
                if (t3 == null) {
                    t3 = (Throwable) arrayListG.get(0);
                }
            } else if (z2.d()) {
                t3 = new T(v(), null, this);
            }
            if (t3 != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                for (Throwable th2 : arrayListG) {
                    if (th2 != t3 && th2 != t3 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC0443f3.a(t3, th2);
                    }
                }
            }
        }
        if (t3 != null && t3 != th) {
            obj = new C0043n(t3, false);
        }
        if (t3 != null && (u(t3) || F(t3))) {
            B2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0043n.f489b.compareAndSet((C0043n) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f468d;
        Object o3 = obj instanceof N ? new O((N) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z2, o3) && atomicReferenceFieldUpdater.get(this) == z2) {
        }
        x(z2, obj);
        return obj;
    }

    public void P() {
    }

    public void G(C0045p c0045p) {
        throw c0045p;
    }

    public void O(Object obj) {
    }

    public void q(Object obj) {
    }
}
