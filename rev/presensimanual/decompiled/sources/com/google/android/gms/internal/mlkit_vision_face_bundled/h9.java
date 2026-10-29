package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class h9 extends AbstractC0299o8 implements E8 {
    private static final h9 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;

    static {
        h9 h9Var = new h9();
        zzb = h9Var;
        AbstractC0299o8.f(h9.class, h9Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new h9();
        }
        if (i4 == 4) {
            return new f9(7, zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
