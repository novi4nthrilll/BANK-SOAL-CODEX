package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class e9 extends AbstractC0299o8 implements E8 {
    private static final e9 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;

    static {
        e9 e9Var = new e9();
        zzb = e9Var;
        AbstractC0299o8.f(e9.class, e9Var);
    }

    public static e9 s() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = 5;
        int i5 = i3 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new M8(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new e9();
        }
        if (i5 == 4) {
            return new f9(i4, zzb);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }

    public final float o() {
        return this.zze;
    }

    public final float p() {
        return this.zzg;
    }

    public final float q() {
        return this.zzf;
    }

    public final float r() {
        return this.zzh;
    }
}
