package p016e1;

import M.k;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0516s;

/* JADX INFO: renamed from: e1.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0618j0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4221a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4221a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int iM = AbstractC0516s.m(parcel);
                PointF[] pointFArr = null;
                int i3 = 0;
                while (parcel.dataPosition() < iM) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 2) {
                        pointFArr = (PointF[]) AbstractC0516s.c(parcel, i4, PointF.CREATOR);
                    } else if (c3 != 3) {
                        AbstractC0516s.l(parcel, i4);
                    } else {
                        i3 = AbstractC0516s.i(parcel, i4);
                    }
                }
                AbstractC0516s.e(parcel, iM);
                return new M(pointFArr, i3);
            case 1:
                int iM2 = AbstractC0516s.m(parcel);
                C0717z4[] c0717z4Arr = null;
                M[] mArr = null;
                int i5 = 0;
                int i6 = 0;
                float fG = 0.0f;
                float fG2 = 0.0f;
                float fG3 = 0.0f;
                float fG4 = 0.0f;
                float fG5 = Float.MAX_VALUE;
                float fG6 = Float.MAX_VALUE;
                float fG7 = Float.MAX_VALUE;
                float fG8 = 0.0f;
                float fG9 = 0.0f;
                float fG10 = 0.0f;
                float fG11 = -1.0f;
                while (parcel.dataPosition() < iM2) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            i5 = AbstractC0516s.i(parcel, i7);
                            break;
                        case 2:
                            i6 = AbstractC0516s.i(parcel, i7);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            fG = AbstractC0516s.g(parcel, i7);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            fG2 = AbstractC0516s.g(parcel, i7);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            fG3 = AbstractC0516s.g(parcel, i7);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            fG4 = AbstractC0516s.g(parcel, i7);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            fG5 = AbstractC0516s.g(parcel, i7);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            fG6 = AbstractC0516s.g(parcel, i7);
                            break;
                        case '\t':
                            c0717z4Arr = (C0717z4[]) AbstractC0516s.c(parcel, i7, C0717z4.CREATOR);
                            break;
                        case '\n':
                            fG8 = AbstractC0516s.g(parcel, i7);
                            break;
                        case 11:
                            fG9 = AbstractC0516s.g(parcel, i7);
                            break;
                        case '\f':
                            fG10 = AbstractC0516s.g(parcel, i7);
                            break;
                        case '\r':
                            mArr = (M[]) AbstractC0516s.c(parcel, i7, M.CREATOR);
                            break;
                        case 14:
                            fG7 = AbstractC0516s.g(parcel, i7);
                            break;
                        case 15:
                            fG11 = AbstractC0516s.g(parcel, i7);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i7);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM2);
                return new K0(i5, i6, fG, fG2, fG3, fG4, fG5, fG6, fG7, c0717z4Arr, fG8, fG9, fG10, mArr, fG11);
            case 2:
                int iM3 = AbstractC0516s.m(parcel);
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                boolean zF = false;
                boolean zF2 = false;
                float fG12 = -1.0f;
                while (parcel.dataPosition() < iM3) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 2:
                            i8 = AbstractC0516s.i(parcel, i11);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            i9 = AbstractC0516s.i(parcel, i11);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            i10 = AbstractC0516s.i(parcel, i11);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            zF = AbstractC0516s.f(parcel, i11);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            zF2 = AbstractC0516s.f(parcel, i11);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            fG12 = AbstractC0516s.g(parcel, i11);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i11);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM3);
                return new L1(i8, i9, i10, zF, zF2, fG12);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                int iM4 = AbstractC0516s.m(parcel);
                int i12 = 0;
                int i13 = 0;
                float fG13 = 0.0f;
                float fG14 = 0.0f;
                while (parcel.dataPosition() < iM4) {
                    int i14 = parcel.readInt();
                    char c4 = (char) i14;
                    if (c4 == 1) {
                        i12 = AbstractC0516s.i(parcel, i14);
                    } else if (c4 == 2) {
                        fG13 = AbstractC0516s.g(parcel, i14);
                    } else if (c4 == 3) {
                        fG14 = AbstractC0516s.g(parcel, i14);
                    } else if (c4 != 4) {
                        AbstractC0516s.l(parcel, i14);
                    } else {
                        i13 = AbstractC0516s.i(parcel, i14);
                    }
                }
                AbstractC0516s.e(parcel, iM4);
                return new C0717z4(i12, fG13, fG14, i13);
            case k.LONG_FIELD_NUMBER /* 4 */:
                int iM5 = AbstractC0516s.m(parcel);
                int i15 = 0;
                ArrayList arrayListD = null;
                while (parcel.dataPosition() < iM5) {
                    int i16 = parcel.readInt();
                    char c5 = (char) i16;
                    if (c5 == 1) {
                        i15 = AbstractC0516s.i(parcel, i16);
                    } else if (c5 != 2) {
                        AbstractC0516s.l(parcel, i16);
                    } else {
                        arrayListD = AbstractC0516s.d(parcel, i16, PointF.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM5);
                return new V4(i15, arrayListD);
            case k.STRING_FIELD_NUMBER /* 5 */:
                int iM6 = AbstractC0516s.m(parcel);
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean zF3 = false;
                float fG15 = 0.0f;
                while (parcel.dataPosition() < iM6) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            i17 = AbstractC0516s.i(parcel, i21);
                            break;
                        case 2:
                            i18 = AbstractC0516s.i(parcel, i21);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            i19 = AbstractC0516s.i(parcel, i21);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            i20 = AbstractC0516s.i(parcel, i21);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            zF3 = AbstractC0516s.f(parcel, i21);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            fG15 = AbstractC0516s.g(parcel, i21);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i21);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM6);
                return new W4(i17, i18, i19, i20, zF3, fG15);
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                int iM7 = AbstractC0516s.m(parcel);
                Rect rect = null;
                ArrayList arrayListD2 = null;
                ArrayList arrayListD3 = null;
                int i22 = 0;
                float fG16 = 0.0f;
                float fG17 = 0.0f;
                float fG18 = 0.0f;
                float fG19 = 0.0f;
                float fG20 = 0.0f;
                float fG21 = 0.0f;
                float fG22 = 0.0f;
                while (parcel.dataPosition() < iM7) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            i22 = AbstractC0516s.i(parcel, i23);
                            break;
                        case 2:
                            rect = (Rect) AbstractC0516s.a(parcel, i23, Rect.CREATOR);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            fG16 = AbstractC0516s.g(parcel, i23);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            fG17 = AbstractC0516s.g(parcel, i23);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            fG18 = AbstractC0516s.g(parcel, i23);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            fG19 = AbstractC0516s.g(parcel, i23);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            fG20 = AbstractC0516s.g(parcel, i23);
                            break;
                        case k.BYTES_FIELD_NUMBER /* 8 */:
                            fG21 = AbstractC0516s.g(parcel, i23);
                            break;
                        case '\t':
                            fG22 = AbstractC0516s.g(parcel, i23);
                            break;
                        case '\n':
                            arrayListD2 = AbstractC0516s.d(parcel, i23, c5.CREATOR);
                            break;
                        case 11:
                            arrayListD3 = AbstractC0516s.d(parcel, i23, V4.CREATOR);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i23);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM7);
                return new X4(i22, rect, fG16, fG17, fG18, fG19, fG20, fG21, fG22, arrayListD2, arrayListD3);
            default:
                int iM8 = AbstractC0516s.m(parcel);
                int i24 = 0;
                PointF pointF = null;
                while (parcel.dataPosition() < iM8) {
                    int i25 = parcel.readInt();
                    char c6 = (char) i25;
                    if (c6 == 1) {
                        i24 = AbstractC0516s.i(parcel, i25);
                    } else if (c6 != 2) {
                        AbstractC0516s.l(parcel, i25);
                    } else {
                        pointF = (PointF) AbstractC0516s.a(parcel, i25, PointF.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM8);
                return new c5(i24, pointF);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f4221a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new M[i3];
            case 1:
                return new K0[i3];
            case 2:
                return new L1[i3];
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0717z4[i3];
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new V4[i3];
            case k.STRING_FIELD_NUMBER /* 5 */:
                return new W4[i3];
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new X4[i3];
            default:
                return new c5[i3];
        }
    }
}
