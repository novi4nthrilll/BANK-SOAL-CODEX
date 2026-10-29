package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p013d1.AbstractC0463j;
import p013d1.G2;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z.d f5007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Z.d f5008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z.d f5009d;
    public Z.d e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z.d f5010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Z.d f5011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Z.d f5012h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final L f5013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5014j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5015k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f5016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5017m;

    public B(TextView textView) {
        this.f5006a = textView;
        this.f5013i = new L(textView);
    }

    public static Z.d c(Context context, C0746o c0746o, int i3) {
        ColorStateList colorStateListI;
        synchronized (c0746o) {
            colorStateListI = c0746o.f5226a.i(context, i3);
        }
        if (colorStateListI == null) {
            return null;
        }
        Z.d dVar = new Z.d();
        dVar.f1940b = true;
        dVar.f1941c = colorStateListI;
        return dVar;
    }

    public final void a(Drawable drawable, Z.d dVar) {
        if (drawable == null || dVar == null) {
            return;
        }
        C0746o.c(drawable, dVar, this.f5006a.getDrawableState());
    }

    public final void b() {
        Z.d dVar = this.f5007b;
        TextView textView = this.f5006a;
        if (dVar != null || this.f5008c != null || this.f5009d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f5007b);
            a(compoundDrawables[1], this.f5008c);
            a(compoundDrawables[2], this.f5009d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f5010f == null && this.f5011g == null) {
            return;
        }
        Drawable[] drawableArrA = AbstractC0761w.a(textView);
        a(drawableArrA[0], this.f5010f);
        a(drawableArrA[2], this.f5011g);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(AttributeSet attributeSet, int i3) {
        C0746o c0746o;
        String string;
        String string2;
        boolean z2;
        boolean z3;
        ColorStateList colorStateListB;
        ColorStateList colorStateListB2;
        ColorStateList colorStateListB3;
        boolean z4;
        C0746o c0746o2;
        int i4;
        int i5;
        float fApplyDimension;
        ColorStateList colorStateList;
        int resourceId;
        int i6;
        int resourceId2;
        int i7;
        int i8;
        int i9;
        TextView textView = this.f5006a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C0746o.f5224b;
        synchronized (C0746o.class) {
            try {
                if (C0746o.f5225c == null) {
                    C0746o.b();
                }
                c0746o = C0746o.f5225c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = p011d.a.f3535f;
        D0.b bVarL = D0.b.L(context, attributeSet, iArr, i3);
        TextView textView2 = this.f5006a;
        B.D.c(textView2, textView2.getContext(), iArr, attributeSet, (TypedArray) bVarL.f182f, i3);
        TypedArray typedArray = (TypedArray) bVarL.f182f;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f5007b = c(context, c0746o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f5008c = c(context, c0746o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f5009d = c(context, c0746o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, c0746o, typedArray.getResourceId(2, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f5010f = c(context, c0746o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f5011g = c(context, c0746o, typedArray.getResourceId(6, 0));
        }
        bVarL.O();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = p011d.a.f3548s;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            D0.b bVar = new D0.b(context, typedArrayObtainStyledAttributes);
            if (z5 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            f(context, bVar);
            if (i10 < 23) {
                if (typedArrayObtainStyledAttributes.hasValue(3)) {
                    colorStateListB = bVar.B(3);
                    i8 = 4;
                } else {
                    i8 = 4;
                    colorStateListB = null;
                }
                if (typedArrayObtainStyledAttributes.hasValue(i8)) {
                    colorStateListB2 = bVar.B(i8);
                    i9 = 5;
                } else {
                    i9 = 5;
                    colorStateListB2 = null;
                }
                colorStateListB3 = typedArrayObtainStyledAttributes.hasValue(i9) ? bVar.B(i9) : null;
                if (typedArrayObtainStyledAttributes.hasValue(15)) {
                    string2 = typedArrayObtainStyledAttributes.getString(15);
                    i7 = 26;
                } else {
                    i7 = 26;
                    string2 = null;
                }
                if (i10 >= i7 || !typedArrayObtainStyledAttributes.hasValue(13)) {
                    string = null;
                } else {
                    string = typedArrayObtainStyledAttributes.getString(13);
                }
                bVar.O();
            } else {
                colorStateListB = null;
                colorStateListB2 = null;
            }
            if (typedArrayObtainStyledAttributes.hasValue(15)) {
                string2 = typedArrayObtainStyledAttributes.getString(15);
                i7 = 26;
            } else {
                i7 = 26;
                string2 = null;
            }
            if (i10 >= i7) {
                string = null;
            } else {
                string = null;
            }
            bVar.O();
        } else {
            string = null;
            string2 = null;
            z2 = false;
            z3 = false;
            colorStateListB = null;
            colorStateListB2 = null;
            colorStateListB3 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        D0.b bVar2 = new D0.b(context, typedArrayObtainStyledAttributes2);
        if (z5 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z4 = z3;
        } else {
            z4 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        if (i10 < 23) {
            if (typedArrayObtainStyledAttributes2.hasValue(3)) {
                colorStateListB = bVar2.B(3);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                colorStateListB2 = bVar2.B(4);
            }
            if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                colorStateListB3 = bVar2.B(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListB;
        ColorStateList colorStateList3 = colorStateListB2;
        ColorStateList colorStateList4 = colorStateListB3;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i10 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i10 < 28 || !typedArrayObtainStyledAttributes2.hasValue(0)) {
            c0746o2 = c0746o;
        } else {
            c0746o2 = c0746o;
            if (typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
                textView.setTextSize(0, 0.0f);
            }
        }
        f(context, bVar2);
        bVar2.O();
        if (colorStateList2 != null) {
            textView.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            textView.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            textView.setLinkTextColor(colorStateList4);
        }
        if (!z5 && z2) {
            this.f5006a.setAllCaps(z4);
        }
        Typeface typeface = this.f5016l;
        if (typeface != null) {
            if (this.f5015k == -1) {
                textView.setTypeface(typeface, this.f5014j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0767z.d(textView, string);
        }
        if (string2 == null) {
            i4 = 0;
        } else if (i10 >= 24) {
            AbstractC0765y.b(textView, AbstractC0765y.a(string2));
            i4 = 0;
        } else {
            i4 = 0;
            AbstractC0761w.c(textView, AbstractC0763x.a(string2.split(",")[0]));
        }
        int[] iArr3 = p011d.a.f3536g;
        L l3 = this.f5013i;
        Context context2 = l3.f5064j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i3, i4);
        TextView textView3 = l3.f5063i;
        B.D.c(textView3, textView3.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i3);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            l3.f5056a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(1)) {
            fApplyDimension = typedArrayObtainStyledAttributes3.getDimension(1, -1.0f);
            i5 = 3;
        } else {
            i5 = 3;
            fApplyDimension = -1.0f;
        }
        if (typedArrayObtainStyledAttributes3.hasValue(i5) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(i5, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i11 = 0; i11 < length; i11++) {
                    iArr4[i11] = typedArrayObtainTypedArray.getDimensionPixelSize(i11, -1);
                }
                l3.f5060f = L.b(iArr4);
                l3.h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (l3.f5056a == 1) {
            if (!l3.f5061g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (fApplyDimension == -1.0f) {
                    fApplyDimension = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                l3.i(dimension2, fApplyDimension, dimension);
            }
            l3.g();
        }
        if (c1.f5156a && l3.f5056a != 0) {
            int[] iArr5 = l3.f5060f;
            if (iArr5.length > 0) {
                if (AbstractC0767z.a(textView) != -1.0f) {
                    AbstractC0767z.b(textView, Math.round(l3.f5059d), Math.round(l3.e), Math.round(l3.f5058c), 0);
                } else {
                    AbstractC0767z.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        C0746o c0746o3 = c0746o2;
        Drawable drawableA = resourceId4 != -1 ? c0746o3.a(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableA2 = resourceId5 != -1 ? c0746o3.a(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableA3 = resourceId6 != -1 ? c0746o3.a(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableA4 = resourceId7 != -1 ? c0746o3.a(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableA5 = resourceId8 != -1 ? c0746o3.a(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableA6 = resourceId9 != -1 ? c0746o3.a(context, resourceId9) : null;
        if (drawableA5 != null || drawableA6 != null) {
            Drawable[] drawableArrA = AbstractC0761w.a(textView);
            if (drawableA5 == null) {
                drawableA5 = drawableArrA[0];
            }
            if (drawableA2 == null) {
                drawableA2 = drawableArrA[1];
            }
            if (drawableA6 == null) {
                drawableA6 = drawableArrA[2];
            }
            if (drawableA4 == null) {
                drawableA4 = drawableArrA[3];
            }
            AbstractC0761w.b(textView, drawableA5, drawableA2, drawableA6, drawableA4);
        } else if (drawableA != null || drawableA2 != null || drawableA3 != null || drawableA4 != null) {
            Drawable[] drawableArrA2 = AbstractC0761w.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableA == null) {
                    drawableA = compoundDrawables[0];
                }
                if (drawableA2 == null) {
                    drawableA2 = compoundDrawables[1];
                }
                if (drawableA3 == null) {
                    drawableA3 = compoundDrawables[2];
                }
                if (drawableA4 == null) {
                    drawableA4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableA, drawableA2, drawableA3, drawableA4);
            } else {
                if (drawableA2 == null) {
                    drawableA2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableA4 == null) {
                    drawableA4 = drawableArrA2[3];
                }
                AbstractC0761w.b(textView, drawable, drawableA2, drawable2, drawableA4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = G2.a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                G.l.f(textView, colorStateList);
            } else if (textView instanceof G.p) {
                ((G.p) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeC = Q.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                G.l.g(textView, modeC);
            } else if (textView instanceof G.p) {
                ((G.p) textView).setSupportCompoundDrawablesTintMode(modeC);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            AbstractC0463j.b(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            AbstractC0463j.c(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void e(Context context, int i3) {
        String string;
        ColorStateList colorStateListB;
        ColorStateList colorStateListB2;
        ColorStateList colorStateListB3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i3, p011d.a.f3548s);
        D0.b bVar = new D0.b(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f5006a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            if (typedArrayObtainStyledAttributes.hasValue(3) && (colorStateListB3 = bVar.B(3)) != null) {
                textView.setTextColor(colorStateListB3);
            }
            if (typedArrayObtainStyledAttributes.hasValue(5) && (colorStateListB2 = bVar.B(5)) != null) {
                textView.setLinkTextColor(colorStateListB2);
            }
            if (typedArrayObtainStyledAttributes.hasValue(4) && (colorStateListB = bVar.B(4)) != null) {
                textView.setHintTextColor(colorStateListB);
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, bVar);
        if (i4 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0767z.d(textView, string);
        }
        bVar.O();
        Typeface typeface = this.f5016l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f5014j);
        }
    }

    public final void f(Context context, D0.b bVar) {
        String string;
        int i3 = this.f5014j;
        TypedArray typedArray = (TypedArray) bVar.f182f;
        this.f5014j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f5015k = i5;
            if (i5 != -1) {
                this.f5014j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f5017m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f5016l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f5016l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f5016l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f5016l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f5015k;
        int i9 = this.f5014j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceD = bVar.D(i7, this.f5014j, new C0757u(this, i8, i9, new WeakReference(this.f5006a)));
                if (typefaceD != null) {
                    if (i4 < 28 || this.f5015k == -1) {
                        this.f5016l = typefaceD;
                    } else {
                        this.f5016l = A.a(Typeface.create(typefaceD, 0), this.f5015k, (this.f5014j & 2) != 0);
                    }
                }
                this.f5017m = this.f5016l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5016l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f5015k == -1) {
            this.f5016l = Typeface.create(string, this.f5014j);
        } else {
            this.f5016l = A.a(Typeface.create(string, 0), this.f5015k, (this.f5014j & 2) != 0);
        }
    }
}
