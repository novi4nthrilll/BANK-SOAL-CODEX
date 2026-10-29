package p055q2;

import B2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f5599d;

    public c(Throwable th) {
        h.e(th, "exception");
        this.f5599d = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (h.a(this.f5599d, ((c) obj).f5599d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5599d.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f5599d + ')';
    }
}
