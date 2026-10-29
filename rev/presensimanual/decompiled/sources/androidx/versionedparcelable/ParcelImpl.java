package androidx.versionedparcelable;

import G.i;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p012d0.b;
import p012d0.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new i(26);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f2505a;

    public ParcelImpl(Parcel parcel) {
        this.f2505a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        new b(parcel).i(this.f2505a);
    }
}
