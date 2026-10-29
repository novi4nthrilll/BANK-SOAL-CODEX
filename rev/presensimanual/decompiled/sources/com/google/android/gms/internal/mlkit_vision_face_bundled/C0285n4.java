package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0285n4 extends AbstractC0299o8 implements E8 {
    private static final C0285n4 zzb;
    private int zzd;
    private C0190e zze;
    private C0190e zzf;

    static {
        C0285n4 c0285n4 = new C0285n4();
        zzb = c0285n4;
        AbstractC0299o8.f(C0285n4.class, c0285n4);
    }

    public static M3 o() {
        return (M3) zzb.m();
    }

    public static /* synthetic */ void p(C0285n4 c0285n4, C0190e c0190e) {
        c0285n4.zze = c0190e;
        c0285n4.zzd |= 1;
    }

    public static /* synthetic */ void q(C0285n4 c0285n4, C0190e c0190e) {
        c0285n4.zzf = c0190e;
        c0285n4.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i4 == 3) {
            return new C0285n4();
        }
        if (i4 == 4) {
            return new M3(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }
}
