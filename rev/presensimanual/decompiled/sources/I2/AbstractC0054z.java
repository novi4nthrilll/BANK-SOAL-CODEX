package I2;

/* JADX INFO: renamed from: I2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0054z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f507a = 0;

    static {
        String property;
        int i3 = N2.w.f1167a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (!(property != null ? Boolean.parseBoolean(property) : false)) {
            RunnableC0053y runnableC0053y = RunnableC0053y.f505m;
            return;
        }
        P2.d dVar = D.f434a;
        J2.c cVar = N2.o.f1159a;
        J2.c cVar2 = cVar.f736i;
        if (cVar instanceof A) {
            return;
        }
        RunnableC0053y runnableC0053y2 = RunnableC0053y.f505m;
    }
}
