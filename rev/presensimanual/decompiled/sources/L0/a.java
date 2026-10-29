package L0;

import O0.u;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends P0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f863d;
    public static final a e = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new G.i(2);

    public a(int i3, int i4, PendingIntent pendingIntent, String str) {
        this.f860a = i3;
        this.f861b = i4;
        this.f862c = pendingIntent;
        this.f863d = str;
    }

    public static String a(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_UNDEFINED /* -1 */:
                return "UNKNOWN";
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return "SERVICE_DISABLED";
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                return "SIGN_IN_REQUIRED";
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i3) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i3 + ")";
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f861b == aVar.f861b && u.i(this.f862c, aVar.f862c) && u.i(this.f863d, aVar.f863d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f861b), this.f862c, this.f863d});
    }

    public final String toString() {
        A0.g gVar = new A0.g(this);
        gVar.j(a(this.f861b), "statusCode");
        gVar.j(this.f862c, "resolution");
        gVar.j(this.f863d, "message");
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f860a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f861b);
        AbstractC0522t.b(parcel, 3, this.f862c, i3);
        AbstractC0522t.c(parcel, 4, this.f863d);
        AbstractC0522t.g(parcel, iF);
    }

    public a(int i3) {
        this(1, i3, null, null);
    }

    public a(int i3, PendingIntent pendingIntent) {
        this(1, i3, pendingIntent, null);
    }
}
