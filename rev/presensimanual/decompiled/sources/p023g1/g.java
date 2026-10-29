package p023g1;

import L0.a;
import M.k;
import O0.q;
import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import java.util.ArrayList;
import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0516s;
import p030i1.b;
import p030i1.e;
import p030i1.f;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4500a;

    public /* synthetic */ g(int i3) {
        this.f4500a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f4500a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int iM = AbstractC0516s.m(parcel);
                List listD = LocationResult.f3528b;
                while (parcel.dataPosition() < iM) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        AbstractC0516s.l(parcel, i3);
                    } else {
                        listD = AbstractC0516s.d(parcel, i3, Location.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM);
                return new LocationResult(listD);
            case 1:
                int iM2 = AbstractC0516s.m(parcel);
                boolean zF = false;
                ArrayList arrayListD = null;
                boolean zF2 = false;
                while (parcel.dataPosition() < iM2) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        arrayListD = AbstractC0516s.d(parcel, i4, LocationRequest.CREATOR);
                    } else if (c3 == 2) {
                        zF = AbstractC0516s.f(parcel, i4);
                    } else if (c3 != 3) {
                        AbstractC0516s.l(parcel, i4);
                    } else {
                        zF2 = AbstractC0516s.f(parcel, i4);
                    }
                }
                AbstractC0516s.e(parcel, iM2);
                return new c(arrayListD, zF, zF2);
            case 2:
                int iM3 = AbstractC0516s.m(parcel);
                Status status = null;
                f fVar = null;
                while (parcel.dataPosition() < iM3) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        status = (Status) AbstractC0516s.a(parcel, i5, Status.CREATOR);
                    } else if (c4 != 2) {
                        AbstractC0516s.l(parcel, i5);
                    } else {
                        fVar = (f) AbstractC0516s.a(parcel, i5, f.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM3);
                return new e(status, fVar);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                int iM4 = AbstractC0516s.m(parcel);
                boolean zF3 = false;
                boolean zF4 = false;
                boolean zF5 = false;
                boolean zF6 = false;
                boolean zF7 = false;
                boolean zF8 = false;
                while (parcel.dataPosition() < iM4) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            zF3 = AbstractC0516s.f(parcel, i6);
                            break;
                        case 2:
                            zF4 = AbstractC0516s.f(parcel, i6);
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            zF5 = AbstractC0516s.f(parcel, i6);
                            break;
                        case k.LONG_FIELD_NUMBER /* 4 */:
                            zF6 = AbstractC0516s.f(parcel, i6);
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            zF7 = AbstractC0516s.f(parcel, i6);
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            zF8 = AbstractC0516s.f(parcel, i6);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i6);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM4);
                return new f(zF3, zF4, zF5, zF6, zF7, zF8);
            case k.LONG_FIELD_NUMBER /* 4 */:
                int iM5 = AbstractC0516s.m(parcel);
                long j3 = -1;
                long j4 = -1;
                int i7 = 1;
                int i8 = 1;
                while (parcel.dataPosition() < iM5) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        i7 = AbstractC0516s.i(parcel, i9);
                    } else if (c5 == 2) {
                        i8 = AbstractC0516s.i(parcel, i9);
                    } else if (c5 == 3) {
                        j3 = AbstractC0516s.j(parcel, i9);
                    } else if (c5 != 4) {
                        AbstractC0516s.l(parcel, i9);
                    } else {
                        j4 = AbstractC0516s.j(parcel, i9);
                    }
                }
                AbstractC0516s.e(parcel, iM5);
                return new i(i7, i8, j3, j4);
            case k.STRING_FIELD_NUMBER /* 5 */:
                int iM6 = AbstractC0516s.m(parcel);
                Intent intent = null;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < iM6) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        i10 = AbstractC0516s.i(parcel, i12);
                    } else if (c6 == 2) {
                        i11 = AbstractC0516s.i(parcel, i12);
                    } else if (c6 != 3) {
                        AbstractC0516s.l(parcel, i12);
                    } else {
                        intent = (Intent) AbstractC0516s.a(parcel, i12, Intent.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM6);
                return new b(i10, i11, intent);
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                int iM7 = AbstractC0516s.m(parcel);
                ArrayList<String> arrayList = null;
                String strB = null;
                while (parcel.dataPosition() < iM7) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        int iK = AbstractC0516s.k(parcel, i13);
                        int iDataPosition = parcel.dataPosition();
                        if (iK == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iK);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c7 != 2) {
                        AbstractC0516s.l(parcel, i13);
                    } else {
                        strB = AbstractC0516s.b(parcel, i13);
                    }
                }
                AbstractC0516s.e(parcel, iM7);
                return new e(strB, arrayList);
            default:
                int iM8 = AbstractC0516s.m(parcel);
                a aVar = null;
                q qVar = null;
                int i14 = 0;
                while (parcel.dataPosition() < iM8) {
                    int i15 = parcel.readInt();
                    char c8 = (char) i15;
                    if (c8 == 1) {
                        i14 = AbstractC0516s.i(parcel, i15);
                    } else if (c8 == 2) {
                        aVar = (a) AbstractC0516s.a(parcel, i15, a.CREATOR);
                    } else if (c8 != 3) {
                        AbstractC0516s.l(parcel, i15);
                    } else {
                        qVar = (q) AbstractC0516s.a(parcel, i15, q.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM8);
                return new f(i14, aVar, qVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f4500a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new LocationResult[i3];
            case 1:
                return new c[i3];
            case 2:
                return new e[i3];
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new f[i3];
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new i[i3];
            case k.STRING_FIELD_NUMBER /* 5 */:
                return new b[i3];
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new e[i3];
            default:
                return new f[i3];
        }
    }
}
