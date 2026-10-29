package p013d1;

import G.b;
import G.c;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: d1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0451h {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.c(edgeEffect, f3, f4);
        }
        b.a(edgeEffect, f3, f4);
        return f3;
    }
}
