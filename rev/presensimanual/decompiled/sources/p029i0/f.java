package p029i0;

import A2.a;
import B2.h;
import B2.i;
import androidx.window.extensions.layout.WindowLayoutComponent;
import p019f0.e;
import p035k0.c;
import p035k0.d;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements a {
    public static final f e = new f(0);

    @Override // A2.a
    public final Object a() {
        WindowLayoutComponent windowLayoutComponentA;
        Object cVar;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new p015e0.a(classLoader)) : null;
            if (eVar == null || (windowLayoutComponentA = eVar.a()) == null) {
                return null;
            }
            h.d(classLoader, "loader");
            p015e0.a aVar = new p015e0.a(classLoader);
            int iA = e.a();
            if (iA >= 2) {
                cVar = new d(windowLayoutComponentA);
            } else {
                cVar = iA == 1 ? new c(windowLayoutComponentA, aVar) : new p035k0.a();
            }
            return cVar;
        } catch (Throwable unused) {
            g gVar = g.f4578a;
            return null;
        }
    }
}
