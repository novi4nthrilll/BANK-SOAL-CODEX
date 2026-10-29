package p030i1;

import O0.q;
import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;
import p023g1.g;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new g(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0.a f4602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f4603c;

    public f(int i3, L0.a aVar, q qVar) {
        this.f4601a = i3;
        this.f4602b = aVar;
        this.f4603c = qVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f4601a);
        AbstractC0522t.b(parcel, 2, this.f4602b, i3);
        AbstractC0522t.b(parcel, 3, this.f4603c, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
