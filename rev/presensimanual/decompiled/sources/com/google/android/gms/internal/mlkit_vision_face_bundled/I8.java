package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.datastore.preferences.protobuf.C0131m;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class I8 implements N8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U7 f2821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H7 f2822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2823c;

    public I8(H7 h7, U7 u7) {
        H7 h8 = AbstractC0219g8.f3074a;
        this.f2822b = h7;
        this.f2823c = u7 instanceof AbstractC0269l8;
        this.f2821a = u7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final void a(Object obj) {
        this.f2822b.getClass();
        H7.g(obj);
        H7 h7 = AbstractC0219g8.f3074a;
        H7.f(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final Object b() {
        U7 u7 = this.f2821a;
        return u7 instanceof AbstractC0299o8 ? (AbstractC0299o8) ((AbstractC0299o8) u7).k(4, null) : ((AbstractC0259k8) ((AbstractC0299o8) u7).k(5, null)).d();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final void c(Object obj, A8 a8) throws C0131m {
        Iterator itC = ((AbstractC0269l8) obj).zzb.c();
        if (itC.hasNext()) {
            c9 c9Var = ((C0279m8) ((Map.Entry) itC.next()).getKey()).f3230d.f2999d;
            c9 c9Var2 = c9.f3009d;
            throw new IllegalStateException("Found invalid MessageSet item.");
        }
        S8 s8 = ((AbstractC0299o8) obj).zzc;
        for (int i3 = 0; i3 < s8.f2909a; i3++) {
            int i4 = s8.f2910b[i3] >>> 3;
            Object obj2 = s8.f2911c[i3];
            a8.getClass();
            boolean z2 = obj2 instanceof AbstractC0169b8;
            C0179c8 c0179c8 = (C0179c8) a8.f2742a;
            if (z2) {
                c0179c8.l(11);
                c0179c8.k(2, i4);
                c0179c8.d(3, (AbstractC0169b8) obj2);
                c0179c8.l(12);
            } else {
                c0179c8.l(11);
                c0179c8.k(2, i4);
                c0179c8.l(26);
                AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) ((U7) obj2);
                c0179c8.l(abstractC0299o8.l());
                abstractC0299o8.j(c0179c8);
                c0179c8.l(12);
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final boolean d(AbstractC0299o8 abstractC0299o8, Object obj) {
        if (!abstractC0299o8.zzc.equals(((AbstractC0299o8) obj).zzc)) {
            return false;
        }
        if (this.f2823c) {
            return ((AbstractC0269l8) abstractC0299o8).zzb.equals(((AbstractC0269l8) obj).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final void e(Object obj, Object obj2) {
        O8.w(obj, obj2);
        if (this.f2823c) {
            H7 h7 = AbstractC0219g8.f3074a;
            O8.v(obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final int f(AbstractC0299o8 abstractC0299o8) {
        S8 s8 = abstractC0299o8.zzc;
        int iD = s8.f2912d;
        if (iD == -1) {
            iD = 0;
            for (int i3 = 0; i3 < s8.f2909a; i3++) {
                int i4 = s8.f2910b[i3] >>> 3;
                AbstractC0169b8 abstractC0169b8 = (AbstractC0169b8) s8.f2911c[i3];
                int iR = C0179c8.r(8);
                int iR2 = C0179c8.r(i4) + C0179c8.r(16);
                int iR3 = C0179c8.r(24);
                int iE = abstractC0169b8.e();
                iD += iR + iR + iR2 + A0.c.d(iE, iE, iR3);
            }
            s8.f2912d = iD;
        }
        if (!this.f2823c) {
            return iD;
        }
        P8 p8 = ((AbstractC0269l8) abstractC0299o8).zzb.f3082a;
        int i5 = p8.e;
        int iA = 0;
        for (int i6 = 0; i6 < i5; i6++) {
            Q8 q8D = p8.d(i6);
            C0279m8 c0279m8 = (C0279m8) q8D.getKey();
            Object value = q8D.getValue();
            c9 c9Var = c0279m8.f3230d.f2999d;
            c9 c9Var2 = c9.f3009d;
            iA += C0229h8.a(c0279m8, value);
        }
        for (Map.Entry entry : p8.b()) {
            C0279m8 c0279m9 = (C0279m8) entry.getKey();
            Object value2 = entry.getValue();
            c9 c9Var3 = c0279m9.f3230d.f2999d;
            c9 c9Var4 = c9.f3009d;
            iA += C0229h8.a(c0279m9, value2);
        }
        return iD + iA;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bc A[EDGE_INSN: B:52:0x00bc->B:35:0x00bc BREAK  A[LOOP:1: B:18:0x006d->B:26:0x0098], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final void g(Object obj, byte[] bArr, int i3, int i4, X7 x7) throws C0368v8 {
        AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) obj;
        S8 s8B = abstractC0299o8.zzc;
        if (s8B == S8.f2908f) {
            s8B = S8.b();
            abstractC0299o8.zzc = s8B;
        }
        S8 s8 = s8B;
        C0229h8 c0229h8O = ((AbstractC0269l8) obj).o();
        int i5 = i3;
        C0289n8 c0289n8A = null;
        while (i5 < i4) {
            int iJ = B.j(bArr, i5, x7);
            int i6 = x7.f2951a;
            U7 u7 = this.f2821a;
            int i7 = 2;
            C0209f8 c0209f8 = x7.f2954d;
            if (i6 == 11) {
                int i8 = 0;
                AbstractC0169b8 abstractC0169b8 = null;
                while (iJ < i4) {
                    iJ = B.j(bArr, iJ, x7);
                    int i9 = x7.f2951a;
                    int i10 = i9 >>> 3;
                    int i11 = i9 & 7;
                    if (i10 == i7) {
                        if (i11 != 0) {
                            if (i9 == 12) {
                                break;
                                break;
                            }
                            iJ = B.p(i9, bArr, iJ, i4, x7);
                        } else {
                            iJ = B.j(bArr, iJ, x7);
                            i8 = x7.f2951a;
                            c0289n8A = c0209f8.a(u7, i8);
                        }
                    } else if (i10 != 3) {
                        if (i9 == 12) {
                            break;
                            break;
                        }
                        iJ = B.p(i9, bArr, iJ, i4, x7);
                    } else if (c0289n8A == null) {
                        if (i11 != 2) {
                            if (i9 == 12) {
                                break;
                            } else {
                                iJ = B.p(i9, bArr, iJ, i4, x7);
                            }
                        } else {
                            iJ = B.a(bArr, iJ, x7);
                            abstractC0169b8 = (AbstractC0169b8) x7.f2953c;
                        }
                    } else {
                        iJ = B.e(K8.f2835c.a(c0289n8A.f3236c.getClass()), bArr, iJ, i4, x7);
                        c0229h8O.f(c0289n8A.f3237d, x7.f2953c);
                    }
                    i7 = 2;
                }
                if (abstractC0169b8 != null) {
                    s8.c((i8 << 3) | 2, abstractC0169b8);
                }
                i5 = iJ;
            } else if ((i6 & 7) == 2) {
                C0289n8 c0289n8A2 = c0209f8.a(u7, i6 >>> 3);
                if (c0289n8A2 != null) {
                    i5 = B.e(K8.f2835c.a(c0289n8A2.f3236c.getClass()), bArr, iJ, i4, x7);
                    c0229h8O.f(c0289n8A2.f3237d, x7.f2953c);
                } else {
                    i5 = B.i(i6, bArr, iJ, i4, s8, x7);
                }
                c0289n8A = c0289n8A2;
            } else {
                i5 = B.p(i6, bArr, iJ, i4, x7);
            }
        }
        if (i5 != i4) {
            throw new C0368v8("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final boolean h(Object obj) {
        return ((AbstractC0269l8) obj).zzb.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final int i(AbstractC0299o8 abstractC0299o8) {
        int iHashCode = abstractC0299o8.zzc.hashCode();
        if (!this.f2823c) {
            return iHashCode;
        }
        return ((AbstractC0269l8) abstractC0299o8).zzb.f3082a.hashCode() + (iHashCode * 53);
    }
}
