package k;

import androidx.appcompat.widget.SearchView;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: k.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0762w0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5259d;
    public final /* synthetic */ SearchView e;

    public /* synthetic */ RunnableC0762w0(SearchView searchView, int i3) {
        this.f5259d = i3;
        this.e = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5259d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.e.q();
                break;
            default:
                H.c cVar = this.e.f2065R;
                if (cVar instanceof I0) {
                    cVar.b(null);
                }
                break;
        }
    }
}
