package p013d1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import k.C0752r0;
import p060s.c;
import p060s.j;
import p060s.k;
import p060s.l;
import p060s.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class G2 {
    public static ColorStateList a(Context context, int i3) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        k kVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        l lVar = new l(resources, theme);
        synchronized (m.f5654c) {
            try {
                SparseArray sparseArray = (SparseArray) m.f5653b.get(lVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (kVar = (k) sparseArray.get(i3)) == null) {
                    colorStateList = null;
                } else {
                    if (kVar.f5648b.equals(resources.getConfiguration())) {
                        if (theme != null || kVar.f5649c != 0) {
                            if (theme == null || kVar.f5649c != theme.hashCode()) {
                            }
                        }
                        colorStateList = kVar.f5647a;
                    }
                    sparseArray.remove(i3);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = m.f5652a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i3, typedValue, true);
        int i4 = typedValue.type;
        if (i4 < 28 || i4 > 31) {
            try {
                colorStateListA = c.a(resources, resources.getXml(i3), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListA == null) {
            return Build.VERSION.SDK_INT >= 23 ? j.b(resources, i3, theme) : resources.getColorStateList(i3);
        }
        m.a(lVar, i3, colorStateListA, theme);
        return colorStateListA;
    }

    public static Drawable b(Context context, int i3) {
        return C0752r0.d().f(context, i3);
    }
}
