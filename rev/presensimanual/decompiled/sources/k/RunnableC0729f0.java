package k;

import java.lang.reflect.Field;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: k.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0729f0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5159d;
    public final /* synthetic */ AbstractC0735i0 e;

    public /* synthetic */ RunnableC0729f0(AbstractC0735i0 abstractC0735i0, int i3) {
        this.f5159d = i3;
        this.e = abstractC0735i0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0735i0 abstractC0735i0 = this.e;
        switch (this.f5159d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0745n0 c0745n0 = abstractC0735i0.f5188f;
                if (c0745n0 != null) {
                    c0745n0.setListSelectionHidden(true);
                    c0745n0.requestLayout();
                }
                break;
            default:
                C0745n0 c0745n1 = abstractC0735i0.f5188f;
                if (c0745n1 != null) {
                    Field field = B.D.f41a;
                    if (c0745n1.isAttachedToWindow() && abstractC0735i0.f5188f.getCount() > abstractC0735i0.f5188f.getChildCount() && abstractC0735i0.f5188f.getChildCount() <= Integer.MAX_VALUE) {
                        abstractC0735i0.f5206y.setInputMethodMode(2);
                        abstractC0735i0.b();
                        break;
                    }
                }
                break;
        }
    }
}
