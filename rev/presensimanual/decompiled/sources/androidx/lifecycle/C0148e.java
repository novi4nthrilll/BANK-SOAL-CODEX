package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0148e implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2382d = 0;
    public final p e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2383f;

    public C0148e(DefaultLifecycleObserver defaultLifecycleObserver, o oVar) {
        this.e = defaultLifecycleObserver;
        this.f2383f = oVar;
    }

    @Override // androidx.lifecycle.o
    public final void f(q qVar, j jVar) {
        switch (this.f2382d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int i3 = AbstractC0147d.f2381a[jVar.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.e;
                switch (i3) {
                    case 1:
                        defaultLifecycleObserver.c(qVar);
                        break;
                    case 2:
                        defaultLifecycleObserver.i(qVar);
                        break;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        defaultLifecycleObserver.a();
                        break;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        defaultLifecycleObserver.g(qVar);
                        break;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        defaultLifecycleObserver.h(qVar);
                        break;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        defaultLifecycleObserver.b(qVar);
                        break;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                o oVar = (o) this.f2383f;
                if (oVar != null) {
                    oVar.f(qVar, jVar);
                    return;
                }
                return;
            default:
                HashMap map = ((C0144a) this.f2383f).f2374a;
                List list = (List) map.get(jVar);
                p pVar = this.e;
                C0144a.a(list, qVar, jVar, pVar);
                C0144a.a((List) map.get(j.ON_ANY), qVar, jVar, pVar);
                return;
        }
    }

    public C0148e(p pVar) {
        this.e = pVar;
        C0146c c0146c = C0146c.f2378c;
        Class<?> cls = pVar.getClass();
        C0144a c0144a = (C0144a) c0146c.f2379a.get(cls);
        this.f2383f = c0144a == null ? c0146c.a(cls, null) : c0144a;
    }
}
