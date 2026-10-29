package p009c1;

import java.util.concurrent.Callable;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p071w1.i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2672b;

    public /* synthetic */ q(i iVar, int i3) {
        this.f2671a = i3;
        this.f2672b = iVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2671a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
            case 1:
                break;
        }
        return this.f2672b.a();
    }
}
