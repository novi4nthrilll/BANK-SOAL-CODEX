package O0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class t implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IBinder f1311b;

    public t(IBinder iBinder) {
        this.f1311b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f1311b;
    }

    public final void d(w wVar, C0091e c0091e) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(wVar);
            parcelObtain.writeInt(1);
            G.i.a(c0091e, parcelObtain, 0);
            this.f1311b.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
