package p018f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;
import p013d1.AbstractC0520s3;
import p045n.e;
import p045n.m;
import u.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f4392A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorFilter f4393B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f4394C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ColorStateList f4395D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f4396E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f4397F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f4398G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int[][] f4399H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public e f4400I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public m f4401J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f4402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f4403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4405d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f4406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable[] f4407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4408h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4409i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4410j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f4411k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4412l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4414n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4415o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4416p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4417q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4418r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4421u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4422w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4423x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4424y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4425z;

    public b(b bVar, e eVar, Resources resources) {
        this.f4409i = false;
        this.f4412l = false;
        this.f4422w = true;
        this.f4424y = 0;
        this.f4425z = 0;
        this.f4402a = eVar;
        this.f4403b = resources != null ? resources : bVar != null ? bVar.f4403b : null;
        int i3 = bVar != null ? bVar.f4404c : 0;
        int i4 = f.f4437p;
        i3 = resources != null ? resources.getDisplayMetrics().densityDpi : i3;
        i3 = i3 == 0 ? 160 : i3;
        this.f4404c = i3;
        if (bVar != null) {
            this.f4405d = bVar.f4405d;
            this.e = bVar.e;
            this.f4421u = true;
            this.v = true;
            this.f4409i = bVar.f4409i;
            this.f4412l = bVar.f4412l;
            this.f4422w = bVar.f4422w;
            this.f4423x = bVar.f4423x;
            this.f4424y = bVar.f4424y;
            this.f4425z = bVar.f4425z;
            this.f4392A = bVar.f4392A;
            this.f4393B = bVar.f4393B;
            this.f4394C = bVar.f4394C;
            this.f4395D = bVar.f4395D;
            this.f4396E = bVar.f4396E;
            this.f4397F = bVar.f4397F;
            this.f4398G = bVar.f4398G;
            if (bVar.f4404c == i3) {
                if (bVar.f4410j) {
                    this.f4411k = bVar.f4411k != null ? new Rect(bVar.f4411k) : null;
                    this.f4410j = true;
                }
                if (bVar.f4413m) {
                    this.f4414n = bVar.f4414n;
                    this.f4415o = bVar.f4415o;
                    this.f4416p = bVar.f4416p;
                    this.f4417q = bVar.f4417q;
                    this.f4413m = true;
                }
            }
            if (bVar.f4418r) {
                this.f4419s = bVar.f4419s;
                this.f4418r = true;
            }
            if (bVar.f4420t) {
                this.f4420t = true;
            }
            Drawable[] drawableArr = bVar.f4407g;
            this.f4407g = new Drawable[drawableArr.length];
            this.f4408h = bVar.f4408h;
            SparseArray sparseArray = bVar.f4406f;
            if (sparseArray != null) {
                this.f4406f = sparseArray.clone();
            } else {
                this.f4406f = new SparseArray(this.f4408h);
            }
            int i5 = this.f4408h;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f4406f.put(i6, constantState);
                    } else {
                        this.f4407g[i6] = drawableArr[i6];
                    }
                }
            }
        } else {
            this.f4407g = new Drawable[10];
            this.f4408h = 0;
        }
        if (bVar != null) {
            this.f4399H = bVar.f4399H;
        } else {
            this.f4399H = new int[this.f4407g.length][];
        }
        if (bVar != null) {
            this.f4400I = bVar.f4400I;
            this.f4401J = bVar.f4401J;
        } else {
            this.f4400I = new e();
            this.f4401J = new m();
        }
    }

    public final int a(Drawable drawable) {
        int i3 = this.f4408h;
        if (i3 >= this.f4407g.length) {
            int i4 = i3 + 10;
            Drawable[] drawableArr = new Drawable[i4];
            Drawable[] drawableArr2 = this.f4407g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i3);
            }
            this.f4407g = drawableArr;
            int[][] iArr = new int[i4][];
            System.arraycopy(this.f4399H, 0, iArr, 0, i3);
            this.f4399H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f4402a);
        this.f4407g[i3] = drawable;
        this.f4408h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.f4418r = false;
        this.f4420t = false;
        this.f4411k = null;
        this.f4410j = false;
        this.f4413m = false;
        this.f4421u = false;
        return i3;
    }

    public final void b() {
        this.f4413m = true;
        c();
        int i3 = this.f4408h;
        Drawable[] drawableArr = this.f4407g;
        this.f4415o = -1;
        this.f4414n = -1;
        this.f4417q = 0;
        this.f4416p = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f4414n) {
                this.f4414n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f4415o) {
                this.f4415o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f4416p) {
                this.f4416p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f4417q) {
                this.f4417q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f4406f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = this.f4406f.keyAt(i3);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f4406f.valueAt(i3);
                Drawable[] drawableArr = this.f4407g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f4403b);
                if (Build.VERSION.SDK_INT >= 23) {
                    AbstractC0520s3.b(drawableNewDrawable, this.f4423x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f4402a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f4406f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i3 = this.f4408h;
        Drawable[] drawableArr = this.f4407g;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f4406f.get(i4);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (a.b(drawable)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i3) {
        int iIndexOfKey;
        Drawable drawable = this.f4407g[i3];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f4406f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i3)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f4406f.valueAt(iIndexOfKey)).newDrawable(this.f4403b);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0520s3.b(drawableNewDrawable, this.f4423x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f4402a);
        this.f4407g[i3] = drawableMutate;
        this.f4406f.removeAt(iIndexOfKey);
        if (this.f4406f.size() == 0) {
            this.f4406f = null;
        }
        return drawableMutate;
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.f4399H;
        int i3 = this.f4408h;
        for (int i4 = 0; i4 < i3; i4++) {
            if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                return i4;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4405d | this.e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
