package p013d1;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z2 {
    public static String a(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }
}
