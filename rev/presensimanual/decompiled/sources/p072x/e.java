package p072x;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f5815b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f5816a;

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            h.c(d.a(localeArr));
        } else {
            new f(localeArr);
        }
    }

    public e(g gVar) {
        this.f5816a = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f5816a.equals(((e) obj).f5816a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5816a.hashCode();
    }

    public final String toString() {
        return this.f5816a.toString();
    }
}
