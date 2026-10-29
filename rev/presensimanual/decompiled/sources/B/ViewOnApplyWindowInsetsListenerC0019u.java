package B;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: B.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0019u implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X f101a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f102b;

    public ViewOnApplyWindowInsetsListenerC0019u(View view, InterfaceC0012m interfaceC0012m) {
        this.f102b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        X xC = X.c(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0020v.a(windowInsets, this.f102b);
            if (xC.equals(this.f101a)) {
                throw null;
            }
        }
        this.f101a = xC;
        throw null;
    }
}
