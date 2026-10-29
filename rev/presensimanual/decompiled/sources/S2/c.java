package S2;

import B2.h;
import R2.l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import p009c1.v;

/* JADX INFO: loaded from: classes.dex */
public final class c extends R2.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f1605c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p055q2.e f1606b;

    static {
        String str = l.e;
        f1605c = p065t0.e.e("/", false);
    }

    public c(ClassLoader classLoader) {
        this.f1606b = new p055q2.e(new N.d(1, classLoader));
    }

    @Override // R2.f
    public final R2.e b(l lVar) throws EOFException {
        l lVarD;
        h.e(lVar, "path");
        if (!v.c(lVar)) {
            return null;
        }
        l lVar2 = f1605c;
        lVar2.getClass();
        h.e(lVar, "child");
        l lVarB = b.b(lVar2, lVar, true);
        int iA = b.a(lVarB);
        R2.b bVar = lVarB.f1532d;
        l lVar3 = iA == -1 ? null : new l(bVar.l(0, iA));
        int iA2 = b.a(lVar2);
        R2.b bVar2 = lVar2.f1532d;
        if (!h.a(lVar3, iA2 == -1 ? null : new l(bVar2.l(0, iA2)))) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + lVarB + " and " + lVar2).toString());
        }
        ArrayList arrayListA = lVarB.a();
        ArrayList arrayListA2 = lVar2.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i3 = 0;
        while (i3 < iMin && h.a(arrayListA.get(i3), arrayListA2.get(i3))) {
            i3++;
        }
        if (i3 == iMin && bVar.b() == bVar2.b()) {
            String str = l.e;
            lVarD = p065t0.e.e(".", false);
        } else {
            if (arrayListA2.subList(i3, arrayListA2.size()).indexOf(b.e) != -1) {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + lVarB + " and " + lVar2).toString());
            }
            R2.a aVar = new R2.a();
            R2.b bVarC = b.c(lVar2);
            if (bVarC == null && (bVarC = b.c(lVarB)) == null) {
                bVarC = b.f(l.e);
            }
            int size = arrayListA2.size();
            for (int i4 = i3; i4 < size; i4++) {
                aVar.m(b.e);
                aVar.m(bVarC);
            }
            int size2 = arrayListA.size();
            while (i3 < size2) {
                aVar.m((R2.b) arrayListA.get(i3));
                aVar.m(bVarC);
                i3++;
            }
            lVarD = b.d(aVar, false);
        }
        String strN = lVarD.f1532d.n();
        for (p055q2.b bVar3 : (List) this.f1606b.a()) {
            R2.e eVarB = ((R2.f) bVar3.f5598d).b(((l) bVar3.e).d(strN));
            if (eVarB != null) {
                return eVarB;
            }
        }
        return null;
    }
}
