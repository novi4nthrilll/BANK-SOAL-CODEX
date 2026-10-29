package Q2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A0.f f1396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final A0.f f1397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A0.f f1398d;
    public static final A0.f e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1395a = N2.a.k("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f1399f = N2.a.k("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);

    static {
        int i3 = 10;
        f1396b = new A0.f(i3, "PERMIT");
        f1397c = new A0.f(i3, "TAKEN");
        f1398d = new A0.f(i3, "BROKEN");
        e = new A0.f(i3, "CANCELLED");
    }
}
