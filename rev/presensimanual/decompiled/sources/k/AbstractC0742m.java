package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p013d1.AbstractC0463j;
import p013d1.G2;

/* JADX INFO: renamed from: k.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0742m extends AutoCompleteTextView implements G.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f5212g = {R.attr.popupBackground};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0744n f5213d;
    public final B e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p006b1.c f5214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0742m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, id.go.bangkalankab.simpeg.R.attr.autoCompleteTextViewStyle);
        M0.a(context);
        L0.a(this, getContext());
        D0.b bVarL = D0.b.L(getContext(), attributeSet, f5212g, id.go.bangkalankab.simpeg.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) bVarL.f182f).hasValue(0)) {
            setDropDownBackgroundDrawable(bVarL.C(0));
        }
        bVarL.O();
        C0744n c0744n = new C0744n(this);
        this.f5213d = c0744n;
        c0744n.b(attributeSet, id.go.bangkalankab.simpeg.R.attr.autoCompleteTextViewStyle);
        B b3 = new B(this);
        this.e = b3;
        b3.d(attributeSet, id.go.bangkalankab.simpeg.R.attr.autoCompleteTextViewStyle);
        b3.b();
        p006b1.c cVar = new p006b1.c();
        cVar.f2515d = new A0.f(this);
        this.f5214f = cVar;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p011d.a.f3536g, id.go.bangkalankab.simpeg.R.attr.autoCompleteTextViewStyle, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            cVar.k(z2);
            KeyListener keyListener = getKeyListener();
            if (keyListener instanceof NumberKeyListener) {
                return;
            }
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerG = cVar.g(keyListener);
            if (keyListenerG == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerG);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0744n c0744n = this.f5213d;
        if (c0744n != null) {
            c0744n.a();
        }
        B b3 = this.e;
        if (b3 != null) {
            b3.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0463j.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        Z.d dVar;
        C0744n c0744n = this.f5213d;
        if (c0744n == null || (dVar = c0744n.e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f1941c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Z.d dVar;
        C0744n c0744n = this.f5213d;
        if (c0744n == null || (dVar = c0744n.e) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f1942d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        Z.d dVar = this.e.f5012h;
        if (dVar != null) {
            return (ColorStateList) dVar.f1941c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        Z.d dVar = this.e.f5012h;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f1942d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        A0.f fVar = (A0.f) this.f5214f.f2515d;
        if (inputConnectionOnCreateInputConnection == null) {
            fVar.getClass();
            return null;
        }
        A0.g gVar = (A0.g) fVar.e;
        gVar.getClass();
        if (!(inputConnectionOnCreateInputConnection instanceof Q.b)) {
            inputConnectionOnCreateInputConnection = new Q.b((AbstractC0742m) gVar.e, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0744n c0744n = this.f5213d;
        if (c0744n != null) {
            c0744n.f5217c = -1;
            c0744n.d(null);
            c0744n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0744n c0744n = this.f5213d;
        if (c0744n != null) {
            c0744n.c(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b3 = this.e;
        if (b3 != null) {
            b3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b3 = this.e;
        if (b3 != null) {
            b3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0463j.e(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(G2.b(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f5214f.k(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f5214f.g(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0744n c0744n = this.f5213d;
        if (c0744n != null) {
            c0744n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0744n c0744n = this.f5213d;
        if (c0744n != null) {
            c0744n.f(mode);
        }
    }

    @Override // G.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        B b3 = this.e;
        if (b3.f5012h == null) {
            b3.f5012h = new Z.d();
        }
        Z.d dVar = b3.f5012h;
        dVar.f1941c = colorStateList;
        dVar.f1940b = colorStateList != null;
        b3.f5007b = dVar;
        b3.f5008c = dVar;
        b3.f5009d = dVar;
        b3.e = dVar;
        b3.f5010f = dVar;
        b3.f5011g = dVar;
        b3.b();
    }

    @Override // G.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        B b3 = this.e;
        if (b3.f5012h == null) {
            b3.f5012h = new Z.d();
        }
        Z.d dVar = b3.f5012h;
        dVar.f1942d = mode;
        dVar.f1939a = mode != null;
        b3.f5007b = dVar;
        b3.f5008c = dVar;
        b3.f5009d = dVar;
        b3.e = dVar;
        b3.f5010f = dVar;
        b3.f5011g = dVar;
        b3.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        B b3 = this.e;
        if (b3 != null) {
            b3.e(context, i3);
        }
    }
}
