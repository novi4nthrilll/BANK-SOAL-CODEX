package K2;

import I2.n0;
import N2.u;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReferenceArray f813i;

    public j(long j3, j jVar, b bVar, int i3) {
        super(j3, jVar, i3);
        this.f812h = bVar;
        this.f813i = new AtomicReferenceArray(d.f790b * 2);
    }

    @Override // N2.u
    public final int f() {
        return d.f790b;
    }

    @Override // N2.u
    public final void g(int i3, p063s2.i iVar) throws IllegalAccessException, InvocationTargetException {
        b bVar;
        int i4 = d.f790b;
        boolean z2 = i3 >= i4;
        if (z2) {
            i3 -= i4;
        }
        Object obj = this.f813i.get(i3 * 2);
        while (true) {
            Object objK = k(i3);
            boolean z3 = objK instanceof n0;
            bVar = this.f812h;
            if (z3 || (objK instanceof s)) {
                if (j(i3, objK, z2 ? d.f797j : d.f798k)) {
                    m(i3, null);
                    l(i3, !z2);
                    if (z2) {
                        B2.h.b(bVar);
                        A2.l lVar = bVar.e;
                        if (lVar != null) {
                            N2.a.a(lVar, obj, iVar);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                if (objK == d.f797j || objK == d.f798k) {
                    break;
                }
                if (objK != d.f794g && objK != d.f793f) {
                    if (objK == d.f796i || objK == d.f792d || objK == d.f799l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i3, null);
        if (z2) {
            B2.h.b(bVar);
            A2.l lVar2 = bVar.e;
            if (lVar2 != null) {
                N2.a.a(lVar2, obj, iVar);
            }
        }
    }

    public final boolean j(int i3, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f813i;
        int i4 = (i3 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
            if (atomicReferenceArray.get(i4) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i3) {
        return this.f813i.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z2) {
        if (z2) {
            b bVar = this.f812h;
            B2.h.b(bVar);
            bVar.C((this.f1165f * ((long) d.f790b)) + ((long) i3));
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f813i.lazySet(i3 * 2, obj);
    }

    public final void n(int i3, A0.f fVar) {
        this.f813i.set((i3 * 2) + 1, fVar);
    }
}
