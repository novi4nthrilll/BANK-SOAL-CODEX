package k;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: k.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0757u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f5254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B f5255d;

    public C0757u(B b3, int i3, int i4, WeakReference weakReference) {
        this.f5255d = b3;
        this.f5252a = i3;
        this.f5253b = i4;
        this.f5254c = weakReference;
    }

    public final void a() {
        new Handler(Looper.getMainLooper()).post(new M1.c(11, this));
    }

    public final void b(Typeface typeface) {
        int i3;
        if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f5252a) != -1) {
            typeface = A.a(typeface, i3, (this.f5253b & 2) != 0);
        }
        B b3 = this.f5255d;
        if (b3.f5017m) {
            b3.f5016l = typeface;
            TextView textView = (TextView) this.f5254c.get();
            if (textView != null) {
                Field field = B.D.f41a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0759v(textView, typeface, b3.f5014j));
                } else {
                    textView.setTypeface(typeface, b3.f5014j);
                }
            }
        }
    }
}
