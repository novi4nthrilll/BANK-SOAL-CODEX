package p013d1;

import A0.c;
import I2.C0045p;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: d1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0516s {
    public static Parcelable a(Parcel parcel, int i3, Parcelable.Creator creator) {
        int iK = k(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iK);
        return parcelable;
    }

    public static String b(Parcel parcel, int i3) {
        int iK = k(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iK);
        return string;
    }

    public static Object[] c(Parcel parcel, int i3, Parcelable.Creator creator) {
        int iK = k(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iK);
        return objArrCreateTypedArray;
    }

    public static ArrayList d(Parcel parcel, int i3, Parcelable.Creator creator) {
        int iK = k(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iK);
        return arrayListCreateTypedArrayList;
    }

    public static void e(Parcel parcel, int i3) {
        if (parcel.dataPosition() != i3) {
            throw new C0045p(I.f("Overread allowed size end=", i3), parcel);
        }
    }

    public static boolean f(Parcel parcel, int i3) {
        n(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static float g(Parcel parcel, int i3) {
        n(parcel, i3, 4);
        return parcel.readFloat();
    }

    public static IBinder h(Parcel parcel, int i3) {
        int iK = k(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iK == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iK);
        return strongBinder;
    }

    public static int i(Parcel parcel, int i3) {
        n(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long j(Parcel parcel, int i3) {
        n(parcel, i3, 8);
        return parcel.readLong();
    }

    public static int k(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    public static void l(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + k(parcel, i3));
    }

    public static int m(Parcel parcel) {
        int i3 = parcel.readInt();
        int iK = k(parcel, i3);
        char c3 = (char) i3;
        int iDataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new C0045p("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i3))), parcel);
        }
        int i4 = iK + iDataPosition;
        if (i4 < iDataPosition || i4 > parcel.dataSize()) {
            throw new C0045p(c.h("Size read is invalid start=", iDataPosition, " end=", i4), parcel);
        }
        return i4;
    }

    public static void n(Parcel parcel, int i3, int i4) {
        int iK = k(parcel, i3);
        if (iK == i4) {
            return;
        }
        String hexString = Integer.toHexString(iK);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(iK);
        sb.append(" (0x");
        throw new C0045p(I.h(sb, hexString, ")"), parcel);
    }
}
