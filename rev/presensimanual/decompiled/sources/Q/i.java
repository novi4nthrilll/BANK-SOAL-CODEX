package Q;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import k.AbstractC0742m;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextWatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0742m f1377d;
    public h e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1378f = true;

    public i(AbstractC0742m abstractC0742m) {
        this.f1377d = abstractC0742m;
    }

    public static void a(EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            O.h hVarA = O.h.a();
            if (editableText == null) {
                length = 0;
            } else {
                hVarA.getClass();
                length = editableText.length();
            }
            hVarA.e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        AbstractC0742m abstractC0742m = this.f1377d;
        if (abstractC0742m.isInEditMode() || !this.f1378f || O.h.f1179j == null || i4 > i5 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iB = O.h.a().b();
        if (iB != 0) {
            if (iB == 1) {
                O.h.a().e((Spannable) charSequence, i3, i5 + i3);
                return;
            } else if (iB != 3) {
                return;
            }
        }
        O.h hVarA = O.h.a();
        if (this.e == null) {
            this.e = new h(abstractC0742m);
        }
        hVarA.f(this.e);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
