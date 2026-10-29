package I2;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends P2.h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f433f;

    public C(int i3) {
        super(0L, P2.j.f1353g);
        this.f433f = i3;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract p063s2.d c();

    public Throwable d(Object obj) {
        C0043n c0043n = obj instanceof C0043n ? (C0043n) obj : null;
        if (c0043n != null) {
            return c0043n.f490a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0443f3.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        B2.h.b(th);
        AbstractC0052x.d(new C0051w("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().g());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objA = p055q2.g.f5603a;
        I1.w wVar = this.e;
        try {
            p063s2.d dVarC = c();
            B2.h.c(dVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            N2.h hVar = (N2.h) dVarC;
            u2.b bVar = hVar.f1141h;
            Object obj = hVar.f1143j;
            p063s2.i iVarG = bVar.g();
            Object objM = N2.a.m(iVarG, obj);
            l0 l0VarM = objM != N2.a.f1132f ? AbstractC0052x.m(bVar, iVarG, objM) : null;
            try {
                p063s2.i iVarG2 = bVar.g();
                Object objI = i();
                Throwable thD = d(objI);
                S s3 = (thD == null && AbstractC0052x.f(this.f433f)) ? (S) iVarG2.f(C0049u.e) : null;
                if (s3 != null && !s3.b()) {
                    CancellationException cancellationExceptionA = ((b0) s3).A();
                    b(objI, cancellationExceptionA);
                    bVar.l(AbstractC0449g3.a(cancellationExceptionA));
                } else if (thD != null) {
                    bVar.l(AbstractC0449g3.a(thD));
                } else {
                    bVar.l(f(objI));
                }
                if (l0VarM == null || l0VarM.X()) {
                    N2.a.h(iVarG, objM);
                }
                try {
                    wVar.getClass();
                } catch (Throwable th) {
                    objA = AbstractC0449g3.a(th);
                }
                h(null, p055q2.d.a(objA));
            } catch (Throwable th2) {
                if (l0VarM == null || l0VarM.X()) {
                    N2.a.h(iVarG, objM);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                wVar.getClass();
            } catch (Throwable th4) {
                objA = AbstractC0449g3.a(th4);
            }
            h(th3, p055q2.d.a(objA));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
