package p009c1;

import O0.h;
import java.util.concurrent.Callable;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.K4;
import p016e1.S4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2670b;

    public /* synthetic */ p(int i3, Object obj) {
        this.f2669a = i3;
        this.f2670b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2669a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                r rVar = (r) this.f2670b;
                rVar.getClass();
                return h.f1272c.a(rVar.f2674a);
            case 1:
                K4 k4 = (K4) this.f2670b;
                k4.getClass();
                return h.f1272c.a(k4.f3603g);
            default:
                S4 s4 = (S4) this.f2670b;
                s4.getClass();
                return h.f1272c.a(s4.f4124g);
        }
    }
}
