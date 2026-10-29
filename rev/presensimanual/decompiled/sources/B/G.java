package B;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static int a(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i3, i4, i5);
    }

    public static int b(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i3, i4, i5);
    }
}
