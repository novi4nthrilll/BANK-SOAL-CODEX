package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends AbstractC0299o8 implements E8 {
    private static final i9 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;
    private int zzh = 15000;
    private int zzi;
    private float zzj;

    static {
        i9 i9Var = new i9();
        zzb = i9Var;
        AbstractC0299o8.f(i9.class, i9Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ခ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C0150a.f2982i, "zzi", C0150a.f2983j, "zzj"});
        }
        if (i4 == 3) {
            return new i9();
        }
        if (i4 == 4) {
            return new f9(8, zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }

    public final float o() {
        return this.zze;
    }

    public final float p() {
        return this.zzf;
    }

    public final int q() {
        int iA = L.a(this.zzh);
        if (iA == 0) {
            return 15001;
        }
        return iA;
    }
}
