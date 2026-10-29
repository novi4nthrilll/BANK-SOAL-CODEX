package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class U7 implements E8 {
    protected int zza;

    public abstract int b(N8 n8);

    public final byte[] c() {
        try {
            AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) this;
            int iL = abstractC0299o8.l();
            byte[] bArr = new byte[iL];
            C0179c8 c0179c8 = new C0179c8(bArr, iL);
            abstractC0299o8.j(c0179c8);
            if (iL - c0179c8.f3008d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
