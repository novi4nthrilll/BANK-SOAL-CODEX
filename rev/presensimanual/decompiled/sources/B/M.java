package B;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class M extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f54a;

    public M() {
        this.f54a = L.j();
    }

    @Override // B.O
    public X b() {
        a();
        X xC = X.c(this.f54a.build(), null);
        xC.f67a.k(null);
        return xC;
    }

    @Override // B.O
    public void c(p064t.c cVar) {
        this.f54a.setStableInsets(cVar.b());
    }

    @Override // B.O
    public void d(p064t.c cVar) {
        this.f54a.setSystemWindowInsets(cVar.b());
    }

    public M(X x3) {
        WindowInsets.Builder builderJ;
        super(x3);
        WindowInsets windowInsetsB = x3.b();
        if (windowInsetsB != null) {
            builderJ = L.k(windowInsetsB);
        } else {
            builderJ = L.j();
        }
        this.f54a = builderJ;
    }
}
