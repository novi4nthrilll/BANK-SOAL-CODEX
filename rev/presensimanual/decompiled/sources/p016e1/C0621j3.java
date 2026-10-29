package p016e1;

import X0.b;
import Z0.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: e1.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0621j3 extends a implements InterfaceC0568a4 {
    public final L2 m(b bVar, L1 l3) {
        L2 l4;
        Parcel parcelG = g();
        AbstractC0700x.a(parcelG, bVar);
        parcelG.writeInt(1);
        l3.writeToParcel(parcelG, 0);
        Parcel parcelK = k(parcelG, 1);
        IBinder strongBinder = parcelK.readStrongBinder();
        if (strongBinder == null) {
            l4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            l4 = iInterfaceQueryLocalInterface instanceof L2 ? (L2) iInterfaceQueryLocalInterface : new L2(strongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", 3);
        }
        parcelK.recycle();
        return l4;
    }
}
