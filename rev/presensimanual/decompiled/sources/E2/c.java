package E2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    static {
        new c(1, 0, 1);
    }

    @Override // E2.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f242d == cVar.f242d) {
                    if (this.e == cVar.e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // E2.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f242d * 31) + this.e;
    }

    @Override // E2.a
    public final boolean isEmpty() {
        return this.f242d > this.e;
    }

    @Override // E2.a
    public final String toString() {
        return this.f242d + ".." + this.e;
    }
}
