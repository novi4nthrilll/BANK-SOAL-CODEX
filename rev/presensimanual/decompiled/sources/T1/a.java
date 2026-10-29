package T1;

import A0.f;
import A0.g;
import E0.n;
import I1.AbstractActivityC0028d;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0028d f1626b;

    public a(AbstractActivityC0028d abstractActivityC0028d, g gVar) {
        f fVar = new f(24, this);
        this.f1626b = abstractActivityC0028d;
        this.f1625a = gVar;
        gVar.f19f = fVar;
    }

    public static Locale a(String str) {
        String str2;
        String[] strArrSplit = str.replace('_', '-').split("-", -1);
        String str3 = strArrSplit[0];
        String str4 = "";
        int i3 = 1;
        if (strArrSplit.length <= 1 || strArrSplit[1].length() != 4) {
            str2 = "";
        } else {
            str2 = strArrSplit[1];
            i3 = 2;
        }
        if (strArrSplit.length > i3 && strArrSplit[i3].length() >= 2 && strArrSplit[i3].length() <= 3) {
            str4 = strArrSplit[i3];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        ArrayList<Locale> arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(locales.get(i3));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        g gVar = this.f1625a;
        ArrayList arrayList2 = new ArrayList();
        for (Locale locale : arrayList) {
            locale.getLanguage();
            locale.getCountry();
            locale.getVariant();
            arrayList2.add(locale.getLanguage());
            arrayList2.add(locale.getCountry());
            arrayList2.add(locale.getScript());
            arrayList2.add(locale.getVariant());
        }
        ((n) gVar.e).b("setLocale", arrayList2, null);
    }
}
