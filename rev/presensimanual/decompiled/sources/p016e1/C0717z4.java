package p016e1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: renamed from: e1.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0717z4 extends a {
    public static final Parcelable.Creator<C0717z4> CREATOR = new C0618j0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4387d;

    public C0717z4(int i3, float f3, float f4, int i4) {
        this.f4384a = i3;
        this.f4385b = f3;
        this.f4386c = f4;
        this.f4387d = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4384a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeFloat(this.f4385b);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeFloat(this.f4386c);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeInt(this.f4387d);
        AbstractC0522t.g(parcel, iF);
    }
}
