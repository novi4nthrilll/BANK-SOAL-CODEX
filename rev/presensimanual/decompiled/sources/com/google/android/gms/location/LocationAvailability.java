package com.google.android.gms.location;

import G.i;
import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new i(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3514d;
    public final p023g1.i[] e;

    public LocationAvailability(int i3, int i4, int i5, long j3, p023g1.i[] iVarArr) {
        this.f3514d = i3 < 1000 ? 0 : 1000;
        this.f3511a = i4;
        this.f3512b = i5;
        this.f3513c = j3;
        this.e = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f3511a == locationAvailability.f3511a && this.f3512b == locationAvailability.f3512b && this.f3513c == locationAvailability.f3513c && this.f3514d == locationAvailability.f3514d && Arrays.equals(this.e, locationAvailability.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3514d)});
    }

    public final String toString() {
        boolean z2 = this.f3514d < 1000;
        StringBuilder sb = new StringBuilder(String.valueOf(z2).length() + 22);
        sb.append("LocationAvailability[");
        sb.append(z2);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f3511a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f3512b);
        AbstractC0522t.h(parcel, 3, 8);
        parcel.writeLong(this.f3513c);
        AbstractC0522t.h(parcel, 4, 4);
        int i4 = this.f3514d;
        parcel.writeInt(i4);
        AbstractC0522t.d(parcel, 5, this.e, i3);
        int i5 = i4 >= 1000 ? 0 : 1;
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeInt(i5);
        AbstractC0522t.g(parcel, iF);
    }
}
