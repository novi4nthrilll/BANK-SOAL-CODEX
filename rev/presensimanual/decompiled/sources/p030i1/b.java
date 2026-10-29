package p030i1;

import P0.a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;
import p023g1.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new g(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f4598c;

    public b(int i3, int i4, Intent intent) {
        this.f4596a = i3;
        this.f4597b = i4;
        this.f4598c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4596a);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f4597b);
        AbstractC0522t.b(parcel, 3, this.f4598c, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
