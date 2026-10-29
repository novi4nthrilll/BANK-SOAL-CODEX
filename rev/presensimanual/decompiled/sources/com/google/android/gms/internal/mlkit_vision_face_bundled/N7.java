package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class N7 extends AbstractBinderC0280n implements O7 {
    public N7() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractBinderC0280n
    public final boolean d(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            j();
            parcel2.writeNoException();
        } else if (i3 == 2) {
            a();
            parcel2.writeNoException();
        } else {
            if (i3 != 3) {
                return false;
            }
            X0.a aVarN = X0.b.n(parcel.readStrongBinder());
            Parcelable.Creator<I7> creator = I7.CREATOR;
            int i4 = I.f2812a;
            I7 i7CreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            int iDataAvail = parcel.dataAvail();
            if (iDataAvail > 0) {
                throw new BadParcelableException(p013d1.I.f("Parcel data not fully consumed, unread size: ", iDataAvail));
            }
            ArrayList arrayListH = h(aVarN, i7CreateFromParcel);
            parcel2.writeNoException();
            parcel2.writeTypedList(arrayListH);
        }
        return true;
    }
}
