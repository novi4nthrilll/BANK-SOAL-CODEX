package p030i1;

import E0.e;
import M.k;
import N0.D;
import Z0.b;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends b {
    @Override // Z0.b
    public final boolean k(int i3, Parcel parcel, Parcel parcel2) {
        switch (i3) {
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                Z0.c.b(parcel);
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                Z0.c.b(parcel);
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
            default:
                return false;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Z0.c.b(parcel);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                Z0.c.b(parcel);
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                f fVar = (f) Z0.c.a(parcel, f.CREATOR);
                Z0.c.b(parcel);
                D d3 = (D) this;
                d3.f1045d.post(new e(d3, fVar, 3, false));
                break;
            case 9:
                Z0.c.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
