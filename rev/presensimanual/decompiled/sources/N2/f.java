package N2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f1137a;

    static {
        try {
            Iterator it = Arrays.asList(new J2.b()).iterator();
            B2.h.e(it, "<this>");
            f1137a = G2.c.a(new G2.a(new G2.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
