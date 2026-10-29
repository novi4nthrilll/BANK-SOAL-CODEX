package p054q;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f5594c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static u f5596f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f5597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5593b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HashSet f5595d = new HashSet();
    public static final Object e = new Object();

    public v(Context context) {
        this.f5597a = (NotificationManager) context.getSystemService("notification");
    }
}
