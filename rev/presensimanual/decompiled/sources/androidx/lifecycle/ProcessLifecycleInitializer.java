package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements p001a0.b {
    @Override // p001a0.b
    public final List a() {
        return p059r2.l.f5624d;
    }

    @Override // p001a0.b
    public final Object b(Context context) {
        B2.h.e(context, "context");
        p001a0.a aVarC = p001a0.a.c(context);
        B2.h.d(aVarC, "getInstance(context)");
        if (!aVarC.f1956b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!n.f2390a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            B2.h.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new m());
        }
        z zVar = z.f2408l;
        zVar.getClass();
        zVar.f2412h = new Handler();
        zVar.f2413i.e(j.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        B2.h.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new x(zVar));
        return zVar;
    }
}
