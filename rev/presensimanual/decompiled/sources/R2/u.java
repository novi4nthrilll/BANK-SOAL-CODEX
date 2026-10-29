package R2;

import java.io.IOException;
import java.util.LinkedHashMap;
import p013d1.AbstractC0443f3;
import p013d1.AbstractC0552y;

/* JADX INFO: loaded from: classes.dex */
public final class u extends f {
    public static final l e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f1550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f1551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1552d;

    static {
        String str = l.e;
        e = p065t0.e.e("/", false);
    }

    public u(l lVar, i iVar, LinkedHashMap linkedHashMap) {
        B2.h.e(iVar, "fileSystem");
        this.f1550b = lVar;
        this.f1551c = iVar;
        this.f1552d = linkedHashMap;
    }

    @Override // R2.f
    public final e b(l lVar) throws Throwable {
        p pVarA;
        B2.h.e(lVar, "path");
        l lVar2 = e;
        lVar2.getClass();
        S2.d dVar = (S2.d) this.f1552d.get(S2.b.b(lVar2, lVar, true));
        Throwable th = null;
        if (dVar == null) {
            return null;
        }
        boolean z2 = dVar.f1608b;
        e eVar = new e(!z2, z2, z2 ? null : Long.valueOf(dVar.f1609c), null, dVar.f1610d, null);
        long j3 = dVar.e;
        if (j3 == -1) {
            return eVar;
        }
        h hVarE = this.f1551c.e(this.f1550b);
        try {
            pVarA = AbstractC0552y.a(hVarE.d(j3));
            try {
                hVarE.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                hVarE.close();
            } catch (Throwable th4) {
                AbstractC0443f3.a(th3, th4);
            }
            pVarA = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        B2.h.b(pVarA);
        B2.p pVar = new B2.p();
        pVar.f128d = eVar.e;
        B2.p pVar2 = new B2.p();
        B2.p pVar3 = new B2.p();
        int iA = pVarA.a();
        if (iA != 67324752) {
            throw new IOException("bad zip: expected " + S2.a.b(67324752) + " but was " + S2.a.b(iA));
        }
        pVarA.g(2L);
        short sC = pVarA.c();
        int i3 = sC & 65535;
        if ((sC & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + S2.a.b(i3));
        }
        pVarA.g(18L);
        long jC = ((long) pVarA.c()) & 65535;
        int iC = pVarA.c() & 65535;
        pVarA.g(jC);
        S2.a.d(pVarA, iC, new S2.g(pVarA, pVar, pVar2, pVar3));
        e eVar2 = new e(eVar.f1519a, eVar.f1520b, eVar.f1521c, (Long) pVar3.f128d, (Long) pVar.f128d, (Long) pVar2.f128d);
        B2.h.b(eVar2);
        return eVar2;
    }
}
