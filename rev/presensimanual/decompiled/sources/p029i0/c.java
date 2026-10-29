package p029i0;

import B2.h;
import p019f0.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4573c;

    public c(b bVar, b bVar2, b bVar3) {
        this.f4571a = bVar;
        this.f4572b = bVar2;
        this.f4573c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f4450a != 0 && bVar.f4451b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return h.a(this.f4571a, cVar.f4571a) && h.a(this.f4572b, cVar.f4572b) && h.a(this.f4573c, cVar.f4573c);
    }

    public final int hashCode() {
        return this.f4573c.hashCode() + ((this.f4572b.hashCode() + (this.f4571a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f4571a + ", type=" + this.f4572b + ", state=" + this.f4573c + " }";
    }
}
