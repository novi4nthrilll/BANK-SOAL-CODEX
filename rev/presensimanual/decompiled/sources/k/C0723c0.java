package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: k.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0723c0 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5155d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C0723c0(int i3, Object obj) {
        this.f5155d = i3;
        this.e = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        C0745n0 c0745n0;
        switch (this.f5155d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (i3 != -1 && (c0745n0 = ((AbstractC0735i0) this.e).f5188f) != null) {
                    c0745n0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.e).m(i3);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f5155d;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
