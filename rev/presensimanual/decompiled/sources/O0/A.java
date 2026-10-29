package O0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class A extends P0.a {
    public static final Parcelable.Creator<A> CREATOR = new G.i(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f1223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L0.c[] f1224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0090d f1226d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        Bundle bundle = this.f1223a;
        if (bundle != null) {
            int iF2 = AbstractC0522t.f(parcel, 1);
            parcel.writeBundle(bundle);
            AbstractC0522t.g(parcel, iF2);
        }
        AbstractC0522t.d(parcel, 2, this.f1224b, i3);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f1225c);
        AbstractC0522t.b(parcel, 4, this.f1226d, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
