package R2;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f1525a;

    static {
        i iVar;
        try {
            Class.forName("java.nio.file.Files");
            iVar = new j();
        } catch (ClassNotFoundException unused) {
            iVar = new i();
        }
        f1525a = iVar;
        String str = l.e;
        String property = System.getProperty("java.io.tmpdir");
        B2.h.d(property, "getProperty(\"java.io.tmpdir\")");
        p065t0.e.e(property, false);
        ClassLoader classLoader = S2.c.class.getClassLoader();
        B2.h.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        new S2.c(classLoader);
    }

    public final boolean a(l lVar) {
        B2.h.e(lVar, "path");
        return b(lVar) != null;
    }

    public abstract e b(l lVar);
}
