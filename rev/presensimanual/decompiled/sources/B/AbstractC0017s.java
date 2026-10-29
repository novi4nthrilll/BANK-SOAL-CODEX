package B;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: B.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0017s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f97a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f100d;

    public AbstractC0017s() {
        if (p065t0.e.e == null) {
            p065t0.e.e = new p065t0.e();
        }
    }

    public int a(int i3) {
        if (i3 < this.f99c) {
            return ((ByteBuffer) this.f100d).getShort(this.f98b + i3);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, CharSequence charSequence);

    public void d(View view, CharSequence charSequence) {
        Object tag;
        C0001b c0001b;
        if (Build.VERSION.SDK_INT >= this.f98b) {
            c(view, charSequence);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f98b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f97a);
            if (!((Class) this.f100d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, charSequence)) {
            View.AccessibilityDelegate accessibilityDelegateA = D.a(view);
            if (accessibilityDelegateA == null) {
                c0001b = null;
            } else {
                c0001b = accessibilityDelegateA instanceof C0000a ? ((C0000a) accessibilityDelegateA).f69a : new C0001b(accessibilityDelegateA);
            }
            if (c0001b == null) {
                c0001b = new C0001b();
            }
            D.d(view, c0001b);
            view.setTag(this.f97a, charSequence);
            D.b(view, this.f99c);
        }
    }

    public abstract boolean e(Object obj, CharSequence charSequence);
}
