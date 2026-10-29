package O0;

import android.os.Parcel;
import android.os.Parcelable;
import p013d1.AbstractC0522t;

/* JADX INFO: renamed from: O0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0090d extends P0.a {
    public static final Parcelable.Creator<C0090d> CREATOR = new G.i(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f1249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f1252d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f1253f;

    public C0090d(k kVar, boolean z2, boolean z3, int[] iArr, int i3, int[] iArr2) {
        this.f1249a = kVar;
        this.f1250b = z2;
        this.f1251c = z3;
        this.f1252d = iArr;
        this.e = i3;
        this.f1253f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.b(parcel, 1, this.f1249a, i3);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(this.f1250b ? 1 : 0);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f1251c ? 1 : 0);
        int[] iArr = this.f1252d;
        if (iArr != null) {
            int iF2 = AbstractC0522t.f(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC0522t.g(parcel, iF2);
        }
        AbstractC0522t.h(parcel, 5, 4);
        parcel.writeInt(this.e);
        int[] iArr2 = this.f1253f;
        if (iArr2 != null) {
            int iF3 = AbstractC0522t.f(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC0522t.g(parcel, iF3);
        }
        AbstractC0522t.g(parcel, iF);
    }
}
