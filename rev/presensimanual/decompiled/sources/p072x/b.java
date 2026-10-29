package p072x;

import B2.h;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    static {
        int i3 = Build.VERSION.SDK_INT;
        a aVar = a.f5814a;
        if (i3 >= 30) {
            aVar.a(30);
        }
        if (i3 >= 30) {
            aVar.a(31);
        }
        if (i3 >= 30) {
            aVar.a(33);
        }
        if (i3 >= 30) {
            aVar.a(1000000);
        }
    }

    public static final boolean a() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 33) {
            if (i3 >= 32) {
                String str = Build.VERSION.CODENAME;
                h.d(str, "CODENAME");
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    h.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    h.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
