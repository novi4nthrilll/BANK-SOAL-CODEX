package O0;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1319b;

    public x(com.google.android.gms.common.internal.a aVar, int i3) {
        this.f1319b = aVar;
        this.f1318a = i3;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.common.internal.a aVar = this.f1319b;
        if (iBinder == null) {
            com.google.android.gms.common.internal.a.w(aVar);
            return;
        }
        synchronized (aVar.f2717g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f1319b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.f2718h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t)) ? new t(iBinder) : (t) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f1319b;
        int i3 = this.f1318a;
        aVar3.getClass();
        z zVar = new z(aVar3, 0);
        v vVar = aVar3.e;
        vVar.sendMessage(vVar.obtainMessage(7, i3, -1, zVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f1319b.f2717g) {
            aVar = this.f1319b;
            aVar.f2718h = null;
        }
        int i3 = this.f1318a;
        v vVar = aVar.e;
        vVar.sendMessage(vVar.obtainMessage(6, i3, 1));
    }
}
