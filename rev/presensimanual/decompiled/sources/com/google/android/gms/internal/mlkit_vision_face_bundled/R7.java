package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.BadParcelableException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class R7 extends AbstractBinderC0280n implements S7 {
    public R7() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    public static S7 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof S7 ? (S7) iInterfaceQueryLocalInterface : new P7(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractBinderC0280n
    public final boolean d(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 != 1) {
            return false;
        }
        X0.a aVarN = X0.b.n(parcel.readStrongBinder());
        Parcelable.Creator<L7> creator = L7.CREATOR;
        int i4 = I.f2812a;
        L7 l7CreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(p013d1.I.f("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
        IInterface iInterfaceNewFaceDetector = newFaceDetector(aVarN, l7CreateFromParcel);
        parcel2.writeNoException();
        if (iInterfaceNewFaceDetector == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(((AbstractBinderC0280n) iInterfaceNewFaceDetector).asBinder());
        }
        return true;
    }
}
