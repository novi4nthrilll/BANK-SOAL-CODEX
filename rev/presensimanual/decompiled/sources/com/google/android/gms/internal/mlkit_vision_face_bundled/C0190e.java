package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0190e extends AbstractC0299o8 implements E8 {
    private static final C0190e zzb;
    private int zzd;
    private AbstractC0169b8 zze = AbstractC0169b8.e;
    private String zzf = "";
    private String zzg = "";

    static {
        C0190e c0190e = new C0190e();
        zzb = c0190e;
        AbstractC0299o8.f(C0190e.class, c0190e);
    }

    public static C0180d o() {
        return (C0180d) zzb.m();
    }

    public static /* synthetic */ void p(C0190e c0190e, String str) {
        c0190e.zzd |= 2;
        c0190e.zzf = str;
    }

    public static /* synthetic */ void q(C0190e c0190e, String str) {
        c0190e.zzd |= 4;
        c0190e.zzg = str;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i4 == 3) {
            return new C0190e();
        }
        if (i4 == 4) {
            return new C0180d(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
