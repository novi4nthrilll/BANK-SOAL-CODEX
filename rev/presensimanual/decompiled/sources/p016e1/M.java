package p016e1;

import P0.a;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class M extends a {
    public static final Parcelable.Creator<M> CREATOR = new C0618j0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF[] f4084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4085b;

    public M(PointF[] pointFArr, int i3) {
        this.f4084a = pointFArr;
        this.f4085b = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.d(parcel, 2, this.f4084a, i3);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f4085b);
        AbstractC0522t.g(parcel, iF);
    }
}
