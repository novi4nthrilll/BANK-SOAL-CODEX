package B2;

import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends c implements F2.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f124j;

    public l(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f124j = false;
    }

    public final F2.a e() {
        if (this.f124j) {
            return this;
        }
        F2.a aVar = this.f110d;
        if (aVar != null) {
            return aVar;
        }
        F2.a aVarB = b();
        this.f110d = aVarB;
        return aVarB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return c().equals(lVar.c()) && this.f112g.equals(lVar.f112g) && this.f113h.equals(lVar.f113h) && this.e.equals(lVar.e);
        }
        if (obj instanceof F2.c) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return this.f113h.hashCode() + ((this.f112g.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        F2.a aVarE = e();
        return aVarE != this ? aVarE.toString() : I.h(new StringBuilder("property "), this.f112g, " (Kotlin reflection is not available)");
    }
}
