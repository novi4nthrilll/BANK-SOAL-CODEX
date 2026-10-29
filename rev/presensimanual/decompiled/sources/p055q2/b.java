package p055q2;

import B2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5598d;
    public final Object e;

    public b(Object obj, Object obj2) {
        this.f5598d = obj;
        this.e = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f5598d, bVar.f5598d) && h.a(this.e, bVar.e);
    }

    public final int hashCode() {
        Object obj = this.f5598d;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.e;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5598d + ", " + this.e + ')';
    }
}
