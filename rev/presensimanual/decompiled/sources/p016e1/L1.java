package p016e1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class L1 extends a {
    public static final Parcelable.Creator<L1> CREATOR = new C0618j0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4082d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4083f;

    public L1(int i3, int i4, int i5, boolean z2, boolean z3, float f3) {
        this.f4079a = i3;
        this.f4080b = i4;
        this.f4081c = i5;
        this.f4082d = z2;
        this.e = z3;
        this.f4083f = f3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f4079a);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f4080b);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeInt(this.f4081c);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeInt(this.f4082d ? 1 : 0);
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeInt(this.e ? 1 : 0);
        AbstractC0522t.h(parcel, 7, 4);
        parcel.writeFloat(this.f4083f);
        AbstractC0522t.g(parcel, iF);
    }
}
