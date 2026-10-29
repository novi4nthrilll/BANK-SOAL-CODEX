package B;

import android.view.View;
import id.go.bangkalankab.simpeg.R;
import java.util.Objects;

/* JADX INFO: renamed from: B.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0024z {
    public static void a(View view, C c3) {
        p045n.l lVar = (p045n.l) view.getTag(R.id.tag_unhandled_key_listeners);
        if (lVar == null) {
            lVar = new p045n.l();
            view.setTag(R.id.tag_unhandled_key_listeners, lVar);
        }
        Objects.requireNonNull(c3);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0023y = new ViewOnUnhandledKeyEventListenerC0023y();
        lVar.put(c3, viewOnUnhandledKeyEventListenerC0023y);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0023y);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, C c3) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        p045n.l lVar = (p045n.l) view.getTag(R.id.tag_unhandled_key_listeners);
        if (lVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) lVar.getOrDefault(c3, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i3) {
        return (T) view.requireViewById(i3);
    }

    public static void g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, D.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
