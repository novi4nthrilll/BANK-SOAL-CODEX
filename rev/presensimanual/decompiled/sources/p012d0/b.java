package p012d0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f3554d;
    public final Parcel e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3560k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p045n.b(), new p045n.b(), new p045n.b());
    }

    @Override // p012d0.a
    public final b a() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i3 = this.f3559j;
        if (i3 == this.f3555f) {
            i3 = this.f3556g;
        }
        return new b(parcel, iDataPosition, i3, I.h(new StringBuilder(), this.f3557h, "  "), this.f3551a, this.f3552b, this.f3553c);
    }

    @Override // p012d0.a
    public final boolean e(int i3) {
        while (this.f3559j < this.f3556g) {
            int i4 = this.f3560k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f3559j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i5);
            int i6 = parcel.readInt();
            this.f3560k = parcel.readInt();
            this.f3559j += i6;
        }
        return this.f3560k == i3;
    }

    @Override // p012d0.a
    public final void h(int i3) {
        int i4 = this.f3558i;
        SparseIntArray sparseIntArray = this.f3554d;
        Parcel parcel = this.e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(iDataPosition - i5);
            parcel.setDataPosition(iDataPosition);
        }
        this.f3558i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i4, String str, p045n.b bVar, p045n.b bVar2, p045n.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f3554d = new SparseIntArray();
        this.f3558i = -1;
        this.f3560k = -1;
        this.e = parcel;
        this.f3555f = i3;
        this.f3556g = i4;
        this.f3559j = i3;
        this.f3557h = str;
    }
}
