package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class T7 extends P0.a {
    public static final Parcelable.Creator<T7> CREATOR = new J7(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF f2920b;

    public T7(int i3, PointF pointF) {
        this.f2919a = i3;
        this.f2920b = pointF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2919a);
        AbstractC0522t.b(parcel, 2, this.f2920b, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
