package I;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f336b = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f337a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f337a, i3);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f337a = parcelable == f336b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f337a = parcelable == null ? f336b : parcelable;
    }
}
