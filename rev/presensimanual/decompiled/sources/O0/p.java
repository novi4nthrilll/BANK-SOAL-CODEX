package O0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class p extends P0.a {
    public static final Parcelable.Creator<p> CREATOR = new G.i(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f1299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f1301d;

    public p(int i3, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f1298a = i3;
        this.f1299b = account;
        this.f1300c = i4;
        this.f1301d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(this.f1298a);
        AbstractC0522t.b(parcel, 2, this.f1299b, i3);
        AbstractC0522t.h(parcel, 3, 4);
        parcel.writeInt(this.f1300c);
        AbstractC0522t.b(parcel, 4, this.f1301d, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
