package p060s;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static Drawable a(Resources resources, int i3, Resources.Theme theme) {
        return resources.getDrawable(i3, theme);
    }

    public static Drawable b(Resources resources, int i3, int i4, Resources.Theme theme) {
        return resources.getDrawableForDensity(i3, i4, theme);
    }
}
