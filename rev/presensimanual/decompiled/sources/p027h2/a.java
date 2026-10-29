package p027h2;

import D0.b;
import M.j;
import W1.n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f4516a;

    public a(b bVar) {
        this.f4516a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b bVar = this.f4516a;
        int iB = bVar.b();
        if (!j.a(iB, bVar.e)) {
            b bVar2 = bVar.f4519b;
            ((Handler) bVar2.e).post(new n(bVar2, iB, 0));
        }
        bVar.e = iB;
    }
}
