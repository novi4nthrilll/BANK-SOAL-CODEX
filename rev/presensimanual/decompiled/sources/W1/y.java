package W1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H f1798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public A f1799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f1800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f1801d;
    public Boolean e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f1798a.equals(yVar.f1798a) && this.f1799b.equals(yVar.f1799b) && this.f1800c.equals(yVar.f1800c) && this.f1801d.equals(yVar.f1801d) && this.e.equals(yVar.e);
    }

    public final int hashCode() {
        return Objects.hash(this.f1798a, this.f1799b, this.f1800c, this.f1801d, this.e);
    }
}
