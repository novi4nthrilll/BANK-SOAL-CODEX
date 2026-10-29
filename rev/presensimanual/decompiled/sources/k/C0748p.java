package k;

import B.C0006g;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p013d1.AbstractC0528u;

/* JADX INFO: renamed from: k.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0748p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f5229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0006g f5230b;

    public C0748p(TextView textView) {
        this.f5229a = textView;
        this.f5230b = new C0006g(textView);
    }

    public final void a(AttributeSet attributeSet, int i3) {
        TypedArray typedArrayObtainStyledAttributes = this.f5229a.getContext().obtainStyledAttributes(attributeSet, p011d.a.f3536g, i3, 0);
        try {
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            ((AbstractC0528u) this.f5230b.e).d(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
