package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class I7 extends P0.a {
    public static final Parcelable.Creator<I7> CREATOR = new J7(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2820d;
    public final long e;

    public I7(int i3, int i4, int i5, int i6, long j3) {
        this.f2817a = i3;
        this.f2818b = i4;
        this.f2819c = i5;
        this.f2820d = i6;
        this.e = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2817a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f2818b);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f2819c);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeInt(this.f2820d);
        AbstractC0522t.h(parcel, 5, 8);
        parcel.writeLong(this.e);
        AbstractC0522t.g(parcel, iF);
    }
}
