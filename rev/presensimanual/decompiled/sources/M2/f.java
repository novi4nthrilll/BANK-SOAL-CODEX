package M2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p063s2.i f1005d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1006f;

    public f(p063s2.i iVar, int i3, int i4) {
        this.f1005d = iVar;
        this.e = i3;
        this.f1006f = i4;
    }

    public abstract Object a(K2.p pVar, p063s2.d dVar);

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // M2.j
    public final L2.d b(p063s2.i iVar, int i3, int i4) {
        p063s2.i iVar2 = this.f1005d;
        p063s2.i iVarH = iVar.h(iVar2);
        int i5 = this.f1006f;
        int i6 = this.e;
        if (i4 == 1) {
            if (i6 != -3) {
                if (i3 == -3) {
                    i3 = i6;
                } else if (i6 != -2) {
                    if (i3 == -2) {
                        i3 = i6;
                    } else {
                        i3 += i6;
                        if (i3 < 0) {
                            i3 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i4 = i5;
        }
        return (B2.h.a(iVarH, iVar2) && i3 == i6 && i4 == i5) ? this : c(iVarH, i3, i4);
    }

    public abstract f c(p063s2.i iVar, int i3, int i4);

    @Override // L2.d
    public Object q(L2.e eVar, p063s2.d dVar) {
        d dVar2 = new d(eVar, this, null);
        N2.t tVar = new N2.t(dVar, dVar.g());
        Object objA = p013d1.r.a(tVar, tVar, dVar2);
        return objA == t2.a.f5737d ? objA : p055q2.g.f5603a;
    }

    public String toString() {
        String str;
        ArrayList arrayList = new ArrayList(4);
        p063s2.j jVar = p063s2.j.f5670d;
        p063s2.i iVar = this.f1005d;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i3 = this.e;
        if (i3 != -3) {
            arrayList.add("capacity=" + i3);
        }
        int i4 = this.f1006f;
        if (i4 != 1) {
            if (i4 == 1) {
                str = "SUSPEND";
            } else if (i4 != 2) {
                str = i4 != 3 ? "null" : "DROP_LATEST";
            } else {
                str = "DROP_OLDEST";
            }
            arrayList.add("onBufferOverflow=".concat(str));
        }
        return getClass().getSimpleName() + '[' + p059r2.d.e(arrayList, ", ", null, null, null, 62) + ']';
    }
}
