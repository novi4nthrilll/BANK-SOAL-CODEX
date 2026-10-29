package k;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: loaded from: classes.dex */
public abstract class M0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f5072a = null;

    public static void a(Context context) {
        if (context.getResources() instanceof N0) {
            return;
        }
        context.getResources();
        int i3 = a1.f5138a;
    }
}
