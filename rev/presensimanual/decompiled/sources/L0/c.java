package L0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends P0.a {
    public static final Parcelable.Creator<c> CREATOR = new G.i(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f868c;

    public c(long j3, String str) {
        this.f866a = str;
        this.f868c = j3;
        this.f867b = -1;
    }

    public final long a() {
        long j3 = this.f868c;
        return j3 == -1 ? this.f867b : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = this.f866a;
            if (((str != null && str.equals(cVar.f866a)) || (str == null && cVar.f866a == null)) && a() == cVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f866a, Long.valueOf(a())});
    }

    public final String toString() {
        A0.g gVar = new A0.g(this);
        gVar.j(this.f866a, "name");
        gVar.j(Long.valueOf(a()), "version");
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.c(parcel, 1, this.f866a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f867b);
        long jA = a();
        AbstractC0522t.h(parcel, 3, 8);
        parcel.writeLong(jA);
        AbstractC0522t.g(parcel, iF);
    }

    public c(long j3, String str, int i3) {
        this.f866a = str;
        this.f867b = i3;
        this.f868c = j3;
    }
}
