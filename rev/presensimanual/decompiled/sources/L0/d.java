package L0;

import N0.G;
import O0.o;
import O0.u;
import W1.C0104l;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import p013d1.A;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f869c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f870d = new d();

    public static AlertDialog e(Activity activity, int i3, o oVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(O0.n.b(activity, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i3 == 1) {
            string = resources.getString(id.go.bangkalankab.simpeg.R.string.common_google_play_services_install_button);
        } else if (i3 != 2) {
            string = i3 != 3 ? resources.getString(R.string.ok) : resources.getString(id.go.bangkalankab.simpeg.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(id.go.bangkalankab.simpeg.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, oVar);
        }
        String strC = O0.n.c(activity, i3);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", I.f("Creating dialog for Google Play services availability issue. ConnectionResult=", i3), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        u.g(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        bVar.f864d = alertDialog;
        if (onCancelListener != null) {
            bVar.e = onCancelListener;
        }
        bVar.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogE = e(googleApiActivity, i3, new o(super.b(i3, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogE == null) {
            return;
        }
        f(googleApiActivity, alertDialogE, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Context context, int i3, PendingIntent pendingIntent) {
        int i4;
        Log.w("GoogleApiAvailability", "GMS core API Availability. ConnectionResult=" + i3 + ", tag=null", new IllegalArgumentException());
        if (i3 == 18) {
            new i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i3 == 6 ? O0.n.e(context, "common_google_play_services_resolution_required_title") : O0.n.c(context, i3);
        if (strE == null) {
            strE = context.getResources().getString(id.go.bangkalankab.simpeg.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i3 == 6 || i3 == 19) ? O0.n.d(context, "common_google_play_services_resolution_required_text", O0.n.a(context)) : O0.n.b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        u.f(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        p054q.g gVar = new p054q.g(context, null);
        gVar.f5573k = true;
        gVar.f5578p.flags |= 16;
        gVar.e = p054q.g.b(strE);
        C0104l c0104l = new C0104l();
        c0104l.f1774d = p054q.g.b(strD);
        gVar.c(c0104l);
        PackageManager packageManager = context.getPackageManager();
        if (A.f3561a == null) {
            A.f3561a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (A.f3561a.booleanValue()) {
            gVar.f5578p.icon = context.getApplicationInfo().icon;
            gVar.f5570h = 2;
            if (A.a(context)) {
                gVar.f5565b.add(new p054q.f(resources.getString(id.go.bangkalankab.simpeg.R.string.common_open_on_phone), pendingIntent));
            } else {
                gVar.f5569g = pendingIntent;
            }
        } else {
            gVar.f5578p.icon = R.drawable.stat_sys_warning;
            gVar.f5578p.tickerText = p054q.g.b(resources.getString(id.go.bangkalankab.simpeg.R.string.common_google_play_services_notification_ticker));
            gVar.f5578p.when = System.currentTimeMillis();
            gVar.f5569g = pendingIntent;
            gVar.f5568f = p054q.g.b(strD);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            if (i5 < 26) {
                throw new IllegalStateException();
            }
            synchronized (f869c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(id.go.bangkalankab.simpeg.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(C.f.d(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            gVar.f5576n = "com.google.android.gms.availability";
        }
        Notification notificationA = gVar.a();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            f.f873a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, notificationA);
    }

    public final void h(Activity activity, G g3, int i3, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogE = e(activity, i3, new o(super.b(i3, activity, "d"), g3, 1), onCancelListener);
        if (alertDialogE == null) {
            return;
        }
        f(activity, alertDialogE, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
