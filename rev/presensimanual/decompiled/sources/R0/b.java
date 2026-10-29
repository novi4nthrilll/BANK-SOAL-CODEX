package R0;

import G.i;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends P0.a {
    public static final Parcelable.Creator<b> CREATOR = new i(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PendingIntent f1442a;

    public b(PendingIntent pendingIntent) {
        this.f1442a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.b(parcel, 1, this.f1442a, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
