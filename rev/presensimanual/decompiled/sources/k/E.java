package k;

import W1.C0104l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p013d1.AbstractC0463j;
import p013d1.AbstractC0497o3;
import p013d1.AbstractC0528u;
import p013d1.G2;

/* JADX INFO: loaded from: classes.dex */
public class E extends TextView implements G.p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0744n f5019d;
    public final B e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0104l f5020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0748p f5021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.lifecycle.y f5023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Future f5024j;

    public E(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0748p getEmojiTextViewHelper() {
        if (this.f5021g == null) {
            this.f5021g = new C0748p(this);
        }
        return this.f5021g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0744n c0744n = this.f5019d;
        if (c0744n != null) {
            c0744n.a();
        }
        B b3 = this.e;
        if (b3 != null) {
            b3.b();
        }
    }

    public final void f() {
        Future future = this.f5024j;
        if (future == null) {
            return;
        }
        try {
            this.f5024j = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0463j.a(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c1.f5156a) {
            return super.getAutoSizeMaxTextSize();
        }
        B b3 = this.e;
        if (b3 != null) {
            return Math.round(b3.f5013i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c1.f5156a) {
            return super.getAutoSizeMinTextSize();
        }
        B b3 = this.e;
        if (b3 != null) {
            return Math.round(b3.f5013i.f5059d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c1.f5156a) {
            return super.getAutoSizeStepGranularity();
        }
        B b3 = this.e;
        if (b3 != null) {
            return Math.round(b3.f5013i.f5058c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c1.f5156a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        B b3 = this.e;
        return b3 != null ? b3.f5013i.f5060f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (c1.f5156a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        B b3 = this.e;
        if (b3 != null) {
            return b3.f5013i.f5056a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0463j.d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public C getSuperCaller() {
        if (this.f5023i == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                this.f5023i = new D(this);
            } else if (i3 >= 26) {
                this.f5023i = new androidx.lifecycle.y(11, this);
            }
        }
        return this.f5023i;
    }

    public ColorStateList getSupportBackgroundTintList() {
        Z.d dVar;
        C0744n c0744n = this.f5019d;
        if (c0744n == null || (dVar = c0744n.e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f1941c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Z.d dVar;
        C0744n c0744n = this.f5019d;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        f();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0104l c0104l;
        if (Build.VERSION.SDK_INT >= 28 || (c0104l = this.f5020f) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0104l.f1774d;
        return textClassifier == null ? AbstractC0755t.a((E) c0104l.e) : textClassifier;
    }

    public p078z.a getTextMetricsParamsCompat() {
        return AbstractC0463j.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i3;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.e.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i4 >= 30) {
                F.b.a(editorInfo, text);
            } else {
                text.getClass();
                if (i4 >= 30) {
                    F.b.a(editorInfo, text);
                } else {
                    int i5 = editorInfo.initialSelStart;
                    int i6 = editorInfo.initialSelEnd;
                    int i7 = i5 > i6 ? i6 : i5;
                    if (i5 <= i6) {
                        i5 = i6;
                    }
                    int length = text.length();
                    if (i7 < 0 || i5 > length || (i3 = editorInfo.inputType & 4095) == 129 || i3 == 225 || i3 == 18) {
                        p009c1.t.a(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        p009c1.t.a(editorInfo, text, i7, i5);
                    } else {
                        int i8 = i5 - i7;
                        int i9 = i8 > 1024 ? 0 : i8;
                        int i10 = 2048 - i9;
                        int iMin = Math.min(text.length() - i5, i10 - Math.min(i7, (int) (((double) i10) * 0.8d)));
                        int iMin2 = Math.min(i7, i10 - iMin);
                        int i11 = i7 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i11))) {
                            i11++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i5 + iMin) - 1))) {
                            iMin--;
                        }
                        int i12 = iMin2 + i9;
                        p009c1.t.a(editorInfo, i9 != i8 ? TextUtils.concat(text.subSequence(i11, i11 + iMin2), text.subSequence(i5, iMin + i5)) : text.subSequence(i11, i12 + iMin + i11), iMin2, i12);
                    }
                }
            }
        }
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        super.onLayout(z2, i3, i4, i5, i6);
        B b3 = this.e;
        if (b3 == null || c1.f5156a) {
            return;
        }
        b3.f5013i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        f();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        B b3 = this.e;
        if (b3 == null || c1.f5156a) {
            return;
        }
        L l3 = b3.f5013i;
        if (l3.f5056a != 0) {
            l3.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((AbstractC0528u) getEmojiTextViewHelper().f5230b.e).c(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (c1.f5156a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        B b3 = this.e;
        if (b3 != null) {
            L l3 = b3.f5013i;
            DisplayMetrics displayMetrics = l3.f5064j.getResources().getDisplayMetrics();
            l3.i(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (l3.g()) {
                l3.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (c1.f5156a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        B b3 = this.e;
        if (b3 != null) {
            L l3 = b3.f5013i;
            l3.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i3 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = l3.f5064j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArrCopyOf[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                l3.f5060f = L.b(iArrCopyOf);
                if (!l3.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                l3.f5061g = false;
            }
            if (l3.g()) {
                l3.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (c1.f5156a) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        B b3 = this.e;
        if (b3 != null) {
            L l3 = b3.f5013i;
            if (i3 == 0) {
                l3.f5056a = 0;
                l3.f5059d = -1.0f;
                l3.e = -1.0f;
                l3.f5058c = -1.0f;
                l3.f5060f = new int[0];
                l3.f5057b = false;
                return;
            }
            if (i3 != 1) {
                l3.getClass();
                throw new IllegalArgumentException(p013d1.I.f("Unknown auto-size text type: ", i3));
            }
            DisplayMetrics displayMetrics = l3.f5064j.getResources().getDisplayMetrics();
            l3.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (l3.g()) {
                l3.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0744n c0744n = this.f5019d;
        if (c0744n != null) {
            c0744n.f5217c = -1;
            c0744n.d(null);
            c0744n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0744n c0744n = this.f5019d;
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        B b3 = this.e;
        if (b3 != null) {
            b3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        B b3 = this.e;
        if (b3 != null) {
            b3.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0463j.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((AbstractC0528u) getEmojiTextViewHelper().f5230b.e).d(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0528u) getEmojiTextViewHelper().f5230b.e).a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i3);
        } else {
            AbstractC0463j.b(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i3);
        } else {
            AbstractC0463j.c(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i3 != fontMetricsInt) {
            setLineSpacing(i3 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(p078z.b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0463j.a(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0744n c0744n = this.f5019d;
        if (c0744n != null) {
            c0744n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0744n c0744n = this.f5019d;
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0104l c0104l;
        if (Build.VERSION.SDK_INT >= 28 || (c0104l = this.f5020f) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0104l.f1774d = textClassifier;
        }
    }

    public void setTextFuture(Future<p078z.b> future) {
        this.f5024j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(p078z.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.f5928b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        int i4 = Build.VERSION.SDK_INT;
        TextPaint textPaint = aVar.f5927a;
        if (i4 >= 23) {
            getPaint().set(textPaint);
            G.l.e(this, aVar.f5929c);
            G.l.h(this, aVar.f5930d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f3) {
        boolean z2 = c1.f5156a;
        if (z2) {
            super.setTextSize(i3, f3);
            return;
        }
        B b3 = this.e;
        if (b3 == null || z2) {
            return;
        }
        L l3 = b3.f5013i;
        if (l3.f5056a != 0) {
            return;
        }
        l3.f(i3, f3);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i3) {
        Typeface typefaceCreate;
        if (this.f5022h) {
            return;
        }
        if (typeface == null || i3 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            AbstractC0497o3 abstractC0497o3 = p064t.g.f5679a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i3);
        }
        this.f5022h = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f5022h = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        M0.a(context);
        this.f5022h = false;
        this.f5023i = null;
        L0.a(this, getContext());
        C0744n c0744n = new C0744n(this);
        this.f5019d = c0744n;
        c0744n.b(attributeSet, i3);
        B b3 = new B(this);
        this.e = b3;
        b3.d(attributeSet, i3);
        b3.b();
        C0104l c0104l = new C0104l();
        c0104l.e = this;
        this.f5020f = c0104l;
        getEmojiTextViewHelper().a(attributeSet, i3);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? G2.b(context, i3) : null, i4 != 0 ? G2.b(context, i4) : null, i5 != 0 ? G2.b(context, i5) : null, i6 != 0 ? G2.b(context, i6) : null);
        B b3 = this.e;
        if (b3 != null) {
            b3.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? G2.b(context, i3) : null, i4 != 0 ? G2.b(context, i4) : null, i5 != 0 ? G2.b(context, i5) : null, i6 != 0 ? G2.b(context, i6) : null);
        B b3 = this.e;
        if (b3 != null) {
            b3.b();
        }
    }
}
