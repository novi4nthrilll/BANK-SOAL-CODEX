package k;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* JADX INFO: renamed from: k.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0760v0 implements TextWatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SearchView f5258d;

    public C0760v0(SearchView searchView) {
        this.f5258d = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        SearchView searchView = this.f5258d;
        Editable text = searchView.f2078s.getText();
        searchView.f2071b0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        searchView.t(!zIsEmpty);
        int i6 = 8;
        if (searchView.f2070a0 && !searchView.f2064Q && zIsEmpty) {
            searchView.f2082x.setVisibility(8);
            i6 = 0;
        }
        searchView.f2084z.setVisibility(i6);
        searchView.p();
        searchView.s();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
