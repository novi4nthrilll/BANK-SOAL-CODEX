package p032j;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public final class l implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f4961d;

    public l(n nVar) {
        this.f4961d = nVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4961d.c();
    }
}
