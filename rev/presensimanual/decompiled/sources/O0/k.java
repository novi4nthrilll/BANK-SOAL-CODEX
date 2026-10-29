package O0;

import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class k extends P0.a {
    public static final Parcelable.Creator<k> CREATOR = new G.i(11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1288d;
    public final int e;

    public k(int i3, boolean z2, boolean z3, int i4, int i5) {
        this.f1285a = i3;
        this.f1286b = z2;
        this.f1287c = z3;
        this.f1288d = i4;
        this.e = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f1285a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f1286b ? 1 : 0);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f1287c ? 1 : 0);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeInt(this.f1288d);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeInt(this.e);
        AbstractC0522t.g(parcel, iF);
    }
}
