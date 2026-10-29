package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: loaded from: classes.dex */
public abstract class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2990a = 0;

    static {
        if (Y8.e && Y8.f2968d) {
            int i3 = W7.f2943a;
        }
    }

    public static /* bridge */ /* synthetic */ int a(byte[] bArr, int i3, int i4) {
        int i5 = i4 - i3;
        byte b3 = bArr[i3 - 1];
        if (i5 == 0) {
            if (b3 <= -12) {
                return b3;
            }
            return -1;
        }
        if (i5 == 1) {
            byte b4 = bArr[i3];
            if (b3 > -12 || b4 > -65) {
                return -1;
            }
            return (b4 << 8) ^ b3;
        }
        if (i5 != 2) {
            throw new AssertionError();
        }
        byte b5 = bArr[i3];
        byte b6 = bArr[i3 + 1];
        if (b3 > -12 || b5 > -65 || b6 > -65) {
            return -1;
        }
        return (b6 << 16) ^ ((b5 << 8) ^ b3);
    }

    public static int b(String str, byte[] bArr, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int length = str.length();
        int i8 = 0;
        while (true) {
            i5 = i3 + i4;
            if (i8 >= length || (i7 = i8 + i3) >= i5 || (cCharAt = str.charAt(i8)) >= 128) {
                break;
            }
            bArr[i7] = (byte) cCharAt;
            i8++;
        }
        if (i8 == length) {
            return i3 + length;
        }
        int i9 = i3 + i8;
        while (i8 < length) {
            char cCharAt2 = str.charAt(i8);
            if (cCharAt2 < 128 && i9 < i5) {
                bArr[i9] = (byte) cCharAt2;
                i9++;
            } else if (cCharAt2 < 2048 && i9 <= i5 - 2) {
                bArr[i9] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i9 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i9 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i9 > i5 - 3) {
                    if (i9 > i5 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i6 = i8 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i6)))) {
                            throw new Z8(i8, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i9);
                    }
                    int i10 = i8 + 1;
                    if (i10 != str.length()) {
                        char cCharAt3 = str.charAt(i10);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i11 = i9 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i9 += 4;
                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                            i8 = i10;
                        } else {
                            i8 = i10;
                        }
                    }
                    throw new Z8(i8 - 1, length);
                }
                bArr[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i9 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i9 += 3;
            }
            i8++;
        }
        return i9;
    }

    public static int c(String str) {
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i5 = length;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i4 < length2) {
                    char cCharAt2 = str.charAt(i4);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i4) < 65536) {
                                throw new Z8(i4, length2);
                            }
                            i4++;
                        }
                    }
                    i4++;
                }
                i5 += i3;
                break;
            }
            i5 += (127 - cCharAt) >>> 31;
            i4++;
        }
        if (i5 >= length) {
            return i5;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i5) + 4294967296L));
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(byte[] bArr, int i3, int i4) {
        while (i3 < i4 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i4) {
            return true;
        }
        while (i3 < i4) {
            int i5 = i3 + 1;
            int iA = bArr[i3];
            if (iA >= 0) {
                i3 = i5;
            } else if (iA < -32) {
                if (i5 >= i4) {
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                if (iA < -62) {
                    return false;
                }
                i3 += 2;
                if (bArr[i5] > -65) {
                    return false;
                }
            } else if (iA < -16) {
                if (i5 >= i4 - 1) {
                    iA = a(bArr, i5, i4);
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                int i6 = i3 + 2;
                char c3 = bArr[i5];
                if (c3 > -65) {
                    return false;
                }
                if (iA == -32 && c3 < -96) {
                    return false;
                }
                if (iA == -19 && c3 >= -96) {
                    return false;
                }
                i3 += 3;
                if (bArr[i6] > -65) {
                    return false;
                }
            } else {
                if (i5 >= i4 - 2) {
                    iA = a(bArr, i5, i4);
                    if (iA != 0) {
                        return false;
                    }
                    return true;
                }
                int i7 = i3 + 2;
                int i8 = bArr[i5];
                if (i8 > -65) {
                    return false;
                }
                if ((((i8 + 112) + (iA << 28)) >> 30) != 0) {
                    return false;
                }
                int i9 = i3 + 3;
                if (bArr[i7] > -65) {
                    return false;
                }
                i3 += 4;
                if (bArr[i9] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
