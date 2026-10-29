package p072x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Locale[] f5817b = new Locale[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale[] f5818a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int i3 = e.f5815b;
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public f(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f5818a = f5817b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < localeArr.length; i3++) {
            Locale locale = localeArr[i3];
            if (locale == null) {
                throw new NullPointerException("list[" + i3 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                locale2.getLanguage();
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    locale2.getCountry();
                }
                hashSet.add(locale2);
            }
        }
        this.f5818a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    @Override // p072x.g
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        Locale[] localeArr = ((f) obj).f5818a;
        Locale[] localeArr2 = this.f5818a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < localeArr2.length; i3++) {
            if (!localeArr2[i3].equals(localeArr[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // p072x.g
    public final Locale get(int i3) {
        if (i3 >= 0) {
            Locale[] localeArr = this.f5818a;
            if (i3 < localeArr.length) {
                return localeArr[i3];
            }
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f5818a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p072x.g
    public final int size() {
        return this.f5818a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.f5818a;
            if (i3 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i3]);
            if (i3 < localeArr.length - 1) {
                sb.append(',');
            }
            i3++;
        }
    }
}
