package k;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: k.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0768z0 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f5262a;

    public C0768z0(SearchView searchView) {
        this.f5262a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        this.f5262a.o();
        return true;
    }
}
