package B;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: B.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0005f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f82a;

    public C0005f(DisplayCutout displayCutout) {
        this.f82a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0005f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f82a, ((C0005f) obj).f82a);
    }

    public final int hashCode() {
        return this.f82a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f82a + "}";
    }
}
