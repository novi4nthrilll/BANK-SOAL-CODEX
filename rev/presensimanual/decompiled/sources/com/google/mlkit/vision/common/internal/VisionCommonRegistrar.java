package com.google.mlkit.vision.common.internal;

import E0.h;
import java.util.List;
import p013d1.I;
import p013d1.Q4;
import p013d1.S4;
import p013d1.U4;
import p040l1.a;
import p040l1.d;
import p040l1.j;
import p080z1.e;

/* JADX INFO: loaded from: classes.dex */
public class VisionCommonRegistrar implements d {
    @Override // p040l1.d
    public final List a() {
        h hVarA = a.a(e.class);
        hVarA.a(new j(2, 0, p080z1.d.class));
        hVarA.f215h = e.e;
        Object[] objArr = {hVarA.b()};
        for (int i3 = 0; i3 < 1; i3++) {
            Q4 q4 = S4.e;
            if (objArr[i3] == null) {
                throw new NullPointerException(I.f("at index ", i3));
            }
        }
        Q4 q5 = S4.e;
        return new U4(1, objArr);
    }
}
