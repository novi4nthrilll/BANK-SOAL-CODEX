package androidx.appcompat.widget;

import B.C0016q;
import B.D;
import Q.h;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import k.B;
import k.C0748p;
import k.J0;
import k.K0;
import k.L0;
import k.Q;
import k.c1;
import p013d1.AbstractC0463j;
import p013d1.AbstractC0520s3;
import p013d1.AbstractC0528u;
import p013d1.G2;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final J0 U = new J0(Float.class, "thumbPos");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final int[] f2089V = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final VelocityTracker f2090A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f2091B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public float f2092C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f2093D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f2094E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f2095F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f2096G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f2097H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f2098I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f2099J;
    public boolean K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final TextPaint f2100L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final ColorStateList f2101M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public StaticLayout f2102N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public StaticLayout f2103O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final p025h.a f2104P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ObjectAnimator f2105Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0748p f2106R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public h f2107S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final Rect f2108T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f2109d;
    public ColorStateList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f2110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f2113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f2114j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f2115k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2116l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2118n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2119o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f2122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f2123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f2124t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f2125u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2127x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f2128y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f2129z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, id.go.bangkalankab.simpeg.R.attr.switchStyle);
        this.e = null;
        this.f2110f = null;
        this.f2111g = false;
        this.f2112h = false;
        this.f2114j = null;
        this.f2115k = null;
        this.f2116l = false;
        this.f2117m = false;
        this.f2090A = VelocityTracker.obtain();
        this.K = true;
        this.f2108T = new Rect();
        L0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f2100L = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = p011d.a.f3547r;
        D0.b bVarL = D0.b.L(context, attributeSet, iArr, id.go.bangkalankab.simpeg.R.attr.switchStyle);
        D.c(this, context, iArr, attributeSet, (TypedArray) bVarL.f182f, id.go.bangkalankab.simpeg.R.attr.switchStyle);
        Drawable drawableC = bVarL.C(2);
        this.f2109d = drawableC;
        if (drawableC != null) {
            drawableC.setCallback(this);
        }
        Drawable drawableC2 = bVarL.C(11);
        this.f2113i = drawableC2;
        if (drawableC2 != null) {
            drawableC2.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) bVarL.f182f;
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.v = typedArray.getBoolean(3, true);
        this.f2118n = typedArray.getDimensionPixelSize(8, 0);
        this.f2119o = typedArray.getDimensionPixelSize(5, 0);
        this.f2120p = typedArray.getDimensionPixelSize(6, 0);
        this.f2121q = typedArray.getBoolean(4, false);
        ColorStateList colorStateListB = bVarL.B(9);
        if (colorStateListB != null) {
            this.e = colorStateListB;
            this.f2111g = true;
        }
        PorterDuff.Mode modeC = Q.c(typedArray.getInt(10, -1), null);
        if (this.f2110f != modeC) {
            this.f2110f = modeC;
            this.f2112h = true;
        }
        if (this.f2111g || this.f2112h) {
            a();
        }
        ColorStateList colorStateListB2 = bVarL.B(12);
        if (colorStateListB2 != null) {
            this.f2114j = colorStateListB2;
            this.f2116l = true;
        }
        PorterDuff.Mode modeC2 = Q.c(typedArray.getInt(13, -1), null);
        if (this.f2115k != modeC2) {
            this.f2115k = modeC2;
            this.f2117m = true;
        }
        if (this.f2116l || this.f2117m) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, p011d.a.f3548s);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = G2.a(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f2101M = colorStateList;
            } else {
                this.f2101M = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f3 = dimensionPixelSize;
                if (f3 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f3);
                    requestLayout();
                }
            }
            int i3 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i4 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i3 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i3 != 2) {
                typeface = i3 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i4 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i5 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i4;
                textPaint.setFakeBoldText((i5 & 1) != 0);
                textPaint.setTextSkewX((2 & i5) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                p025h.a aVar = new p025h.a();
                aVar.f4513a = context2.getResources().getConfiguration().locale;
                this.f2104P = aVar;
            } else {
                this.f2104P = null;
            }
            setTextOnInternal(this.f2122r);
            setTextOffInternal(this.f2124t);
            typedArrayObtainStyledAttributes.recycle();
        }
        new B(this).d(attributeSet, id.go.bangkalankab.simpeg.R.attr.switchStyle);
        bVarL.O();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2127x = viewConfiguration.getScaledTouchSlop();
        this.f2091B = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().a(attributeSet, id.go.bangkalankab.simpeg.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0748p getEmojiTextViewHelper() {
        if (this.f2106R == null) {
            this.f2106R = new C0748p(this);
        }
        return this.f2106R;
    }

    private boolean getTargetCheckedState() {
        return this.f2092C > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((c1.a(this) ? 1.0f - this.f2092C : this.f2092C) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f2113i;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f2108T;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2109d;
        Rect rectB = drawable2 != null ? Q.b(drawable2) : Q.f5082c;
        return ((((this.f2093D - this.f2095F) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f2124t = charSequence;
        C0748p emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = ((AbstractC0528u) emojiTextViewHelper.f5230b.e).e(this.f2104P);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.f2125u = charSequence;
        this.f2103O = null;
        if (this.v) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f2122r = charSequence;
        C0748p emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodE = ((AbstractC0528u) emojiTextViewHelper.f5230b.e).e(this.f2104P);
        if (transformationMethodE != null) {
            charSequence = transformationMethodE.getTransformation(charSequence, this);
        }
        this.f2123s = charSequence;
        this.f2102N = null;
        if (this.v) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f2109d;
        if (drawable != null) {
            if (this.f2111g || this.f2112h) {
                Drawable drawableMutate = AbstractC0520s3.d(drawable).mutate();
                this.f2109d = drawableMutate;
                if (this.f2111g) {
                    u.a.h(drawableMutate, this.e);
                }
                if (this.f2112h) {
                    u.a.i(this.f2109d, this.f2110f);
                }
                if (this.f2109d.isStateful()) {
                    this.f2109d.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f2113i;
        if (drawable != null) {
            if (this.f2116l || this.f2117m) {
                Drawable drawableMutate = AbstractC0520s3.d(drawable).mutate();
                this.f2113i = drawableMutate;
                if (this.f2116l) {
                    u.a.h(drawableMutate, this.f2114j);
                }
                if (this.f2117m) {
                    u.a.i(this.f2113i, this.f2115k);
                }
                if (this.f2113i.isStateful()) {
                    this.f2113i.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.f2122r);
        setTextOffInternal(this.f2124t);
        requestLayout();
    }

    public final void d() {
        if (this.f2107S == null && ((AbstractC0528u) this.f2106R.f5230b.e).b() && O.h.f1179j != null) {
            O.h hVarA = O.h.a();
            int iB = hVarA.b();
            if (iB == 3 || iB == 0) {
                h hVar = new h(this);
                this.f2107S = hVar;
                hVarA.f(hVar);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        int i4;
        int i5 = this.f2096G;
        int i6 = this.f2097H;
        int i7 = this.f2098I;
        int i8 = this.f2099J;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f2109d;
        Rect rectB = drawable != null ? Q.b(drawable) : Q.f5082c;
        Drawable drawable2 = this.f2113i;
        Rect rect = this.f2108T;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i9 = rect.left;
            thumbOffset += i9;
            if (rectB != null) {
                int i10 = rectB.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = rectB.top;
                int i12 = rect.top;
                i3 = i11 > i12 ? (i11 - i12) + i6 : i6;
                int i13 = rectB.right;
                int i14 = rect.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = rectB.bottom;
                int i16 = rect.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                }
                this.f2113i.setBounds(i5, i3, i7, i4);
            } else {
                i3 = i6;
            }
            i4 = i8;
            this.f2113i.setBounds(i5, i3, i7, i4);
        }
        Drawable drawable3 = this.f2109d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i17 = thumbOffset - rect.left;
            int i18 = thumbOffset + this.f2095F + rect.right;
            this.f2109d.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                u.a.f(background, i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f2109d;
        if (drawable != null) {
            u.a.e(drawable, f3, f4);
        }
        Drawable drawable2 = this.f2113i;
        if (drawable2 != null) {
            u.a.e(drawable2, f3, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2109d;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f2113i;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!c1.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2093D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2120p : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (c1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2093D;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2120p : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC0463j.d(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.v;
    }

    public boolean getSplitTrack() {
        return this.f2121q;
    }

    public int getSwitchMinWidth() {
        return this.f2119o;
    }

    public int getSwitchPadding() {
        return this.f2120p;
    }

    public CharSequence getTextOff() {
        return this.f2124t;
    }

    public CharSequence getTextOn() {
        return this.f2122r;
    }

    public Drawable getThumbDrawable() {
        return this.f2109d;
    }

    public final float getThumbPosition() {
        return this.f2092C;
    }

    public int getThumbTextPadding() {
        return this.f2118n;
    }

    public ColorStateList getThumbTintList() {
        return this.e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2110f;
    }

    public Drawable getTrackDrawable() {
        return this.f2113i;
    }

    public ColorStateList getTrackTintList() {
        return this.f2114j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2115k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2109d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2113i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f2105Q;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f2105Q.end();
        this.f2105Q = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i3) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2089V);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f2113i;
        Rect rect = this.f2108T;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f2097H;
        int i4 = this.f2099J;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f2109d;
        if (drawable != null) {
            if (!this.f2121q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = Q.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f2102N : this.f2103O;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f2101M;
            TextPaint textPaint = this.f2100L;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i5 + i6) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f2122r : this.f2124t;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z2, i3, i4, i5, i6);
        int iMax2 = 0;
        if (this.f2109d != null) {
            Drawable drawable = this.f2113i;
            Rect rect = this.f2108T;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = Q.b(this.f2109d);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (c1.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f2093D + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f2093D) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i7 = this.f2094E;
            int i8 = height2 - (i7 / 2);
            height = i7 + i8;
            paddingTop = i8;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f2094E + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f2094E;
        }
        this.f2096G = paddingLeft;
        this.f2097H = paddingTop;
        this.f2099J = height;
        this.f2098I = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.v) {
            StaticLayout staticLayout = this.f2102N;
            TextPaint textPaint = this.f2100L;
            if (staticLayout == null) {
                CharSequence charSequence = this.f2123s;
                this.f2102N = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f2103O == null) {
                CharSequence charSequence2 = this.f2125u;
                this.f2103O = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f2109d;
        Rect rect = this.f2108T;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f2109d.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f2109d.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.v) {
            iMax = (this.f2118n * 2) + Math.max(this.f2102N.getWidth(), this.f2103O.getWidth());
        } else {
            iMax = 0;
        }
        this.f2095F = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f2113i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f2113i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f2109d;
        if (drawable3 != null) {
            Rect rectB = Q.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        int iMax4 = this.K ? Math.max(this.f2119o, (this.f2095F * 2) + iMax2 + iMax3) : this.f2119o;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f2093D = iMax4;
        this.f2094E = iMax5;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2122r : this.f2124t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f1  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f3;
        VelocityTracker velocityTracker = this.f2090A;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i3 = this.f2127x;
        if (actionMasked != 0) {
            float f4 = 0.0f;
            if (actionMasked == 1) {
                if (this.f2126w == 2) {
                    this.f2126w = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    zIsChecked = isChecked();
                    if (z2) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f2091B) {
                            targetCheckedState = c1.a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f2126w = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i4 = this.f2126w;
                if (i4 == 1) {
                    float x3 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    float f5 = i3;
                    if (Math.abs(x3 - this.f2128y) > f5 || Math.abs(y2 - this.f2129z) > f5) {
                        this.f2126w = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f2128y = x3;
                        this.f2129z = y2;
                        return true;
                    }
                } else if (i4 == 2) {
                    float x4 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f6 = x4 - this.f2128y;
                    if (thumbScrollRange != 0) {
                        f3 = f6 / thumbScrollRange;
                    } else {
                        f3 = f6 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (c1.a(this)) {
                        f3 = -f3;
                    }
                    float f7 = this.f2092C;
                    float f8 = f3 + f7;
                    if (f8 >= 0.0f) {
                        f4 = f8 > 1.0f ? 1.0f : f8;
                    }
                    if (f4 != f7) {
                        this.f2128y = x4;
                        setThumbPosition(f4);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f2126w == 2) {
                    this.f2126w = 0;
                    if (motionEvent.getAction() == 1) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    zIsChecked = isChecked();
                    if (z2) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f2091B) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (c1.a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f2126w = 0;
                velocityTracker.clear();
            }
        } else {
            float x5 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && this.f2109d != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f2109d;
                Rect rect = this.f2108T;
                drawable.getPadding(rect);
                int i5 = this.f2097H - i3;
                int i6 = (this.f2096G + thumbOffset) - i3;
                int i7 = this.f2095F + i6 + rect.left + rect.right + i3;
                int i8 = this.f2099J + i3;
                if (x5 > i6 && x5 < i7 && y3 > i5 && y3 < i8) {
                    this.f2126w = 1;
                    this.f2128y = x5;
                    this.f2129z = y3;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        ((AbstractC0528u) getEmojiTextViewHelper().f5230b.e).c(z2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                CharSequence string = this.f2122r;
                if (string == null) {
                    string = getResources().getString(id.go.bangkalankab.simpeg.R.string.abc_capital_on);
                }
                CharSequence charSequence = string;
                Field field = D.f41a;
                new C0016q(id.go.bangkalankab.simpeg.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, charSequence);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string2 = this.f2124t;
            if (string2 == null) {
                string2 = getResources().getString(id.go.bangkalankab.simpeg.R.string.abc_capital_off);
            }
            CharSequence charSequence2 = string2;
            Field field2 = D.f41a;
            new C0016q(id.go.bangkalankab.simpeg.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, charSequence2);
        }
        if (getWindowToken() != null) {
            Field field3 = D.f41a;
            if (isLaidOut()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, U, zIsChecked ? 1.0f : 0.0f);
                this.f2105Q = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                K0.a(this.f2105Q, true);
                this.f2105Q.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f2105Q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0463j.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((AbstractC0528u) getEmojiTextViewHelper().f5230b.e).d(z2);
        setTextOnInternal(this.f2122r);
        setTextOffInternal(this.f2124t);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z2) {
        this.K = z2;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0528u) getEmojiTextViewHelper().f5230b.e).a(inputFilterArr));
    }

    public void setShowText(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            requestLayout();
            if (z2) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z2) {
        this.f2121q = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.f2119o = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f2120p = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f2100L;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f2124t;
        if (string == null) {
            string = getResources().getString(id.go.bangkalankab.simpeg.R.string.abc_capital_off);
        }
        Field field = D.f41a;
        new C0016q(id.go.bangkalankab.simpeg.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f2122r;
        if (string == null) {
            string = getResources().getString(id.go.bangkalankab.simpeg.R.string.abc_capital_on);
        }
        Field field = D.f41a;
        new C0016q(id.go.bangkalankab.simpeg.R.id.tag_state_description, CharSequence.class, 64, 30, 1).d(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2109d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2109d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.f2092C = f3;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(G2.b(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.f2118n = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.e = colorStateList;
        this.f2111g = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2110f = mode;
        this.f2112h = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2113i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2113i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(G2.b(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2114j = colorStateList;
        this.f2116l = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2115k = mode;
        this.f2117m = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2109d || drawable == this.f2113i;
    }
}
