package Q;

import E0.n;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f1363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p067u1.a f1364b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        p067u1.a aVar = new p067u1.a();
        super(inputConnection, false);
        this.f1363a = editText;
        this.f1364b = aVar;
        if (O.h.f1179j != null) {
            O.h hVarA = O.h.a();
            if (hVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            N0.j jVar = hVarA.e;
            jVar.getClass();
            Bundle bundle = editorInfo.extras;
            P.b bVar = (P.b) ((n) jVar.f1086c).f236d;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f100d).getInt(iA + bVar.f97a) : 0);
            Bundle bundle2 = editorInfo.extras;
            ((O.h) jVar.f1084a).getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        Editable editableText = this.f1363a.getEditableText();
        this.f1364b.getClass();
        return p067u1.a.c(this, editableText, i3, i4, false) || super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        Editable editableText = this.f1363a.getEditableText();
        this.f1364b.getClass();
        return p067u1.a.c(this, editableText, i3, i4, true) || super.deleteSurroundingTextInCodePoints(i3, i4);
    }
}
