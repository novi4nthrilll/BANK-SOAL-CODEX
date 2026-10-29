package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.q8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0319q8 extends AbstractC0299o8 implements E8 {
    private static final C0319q8 zzb;
    private int zzd;
    private l9 zze;
    private byte zzf = 2;

    static {
        C0319q8 c0319q8 = new C0319q8();
        zzb = c0319q8;
        AbstractC0299o8.f(C0319q8.class, c0319q8);
    }

    public static C0319q8 o(byte[] bArr, C0209f8 c0209f8) throws C0368v8 {
        AbstractC0299o8 abstractC0299o8 = zzb;
        int length = bArr.length;
        if (length != 0) {
            abstractC0299o8 = (AbstractC0299o8) abstractC0299o8.k(4, null);
            try {
                N8 n8A = K8.f2835c.a(abstractC0299o8.getClass());
                n8A.g(abstractC0299o8, bArr, 0, length, new X7(c0209f8));
                n8A.a(abstractC0299o8);
            } catch (R8 e) {
                throw new C0368v8(e.getMessage());
            } catch (C0368v8 e3) {
                throw e3;
            } catch (IOException e4) {
                if (e4.getCause() instanceof C0368v8) {
                    throw ((C0368v8) e4.getCause());
                }
                throw new C0368v8(e4.getMessage(), e4);
            } catch (IndexOutOfBoundsException unused) {
                throw new C0368v8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (abstractC0299o8 == null || AbstractC0299o8.h(abstractC0299o8, true)) {
            return (C0319q8) abstractC0299o8;
        }
        throw new C0368v8(new R8().getMessage());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0299o8
    public final Object k(int i3, AbstractC0299o8 abstractC0299o8) {
        int i4 = i3 - 1;
        if (i4 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i4 == 2) {
            return new M8(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i4 == 3) {
            return new C0319q8();
        }
        if (i4 == 4) {
            return new f9(3, zzb);
        }
        if (i4 == 5) {
            return zzb;
        }
        this.zzf = abstractC0299o8 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final l9 p() {
        l9 l9Var = this.zze;
        return l9Var == null ? l9.o() : l9Var;
    }
}
