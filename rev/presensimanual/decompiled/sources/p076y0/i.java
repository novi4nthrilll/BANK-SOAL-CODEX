package p076y0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5902a;

    public i(ArrayList arrayList) {
        this.f5902a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f5902a.equals(((i) ((o) obj)).f5902a);
    }

    public final int hashCode() {
        return this.f5902a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f5902a + "}";
    }
}
