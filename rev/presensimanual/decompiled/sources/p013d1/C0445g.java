package p013d1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import n1.b;
import n1.d;
import p049o1.a;

/* JADX INFO: renamed from: d1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0445g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0433e f3735c;

    public C0445g(HashMap map, HashMap map2, C0433e c0433e) {
        this.f3733a = map;
        this.f3734b = map2;
        this.f3735c = c0433e;
    }

    @Override // p049o1.a
    public /* bridge */ /* synthetic */ a a(Class cls, d dVar) {
        this.f3733a.put(cls, dVar);
        this.f3734b.remove(cls);
        return this;
    }

    public byte[] b(C0467j3 c0467j3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = this.f3733a;
            C0439f c0439f = new C0439f(byteArrayOutputStream, map, this.f3734b, this.f3735c);
            d dVar = (d) map.get(C0467j3.class);
            if (dVar == null) {
                throw new b("No encoder for ".concat(String.valueOf(C0467j3.class)));
            }
            dVar.a(c0467j3, c0439f);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
        }
    }

    public C0445g() {
        this.f3733a = new HashMap();
        this.f3734b = new HashMap();
        this.f3735c = C0433e.f3711c;
    }
}
