package I2;

import android.os.Parcel;

/* JADX INFO: renamed from: I2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0045p extends RuntimeException {
    public C0045p(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }
}
