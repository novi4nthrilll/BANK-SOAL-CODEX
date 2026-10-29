package com.google.android.gms.common.api;

import G.i;
import O0.u;
import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new i(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2706b;

    public Scope(String str, int i3) {
        u.e(str, "scopeUri must not be null or empty");
        this.f2705a = i3;
        this.f2706b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2706b.equals(((Scope) obj).f2706b);
    }

    public final int hashCode() {
        return this.f2706b.hashCode();
    }

    public final String toString() {
        return this.f2706b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f2705a);
        AbstractC0522t.c(parcel, 2, this.f2706b);
        AbstractC0522t.g(parcel, iF);
    }
}
