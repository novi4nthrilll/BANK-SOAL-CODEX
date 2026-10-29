package I2;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f481a = new ThreadLocal();

    public static J a() {
        ThreadLocal threadLocal = f481a;
        J j3 = (J) threadLocal.get();
        if (j3 != null) {
            return j3;
        }
        C0033d c0033d = new C0033d(Thread.currentThread());
        threadLocal.set(c0033d);
        return c0033d;
    }
}
