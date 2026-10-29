package p063s2;

import A2.p;
import B2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements i, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f5668d;
    public final g e;

    public c(i iVar, g gVar) {
        h.e(iVar, "left");
        h.e(gVar, "element");
        this.f5668d = iVar;
        this.e = gVar;
    }

    @Override // p063s2.i
    public final Object c(Object obj, p pVar) {
        return pVar.h(this.f5668d.c(obj, pVar), this.e);
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            int i3 = 2;
            c cVar2 = cVar;
            int i4 = 2;
            while (true) {
                i iVar = cVar2.f5668d;
                cVar2 = iVar instanceof c ? (c) iVar : null;
                if (cVar2 == null) {
                    break;
                }
                i4++;
            }
            c cVar3 = this;
            while (true) {
                i iVar2 = cVar3.f5668d;
                cVar3 = iVar2 instanceof c ? (c) iVar2 : null;
                if (cVar3 == null) {
                    break;
                }
                i3++;
            }
            if (i4 != i3) {
                return false;
            }
            c cVar4 = this;
            while (true) {
                g gVar = cVar4.e;
                if (!h.a(cVar.f(gVar.getKey()), gVar)) {
                    zA = false;
                    break;
                }
                i iVar3 = cVar4.f5668d;
                if (!(iVar3 instanceof c)) {
                    h.c(iVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    g gVar2 = (g) iVar3;
                    zA = h.a(cVar.f(gVar2.getKey()), gVar2);
                    break;
                }
                cVar4 = (c) iVar3;
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // p063s2.i
    public final g f(h hVar) {
        h.e(hVar, "key");
        c cVar = this;
        while (true) {
            g gVarF = cVar.e.f(hVar);
            if (gVarF != null) {
                return gVarF;
            }
            i iVar = cVar.f5668d;
            if (!(iVar instanceof c)) {
                return iVar.f(hVar);
            }
            cVar = (c) iVar;
        }
    }

    @Override // p063s2.i
    public final i h(i iVar) {
        h.e(iVar, "context");
        return iVar == j.f5670d ? this : (i) iVar.c(this, new b(1));
    }

    public final int hashCode() {
        return this.e.hashCode() + this.f5668d.hashCode();
    }

    @Override // p063s2.i
    public final i n(h hVar) {
        h.e(hVar, "key");
        g gVar = this.e;
        g gVarF = gVar.f(hVar);
        i iVar = this.f5668d;
        if (gVarF != null) {
            return iVar;
        }
        i iVarN = iVar.n(hVar);
        if (iVarN == iVar) {
            return this;
        }
        return iVarN == j.f5670d ? gVar : new c(iVarN, gVar);
    }

    public final String toString() {
        return "[" + ((String) c("", new b(0))) + ']';
    }
}
