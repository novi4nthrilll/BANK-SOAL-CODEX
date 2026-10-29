package com.google.android.gms.common.api;

import A0.g;
import G.i;
import M.k;
import O0.u;
import P0.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0522t;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new i(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PendingIntent f2709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.a f2710d;

    public Status(int i3, String str, PendingIntent pendingIntent, L0.a aVar) {
        this.f2707a = i3;
        this.f2708b = str;
        this.f2709c = pendingIntent;
        this.f2710d = aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f2707a == status.f2707a && u.i(this.f2708b, status.f2708b) && u.i(this.f2709c, status.f2709c) && u.i(this.f2710d, status.f2710d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2707a), this.f2708b, this.f2709c, this.f2710d});
    }

    public final String toString() {
        g gVar = new g(this);
        String strF = this.f2708b;
        if (strF == null) {
            int i3 = this.f2707a;
            switch (i3) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_UNDEFINED /* -1 */:
                    strF = "SUCCESS_CACHE";
                    break;
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    strF = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strF = I.f("unknown status code: ", i3);
                    break;
                case 2:
                    strF = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    strF = "SERVICE_DISABLED";
                    break;
                case k.LONG_FIELD_NUMBER /* 4 */:
                    strF = "SIGN_IN_REQUIRED";
                    break;
                case k.STRING_FIELD_NUMBER /* 5 */:
                    strF = "INVALID_ACCOUNT";
                    break;
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    strF = "RESOLUTION_REQUIRED";
                    break;
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    strF = "NETWORK_ERROR";
                    break;
                case k.BYTES_FIELD_NUMBER /* 8 */:
                    strF = "INTERNAL_ERROR";
                    break;
                case 10:
                    strF = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strF = "ERROR";
                    break;
                case 14:
                    strF = "INTERRUPTED";
                    break;
                case 15:
                    strF = "TIMEOUT";
                    break;
                case 16:
                    strF = "CANCELED";
                    break;
                case 17:
                    strF = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strF = "DEAD_CLIENT";
                    break;
                case 19:
                    strF = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strF = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strF = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strF = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        gVar.j(strF, "statusCode");
        gVar.j(this.f2709c, "resolution");
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2707a);
        AbstractC0522t.c(parcel, 2, this.f2708b);
        AbstractC0522t.b(parcel, 3, this.f2709c, i3);
        AbstractC0522t.b(parcel, 4, this.f2710d, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
