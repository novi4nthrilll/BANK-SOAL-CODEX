package p013d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class J2 {
    public static int a(Object obj, Object obj2, int i3, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iA = K2.a(obj);
        int i4 = iA & i3;
        int iB = b(i4, obj3);
        if (iB != 0) {
            int i5 = ~i3;
            int i6 = iA & i5;
            int i7 = -1;
            while (true) {
                int i8 = iB - 1;
                int i9 = iArr[i8];
                if ((i9 & i5) != i6 || !M2.a(obj, objArr[i8]) || (objArr2 != null && !M2.a(obj2, objArr2[i8]))) {
                    int i10 = i9 & i3;
                    if (i10 == 0) {
                        break;
                    }
                    i7 = i8;
                    iB = i10;
                } else {
                    int i11 = i9 & i3;
                    if (i7 == -1) {
                        d(obj3, i4, i11);
                    } else {
                        iArr[i7] = (i11 & i3) | (iArr[i7] & i5);
                    }
                    return i8;
                }
            }
        }
        return -1;
    }

    public static int b(int i3, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i3] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i3] : ((int[]) obj)[i3];
    }

    public static Object c(int i3) {
        if (i3 < 2 || i3 > 1073741824 || Integer.highestOneBit(i3) != i3) {
            throw new IllegalArgumentException(I.f("must be power of 2 between 2^1 and 2^30: ", i3));
        }
        if (i3 <= 256) {
            return new byte[i3];
        }
        return i3 <= 65536 ? new short[i3] : new int[i3];
    }

    public static void d(Object obj, int i3, int i4) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i4;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i4;
        } else {
            ((int[]) obj)[i3] = i4;
        }
    }
}
