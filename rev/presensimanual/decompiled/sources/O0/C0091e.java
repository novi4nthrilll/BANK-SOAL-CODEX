package O0;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: O0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0091e extends P0.a {
    public static final Parcelable.Creator<C0091e> CREATOR = new G.i(14);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope[] f1254o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final L0.c[] f1255p = new L0.c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1259d;
    public IBinder e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f1260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bundle f1261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Account f1262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public L0.c[] f1263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public L0.c[] f1264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f1265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f1268n;

    public C0091e(int i3, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, L0.c[] cVarArr, L0.c[] cVarArr2, boolean z2, int i6, boolean z3, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f1254o : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        L0.c[] cVarArr3 = f1255p;
        L0.c[] cVarArr4 = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr3 = cVarArr2 != null ? cVarArr2 : cVarArr3;
        this.f1256a = i3;
        this.f1257b = i4;
        this.f1258c = i5;
        if ("com.google.android.gms".equals(str)) {
            this.f1259d = "com.google.android.gms";
        } else {
            this.f1259d = str;
        }
        if (i3 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i7 = AbstractBinderC0087a.f1246c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface f3 = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new F(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (f3 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            F f4 = (F) f3;
                            Parcel parcelF = f4.f(f4.g(), 2);
                            Account account3 = (Account) p002a1.a.a(parcelF, Account.CREATOR);
                            parcelF.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.e = iBinder;
            account2 = account;
        }
        this.f1262h = account2;
        this.f1260f = scopeArr2;
        this.f1261g = bundle2;
        this.f1263i = cVarArr4;
        this.f1264j = cVarArr3;
        this.f1265k = z2;
        this.f1266l = i6;
        this.f1267m = z3;
        this.f1268n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        G.i.a(this, parcel, i3);
    }
}
