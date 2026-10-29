package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, j jVar) {
        B2.h.e(activity, "activity");
        B2.h.e(jVar, "event");
        if (activity instanceof q) {
            s sVarB = ((q) activity).b();
            if (sVarB instanceof s) {
                sVarB.e(jVar);
            }
        }
    }
}
