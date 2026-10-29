package O0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class q extends P0.a {
    public static final Parcelable.Creator<q> CREATOR = new G.i(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f1303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L0.a f1304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1305d;
    public final boolean e;

    public q(int i3, IBinder iBinder, L0.a aVar, boolean z2, boolean z3) {
        this.f1302a = i3;
        this.f1303b = iBinder;
        this.f1304c = aVar;
        this.f1305d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        Object f3;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f1304c.equals(qVar.f1304c)) {
            Object f4 = null;
            IBinder iBinder = this.f1303b;
            if (iBinder == null) {
                f3 = null;
            } else {
                int i3 = AbstractBinderC0087a.f1246c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                f3 = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new F(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = qVar.f1303b;
            if (iBinder2 != null) {
                int i4 = AbstractBinderC0087a.f1246c;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                f4 = iInterfaceQueryLocalInterface2 instanceof g ? (g) iInterfaceQueryLocalInterface2 : new F(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (u.i(f3, f4)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f1302a);
        AbstractC0522t.a(parcel, 2, this.f1303b);
        AbstractC0522t.b(parcel, 3, this.f1304c, i3);
        AbstractC0522t.h(parcel, 4, 4);
        parcel.writeInt(this.f1305d ? 1 : 0);
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        AbstractC0522t.g(parcel, iF);
    }
}
