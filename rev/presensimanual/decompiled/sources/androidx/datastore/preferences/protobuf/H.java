package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class H {
    public static void a(long j3, Object obj) {
        AbstractC0120b abstractC0120b = (AbstractC0120b) ((B) p0.f2334c.h(j3, obj));
        if (abstractC0120b.f2268d) {
            abstractC0120b.f2268d = false;
        }
    }

    public static B b(long j3, Object obj) {
        B b3 = (B) p0.f2334c.h(j3, obj);
        if (((AbstractC0120b) b3).f2268d) {
            return b3;
        }
        int size = b3.size();
        a0 a0VarE = ((a0) b3).e(size == 0 ? 10 : size * 2);
        p0.o(obj, j3, a0VarE);
        return a0VarE;
    }
}
