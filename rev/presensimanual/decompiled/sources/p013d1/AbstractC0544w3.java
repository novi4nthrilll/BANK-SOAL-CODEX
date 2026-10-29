package p013d1;

import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;
import p072x.c;
import p072x.d;
import p072x.e;
import p072x.f;
import p072x.i;

/* JADX INFO: renamed from: d1.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0544w3 {
    public static e a(Configuration configuration) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            return new e(new i(c.a(configuration)));
        }
        Locale[] localeArr = {configuration.locale};
        if (i3 < 24) {
            return new e(new f(localeArr));
        }
        int i4 = e.f5815b;
        return new e(new i(d.a(localeArr)));
    }
}
