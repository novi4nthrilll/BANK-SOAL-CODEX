package k;

import B.AbstractC0020v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: k.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0744n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0746o f5216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5217c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Z.d f5218d;
    public Z.d e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z.d f5219f;

    public C0744n(View view) {
        C0746o c0746o;
        this.f5215a = view;
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
        this.f5216b = c0746o;
    }

    public final void a() {
        View view = this.f5215a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 21 ? i3 == 21 : this.f5218d != null) {
                if (this.f5219f == null) {
                    this.f5219f = new Z.d();
                }
                Z.d dVar = this.f5219f;
                dVar.f1941c = null;
                dVar.f1940b = false;
                dVar.f1942d = null;
                dVar.f1939a = false;
                Field field = B.D.f41a;
                ColorStateList colorStateListG = AbstractC0020v.g(view);
                if (colorStateListG != null) {
                    dVar.f1940b = true;
                    dVar.f1941c = colorStateListG;
                }
                PorterDuff.Mode modeH = AbstractC0020v.h(view);
                if (modeH != null) {
                    dVar.f1939a = true;
                    dVar.f1942d = modeH;
                }
                if (dVar.f1940b || dVar.f1939a) {
                    C0746o.c(background, dVar, view.getDrawableState());
                    return;
                }
            }
            Z.d dVar2 = this.e;
            if (dVar2 != null) {
                C0746o.c(background, dVar2, view.getDrawableState());
                return;
            }
            Z.d dVar3 = this.f5218d;
            if (dVar3 != null) {
                C0746o.c(background, dVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i3) {
        ColorStateList colorStateListI;
        View view = this.f5215a;
        Context context = view.getContext();
        int[] iArr = p011d.a.f3550u;
        D0.b bVarL = D0.b.L(context, attributeSet, iArr, i3);
        TypedArray typedArray = (TypedArray) bVarL.f182f;
        View view2 = this.f5215a;
        B.D.c(view2, view2.getContext(), iArr, attributeSet, (TypedArray) bVarL.f182f, i3);
        try {
            if (typedArray.hasValue(0)) {
                this.f5217c = typedArray.getResourceId(0, -1);
                C0746o c0746o = this.f5216b;
                Context context2 = view.getContext();
                int i4 = this.f5217c;
                synchronized (c0746o) {
                    colorStateListI = c0746o.f5226a.i(context2, i4);
                }
                if (colorStateListI != null) {
                    d(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                ColorStateList colorStateListB = bVarL.B(1);
                int i5 = Build.VERSION.SDK_INT;
                AbstractC0020v.q(view, colorStateListB);
                if (i5 == 21) {
                    Drawable background = view.getBackground();
                    boolean z2 = (AbstractC0020v.g(view) == null && AbstractC0020v.h(view) == null) ? false : true;
                    if (background != null && z2) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        view.setBackground(background);
                    }
                }
            }
            if (typedArray.hasValue(2)) {
                PorterDuff.Mode modeC = Q.c(typedArray.getInt(2, -1), null);
                int i6 = Build.VERSION.SDK_INT;
                AbstractC0020v.r(view, modeC);
                if (i6 == 21) {
                    Drawable background2 = view.getBackground();
                    boolean z3 = (AbstractC0020v.g(view) == null && AbstractC0020v.h(view) == null) ? false : true;
                    if (background2 != null && z3) {
                        if (background2.isStateful()) {
                            background2.setState(view.getDrawableState());
                        }
                        view.setBackground(background2);
                    }
                }
            }
            bVarL.O();
        } catch (Throwable th) {
            bVarL.O();
            throw th;
        }
    }

    public final void c(int i3) {
        ColorStateList colorStateListI;
        this.f5217c = i3;
        C0746o c0746o = this.f5216b;
        if (c0746o != null) {
            Context context = this.f5215a.getContext();
            synchronized (c0746o) {
                colorStateListI = c0746o.f5226a.i(context, i3);
            }
        } else {
            colorStateListI = null;
        }
        d(colorStateListI);
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f5218d == null) {
                this.f5218d = new Z.d();
            }
            Z.d dVar = this.f5218d;
            dVar.f1941c = colorStateList;
            dVar.f1940b = true;
        } else {
            this.f5218d = null;
        }
        a();
    }

    public final void e(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new Z.d();
        }
        Z.d dVar = this.e;
        dVar.f1941c = colorStateList;
        dVar.f1940b = true;
        a();
    }

    public final void f(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new Z.d();
        }
        Z.d dVar = this.e;
        dVar.f1942d = mode;
        dVar.f1939a = true;
        a();
    }
}
