package Y;

import android.view.View;
import android.view.ViewGroup;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: Y.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0118m extends T.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0118m(s sVar, int i3) {
        super(sVar);
        this.f1900b = i3;
    }

    @Override // T.b
    public final int d(View view) {
        switch (this.f1900b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                t tVar = (t) view.getLayoutParams();
                ((s) this.f1622a).getClass();
                return view.getRight() + ((t) view.getLayoutParams()).f1911a.right + ((ViewGroup.MarginLayoutParams) tVar).rightMargin;
            default:
                t tVar2 = (t) view.getLayoutParams();
                ((s) this.f1622a).getClass();
                return view.getBottom() + ((t) view.getLayoutParams()).f1911a.bottom + ((ViewGroup.MarginLayoutParams) tVar2).bottomMargin;
        }
    }

    @Override // T.b
    public final int e(View view) {
        switch (this.f1900b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                t tVar = (t) view.getLayoutParams();
                ((s) this.f1622a).getClass();
                return (view.getLeft() - ((t) view.getLayoutParams()).f1911a.left) - ((ViewGroup.MarginLayoutParams) tVar).leftMargin;
            default:
                t tVar2 = (t) view.getLayoutParams();
                ((s) this.f1622a).getClass();
                return (view.getTop() - ((t) view.getLayoutParams()).f1911a.top) - ((ViewGroup.MarginLayoutParams) tVar2).topMargin;
        }
    }

    @Override // T.b
    public final int f() {
        switch (this.f1900b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                s sVar = (s) this.f1622a;
                return sVar.f1909f - sVar.t();
            default:
                s sVar2 = (s) this.f1622a;
                return sVar2.f1910g - sVar2.r();
        }
    }

    @Override // T.b
    public final int g() {
        switch (this.f1900b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((s) this.f1622a).s();
            default:
                return ((s) this.f1622a).u();
        }
    }

    @Override // T.b
    public final int h() {
        switch (this.f1900b) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                s sVar = (s) this.f1622a;
                return (sVar.f1909f - sVar.s()) - sVar.t();
            default:
                s sVar2 = (s) this.f1622a;
                return (sVar2.f1910g - sVar2.u()) - sVar2.r();
        }
    }
}
