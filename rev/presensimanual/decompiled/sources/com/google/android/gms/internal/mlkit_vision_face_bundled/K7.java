package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class K7 extends P0.a {
    public static final Parcelable.Creator<K7> CREATOR = new J7(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2834b;

    public K7(int i3, ArrayList arrayList) {
        this.f2833a = i3;
        this.f2834b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2833a);
        AbstractC0522t.e(parcel, 2, this.f2834b);
        AbstractC0522t.g(parcel, iF);
    }
}
