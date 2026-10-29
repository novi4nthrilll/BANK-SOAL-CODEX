package N0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class v extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f1114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.g f1115b;

    public v(A0.g gVar) {
        this.f1115b = gVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            ((E0.l) this.f1115b.f19f).getClass();
            throw null;
        }
    }
}
