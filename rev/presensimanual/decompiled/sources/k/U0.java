package k;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends I.c {
    public static final Parcelable.Creator<U0> CREATOR = new I.b(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5092d;

    public U0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5091c = parcel.readInt();
        this.f5092d = parcel.readInt() != 0;
    }

    @Override // I.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f5091c);
        parcel.writeInt(this.f5092d ? 1 : 0);
    }
}
