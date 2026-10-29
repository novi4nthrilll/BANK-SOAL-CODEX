package O0;

import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: renamed from: O0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0089c extends P0.a {
    public static final Parcelable.Creator<C0089c> CREATOR = new G.i(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1248b;

    public C0089c(String str, int i3) {
        this.f1247a = i3;
        this.f1248b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0089c)) {
            return false;
        }
        C0089c c0089c = (C0089c) obj;
        return c0089c.f1247a == this.f1247a && u.i(c0089c.f1248b, this.f1248b);
    }

    public final int hashCode() {
        return this.f1247a;
    }

    public final String toString() {
        return this.f1247a + ":" + this.f1248b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f1247a);
        AbstractC0522t.c(parcel, 2, this.f1248b);
        AbstractC0522t.g(parcel, iF);
    }
}
