package K2;

import I2.C0045p;
import I2.n0;
import java.lang.reflect.InvocationTargetException;
import p013d1.AbstractC0443f3;

/* JADX INFO: loaded from: classes.dex */
public final class m extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f815o;

    public m(int i3, int i4, A2.l lVar) {
        super(i3, lVar);
        this.f815o = i4;
        if (i4 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + B2.q.a(b.class).b() + " instead").toString());
        }
        if (i3 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i3 + " was specified").toString());
    }

    public final Object D(Object obj, boolean z2) throws IllegalAccessException, InvocationTargetException {
        j jVar;
        A2.l lVar;
        C0045p c0045pB;
        p055q2.g gVar = p055q2.g.f5603a;
        if (this.f815o == 3) {
            Object objI = super.i(obj);
            if (!(objI instanceof h) || (objI instanceof g)) {
                return objI;
            }
            if (!z2 || (lVar = this.e) == null || (c0045pB = N2.a.b(lVar, obj, null)) == null) {
                return gVar;
            }
            throw c0045pB;
        }
        S1.f fVar = d.f792d;
        j jVar2 = (j) b.f782j.get(this);
        while (true) {
            long andIncrement = b.f778f.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zR = r(andIncrement, false);
            int i3 = d.f790b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            if (jVar2.f1165f != j5) {
                j jVarB = b.b(this, j5, jVar2);
                if (jVarB != null) {
                    jVar = jVarB;
                } else if (zR) {
                    return new g(o());
                }
            } else {
                jVar = jVar2;
            }
            int iE = b.e(this, jVar, i4, obj, j3, fVar, zR);
            if (iE == 0) {
                jVar.a();
                return gVar;
            }
            if (iE == 1) {
                return gVar;
            }
            if (iE == 2) {
                if (zR) {
                    jVar.h();
                    return new g(o());
                }
                n0 n0Var = fVar instanceof n0 ? (n0) fVar : null;
                if (n0Var != null) {
                    n0Var.a(jVar, i4 + i3);
                }
                j((jVar.f1165f * j4) + ((long) i4));
                return gVar;
            }
            if (iE == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iE == 4) {
                if (j3 < b.f779g.get(this)) {
                    jVar.a();
                }
                return new g(o());
            }
            if (iE == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // K2.b, K2.r
    public final Object d(Object obj, p063s2.d dVar) throws Throwable {
        C0045p c0045pB;
        if (!(D(obj, true) instanceof g)) {
            return p055q2.g.f5603a;
        }
        A2.l lVar = this.e;
        if (lVar == null || (c0045pB = N2.a.b(lVar, obj, null)) == null) {
            throw o();
        }
        AbstractC0443f3.a(c0045pB, o());
        throw c0045pB;
    }

    @Override // K2.b, K2.r
    public final Object i(Object obj) {
        return D(obj, false);
    }

    @Override // K2.b
    public final boolean t() {
        return this.f815o == 2;
    }
}
