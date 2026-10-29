package p059r2;

import B2.h;
import java.util.Arrays;
import java.util.List;
import p013d1.AbstractC0473k3;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends AbstractC0473k3 {
    public static List b(Object... objArr) {
        if (objArr.length <= 0) {
            return l.f5624d;
        }
        List listAsList = Arrays.asList(objArr);
        h.d(listAsList, "asList(...)");
        return listAsList;
    }
}
