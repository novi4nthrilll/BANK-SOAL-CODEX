package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class m9 extends AbstractC0299o8 implements E8 {
    private static final m9 zzb;
    private int zzd;
    private C0190e zze;
    private C0190e zzf;
    private C0190e zzg;
    private C0190e zzh;

    static {
        m9 m9Var = new m9();
        zzb = m9Var;
        AbstractC0299o8.f(m9.class, m9Var);
    }

    public static k9 o() {
        return (k9) zzb.m();
    }

    public static /* synthetic */ void p(m9 m9Var, C0190e c0190e) {
        m9Var.zze = c0190e;
        m9Var.zzd |= 1;
    }

    public static /* synthetic */ void q(m9 m9Var, C0190e c0190e) {
        m9Var.zzf = c0190e;
        m9Var.zzd |= 2;
    }

    public static /* synthetic */ void r(m9 m9Var, C0190e c0190e) {
        m9Var.zzg = c0190e;
        m9Var.zzd |= 4;
    }

    public static /* synthetic */ void s(m9 m9Var, C0190e c0190e) {
        m9Var.zzh = c0190e;
        m9Var.zzd |= 8;
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
            return new m9();
        }
        if (i4 == 4) {
            return new k9(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
