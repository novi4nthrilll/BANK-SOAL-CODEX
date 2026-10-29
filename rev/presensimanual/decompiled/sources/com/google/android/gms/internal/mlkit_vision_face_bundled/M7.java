package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class M7 extends P0.a {
    public static final Parcelable.Creator<M7> CREATOR = new J7(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f2853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f2854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f2855d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f2857g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f2858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f2859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2860j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f2861k;

    public M7(int i3, Rect rect, float f3, float f4, float f5, float f6, float f7, float f8, float f9, ArrayList arrayList, ArrayList arrayList2) {
        this.f2852a = i3;
        this.f2853b = rect;
        this.f2854c = f3;
        this.f2855d = f4;
        this.e = f5;
        this.f2856f = f6;
        this.f2857g = f7;
        this.f2858h = f8;
        this.f2859i = f9;
        this.f2860j = arrayList;
        this.f2861k = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2852a);
        AbstractC0522t.b(parcel, 2, this.f2853b, i3);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeFloat(this.f2854c);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeFloat(this.f2855d);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeFloat(this.e);
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeFloat(this.f2856f);
        AbstractC0522t.h(parcel, 7, 4);
        parcel.writeFloat(this.f2857g);
        AbstractC0522t.h(parcel, 8, 4);
        parcel.writeFloat(this.f2858h);
        AbstractC0522t.h(parcel, 9, 4);
        parcel.writeFloat(this.f2859i);
        AbstractC0522t.e(parcel, 10, this.f2860j);
        AbstractC0522t.e(parcel, 11, this.f2861k);
        AbstractC0522t.g(parcel, iF);
    }
}
