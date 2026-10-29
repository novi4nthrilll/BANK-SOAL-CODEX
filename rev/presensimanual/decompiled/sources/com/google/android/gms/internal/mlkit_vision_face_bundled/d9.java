package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class d9 extends AbstractC0299o8 implements E8 {
    private static final d9 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private float zzg;
    private float zzh;

    static {
        d9 d9Var = new d9();
        zzb = d9Var;
        AbstractC0299o8.f(d9.class, d9Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"zzd", "zze", C0150a.f2981h, "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new d9();
        }
        if (i4 == 4) {
            return new f9(4, zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }

    public final float o() {
        return this.zzg;
    }

    public final String p() {
        return this.zzf;
    }
}
