package A;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f0a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f1b;

    public b(Rect rect, Rect rect2) {
        this.f0a = rect;
        this.f1b = rect2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f0a.equals(this.f0a) && bVar.f1b.equals(this.f1b);
    }

    public final int hashCode() {
        return this.f0a.hashCode() ^ this.f1b.hashCode();
    }

    public final String toString() {
        return "Pair{" + this.f0a + " " + this.f1b + "}";
    }
}
