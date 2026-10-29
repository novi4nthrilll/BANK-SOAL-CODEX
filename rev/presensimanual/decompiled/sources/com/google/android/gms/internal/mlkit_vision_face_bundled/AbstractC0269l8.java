package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.l8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0269l8 extends AbstractC0299o8 implements E8 {
    protected C0229h8 zzb;

    public final C0229h8 o() {
        C0229h8 c0229h8 = this.zzb;
        if (c0229h8.f3083b) {
            this.zzb = c0229h8.clone();
        }
        return this.zzb;
    }

    public final Object p(C0289n8 c0289n8) {
        if (c0289n8.f3234a != ((AbstractC0299o8) k(6, null))) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        P8 p8 = this.zzb.f3082a;
        C0279m8 c0279m8 = c0289n8.f3237d;
        Object obj = p8.get(c0279m8);
        if (obj == null) {
            return c0289n8.f3235b;
        }
        if (c0279m8.f3230d.f2999d != c9.f3015k) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (c0279m8.f3230d.f2999d == c9.f3015k) {
                ((Integer) obj2).getClass();
                throw null;
            }
            arrayList.add(obj2);
        }
        return arrayList;
    }
}
