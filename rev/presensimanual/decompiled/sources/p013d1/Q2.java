package p013d1;

import java.util.Set;
import p058r1.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q2 {
    public Object a(Class cls) {
        a aVarB = b(cls);
        if (aVarB == null) {
            return null;
        }
        return aVarB.get();
    }

    public abstract a b(Class cls);

    public Set c(Class cls) {
        return (Set) d(cls).get();
    }

    public abstract a d(Class cls);
}
