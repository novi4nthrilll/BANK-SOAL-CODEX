package p059r2;

import B2.h;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends e {
    public static int c(Iterable iterable) {
        h.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
