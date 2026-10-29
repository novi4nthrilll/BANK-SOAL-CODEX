package Z0;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinder f1944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1945d;

    public /* synthetic */ a(IBinder iBinder, String str, int i3) {
        this.f1943b = i3;
        this.f1944c = iBinder;
        this.f1945d = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f1943b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f1944c;
    }

    public void d(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f1944c.transact(i3, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel f(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f1944c.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public Parcel g() {
        switch (this.f1943b) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(this.f1945d);
                return parcelObtain;
            case 2:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(this.f1945d);
                return parcelObtain2;
            default:
                Parcel parcelObtain3 = Parcel.obtain();
                parcelObtain3.writeInterfaceToken(this.f1945d);
                return parcelObtain3;
        }
    }

    public Parcel k(Parcel parcel, int i3) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f1944c.transact(i3, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    public void l(Parcel parcel, int i3) {
        switch (this.f1943b) {
            case 2:
                Parcel parcelObtain = Parcel.obtain();
                try {
                    this.f1944c.transact(i3, parcel, parcelObtain, 0);
                    parcelObtain.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain.recycle();
                }
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    this.f1944c.transact(i3, parcel, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return;
                } finally {
                    parcel.recycle();
                    parcelObtain2.recycle();
                }
        }
    }
}
