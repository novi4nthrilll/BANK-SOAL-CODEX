package I;

import Y.A;
import android.os.Parcel;
import android.os.Parcelable;
import k.F0;
import k.U0;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f335a;

    public /* synthetic */ b(int i3) {
        this.f335a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f335a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f336b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new A(parcel, classLoader);
            case 2:
                return new F0(parcel, classLoader);
            default:
                return new U0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f335a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new c[i3];
            case 1:
                return new A[i3];
            case 2:
                return new F0[i3];
            default:
                return new U0[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f335a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (parcel.readParcelable(null) == null) {
                    return c.f336b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new A(parcel, null);
            case 2:
                return new F0(parcel, null);
            default:
                return new U0(parcel, null);
        }
    }
}
