package p029i0;

import java.util.Collection;
import java.util.List;
import p059r2.d;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4586a;

    public j(List list) {
        this.f4586a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f4586a.equals(((j) obj).f4586a);
    }

    public final int hashCode() {
        return this.f4586a.hashCode();
    }

    public final String toString() {
        return d.e((Collection) ((Iterable) this.f4586a), ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
