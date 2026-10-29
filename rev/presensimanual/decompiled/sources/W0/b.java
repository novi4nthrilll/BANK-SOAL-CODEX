package W0;

import O.l;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1686b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f1687a;

    static {
        b bVar = new b();
        bVar.f1687a = null;
        f1686b = bVar;
    }

    public static l a(Context context) {
        l lVar;
        b bVar = f1686b;
        synchronized (bVar) {
            try {
                if (bVar.f1687a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f1687a = new l(context, 1);
                }
                lVar = bVar.f1687a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }
}
