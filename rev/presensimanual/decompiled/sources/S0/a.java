package S0;

import O0.u;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends P0.a {
    public static final Parcelable.Creator<a> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1582d;

    public a(ArrayList arrayList, boolean z2, String str, String str2) {
        u.f(arrayList);
        this.f1579a = arrayList;
        this.f1580b = z2;
        this.f1581c = str;
        this.f1582d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1580b == aVar.f1580b && u.i(this.f1579a, aVar.f1579a) && u.i(this.f1581c, aVar.f1581c) && u.i(this.f1582d, aVar.f1582d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f1580b), this.f1579a, this.f1581c, this.f1582d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.e(parcel, 1, this.f1579a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f1580b ? 1 : 0);
        AbstractC0522t.c(parcel, 3, this.f1581c);
        AbstractC0522t.c(parcel, 4, this.f1582d);
        AbstractC0522t.g(parcel, iF);
    }
}
