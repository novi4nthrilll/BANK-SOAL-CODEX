package u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f5746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f5747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f5748d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i3 = this.f5745a;
        Drawable.ConstantState constantState = this.f5746b;
        return i3 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        i iVar = new i();
        iVar.f5742g = this;
        Drawable.ConstantState constantState = this.f5746b;
        if (constantState != null) {
            iVar.h(constantState.newDrawable(resources));
        }
        i.a();
        return iVar;
    }
}
