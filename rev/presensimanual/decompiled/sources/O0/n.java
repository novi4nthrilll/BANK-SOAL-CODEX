package O0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import id.go.bangkalankab.simpeg.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p013d1.AbstractC0544w3;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p045n.l f1293a = new p045n.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f1294b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = W0.b.a(context).f1193a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i3) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i3 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, strA);
        }
        if (i3 == 2) {
            return p013d1.A.a(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, strA);
        }
        if (i3 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, strA);
        }
        if (i3 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i3 == 7) {
            return d(context, "common_google_play_services_network_error_text", strA);
        }
        if (i3 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, strA);
        }
        if (i3 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i3) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, strA);
        }
    }

    public static String c(Context context, int i3) {
        Resources resources = context.getResources();
        switch (i3) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case M.k.LONG_FIELD_NUMBER /* 4 */:
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i3);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        p045n.l lVar = f1293a;
        synchronized (lVar) {
            try {
                Locale locale = AbstractC0544w3.a(context.getResources().getConfiguration()).f5816a.get(0);
                if (!locale.equals(f1294b)) {
                    lVar.clear();
                    f1294b = locale;
                }
                String str2 = (String) lVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = L0.f.f873a;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f1293a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
