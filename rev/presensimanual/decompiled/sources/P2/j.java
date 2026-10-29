package P2;

import I1.w;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f1349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f1350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1351d;
    public static final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f1352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w f1353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w f1354h;

    static {
        String property;
        int i3 = N2.w.f1167a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f1348a = property;
        f1349b = N2.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i4 = N2.w.f1167a;
        if (i4 < 2) {
            i4 = 2;
        }
        f1350c = N2.a.k("kotlinx.coroutines.scheduler.core.pool.size", i4, 1, 0, 8);
        f1351d = N2.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        e = TimeUnit.SECONDS.toNanos(N2.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f1352f = f.f1344a;
        f1353g = new w(0);
        f1354h = new w(1);
    }
}
