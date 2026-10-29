package p006b1;

import G.i;
import P0.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;
import p023g1.k;
import p023g1.l;
import p023g1.n;
import p023g1.o;

/* JADX INFO: loaded from: classes.dex */
public final class m extends a {
    public static final Parcelable.Creator<m> CREATOR = new i(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f2540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f2541d;
    public final PendingIntent e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f2542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2543g;

    public m(int i3, l lVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        o mVar;
        l kVar;
        this.f2538a = i3;
        this.f2539b = lVar;
        x vVar = null;
        if (iBinder != null) {
            int i4 = n.f4508c;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            mVar = iInterfaceQueryLocalInterface instanceof o ? (o) iInterfaceQueryLocalInterface : new p023g1.m(iBinder, "com.google.android.gms.location.ILocationListener", 2);
        } else {
            mVar = null;
        }
        this.f2540c = mVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            int i5 = h.f2523d;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            kVar = iInterfaceQueryLocalInterface2 instanceof l ? (l) iInterfaceQueryLocalInterface2 : new k(iBinder2, "com.google.android.gms.location.ILocationCallback", 2);
        } else {
            kVar = null;
        }
        this.f2541d = kVar;
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            vVar = iInterfaceQueryLocalInterface3 instanceof x ? (x) iInterfaceQueryLocalInterface3 : new v(iBinder3, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
        }
        this.f2542f = vVar;
        this.f2543g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2538a);
        AbstractC0522t.b(parcel, 2, this.f2539b, i3);
        IInterface iInterface = this.f2540c;
        AbstractC0522t.a(parcel, 3, iInterface == null ? null : ((Z0.a) iInterface).f1944c);
        AbstractC0522t.b(parcel, 4, this.e, i3);
        l lVar = this.f2541d;
        AbstractC0522t.a(parcel, 5, lVar == null ? null : lVar.asBinder());
        x xVar = this.f2542f;
        AbstractC0522t.a(parcel, 6, xVar != null ? xVar.asBinder() : null);
        AbstractC0522t.c(parcel, 8, this.f2543g);
        AbstractC0522t.g(parcel, iF);
    }
}
