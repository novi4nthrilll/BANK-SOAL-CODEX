package B;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends W0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsetsController f73c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Window f74d;

    public b0(Window window) {
        this.f73c = window.getInsetsController();
        this.f74d = window;
    }

    @Override // W0.a
    public final void a(boolean z2) {
        Window window = this.f74d;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f73c.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f73c.setSystemBarsAppearance(0, 16);
    }

    @Override // W0.a
    public final void b(boolean z2) {
        Window window = this.f74d;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f73c.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f73c.setSystemBarsAppearance(0, 8);
    }
}
