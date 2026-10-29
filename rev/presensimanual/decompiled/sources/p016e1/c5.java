package p016e1;

import P0.a;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends a {
    public static final Parcelable.Creator<c5> CREATOR = new C0618j0(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f4184b;

    public c5(int i3, PointF pointF) {
        this.f4183a = i3;
        this.f4184b = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4183a);
        AbstractC0522t.b(parcel, 2, this.f4184b, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
