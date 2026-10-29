package O0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class y extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f1320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1321h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.google.android.gms.common.internal.a aVar, int i3, IBinder iBinder, Bundle bundle) {
        super(aVar, i3, bundle);
        this.f1321h = aVar;
        this.f1320g = iBinder;
    }

    @Override // O0.r
    public final void a(L0.a aVar) {
        j jVar = this.f1321h.f2725o;
        if (jVar != null) {
            ((M0.h) jVar.f1284a).g(aVar);
        }
        System.currentTimeMillis();
    }

    @Override // O0.r
    public final boolean b() {
        IBinder iBinder = this.f1320g;
        try {
            u.f(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f1321h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aVar.r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceN = aVar.n(iBinder);
            if (iInterfaceN == null || !(com.google.android.gms.common.internal.a.x(aVar, 2, 4, iInterfaceN) || com.google.android.gms.common.internal.a.x(aVar, 3, 4, iInterfaceN))) {
                return false;
            }
            aVar.f2729s = null;
            j jVar = aVar.f2724n;
            if (jVar == null) {
                return true;
            }
            ((M0.g) jVar.f1284a).f();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
