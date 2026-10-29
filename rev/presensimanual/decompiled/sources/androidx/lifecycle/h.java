package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static j a(k kVar) {
        B2.h.e(kVar, "state");
        int iOrdinal = kVar.ordinal();
        if (iOrdinal == 1) {
            return j.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return j.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return j.ON_RESUME;
    }
}
