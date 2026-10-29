package O0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m implements M0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f1291c = new m(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1292b;

    public /* synthetic */ m(String str) {
        this.f1292b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return u.i(this.f1292b, ((m) obj).f1292b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1292b});
    }
}
