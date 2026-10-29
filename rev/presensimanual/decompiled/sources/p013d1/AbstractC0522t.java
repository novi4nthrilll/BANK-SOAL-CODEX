package p013d1;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: d1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0522t {
    public static void a(Parcel parcel, int i3, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iF = f(parcel, i3);
        parcel.writeStrongBinder(iBinder);
        g(parcel, iF);
    }

    public static void b(Parcel parcel, int i3, Parcelable parcelable, int i4) {
        if (parcelable == null) {
            return;
        }
        int iF = f(parcel, i3);
        parcelable.writeToParcel(parcel, i4);
        g(parcel, iF);
    }

    public static void c(Parcel parcel, int i3, String str) {
        if (str == null) {
            return;
        }
        int iF = f(parcel, i3);
        parcel.writeString(str);
        g(parcel, iF);
    }

    public static void d(Parcel parcel, int i3, Parcelable[] parcelableArr, int i4) {
        if (parcelableArr == null) {
            return;
        }
        int iF = f(parcel, i3);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i4);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        g(parcel, iF);
    }

    public static void e(Parcel parcel, int i3, List list) {
        if (list == null) {
            return;
        }
        int iF = f(parcel, i3);
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            Parcelable parcelable = (Parcelable) list.get(i4);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        g(parcel, iF);
    }

    public static int f(Parcel parcel, int i3) {
        parcel.writeInt(i3 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void g(Parcel parcel, int i3) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i3 - 4);
        parcel.writeInt(iDataPosition - i3);
        parcel.setDataPosition(iDataPosition);
    }

    public static void h(Parcel parcel, int i3, int i4) {
        parcel.writeInt(i3 | (i4 << 16));
    }
}
