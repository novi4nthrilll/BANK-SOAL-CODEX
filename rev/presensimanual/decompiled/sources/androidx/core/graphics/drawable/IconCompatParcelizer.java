package androidx.core.graphics.drawable;

import M.k;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p012d0.a;
import p012d0.b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i3 = iconCompat.f2181a;
        if (aVar.e(1)) {
            i3 = ((b) aVar).e.readInt();
        }
        iconCompat.f2181a = i3;
        byte[] bArr = iconCompat.f2183c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).e;
            int i4 = parcel.readInt();
            if (i4 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i4];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2183c = bArr;
        iconCompat.f2184d = aVar.f(iconCompat.f2184d, 3);
        int i5 = iconCompat.e;
        if (aVar.e(4)) {
            i5 = ((b) aVar).e.readInt();
        }
        iconCompat.e = i5;
        int i6 = iconCompat.f2185f;
        if (aVar.e(5)) {
            i6 = ((b) aVar).e.readInt();
        }
        iconCompat.f2185f = i6;
        iconCompat.f2186g = (ColorStateList) aVar.f(iconCompat.f2186g, 6);
        String string = iconCompat.f2188i;
        if (aVar.e(7)) {
            string = ((b) aVar).e.readString();
        }
        iconCompat.f2188i = string;
        String string2 = iconCompat.f2189j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).e.readString();
        }
        iconCompat.f2189j = string2;
        iconCompat.f2187h = PorterDuff.Mode.valueOf(iconCompat.f2188i);
        switch (iconCompat.f2181a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_UNDEFINED /* -1 */:
                Parcelable parcelable = iconCompat.f2184d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2182b = parcelable;
                return iconCompat;
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
            default:
                return iconCompat;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f2184d;
                if (parcelable2 != null) {
                    iconCompat.f2182b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f2183c;
                    iconCompat.f2182b = bArr3;
                    iconCompat.f2181a = 3;
                    iconCompat.e = 0;
                    iconCompat.f2185f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.f2183c, Charset.forName("UTF-16"));
                iconCompat.f2182b = str;
                if (iconCompat.f2181a == 2 && iconCompat.f2189j == null) {
                    iconCompat.f2189j = str.split(":", -1)[0];
                }
                return iconCompat;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f2182b = iconCompat.f2183c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f2188i = iconCompat.f2187h.name();
        switch (iconCompat.f2181a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_UNDEFINED /* -1 */:
                iconCompat.f2184d = (Parcelable) iconCompat.f2182b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f2184d = (Parcelable) iconCompat.f2182b;
                break;
            case 2:
                iconCompat.f2183c = ((String) iconCompat.f2182b).getBytes(Charset.forName("UTF-16"));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f2183c = (byte[]) iconCompat.f2182b;
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f2183c = iconCompat.f2182b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f2181a;
        if (-1 != i3) {
            aVar.h(1);
            ((b) aVar).e.writeInt(i3);
        }
        byte[] bArr = iconCompat.f2183c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2184d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).e.writeParcelable(parcelable, 0);
        }
        int i4 = iconCompat.e;
        if (i4 != 0) {
            aVar.h(4);
            ((b) aVar).e.writeInt(i4);
        }
        int i5 = iconCompat.f2185f;
        if (i5 != 0) {
            aVar.h(5);
            ((b) aVar).e.writeInt(i5);
        }
        ColorStateList colorStateList = iconCompat.f2186g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2188i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).e.writeString(str);
        }
        String str2 = iconCompat.f2189j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).e.writeString(str2);
        }
    }
}
