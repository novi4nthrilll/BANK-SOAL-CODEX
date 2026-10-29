package p006b1;

import Z0.b;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class w extends b implements x {
    public w() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
    }

    @Override // Z0.b
    public final boolean m(Parcel parcel, int i3) {
        if (i3 == 1) {
            u uVar = (u) b.a(parcel, u.CREATOR);
            b.c(parcel);
            e(uVar);
        } else {
            if (i3 != 2) {
                return false;
            }
            b();
        }
        return true;
    }
}
