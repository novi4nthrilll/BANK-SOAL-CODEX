package R1;

import p013d1.I;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f1449d;
    public static final /* synthetic */ c[] e;

    static {
        c cVar = new c("PLAIN_TEXT", 0);
        f1449d = cVar;
        e = new c[]{cVar};
    }

    public static c a(String str) {
        for (c cVar : values()) {
            cVar.getClass();
            if ("text/plain".equals(str)) {
                return cVar;
            }
        }
        throw new NoSuchFieldException(I.g("No such ClipboardContentFormat: ", str));
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) e.clone();
    }
}
