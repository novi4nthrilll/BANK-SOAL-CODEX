package Y;

import B.C0001b;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class F extends C0001b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f1822d;

    public F(RecyclerView recyclerView) {
        this.f1822d = recyclerView;
        new E(this);
    }

    @Override // B.C0001b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if (!(view instanceof RecyclerView) || this.f1822d.l()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().A(accessibilityEvent);
        }
    }

    @Override // B.C0001b
    public final void b(View view, C.l lVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f71a;
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f139a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = this.f1822d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return;
        }
        s layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1906b;
        y yVar = recyclerView2.f2466d;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f1906b.canScrollHorizontally(-1)) {
            accessibilityNodeInfo.addAction(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f1906b.canScrollVertically(1) || layoutManager.f1906b.canScrollHorizontally(1)) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        B b3 = recyclerView2.f2463a0;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.x(yVar, b3), layoutManager.q(yVar, b3), false, 0));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // B.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        int iU;
        int iS;
        if (super.c(view, i3, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1822d;
        if (recyclerView.l() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        s layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1906b;
        y yVar = recyclerView2.f2466d;
        if (i3 == 4096) {
            iU = recyclerView2.canScrollVertically(1) ? (layoutManager.f1910g - layoutManager.u()) - layoutManager.r() : 0;
            if (layoutManager.f1906b.canScrollHorizontally(1)) {
                iS = (layoutManager.f1909f - layoutManager.s()) - layoutManager.t();
            } else {
                iS = 0;
            }
        } else if (i3 != 8192) {
            iS = 0;
            iU = 0;
        } else {
            iU = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f1910g - layoutManager.u()) - layoutManager.r()) : 0;
            if (layoutManager.f1906b.canScrollHorizontally(-1)) {
                iS = -((layoutManager.f1909f - layoutManager.s()) - layoutManager.t());
            } else {
                iS = 0;
            }
        }
        if (iU == 0 && iS == 0) {
            return false;
        }
        layoutManager.f1906b.r(iS, iU);
        return true;
    }
}
