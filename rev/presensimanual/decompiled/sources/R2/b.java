package R2;

import java.io.Serializable;
import java.util.Arrays;
import p013d1.AbstractC0540w;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable, Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f1512g = new b(new byte[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1513d;
    public transient int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient String f1514f;

    public b(byte[] bArr) {
        B2.h.e(bArr, "data");
        this.f1513d = bArr;
    }

    public static int e(b bVar, b bVar2) {
        bVar.getClass();
        B2.h.e(bVar2, "other");
        return bVar.d(bVar2.f1513d, 0);
    }

    public static int i(b bVar, b bVar2) {
        bVar.getClass();
        B2.h.e(bVar2, "other");
        return bVar.h(bVar2.f1513d, -1234567890);
    }

    public static /* synthetic */ b m(b bVar, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i3 = 0;
        }
        if ((i5 & 2) != 0) {
            i4 = -1234567890;
        }
        return bVar.l(i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        B2.h.e(bVar, "other");
        int iB = b();
        int iB2 = bVar.b();
        int iMin = Math.min(iB, iB2);
        for (int i3 = 0; i3 < iMin; i3++) {
            int iG = g(i3) & 255;
            int iG2 = bVar.g(i3) & 255;
            if (iG != iG2) {
                if (iG < iG2) {
                    return -1;
                }
                return 1;
            }
        }
        if (iB == iB2) {
            return 0;
        }
        if (iB < iB2) {
            return -1;
        }
        return 1;
    }

    public int b() {
        return this.f1513d.length;
    }

    public String c() {
        byte[] bArr = this.f1513d;
        char[] cArr = new char[bArr.length * 2];
        int i3 = 0;
        for (byte b3 : bArr) {
            int i4 = i3 + 1;
            char[] cArr2 = S2.a.f1600a;
            cArr[i3] = cArr2[(b3 >> 4) & 15];
            i3 += 2;
            cArr[i4] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public int d(byte[] bArr, int i3) {
        B2.h.e(bArr, "other");
        byte[] bArr2 = this.f1513d;
        int length = bArr2.length - bArr.length;
        int iMax = Math.max(i3, 0);
        if (iMax <= length) {
            while (!AbstractC0540w.a(iMax, 0, bArr.length, bArr2, bArr)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int iB = bVar.b();
            byte[] bArr = this.f1513d;
            if (iB == bArr.length && bVar.k(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f1513d;
    }

    public byte g(int i3) {
        return this.f1513d[i3];
    }

    public int h(byte[] bArr, int i3) {
        B2.h.e(bArr, "other");
        if (i3 == -1234567890) {
            i3 = b();
        }
        byte[] bArr2 = this.f1513d;
        for (int iMin = Math.min(i3, bArr2.length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC0540w.a(iMin, 0, bArr.length, bArr2, bArr)) {
                return iMin;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i3 = this.e;
        if (i3 != 0) {
            return i3;
        }
        int iHashCode = Arrays.hashCode(this.f1513d);
        this.e = iHashCode;
        return iHashCode;
    }

    public boolean j(int i3, b bVar, int i4) {
        B2.h.e(bVar, "other");
        return bVar.k(0, this.f1513d, i3, i4);
    }

    public boolean k(int i3, byte[] bArr, int i4, int i5) {
        B2.h.e(bArr, "other");
        if (i3 >= 0) {
            byte[] bArr2 = this.f1513d;
            if (i3 <= bArr2.length - i5 && i4 >= 0 && i4 <= bArr.length - i5 && AbstractC0540w.a(i3, i4, i5, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public b l(int i3, int i4) {
        if (i4 == -1234567890) {
            i4 = b();
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f1513d;
        if (i4 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (i4 - i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i3 == 0 && i4 == bArr.length) {
            return this;
        }
        p059r2.c.c(i4, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, i4);
        B2.h.d(bArrCopyOfRange, "copyOfRange(...)");
        return new b(bArrCopyOfRange);
    }

    public final String n() {
        String str = this.f1514f;
        if (str != null) {
            return str;
        }
        byte[] bArrF = f();
        B2.h.e(bArrF, "<this>");
        String str2 = new String(bArrF, H2.a.f330a);
        this.f1514f = str2;
        return str2;
    }

    public void o(a aVar, int i3) {
        B2.h.e(aVar, "buffer");
        aVar.n(this.f1513d, 0, i3);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[EDGE_INSN: B:22:0x003c->B:180:0x01a6 BREAK  A[LOOP:0: B:6:0x000f->B:238:0x000f]] */
    public String toString() {
        b bVar;
        byte b3;
        int i3;
        byte[] bArr = this.f1513d;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        loop0: while (i4 < length) {
            byte b4 = bArr[i4];
            if (b4 < 0) {
                if ((b4 >> 5) != -2) {
                    if ((b4 >> 4) != -2) {
                        if ((b4 >> 3) != -2) {
                            if (i6 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        int i7 = i4 + 3;
                        if (length > i7) {
                            byte b5 = bArr[i4 + 1];
                            if ((b5 & 192) != 128) {
                                if (i6 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            byte b6 = bArr[i4 + 2];
                            if ((b6 & 192) != 128) {
                                if (i6 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i6 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            int i8 = (((b7 ^ 3678080) ^ (b6 << 6)) ^ (b5 << 12)) ^ (b4 << 18);
                            if (i8 <= 1114111) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i6 == 64) {
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                }
                                if (i8 >= 65536) {
                                    i3 = i6 + 1;
                                    if (i6 == 64) {
                                        break;
                                    }
                                    if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                        i5 = -1;
                                        break;
                                    }
                                    i5 += i8 < 65536 ? 1 : 2;
                                    i4 += 4;
                                    i6 = i3;
                                } else {
                                    if (i6 == 64) {
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                }
                            } else {
                                if (i6 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                        } else {
                            if (i6 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                    } else {
                        int i9 = i4 + 2;
                        if (length > i9) {
                            byte b8 = bArr[i4 + 1];
                            if ((b8 & 192) != 128) {
                                if (i6 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            byte b9 = bArr[i9];
                            if ((b9 & 192) != 128) {
                                if (i6 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                            int i10 = ((b9 ^ (-123008)) ^ (b8 << 6)) ^ (b4 << 12);
                            if (i10 >= 2048) {
                                if (55296 <= i10 && i10 < 57344) {
                                    if (i6 == 64) {
                                        break;
                                    }
                                    i5 = -1;
                                    break;
                                }
                                i3 = i6 + 1;
                                if (i6 == 64) {
                                    break;
                                }
                                if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                    i5 = -1;
                                    break;
                                }
                                i5 += i10 < 65536 ? 1 : 2;
                                i4 += 3;
                                i6 = i3;
                            } else {
                                if (i6 == 64) {
                                    break;
                                }
                                i5 = -1;
                                break;
                            }
                        } else {
                            if (i6 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                    }
                } else {
                    int i11 = i4 + 1;
                    if (length > i11) {
                        byte b10 = bArr[i11];
                        if ((b10 & 192) != 128) {
                            if (i6 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                        int i12 = (b10 ^ 3968) ^ (b4 << 6);
                        if (i12 >= 128) {
                            i3 = i6 + 1;
                            if (i6 == 64) {
                                break;
                            }
                            if ((i12 != 10 && i12 != 13 && ((i12 >= 0 && i12 < 32) || (127 <= i12 && i12 < 160))) || i12 == 65533) {
                                i5 = -1;
                                break;
                            }
                            i5 += i12 < 65536 ? 1 : 2;
                            i4 += 2;
                            i6 = i3;
                        } else {
                            if (i6 == 64) {
                                break;
                            }
                            i5 = -1;
                            break;
                        }
                    } else {
                        if (i6 == 64) {
                            break;
                        }
                        i5 = -1;
                        break;
                    }
                }
            } else {
                int i13 = i6 + 1;
                if (i6 == 64) {
                    break;
                }
                if ((b4 == 10 || b4 == 13 || ((b4 < 0 || b4 >= 32) && (127 > b4 || b4 >= 160))) && b4 != 65533) {
                    i5 += b4 < 65536 ? 1 : 2;
                    i4++;
                    while (true) {
                        i6 = i13;
                        if (i4 < length && (b3 = bArr[i4]) >= 0) {
                            i4++;
                            i13 = i6 + 1;
                            if (i6 == 64) {
                                break loop0;
                            }
                            if ((b3 == 10 || b3 == 13 || ((b3 < 0 || b3 >= 32) && (127 > b3 || b3 >= 160))) && b3 != 65533) {
                                i5 += b3 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i5 = -1;
                break;
            }
        }
        if (i5 != -1) {
            String strN = n();
            String strSubstring = strN.substring(0, i5);
            B2.h.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strG = H2.i.g(H2.i.g(H2.i.g(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i5 >= strN.length()) {
                return "[text=" + strG + ']';
            }
            return "[size=" + bArr.length + " text=" + strG + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            bVar = this;
        } else {
            p059r2.c.c(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            B2.h.d(bArrCopyOfRange, "copyOfRange(...)");
            bVar = new b(bArrCopyOfRange);
        }
        sb.append(bVar.c());
        sb.append("…]");
        return sb.toString();
    }
}
