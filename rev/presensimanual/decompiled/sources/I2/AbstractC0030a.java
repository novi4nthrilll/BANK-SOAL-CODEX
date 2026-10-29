package I2;

import java.lang.reflect.InvocationTargetException;
import p013d1.AbstractC0449g3;
import p013d1.AbstractC0505q;
import p013d1.AbstractC0514r3;

/* JADX INFO: renamed from: I2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0030a extends b0 implements p063s2.d, InterfaceC0050v {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p063s2.i f463f;

    public AbstractC0030a(p063s2.i iVar, boolean z2) {
        super(z2);
        H((S) iVar.f(C0049u.e));
        this.f463f = iVar.h(this);
    }

    @Override // I2.b0
    public final void G(C0045p c0045p) {
        AbstractC0052x.d(c0045p, this.f463f);
    }

    @Override // I2.b0
    public final void O(Object obj) {
        if (!(obj instanceof C0043n)) {
            V(obj);
        } else {
            C0043n c0043n = (C0043n) obj;
            U(c0043n.f490a, C0043n.f489b.get(c0043n) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void W(int i3, AbstractC0030a abstractC0030a, A2.p pVar) {
        int iB = M.j.b(i3);
        if (iB == 0) {
            AbstractC0505q.a(pVar, abstractC0030a, this);
            return;
        }
        if (iB != 1) {
            if (iB == 2) {
                AbstractC0514r3.a(((u2.b) pVar).b(abstractC0030a, this)).l(p055q2.g.f5603a);
                return;
            }
            if (iB != 3) {
                throw new C0045p();
            }
            try {
                p063s2.i iVar = this.f463f;
                Object objM = N2.a.m(iVar, null);
                try {
                    B2.s.a(2, pVar);
                    Object objH = pVar.h(abstractC0030a, this);
                    N2.a.h(iVar, objM);
                    if (objH != t2.a.f5737d) {
                        l(objH);
                    }
                } catch (Throwable th) {
                    N2.a.h(iVar, objM);
                    throw th;
                }
            } catch (Throwable th2) {
                l(AbstractC0449g3.a(th2));
            }
        }
    }

    @Override // p063s2.d
    public final p063s2.i g() {
        return this.f463f;
    }

    @Override // I2.InterfaceC0050v
    public final p063s2.i j() {
        return this.f463f;
    }

    @Override // p063s2.d
    public final void l(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = p055q2.d.a(obj);
        if (thA != null) {
            obj = new C0043n(thA, false);
        }
        Object objL = L(obj);
        if (objL == AbstractC0052x.f500d) {
            return;
        }
        r(objL);
    }

    @Override // I2.b0
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z2) {
    }
}
