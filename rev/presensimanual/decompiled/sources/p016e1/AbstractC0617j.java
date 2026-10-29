package p016e1;

import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: e1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0617j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient C0587e f4220d;
    public transient C0581d e;

    public final Map a() {
        C0581d c0581d = this.e;
        if (c0581d != null) {
            return c0581d;
        }
        C0623k c0623k = (C0623k) this;
        C0581d c0581d2 = new C0581d(c0623k, c0623k.f4224f);
        this.e = c0581d2;
        return c0581d2;
    }

    public final Set b() {
        C0587e c0587e = this.f4220d;
        if (c0587e != null) {
            return c0587e;
        }
        C0623k c0623k = (C0623k) this;
        C0587e c0587e2 = new C0587e(c0623k, c0623k.f4224f);
        this.f4220d = c0587e2;
        return c0587e2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0617j) {
            return a().equals(((AbstractC0617j) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C0581d) a()).f4186f.hashCode();
    }

    public final String toString() {
        return ((C0581d) a()).f4186f.toString();
    }
}
