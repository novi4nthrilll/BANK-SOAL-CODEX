package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import id.go.bangkalankab.simpeg.R;
import p013d1.O2;

/* JADX INFO: renamed from: k.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0732h extends r implements InterfaceC0736j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0734i f5162g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0732h(C0734i c0734i, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f5162g = c0734i;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        O2.a(this, getContentDescription());
        setOnTouchListener(new p032j.a(this, this));
    }

    @Override // k.InterfaceC0736j
    public final boolean a() {
        return false;
    }

    @Override // k.InterfaceC0736j
    public final boolean b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f5162g.h();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            u.a.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
