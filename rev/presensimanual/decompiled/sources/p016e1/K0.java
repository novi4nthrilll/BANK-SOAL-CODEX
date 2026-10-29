package p016e1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends a {
    public static final Parcelable.Creator<K0> CREATOR = new C0618j0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4063d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0717z4[] f4068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f4069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f4070l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f4071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M[] f4072n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f4073o;

    public K0(int i3, int i4, float f3, float f4, float f5, float f6, float f7, float f8, float f9, C0717z4[] c0717z4Arr, float f10, float f11, float f12, M[] mArr, float f13) {
        this.f4060a = i3;
        this.f4061b = i4;
        this.f4062c = f3;
        this.f4063d = f4;
        this.e = f5;
        this.f4064f = f6;
        this.f4065g = f7;
        this.f4066h = f8;
        this.f4067i = f9;
        this.f4068j = c0717z4Arr;
        this.f4069k = f10;
        this.f4070l = f11;
        this.f4071m = f12;
        this.f4072n = mArr;
        this.f4073o = f13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4060a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f4061b);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeFloat(this.f4062c);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeFloat(this.f4063d);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeFloat(this.e);
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeFloat(this.f4064f);
        AbstractC0522t.h(parcel, 7, 4);
        parcel.writeFloat(this.f4065g);
        AbstractC0522t.h(parcel, 8, 4);
        parcel.writeFloat(this.f4066h);
        AbstractC0522t.d(parcel, 9, this.f4068j, i3);
        AbstractC0522t.h(parcel, 10, 4);
        parcel.writeFloat(this.f4069k);
        AbstractC0522t.h(parcel, 11, 4);
        parcel.writeFloat(this.f4070l);
        AbstractC0522t.h(parcel, 12, 4);
        parcel.writeFloat(this.f4071m);
        AbstractC0522t.d(parcel, 13, this.f4072n, i3);
        AbstractC0522t.h(parcel, 14, 4);
        parcel.writeFloat(this.f4067i);
        AbstractC0522t.h(parcel, 15, 4);
        parcel.writeFloat(this.f4073o);
        AbstractC0522t.g(parcel, iF);
    }
}
