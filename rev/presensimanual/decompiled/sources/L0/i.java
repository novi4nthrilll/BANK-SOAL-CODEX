package L0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Z0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f878b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f878b = dVar;
        this.f877a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i3);
            return;
        }
        int i4 = e.f871a;
        d dVar = this.f878b;
        Context context = this.f877a;
        int iC = dVar.c(context, i4);
        AtomicBoolean atomicBoolean = f.f873a;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentB = dVar.b(iC, context, "n");
            dVar.g(context, iC, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, p002a1.b.f1958a | 134217728));
        }
    }
}
