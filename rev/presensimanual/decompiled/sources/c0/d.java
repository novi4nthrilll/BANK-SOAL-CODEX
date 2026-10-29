package c0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f2577a;

    public d(Drawable.ConstantState constantState) {
        this.f2577a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f2577a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f2577a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f2577a.newDrawable();
        eVar.f2582d = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f2579g);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f2577a.newDrawable(resources);
        eVar.f2582d = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f2579g);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable drawableNewDrawable = this.f2577a.newDrawable(resources, theme);
        eVar.f2582d = drawableNewDrawable;
        drawableNewDrawable.setCallback(eVar.f2579g);
        return eVar;
    }
}
