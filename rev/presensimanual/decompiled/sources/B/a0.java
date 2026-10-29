package B;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends Z {
    @Override // W0.a
    public final void a(boolean z2) {
        Window window = this.f68c;
        if (!z2) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
