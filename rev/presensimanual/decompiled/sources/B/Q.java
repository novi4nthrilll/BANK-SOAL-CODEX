package B;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class Q extends P {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p064t.c f62k;

    public Q(X x3, WindowInsets windowInsets) {
        super(x3, windowInsets);
        this.f62k = null;
    }

    @Override // B.W
    public X b() {
        return X.c(this.f60c.consumeStableInsets(), null);
    }

    @Override // B.W
    public X c() {
        return X.c(this.f60c.consumeSystemWindowInsets(), null);
    }

    @Override // B.W
    public final p064t.c f() {
        if (this.f62k == null) {
            WindowInsets windowInsets = this.f60c;
            this.f62k = p064t.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f62k;
    }

    @Override // B.W
    public boolean i() {
        return this.f60c.isConsumed();
    }

    @Override // B.W
    public void m(p064t.c cVar) {
        this.f62k = cVar;
    }
}
