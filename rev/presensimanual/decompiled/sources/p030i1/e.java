package p030i1;

import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013d1.AbstractC0522t;
import p023g1.g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new g(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4600b;

    public e(String str, ArrayList arrayList) {
        this.f4599a = arrayList;
        this.f4600b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        ArrayList arrayList = this.f4599a;
        if (arrayList != null) {
            int iF2 = AbstractC0522t.f(parcel, 1);
            parcel.writeStringList(arrayList);
            AbstractC0522t.g(parcel, iF2);
        }
        AbstractC0522t.c(parcel, 2, this.f4600b);
        AbstractC0522t.g(parcel, iF);
    }
}
