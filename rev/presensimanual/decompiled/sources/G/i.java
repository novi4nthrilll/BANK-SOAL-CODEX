package G;

import O0.A;
import O0.C0089c;
import O0.C0090d;
import O0.C0091e;
import O0.q;
import Y.C0117l;
import Y.H;
import Y.I;
import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p006b1.u;
import p013d1.AbstractC0516s;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308a;

    public /* synthetic */ i(int i3) {
        this.f308a = i3;
    }

    public static void a(C0091e c0091e, Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        int i4 = c0091e.f1256a;
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(i4);
        AbstractC0522t.h(parcel, 2, 4);
        parcel.writeInt(c0091e.f1257b);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(c0091e.f1258c);
        AbstractC0522t.c(parcel, 4, c0091e.f1259d);
        AbstractC0522t.a(parcel, 5, c0091e.e);
        AbstractC0522t.d(parcel, 6, c0091e.f1260f, i3);
        Bundle bundle = c0091e.f1261g;
        if (bundle != null) {
            int iF2 = AbstractC0522t.f(parcel, 7);
            parcel.writeBundle(bundle);
            AbstractC0522t.g(parcel, iF2);
        }
        AbstractC0522t.b(parcel, 8, c0091e.f1262h, i3);
        AbstractC0522t.d(parcel, 10, c0091e.f1263i, i3);
        AbstractC0522t.d(parcel, 11, c0091e.f1264j, i3);
        AbstractC0522t.h(parcel, 12, 4);
        parcel.writeInt(c0091e.f1265k ? 1 : 0);
        AbstractC0522t.h(parcel, 13, 4);
        parcel.writeInt(c0091e.f1266l);
        boolean z2 = c0091e.f1267m;
        AbstractC0522t.h(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC0522t.c(parcel, 15, c0091e.f1268n);
        AbstractC0522t.g(parcel, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f308a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                j jVar = new j(parcel);
                jVar.f309a = parcel.readInt();
                return jVar;
            case 1:
                int iM = AbstractC0516s.m(parcel);
                String strB = null;
                String strB2 = null;
                String strB3 = null;
                String strB4 = null;
                Uri uri = null;
                String strB5 = null;
                String strB6 = null;
                ArrayList arrayListD = null;
                String strB7 = null;
                String strB8 = null;
                long j3 = 0;
                int i3 = 0;
                while (parcel.dataPosition() < iM) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            i3 = AbstractC0516s.i(parcel, i4);
                            break;
                        case 2:
                            strB = AbstractC0516s.b(parcel, i4);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            strB2 = AbstractC0516s.b(parcel, i4);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            strB3 = AbstractC0516s.b(parcel, i4);
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            strB4 = AbstractC0516s.b(parcel, i4);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) AbstractC0516s.a(parcel, i4, Uri.CREATOR);
                            break;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            strB5 = AbstractC0516s.b(parcel, i4);
                            break;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            j3 = AbstractC0516s.j(parcel, i4);
                            break;
                        case '\t':
                            strB6 = AbstractC0516s.b(parcel, i4);
                            break;
                        case '\n':
                            arrayListD = AbstractC0516s.d(parcel, i4, Scope.CREATOR);
                            break;
                        case 11:
                            strB7 = AbstractC0516s.b(parcel, i4);
                            break;
                        case '\f':
                            strB8 = AbstractC0516s.b(parcel, i4);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i4);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM);
                return new GoogleSignInAccount(i3, strB, strB2, strB3, strB4, uri, strB5, j3, strB6, arrayListD, strB7, strB8);
            case 2:
                int iM2 = AbstractC0516s.m(parcel);
                PendingIntent pendingIntent = null;
                String strB9 = null;
                int i5 = 0;
                int i6 = 0;
                while (parcel.dataPosition() < iM2) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        i5 = AbstractC0516s.i(parcel, i7);
                    } else if (c3 == 2) {
                        i6 = AbstractC0516s.i(parcel, i7);
                    } else if (c3 == 3) {
                        pendingIntent = (PendingIntent) AbstractC0516s.a(parcel, i7, PendingIntent.CREATOR);
                    } else if (c3 != 4) {
                        AbstractC0516s.l(parcel, i7);
                    } else {
                        strB9 = AbstractC0516s.b(parcel, i7);
                    }
                }
                AbstractC0516s.e(parcel, iM2);
                return new L0.a(i5, i6, pendingIntent, strB9);
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                int iM3 = AbstractC0516s.m(parcel);
                long j4 = -1;
                int i8 = 0;
                String strB10 = null;
                while (parcel.dataPosition() < iM3) {
                    int i9 = parcel.readInt();
                    char c4 = (char) i9;
                    if (c4 == 1) {
                        strB10 = AbstractC0516s.b(parcel, i9);
                    } else if (c4 == 2) {
                        i8 = AbstractC0516s.i(parcel, i9);
                    } else if (c4 != 3) {
                        AbstractC0516s.l(parcel, i9);
                    } else {
                        j4 = AbstractC0516s.j(parcel, i9);
                    }
                }
                AbstractC0516s.e(parcel, iM3);
                return new L0.c(j4, strB10, i8);
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                int iM4 = AbstractC0516s.m(parcel);
                String strB11 = null;
                int i10 = 0;
                while (parcel.dataPosition() < iM4) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        i10 = AbstractC0516s.i(parcel, i11);
                    } else if (c5 != 2) {
                        AbstractC0516s.l(parcel, i11);
                    } else {
                        strB11 = AbstractC0516s.b(parcel, i11);
                    }
                }
                AbstractC0516s.e(parcel, iM4);
                return new Scope(strB11, i10);
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                int iM5 = AbstractC0516s.m(parcel);
                String strB12 = null;
                PendingIntent pendingIntent2 = null;
                L0.a aVar = null;
                int i12 = 0;
                while (parcel.dataPosition() < iM5) {
                    int i13 = parcel.readInt();
                    char c6 = (char) i13;
                    if (c6 == 1) {
                        i12 = AbstractC0516s.i(parcel, i13);
                    } else if (c6 == 2) {
                        strB12 = AbstractC0516s.b(parcel, i13);
                    } else if (c6 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC0516s.a(parcel, i13, PendingIntent.CREATOR);
                    } else if (c6 != 4) {
                        AbstractC0516s.l(parcel, i13);
                    } else {
                        aVar = (L0.a) AbstractC0516s.a(parcel, i13, L0.a.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM5);
                return new Status(i12, strB12, pendingIntent2, aVar);
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                int iM6 = AbstractC0516s.m(parcel);
                String strB13 = null;
                int i14 = 0;
                while (parcel.dataPosition() < iM6) {
                    int i15 = parcel.readInt();
                    char c7 = (char) i15;
                    if (c7 == 1) {
                        i14 = AbstractC0516s.i(parcel, i15);
                    } else if (c7 != 2) {
                        AbstractC0516s.l(parcel, i15);
                    } else {
                        strB13 = AbstractC0516s.b(parcel, i15);
                    }
                }
                AbstractC0516s.e(parcel, iM6);
                return new C0089c(strB13, i14);
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                int iM7 = AbstractC0516s.m(parcel);
                ArrayList arrayListD2 = null;
                int i16 = 0;
                while (parcel.dataPosition() < iM7) {
                    int i17 = parcel.readInt();
                    char c8 = (char) i17;
                    if (c8 == 1) {
                        i16 = AbstractC0516s.i(parcel, i17);
                    } else if (c8 != 2) {
                        AbstractC0516s.l(parcel, i17);
                    } else {
                        arrayListD2 = AbstractC0516s.d(parcel, i17, O0.i.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM7);
                return new O0.l(i16, arrayListD2);
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                int iM8 = AbstractC0516s.m(parcel);
                String strB14 = null;
                String strB15 = null;
                long j5 = 0;
                long j6 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = -1;
                while (parcel.dataPosition() < iM8) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            i18 = AbstractC0516s.i(parcel, i23);
                            break;
                        case 2:
                            i19 = AbstractC0516s.i(parcel, i23);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            i20 = AbstractC0516s.i(parcel, i23);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            j5 = AbstractC0516s.j(parcel, i23);
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            j6 = AbstractC0516s.j(parcel, i23);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            strB14 = AbstractC0516s.b(parcel, i23);
                            break;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            strB15 = AbstractC0516s.b(parcel, i23);
                            break;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            i21 = AbstractC0516s.i(parcel, i23);
                            break;
                        case '\t':
                            i22 = AbstractC0516s.i(parcel, i23);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i23);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM8);
                return new O0.i(i18, i19, i20, j5, j6, strB14, strB15, i21, i22);
            case 9:
                int iM9 = AbstractC0516s.m(parcel);
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int i24 = 0;
                int i25 = 0;
                while (parcel.dataPosition() < iM9) {
                    int i26 = parcel.readInt();
                    char c9 = (char) i26;
                    if (c9 == 1) {
                        i24 = AbstractC0516s.i(parcel, i26);
                    } else if (c9 == 2) {
                        account = (Account) AbstractC0516s.a(parcel, i26, Account.CREATOR);
                    } else if (c9 == 3) {
                        i25 = AbstractC0516s.i(parcel, i26);
                    } else if (c9 != 4) {
                        AbstractC0516s.l(parcel, i26);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC0516s.a(parcel, i26, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM9);
                return new O0.p(i24, account, i25, googleSignInAccount);
            case 10:
                int iM10 = AbstractC0516s.m(parcel);
                IBinder iBinderH = null;
                L0.a aVar2 = null;
                int i27 = 0;
                boolean zF = false;
                boolean zF2 = false;
                while (parcel.dataPosition() < iM10) {
                    int i28 = parcel.readInt();
                    char c10 = (char) i28;
                    if (c10 == 1) {
                        i27 = AbstractC0516s.i(parcel, i28);
                    } else if (c10 == 2) {
                        iBinderH = AbstractC0516s.h(parcel, i28);
                    } else if (c10 == 3) {
                        aVar2 = (L0.a) AbstractC0516s.a(parcel, i28, L0.a.CREATOR);
                    } else if (c10 == 4) {
                        zF = AbstractC0516s.f(parcel, i28);
                    } else if (c10 != 5) {
                        AbstractC0516s.l(parcel, i28);
                    } else {
                        zF2 = AbstractC0516s.f(parcel, i28);
                    }
                }
                AbstractC0516s.e(parcel, iM10);
                return new q(i27, iBinderH, aVar2, zF, zF2);
            case 11:
                int iM11 = AbstractC0516s.m(parcel);
                int i29 = 0;
                boolean zF3 = false;
                boolean zF4 = false;
                int i30 = 0;
                int i31 = 0;
                while (parcel.dataPosition() < iM11) {
                    int i32 = parcel.readInt();
                    char c11 = (char) i32;
                    if (c11 == 1) {
                        i29 = AbstractC0516s.i(parcel, i32);
                    } else if (c11 == 2) {
                        zF3 = AbstractC0516s.f(parcel, i32);
                    } else if (c11 == 3) {
                        zF4 = AbstractC0516s.f(parcel, i32);
                    } else if (c11 == 4) {
                        i30 = AbstractC0516s.i(parcel, i32);
                    } else if (c11 != 5) {
                        AbstractC0516s.l(parcel, i32);
                    } else {
                        i31 = AbstractC0516s.i(parcel, i32);
                    }
                }
                AbstractC0516s.e(parcel, iM11);
                return new O0.k(i29, zF3, zF4, i30, i31);
            case 12:
                int iM12 = AbstractC0516s.m(parcel);
                int i33 = 0;
                Bundle bundle = null;
                L0.c[] cVarArr = null;
                C0090d c0090d = null;
                while (parcel.dataPosition() < iM12) {
                    int i34 = parcel.readInt();
                    char c12 = (char) i34;
                    if (c12 == 1) {
                        int iK = AbstractC0516s.k(parcel, i34);
                        int iDataPosition = parcel.dataPosition();
                        if (iK == 0) {
                            bundle = null;
                        } else {
                            Bundle bundle2 = parcel.readBundle();
                            parcel.setDataPosition(iDataPosition + iK);
                            bundle = bundle2;
                        }
                    } else if (c12 == 2) {
                        cVarArr = (L0.c[]) AbstractC0516s.c(parcel, i34, L0.c.CREATOR);
                    } else if (c12 == 3) {
                        i33 = AbstractC0516s.i(parcel, i34);
                    } else if (c12 != 4) {
                        AbstractC0516s.l(parcel, i34);
                    } else {
                        c0090d = (C0090d) AbstractC0516s.a(parcel, i34, C0090d.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM12);
                A a3 = new A();
                a3.f1223a = bundle;
                a3.f1224b = cVarArr;
                a3.f1225c = i33;
                a3.f1226d = c0090d;
                return a3;
            case 13:
                int iM13 = AbstractC0516s.m(parcel);
                O0.k kVar = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zF5 = false;
                boolean zF6 = false;
                int i35 = 0;
                while (parcel.dataPosition() < iM13) {
                    int i36 = parcel.readInt();
                    switch ((char) i36) {
                        case 1:
                            kVar = (O0.k) AbstractC0516s.a(parcel, i36, O0.k.CREATOR);
                            break;
                        case 2:
                            zF5 = AbstractC0516s.f(parcel, i36);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            zF6 = AbstractC0516s.f(parcel, i36);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            int iK2 = AbstractC0516s.k(parcel, i36);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iK2 != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iK2);
                            } else {
                                iArrCreateIntArray = null;
                            }
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            i35 = AbstractC0516s.i(parcel, i36);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            int iK3 = AbstractC0516s.k(parcel, i36);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iK3 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition3 + iK3);
                            } else {
                                iArrCreateIntArray2 = null;
                            }
                            break;
                        default:
                            AbstractC0516s.l(parcel, i36);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM13);
                return new C0090d(kVar, zF5, zF6, iArrCreateIntArray, i35, iArrCreateIntArray2);
            case 14:
                int iM14 = AbstractC0516s.m(parcel);
                Scope[] scopeArr = C0091e.f1254o;
                Bundle bundle3 = new Bundle();
                L0.c[] cVarArr2 = C0091e.f1255p;
                L0.c[] cVarArr3 = cVarArr2;
                String strB16 = null;
                IBinder iBinderH2 = null;
                Account account2 = null;
                String strB17 = null;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                boolean zF7 = false;
                int i40 = 0;
                boolean zF8 = false;
                while (parcel.dataPosition() < iM14) {
                    int i41 = parcel.readInt();
                    switch ((char) i41) {
                        case 1:
                            i37 = AbstractC0516s.i(parcel, i41);
                            break;
                        case 2:
                            i38 = AbstractC0516s.i(parcel, i41);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            i39 = AbstractC0516s.i(parcel, i41);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            strB16 = AbstractC0516s.b(parcel, i41);
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            iBinderH2 = AbstractC0516s.h(parcel, i41);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            scopeArr = (Scope[]) AbstractC0516s.c(parcel, i41, Scope.CREATOR);
                            break;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            int iK4 = AbstractC0516s.k(parcel, i41);
                            int iDataPosition4 = parcel.dataPosition();
                            if (iK4 != 0) {
                                Bundle bundle4 = parcel.readBundle();
                                parcel.setDataPosition(iDataPosition4 + iK4);
                                bundle3 = bundle4;
                            } else {
                                bundle3 = null;
                            }
                            break;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            account2 = (Account) AbstractC0516s.a(parcel, i41, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC0516s.l(parcel, i41);
                            break;
                        case '\n':
                            cVarArr2 = (L0.c[]) AbstractC0516s.c(parcel, i41, L0.c.CREATOR);
                            break;
                        case 11:
                            cVarArr3 = (L0.c[]) AbstractC0516s.c(parcel, i41, L0.c.CREATOR);
                            break;
                        case '\f':
                            zF7 = AbstractC0516s.f(parcel, i41);
                            break;
                        case '\r':
                            i40 = AbstractC0516s.i(parcel, i41);
                            break;
                        case 14:
                            zF8 = AbstractC0516s.f(parcel, i41);
                            break;
                        case 15:
                            strB17 = AbstractC0516s.b(parcel, i41);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM14);
                return new C0091e(i37, i38, i39, strB16, iBinderH2, scopeArr, bundle3, account2, cVarArr2, cVarArr3, zF7, i40, zF8, strB17);
            case 15:
                int iM15 = AbstractC0516s.m(parcel);
                boolean zF9 = false;
                int i42 = 0;
                while (parcel.dataPosition() < iM15) {
                    int i43 = parcel.readInt();
                    char c13 = (char) i43;
                    if (c13 == 1) {
                        zF9 = AbstractC0516s.f(parcel, i43);
                    } else if (c13 != 2) {
                        AbstractC0516s.l(parcel, i43);
                    } else {
                        i42 = AbstractC0516s.i(parcel, i43);
                    }
                }
                AbstractC0516s.e(parcel, iM15);
                return new R0.a(i42, zF9);
            case 16:
                int iM16 = AbstractC0516s.m(parcel);
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < iM16) {
                    int i44 = parcel.readInt();
                    if (((char) i44) != 1) {
                        AbstractC0516s.l(parcel, i44);
                    } else {
                        pendingIntent3 = (PendingIntent) AbstractC0516s.a(parcel, i44, PendingIntent.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM16);
                return new R0.b(pendingIntent3);
            case 17:
                int iM17 = AbstractC0516s.m(parcel);
                int i45 = 0;
                boolean zF10 = false;
                while (parcel.dataPosition() < iM17) {
                    int i46 = parcel.readInt();
                    char c14 = (char) i46;
                    if (c14 == 1) {
                        i45 = AbstractC0516s.i(parcel, i46);
                    } else if (c14 != 2) {
                        AbstractC0516s.l(parcel, i46);
                    } else {
                        zF10 = AbstractC0516s.f(parcel, i46);
                    }
                }
                AbstractC0516s.e(parcel, iM17);
                return new R0.c(i45, zF10);
            case 18:
                C0117l c0117l = new C0117l();
                c0117l.f1897a = parcel.readInt();
                c0117l.f1898b = parcel.readInt();
                c0117l.f1899c = parcel.readInt() == 1;
                return c0117l;
            case 19:
                H h3 = new H();
                h3.f1823a = parcel.readInt();
                h3.f1824b = parcel.readInt();
                h3.f1826d = parcel.readInt() == 1;
                int i47 = parcel.readInt();
                if (i47 > 0) {
                    int[] iArr = new int[i47];
                    h3.f1825c = iArr;
                    parcel.readIntArray(iArr);
                }
                return h3;
            case 20:
                I i48 = new I();
                i48.f1827a = parcel.readInt();
                i48.f1828b = parcel.readInt();
                int i49 = parcel.readInt();
                i48.f1829c = i49;
                if (i49 > 0) {
                    int[] iArr2 = new int[i49];
                    i48.f1830d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i50 = parcel.readInt();
                i48.e = i50;
                if (i50 > 0) {
                    int[] iArr3 = new int[i50];
                    i48.f1831f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                i48.f1833h = parcel.readInt() == 1;
                i48.f1834i = parcel.readInt() == 1;
                i48.f1835j = parcel.readInt() == 1;
                i48.f1832g = parcel.readArrayList(H.class.getClassLoader());
                return i48;
            case 21:
                int iM18 = AbstractC0516s.m(parcel);
                IBinder iBinderH3 = null;
                IBinder iBinderH4 = null;
                PendingIntent pendingIntent4 = null;
                String strB18 = null;
                int i51 = 0;
                while (parcel.dataPosition() < iM18) {
                    int i52 = parcel.readInt();
                    char c15 = (char) i52;
                    if (c15 == 1) {
                        i51 = AbstractC0516s.i(parcel, i52);
                    } else if (c15 == 2) {
                        iBinderH3 = AbstractC0516s.h(parcel, i52);
                    } else if (c15 == 3) {
                        iBinderH4 = AbstractC0516s.h(parcel, i52);
                    } else if (c15 == 4) {
                        pendingIntent4 = (PendingIntent) AbstractC0516s.a(parcel, i52, PendingIntent.CREATOR);
                    } else if (c15 != 6) {
                        AbstractC0516s.l(parcel, i52);
                    } else {
                        strB18 = AbstractC0516s.b(parcel, i52);
                    }
                }
                AbstractC0516s.e(parcel, iM18);
                return new p006b1.k(i51, iBinderH3, iBinderH4, pendingIntent4, strB18);
            case 22:
                int iM19 = AbstractC0516s.m(parcel);
                long j7 = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                ArrayList arrayListD3 = null;
                boolean zF11 = false;
                boolean zF12 = false;
                boolean zF13 = false;
                boolean zF14 = false;
                while (parcel.dataPosition() < iM19) {
                    int i53 = parcel.readInt();
                    char c16 = (char) i53;
                    if (c16 == 1) {
                        locationRequest = (LocationRequest) AbstractC0516s.a(parcel, i53, LocationRequest.CREATOR);
                    } else if (c16 == 5) {
                        arrayListD3 = AbstractC0516s.d(parcel, i53, C0089c.CREATOR);
                    } else if (c16 == '\b') {
                        zF11 = AbstractC0516s.f(parcel, i53);
                    } else if (c16 != '\t') {
                        switch (c16) {
                            case 11:
                                zF13 = AbstractC0516s.f(parcel, i53);
                                break;
                            case '\f':
                                zF14 = AbstractC0516s.f(parcel, i53);
                                break;
                            case '\r':
                                AbstractC0516s.b(parcel, i53);
                                break;
                            case 14:
                                j7 = AbstractC0516s.j(parcel, i53);
                                break;
                            default:
                                AbstractC0516s.l(parcel, i53);
                                break;
                        }
                    } else {
                        zF12 = AbstractC0516s.f(parcel, i53);
                    }
                }
                AbstractC0516s.e(parcel, iM19);
                return new p006b1.l(locationRequest, arrayListD3, zF11, zF12, zF13, zF14, j7);
            case 23:
                int iM20 = AbstractC0516s.m(parcel);
                p006b1.l lVar = null;
                IBinder iBinderH5 = null;
                IBinder iBinderH6 = null;
                PendingIntent pendingIntent5 = null;
                IBinder iBinderH7 = null;
                String strB19 = null;
                int i54 = 1;
                while (parcel.dataPosition() < iM20) {
                    int i55 = parcel.readInt();
                    switch ((char) i55) {
                        case 1:
                            i54 = AbstractC0516s.i(parcel, i55);
                            break;
                        case 2:
                            lVar = (p006b1.l) AbstractC0516s.a(parcel, i55, p006b1.l.CREATOR);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            iBinderH5 = AbstractC0516s.h(parcel, i55);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            pendingIntent5 = (PendingIntent) AbstractC0516s.a(parcel, i55, PendingIntent.CREATOR);
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            iBinderH6 = AbstractC0516s.h(parcel, i55);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            iBinderH7 = AbstractC0516s.h(parcel, i55);
                            break;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        default:
                            AbstractC0516s.l(parcel, i55);
                            break;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            strB19 = AbstractC0516s.b(parcel, i55);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM20);
                return new p006b1.m(i54, lVar, iBinderH5, iBinderH6, pendingIntent5, iBinderH7, strB19);
            case 24:
                int iM21 = AbstractC0516s.m(parcel);
                String strB20 = null;
                String strB21 = null;
                String strB22 = null;
                ArrayList arrayListD4 = null;
                p006b1.j jVar2 = null;
                int i56 = 0;
                while (parcel.dataPosition() < iM21) {
                    int i57 = parcel.readInt();
                    char c17 = (char) i57;
                    if (c17 == 1) {
                        i56 = AbstractC0516s.i(parcel, i57);
                    } else if (c17 == 3) {
                        strB20 = AbstractC0516s.b(parcel, i57);
                    } else if (c17 == 4) {
                        strB21 = AbstractC0516s.b(parcel, i57);
                    } else if (c17 == 6) {
                        strB22 = AbstractC0516s.b(parcel, i57);
                    } else if (c17 == 7) {
                        jVar2 = (p006b1.j) AbstractC0516s.a(parcel, i57, p006b1.j.CREATOR);
                    } else if (c17 != '\b') {
                        AbstractC0516s.l(parcel, i57);
                    } else {
                        arrayListD4 = AbstractC0516s.d(parcel, i57, L0.c.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM21);
                return new p006b1.j(i56, strB20, strB21, strB22, arrayListD4, jVar2);
            case 25:
                int iM22 = AbstractC0516s.m(parcel);
                Status status = null;
                while (parcel.dataPosition() < iM22) {
                    int i58 = parcel.readInt();
                    if (((char) i58) != 1) {
                        AbstractC0516s.l(parcel, i58);
                    } else {
                        status = (Status) AbstractC0516s.a(parcel, i58, Status.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM22);
                return new u(status);
            case 26:
                return new ParcelImpl(parcel);
            case 27:
                int iM23 = AbstractC0516s.m(parcel);
                p006b1.j jVar3 = null;
                long j8 = Long.MAX_VALUE;
                int i59 = 0;
                boolean zF15 = false;
                while (parcel.dataPosition() < iM23) {
                    int i60 = parcel.readInt();
                    char c18 = (char) i60;
                    if (c18 == 1) {
                        j8 = AbstractC0516s.j(parcel, i60);
                    } else if (c18 == 2) {
                        i59 = AbstractC0516s.i(parcel, i60);
                    } else if (c18 == 3) {
                        zF15 = AbstractC0516s.f(parcel, i60);
                    } else if (c18 != 5) {
                        AbstractC0516s.l(parcel, i60);
                    } else {
                        jVar3 = (p006b1.j) AbstractC0516s.a(parcel, i60, p006b1.j.CREATOR);
                    }
                }
                AbstractC0516s.e(parcel, iM23);
                return new p023g1.a(j8, i59, zF15, jVar3);
            case 28:
                int iM24 = AbstractC0516s.m(parcel);
                p023g1.i[] iVarArr = null;
                long j9 = 0;
                int i61 = 1000;
                int i62 = 1;
                int i63 = 1;
                while (parcel.dataPosition() < iM24) {
                    int i64 = parcel.readInt();
                    switch ((char) i64) {
                        case 1:
                            i62 = AbstractC0516s.i(parcel, i64);
                            break;
                        case 2:
                            i63 = AbstractC0516s.i(parcel, i64);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            j9 = AbstractC0516s.j(parcel, i64);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            i61 = AbstractC0516s.i(parcel, i64);
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            iVarArr = (p023g1.i[]) AbstractC0516s.c(parcel, i64, p023g1.i.CREATOR);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            AbstractC0516s.f(parcel, i64);
                            break;
                        default:
                            AbstractC0516s.l(parcel, i64);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM24);
                return new LocationAvailability(i61, i62, i63, j9, iVarArr);
            default:
                int iM25 = AbstractC0516s.m(parcel);
                WorkSource workSource = new WorkSource();
                p006b1.j jVar4 = null;
                long j10 = -1;
                long j11 = Long.MAX_VALUE;
                long j12 = Long.MAX_VALUE;
                long j13 = 0;
                long j14 = 600000;
                long j15 = 3600000;
                int i65 = 102;
                int i66 = Integer.MAX_VALUE;
                float fG = 0.0f;
                boolean zF16 = false;
                int i67 = 0;
                int i68 = 0;
                boolean zF17 = false;
                while (parcel.dataPosition() < iM25) {
                    int i69 = parcel.readInt();
                    switch ((char) i69) {
                        case 1:
                            i65 = AbstractC0516s.i(parcel, i69);
                            break;
                        case 2:
                            j15 = AbstractC0516s.j(parcel, i69);
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            j14 = AbstractC0516s.j(parcel, i69);
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                        case 14:
                        default:
                            AbstractC0516s.l(parcel, i69);
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            j11 = AbstractC0516s.j(parcel, i69);
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            i66 = AbstractC0516s.i(parcel, i69);
                            break;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            fG = AbstractC0516s.g(parcel, i69);
                            break;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            j13 = AbstractC0516s.j(parcel, i69);
                            break;
                        case '\t':
                            zF16 = AbstractC0516s.f(parcel, i69);
                            break;
                        case '\n':
                            j12 = AbstractC0516s.j(parcel, i69);
                            break;
                        case 11:
                            j10 = AbstractC0516s.j(parcel, i69);
                            break;
                        case '\f':
                            i67 = AbstractC0516s.i(parcel, i69);
                            break;
                        case '\r':
                            i68 = AbstractC0516s.i(parcel, i69);
                            break;
                        case 15:
                            zF17 = AbstractC0516s.f(parcel, i69);
                            break;
                        case 16:
                            workSource = (WorkSource) AbstractC0516s.a(parcel, i69, WorkSource.CREATOR);
                            break;
                        case 17:
                            jVar4 = (p006b1.j) AbstractC0516s.a(parcel, i69, p006b1.j.CREATOR);
                            break;
                    }
                }
                AbstractC0516s.e(parcel, iM25);
                return new LocationRequest(i65, j15, j14, j13, j11, j12, i66, fG, zF16, j10, i67, i68, zF17, workSource, jVar4);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f308a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new j[i3];
            case 1:
                return new GoogleSignInAccount[i3];
            case 2:
                return new L0.a[i3];
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new L0.c[i3];
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                return new Scope[i3];
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                return new Status[i3];
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0089c[i3];
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new O0.l[i3];
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                return new O0.i[i3];
            case 9:
                return new O0.p[i3];
            case 10:
                return new q[i3];
            case 11:
                return new O0.k[i3];
            case 12:
                return new A[i3];
            case 13:
                return new C0090d[i3];
            case 14:
                return new C0091e[i3];
            case 15:
                return new R0.a[i3];
            case 16:
                return new R0.b[i3];
            case 17:
                return new R0.c[i3];
            case 18:
                return new C0117l[i3];
            case 19:
                return new H[i3];
            case 20:
                return new I[i3];
            case 21:
                return new p006b1.k[i3];
            case 22:
                return new p006b1.l[i3];
            case 23:
                return new p006b1.m[i3];
            case 24:
                return new p006b1.j[i3];
            case 25:
                return new u[i3];
            case 26:
                return new ParcelImpl[i3];
            case 27:
                return new p023g1.a[i3];
            case 28:
                return new LocationAvailability[i3];
            default:
                return new LocationRequest[i3];
        }
    }
}
