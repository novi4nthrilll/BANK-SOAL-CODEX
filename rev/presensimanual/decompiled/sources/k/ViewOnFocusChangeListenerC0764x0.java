package k;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: k.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC0764x0 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f5260a;

    public ViewOnFocusChangeListenerC0764x0(SearchView searchView) {
        this.f5260a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        SearchView searchView = this.f5260a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f2061N;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z2);
        }
    }
}
