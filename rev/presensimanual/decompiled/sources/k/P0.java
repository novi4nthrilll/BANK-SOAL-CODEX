package k;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5079d = 0;
    public final /* synthetic */ Object e;

    public P0(V0 v3) {
        this.e = v3;
        v3.f5094a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5079d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                R0 r3 = ((Toolbar) this.e).f2142N;
                p032j.j jVar = r3 == null ? null : r3.e;
                if (jVar != null) {
                    jVar.collapseActionView();
                }
                break;
            default:
                V0 v3 = (V0) this.e;
                if (v3.f5103k != null) {
                    v3.getClass();
                }
                break;
        }
    }

    public P0(Toolbar toolbar) {
        this.e = toolbar;
    }
}
