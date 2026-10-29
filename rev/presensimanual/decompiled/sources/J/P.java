package J;

import B.C0006g;
import I2.AbstractC0052x;
import I2.C0041l;
import I2.C0043n;
import I2.C0045p;
import I2.InterfaceC0040k;
import I2.InterfaceC0050v;
import I2.g0;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class P implements InterfaceC0062h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L.f f571d;
    public final p071w1.b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0050v f572f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f575i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f576j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final E0.n f578l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final E0.n f581o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0006g f573g = new C0006g(new C0073t(this, null));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q2.d f574h = Q2.e.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0006g f577k = new C0006g(6);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p055q2.e f579m = new p055q2.e(new C0067m(this, 1));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p055q2.e f580n = new p055q2.e(new C0067m(this, 0));

    public P(L.f fVar, List list, p071w1.b bVar, InterfaceC0050v interfaceC0050v) {
        this.f571d = fVar;
        this.e = bVar;
        this.f572f = interfaceC0050v;
        this.f578l = new E0.n(this, list);
        this.f581o = new E0.n(interfaceC0050v, new K(0, this), new M(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(P p3, u2.b bVar) {
        C0074u c0074u;
        Q2.d dVar;
        p3.getClass();
        if (bVar instanceof C0074u) {
            c0074u = (C0074u) bVar;
            int i3 = c0074u.f675k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0074u.f675k = i3 - Integer.MIN_VALUE;
            } else {
                c0074u = new C0074u(p3, bVar);
            }
        } else {
            c0074u = new C0074u(p3, bVar);
        }
        Object obj = c0074u.f673i;
        t2.a aVar = t2.a.f5737d;
        int i4 = c0074u.f675k;
        if (i4 == 0) {
            AbstractC0449g3.b(obj);
            c0074u.f671g = p3;
            dVar = p3.f574h;
            c0074u.f672h = dVar;
            c0074u.f675k = 1;
            if (dVar.c(c0074u) == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q2.d dVar2 = c0074u.f672h;
            P p4 = c0074u.f671g;
            AbstractC0449g3.b(obj);
            dVar = dVar2;
            p3 = p4;
        }
        try {
            int i5 = p3.f575i - 1;
            p3.f575i = i5;
            if (i5 == 0) {
                g0 g0Var = p3.f576j;
                if (g0Var != null) {
                    g0Var.a(null);
                }
                p3.f576j = null;
            }
            return p055q2.g.f5603a;
        } finally {
            dVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [A2.p, u2.f] */
    /* JADX WARN: Type inference failed for: r2v9, types: [A2.p, u2.f] */
    /* JADX WARN: Type inference failed for: r9v0, types: [J.P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [J.P] */
    public static final Object b(P p3, S s3, u2.b bVar) throws IllegalAccessException, InvocationTargetException {
        C0076w c0076w;
        InterfaceC0040k interfaceC0040k;
        C0041l c0041l;
        ?? r9;
        ?? r3;
        p063s2.i iVar;
        Object objB;
        ?? r10;
        Throwable thA;
        C0041l c0041l2;
        p3.getClass();
        if (bVar instanceof C0076w) {
            c0076w = (C0076w) bVar;
            int i3 = c0076w.f683l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0076w.f683l = i3 - Integer.MIN_VALUE;
            } else {
                c0076w = new C0076w(p3, bVar);
            }
        } else {
            c0076w = new C0076w(p3, bVar);
        }
        Object objA = c0076w.f681j;
        t2.a aVar = t2.a.f5737d;
        int i4 = c0076w.f683l;
        boolean z2 = true;
        try {
            if (i4 != 0) {
                try {
                    if (i4 == 1) {
                        interfaceC0040k = (InterfaceC0040k) c0076w.f678g;
                    } else if (i4 == 2) {
                        C0041l c0041l3 = c0076w.f680i;
                        P p4 = c0076w.f679h;
                        S s4 = (S) c0076w.f678g;
                        AbstractC0449g3.b(objA);
                        c0041l = c0041l3;
                        r9 = p4;
                        s3 = s4;
                    } else {
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0040k = (InterfaceC0040k) c0076w.f678g;
                    }
                    AbstractC0449g3.b(objA);
                    r10 = interfaceC0040k;
                } catch (Throwable th) {
                    th = th;
                    objA = AbstractC0449g3.a(th);
                    r10 = p3;
                }
                thA = p055q2.d.a(objA);
                c0041l2 = (C0041l) r10;
                if (thA == null) {
                    c0041l2.K(objA);
                } else {
                    c0041l2.getClass();
                    c0041l2.K(new C0043n(thA, false));
                }
                return p055q2.g.f5603a;
            }
            AbstractC0449g3.b(objA);
            c0041l = s3.f584b;
            try {
                a0 a0VarH = p3.f577k.h();
                if (a0VarH instanceof C0057c) {
                    ?? r4 = s3.f583a;
                    p063s2.i iVar2 = s3.f586d;
                    c0076w.f678g = c0041l;
                    c0076w.f683l = 1;
                    try {
                        objB = p3.h().b(new G((P) p3, iVar2, (A2.p) r4, (p063s2.d) null), c0076w);
                        if (objB == aVar) {
                            return aVar;
                        }
                        C0041l c0041l4 = c0041l;
                        objA = objB;
                        r10 = c0041l4;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        p3 = c0041l;
                        objA = AbstractC0449g3.a(th);
                        r10 = p3;
                    }
                    thA = p055q2.d.a(objA);
                    c0041l2 = (C0041l) r10;
                    if (thA == null) {
                        c0041l2.K(objA);
                    } else {
                        c0041l2.getClass();
                        c0041l2.K(new C0043n(thA, false));
                    }
                    return p055q2.g.f5603a;
                }
                if (!(a0VarH instanceof T)) {
                    z2 = a0VarH instanceof b0;
                }
                if (!z2) {
                    if (a0VarH instanceof Q) {
                        throw ((Q) a0VarH).f582b;
                    }
                    throw new C0045p();
                }
                if (a0VarH != s3.f585c) {
                    B2.h.c(a0VarH, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                    throw ((T) a0VarH).f587b;
                }
                c0076w.f678g = s3;
                c0076w.f679h = p3;
                c0076w.f680i = c0041l;
                c0076w.f683l = 2;
                if (p3.i(c0076w) == aVar) {
                    r9 = p3;
                    return aVar;
                }
            } catch (Throwable th3) {
                th = th3;
                p3 = c0041l;
                objA = AbstractC0449g3.a(th);
                r10 = p3;
            }
            objB = r9.h().b(new G((P) r9, iVar, (A2.p) r3, (p063s2.d) null), c0076w);
            if (objB == aVar) {
                return aVar;
            }
            C0041l c0041l5 = c0041l;
            objA = objB;
            r10 = c0041l5;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            p3 = c0041l;
            objA = AbstractC0449g3.a(th);
            r10 = p3;
        }
        r9 = p3;
        r3 = s3.f583a;
        iVar = s3.f586d;
        c0076w.f678g = c0041l;
        c0076w.f679h = null;
        c0076w.f680i = null;
        c0076w.f683l = 3;
        thA = p055q2.d.a(objA);
        c0041l2 = (C0041l) r10;
        if (thA == null) {
            c0041l2.K(objA);
        } else {
            c0041l2.getClass();
            c0041l2.K(new C0043n(thA, false));
        }
        return p055q2.g.f5603a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(P p3, u2.b bVar) {
        C0077x c0077x;
        Q2.d dVar;
        p3.getClass();
        if (bVar instanceof C0077x) {
            c0077x = (C0077x) bVar;
            int i3 = c0077x.f688k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0077x.f688k = i3 - Integer.MIN_VALUE;
            } else {
                c0077x = new C0077x(p3, bVar);
            }
        } else {
            c0077x = new C0077x(p3, bVar);
        }
        Object obj = c0077x.f686i;
        t2.a aVar = t2.a.f5737d;
        int i4 = c0077x.f688k;
        if (i4 == 0) {
            AbstractC0449g3.b(obj);
            c0077x.f684g = p3;
            dVar = p3.f574h;
            c0077x.f685h = dVar;
            c0077x.f688k = 1;
            if (dVar.c(c0077x) == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q2.d dVar2 = c0077x.f685h;
            P p4 = c0077x.f684g;
            AbstractC0449g3.b(obj);
            dVar = dVar2;
            p3 = p4;
        }
        try {
            int i5 = p3.f575i + 1;
            p3.f575i = i5;
            if (i5 == 1) {
                p3.f576j = AbstractC0052x.g(p3.f572f, new C0079z(p3, null));
            }
            return p055q2.g.f5603a;
        } finally {
            dVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object d(P p3, boolean z2, p063s2.d dVar) {
        B b3;
        P p4;
        a0 a0Var;
        P p5;
        p055q2.b bVar;
        a0 a0Var2;
        p3.getClass();
        if (dVar instanceof B) {
            b3 = (B) dVar;
            int i3 = b3.f518l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b3.f518l = i3 - Integer.MIN_VALUE;
            } else {
                b3 = new B(p3, dVar);
            }
        } else {
            b3 = new B(p3, dVar);
        }
        Object objC = b3.f516j;
        t2.a aVar = t2.a.f5737d;
        int i4 = b3.f518l;
        if (i4 == 0) {
            AbstractC0449g3.b(objC);
            a0 a0VarH = p3.f577k.h();
            if (a0VarH instanceof b0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            Z zH = p3.h();
            b3.f513g = p3;
            b3.f514h = a0VarH;
            b3.f515i = z2;
            b3.f518l = 1;
            Integer numA = zH.a();
            if (numA == aVar) {
                return aVar;
            }
            p4 = p3;
            a0Var = a0VarH;
            objC = numA;
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    p5 = b3.f513g;
                    AbstractC0449g3.b(objC);
                    bVar = (p055q2.b) objC;
                    a0Var2 = (a0) bVar.f5598d;
                    if (((Boolean) bVar.e).booleanValue()) {
                        return a0Var2;
                    }
                    p5.f577k.s(a0Var2);
                    return a0Var2;
                }
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p5 = b3.f513g;
                AbstractC0449g3.b(objC);
                bVar = (p055q2.b) objC;
                a0Var2 = (a0) bVar.f5598d;
                if (((Boolean) bVar.e).booleanValue()) {
                    return a0Var2;
                }
                p5.f577k.s(a0Var2);
                return a0Var2;
            }
            z2 = b3.f515i;
            a0Var = b3.f514h;
            p4 = b3.f513g;
            AbstractC0449g3.b(objC);
        }
        int iIntValue = ((Number) objC).intValue();
        boolean z3 = a0Var instanceof C0057c;
        int i5 = z3 ? a0Var.f609a : -1;
        if (z3 && iIntValue == i5) {
            return a0Var;
        }
        if (z2) {
            Z zH2 = p4.h();
            C c3 = new C(p4, null);
            b3.f513g = p4;
            b3.f514h = null;
            b3.f518l = 2;
            objC = zH2.b(c3, b3);
            if (objC == aVar) {
                return aVar;
            }
            p5 = p4;
            bVar = (p055q2.b) objC;
            a0Var2 = (a0) bVar.f5598d;
            if (((Boolean) bVar.e).booleanValue()) {
                return a0Var2;
            }
            p5.f577k.s(a0Var2);
            return a0Var2;
        }
        Z zH3 = p4.h();
        D d3 = new D(p4, i5, null);
        b3.f513g = p4;
        b3.f514h = null;
        b3.f518l = 3;
        objC = zH3.c(d3, b3);
        if (objC == aVar) {
            return aVar;
        }
        p5 = p4;
        bVar = (p055q2.b) objC;
        a0Var2 = (a0) bVar.f5598d;
        if (((Boolean) bVar.e).booleanValue()) {
            return a0Var2;
        }
        p5.f577k.s(a0Var2);
        return a0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea A[Catch: b -> 0x00ab, TryCatch #2 {b -> 0x00ab, blocks: (B:35:0x00a6, B:69:0x0144, B:40:0x00b4, B:66:0x0127, B:48:0x00d1, B:56:0x00ea, B:57:0x00ee, B:52:0x00da, B:63:0x0115), top: B:77:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public static final Object g(P p3, boolean z2, u2.b bVar) {
        E e;
        int iHashCode;
        Integer numA;
        Object obj;
        P p4;
        int i3;
        C0056b c0056b;
        Object objB;
        B2.n nVar;
        B2.p pVar;
        p3.getClass();
        if (bVar instanceof E) {
            e = (E) bVar;
            int i4 = e.f535o;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                e.f535o = i4 - Integer.MIN_VALUE;
            } else {
                e = new E(p3, bVar);
            }
        } else {
            e = new E(p3, bVar);
        }
        Object objA = e.f533m;
        t2.a aVar = t2.a.f5737d;
        try {
            switch (e.f535o) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    AbstractC0449g3.b(objA);
                    if (!z2) {
                        Z zH = p3.h();
                        e.f527g = p3;
                        e.f531k = z2;
                        e.f535o = 3;
                        objA = zH.a();
                        if (objA == aVar) {
                            return aVar;
                        }
                        int iIntValue = ((Number) objA).intValue();
                        Z zH2 = p3.h();
                        F f3 = new F(p3, iIntValue, null);
                        e.f527g = p3;
                        e.f531k = z2;
                        e.f535o = 4;
                        objA = zH2.c(f3, e);
                        if (objA == aVar) {
                            return aVar;
                        }
                        return (C0057c) objA;
                    }
                    e.f527g = p3;
                    e.f531k = z2;
                    e.f535o = 1;
                    objA = p3.j(e);
                    if (objA == aVar) {
                        return aVar;
                    }
                    iHashCode = objA != null ? objA.hashCode() : 0;
                    Z zH3 = p3.h();
                    e.f527g = p3;
                    e.f528h = objA;
                    e.f531k = z2;
                    e.f532l = iHashCode;
                    e.f535o = 2;
                    numA = zH3.a();
                    if (numA == aVar) {
                        return aVar;
                    }
                    obj = objA;
                    objA = numA;
                    p4 = p3;
                    i3 = iHashCode;
                    return new C0057c(obj, i3, ((Number) objA).intValue());
                case 1:
                    z2 = e.f531k;
                    p3 = (P) e.f527g;
                    AbstractC0449g3.b(objA);
                    if (objA != null) {
                    }
                    Z zH4 = p3.h();
                    e.f527g = p3;
                    e.f528h = objA;
                    e.f531k = z2;
                    e.f532l = iHashCode;
                    e.f535o = 2;
                    numA = zH4.a();
                    if (numA == aVar) {
                        return aVar;
                    }
                    obj = objA;
                    objA = numA;
                    p4 = p3;
                    i3 = iHashCode;
                    return new C0057c(obj, i3, ((Number) objA).intValue());
                case 2:
                    i3 = e.f532l;
                    z2 = e.f531k;
                    obj = e.f528h;
                    p4 = (P) e.f527g;
                    try {
                        AbstractC0449g3.b(objA);
                        return new C0057c(obj, i3, ((Number) objA).intValue());
                    } catch (C0056b e3) {
                        e = e3;
                        p3 = p4;
                        B2.p pVar2 = new B2.p();
                        p071w1.b bVar2 = p3.e;
                        e.f527g = p3;
                        e.f528h = e;
                        e.f529i = pVar2;
                        e.f530j = pVar2;
                        e.f531k = z2;
                        e.f535o = 5;
                        throw e;
                    }
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    z2 = e.f531k;
                    p3 = (P) e.f527g;
                    AbstractC0449g3.b(objA);
                    int iIntValue2 = ((Number) objA).intValue();
                    Z zH5 = p3.h();
                    F f4 = new F(p3, iIntValue2, null);
                    e.f527g = p3;
                    e.f531k = z2;
                    e.f535o = 4;
                    objA = zH5.c(f4, e);
                    if (objA == aVar) {
                        return aVar;
                    }
                    return (C0057c) objA;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    boolean z3 = e.f531k;
                    AbstractC0449g3.b(objA);
                    return (C0057c) objA;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    boolean z4 = e.f531k;
                    B2.p pVar3 = e.f530j;
                    B2.p pVar4 = (B2.p) e.f529i;
                    C0056b c0056b2 = (C0056b) e.f528h;
                    P p5 = (P) e.f527g;
                    AbstractC0449g3.b(objA);
                    pVar3.f128d = objA;
                    B2.n nVar2 = new B2.n();
                    try {
                        G g3 = new G(pVar4, p5, nVar2, (p063s2.d) null);
                        e.f527g = c0056b2;
                        e.f528h = pVar4;
                        e.f529i = nVar2;
                        e.f530j = null;
                        e.f535o = 6;
                        if (z4) {
                            p5.getClass();
                            objB = g3.i(e);
                        } else {
                            objB = p5.h().b(new C0075v(g3, null), e);
                        }
                        if (objB == aVar) {
                            return aVar;
                        }
                        nVar = nVar2;
                        pVar = pVar4;
                        Object obj2 = pVar.f128d;
                        return new C0057c(obj2, obj2 != null ? obj2.hashCode() : 0, nVar.f126d);
                    } catch (Throwable th) {
                        th = th;
                        c0056b = c0056b2;
                        AbstractC0443f3.a(c0056b, th);
                        throw c0056b;
                    }
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    nVar = (B2.n) e.f529i;
                    pVar = (B2.p) e.f528h;
                    c0056b = (C0056b) e.f527g;
                    try {
                        AbstractC0449g3.b(objA);
                        Object obj3 = pVar.f128d;
                        return new C0057c(obj3, obj3 != null ? obj3.hashCode() : 0, nVar.f126d);
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC0443f3.a(c0056b, th);
                        throw c0056b;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (C0056b e4) {
            e = e4;
        }
    }

    @Override // J.InterfaceC0062h
    public final L2.d e() {
        return this.f573g;
    }

    @Override // J.InterfaceC0062h
    public final Object f(A2.p pVar, u2.f fVar) {
        p063s2.i iVar = fVar.e;
        B2.h.b(iVar);
        d0 d0Var = (d0) iVar.f(c0.f613d);
        if (d0Var != null) {
            d0Var.d(this);
        }
        return AbstractC0052x.n(new d0(d0Var, this), new J(this, pVar, null), fVar);
    }

    public final Z h() {
        return (Z) this.f580n.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(u2.b bVar) throws Throwable {
        A a3;
        P p3;
        int iIntValue;
        int i3;
        Throwable th;
        P p4;
        if (bVar instanceof A) {
            a3 = (A) bVar;
            int i4 = a3.f512k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                a3.f512k = i4 - Integer.MIN_VALUE;
            } else {
                a3 = new A(this, bVar);
            }
        } else {
            a3 = new A(this, bVar);
        }
        Object objA = a3.f510i;
        Object obj = t2.a.f5737d;
        int i5 = a3.f512k;
        try {
            if (i5 == 0) {
                AbstractC0449g3.b(objA);
                Z zH = h();
                a3.f508g = this;
                a3.f512k = 1;
                objA = zH.a();
                if (objA == obj) {
                    return obj;
                }
                p3 = this;
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = a3.f509h;
                    p4 = a3.f508g;
                    try {
                        AbstractC0449g3.b(objA);
                        return p055q2.g.f5603a;
                    } catch (Throwable th2) {
                        th = th2;
                        p4.f577k.s(new T(th, i3));
                        throw th;
                    }
                }
                p3 = a3.f508g;
                AbstractC0449g3.b(objA);
            }
            E0.n nVar = p3.f578l;
            a3.f508g = p3;
            a3.f509h = iIntValue;
            a3.f512k = 2;
            if (nVar.c(a3) == obj) {
                return obj;
            }
            return p055q2.g.f5603a;
        } catch (Throwable th3) {
            i3 = iIntValue;
            th = th3;
            p4 = p3;
            p4.f577k.s(new T(th, i3));
            throw th;
        }
        iIntValue = ((Number) objA).intValue();
    }

    public final Object j(u2.b bVar) {
        return ((L.i) this.f579m.a()).a(new C0071q(3, (p063s2.d) null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Object obj, boolean z2, u2.b bVar) {
        N n3;
        B2.n nVar;
        if (bVar instanceof N) {
            n3 = (N) bVar;
            int i3 = n3.f563j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n3.f563j = i3 - Integer.MIN_VALUE;
            } else {
                n3 = new N(this, bVar);
            }
        } else {
            n3 = new N(this, bVar);
        }
        Object obj2 = n3.f561h;
        t2.a aVar = t2.a.f5737d;
        int i4 = n3.f563j;
        if (i4 == 0) {
            AbstractC0449g3.b(obj2);
            B2.n nVar2 = new B2.n();
            L.i iVar = (L.i) this.f579m.a();
            O o3 = new O(nVar2, this, obj, z2, null);
            n3.f560g = nVar2;
            n3.f563j = 1;
            if (iVar.b(o3, n3) == aVar) {
                return aVar;
            }
            nVar = nVar2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = n3.f560g;
            AbstractC0449g3.b(obj2);
        }
        return new Integer(nVar.f126d);
    }
}
