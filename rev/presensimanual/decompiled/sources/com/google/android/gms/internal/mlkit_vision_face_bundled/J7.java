package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0516s;

/* JADX INFO: loaded from: classes.dex */
public final class J7 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2828a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2828a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int iM = AbstractC0516s.m(parcel);
                long j3 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < iM) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        i3 = AbstractC0516s.i(parcel, i7);
                    } else if (c3 == 2) {
                        i4 = AbstractC0516s.i(parcel, i7);
                    } else if (c3 == 3) {
                        i5 = AbstractC0516s.i(parcel, i7);
                    } else if (c3 == 4) {
                        i6 = AbstractC0516s.i(parcel, i7);
                    } else if (c3 != 5) {
                        AbstractC0516s.l(parcel, i7);
                    } else {
                        j3 = AbstractC0516s.j(parcel, i7);
                    }
                }
                AbstractC0516s.e(parcel, iM);
                return new I7(i3, i4, i5, i6, j3);
            case 1:
                int iM2 = AbstractC0516s.m(parcel);
                ArrayList arrayListD = null;
                int i8 = 0;
                while (parcel.dataPosition() < iM2) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        i8 = AbstractC0516s.i(parcel, i9);
                    } else if (c4 != 2) {
                        AbstractC0516s.l(parcel, i9);
                    } else {
                        arrayListD = AbstractC0516s.d(parcel, i9, PointF.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM2);
                return new K7(i8, arrayListD);
            case 2:
                int iM3 = AbstractC0516s.m(parcel);
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean zF = false;
                float fG = 0.0f;
                while (parcel.dataPosition() < iM3) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            i10 = AbstractC0516s.i(parcel, i14);
                            break;
                        case 2:
                            i11 = AbstractC0516s.i(parcel, i14);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            i12 = AbstractC0516s.i(parcel, i14);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            i13 = AbstractC0516s.i(parcel, i14);
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            zF = AbstractC0516s.f(parcel, i14);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            fG = AbstractC0516s.g(parcel, i14);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i14);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM3);
                return new L7(i10, i11, i12, i13, zF, fG);
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                int iM4 = AbstractC0516s.m(parcel);
                Rect rect = null;
                ArrayList arrayListD2 = null;
                ArrayList arrayListD3 = null;
                int i15 = 0;
                float fG2 = 0.0f;
                float fG3 = 0.0f;
                float fG4 = 0.0f;
                float fG5 = 0.0f;
                float fG6 = 0.0f;
                float fG7 = 0.0f;
                float fG8 = 0.0f;
                while (parcel.dataPosition() < iM4) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            i15 = AbstractC0516s.i(parcel, i16);
                            break;
                        case 2:
                            rect = (Rect) AbstractC0516s.a(parcel, i16, Rect.CREATOR);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            fG2 = AbstractC0516s.g(parcel, i16);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            fG3 = AbstractC0516s.g(parcel, i16);
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            fG4 = AbstractC0516s.g(parcel, i16);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            fG5 = AbstractC0516s.g(parcel, i16);
                            break;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            fG6 = AbstractC0516s.g(parcel, i16);
                            break;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            fG7 = AbstractC0516s.g(parcel, i16);
                            break;
                        case '\t':
                            fG8 = AbstractC0516s.g(parcel, i16);
                            break;
                        case '\n':
                            arrayListD2 = AbstractC0516s.d(parcel, i16, T7.CREATOR);
                            break;
                        case 11:
                            arrayListD3 = AbstractC0516s.d(parcel, i16, K7.CREATOR);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i16);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM4);
                return new M7(i15, rect, fG2, fG3, fG4, fG5, fG6, fG7, fG8, arrayListD2, arrayListD3);
            default:
                int iM5 = AbstractC0516s.m(parcel);
                PointF pointF = null;
                int i17 = 0;
                while (parcel.dataPosition() < iM5) {
                    int i18 = parcel.readInt();
                    char c5 = (char) i18;
                    if (c5 == 1) {
                        i17 = AbstractC0516s.i(parcel, i18);
                    } else if (c5 != 2) {
                        AbstractC0516s.l(parcel, i18);
                    } else {
                        pointF = (PointF) AbstractC0516s.a(parcel, i18, PointF.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM5);
                return new T7(i17, pointF);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f2828a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new I7[i3];
            case 1:
                return new K7[i3];
            case 2:
                return new L7[i3];
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new M7[i3];
            default:
                return new T7[i3];
        }
    }
}
