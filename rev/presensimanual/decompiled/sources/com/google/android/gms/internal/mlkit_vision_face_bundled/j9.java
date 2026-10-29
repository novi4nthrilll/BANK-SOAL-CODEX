package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public final class j9 extends AbstractC0269l8 {
    private static final j9 zzd;
    private int zze;
    private e9 zzf;
    private InterfaceC0338s8 zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private InterfaceC0338s8 zzm;
    private InterfaceC0338s8 zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private float zzr;
    private h9 zzs;
    private byte zzt;

    static {
        j9 j9Var = new j9();
        zzd = j9Var;
        AbstractC0299o8.f(j9.class, j9Var);
    }

    public j9() {
        this.zzb = C0229h8.f3081c;
        this.zzt = (byte) 2;
        L8 l8 = L8.f2847g;
        this.zzg = l8;
        this.zzm = l8;
        this.zzn = l8;
    }

    public static j9 x() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i4 == 2) {
            return new M8(zzd, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007\u001b\b\u001b\tဃ\u0007\nခ\t\u000bဃ\b\fဃ\u0006\rခ\u0005\u000eဉ\n", new Object[]{"zze", "zzf", "zzg", i9.class, "zzh", "zzi", "zzj", "zzk", "zzm", g9.class, "zzn", d9.class, "zzp", "zzr", "zzq", "zzo", "zzl", "zzs"});
        }
        if (i4 == 3) {
            return new j9();
        }
        if (i4 == 4) {
            return new f9(0, zzd);
        }
        if (i4 == 5) {
            return zzd;
        }
        this.zzt = abstractC0299o8 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final boolean q() {
        return (this.zze & 2) != 0;
    }

    public final float r() {
        return this.zzh;
    }

    public final float s() {
        return this.zzj;
    }

    public final float t() {
        return this.zzi;
    }

    public final float u() {
        return this.zzk;
    }

    public final long v() {
        return this.zzp;
    }

    public final e9 w() {
        e9 e9Var = this.zzf;
        return e9Var == null ? e9.s() : e9Var;
    }

    public final InterfaceC0338s8 y() {
        return this.zzn;
    }

    public final InterfaceC0338s8 z() {
        return this.zzg;
    }
}
