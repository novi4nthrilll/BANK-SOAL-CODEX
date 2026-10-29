package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f2385d;
    public static final k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f2386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f2387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f2388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k[] f2389i;

    static {
        k kVar = new k("DESTROYED", 0);
        f2385d = kVar;
        k kVar2 = new k("INITIALIZED", 1);
        e = kVar2;
        k kVar3 = new k("CREATED", 2);
        f2386f = kVar3;
        k kVar4 = new k("STARTED", 3);
        f2387g = kVar4;
        k kVar5 = new k("RESUMED", 4);
        f2388h = kVar5;
        f2389i = new k[]{kVar, kVar2, kVar3, kVar4, kVar5};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f2389i.clone();
    }
}
