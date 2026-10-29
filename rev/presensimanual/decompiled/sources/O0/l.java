package O0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class l extends P0.a {
    public static final Parcelable.Creator<l> CREATOR = new G.i(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f1290b;

    public l(int i3, List list) {
        this.f1289a = i3;
        this.f1290b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f1289a);
        AbstractC0522t.e(parcel, 2, this.f1290b);
        AbstractC0522t.g(parcel, iF);
    }
}
