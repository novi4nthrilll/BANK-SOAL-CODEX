package p016e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f4040d;
    public static final /* synthetic */ H[] e;

    static {
        H h3 = new H("DEFAULT", 0);
        f4040d = h3;
        e = new H[]{h3, new H("SIGNED", 1), new H("FIXED", 2)};
    }

    public static H[] values() {
        return (H[]) e.clone();
    }
}
