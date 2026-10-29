package Y;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class t extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f1911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1912b;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1911a = new Rect();
        this.f1912b = true;
    }

    public t(int i3, int i4) {
        super(i3, i4);
        this.f1911a = new Rect();
        this.f1912b = true;
    }

    public t(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1911a = new Rect();
        this.f1912b = true;
    }

    public t(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1911a = new Rect();
        this.f1912b = true;
    }

    public t(t tVar) {
        super((ViewGroup.LayoutParams) tVar);
        this.f1911a = new Rect();
        this.f1912b = true;
    }
}
