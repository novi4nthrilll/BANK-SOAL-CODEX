package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class g9 extends AbstractC0299o8 implements E8 {
    private static final g9 zzb;
    private int zzd;
    private int zze;
    private AbstractC0169b8 zzf = AbstractC0169b8.e;
    private String zzg = "";
    private float zzh;

    static {
        g9 g9Var = new g9();
        zzb = g9Var;
        AbstractC0299o8.f(g9.class, g9Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new g9();
        }
        if (i4 == 4) {
            return new f9(6, zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
