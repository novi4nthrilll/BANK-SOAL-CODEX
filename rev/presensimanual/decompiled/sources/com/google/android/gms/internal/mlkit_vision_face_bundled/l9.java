package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class l9 extends AbstractC0299o8 implements E8 {
    private static final l9 zzb;
    private byte zze = 2;
    private InterfaceC0338s8 zzd = L8.f2847g;

    static {
        l9 l9Var = new l9();
        zzb = l9Var;
        AbstractC0299o8.f(l9.class, l9Var);
    }

    public static l9 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", j9.class});
        }
        if (i4 == 3) {
            return new l9();
        }
        if (i4 == 4) {
            return new f9(9, zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        this.zze = abstractC0299o8 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final InterfaceC0338s8 p() {
        return this.zzd;
    }
}
