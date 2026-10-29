package N2;

import I2.AbstractC0048t;
import I2.AbstractC0052x;
import I2.C0043n;
import I2.C0044o;
import I2.C0045p;
import I2.C0049u;
import I2.J;
import I2.S;
import I2.b0;
import I2.i0;
import I2.j0;
import I2.l0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;
import p013d1.AbstractC0469k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A0.f f1130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A0.f f1131d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A0.f f1128a = new A0.f(10, "NO_DECISION");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A0.f f1129b = new A0.f(10, "CLOSED");
    public static final A0.f e = new A0.f(10, "CONDITION_FALSE");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final A0.f f1132f = new A0.f(10, "NO_THREAD_ELEMENTS");

    static {
        int i3 = 10;
        f1130c = new A0.f(i3, "UNDEFINED");
        f1131d = new A0.f(i3, "REUSABLE_CLAIMED");
    }

    public static final void a(A2.l lVar, Object obj, p063s2.i iVar) throws IllegalAccessException, InvocationTargetException {
        C0045p c0045pB = b(lVar, obj, null);
        if (c0045pB != null) {
            AbstractC0052x.d(c0045pB, iVar);
        }
    }

    public static final C0045p b(A2.l lVar, Object obj, C0045p c0045p) throws IllegalAccessException, InvocationTargetException {
        try {
            lVar.i(obj);
        } catch (Throwable th) {
            if (c0045p == null || c0045p.getCause() == th) {
                return new C0045p("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC0443f3.a(c0045p, th);
        }
        return c0045p;
    }

    public static final Object c(u uVar, long j3, A2.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f1165f >= j3 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f1135d.get(uVar);
            A0.f fVar = f1129b;
            if (obj == fVar) {
                return fVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.h(Long.valueOf(uVar.f1165f + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f1135d;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u d(Object obj) {
        if (obj != f1129b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void e(Throwable th, p063s2.i iVar) throws IllegalAccessException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = f.f1137a.iterator();
        while (it.hasNext()) {
            try {
                ((J2.b) it.next()).d(th, iVar);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0443f3.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC0443f3.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f1129b;
    }

    public static final Object g(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void h(p063s2.i iVar, Object obj) {
        if (obj == f1132f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object objC = iVar.c(null, x.f1169g);
            B2.h.c(objC, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            A0.c.o(objC);
            throw null;
        }
        z zVar = (z) obj;
        i0[] i0VarArr = zVar.f1173b;
        int length = i0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        i0 i0Var = i0VarArr[length];
        B2.h.b(null);
        Object obj2 = zVar.f1172a[length];
        throw null;
    }

    public static final void i(p063s2.d dVar, Object obj, A2.l lVar) {
        Object c0043n;
        if (!(dVar instanceof h)) {
            dVar.l(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable thA = p055q2.d.a(obj);
        if (thA == null) {
            c0043n = lVar != null ? new C0044o(obj, lVar) : obj;
        } else {
            c0043n = new C0043n(thA, false);
        }
        u2.b bVar = hVar.f1141h;
        bVar.g();
        AbstractC0048t abstractC0048t = hVar.f1140g;
        if (abstractC0048t.g()) {
            hVar.f1142i = c0043n;
            hVar.f433f = 1;
            abstractC0048t.d(bVar.g(), hVar);
            return;
        }
        J jA = j0.a();
        if (jA.f442f >= 4294967296L) {
            hVar.f1142i = c0043n;
            hVar.f433f = 1;
            p059r2.b bVar2 = jA.f444h;
            if (bVar2 == null) {
                bVar2 = new p059r2.b();
                jA.f444h = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        jA.k(true);
        try {
            S s3 = (S) bVar.g().f(C0049u.e);
            if (s3 == null || s3.b()) {
                Object obj2 = hVar.f1143j;
                p063s2.i iVarG = bVar.g();
                Object objM = m(iVarG, obj2);
                l0 l0VarM = objM != f1132f ? AbstractC0052x.m(bVar, iVarG, objM) : null;
                try {
                    bVar.l(obj);
                    if (l0VarM == null || l0VarM.X()) {
                        h(iVarG, objM);
                    }
                } catch (Throwable th) {
                    if (l0VarM == null || l0VarM.X()) {
                        h(iVarG, objM);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionA = ((b0) s3).A();
                hVar.b(c0043n, cancellationExceptionA);
                hVar.l(AbstractC0449g3.a(cancellationExceptionA));
            }
            while (jA.m()) {
            }
        } catch (Throwable th2) {
            try {
                hVar.h(th2, null);
            } finally {
                jA.i(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[PHI: r18
      0x006d: PHI (r18v2 long) = (r18v1 long), (r18v3 long) binds: [B:29:0x005f, B:33:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0078 A[LOOP:0: B:24:0x0050->B:38:0x0078, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:57:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0021 A[SYNTHETIC] */
    public static final long j(String str, long j3, long j4, long j5) {
        String property;
        boolean z2;
        long j6;
        long j7;
        Long lValueOf;
        Long l3;
        int iDigit;
        long j8;
        long j9;
        long j10;
        int i3 = w.f1167a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j3;
        }
        AbstractC0469k.a(10);
        int length = property.length();
        if (length != 0) {
            int i4 = 0;
            char cCharAt = property.charAt(0);
            long j11 = -9223372036854775807L;
            if (cCharAt < '0') {
                if (length != 1) {
                    if (cCharAt == '+') {
                        i4 = 1;
                        z2 = false;
                        j6 = 0;
                        j7 = -256204778801521550L;
                        while (true) {
                            if (i4 >= length) {
                                if (z2) {
                                    lValueOf = Long.valueOf(j6);
                                } else {
                                    lValueOf = Long.valueOf(-j6);
                                }
                                l3 = lValueOf;
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i4), 10);
                            if (iDigit >= 0) {
                                if (j6 >= j7) {
                                    j8 = j6 * ((long) 10);
                                    j9 = iDigit;
                                    if (j8 < j11 + j9) {
                                        j6 = j8 - j9;
                                        i4++;
                                    }
                                } else if (j7 == -256204778801521550L) {
                                    j7 = j11 / ((long) 10);
                                    if (j6 >= j7) {
                                        j8 = j6 * ((long) 10);
                                        j9 = iDigit;
                                        if (j8 < j11 + j9) {
                                            j6 = j8 - j9;
                                            i4++;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (cCharAt == '-') {
                        j11 = Long.MIN_VALUE;
                        i4 = 1;
                        z2 = true;
                        j6 = 0;
                        j7 = -256204778801521550L;
                        while (true) {
                            if (i4 >= length) {
                                if (z2) {
                                    lValueOf = Long.valueOf(j6);
                                } else {
                                    lValueOf = Long.valueOf(-j6);
                                }
                                l3 = lValueOf;
                                break;
                            }
                            iDigit = Character.digit((int) property.charAt(i4), 10);
                            if (iDigit >= 0) {
                                if (j6 >= j7) {
                                    j8 = j6 * ((long) 10);
                                    j9 = iDigit;
                                    if (j8 < j11 + j9) {
                                        j6 = j8 - j9;
                                        i4++;
                                    }
                                } else if (j7 == -256204778801521550L) {
                                    j7 = j11 / ((long) 10);
                                    if (j6 >= j7) {
                                        j8 = j6 * ((long) 10);
                                        j9 = iDigit;
                                        if (j8 < j11 + j9) {
                                            j6 = j8 - j9;
                                            i4++;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else {
                z2 = false;
                j6 = 0;
                j7 = -256204778801521550L;
                while (true) {
                    if (i4 >= length) {
                        if (z2) {
                            lValueOf = Long.valueOf(j6);
                        } else {
                            lValueOf = Long.valueOf(-j6);
                        }
                        l3 = lValueOf;
                        break;
                    }
                    iDigit = Character.digit((int) property.charAt(i4), 10);
                    if (iDigit >= 0) {
                        if (j6 >= j7) {
                            j8 = j6 * ((long) 10);
                            j9 = iDigit;
                            if (j8 < j11 + j9) {
                                j6 = j8 - j9;
                                i4++;
                            }
                        } else if (j7 == -256204778801521550L) {
                            j7 = j11 / ((long) 10);
                            if (j6 >= j7) {
                                j8 = j6 * ((long) 10);
                                j9 = iDigit;
                                if (j8 < j11 + j9) {
                                    j6 = j8 - j9;
                                    i4++;
                                }
                            }
                        }
                    }
                }
            }
            l3 = null;
            break;
        } else {
            l3 = null;
            break;
        }
        if (l3 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = l3.longValue();
        if (j4 <= jLongValue) {
            j10 = j5;
            if (jLongValue <= j10) {
                return jLongValue;
            }
        } else {
            j10 = j5;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j10 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int k(String str, int i3, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 1;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return (int) j(str, i3, i4, i5);
    }

    public static final Object l(p063s2.i iVar) {
        Object objC = iVar.c(0, x.f1168f);
        B2.h.b(objC);
        return objC;
    }

    public static final Object m(p063s2.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f1132f;
        }
        if (obj instanceof Integer) {
            return iVar.c(new z(((Number) obj).intValue(), iVar), x.f1170h);
        }
        A0.c.o(obj);
        throw null;
    }
}
