package B;

import android.text.TextUtils;
import android.view.View;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: B.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0016q extends AbstractC0017s {
    public final /* synthetic */ int e;

    public C0016q(int i3, Class cls, int i4, int i5, int i6) {
        this.e = i6;
        this.f97a = i3;
        this.f100d = cls;
        this.f99c = i4;
        this.f98b = i5;
    }

    @Override // B.AbstractC0017s
    public final Object b(View view) {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return AbstractC0024z.b(view);
            default:
                return B.b(view);
        }
    }

    @Override // B.AbstractC0017s
    public final void c(View view, CharSequence charSequence) {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                AbstractC0024z.h(view, charSequence);
                break;
            default:
                B.e(view, charSequence);
                break;
        }
    }

    @Override // B.AbstractC0017s
    public final boolean e(Object obj, CharSequence charSequence) {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                break;
        }
        return !TextUtils.equals((CharSequence) obj, charSequence);
    }
}
