package k;

import androidx.appcompat.widget.Toolbar;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class O0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5078d;
    public final /* synthetic */ Toolbar e;

    public /* synthetic */ O0(Toolbar toolbar, int i3) {
        this.f5078d = i3;
        this.e = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5078d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                R0 r3 = this.e.f2142N;
                p032j.j jVar = r3 == null ? null : r3.e;
                if (jVar != null) {
                    jVar.collapseActionView();
                }
                break;
            default:
                this.e.m();
                break;
        }
    }
}
