package k;

import android.os.Handler;
import android.widget.AbsListView;

/* JADX INFO: renamed from: k.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0731g0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0735i0 f5161a;

    public C0731g0(AbstractC0735i0 abstractC0735i0) {
        this.f5161a = abstractC0735i0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        if (i3 == 1) {
            AbstractC0735i0 abstractC0735i0 = this.f5161a;
            if (abstractC0735i0.f5206y.getInputMethodMode() == 2 || abstractC0735i0.f5206y.getContentView() == null) {
                return;
            }
            Handler handler = abstractC0735i0.f5203u;
            RunnableC0729f0 runnableC0729f0 = abstractC0735i0.f5199q;
            handler.removeCallbacks(runnableC0729f0);
            runnableC0729f0.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
    }
}
