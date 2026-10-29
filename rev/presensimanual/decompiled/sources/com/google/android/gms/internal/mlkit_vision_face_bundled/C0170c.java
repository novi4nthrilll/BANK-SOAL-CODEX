package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0170c extends AbstractC0299o8 implements E8 {
    private static final C0170c zzb;
    private int zzd;
    private C0190e zze;
    private C0190e zzf;
    private C0190e zzg;
    private C0190e zzh;

    static {
        C0170c c0170c = new C0170c();
        zzb = c0170c;
        AbstractC0299o8.f(C0170c.class, c0170c);
    }

    public static C0160b o() {
        return (C0160b) zzb.m();
    }

    public static /* synthetic */ void q(C0170c c0170c, C0190e c0190e) {
        c0170c.zze = c0190e;
        c0170c.zzd |= 1;
    }

    public static /* synthetic */ void r(C0170c c0170c, C0190e c0190e) {
        c0170c.zzf = c0190e;
        c0170c.zzd |= 2;
    }

    public static /* synthetic */ void s(C0170c c0170c, C0190e c0190e) {
        c0170c.zzg = c0190e;
        c0170c.zzd |= 4;
    }

    public static /* synthetic */ void t(C0170c c0170c, C0190e c0190e) {
        c0170c.zzh = c0190e;
        c0170c.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i4 == 3) {
            return new C0170c();
        }
        if (i4 == 4) {
            return new C0160b(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
