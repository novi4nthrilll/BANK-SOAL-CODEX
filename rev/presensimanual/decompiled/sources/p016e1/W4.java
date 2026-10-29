package p016e1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class W4 extends a {
    public static final Parcelable.Creator<W4> CREATOR = new C0618j0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4146d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4147f;

    public W4(int i3, int i4, int i5, int i6, boolean z2, float f3) {
        this.f4143a = i3;
        this.f4144b = i4;
        this.f4145c = i5;
        this.f4146d = i6;
        this.e = z2;
        this.f4147f = f3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4143a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f4144b);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f4145c);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeInt(this.f4146d);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeFloat(this.f4147f);
        AbstractC0522t.g(parcel, iF);
    }
}
