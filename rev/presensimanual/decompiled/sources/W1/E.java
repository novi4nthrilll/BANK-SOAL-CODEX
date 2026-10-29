package W1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public G f1696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f1697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f1698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f1699d;
    public Boolean e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e = (E) obj;
        return this.f1696a.equals(e.f1696a) && Objects.equals(this.f1697b, e.f1697b) && Objects.equals(this.f1698c, e.f1698c) && Objects.equals(this.f1699d, e.f1699d) && this.e.equals(e.e);
    }

    public final int hashCode() {
        return Objects.hash(this.f1696a, this.f1697b, this.f1698c, this.f1699d, this.e);
    }
}
