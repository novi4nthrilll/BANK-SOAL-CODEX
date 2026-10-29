package Y;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1815d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OverScroller f1816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Interpolator f1817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1820j;

    public D(RecyclerView recyclerView) {
        this.f1820j = recyclerView;
        n nVar = RecyclerView.f2441o0;
        this.f1817g = nVar;
        this.f1818h = false;
        this.f1819i = false;
        this.f1816f = new OverScroller(recyclerView.getContext(), nVar);
    }

    public final void a() {
        if (this.f1818h) {
            this.f1819i = true;
            return;
        }
        RecyclerView recyclerView = this.f1820j;
        recyclerView.removeCallbacks(this);
        Field field = B.D.f41a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f1820j;
        if (recyclerView.f2479l == null) {
            recyclerView.removeCallbacks(this);
            this.f1816f.abortAnimation();
            return;
        }
        this.f1819i = false;
        this.f1818h = true;
        recyclerView.d();
        OverScroller overScroller = this.f1816f;
        recyclerView.f2479l.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currX - this.f1815d;
            int i4 = currY - this.e;
            this.f1815d = currX;
            this.e = currY;
            RecyclerView recyclerView2 = this.f1820j;
            int[] iArr = recyclerView.f2472g0;
            if (recyclerView2.f(i3, i4, iArr, null, 1)) {
                i3 -= iArr[0];
                i4 -= iArr[1];
            }
            if (!recyclerView.f2480m.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i3, i4);
            }
            recyclerView.g(null, 1);
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z2 = (i3 == 0 && i4 == 0) || (i3 != 0 && recyclerView.f2479l.b() && i3 == 0) || (i4 != 0 && recyclerView.f2479l.c() && i4 == 0);
            if (overScroller.isFinished() || !(z2 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                if (RecyclerView.f2440m0) {
                    C0112g c0112g = recyclerView.f2462W;
                    c0112g.getClass();
                    c0112g.f1883c = 0;
                }
                recyclerView.s(1);
            } else {
                a();
                RunnableC0114i runnableC0114i = recyclerView.f2461V;
                if (runnableC0114i != null) {
                    runnableC0114i.a(recyclerView, i3, i4);
                }
            }
        }
        this.f1818h = false;
        if (this.f1819i) {
            a();
        }
    }
}
