package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import k.E;
import k.InterfaceC0736j;
import p013d1.O2;
import p032j.a;
import p032j.b;
import p032j.h;
import p032j.i;
import p032j.j;
import p032j.q;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends E implements q, View.OnClickListener, InterfaceC0736j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j f1960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f1961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f1962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h f1963n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f1964o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f1965p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1966q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f1968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1969t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f1970u;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1966q = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p011d.a.f3533c, 0, 0);
        this.f1968s = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1970u = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1969t = -1;
        setSaveEnabled(false);
    }

    @Override // k.InterfaceC0736j
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // k.InterfaceC0736j
    public final boolean b() {
        return !TextUtils.isEmpty(getText()) && this.f1960k.getIcon() == null;
    }

    @Override // p032j.q
    public final void c(j jVar) {
        this.f1960k = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitleCondensed());
        setId(jVar.f4936a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f1964o == null) {
            this.f1964o = new a(this);
        }
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        return i3 >= 480 || (i3 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p032j.q
    public j getItemData() {
        return this.f1960k;
    }

    public final void h() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1961l);
        if (this.f1962m != null && ((this.f1960k.f4958y & 4) != 4 || (!this.f1966q && !this.f1967r))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1961l : null);
        CharSequence charSequence = this.f1960k.f4951q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1960k.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1960k.f4952r;
        if (TextUtils.isEmpty(charSequence2)) {
            O2.a(this, z4 ? null : this.f1960k.e);
        } else {
            O2.a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f1963n;
        if (hVar != null) {
            hVar.a(this.f1960k);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1966q = g();
        h();
    }

    @Override // k.E, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i5 = this.f1969t) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i6 = this.f1968s;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i6) : i6;
        if (mode != 1073741824 && i6 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i4);
        }
        if (!zIsEmpty || this.f1962m == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1962m.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f1960k.hasSubMenu() && (aVar = this.f1964o) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1967r != z2) {
            this.f1967r = z2;
            j jVar = this.f1960k;
            if (jVar != null) {
                i iVar = jVar.f4948n;
                iVar.f4924k = true;
                iVar.o(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1962m = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f1970u;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(h hVar) {
        this.f1963n = hVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i4, int i5, int i6) {
        this.f1969t = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(b bVar) {
        this.f1965p = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1961l = charSequence;
        h();
    }
}
