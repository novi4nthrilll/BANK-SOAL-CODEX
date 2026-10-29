package R0;

import G.i;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends P0.a {
    public static final Parcelable.Creator<c> CREATOR = new i(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1444b;

    public c(int i3, boolean z2) {
        this.f1443a = i3;
        this.f1444b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f1443a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f1444b ? 1 : 0);
        AbstractC0522t.g(parcel, iF);
    }
}
