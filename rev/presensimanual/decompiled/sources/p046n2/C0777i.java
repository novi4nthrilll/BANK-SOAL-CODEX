package p046n2;

import A2.p;
import B2.h;
import N.b;
import N.e;
import java.util.List;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import u2.f;

/* JADX INFO: renamed from: n2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0777i extends f implements p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f5449i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0777i(List list, d dVar) {
        super(2, dVar);
        this.f5449i = list;
    }

    @Override // u2.b
    public final d b(Object obj, d dVar) {
        C0777i c0777i = new C0777i(this.f5449i, dVar);
        c0777i.f5448h = obj;
        return c0777i;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        C0777i c0777i = (C0777i) b((b) obj, (d) obj2);
        g gVar = g.f5603a;
        c0777i.j(gVar);
        return gVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        AbstractC0449g3.b(obj);
        b bVar = (b) this.f5448h;
        List<String> list = this.f5449i;
        if (list != null) {
            for (String str : list) {
                h.e(str, "name");
                e eVar = new e(str);
                bVar.b();
                bVar.f1026a.remove(eVar);
            }
        } else {
            bVar.b();
            bVar.f1026a.clear();
        }
        return g.f5603a;
    }
}
