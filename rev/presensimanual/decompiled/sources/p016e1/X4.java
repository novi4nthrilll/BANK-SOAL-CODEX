package p016e1;

import P0.a;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class X4 extends a {
    public static final Parcelable.Creator<X4> CREATOR = new C0618j0(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f4155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f4156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f4157d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4161i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4162j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f4163k;

    public X4(int i3, Rect rect, float f3, float f4, float f5, float f6, float f7, float f8, float f9, ArrayList arrayList, ArrayList arrayList2) {
        this.f4154a = i3;
        this.f4155b = rect;
        this.f4156c = f3;
        this.f4157d = f4;
        this.e = f5;
        this.f4158f = f6;
        this.f4159g = f7;
        this.f4160h = f8;
        this.f4161i = f9;
        this.f4162j = arrayList;
        this.f4163k = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4154a);
        AbstractC0522t.b(parcel, 2, this.f4155b, i3);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeFloat(this.f4156c);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeFloat(this.f4157d);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeFloat(this.e);
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeFloat(this.f4158f);
        AbstractC0522t.h(parcel, 7, 4);
        parcel.writeFloat(this.f4159g);
        AbstractC0522t.h(parcel, 8, 4);
        parcel.writeFloat(this.f4160h);
        AbstractC0522t.h(parcel, 9, 4);
        parcel.writeFloat(this.f4161i);
        AbstractC0522t.e(parcel, 10, this.f4162j);
        AbstractC0522t.e(parcel, 11, this.f4163k);
        AbstractC0522t.g(parcel, iF);
    }
}
