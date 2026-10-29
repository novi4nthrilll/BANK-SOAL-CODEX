package Q;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import p013d1.AbstractC0528u;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0528u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f1374a;

    public g(TextView textView) {
        this.f1374a = new f(textView);
    }

    @Override // p013d1.AbstractC0528u
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return !(O.h.f1179j != null) ? inputFilterArr : this.f1374a.a(inputFilterArr);
    }

    @Override // p013d1.AbstractC0528u
    public final boolean b() {
        return this.f1374a.f1373c;
    }

    @Override // p013d1.AbstractC0528u
    public final void c(boolean z2) {
        if (O.h.f1179j != null) {
            this.f1374a.c(z2);
        }
    }

    @Override // p013d1.AbstractC0528u
    public final void d(boolean z2) {
        boolean z3 = O.h.f1179j != null;
        f fVar = this.f1374a;
        if (z3) {
            fVar.d(z2);
        } else {
            fVar.f1373c = z2;
        }
    }

    @Override // p013d1.AbstractC0528u
    public final TransformationMethod e(TransformationMethod transformationMethod) {
        return !(O.h.f1179j != null) ? transformationMethod : this.f1374a.e(transformationMethod);
    }
}
