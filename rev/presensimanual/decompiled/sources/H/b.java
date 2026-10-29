package H;

import android.database.DataSetObserver;
import k.AbstractC0735i0;
import k.I0;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f321b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f320a = i3;
        this.f321b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f320a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                I0 i3 = (I0) this.f321b;
                i3.f322d = true;
                i3.notifyDataSetChanged();
                break;
            default:
                AbstractC0735i0 abstractC0735i0 = (AbstractC0735i0) this.f321b;
                if (abstractC0735i0.f5206y.isShowing()) {
                    abstractC0735i0.b();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f320a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                I0 i3 = (I0) this.f321b;
                i3.f322d = false;
                i3.notifyDataSetInvalidated();
                break;
            default:
                ((AbstractC0735i0) this.f321b).dismiss();
                break;
        }
    }
}
