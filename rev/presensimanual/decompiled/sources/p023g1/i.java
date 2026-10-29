package p023g1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4506d;

    public i(int i3, int i4, long j3, long j4) {
        this.f4503a = i3;
        this.f4504b = i4;
        this.f4505c = j3;
        this.f4506d = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f4503a == iVar.f4503a && this.f4504b == iVar.f4504b && this.f4505c == iVar.f4505c && this.f4506d == iVar.f4506d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4504b), Integer.valueOf(this.f4503a), Long.valueOf(this.f4506d), Long.valueOf(this.f4505c)});
    }

    public final String toString() {
        int i3 = this.f4503a;
        int length = String.valueOf(i3).length();
        int i4 = this.f4504b;
        int length2 = String.valueOf(i4).length();
        long j3 = this.f4506d;
        int length3 = String.valueOf(j3).length();
        long j4 = this.f4505c;
        StringBuilder sb = new StringBuilder(length + 50 + length2 + 18 + length3 + 17 + String.valueOf(j4).length());
        sb.append("NetworkLocationStatus: Wifi status: ");
        sb.append(i3);
        sb.append(" Cell status: ");
        sb.append(i4);
        sb.append(" elapsed time NS: ");
        sb.append(j3);
        sb.append(" system time ms: ");
        sb.append(j4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4503a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f4504b);
        AbstractC0522t.h(parcel, 3, 8);
        parcel.writeLong(this.f4505c);
        AbstractC0522t.h(parcel, 4, 8);
        parcel.writeLong(this.f4506d);
        AbstractC0522t.g(parcel, iF);
    }
}
