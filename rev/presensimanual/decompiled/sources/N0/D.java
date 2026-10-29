package N0;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p030i1.c implements M0.g, M0.h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Q0.b f1043j = p026h1.b.f4515a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0.f f1045d;
    public final Q0.b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f1046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final E0.k f1047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p030i1.a f1048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f1049i;

    public D(Context context, Z0.f fVar, E0.k kVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.f1044c = context;
        this.f1045d = fVar;
        this.f1047g = kVar;
        this.f1046f = (Set) kVar.f226d;
        this.e = f1043j;
    }

    @Override // M0.g
    public final void d(int i3) {
        t tVar = this.f1049i;
        r rVar = (r) tVar.f1113f.f1077j.get(tVar.f1110b);
        if (rVar != null) {
            if (rVar.f1102j) {
                rVar.p(new L0.a(17));
            } else {
                rVar.d(i3);
            }
        }
    }

    @Override // M0.g
    public final void f() {
        GoogleSignInAccount googleSignInAccountA;
        boolean z2 = false;
        p030i1.a aVar = this.f1048h;
        aVar.getClass();
        try {
            aVar.f4595z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = aVar.f2714c;
                ReentrantLock reentrantLock = K0.a.f737c;
                O0.u.f(context);
                ReentrantLock reentrantLock2 = K0.a.f737c;
                reentrantLock2.lock();
                try {
                    if (K0.a.f738d == null) {
                        K0.a.f738d = new K0.a(context.getApplicationContext());
                    }
                    K0.a aVar2 = K0.a.f738d;
                    reentrantLock2.unlock();
                    String strA = aVar2.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        String strA2 = aVar2.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                googleSignInAccountA = GoogleSignInAccount.a(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountA = null;
                            }
                        }
                    }
                    googleSignInAccountA = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountA = null;
            }
            Integer num = aVar.f4593B;
            O0.u.f(num);
            O0.p pVar = new O0.p(2, account, num.intValue(), googleSignInAccountA);
            p030i1.d dVar = (p030i1.d) aVar.q();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(dVar.f1945d);
            int i3 = Z0.c.f1947a;
            parcelObtain.writeInt(1);
            int iF = AbstractC0522t.f(parcelObtain, 20293);
            AbstractC0522t.h(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            AbstractC0522t.b(parcelObtain, 2, pVar, 0);
            AbstractC0522t.g(parcelObtain, iF);
            Z0.c.c(parcelObtain, this);
            dVar.d(parcelObtain, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f1045d.post(new E0.e(this, new p030i1.f(1, new L0.a(8, null), null), 3, z2));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // M0.h
    public final void g(L0.a aVar) {
        this.f1049i.b(aVar);
    }
}
