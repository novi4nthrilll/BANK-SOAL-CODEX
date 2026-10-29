package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class V8 extends AbstractC0299o8 implements E8 {
    private static final V8 zzb;
    private int zzd;
    private boolean zzi;
    private boolean zzj;
    private boolean zzm;
    private m9 zzn;
    private C0285n4 zzo;
    private C0170c zzp;
    private float zze = 0.1f;
    private int zzf = 1;
    private int zzg = 1;
    private int zzh = 1;
    private float zzk = 45.0f;
    private float zzl = 0.5f;

    static {
        V8 v8 = new V8();
        zzb = v8;
        AbstractC0299o8.f(V8.class, v8);
    }

    public static /* synthetic */ void A(V8 v8, int i3) {
        v8.zzh = i3 - 1;
        v8.zzd |= 8;
    }

    public static H8 o() {
        return (H8) zzb.m();
    }

    public static /* synthetic */ void p(V8 v8, float f3) {
        v8.zzd |= 1;
        v8.zze = f3;
    }

    public static /* synthetic */ void q(V8 v8, boolean z2) {
        v8.zzd |= 32;
        v8.zzj = z2;
    }

    public static /* synthetic */ void r(V8 v8) {
        v8.zzd |= 256;
        v8.zzm = true;
    }

    public static /* synthetic */ void s(V8 v8, m9 m9Var) {
        v8.zzn = m9Var;
        v8.zzd |= 512;
    }

    public static /* synthetic */ void t(V8 v8, C0285n4 c0285n4) {
        v8.zzo = c0285n4;
        v8.zzd |= 1024;
    }

    public static /* synthetic */ void u(V8 v8, C0170c c0170c) {
        v8.zzp = c0170c;
        v8.zzd |= 2048;
    }

    public static /* synthetic */ void v(V8 v8, boolean z2) {
        v8.zzd |= 16;
        v8.zzi = z2;
    }

    public static /* synthetic */ void y(V8 v8, int i3) {
        v8.zzf = i3 - 1;
        v8.zzd |= 2;
    }

    public static /* synthetic */ void z(V8 v8, int i3) {
        v8.zzg = i3 - 1;
        v8.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return (byte) 1;
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ခ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ခ\u0006\bခ\u0007\tဇ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"zzd", "zze", "zzf", C0150a.f2976b, "zzg", C0150a.f2979f, "zzh", C0150a.f2977c, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i4 == 3) {
            return new V8();
        }
        if (i4 == 4) {
            return new H8(zzb);
        }
        if (i4 != 5) {
            return null;
        }
        return zzb;
    }

    public final int w() {
        int i3 = this.zzg;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 != 1) {
                i4 = i3 != 2 ? 0 : 3;
            } else {
                i4 = 2;
            }
        }
        if (i4 == 0) {
            return 2;
        }
        return i4;
    }

    public final int x() {
        int i3 = this.zzf;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 != 1) {
                i4 = 3;
                if (i3 != 2) {
                    i4 = i3 != 3 ? 0 : 4;
                }
            } else {
                i4 = 2;
            }
        }
        if (i4 == 0) {
            return 2;
        }
        return i4;
    }
}
