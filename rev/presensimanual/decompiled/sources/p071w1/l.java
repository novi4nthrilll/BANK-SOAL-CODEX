package p071w1;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f5800d;
    public static final /* synthetic */ l[] e;

    static {
        l lVar = new l("INSTANCE", 0);
        f5800d = lVar;
        e = new l[]{lVar};
    }

    public static l[] values() {
        return (l[]) e.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        e.a().f5784a.post(runnable);
    }
}
