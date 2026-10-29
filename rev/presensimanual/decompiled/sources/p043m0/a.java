package p043m0;

import B.X;
import B2.h;
import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5346a = new a();

    public final X a(Context context) {
        h.e(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        h.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return X.c(windowInsets, null);
    }
}
