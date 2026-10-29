package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class H6 extends AbstractC0299o8 implements E8 {
    private static final H6 zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private float zzg;

    static {
        H6 h6 = new H6();
        zzb = h6;
        AbstractC0299o8.f(H6.class, h6);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new H6();
        }
        if (i4 == 4) {
            return new f9(2, zzb);
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
}
