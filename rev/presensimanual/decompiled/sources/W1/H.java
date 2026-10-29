package W1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f1703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f1704b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h3 = (H) obj;
        return this.f1703a.equals(h3.f1703a) && this.f1704b.equals(h3.f1704b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1703a, this.f1704b);
    }
}
