package S0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p013d1.AbstractC0516s;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM = AbstractC0516s.m(parcel);
        ArrayList arrayListD = null;
        String strB = null;
        String strB2 = null;
        boolean zF = false;
        while (parcel.dataPosition() < iM) {
            int i3 = parcel.readInt();
            char c3 = (char) i3;
            if (c3 == 1) {
                arrayListD = AbstractC0516s.d(parcel, i3, L0.c.CREATOR);
            } else if (c3 == 2) {
                zF = AbstractC0516s.f(parcel, i3);
            } else if (c3 == 3) {
                strB = AbstractC0516s.b(parcel, i3);
            } else if (c3 != 4) {
                AbstractC0516s.l(parcel, i3);
            } else {
                strB2 = AbstractC0516s.b(parcel, i3);
            }
        }
        AbstractC0516s.e(parcel, iM);
        return new a(arrayListD, zF, strB, strB2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        return new a[i3];
    }
}
