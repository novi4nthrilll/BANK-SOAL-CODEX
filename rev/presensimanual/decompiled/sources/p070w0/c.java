package p070w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5774d;
    public static final c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f5775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ c[] f5776g;

    static {
        c cVar = new c("DEFAULT", 0);
        f5774d = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        e = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        f5775f = cVar3;
        f5776g = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5776g.clone();
    }
}
