package p076y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f5918d;
    public static final /* synthetic */ p[] e;

    /* JADX INFO: Fake field, exist only in values array */
    p EF2;

    static {
        p pVar = new p("UNKNOWN", 0);
        p pVar2 = new p("ANDROID_FIREBASE", 1);
        f5918d = pVar2;
        e = new p[]{pVar, pVar2};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) e.clone();
    }
}
