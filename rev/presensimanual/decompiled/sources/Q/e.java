package Q;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class e implements KeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyListener f1369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p071w1.b f1370b;

    public e(KeyListener keyListener) {
        p071w1.b bVar = new p071w1.b(3);
        this.f1369a = keyListener;
        this.f1370b = bVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f1369a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f1369a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean zP;
        boolean z2;
        this.f1370b.getClass();
        if (i3 != 67) {
            zP = i3 != 112 ? false : A0.g.p(editable, keyEvent, true);
        } else {
            zP = A0.g.p(editable, keyEvent, false);
        }
        if (zP) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f1369a.onKeyDown(view, editable, i3, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1369a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f1369a.onKeyUp(view, editable, i3, keyEvent);
    }
}
