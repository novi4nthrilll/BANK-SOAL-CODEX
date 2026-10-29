package I2;

/* JADX INFO: renamed from: I2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0048t extends p063s2.a implements p063s2.f {
    public static final C0047s e = new C0047s(p063s2.e.f5669d, r.e);

    public AbstractC0048t() {
        super(p063s2.e.f5669d);
    }

    public abstract void d(p063s2.i iVar, Runnable runnable);

    /* JADX WARN: Type inference failed for: r4v2, types: [A2.l, B2.i] */
    @Override // p063s2.a, p063s2.i
    public final p063s2.g f(p063s2.h hVar) {
        B2.h.e(hVar, "key");
        if (!(hVar instanceof C0047s)) {
            if (p063s2.e.f5669d == hVar) {
                return this;
            }
            return null;
        }
        C0047s c0047s = (C0047s) hVar;
        p063s2.h hVar2 = this.f5666d;
        if (hVar2 != c0047s && c0047s.e != hVar2) {
            return null;
        }
        p063s2.g gVar = (p063s2.g) c0047s.f495d.i(this);
        if (gVar instanceof p063s2.g) {
            return gVar;
        }
        return null;
    }

    public boolean g() {
        return !(this instanceof k0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [A2.l, B2.i] */
    @Override // p063s2.a, p063s2.i
    public final p063s2.i n(p063s2.h hVar) {
        B2.h.e(hVar, "key");
        boolean z2 = hVar instanceof C0047s;
        p063s2.j jVar = p063s2.j.f5670d;
        if (z2) {
            C0047s c0047s = (C0047s) hVar;
            p063s2.h hVar2 = this.f5666d;
            if ((hVar2 == c0047s || c0047s.e == hVar2) && ((p063s2.g) c0047s.f495d.i(this)) != null) {
                return jVar;
            }
        } else if (p063s2.e.f5669d == hVar) {
            return jVar;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0052x.b(this);
    }
}
