package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0263l2 extends AbstractC0299o8 implements E8 {
    private static final C0263l2 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private String zzk = "";

    static {
        C0263l2 c0263l2 = new C0263l2();
        zzb = c0263l2;
        AbstractC0299o8.f(C0263l2.class, c0263l2);
    }

    public static K1 o() {
        return (K1) zzb.m();
    }

    public static /* synthetic */ void p(C0263l2 c0263l2, int i3) {
        c0263l2.zzd |= 1;
        c0263l2.zze = i3;
    }

    public static /* synthetic */ void q(C0263l2 c0263l2, long j3) {
        c0263l2.zzd |= 32;
        c0263l2.zzj = j3;
    }

    public static /* synthetic */ void r(C0263l2 c0263l2, int i3) {
        c0263l2.zzd |= 2;
        c0263l2.zzf = i3;
    }

    public static /* synthetic */ void s(C0263l2 c0263l2, int i3) {
        c0263l2.zzg = i3 - 1;
        c0263l2.zzd |= 4;
    }

    public static /* synthetic */ void t(C0263l2 c0263l2, int i3) {
        c0263l2.zzh = i3 - 1;
        c0263l2.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C0150a.f2978d, "zzh", C0150a.e, "zzi", "zzj", "zzk"});
        }
        if (i4 == 3) {
            return new C0263l2();
        }
        if (i4 == 4) {
            return new K1(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
