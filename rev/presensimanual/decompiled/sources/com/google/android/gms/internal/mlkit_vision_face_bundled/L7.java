package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class L7 extends P0.a {
    public static final Parcelable.Creator<L7> CREATOR = new J7(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2845d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f2846f;

    public L7(int i3, int i4, int i5, int i6, boolean z2, float f3) {
        this.f2842a = i3;
        this.f2843b = i4;
        this.f2844c = i5;
        this.f2845d = i6;
        this.e = z2;
        this.f2846f = f3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2842a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f2843b);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f2844c);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeInt(this.f2845d);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeFloat(this.f2846f);
        AbstractC0522t.g(parcel, iF);
    }
}
