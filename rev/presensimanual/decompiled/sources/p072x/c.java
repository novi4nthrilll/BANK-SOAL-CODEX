package p072x;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, e eVar) {
        configuration.setLocales((LocaleList) eVar.f5816a.a());
    }
}
