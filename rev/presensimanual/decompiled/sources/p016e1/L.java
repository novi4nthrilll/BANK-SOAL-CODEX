package p016e1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import n1.b;
import n1.d;
import p049o1.a;

/* JADX INFO: loaded from: classes.dex */
public final class L implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f4077c;

    public L(HashMap map, HashMap map2, J j3) {
        this.f4075a = map;
        this.f4076b = map2;
        this.f4077c = j3;
    }

    @Override // p049o1.a
    public /* bridge */ /* synthetic */ a a(Class cls, d dVar) {
        this.f4075a.put(cls, dVar);
        this.f4076b.remove(cls);
        return this;
    }

    public byte[] b(C0716z3 c0716z3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap map = this.f4075a;
            K k3 = new K(byteArrayOutputStream, map, this.f4076b, this.f4077c);
            d dVar = (d) map.get(C0716z3.class);
            if (dVar == null) {
                throw new b("No encoder for ".concat(String.valueOf(C0716z3.class)));
            }
            dVar.a(c0716z3, k3);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
        }
    }

    public L() {
        this.f4075a = new HashMap();
        this.f4076b = new HashMap();
        this.f4077c = J.f4048c;
    }
}
