package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Parcelable {
    public static final Parcelable.Creator<H> CREATOR = new G.i(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f1825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1826d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1823a + ", mGapDir=" + this.f1824b + ", mHasUnwantedGapAfter=" + this.f1826d + ", mGapPerSpan=" + Arrays.toString(this.f1825c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1823a);
        parcel.writeInt(this.f1824b);
        parcel.writeInt(this.f1826d ? 1 : 0);
        int[] iArr = this.f1825c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1825c);
        }
    }
}
