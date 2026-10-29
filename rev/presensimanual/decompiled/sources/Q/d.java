package Q;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f1368b;

    public d(TextView textView) {
        this.f1367a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
        TextView textView = this.f1367a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = O.h.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i6 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i4);
                }
                return O.h.a().e(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        O.h hVarA = O.h.a();
        if (this.f1368b == null) {
            this.f1368b = new c(textView, this);
        }
        hVarA.f(this.f1368b);
        return charSequence;
    }
}
