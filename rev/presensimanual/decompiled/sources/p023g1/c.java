package p023g1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4491c;

    public c(ArrayList arrayList, boolean z2, boolean z3) {
        this.f4489a = arrayList;
        this.f4490b = z2;
        this.f4491c = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.e(parcel, 1, Collections.unmodifiableList(this.f4489a));
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f4490b ? 1 : 0);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f4491c ? 1 : 0);
        AbstractC0522t.g(parcel, iF);
    }
}
