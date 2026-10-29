package I1;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f362d;
    public final /* synthetic */ g e;

    public f(g gVar, p pVar) {
        this.e = gVar;
        this.f362d = pVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        g gVar = this.e;
        if (gVar.f368g && gVar.e != null) {
            this.f362d.getViewTreeObserver().removeOnPreDrawListener(this);
            gVar.e = null;
        }
        return gVar.f368g;
    }
}
