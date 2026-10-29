package p013d1;

import p063s2.g;
import p063s2.h;
import p063s2.i;
import p063s2.j;

/* JADX INFO: renamed from: d1.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0485m3 {
    public static g a(g gVar, h hVar) {
        B2.h.e(hVar, "key");
        if (B2.h.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static i b(g gVar, h hVar) {
        B2.h.e(hVar, "key");
        return B2.h.a(gVar.getKey(), hVar) ? j.f5670d : gVar;
    }
}
