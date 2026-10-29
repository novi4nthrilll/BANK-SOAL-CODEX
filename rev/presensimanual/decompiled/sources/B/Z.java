package B;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class Z extends Y {
    @Override // W0.a
    public final void b(boolean z2) {
        Window window = this.f68c;
        if (!z2) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
