package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2340a;

    /* JADX WARN: Code duplicated, block: B:107:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065 A[LOOP:2: B:23:0x005f->B:26:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0139 A[SYNTHETIC] */
    public final String a(byte[] bArr, int i3, int i4) {
        int i5;
        byte b3;
        int i6;
        byte b4;
        byte b5;
        byte b6;
        int i7 = i3;
        switch (this.f2340a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if ((i7 | i4 | ((bArr.length - i7) - i4)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
                }
                int i8 = i7 + i4;
                char[] cArr = new char[i4];
                int i9 = 0;
                while (i7 < i8) {
                    byte b7 = bArr[i7];
                    if (b7 < 0) {
                        while (i7 < i8) {
                            i5 = i7 + 1;
                            b3 = bArr[i7];
                            if (b3 < 0) {
                                i6 = i9 + 1;
                                cArr[i9] = (char) b3;
                                while (i5 < i8) {
                                    b4 = bArr[i5];
                                    if (b4 >= 0) {
                                        i5++;
                                        cArr[i6] = (char) b4;
                                        i6++;
                                    } else {
                                        i9 = i6;
                                        i7 = i5;
                                    }
                                }
                                i9 = i6;
                                i7 = i5;
                            } else if (b3 < -32) {
                                if (i5 < i8) {
                                    throw E.a();
                                }
                                i7 += 2;
                                byte b8 = bArr[i5];
                                int i10 = i9 + 1;
                                if (b3 >= -62 || p013d1.H.a(b8)) {
                                    throw E.a();
                                }
                                cArr[i9] = (char) ((b8 & 63) | ((b3 & 31) << 6));
                                i9 = i10;
                            } else if (b3 < -16) {
                                if (i5 < i8 - 1) {
                                    throw E.a();
                                }
                                int i11 = i7 + 2;
                                b5 = bArr[i5];
                                i7 += 3;
                                byte b9 = bArr[i11];
                                int i12 = i9 + 1;
                                if (!p013d1.H.a(b5) || ((b3 == -32 && b5 < -96) || ((b3 == -19 && b5 >= -96) || p013d1.H.a(b9)))) {
                                    throw E.a();
                                }
                                cArr[i9] = (char) (((b5 & 63) << 6) | ((b3 & 15) << 12) | (b9 & 63));
                                i9 = i12;
                            } else {
                                if (i5 < i8 - 2) {
                                    throw E.a();
                                }
                                b6 = bArr[i5];
                                int i13 = i7 + 3;
                                byte b10 = bArr[i7 + 2];
                                i7 += 4;
                                byte b11 = bArr[i13];
                                int i14 = i9 + 1;
                                if (!p013d1.H.a(b6) || (((b6 + 112) + (b3 << 28)) >> 30) != 0 || p013d1.H.a(b10) || p013d1.H.a(b11)) {
                                    throw E.a();
                                }
                                int i15 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b10 & 63) << 6) | (b11 & 63);
                                cArr[i9] = (char) ((i15 >>> 10) + 55232);
                                cArr[i14] = (char) ((i15 & 1023) + 56320);
                                i9 += 2;
                            }
                        }
                        return new String(cArr, 0, i9);
                    }
                    i7++;
                    cArr[i9] = (char) b7;
                    i9++;
                }
                while (i7 < i8) {
                    i5 = i7 + 1;
                    b3 = bArr[i7];
                    if (b3 < 0) {
                        if (b3 < -32) {
                            if (i5 < i8) {
                                throw E.a();
                            }
                            i7 += 2;
                            byte b12 = bArr[i5];
                            int i16 = i9 + 1;
                            if (b3 >= -62) {
                            }
                            throw E.a();
                        }
                        if (b3 < -16) {
                            if (i5 < i8 - 1) {
                                throw E.a();
                            }
                            int i17 = i7 + 2;
                            b5 = bArr[i5];
                            i7 += 3;
                            byte b13 = bArr[i17];
                            int i18 = i9 + 1;
                            if (p013d1.H.a(b5)) {
                            }
                            throw E.a();
                        }
                        if (i5 < i8 - 2) {
                            throw E.a();
                        }
                        b6 = bArr[i5];
                        int i19 = i7 + 3;
                        byte b14 = bArr[i7 + 2];
                        i7 += 4;
                        byte b15 = bArr[i19];
                        int i110 = i9 + 1;
                        if (p013d1.H.a(b6)) {
                        }
                        throw E.a();
                    }
                    i6 = i9 + 1;
                    cArr[i9] = (char) b3;
                    while (i5 < i8) {
                        b4 = bArr[i5];
                        if (b4 >= 0) {
                            i5++;
                            cArr[i6] = (char) b4;
                            i6++;
                        } else {
                            i9 = i6;
                            i7 = i5;
                        }
                    }
                    i9 = i6;
                    i7 = i5;
                }
                return new String(cArr, 0, i9);
            default:
                Charset charset = C.f2218a;
                String str = new String(bArr, i7, i4, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i4 + i7))) {
                    throw E.a();
                }
                return str;
        }
    }

    public final int b(String str, byte[] bArr, int i3, int i4) {
        int i5;
        int i6;
        char cCharAt;
        long j3;
        String str2;
        String str3;
        int i7;
        char cCharAt2;
        switch (this.f2340a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                int length = str.length();
                int i8 = i4 + i3;
                int i9 = 0;
                while (i9 < length && (i6 = i9 + i3) < i8 && (cCharAt = str.charAt(i9)) < 128) {
                    bArr[i6] = (byte) cCharAt;
                    i9++;
                }
                if (i9 == length) {
                    return i3 + length;
                }
                int i10 = i3 + i9;
                while (i9 < length) {
                    char cCharAt3 = str.charAt(i9);
                    if (cCharAt3 < 128 && i10 < i8) {
                        bArr[i10] = (byte) cCharAt3;
                        i10++;
                    } else if (cCharAt3 < 2048 && i10 <= i8 - 2) {
                        int i11 = i10 + 1;
                        bArr[i10] = (byte) ((cCharAt3 >>> 6) | 960);
                        i10 += 2;
                        bArr[i11] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i10 > i8 - 3) {
                            if (i10 > i8 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i5 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i5)))) {
                                    throw new r0(i9, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i10);
                            }
                            int i12 = i9 + 1;
                            if (i12 != str.length()) {
                                char cCharAt4 = str.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i10 + 3;
                                    bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i10 += 4;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i9 = i12;
                                } else {
                                    i9 = i12;
                                }
                            }
                            throw new r0(i9 - 1, length);
                        }
                        bArr[i10] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i14 = i10 + 2;
                        bArr[i10 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i10 += 3;
                        bArr[i14] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i9++;
                }
                return i10;
            default:
                long j4 = i3;
                long j5 = ((long) i4) + j4;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i4 || bArr.length - i4 < i3) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i3 + i4));
                }
                int i15 = 0;
                while (true) {
                    j3 = 1;
                    if (i15 < length2 && (cCharAt2 = str.charAt(i15)) < 128) {
                        p0.j(bArr, j4, (byte) cCharAt2);
                        i15++;
                        j4 = 1 + j4;
                    }
                }
                if (i15 != length2) {
                    while (i15 < length2) {
                        char cCharAt5 = str.charAt(i15);
                        if (cCharAt5 < 128 && j4 < j5) {
                            p0.j(bArr, j4, (byte) cCharAt5);
                            str3 = str5;
                            j4 += j3;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j4 > j5 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j4 > j5 - 3) {
                                if (j4 > j5 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i7 = i15 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i7)))) {
                                        throw new r0(i15, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j4);
                                }
                                int i16 = i15 + 1;
                                if (i16 != length2) {
                                    char cCharAt6 = str.charAt(i16);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        p0.j(bArr, j4, (byte) ((codePoint2 >>> 18) | 240));
                                        p0.j(bArr, j4 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j6 = 3 + j4;
                                        p0.j(bArr, j4 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j4 += 4;
                                        p0.j(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                        i15 = i16;
                                    } else {
                                        i15 = i16;
                                    }
                                }
                                throw new r0(i15 - 1, length2);
                            }
                            p0.j(bArr, j4, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j7 = j4 + 2;
                            p0.j(bArr, j4 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j4 += 3;
                            p0.j(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j8 = j4 + j3;
                            p0.j(bArr, j4, (byte) ((cCharAt5 >>> 6) | 960));
                            j4 += 2;
                            p0.j(bArr, j8, (byte) ((cCharAt5 & '?') | 128));
                        }
                        i15++;
                        str4 = str2;
                        str5 = str3;
                        j3 = 1;
                    }
                }
                return (int) j4;
        }
    }
}
