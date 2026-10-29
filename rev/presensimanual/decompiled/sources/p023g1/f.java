package p023g1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new g(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4498d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4499f;

    public f(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f4495a = z2;
        this.f4496b = z3;
        this.f4497c = z4;
        this.f4498d = z5;
        this.e = z6;
        this.f4499f = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4495a ? 1 : 0);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f4496b ? 1 : 0);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f4497c ? 1 : 0);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeInt(this.f4498d ? 1 : 0);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeInt(this.f4499f ? 1 : 0);
        AbstractC0522t.g(parcel, iF);
    }
}
