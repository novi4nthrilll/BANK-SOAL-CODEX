package p023g1;

import G.i;
import O0.u;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p006b1.j;
import p006b1.n;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends P0.a {
    public static final Parcelable.Creator<a> CREATOR = new i(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f4487d;

    public a(long j3, int i3, boolean z2, j jVar) {
        this.f4484a = j3;
        this.f4485b = i3;
        this.f4486c = z2;
        this.f4487d = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4484a == aVar.f4484a && this.f4485b == aVar.f4485b && this.f4486c == aVar.f4486c && u.i(this.f4487d, aVar.f4487d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4484a), Integer.valueOf(this.f4485b), Boolean.valueOf(this.f4486c)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        long j3 = this.f4484a;
        if (j3 != Long.MAX_VALUE) {
            sb.append("maxAge=");
            n.a(j3, sb);
        }
        int i3 = this.f4485b;
        if (i3 != 0) {
            sb.append(", ");
            if (i3 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i3 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.f4486c) {
            sb.append(", bypass");
        }
        j jVar = this.f4487d;
        if (jVar != null) {
            sb.append(", impersonation=");
            sb.append(jVar);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 8);
        parcel.writeLong(this.f4484a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f4485b);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f4486c ? 1 : 0);
        AbstractC0522t.b(parcel, 5, this.f4487d, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
