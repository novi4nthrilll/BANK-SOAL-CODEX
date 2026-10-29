package E0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f206d;
    public static final f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f[] f208g;

    static {
        f fVar = new f("NETWORK_UNMETERED", 0);
        f206d = fVar;
        f fVar2 = new f("DEVICE_IDLE", 1);
        e = fVar2;
        f fVar3 = new f("DEVICE_CHARGING", 2);
        f207f = fVar3;
        f208g = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f208g.clone();
    }
}
