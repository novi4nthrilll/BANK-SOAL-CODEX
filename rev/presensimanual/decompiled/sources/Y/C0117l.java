package Y;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: Y.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0117l implements Parcelable {
    public static final Parcelable.Creator<C0117l> CREATOR = new G.i(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1899c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1897a);
        parcel.writeInt(this.f1898b);
        parcel.writeInt(this.f1899c ? 1 : 0);
    }
}
