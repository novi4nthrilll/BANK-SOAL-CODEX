package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new G.i(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1830d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f1831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f1832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1835j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1827a);
        parcel.writeInt(this.f1828b);
        parcel.writeInt(this.f1829c);
        if (this.f1829c > 0) {
            parcel.writeIntArray(this.f1830d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f1831f);
        }
        parcel.writeInt(this.f1833h ? 1 : 0);
        parcel.writeInt(this.f1834i ? 1 : 0);
        parcel.writeInt(this.f1835j ? 1 : 0);
        parcel.writeList(this.f1832g);
    }
}
