package p060s;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f5650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f5651b;

    public l(Resources resources, Resources.Theme theme) {
        this.f5650a = resources;
        this.f5651b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f5650a.equals(lVar.f5650a) && Objects.equals(this.f5651b, lVar.f5651b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5650a, this.f5651b);
    }
}
