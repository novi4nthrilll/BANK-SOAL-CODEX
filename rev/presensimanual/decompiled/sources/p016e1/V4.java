package p016e1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class V4 extends a {
    public static final Parcelable.Creator<V4> CREATOR = new C0618j0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f4140b;

    public V4(int i3, ArrayList arrayList) {
        this.f4139a = i3;
        this.f4140b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4139a);
        AbstractC0522t.e(parcel, 2, this.f4140b);
        AbstractC0522t.g(parcel, iF);
    }
}
