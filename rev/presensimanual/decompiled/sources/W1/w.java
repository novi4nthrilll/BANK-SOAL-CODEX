package W1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f1792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f1793c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f1791a.equals(wVar.f1791a) && this.f1792b.equals(wVar.f1792b) && this.f1793c.equals(wVar.f1793c);
    }

    public final int hashCode() {
        return Objects.hash(this.f1791a, this.f1792b, this.f1793c);
    }
}
