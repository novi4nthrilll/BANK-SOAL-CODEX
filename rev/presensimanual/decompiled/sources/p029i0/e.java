package p029i0;

import B2.h;
import N.d;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import p013d1.U2;
import p015e0.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f4575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4577c;

    public e(ClassLoader classLoader, a aVar) {
        this.f4575a = classLoader;
        this.f4576b = aVar;
        this.f4577c = new a(classLoader);
    }

    public final WindowLayoutComponent a() {
        a aVar = this.f4577c;
        aVar.getClass();
        boolean zB = false;
        try {
            h.d(aVar.f3925a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (U2.b("WindowExtensionsProvider#getWindowExtensions is not valid", new d(3, aVar)) && U2.b("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && U2.b("FoldingFeature class is not valid", new d(this, 0))) {
                int iA = p019f0.e.a();
                if (iA == 1) {
                    zB = b();
                } else if (2 <= iA && iA <= Integer.MAX_VALUE && b()) {
                    if (U2.b("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        zB = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return U2.b("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
