package p013d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: d1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0421c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC0421c f3697d;
    public static final /* synthetic */ EnumC0421c[] e;

    static {
        EnumC0421c enumC0421c = new EnumC0421c("DEFAULT", 0);
        f3697d = enumC0421c;
        e = new EnumC0421c[]{enumC0421c, new EnumC0421c("SIGNED", 1), new EnumC0421c("FIXED", 2)};
    }

    public static EnumC0421c[] values() {
        return (EnumC0421c[]) e.clone();
    }
}
