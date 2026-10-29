package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import id.go.bangkalankab.simpeg.R;
import p013d1.G2;

/* JADX INFO: renamed from: k.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0750q extends ImageButton {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0744n f5231d;
    public final F1.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5232f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0750q(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        M0.a(context);
        this.f5232f = false;
        L0.a(this, getContext());
        C0744n c0744n = new C0744n(this);
        this.f5231d = c0744n;
        c0744n.b(null, R.attr.toolbarNavigationButtonStyle);
        F1.c cVar = new F1.c(this);
        this.e = cVar;
        cVar.b(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0744n c0744n = this.f5231d;
        if (c0744n != null) {
            c0744n.a();
        }
        F1.c cVar = this.e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        Z.d dVar;
        C0744n c0744n = this.f5231d;
        if (c0744n == null || (dVar = c0744n.e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f1941c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        Z.d dVar;
        C0744n c0744n = this.f5231d;
        if (c0744n == null || (dVar = c0744n.e) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f1942d;
    }

    public ColorStateList getSupportImageTintList() {
        Z.d dVar;
        F1.c cVar = this.e;
        if (cVar == null || (dVar = (Z.d) cVar.f281f) == null) {
            return null;
        }
        return (ColorStateList) dVar.f1941c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        Z.d dVar;
        F1.c cVar = this.e;
        if (cVar == null || (dVar = (Z.d) cVar.f281f) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f1942d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.e.e).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0744n c0744n = this.f5231d;
        if (c0744n != null) {
            c0744n.f5217c = -1;
            c0744n.d(null);
            c0744n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0744n c0744n = this.f5231d;
        if (c0744n != null) {
            c0744n.c(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        F1.c cVar = this.e;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        F1.c cVar = this.e;
        if (cVar != null && drawable != null && !this.f5232f) {
            cVar.f280d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (cVar != null) {
            cVar.a();
            if (this.f5232f) {
                return;
            }
            ImageView imageView = (ImageView) cVar.e;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(cVar.f280d);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f5232f = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        F1.c cVar = this.e;
        ImageView imageView = (ImageView) cVar.e;
        if (i3 != 0) {
            Drawable drawableB = G2.b(imageView.getContext(), i3);
            if (drawableB != null) {
                Q.a(drawableB);
            }
            imageView.setImageDrawable(drawableB);
        } else {
            imageView.setImageDrawable(null);
        }
        cVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        F1.c cVar = this.e;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0744n c0744n = this.f5231d;
        if (c0744n != null) {
            c0744n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0744n c0744n = this.f5231d;
        if (c0744n != null) {
            c0744n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        F1.c cVar = this.e;
        if (cVar != null) {
            if (((Z.d) cVar.f281f) == null) {
                cVar.f281f = new Z.d();
            }
            Z.d dVar = (Z.d) cVar.f281f;
            dVar.f1941c = colorStateList;
            dVar.f1940b = true;
            cVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        F1.c cVar = this.e;
        if (cVar != null) {
            if (((Z.d) cVar.f281f) == null) {
                cVar.f281f = new Z.d();
            }
            Z.d dVar = (Z.d) cVar.f281f;
            dVar.f1942d = mode;
            dVar.f1939a = true;
            cVar.a();
        }
    }
}
