package O0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class w extends Z0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.a f1316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1317d;

    public w(com.google.android.gms.common.internal.a aVar, int i3) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f1316c = aVar;
        this.f1317d = i3;
    }

    @Override // Z0.b
    public final boolean l(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            int i4 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) p002a1.a.a(parcel, Bundle.CREATOR);
            p002a1.a.b(parcel);
            u.g(this.f1316c, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar = this.f1316c;
            aVar.getClass();
            y yVar = new y(aVar, i4, strongBinder, bundle);
            v vVar = aVar.e;
            vVar.sendMessage(vVar.obtainMessage(1, this.f1317d, -1, yVar));
            this.f1316c = null;
        } else if (i3 == 2) {
            parcel.readInt();
            p002a1.a.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i3 != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            A a3 = (A) p002a1.a.a(parcel, A.CREATOR);
            p002a1.a.b(parcel);
            com.google.android.gms.common.internal.a aVar2 = this.f1316c;
            u.g(aVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            u.f(a3);
            aVar2.f2731u = a3;
            if (aVar2.v()) {
                C0090d c0090d = a3.f1226d;
                j jVarB = j.b();
                k kVar = c0090d == null ? null : c0090d.f1249a;
                synchronized (jVarB) {
                    try {
                        if (kVar == null) {
                            kVar = j.f1283c;
                        } else {
                            k kVar2 = (k) jVarB.f1284a;
                            if (kVar2 == null || kVar2.f1285a < kVar.f1285a) {
                            }
                        }
                        jVarB.f1284a = kVar;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = a3.f1223a;
            u.g(this.f1316c, "onPostInitComplete can be called only once per call to getRemoteService");
            com.google.android.gms.common.internal.a aVar3 = this.f1316c;
            aVar3.getClass();
            y yVar2 = new y(aVar3, i5, strongBinder2, bundle2);
            v vVar2 = aVar3.e;
            vVar2.sendMessage(vVar2.obtainMessage(1, this.f1317d, -1, yVar2));
            this.f1316c = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
