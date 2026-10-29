package u2;

import B2.h;
import I2.C0035f;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k.E0;
import p013d1.AbstractC0449g3;
import p063s2.g;
import p063s2.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements p063s2.d, c, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p063s2.d f5755d;
    public final i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient p063s2.d f5756f;

    public b(p063s2.d dVar, i iVar) {
        this.f5755d = dVar;
        this.e = iVar;
    }

    public p063s2.d b(Object obj, p063s2.d dVar) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public c e() {
        p063s2.d dVar = this.f5755d;
        if (dVar instanceof c) {
            return (c) dVar;
        }
        return null;
    }

    public StackTraceElement f() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        d dVar = (d) getClass().getAnnotation(d.class);
        String str = null;
        if (dVar == null) {
            return null;
        }
        int iV = dVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i3 = iIntValue >= 0 ? dVar.l()[iIntValue] : -1;
        E0 e3 = e.f5758b;
        E0 e4 = e.f5757a;
        if (e3 == null) {
            try {
                E0 e5 = new E0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                e.f5758b = e5;
                e3 = e5;
            } catch (Exception unused2) {
                e.f5758b = e4;
                e3 = e4;
            }
        }
        if (e3 != e4 && (method = e3.f5025a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = e3.f5026b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = e3.f5027c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = dVar.c();
        } else {
            strC = str + '/' + dVar.c();
        }
        return new StackTraceElement(strC, dVar.m(), dVar.f(), i3);
    }

    @Override // p063s2.d
    public i g() {
        i iVar = this.e;
        h.b(iVar);
        return iVar;
    }

    public abstract Object j(Object obj);

    @Override // p063s2.d
    public final void l(Object obj) {
        p063s2.d dVar = this;
        while (true) {
            b bVar = (b) dVar;
            p063s2.d dVar2 = bVar.f5755d;
            h.b(dVar2);
            try {
                obj = bVar.j(obj);
                if (obj == t2.a.f5737d) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0449g3.a(th);
            }
            bVar.n();
            if (!(dVar2 instanceof b)) {
                dVar2.l(obj);
                return;
            }
            dVar = dVar2;
        }
    }

    public void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p063s2.d dVar = this.f5756f;
        if (dVar != null && dVar != this) {
            g gVarF = g().f(p063s2.e.f5669d);
            h.b(gVarF);
            N2.h hVar = (N2.h) dVar;
            do {
                atomicReferenceFieldUpdater = N2.h.f1139k;
            } while (atomicReferenceFieldUpdater.get(hVar) == N2.a.f1131d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0035f c0035f = obj instanceof C0035f ? (C0035f) obj : null;
            if (c0035f != null) {
                c0035f.r();
            }
        }
        this.f5756f = a.f5754d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objF = f();
        if (objF == null) {
            objF = getClass().getName();
        }
        sb.append(objF);
        return sb.toString();
    }

    public b(p063s2.d dVar) {
        this(dVar, dVar != null ? dVar.g() : null);
    }
}
