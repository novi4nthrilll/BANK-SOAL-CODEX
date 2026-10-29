package Y;

import B.C0001b;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class E extends C0001b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F f1821d;

    public E(F f3) {
        this.f1821d = f3;
    }

    @Override // B.C0001b
    public final void b(View view, C.l lVar) {
        this.f71a.onInitializeAccessibilityNodeInfo(view, lVar.f139a);
        F f3 = this.f1821d;
        if (f3.f1822d.l()) {
            return;
        }
        RecyclerView recyclerView = f3.f1822d;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().getClass();
            RecyclerView.j(view);
        }
    }

    @Override // B.C0001b
    public final boolean c(View view, int i3, Bundle bundle) {
        if (super.c(view, i3, bundle)) {
            return true;
        }
        F f3 = this.f1821d;
        if (!f3.f1822d.l()) {
            RecyclerView recyclerView = f3.f1822d;
            if (recyclerView.getLayoutManager() != null) {
                y yVar = recyclerView.getLayoutManager().f1906b.f2466d;
            }
        }
        return false;
    }
}
