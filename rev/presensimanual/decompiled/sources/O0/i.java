package O0;

import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class i extends P0.a {
    public static final Parcelable.Creator<i> CREATOR = new G.i(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1277d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1281i;

    public i(int i3, int i4, int i5, long j3, long j4, String str, String str2, int i6, int i7) {
        this.f1274a = i3;
        this.f1275b = i4;
        this.f1276c = i5;
        this.f1277d = j3;
        this.e = j4;
        this.f1278f = str;
        this.f1279g = str2;
        this.f1280h = i6;
        this.f1281i = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f1274a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f1275b);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f1276c);
        AbstractC0522t.h(parcel, 4, 8);
        parcel.writeLong(this.f1277d);
        AbstractC0522t.h(parcel, 5, 8);
        parcel.writeLong(this.e);
        AbstractC0522t.c(parcel, 6, this.f1278f);
        AbstractC0522t.c(parcel, 7, this.f1279g);
        AbstractC0522t.h(parcel, 8, 4);
        parcel.writeInt(this.f1280h);
        AbstractC0522t.h(parcel, 9, 4);
        parcel.writeInt(this.f1281i);
        AbstractC0522t.g(parcel, iF);
    }
}
