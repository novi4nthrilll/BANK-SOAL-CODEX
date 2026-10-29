package N0;

import java.util.ArrayList;
import java.util.List;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1093d = 0;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f1094f;

    public q(r rVar, int i3) {
        this.f1094f = rVar;
        this.e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1093d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((r) this.f1094f).i(this.e);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.f1094f;
                int size = arrayList.size();
                int i3 = 0;
                if (this.e == 1) {
                    while (i3 < size) {
                        ((O.f) arrayList.get(i3)).b();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((O.f) arrayList.get(i3)).a();
                        i3++;
                    }
                }
                break;
        }
    }

    public q(List list, int i3, Throwable th) {
        A.d.b(list, "initCallbacks cannot be null");
        this.f1094f = new ArrayList(list);
        this.e = i3;
    }
}
