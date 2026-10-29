package B;

import android.view.VelocityTracker;

/* JADX INFO: renamed from: B.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0013n {
    public static float a(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.getAxisVelocity(i3);
    }

    public static float b(VelocityTracker velocityTracker, int i3, int i4) {
        return velocityTracker.getAxisVelocity(i3, i4);
    }

    public static boolean c(VelocityTracker velocityTracker, int i3) {
        return velocityTracker.isAxisSupported(i3);
    }
}
