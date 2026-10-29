package androidx.emoji2.text;

import O.h;
import O.i;
import O.l;
import O.q;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.s;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p001a0.a;
import p001a0.b;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // p001a0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p001a0.b
    public final Object b(Context context) {
        q qVar = new q(new l(context, 0));
        qVar.f1213b = 1;
        if (h.f1179j == null) {
            synchronized (h.f1178i) {
                try {
                    if (h.f1179j == null) {
                        h.f1179j = new h(qVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objB;
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.e) {
            try {
                objB = aVarC.f1955a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        s sVarB = ((androidx.lifecycle.q) objB).b();
        sVarB.b(new i(this, sVarB));
    }
}
