package com.google.mlkit.vision.face.internal;

import C1.e;
import E0.h;
import java.util.List;
import p013d1.I;
import p016e1.AbstractC0682u;
import p016e1.C0670s;
import p016e1.C0712z;
import p040l1.a;
import p040l1.d;
import p040l1.j;
import p071w1.f;

/* JADX INFO: loaded from: classes.dex */
public class FaceRegistrar implements d {
    @Override // p040l1.d
    public final List a() {
        h hVarA = a.a(e.class);
        hVarA.a(new j(1, 0, f.class));
        hVarA.f215h = C1.j.e;
        a aVarB = hVarA.b();
        h hVarA2 = a.a(C1.d.class);
        hVarA2.a(new j(1, 0, e.class));
        hVarA2.a(new j(1, 0, p071w1.d.class));
        hVarA2.f215h = C1.j.f166f;
        Object[] objArr = {aVarB, hVarA2.b()};
        for (int i3 = 0; i3 < 2; i3++) {
            C0670s c0670s = AbstractC0682u.e;
            if (objArr[i3] == null) {
                throw new NullPointerException(I.f("at index ", i3));
            }
        }
        C0670s c0670s2 = AbstractC0682u.e;
        return new C0712z(2, objArr);
    }
}
