package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class Q7 extends AbstractC0299o8 implements E8 {
    private static final Q7 zzb;
    private int zzd;
    private int zze;
    private InterfaceC0338s8 zzf = L8.f2847g;

    static {
        Q7 q7 = new Q7();
        zzb = q7;
        AbstractC0299o8.f(Q7.class, q7);
    }

    public static Q7 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzd", "zze", C0150a.f2980g, "zzf", H6.class});
        }
        if (i4 == 3) {
            return new Q7();
        }
        if (i4 == 4) {
            return new f9(1, zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }

    public final InterfaceC0338s8 p() {
        return this.zzf;
    }

    public final int q() {
        int iA = F.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
