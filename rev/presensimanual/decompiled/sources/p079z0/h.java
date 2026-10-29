package p079z0;

import D0.e;
import E0.j;
import E0.l;
import E0.m;
import H0.a;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import p040l1.b;
import p070w0.c;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static volatile c e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f5950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f5952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f5953d;

    public h(a aVar, a aVar2, e eVar, j jVar, m mVar) {
        this.f5950a = aVar;
        this.f5951b = aVar2;
        this.f5952c = eVar;
        this.f5953d = jVar;
        mVar.getClass();
        mVar.f232a.execute(new l(0, mVar));
    }

    public static h a() {
        c cVar = e;
        if (cVar != null) {
            return (h) cVar.f5942h.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (h.class) {
                try {
                    if (e == null) {
                        b bVar = new b();
                        context.getClass();
                        bVar.f5304a = context;
                        e = bVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final D0.b c(p073x0.a aVar) {
        Set setSingleton;
        byte[] bytes;
        if (aVar instanceof d) {
            aVar.getClass();
            setSingleton = Collections.unmodifiableSet(p073x0.a.f5822d);
        } else {
            setSingleton = Collections.singleton(new p070w0.b("proto"));
        }
        c cVar = c.f5774d;
        aVar.getClass();
        String str = aVar.f5823a;
        String str2 = aVar.f5824b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            bytes = ("1$" + str + "\\" + (str2 != null ? str2 : "")).getBytes(Charset.forName("UTF-8"));
        }
        return new D0.b(setSingleton, new b("cct", bytes, cVar), this, 27);
    }
}
