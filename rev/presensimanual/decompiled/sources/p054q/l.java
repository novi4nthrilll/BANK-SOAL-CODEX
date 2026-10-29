package p054q;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(Notification.Builder builder, int i3) {
        return builder.setBadgeIconType(i3);
    }

    public static Notification.Builder c(Notification.Builder builder, boolean z2) {
        return builder.setColorized(z2);
    }

    public static Notification.Builder d(Notification.Builder builder, int i3) {
        return builder.setGroupAlertBehavior(i3);
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    public static Notification.Builder g(Notification.Builder builder, long j3) {
        return builder.setTimeoutAfter(j3);
    }
}
