package p065t0;

import S1.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class i extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f5724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5725b;

    public i(g gVar) {
        this.f5724a = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IOException {
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean zIsProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean zIsProviderEnabled2 = locationManager.isProviderEnabled("network");
            g gVar = this.f5724a;
            if (zIsProviderEnabled || zIsProviderEnabled2) {
                int i3 = this.f5725b;
                if (i3 == 0 || i3 == 1) {
                    this.f5725b = 2;
                    gVar.b(1);
                    return;
                }
                return;
            }
            int i4 = this.f5725b;
            if (i4 == 0 || i4 == 2) {
                this.f5725b = 1;
                gVar.b(0);
            }
        }
    }
}
