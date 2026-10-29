package C1;

import I1.x;
import android.view.KeyEvent;
import androidx.lifecycle.y;
import p016e1.EnumC0698w3;
import p016e1.EnumC0704x3;
import p016e1.O3;
import p016e1.R4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements R4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f164b;

    public h(String str, boolean z2) {
        this.f164b = str;
        this.f163a = z2;
    }

    @Override // p016e1.R4
    public E0.i a() {
        E0.k kVar = new E0.k();
        kVar.f227f = this.f163a ? EnumC0698w3.TYPE_THICK : EnumC0698w3.TYPE_THIN;
        y yVar = new y(3);
        yVar.e = (EnumC0704x3) this.f164b;
        kVar.f229h = new O3(yVar);
        return new E0.i(kVar, 0);
    }

    public void b(boolean z2) {
        if (this.f163a) {
            throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
        }
        this.f163a = true;
        x xVar = (x) this.f164b;
        int i3 = xVar.f430c - 1;
        xVar.f430c = i3;
        boolean z3 = z2 | xVar.f429b;
        xVar.f429b = z3;
        if (i3 != 0 || z3) {
            return;
        }
        ((D0.b) xVar.e).M((KeyEvent) xVar.f431d);
    }

    public /* synthetic */ h(boolean z2, EnumC0704x3 enumC0704x3) {
        this.f163a = z2;
        this.f164b = enumC0704x3;
    }

    public h(x xVar) {
        this.f164b = xVar;
        this.f163a = false;
    }
}
