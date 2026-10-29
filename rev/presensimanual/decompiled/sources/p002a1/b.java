package p002a1;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f1958a;

    static {
        f1958a = Build.VERSION.SDK_INT >= 23 ? 67108864 : 0;
    }
}
