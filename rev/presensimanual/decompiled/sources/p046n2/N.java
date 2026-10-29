package p046n2;

import B2.h;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f5438b;

    public N(String str, L l3) {
        this.f5437a = str;
        this.f5438b = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        return h.a(this.f5437a, n3.f5437a) && this.f5438b == n3.f5438b;
    }

    public final int hashCode() {
        String str = this.f5437a;
        return this.f5438b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f5437a + ", type=" + this.f5438b + ")";
    }
}
