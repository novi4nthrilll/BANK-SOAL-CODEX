package Q;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class c extends O.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f1366b;

    public c(TextView textView, d dVar) {
        this.f1365a = new WeakReference(textView);
        this.f1366b = new WeakReference(dVar);
    }

    @Override // O.f
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f1365a.get();
        InputFilter inputFilter = (InputFilter) this.f1366b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    O.h hVarA = O.h.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        hVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceE = hVarA.e(text, 0, length);
                    if (text == charSequenceE) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceE);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceE);
                    textView.setText(charSequenceE);
                    if (charSequenceE instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceE;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
