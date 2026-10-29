package p013d1;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import k.W0;
import k.Y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class O2 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            W0.a(view, charSequence);
            return;
        }
        Y0 y2 = Y0.f5119n;
        if (y2 != null && y2.f5121d == view) {
            Y0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new Y0(view, charSequence);
            return;
        }
        Y0 y3 = Y0.f5120o;
        if (y3 != null && y3.f5121d == view) {
            y3.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
