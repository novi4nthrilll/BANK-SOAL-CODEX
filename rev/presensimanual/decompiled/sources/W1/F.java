package W1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f1700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f1701b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f3 = (F) obj;
        return this.f1700a.equals(f3.f1700a) && this.f1701b.equals(f3.f1701b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1700a, this.f1701b);
    }
}
