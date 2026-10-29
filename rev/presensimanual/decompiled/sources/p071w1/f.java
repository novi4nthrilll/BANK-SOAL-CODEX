package p071w1;

import O0.u;
import android.content.Context;
import java.util.ArrayList;
import p040l1.a;
import p040l1.b;
import p040l1.g;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f5785b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f f5786c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f5787a;

    public static f c() {
        f fVar;
        synchronized (f5785b) {
            u.h("MlKitContext has not been initialized", f5786c != null);
            fVar = f5786c;
            u.f(fVar);
        }
        return fVar;
    }

    public static f d(Context context) {
        f fVar;
        synchronized (f5785b) {
            u.h("MlKitContext is already initialized", f5786c == null);
            f fVar2 = new f();
            f5786c = fVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            b bVar = new b();
            bVar.f5304a = context;
            ArrayList arrayListB = bVar.b();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.addAll(arrayListB);
            arrayList2.add(a.b(context, Context.class, new Class[0]));
            arrayList2.add(a.b(fVar2, f.class, new Class[0]));
            g gVar = new g(arrayList, arrayList2);
            fVar2.f5787a = gVar;
            gVar.f();
            fVar = f5786c;
        }
        return fVar;
    }

    public final Object a(Class cls) {
        u.h("MlKitContext has been deleted", f5786c == this);
        u.f(this.f5787a);
        return this.f5787a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
