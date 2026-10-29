package p013d1;

import B2.h;
import I2.AbstractC0048t;
import p063s2.d;
import p063s2.e;
import p063s2.f;
import u2.b;

/* JADX INFO: renamed from: d1.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0514r3 {
    public static d a(d dVar) {
        h.e(dVar, "<this>");
        b bVar = dVar instanceof b ? (b) dVar : null;
        if (bVar == null) {
            return dVar;
        }
        d dVar2 = bVar.f5756f;
        if (dVar2 != null) {
            return dVar2;
        }
        f fVar = (f) bVar.g().f(e.f5669d);
        d hVar = fVar != null ? new N2.h((AbstractC0048t) fVar, bVar) : bVar;
        bVar.f5756f = hVar;
        return hVar;
    }
}
