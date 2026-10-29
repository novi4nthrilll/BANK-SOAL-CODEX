package k;

import android.content.Context;
import android.view.View;
import id.go.bangkalankab.simpeg.R;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: k.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0728f extends p032j.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5157l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0734i f5158m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728f(C0734i c0734i, Context context, p032j.i iVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, iVar, true);
        this.f5158m = c0734i;
        this.f4966f = 8388613;
        p006b1.c cVar = c0734i.f5183y;
        this.f4968h = cVar;
        p032j.k kVar = this.f4969i;
        if (kVar != null) {
            kVar.j(cVar);
        }
    }

    @Override // p032j.n
    public final void c() {
        switch (this.f5157l) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0734i c0734i = this.f5158m;
                c0734i.v = null;
                c0734i.getClass();
                super.c();
                break;
            default:
                C0734i c0734i2 = this.f5158m;
                p032j.i iVar = c0734i2.f5165f;
                if (iVar != null) {
                    iVar.c(true);
                }
                c0734i2.f5180u = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728f(C0734i c0734i, Context context, p032j.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f5158m = c0734i;
        if (!tVar.f4989w.d()) {
            View view2 = c0734i.f5170k;
            this.e = view2 == null ? c0734i.f5169j : view2;
        }
        p006b1.c cVar = c0734i.f5183y;
        this.f4968h = cVar;
        p032j.k kVar = this.f4969i;
        if (kVar != null) {
            kVar.j(cVar);
        }
    }
}
