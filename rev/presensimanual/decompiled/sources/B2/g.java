package B2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends c implements f, F2.a, p055q2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f120k;

    public g(int i3, Class cls, String str, String str2, int i4) {
        this(i3, b.f109d, cls, str, str2, i4);
    }

    @Override // B2.c
    public final F2.a b() {
        q.f129a.getClass();
        return this;
    }

    @Override // B2.f
    public final int d() {
        return this.f119j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f112g.equals(gVar.f112g) && this.f113h.equals(gVar.f113h) && this.f120k == gVar.f120k && this.f119j == gVar.f119j && this.e.equals(gVar.e) && c().equals(gVar.c());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        F2.a aVar = this.f110d;
        if (aVar == null) {
            b();
            this.f110d = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        c();
        return this.f113h.hashCode() + ((this.f112g.hashCode() + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        F2.a aVar = this.f110d;
        if (aVar == null) {
            b();
            this.f110d = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f112g;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public g(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f119j = i3;
        this.f120k = 0;
    }
}
