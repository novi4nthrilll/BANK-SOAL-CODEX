package k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class V0 implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f5094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f5096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f5097d;
    public Drawable e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f5098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f5100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f5101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f5102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Window.Callback f5103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f5105m;

    public final void a(int i3) {
        View view;
        int i4 = this.f5095b ^ i3;
        this.f5095b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    b();
                }
                int i5 = this.f5095b & 4;
                Toolbar toolbar = this.f5094a;
                if (i5 != 0) {
                    Drawable drawable = this.f5098f;
                    if (drawable == null) {
                        drawable = this.f5105m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                c();
            }
            int i6 = i4 & 8;
            Toolbar toolbar2 = this.f5094a;
            if (i6 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.f5100h);
                    toolbar2.setSubtitle(this.f5101i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f5096c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public final void b() {
        if ((this.f5095b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f5102j);
            Toolbar toolbar = this.f5094a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f5104l);
            } else {
                toolbar.setNavigationContentDescription(this.f5102j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i3 = this.f5095b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.f5097d;
        }
        this.f5094a.setLogo(drawable);
    }
}
