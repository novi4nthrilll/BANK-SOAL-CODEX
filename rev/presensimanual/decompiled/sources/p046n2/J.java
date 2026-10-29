package p046n2;

import B2.h;
import B2.p;
import D0.b;
import H2.i;
import I2.AbstractC0052x;
import N.g;
import O1.a;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p059r2.d;
import p065t0.e;
import u2.f;

/* JADX INFO: loaded from: classes.dex */
public final class J implements a, InterfaceC0775g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f5428d;
    public b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f5429f = new e();

    public static final Object c(J j3, String str, String str2, f fVar) {
        j3.getClass();
        N.e eVar = new N.e(str);
        Context context = j3.f5428d;
        if (context != null) {
            Object objF = K.a(context).f(new g(new C0779k(eVar, str2, null), null), fVar);
            return objF == t2.a.f5737d ? objF : p055q2.g.f5603a;
        }
        h.g("context");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c8 -> B:36:0x00cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object l(p046n2.J r11, java.util.List r12, u2.b r13) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p046n2.J.l(n2.J, java.util.List, u2.b):java.lang.Object");
    }

    @Override // p046n2.InterfaceC0775g
    public final Boolean a(String str, C0776h c0776h) throws Throwable {
        p pVar = new p();
        AbstractC0052x.j(new p(str, this, pVar, null));
        return (Boolean) pVar.f128d;
    }

    @Override // O1.a
    public final void b(b bVar) {
        h.e(bVar, "binding");
        S1.f fVar = (S1.f) bVar.f182f;
        h.d(fVar, "getBinaryMessenger(...)");
        Context context = (Context) bVar.e;
        h.d(context, "getApplicationContext(...)");
        this.f5428d = context;
        try {
            InterfaceC0775g.f5445c.getClass();
            C0774f.b(fVar, this, "data_store");
            this.e = new b(fVar, context, this.f5429f);
        } catch (Exception e) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e);
        }
        new C0769a().b(bVar);
    }

    @Override // p046n2.InterfaceC0775g
    public final String d(String str, C0776h c0776h) throws Throwable {
        p pVar = new p();
        AbstractC0052x.j(new x(str, this, pVar, null));
        return (String) pVar.f128d;
    }

    @Override // p046n2.InterfaceC0775g
    public final void e(String str, String str2, C0776h c0776h) throws Throwable {
        AbstractC0052x.j(new F(this, str, str2, null));
    }

    @Override // p046n2.InterfaceC0775g
    public final void f(String str, double d3, C0776h c0776h) throws Throwable {
        AbstractC0052x.j(new E(str, this, d3, null));
    }

    @Override // p046n2.InterfaceC0775g
    public final void g(List list, C0776h c0776h) throws Throwable {
        AbstractC0052x.j(new C0778j(this, list, null));
    }

    @Override // p046n2.InterfaceC0775g
    public final ArrayList h(String str, C0776h c0776h) throws Throwable {
        List list;
        String strD = d(str, c0776h);
        ArrayList arrayList = null;
        if (strD != null && !i.h(strD, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!") && i.h(strD, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && (list = (List) K.c(strD, this.f5429f)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // p046n2.InterfaceC0775g
    public final Map i(List list, C0776h c0776h) {
        return (Map) AbstractC0052x.j(new C0780l(this, list, null));
    }

    @Override // p046n2.InterfaceC0775g
    public final void j(String str, long j3, C0776h c0776h) throws Throwable {
        AbstractC0052x.j(new H(str, this, j3, null));
    }

    @Override // O1.a
    public final void k(b bVar) {
        h.e(bVar, "binding");
        S1.f fVar = (S1.f) bVar.f182f;
        h.d(fVar, "getBinaryMessenger(...)");
        InterfaceC0775g.f5445c.getClass();
        C0774f.b(fVar, null, "data_store");
        b bVar2 = this.e;
        if (bVar2 != null) {
            C0774f.b((S1.f) bVar2.e, null, "shared_preferences");
        }
        this.e = null;
    }

    @Override // p046n2.InterfaceC0775g
    public final void m(String str, List list, C0776h c0776h) throws Throwable {
        AbstractC0052x.j(new C(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu".concat(this.f5429f.d(list)), null));
    }

    @Override // p046n2.InterfaceC0775g
    public final Double o(String str, C0776h c0776h) throws Throwable {
        p pVar = new p();
        AbstractC0052x.j(new r(str, this, pVar, null));
        return (Double) pVar.f128d;
    }

    @Override // p046n2.InterfaceC0775g
    public final N r(String str, C0776h c0776h) throws Throwable {
        String strD = d(str, c0776h);
        if (strD == null) {
            return null;
        }
        if (i.h(strD, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
            return new N(strD, L.JSON_ENCODED);
        }
        return i.h(strD, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") ? new N(null, L.PLATFORM_ENCODED) : new N(null, L.UNEXPECTED_STRING);
    }

    @Override // p046n2.InterfaceC0775g
    public final Long s(String str, C0776h c0776h) throws Throwable {
        p pVar = new p();
        AbstractC0052x.j(new t(str, this, pVar, null));
        return (Long) pVar.f128d;
    }

    @Override // p046n2.InterfaceC0775g
    public final void t(String str, boolean z2, C0776h c0776h) throws Throwable {
        AbstractC0052x.j(new B(str, this, z2, null));
    }

    @Override // p046n2.InterfaceC0775g
    public final List u(List list, C0776h c0776h) {
        return d.g(((Map) AbstractC0052x.j(new u(this, list, null))).keySet());
    }

    @Override // p046n2.InterfaceC0775g
    public final void v(String str, String str2, C0776h c0776h) throws Throwable {
        AbstractC0052x.j(new I(this, str, str2, null));
    }
}
