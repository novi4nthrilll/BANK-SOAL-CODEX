package p054q;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
        return builder.setAuthenticationRequired(z2);
    }

    public static Notification.Builder b(Notification.Builder builder, int i3) {
        return builder.setForegroundServiceBehavior(i3);
    }
}
