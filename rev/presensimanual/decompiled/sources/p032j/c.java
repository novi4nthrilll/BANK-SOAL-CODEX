package p032j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import k.C0747o0;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4881d;
    public final /* synthetic */ k e;

    public /* synthetic */ c(k kVar, int i3) {
        this.f4881d = i3;
        this.e = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f4881d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                f fVar = (f) this.e;
                if (fVar.g()) {
                    ArrayList arrayList = fVar.f4894k;
                    if (arrayList.size() > 0 && !((e) arrayList.get(0)).f4883a.f5205x) {
                        View view = fVar.f4901r;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((e) it.next()).f4883a.b();
                            }
                        } else {
                            fVar.dismiss();
                        }
                        break;
                    }
                }
                break;
            default:
                s sVar = (s) this.e;
                if (sVar.g()) {
                    C0747o0 c0747o0 = sVar.f4977k;
                    if (!c0747o0.f5205x) {
                        View view2 = sVar.f4982p;
                        if (view2 != null && view2.isShown()) {
                            c0747o0.b();
                        } else {
                            sVar.dismiss();
                        }
                    }
                }
                break;
        }
    }
}
