package com.google.android.gms.internal.mlkit_vision_face_bundled;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {
    public static int a(byte[] bArr, int i3, X7 x7) {
        int iJ = j(bArr, i3, x7);
        int i4 = x7.f2951a;
        if (i4 < 0) {
            throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 > bArr.length - iJ) {
            throw new C0368v8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i4 == 0) {
            x7.f2953c = AbstractC0169b8.e;
            return iJ;
        }
        x7.f2953c = AbstractC0169b8.g(bArr, iJ, i4);
        return iJ + i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(int i3, byte[] bArr, int i4, int i5, AbstractC0269l8 abstractC0269l8, C0289n8 c0289n8, X7 x7) {
        int i6;
        C0229h8 c0229h8 = abstractC0269l8.zzb;
        C0279m8 c0279m8 = c0289n8.f3237d;
        b9 b9Var = c0279m8.f3230d;
        Object objValueOf = null;
        if (b9Var == b9.f2997g) {
            j(bArr, i4, x7);
            throw null;
        }
        int iOrdinal = b9Var.ordinal();
        Q7 q7 = c0289n8.f3236c;
        switch (iOrdinal) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                i6 = i4 + 8;
                objValueOf = Double.valueOf(Double.longBitsToDouble(q(bArr, i4)));
                i4 = i6;
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case 1:
                i6 = i4 + 4;
                objValueOf = Float.valueOf(Float.intBitsToFloat(c(bArr, i4)));
                i4 = i6;
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case 2:
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                i4 = m(bArr, i4, x7);
                objValueOf = Long.valueOf(x7.f2952b);
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
            case 12:
                i4 = j(bArr, i4, x7);
                objValueOf = Integer.valueOf(x7.f2951a);
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
            case 15:
                i6 = i4 + 8;
                objValueOf = Long.valueOf(q(bArr, i4));
                i4 = i6;
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case 14:
                i6 = i4 + 4;
                objValueOf = Integer.valueOf(c(bArr, i4));
                i4 = i6;
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                i4 = m(bArr, i4, x7);
                objValueOf = Boolean.valueOf(x7.f2952b != 0);
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                i4 = h(bArr, i4, x7);
                objValueOf = x7.f2953c;
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case 9:
                int iD = d(K8.f2835c.a(q7.getClass()), bArr, i4, i5, ((i3 >>> 3) << 3) | 4, x7);
                c0229h8.d(c0279m8, x7.f2953c);
                return iD;
            case 10:
                int iE = e(K8.f2835c.a(q7.getClass()), bArr, i4, i5, x7);
                c0229h8.d(c0279m8, x7.f2953c);
                return iE;
            case 11:
                i4 = a(bArr, i4, x7);
                objValueOf = x7.f2953c;
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case 13:
                throw new IllegalStateException("Shouldn't reach here.");
            case 16:
                i4 = j(bArr, i4, x7);
                objValueOf = Integer.valueOf(H.a(x7.f2951a));
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            case 17:
                i4 = m(bArr, i4, x7);
                objValueOf = Long.valueOf(H.b(x7.f2952b));
                c0229h8.d(c0279m8, objValueOf);
                return i4;
            default:
                c0229h8.d(c0279m8, objValueOf);
                return i4;
        }
    }

    public static int c(byte[] bArr, int i3) {
        int i4 = bArr[i3] & 255;
        int i5 = bArr[i3 + 1] & 255;
        int i6 = bArr[i3 + 2] & 255;
        return ((bArr[i3 + 3] & 255) << 24) | (i5 << 8) | i4 | (i6 << 16);
    }

    public static int d(N8 n8, byte[] bArr, int i3, int i4, int i5, X7 x7) {
        Object objB = n8.b();
        int iN = n(objB, n8, bArr, i3, i4, i5, x7);
        n8.a(objB);
        x7.f2953c = objB;
        return iN;
    }

    public static int e(N8 n8, byte[] bArr, int i3, int i4, X7 x7) {
        Object objB = n8.b();
        int iO = o(objB, n8, bArr, i3, i4, x7);
        n8.a(objB);
        x7.f2953c = objB;
        return iO;
    }

    public static int f(N8 n8, int i3, byte[] bArr, int i4, int i5, V7 v7, X7 x7) {
        int iE = e(n8, bArr, i4, i5, x7);
        L8 l8 = (L8) v7;
        l8.add(x7.f2953c);
        while (iE < i5) {
            int iJ = j(bArr, iE, x7);
            if (i3 != x7.f2951a) {
                break;
            }
            iE = e(n8, bArr, iJ, i5, x7);
            l8.add(x7.f2953c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i3, V7 v7, X7 x7) {
        throw new ClassCastException();
    }

    public static int h(byte[] bArr, int i3, X7 x7) {
        int iJ = j(bArr, i3, x7);
        int i4 = x7.f2951a;
        if (i4 < 0) {
            throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            x7.f2953c = "";
            return iJ;
        }
        x7.f2953c = new String(bArr, iJ, i4, AbstractC0348t8.f3460a);
        return iJ + i4;
    }

    public static int i(int i3, byte[] bArr, int i4, int i5, S8 s8, X7 x7) {
        if ((i3 >>> 3) == 0) {
            throw new C0368v8("Protocol message contained an invalid tag (zero).");
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            int iM = m(bArr, i4, x7);
            s8.c(i3, Long.valueOf(x7.f2952b));
            return iM;
        }
        if (i6 == 1) {
            s8.c(i3, Long.valueOf(q(bArr, i4)));
            return i4 + 8;
        }
        if (i6 == 2) {
            int iJ = j(bArr, i4, x7);
            int i7 = x7.f2951a;
            if (i7 < 0) {
                throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i7 > bArr.length - iJ) {
                throw new C0368v8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i7 == 0) {
                s8.c(i3, AbstractC0169b8.e);
            } else {
                s8.c(i3, AbstractC0169b8.g(bArr, iJ, i7));
            }
            return iJ + i7;
        }
        if (i6 != 3) {
            if (i6 != 5) {
                throw new C0368v8("Protocol message contained an invalid tag (zero).");
            }
            s8.c(i3, Integer.valueOf(c(bArr, i4)));
            return i4 + 4;
        }
        int i8 = (i3 & (-8)) | 4;
        S8 s8B = S8.b();
        int i9 = x7.e + 1;
        x7.e = i9;
        if (i9 >= 100) {
            throw new C0368v8("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i10 = 0;
        while (i4 < i5) {
            int iJ2 = j(bArr, i4, x7);
            i10 = x7.f2951a;
            if (i10 == i8) {
                i4 = iJ2;
                break;
            }
            i4 = i(i10, bArr, iJ2, i5, s8B, x7);
        }
        x7.e--;
        if (i4 > i5 || i10 != i8) {
            throw new C0368v8("Failed to parse the message.");
        }
        s8.c(i3, s8B);
        return i4;
    }

    public static int j(byte[] bArr, int i3, X7 x7) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        if (b3 < 0) {
            return k(b3, bArr, i4, x7);
        }
        x7.f2951a = b3;
        return i4;
    }

    public static int k(int i3, byte[] bArr, int i4, X7 x7) {
        byte b3 = bArr[i4];
        int i5 = i4 + 1;
        int i6 = i3 & 127;
        if (b3 >= 0) {
            x7.f2951a = i6 | (b3 << 7);
            return i5;
        }
        int i7 = i6 | ((b3 & 127) << 7);
        int i8 = i4 + 2;
        byte b4 = bArr[i5];
        if (b4 >= 0) {
            x7.f2951a = i7 | (b4 << 14);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 14);
        int i10 = i4 + 3;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            x7.f2951a = i9 | (b5 << 21);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 21);
        int i12 = i4 + 4;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            x7.f2951a = i11 | (b6 << 28);
            return i12;
        }
        int i13 = i11 | ((b6 & 127) << 28);
        while (true) {
            int i14 = i12 + 1;
            if (bArr[i12] >= 0) {
                x7.f2951a = i13;
                return i14;
            }
            i12 = i14;
        }
    }

    public static void l(byte[] bArr, int i3, V7 v7, X7 x7) {
        throw new ClassCastException();
    }

    public static int m(byte[] bArr, int i3, X7 x7) {
        long j3 = bArr[i3];
        int i4 = i3 + 1;
        if (j3 >= 0) {
            x7.f2952b = j3;
            return i4;
        }
        int i5 = i3 + 2;
        byte b3 = bArr[i4];
        long j4 = (j3 & 127) | (((long) (b3 & 127)) << 7);
        int i6 = 7;
        while (b3 < 0) {
            int i7 = i5 + 1;
            byte b4 = bArr[i5];
            i6 += 7;
            j4 |= ((long) (b4 & 127)) << i6;
            b3 = b4;
            i5 = i7;
        }
        x7.f2952b = j4;
        return i5;
    }

    public static int n(Object obj, N8 n8, byte[] bArr, int i3, int i4, int i5, X7 x7) {
        G8 g8 = (G8) n8;
        int i6 = x7.e + 1;
        x7.e = i6;
        if (i6 >= 100) {
            throw new C0368v8("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iT = g8.t(obj, bArr, i3, i4, i5, x7);
        x7.e--;
        x7.f2953c = obj;
        return iT;
    }

    public static int o(Object obj, N8 n8, byte[] bArr, int i3, int i4, X7 x7) {
        int iK = i3 + 1;
        int i5 = bArr[i3];
        if (i5 < 0) {
            iK = k(i5, bArr, iK, x7);
            i5 = x7.f2951a;
        }
        int i6 = iK;
        if (i5 < 0 || i5 > i4 - i6) {
            throw new C0368v8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i7 = x7.e + 1;
        x7.e = i7;
        if (i7 >= 100) {
            throw new C0368v8("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = i5 + i6;
        n8.g(obj, bArr, i6, i8, x7);
        x7.e--;
        x7.f2953c = obj;
        return i8;
    }

    public static int p(int i3, byte[] bArr, int i4, int i5, X7 x7) {
        if ((i3 >>> 3) == 0) {
            throw new C0368v8("Protocol message contained an invalid tag (zero).");
        }
        int i6 = i3 & 7;
        if (i6 == 0) {
            return m(bArr, i4, x7);
        }
        if (i6 == 1) {
            return i4 + 8;
        }
        if (i6 == 2) {
            return j(bArr, i4, x7) + x7.f2951a;
        }
        if (i6 != 3) {
            if (i6 == 5) {
                return i4 + 4;
            }
            throw new C0368v8("Protocol message contained an invalid tag (zero).");
        }
        int i7 = (i3 & (-8)) | 4;
        int i8 = 0;
        while (i4 < i5) {
            i4 = j(bArr, i4, x7);
            i8 = x7.f2951a;
            if (i8 == i7) {
                break;
            }
            i4 = p(i8, bArr, i4, i5, x7);
        }
        if (i4 > i5 || i8 != i7) {
            throw new C0368v8("Failed to parse the message.");
        }
        return i4;
    }

    public static long q(byte[] bArr, int i3) {
        return (((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8) | ((((long) bArr[i3 + 2]) & 255) << 16) | ((((long) bArr[i3 + 3]) & 255) << 24) | ((((long) bArr[i3 + 4]) & 255) << 32) | ((((long) bArr[i3 + 5]) & 255) << 40) | ((((long) bArr[i3 + 6]) & 255) << 48) | ((((long) bArr[i3 + 7]) & 255) << 56);
    }
}
