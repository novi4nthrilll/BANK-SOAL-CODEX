package J1;

import E0.n;
import I1.AbstractActivityC0028d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f728a = new ArrayList();

    public g(AbstractActivityC0028d abstractActivityC0028d, String[] strArr) {
        M1.f fVar = (M1.f) D0.b.J().e;
        if (fVar.f989a) {
            return;
        }
        fVar.b(abstractActivityC0028d.getApplicationContext());
        fVar.a(abstractActivityC0028d.getApplicationContext(), strArr);
    }

    public final c a(f fVar) {
        K1.a aVar;
        c cVar;
        AbstractActivityC0028d abstractActivityC0028d = fVar.f723a;
        K1.a aVar2 = fVar.f724b;
        String str = fVar.f725c;
        List<String> list = fVar.f726d;
        io.flutter.plugin.platform.i iVar = new io.flutter.plugin.platform.i();
        boolean z2 = fVar.e;
        boolean z3 = fVar.f727f;
        if (aVar2 == null) {
            M1.f fVar2 = (M1.f) D0.b.J().e;
            if (!fVar2.f989a) {
                throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
            }
            aVar = new K1.a(fVar2.f992d.f980b, "main");
        } else {
            aVar = aVar2;
        }
        ArrayList arrayList = this.f728a;
        if (arrayList.size() == 0) {
            cVar = new c(abstractActivityC0028d, null, iVar, z2, z3);
            if (str != null) {
                ((n) cVar.f702i.e).b("setInitialRoute", str, null);
            }
            cVar.f697c.a(aVar, list);
        } else {
            c cVar2 = (c) arrayList.get(0);
            if (!cVar2.f695a.isAttached()) {
                throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
            }
            long j3 = c.f693w;
            cVar = new c(abstractActivityC0028d, cVar2.f695a.spawn(aVar.f743c, aVar.f742b, str, list, j3), iVar, z2, z3);
        }
        arrayList.add(cVar);
        cVar.f713t.add(new e(this, cVar));
        return cVar;
    }
}
