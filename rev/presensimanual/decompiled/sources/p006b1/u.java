package p006b1;

import G.i;
import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new i(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f2556a;

    public u(Status status) {
        this.f2556a = status;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.b(parcel, 1, this.f2556a, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
