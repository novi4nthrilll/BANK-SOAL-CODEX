package Z0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends Binder implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1946b;

    public b(String str, int i3) {
        this.f1946b = i3;
        switch (i3) {
            case 1:
                attachInterface(this, str);
                break;
            case 2:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i3 = this.f1946b;
        return this;
    }

    public abstract boolean k(int i3, Parcel parcel, Parcel parcel2);

    public boolean l(int i3, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean m(Parcel parcel, int i3);

    @Override // android.os.Binder
    public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        switch (this.f1946b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return k(i3, parcel, parcel2);
            case 1:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return l(i3, parcel, parcel2);
            case 2:
                if (i3 <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i3, parcel, parcel2, i4)) {
                    return true;
                }
                return m(parcel, i3);
            default:
                return super.onTransact(i3, parcel, parcel2, i4);
        }
    }
}
