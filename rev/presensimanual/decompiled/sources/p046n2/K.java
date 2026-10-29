package p046n2;

import A2.l;
import B.C0006g;
import B2.b;
import B2.h;
import B2.k;
import B2.q;
import F2.c;
import I2.C0049u;
import I2.D;
import I2.InterfaceC0050v;
import I2.V;
import I2.h0;
import J.C0058d;
import J.P;
import L.f;
import M.a;
import N.d;
import N2.e;
import android.content.Context;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p013d1.AbstractC0473k3;
import p063s2.i;
import p063s2.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c[] f5430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final M.c f5431b;

    static {
        k kVar = new k(b.f109d, K.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        q.f129a.getClass();
        f5430a = new c[]{kVar};
        a aVar = a.e;
        i iVarH = D.f435b;
        h0 h0Var = new h0(null);
        iVarH.getClass();
        if (h0Var != j.f5670d) {
            iVarH = (i) h0Var.c(iVarH, new p063s2.b(1));
        }
        if (iVarH.f(C0049u.e) == null) {
            iVarH = iVarH.h(new V(null));
        }
        f5431b = new M.c(aVar, new e(iVarH));
    }

    public static final C0006g a(Context context) {
        C0006g c0006g;
        M.c cVar = f5431b;
        c cVar2 = f5430a[0];
        cVar.getClass();
        h.e(context, "thisRef");
        h.e(cVar2, "property");
        C0006g c0006g2 = cVar.f960d;
        if (c0006g2 != null) {
            return c0006g2;
        }
        synchronized (cVar.f959c) {
            try {
                if (cVar.f960d == null) {
                    Context applicationContext = context.getApplicationContext();
                    l lVar = cVar.f957a;
                    h.d(applicationContext, "applicationContext");
                    List list = (List) lVar.i(applicationContext);
                    InterfaceC0050v interfaceC0050v = cVar.f958b;
                    M.b bVar = new M.b(0, applicationContext, cVar);
                    h.e(list, "migrations");
                    P p3 = new P(new f(R2.f.f1525a, new d(0, bVar)), AbstractC0473k3.a(new C0058d(list, null)), new p071w1.b(1), interfaceC0050v);
                    cVar.f960d = new C0006g(10, new C0006g(10, p3));
                }
                c0006g = cVar.f960d;
                h.b(c0006g);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0006g;
    }

    public static final boolean b(String str, Object obj, Set set) {
        h.e(str, "key");
        if (set == null) {
            return (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double);
        }
        return set.contains(str);
    }

    public static final Object c(Object obj, p065t0.e eVar) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (!H2.i.h(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
            if (!H2.i.h(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return obj;
            }
            String strSubstring = str.substring(40);
            h.d(strSubstring, "substring(...)");
            return Double.valueOf(Double.parseDouble(strSubstring));
        }
        if (H2.i.h(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return obj;
        }
        String strSubstring2 = str.substring(40);
        h.d(strSubstring2, "substring(...)");
        eVar.getClass();
        h.e(strSubstring2, "listString");
        Object object = new M(new ByteArrayInputStream(Base64.decode(strSubstring2, 0))).readObject();
        h.c(object, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) object) {
            if (obj2 instanceof String) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
