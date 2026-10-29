package c0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p013d1.AbstractC0491n3;
import p013d1.AbstractC0520s3;

/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final PorterDuff.Mode f2633m = PorterDuff.Mode.SRC_IN;
    public o e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuffColorFilter f2634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorFilter f2635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float[] f2638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Matrix f2639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Rect f2640l;

    public q() {
        this.f2637i = true;
        this.f2638j = new float[9];
        this.f2639k = new Matrix();
        this.f2640l = new Rect();
        o oVar = new o();
        oVar.f2623c = null;
        oVar.f2624d = f2633m;
        oVar.f2622b = new n();
        this.e = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2582d;
        if (drawable == null) {
            return false;
        }
        u.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f2640l;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2635g;
        if (colorFilter == null) {
            colorFilter = this.f2634f;
        }
        Matrix matrix = this.f2639k;
        canvas.getMatrix(matrix);
        float[] fArr = this.f2638j;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC0520s3.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.e;
        Bitmap bitmap = oVar.f2625f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f2625f.getHeight()) {
            oVar.f2625f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f2630k = true;
        }
        if (this.f2637i) {
            o oVar2 = this.e;
            if (oVar2.f2630k || oVar2.f2626g != oVar2.f2623c || oVar2.f2627h != oVar2.f2624d || oVar2.f2629j != oVar2.e || oVar2.f2628i != oVar2.f2622b.getRootAlpha()) {
                o oVar3 = this.e;
                oVar3.f2625f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f2625f);
                n nVar = oVar3.f2622b;
                nVar.a(nVar.f2612g, n.f2606p, canvas2, iMin, iMin2);
                o oVar4 = this.e;
                oVar4.f2626g = oVar4.f2623c;
                oVar4.f2627h = oVar4.f2624d;
                oVar4.f2628i = oVar4.f2622b.getRootAlpha();
                oVar4.f2629j = oVar4.e;
                oVar4.f2630k = false;
            }
        } else {
            o oVar5 = this.e;
            oVar5.f2625f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f2625f);
            n nVar2 = oVar5.f2622b;
            nVar2.a(nVar2.f2612g, n.f2606p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.e;
        if (oVar6.f2622b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.f2631l == null) {
                Paint paint2 = new Paint();
                oVar6.f2631l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.f2631l.setAlpha(oVar6.f2622b.getRootAlpha());
            oVar6.f2631l.setColorFilter(colorFilter);
            paint = oVar6.f2631l;
        }
        canvas.drawBitmap(oVar6.f2625f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.getAlpha() : this.e.f2622b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.e.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2582d;
        return drawable != null ? u.a.c(drawable) : this.f2635g;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2582d != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f2582d.getConstantState());
        }
        this.e.f2621a = getChangingConfigurations();
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.e.f2622b.f2614i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.e.f2622b.f2613h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.isAutoMirrored() : this.e.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o oVar = this.e;
            if (oVar != null) {
                n nVar = oVar.f2622b;
                if (nVar.f2619n == null) {
                    nVar.f2619n = Boolean.valueOf(nVar.f2612g.a());
                }
                if (nVar.f2619n.booleanValue() || ((colorStateList = this.e.f2623c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2636h && super.mutate() == this) {
            o oVar = this.e;
            o oVar2 = new o();
            oVar2.f2623c = null;
            oVar2.f2624d = f2633m;
            if (oVar != null) {
                oVar2.f2621a = oVar.f2621a;
                n nVar = new n(oVar.f2622b);
                oVar2.f2622b = nVar;
                if (oVar.f2622b.e != null) {
                    nVar.e = new Paint(oVar.f2622b.e);
                }
                if (oVar.f2622b.f2610d != null) {
                    oVar2.f2622b.f2610d = new Paint(oVar.f2622b.f2610d);
                }
                oVar2.f2623c = oVar.f2623c;
                oVar2.f2624d = oVar.f2624d;
                oVar2.e = oVar.e;
            }
            this.e = oVar2;
            this.f2636h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.e;
        ColorStateList colorStateList = oVar.f2623c;
        if (colorStateList == null || (mode = oVar.f2624d) == null) {
            z2 = false;
        } else {
            this.f2634f = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        n nVar = oVar.f2622b;
        if (nVar.f2619n == null) {
            nVar.f2619n = Boolean.valueOf(nVar.f2612g.a());
        }
        if (nVar.f2619n.booleanValue()) {
            boolean zB = oVar.f2622b.f2612g.b(iArr);
            oVar.f2630k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else if (this.e.f2622b.getRootAlpha() != i3) {
            this.e.f2622b.setRootAlpha(i3);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.e.e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2635g = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            AbstractC0520s3.c(drawable, i3);
        } else {
            setTintList(ColorStateList.valueOf(i3));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            u.a.h(drawable, colorStateList);
            return;
        }
        o oVar = this.e;
        if (oVar.f2623c != colorStateList) {
            oVar.f2623c = colorStateList;
            this.f2634f = a(colorStateList, oVar.f2624d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            u.a.i(drawable, mode);
            return;
        }
        o oVar = this.e;
        if (oVar.f2624d != mode) {
            oVar.f2624d = mode;
            this.f2634f = a(oVar.f2623c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f2582d;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        n nVar;
        int i3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f2582d;
        if (drawable != null) {
            u.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.e;
        oVar.f2622b = new n();
        TypedArray typedArrayH = p060s.b.h(resources, theme, attributeSet, a.f2562a);
        o oVar2 = this.e;
        n nVar2 = oVar2.f2622b;
        int i4 = !p060s.b.e(xmlPullParser, "tintMode") ? -1 : typedArrayH.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f2624d = mode;
        int i5 = 1;
        ColorStateList colorStateListA = null;
        if (p060s.b.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayH.getValue(1, typedValue);
            int i6 = typedValue.type;
            if (i6 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i6 >= 28 && i6 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayH.getResources();
                int resourceId = typedArrayH.getResourceId(1, 0);
                ThreadLocal threadLocal = p060s.c.f5636a;
                try {
                    colorStateListA = p060s.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            oVar2.f2623c = colorStateList;
        }
        boolean z2 = oVar2.e;
        if (p060s.b.e(xmlPullParser, "autoMirrored")) {
            z2 = typedArrayH.getBoolean(5, z2);
        }
        oVar2.e = z2;
        float f3 = nVar2.f2615j;
        if (p060s.b.e(xmlPullParser, "viewportWidth")) {
            f3 = typedArrayH.getFloat(7, f3);
        }
        nVar2.f2615j = f3;
        float f4 = nVar2.f2616k;
        if (p060s.b.e(xmlPullParser, "viewportHeight")) {
            f4 = typedArrayH.getFloat(8, f4);
        }
        nVar2.f2616k = f4;
        if (nVar2.f2615j <= 0.0f) {
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > 0.0f) {
            nVar2.f2613h = typedArrayH.getDimension(3, nVar2.f2613h);
            float dimension = typedArrayH.getDimension(2, nVar2.f2614i);
            nVar2.f2614i = dimension;
            if (nVar2.f2613h <= 0.0f) {
                throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (p060s.b.e(xmlPullParser, "alpha")) {
                    alpha = typedArrayH.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = typedArrayH.getString(0);
                if (string != null) {
                    nVar2.f2618m = string;
                    nVar2.f2620o.put(string, nVar2);
                }
                typedArrayH.recycle();
                oVar.f2621a = getChangingConfigurations();
                oVar.f2630k = true;
                o oVar3 = this.e;
                n nVar3 = oVar3.f2622b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f2612g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i7 = 3; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i7); i7 = 3) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i3 = depth;
                        p045n.b bVar = nVar3.f2620o;
                        if (zEquals) {
                            j jVar = new j();
                            jVar.e = 0.0f;
                            jVar.f2585g = 1.0f;
                            jVar.f2586h = 1.0f;
                            jVar.f2587i = 0.0f;
                            jVar.f2588j = 1.0f;
                            jVar.f2589k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.f2590l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            jVar.f2591m = join3;
                            nVar = nVar3;
                            jVar.f2592n = 4.0f;
                            TypedArray typedArrayH2 = p060s.b.h(resources, theme, attributeSet, a.f2564c);
                            if (p060s.b.e(xmlPullParser, "pathData")) {
                                String string2 = typedArrayH2.getString(0);
                                if (string2 != null) {
                                    jVar.f2604b = string2;
                                }
                                String string3 = typedArrayH2.getString(2);
                                if (string3 != null) {
                                    jVar.f2603a = AbstractC0491n3.c(string3);
                                }
                                jVar.f2584f = p060s.b.b(typedArrayH2, xmlPullParser, theme, "fillColor", 1);
                                float f5 = jVar.f2586h;
                                if (p060s.b.e(xmlPullParser, "fillAlpha")) {
                                    f5 = typedArrayH2.getFloat(12, f5);
                                }
                                jVar.f2586h = f5;
                                int i8 = !p060s.b.e(xmlPullParser, "strokeLineCap") ? -1 : typedArrayH2.getInt(8, -1);
                                Paint.Cap cap3 = jVar.f2590l;
                                if (i8 != 0) {
                                    join = join3;
                                    if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                jVar.f2590l = cap;
                                int i9 = !p060s.b.e(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayH2.getInt(9, -1);
                                Paint.Join join4 = jVar.f2591m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                jVar.f2591m = join2;
                                float f6 = jVar.f2592n;
                                if (p060s.b.e(xmlPullParser, "strokeMiterLimit")) {
                                    f6 = typedArrayH2.getFloat(10, f6);
                                }
                                jVar.f2592n = f6;
                                jVar.f2583d = p060s.b.b(typedArrayH2, xmlPullParser, theme, "strokeColor", 3);
                                float f7 = jVar.f2585g;
                                if (p060s.b.e(xmlPullParser, "strokeAlpha")) {
                                    f7 = typedArrayH2.getFloat(11, f7);
                                }
                                jVar.f2585g = f7;
                                float f8 = jVar.e;
                                if (p060s.b.e(xmlPullParser, "strokeWidth")) {
                                    f8 = typedArrayH2.getFloat(4, f8);
                                }
                                jVar.e = f8;
                                float f9 = jVar.f2588j;
                                if (p060s.b.e(xmlPullParser, "trimPathEnd")) {
                                    f9 = typedArrayH2.getFloat(6, f9);
                                }
                                jVar.f2588j = f9;
                                float f10 = jVar.f2589k;
                                if (p060s.b.e(xmlPullParser, "trimPathOffset")) {
                                    f10 = typedArrayH2.getFloat(7, f10);
                                }
                                jVar.f2589k = f10;
                                float f11 = jVar.f2587i;
                                if (p060s.b.e(xmlPullParser, "trimPathStart")) {
                                    f11 = typedArrayH2.getFloat(5, f11);
                                }
                                jVar.f2587i = f11;
                                int i10 = jVar.f2605c;
                                if (p060s.b.e(xmlPullParser, "fillType")) {
                                    i10 = typedArrayH2.getInt(13, i10);
                                }
                                jVar.f2605c = i10;
                            }
                            typedArrayH2.recycle();
                            kVar.f2594b.add(jVar);
                            if (jVar.getPathName() != null) {
                                bVar.put(jVar.getPathName(), jVar);
                            }
                            oVar3.f2621a = oVar3.f2621a;
                            z3 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (p060s.b.e(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayH3 = p060s.b.h(resources, theme, attributeSet, a.f2565d);
                                    String string4 = typedArrayH3.getString(0);
                                    if (string4 != null) {
                                        iVar.f2604b = string4;
                                    }
                                    String string5 = typedArrayH3.getString(1);
                                    if (string5 != null) {
                                        iVar.f2603a = AbstractC0491n3.c(string5);
                                    }
                                    iVar.f2605c = !p060s.b.e(xmlPullParser, "fillType") ? 0 : typedArrayH3.getInt(2, 0);
                                    typedArrayH3.recycle();
                                }
                                kVar.f2594b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    bVar.put(iVar.getPathName(), iVar);
                                }
                                oVar3.f2621a = oVar3.f2621a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray typedArrayH4 = p060s.b.h(resources, theme, attributeSet, a.f2563b);
                                float f12 = kVar2.f2595c;
                                if (p060s.b.e(xmlPullParser, "rotation")) {
                                    f12 = typedArrayH4.getFloat(5, f12);
                                }
                                kVar2.f2595c = f12;
                                kVar2.f2596d = typedArrayH4.getFloat(1, kVar2.f2596d);
                                kVar2.e = typedArrayH4.getFloat(2, kVar2.e);
                                float f13 = kVar2.f2597f;
                                if (p060s.b.e(xmlPullParser, "scaleX")) {
                                    f13 = typedArrayH4.getFloat(3, f13);
                                }
                                kVar2.f2597f = f13;
                                float f14 = kVar2.f2598g;
                                if (p060s.b.e(xmlPullParser, "scaleY")) {
                                    f14 = typedArrayH4.getFloat(4, f14);
                                }
                                kVar2.f2598g = f14;
                                float f15 = kVar2.f2599h;
                                if (p060s.b.e(xmlPullParser, "translateX")) {
                                    f15 = typedArrayH4.getFloat(6, f15);
                                }
                                kVar2.f2599h = f15;
                                float f16 = kVar2.f2600i;
                                if (p060s.b.e(xmlPullParser, "translateY")) {
                                    f16 = typedArrayH4.getFloat(7, f16);
                                }
                                kVar2.f2600i = f16;
                                String string6 = typedArrayH4.getString(0);
                                if (string6 != null) {
                                    kVar2.f2602k = string6;
                                }
                                kVar2.c();
                                typedArrayH4.recycle();
                                kVar.f2594b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    bVar.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f2621a = oVar3.f2621a;
                            }
                        }
                    } else {
                        nVar = nVar3;
                        i3 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i3;
                    nVar3 = nVar;
                    i5 = 1;
                }
                if (!z3) {
                    this.f2634f = a(oVar.f2623c, oVar.f2624d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayH.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f2637i = true;
        this.f2638j = new float[9];
        this.f2639k = new Matrix();
        this.f2640l = new Rect();
        this.e = oVar;
        this.f2634f = a(oVar.f2623c, oVar.f2624d);
    }
}
