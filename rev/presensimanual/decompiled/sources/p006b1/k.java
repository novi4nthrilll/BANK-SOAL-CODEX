package p006b1;

import G.i;
import P0.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new i(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f2534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f2535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PendingIntent f2536d;
    public final String e;

    public k(int i3, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.f2533a = i3;
        this.f2534b = iBinder;
        this.f2535c = iBinder2;
        this.f2536d = pendingIntent;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2533a);
        AbstractC0522t.a(parcel, 2, this.f2534b);
        AbstractC0522t.a(parcel, 3, this.f2535c);
        AbstractC0522t.b(parcel, 4, this.f2536d, i3);
        AbstractC0522t.c(parcel, 6, this.e);
        AbstractC0522t.g(parcel, iF);
    }
}
