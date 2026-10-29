package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class U implements c0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f2244n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f2245o = p0.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f2247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2249d;
    public final AbstractC0119a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f2251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final W f2254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H f2255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k0 f2256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final P f2257m;

    public U(int[] iArr, Object[] objArr, int i3, int i4, AbstractC0119a abstractC0119a, int[] iArr2, int i5, int i6, W w3, H h3, k0 k0Var, r rVar, P p3) {
        this.f2246a = iArr;
        this.f2247b = objArr;
        this.f2248c = i3;
        this.f2249d = i4;
        this.f2250f = abstractC0119a instanceof AbstractC0143z;
        this.f2251g = iArr2;
        this.f2252h = i5;
        this.f2253i = i6;
        this.f2254j = w3;
        this.f2255k = h3;
        this.f2256l = k0Var;
        this.e = abstractC0119a;
        this.f2257m = p3;
    }

    public static long A(long j3, Object obj) {
        return ((Long) p0.f2334c.h(j3, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int L(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0143z) {
            return ((AbstractC0143z) obj).i();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x024c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0250  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:128:0x026c  */
    public static U x(b0 b0Var, W w3, H h3, k0 k0Var, r rVar, P p3) {
        int i3;
        int iCharAt;
        int iCharAt2;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char cCharAt;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        char cCharAt8;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iObjectFieldOffset;
        int i24;
        int i25;
        int iObjectFieldOffset2;
        Field fieldG;
        int i26;
        char cCharAt9;
        int i27;
        int i28;
        int i29;
        Object obj;
        Field fieldG2;
        int i30;
        Object obj2;
        Field fieldG3;
        int i31;
        char cCharAt10;
        int i32;
        char cCharAt11;
        int i33;
        char cCharAt12;
        int i34;
        char cCharAt13;
        String strC = b0Var.c();
        int length = strC.length();
        char c3 = 55296;
        if (strC.charAt(0) >= 55296) {
            int i35 = 1;
            while (true) {
                i3 = i35 + 1;
                if (strC.charAt(i35) < 55296) {
                    break;
                }
                i35 = i3;
            }
        } else {
            i3 = 1;
        }
        int i36 = i3 + 1;
        int iCharAt3 = strC.charAt(i3);
        if (iCharAt3 >= 55296) {
            int i37 = iCharAt3 & 8191;
            int i38 = 13;
            while (true) {
                i34 = i36 + 1;
                cCharAt13 = strC.charAt(i36);
                if (cCharAt13 < 55296) {
                    break;
                }
                i37 |= (cCharAt13 & 8191) << i38;
                i38 += 13;
                i36 = i34;
            }
            iCharAt3 = i37 | (cCharAt13 << i38);
            i36 = i34;
        }
        if (iCharAt3 == 0) {
            iArr = f2244n;
            i4 = 0;
            i6 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i5 = 0;
            i8 = 0;
            i7 = 0;
        } else {
            int i39 = i36 + 1;
            int iCharAt4 = strC.charAt(i36);
            if (iCharAt4 >= 55296) {
                int i40 = iCharAt4 & 8191;
                int i41 = 13;
                while (true) {
                    i16 = i39 + 1;
                    cCharAt8 = strC.charAt(i39);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt8 & 8191) << i41;
                    i41 += 13;
                    i39 = i16;
                }
                iCharAt4 = i40 | (cCharAt8 << i41);
                i39 = i16;
            }
            int i42 = i39 + 1;
            int iCharAt5 = strC.charAt(i39);
            if (iCharAt5 >= 55296) {
                int i43 = iCharAt5 & 8191;
                int i44 = 13;
                while (true) {
                    i15 = i42 + 1;
                    cCharAt7 = strC.charAt(i42);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt7 & 8191) << i44;
                    i44 += 13;
                    i42 = i15;
                }
                iCharAt5 = i43 | (cCharAt7 << i44);
                i42 = i15;
            }
            int i45 = i42 + 1;
            int iCharAt6 = strC.charAt(i42);
            if (iCharAt6 >= 55296) {
                int i46 = iCharAt6 & 8191;
                int i47 = 13;
                while (true) {
                    i14 = i45 + 1;
                    cCharAt6 = strC.charAt(i45);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt6 & 8191) << i47;
                    i47 += 13;
                    i45 = i14;
                }
                iCharAt6 = i46 | (cCharAt6 << i47);
                i45 = i14;
            }
            int i48 = i45 + 1;
            int iCharAt7 = strC.charAt(i45);
            if (iCharAt7 >= 55296) {
                int i49 = iCharAt7 & 8191;
                int i50 = 13;
                while (true) {
                    i13 = i48 + 1;
                    cCharAt5 = strC.charAt(i48);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt5 & 8191) << i50;
                    i50 += 13;
                    i48 = i13;
                }
                iCharAt7 = i49 | (cCharAt5 << i50);
                i48 = i13;
            }
            int i51 = i48 + 1;
            iCharAt = strC.charAt(i48);
            if (iCharAt >= 55296) {
                int i52 = iCharAt & 8191;
                int i53 = 13;
                while (true) {
                    i12 = i51 + 1;
                    cCharAt4 = strC.charAt(i51);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt4 & 8191) << i53;
                    i53 += 13;
                    i51 = i12;
                }
                iCharAt = i52 | (cCharAt4 << i53);
                i51 = i12;
            }
            int i54 = i51 + 1;
            iCharAt2 = strC.charAt(i51);
            if (iCharAt2 >= 55296) {
                int i55 = iCharAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i11 = i54 + 1;
                    cCharAt3 = strC.charAt(i54);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt3 & 8191) << i56;
                    i56 += 13;
                    i54 = i11;
                }
                iCharAt2 = i55 | (cCharAt3 << i56);
                i54 = i11;
            }
            int i57 = i54 + 1;
            int iCharAt8 = strC.charAt(i54);
            if (iCharAt8 >= 55296) {
                int i58 = iCharAt8 & 8191;
                int i59 = 13;
                while (true) {
                    i10 = i57 + 1;
                    cCharAt2 = strC.charAt(i57);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i58 |= (cCharAt2 & 8191) << i59;
                    i59 += 13;
                    i57 = i10;
                }
                iCharAt8 = i58 | (cCharAt2 << i59);
                i57 = i10;
            }
            int i60 = i57 + 1;
            int iCharAt9 = strC.charAt(i57);
            if (iCharAt9 >= 55296) {
                int i61 = iCharAt9 & 8191;
                int i62 = 13;
                while (true) {
                    i9 = i60 + 1;
                    cCharAt = strC.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i61 |= (cCharAt & 8191) << i62;
                    i62 += 13;
                    i60 = i9;
                }
                iCharAt9 = i61 | (cCharAt << i62);
                i60 = i9;
            }
            int i63 = (iCharAt4 * 2) + iCharAt5;
            i4 = iCharAt4;
            i36 = i60;
            iArr = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i5 = iCharAt6;
            i6 = i63;
            i7 = iCharAt9;
            i8 = iCharAt7;
        }
        Unsafe unsafe = f2245o;
        Object[] objArrB = b0Var.b();
        Class<?> cls = b0Var.a().getClass();
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i64 = i7 + iCharAt2;
        int i65 = i7;
        int i66 = i64;
        int i67 = 0;
        int i68 = 0;
        while (i36 < length) {
            int i69 = i36 + 1;
            int iCharAt10 = strC.charAt(i36);
            if (iCharAt10 >= c3) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i33 = i71 + 1;
                    cCharAt12 = strC.charAt(i71);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i33;
                }
                iCharAt10 = i70 | (cCharAt12 << i72);
                i17 = i33;
            } else {
                i17 = i69;
            }
            int i73 = i17 + 1;
            int iCharAt11 = strC.charAt(i17);
            if (iCharAt11 >= c3) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i32 = i75 + 1;
                    cCharAt11 = strC.charAt(i75);
                    i18 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i32;
                    length = i18;
                }
                iCharAt11 = i74 | (cCharAt11 << i76);
                i19 = i32;
            } else {
                i18 = length;
                i19 = i73;
            }
            int i77 = iCharAt11 & 255;
            int i78 = i7;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            if (i77 >= 51) {
                int i79 = i19 + 1;
                int iCharAt12 = strC.charAt(i19);
                i20 = i67;
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i80 = iCharAt12 & 8191;
                    int i81 = 13;
                    while (true) {
                        i31 = i79 + 1;
                        cCharAt10 = strC.charAt(i79);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i79 = i31;
                        c4 = 55296;
                    }
                    iCharAt12 = i80 | (cCharAt10 << i81);
                    i79 = i31;
                }
                int i82 = i77 - 51;
                int i83 = i79;
                if (i82 == 9 || i82 == 17) {
                    i28 = i6 + 1;
                    objArr[((i68 / 3) * 2) + 1] = objArrB[i6];
                } else {
                    if (i82 == 12 && (M.j.a(b0Var.d(), 1) || (iCharAt11 & 2048) != 0)) {
                        i28 = i6 + 1;
                        objArr[((i68 / 3) * 2) + 1] = objArrB[i6];
                    }
                    i29 = iCharAt12 * 2;
                    obj = objArrB[i29];
                    if (obj instanceof Field) {
                        fieldG2 = (Field) obj;
                    } else {
                        fieldG2 = G(cls, (String) obj);
                        objArrB[i29] = fieldG2;
                    }
                    int i84 = i5;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldG2);
                    i30 = i29 + 1;
                    obj2 = objArrB[i30];
                    int i85 = i6;
                    if (obj2 instanceof Field) {
                        fieldG3 = (Field) obj2;
                    } else {
                        fieldG3 = G(cls, (String) obj2);
                        objArrB[i30] = fieldG3;
                    }
                    iObjectFieldOffset = iObjectFieldOffset3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG3);
                    i21 = i85;
                    i24 = i83;
                    i25 = 0;
                    i22 = i8;
                    i23 = i84;
                    objArr = objArr;
                }
                i6 = i28;
                i29 = iCharAt12 * 2;
                obj = objArrB[i29];
                if (obj instanceof Field) {
                    fieldG2 = (Field) obj;
                } else {
                    fieldG2 = G(cls, (String) obj);
                    objArrB[i29] = fieldG2;
                }
                int i86 = i5;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldG2);
                i30 = i29 + 1;
                obj2 = objArrB[i30];
                int i87 = i6;
                if (obj2 instanceof Field) {
                    fieldG3 = (Field) obj2;
                } else {
                    fieldG3 = G(cls, (String) obj2);
                    objArrB[i30] = fieldG3;
                }
                iObjectFieldOffset = iObjectFieldOffset4;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG3);
                i21 = i87;
                i24 = i83;
                i25 = 0;
                i22 = i8;
                i23 = i86;
                objArr = objArr;
            } else {
                i20 = i67;
                int i88 = i5;
                i21 = i6 + 1;
                Field fieldG4 = G(cls, (String) objArrB[i6]);
                i22 = i8;
                if (i77 == 9 || i77 == 17) {
                    i23 = i88;
                    objArr[((i68 / 3) * 2) + 1] = fieldG4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        i23 = i88;
                        i27 = i6 + 2;
                        objArr[((i68 / 3) * 2) + 1] = objArrB[i21];
                    } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                        i23 = i88;
                        if (b0Var.d() == 1 || (iCharAt11 & 2048) != 0) {
                            i27 = i6 + 2;
                            objArr[((i68 / 3) * 2) + 1] = objArrB[i21];
                        }
                    } else {
                        if (i77 == 50) {
                            int i89 = i65 + 1;
                            iArr[i65] = i68;
                            int i90 = (i68 / 3) * 2;
                            int i91 = i6 + 2;
                            objArr[i90] = objArrB[i21];
                            if ((iCharAt11 & 2048) != 0) {
                                i21 = i6 + 3;
                                objArr[i90 + 1] = objArrB[i91];
                                i65 = i89;
                            } else {
                                i65 = i89;
                                i21 = i91;
                            }
                        }
                        i23 = i88;
                    }
                    i21 = i27;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldG4);
                if ((iCharAt11 & 4096) == 0 || i77 > 17) {
                    i24 = i19;
                    i25 = 0;
                    iObjectFieldOffset2 = 1048575;
                } else {
                    i24 = i19 + 1;
                    int iCharAt13 = strC.charAt(i19);
                    if (iCharAt13 >= 55296) {
                        int i92 = iCharAt13 & 8191;
                        int i93 = 13;
                        while (true) {
                            i26 = i24 + 1;
                            cCharAt9 = strC.charAt(i24);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i92 |= (cCharAt9 & 8191) << i93;
                            i93 += 13;
                            i24 = i26;
                        }
                        iCharAt13 = i92 | (cCharAt9 << i93);
                        i24 = i26;
                    }
                    int i94 = (iCharAt13 / 32) + (i4 * 2);
                    Object obj3 = objArrB[i94];
                    if (obj3 instanceof Field) {
                        fieldG = (Field) obj3;
                    } else {
                        fieldG = G(cls, (String) obj3);
                        objArrB[i94] = fieldG;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldG);
                    i25 = iCharAt13 % 32;
                }
                if (i77 >= 18 && i77 <= 49) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
            }
            int i95 = i68 + 1;
            iArr2[i68] = iCharAt10;
            int i96 = i68 + 2;
            String str = strC;
            iArr2[i95] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | iObjectFieldOffset;
            i68 += 3;
            iArr2[i96] = (i25 << 20) | iObjectFieldOffset2;
            i36 = i24;
            objArr = objArr;
            i7 = i78;
            i6 = i21;
            i67 = i20;
            length = i18;
            i5 = i23;
            strC = str;
            i8 = i22;
            c3 = 55296;
        }
        return new U(iArr2, objArr, i5, i8, b0Var.a(), iArr, i7, i64, w3, h3, k0Var, rVar, p3);
    }

    public static long y(int i3) {
        return i3 & 1048575;
    }

    public static int z(long j3, Object obj) {
        return ((Integer) p0.f2334c.h(j3, obj)).intValue();
    }

    public final int B(int i3) {
        if (i3 < this.f2248c || i3 > this.f2249d) {
            return -1;
        }
        int[] iArr = this.f2246a;
        int length = (iArr.length / 3) - 1;
        int i4 = 0;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int i7 = iArr[i6];
            if (i3 == i7) {
                return i6;
            }
            if (i3 < i7) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    public final void C(Object obj, long j3, C0130l c0130l, c0 c0Var, C0135q c0135q) throws D {
        int iU;
        this.f2255k.getClass();
        B b3 = H.b(j3, obj);
        int i3 = c0130l.f2320b;
        if ((i3 & 7) != 3) {
            throw E.b();
        }
        do {
            AbstractC0143z abstractC0143zG = c0Var.g();
            c0130l.b(abstractC0143zG, c0Var, c0135q);
            c0Var.h(abstractC0143zG);
            b3.add(abstractC0143zG);
            AbstractC0129k abstractC0129k = c0130l.f2319a;
            if (abstractC0129k.c() || c0130l.f2322d != 0) {
                return;
            } else {
                iU = abstractC0129k.u();
            }
        } while (iU == i3);
        c0130l.f2322d = iU;
    }

    public final void D(Object obj, int i3, C0130l c0130l, c0 c0Var, C0135q c0135q) throws E {
        int iU;
        this.f2255k.getClass();
        B b3 = H.b(i3 & 1048575, obj);
        int i4 = c0130l.f2320b;
        if ((i4 & 7) != 2) {
            throw E.b();
        }
        do {
            AbstractC0143z abstractC0143zG = c0Var.g();
            c0130l.c(abstractC0143zG, c0Var, c0135q);
            c0Var.h(abstractC0143zG);
            b3.add(abstractC0143zG);
            AbstractC0129k abstractC0129k = c0130l.f2319a;
            if (abstractC0129k.c() || c0130l.f2322d != 0) {
                return;
            } else {
                iU = abstractC0129k.u();
            }
        } while (iU == i4);
        c0130l.f2322d = iU;
    }

    public final void E(int i3, C0130l c0130l, Object obj) throws D {
        if ((536870912 & i3) != 0) {
            c0130l.w(2);
            p0.o(obj, i3 & 1048575, c0130l.f2319a.t());
        } else if (!this.f2250f) {
            p0.o(obj, i3 & 1048575, c0130l.e());
        } else {
            c0130l.w(2);
            p0.o(obj, i3 & 1048575, c0130l.f2319a.s());
        }
    }

    public final void F(int i3, C0130l c0130l, Object obj) throws D {
        boolean z2 = (536870912 & i3) != 0;
        H h3 = this.f2255k;
        if (z2) {
            h3.getClass();
            c0130l.s(H.b(i3 & 1048575, obj), true);
        } else {
            h3.getClass();
            c0130l.s(H.b(i3 & 1048575, obj), false);
        }
    }

    public final void H(int i3, Object obj) {
        int i4 = this.f2246a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        p0.m(obj, j3, (1 << (i4 >>> 20)) | p0.f2334c.f(j3, obj));
    }

    public final void I(Object obj, int i3, int i4) {
        p0.m(obj, this.f2246a[i4 + 2] & 1048575, i3);
    }

    public final void J(Object obj, int i3, AbstractC0119a abstractC0119a) {
        f2245o.putObject(obj, M(i3) & 1048575, abstractC0119a);
        H(i3, obj);
    }

    public final void K(Object obj, int i3, int i4, AbstractC0119a abstractC0119a) {
        f2245o.putObject(obj, M(i4) & 1048575, abstractC0119a);
        I(obj, i3, i4);
    }

    public final int M(int i3) {
        return this.f2246a[i3 + 1];
    }

    public final void N(Object obj, L l3) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.f2246a;
        int length = iArr.length;
        Unsafe unsafe = f2245o;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i10 < length) {
            int iM = M(i10);
            int i11 = iArr[i10];
            int iL = L(iM);
            if (iL <= 17) {
                int i12 = iArr[i10 + 2];
                int i13 = i12 & i7;
                if (i13 != i8) {
                    i9 = i13 == i7 ? 0 : unsafe.getInt(obj, i13);
                    i8 = i13;
                }
                i3 = i8;
                i4 = i9;
                i5 = 1 << (i12 >>> 20);
            } else {
                i3 = i8;
                i4 = i9;
                i5 = 0;
            }
            long j3 = iM & i7;
            switch (iL) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.c(i11, p0.f2334c.d(j3, obj));
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 1:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.g(i11, p0.f2334c.e(j3, obj));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 2:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.j(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.q(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.i(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.f(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.e(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.a(i11, p0.f2334c.c(j3, obj));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((C0132n) l3.f2235a).P((String) object, i11);
                        } else {
                            l3.b(i11, (C0126h) object);
                        }
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 9:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.k(i11, unsafe.getObject(obj, j3), m(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 10:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.b(i11, (C0126h) unsafe.getObject(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 11:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.p(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 12:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.d(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 13:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.l(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 14:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.m(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 15:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.n(i11, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 16:
                    i6 = i3;
                    if (o(obj, i10, i6, i4, i5)) {
                        l3.o(unsafe.getLong(obj, j3), i11);
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 17:
                    i6 = i3;
                    if (o(obj, i10, i3, i4, i5)) {
                        l3.h(i11, unsafe.getObject(obj, j3), m(i10));
                    } else {
                        continue;
                    }
                    i10 += 3;
                    i8 = i6;
                    i9 = i4;
                    i7 = 1048575;
                    break;
                case 18:
                    d0.E(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 19:
                    d0.I(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 20:
                    d0.L(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 21:
                    d0.T(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 22:
                    d0.K(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 23:
                    d0.H(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 24:
                    d0.G(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 25:
                    d0.C(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 26:
                    d0.R(iArr[i10], (List) unsafe.getObject(obj, j3), l3);
                    break;
                case 27:
                    d0.M(iArr[i10], (List) unsafe.getObject(obj, j3), l3, m(i10));
                    break;
                case 28:
                    d0.D(iArr[i10], (List) unsafe.getObject(obj, j3), l3);
                    break;
                case 29:
                    d0.S(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 30:
                    d0.F(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 31:
                    d0.N(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 32:
                    d0.O(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 33:
                    d0.P(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 34:
                    d0.Q(iArr[i10], (List) unsafe.getObject(obj, j3), l3, false);
                    break;
                case 35:
                    d0.E(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 36:
                    d0.I(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 37:
                    d0.L(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 38:
                    d0.T(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 39:
                    d0.K(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 40:
                    d0.H(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 41:
                    d0.G(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 42:
                    d0.C(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 43:
                    d0.S(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 44:
                    d0.F(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 45:
                    d0.N(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 46:
                    d0.O(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 47:
                    d0.P(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 48:
                    d0.Q(iArr[i10], (List) unsafe.getObject(obj, j3), l3, true);
                    break;
                case 49:
                    d0.J(iArr[i10], (List) unsafe.getObject(obj, j3), l3, m(i10));
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j3);
                    if (object2 != null) {
                        int i14 = 2;
                        Object obj2 = this.f2247b[(i10 / 3) * 2];
                        this.f2257m.getClass();
                        M m3 = ((N) obj2).f2239a;
                        C0132n c0132n = (C0132n) l3.f2235a;
                        c0132n.getClass();
                        for (Map.Entry entry : ((O) object2).entrySet()) {
                            c0132n.R(i11, i14);
                            c0132n.T(N.a(m3, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            C0137t.b(c0132n, m3.f2236a, 1, key);
                            C0137t.b(c0132n, m3.f2237b, 2, value);
                            i14 = 2;
                        }
                    }
                    break;
                case 51:
                    if (q(obj, i11, i10)) {
                        l3.c(i11, ((Double) p0.f2334c.h(j3, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (q(obj, i11, i10)) {
                        l3.g(i11, ((Float) p0.f2334c.h(j3, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (q(obj, i11, i10)) {
                        l3.j(A(j3, obj), i11);
                    }
                    break;
                case 54:
                    if (q(obj, i11, i10)) {
                        l3.q(A(j3, obj), i11);
                    }
                    break;
                case 55:
                    if (q(obj, i11, i10)) {
                        l3.i(i11, z(j3, obj));
                    }
                    break;
                case 56:
                    if (q(obj, i11, i10)) {
                        l3.f(A(j3, obj), i11);
                    }
                    break;
                case 57:
                    if (q(obj, i11, i10)) {
                        l3.e(i11, z(j3, obj));
                    }
                    break;
                case 58:
                    if (q(obj, i11, i10)) {
                        l3.a(i11, ((Boolean) p0.f2334c.h(j3, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (q(obj, i11, i10)) {
                        Object object3 = unsafe.getObject(obj, j3);
                        if (object3 instanceof String) {
                            ((C0132n) l3.f2235a).P((String) object3, i11);
                        } else {
                            l3.b(i11, (C0126h) object3);
                        }
                    }
                    break;
                case 60:
                    if (q(obj, i11, i10)) {
                        l3.k(i11, unsafe.getObject(obj, j3), m(i10));
                    }
                    break;
                case 61:
                    if (q(obj, i11, i10)) {
                        l3.b(i11, (C0126h) unsafe.getObject(obj, j3));
                    }
                    break;
                case 62:
                    if (q(obj, i11, i10)) {
                        l3.p(i11, z(j3, obj));
                    }
                    break;
                case 63:
                    if (q(obj, i11, i10)) {
                        l3.d(i11, z(j3, obj));
                    }
                    break;
                case 64:
                    if (q(obj, i11, i10)) {
                        l3.l(i11, z(j3, obj));
                    }
                    break;
                case 65:
                    if (q(obj, i11, i10)) {
                        l3.m(A(j3, obj), i11);
                    }
                    break;
                case 66:
                    if (q(obj, i11, i10)) {
                        l3.n(i11, z(j3, obj));
                    }
                    break;
                case 67:
                    if (q(obj, i11, i10)) {
                        l3.o(A(j3, obj), i11);
                    }
                    break;
                case 68:
                    if (q(obj, i11, i10)) {
                        l3.h(i11, unsafe.getObject(obj, j3), m(i10));
                    }
                    break;
            }
            i6 = i3;
            i10 += 3;
            i8 = i6;
            i9 = i4;
            i7 = 1048575;
        }
        this.f2256l.getClass();
        ((AbstractC0143z) obj).unknownFields.d(l3);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0107 A[LOOP:2: B:55:0x00f6->B:60:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x012d A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.c0
    public final boolean a(Object obj) {
        int i3;
        int i4;
        List list;
        c0 c0VarM;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f2252h) {
            int i9 = this.f2251g[i8];
            int[] iArr = this.f2246a;
            int i10 = iArr[i9];
            int iM = M(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f2245o.getInt(obj, i12);
                }
                i4 = i7;
                i3 = i12;
            } else {
                i3 = i6;
                i4 = i7;
            }
            if ((268435456 & iM) != 0 && !o(obj, i9, i3, i4, i13)) {
                return false;
            }
            int iL = L(iM);
            if (iL == 9 || iL == 17) {
                if (o(obj, i9, i3, i4, i13)) {
                    if (!m(i9).a(p0.f2334c.h(iM & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iL == 27) {
                list = (List) p0.f2334c.h(iM & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    c0VarM = m(i9);
                    for (i5 = 0; i5 < list.size(); i5++) {
                        if (!c0VarM.a(list.get(i5))) {
                            return false;
                        }
                    }
                }
            } else if (iL == 60 || iL == 68) {
                if (q(obj, i10, i9)) {
                    if (!m(i9).a(p0.f2334c.h(iM & 1048575, obj))) {
                        return false;
                    }
                } else {
                    continue;
                }
            } else if (iL == 49) {
                list = (List) p0.f2334c.h(iM & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    c0VarM = m(i9);
                    while (i5 < list.size()) {
                        if (!c0VarM.a(list.get(i5))) {
                            return false;
                        }
                    }
                }
            } else if (iL != 50) {
                continue;
            } else {
                Object objH = p0.f2334c.h(iM & 1048575, obj);
                this.f2257m.getClass();
                O o3 = (O) objH;
                if (o3.isEmpty()) {
                    continue;
                } else {
                    if (((N) this.f2247b[(i9 / 3) * 2]).f2239a.f2237b.f2358d != y0.MESSAGE) {
                        continue;
                    } else {
                        c0 c0VarA = null;
                        for (Object obj2 : o3.values()) {
                            if (c0VarA == null) {
                                c0VarA = Z.f2263c.a(obj2.getClass());
                            }
                            if (!c0VarA.a(obj2)) {
                                return false;
                            }
                        }
                    }
                }
            }
            i8++;
            i6 = i3;
            i7 = i4;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void b(Object obj, C0130l c0130l, C0135q c0135q) throws Throwable {
        c0135q.getClass();
        if (p(obj)) {
            r(this.f2256l, obj, c0130l, c0135q);
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void c(Object obj, Object obj2) {
        if (!p(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2246a;
            if (i3 >= iArr.length) {
                d0.A(this.f2256l, obj, obj2);
                return;
            }
            int iM = M(i3);
            long j3 = 1048575 & iM;
            int i4 = iArr[i3];
            switch (L(iM)) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    if (n(i3, obj2)) {
                        o0 o0Var = p0.f2334c;
                        o0Var.l(obj, j3, o0Var.d(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 1:
                    if (n(i3, obj2)) {
                        o0 o0Var2 = p0.f2334c;
                        o0Var2.m(obj, j3, o0Var2.e(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 2:
                    if (n(i3, obj2)) {
                        p0.n(obj, j3, p0.f2334c.g(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (n(i3, obj2)) {
                        p0.n(obj, j3, p0.f2334c.g(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    if (n(i3, obj2)) {
                        p0.m(obj, j3, p0.f2334c.f(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    if (n(i3, obj2)) {
                        p0.n(obj, j3, p0.f2334c.g(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (n(i3, obj2)) {
                        p0.m(obj, j3, p0.f2334c.f(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (n(i3, obj2)) {
                        o0 o0Var3 = p0.f2334c;
                        o0Var3.j(obj, j3, o0Var3.c(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (n(i3, obj2)) {
                        p0.o(obj, j3, p0.f2334c.h(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 9:
                    t(i3, obj, obj2);
                    break;
                case 10:
                    if (n(i3, obj2)) {
                        p0.o(obj, j3, p0.f2334c.h(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 11:
                    if (n(i3, obj2)) {
                        p0.m(obj, j3, p0.f2334c.f(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 12:
                    if (n(i3, obj2)) {
                        p0.m(obj, j3, p0.f2334c.f(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 13:
                    if (n(i3, obj2)) {
                        p0.m(obj, j3, p0.f2334c.f(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 14:
                    if (n(i3, obj2)) {
                        p0.n(obj, j3, p0.f2334c.g(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 15:
                    if (n(i3, obj2)) {
                        p0.m(obj, j3, p0.f2334c.f(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 16:
                    if (n(i3, obj2)) {
                        p0.n(obj, j3, p0.f2334c.g(j3, obj2));
                        H(i3, obj);
                    }
                    break;
                case 17:
                    t(i3, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f2255k.getClass();
                    o0 o0Var4 = p0.f2334c;
                    B bE = (B) o0Var4.h(j3, obj);
                    B b3 = (B) o0Var4.h(j3, obj2);
                    int size = bE.size();
                    int size2 = b3.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC0120b) bE).f2268d) {
                            bE = ((a0) bE).e(size2 + size);
                        }
                        bE.addAll(b3);
                    }
                    if (size > 0) {
                        b3 = bE;
                    }
                    p0.o(obj, j3, b3);
                    break;
                case 50:
                    Class cls = d0.f2275a;
                    o0 o0Var5 = p0.f2334c;
                    Object objH = o0Var5.h(j3, obj);
                    Object objH2 = o0Var5.h(j3, obj2);
                    this.f2257m.getClass();
                    p0.o(obj, j3, P.b(objH, objH2));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (q(obj2, i4, i3)) {
                        p0.o(obj, j3, p0.f2334c.h(j3, obj2));
                        I(obj, i4, i3);
                    }
                    break;
                case 60:
                    u(i3, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(obj2, i4, i3)) {
                        p0.o(obj, j3, p0.f2334c.h(j3, obj2));
                        I(obj, i4, i3);
                    }
                    break;
                case 68:
                    u(i3, obj, obj2);
                    break;
            }
            i3 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final void d(Object obj, L l3) throws IOException {
        l3.getClass();
        N(obj, l3);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r3
      0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0217, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.c0
    public final int e(AbstractC0143z abstractC0143z) {
        int i3;
        int iB;
        int i4;
        int[] iArr = this.f2246a;
        int length = iArr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iM = M(i6);
            int i7 = iArr[i6];
            long j3 = 1048575 & iM;
            int i8 = 1237;
            int iHashCode = 37;
            switch (L(iM)) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    i3 = i5 * 53;
                    iB = C.b(Double.doubleToLongBits(p0.f2334c.d(j3, abstractC0143z)));
                    i5 = iB + i3;
                    break;
                case 1:
                    i3 = i5 * 53;
                    iB = Float.floatToIntBits(p0.f2334c.e(j3, abstractC0143z));
                    i5 = iB + i3;
                    break;
                case 2:
                    i3 = i5 * 53;
                    iB = C.b(p0.f2334c.g(j3, abstractC0143z));
                    i5 = iB + i3;
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i3 = i5 * 53;
                    iB = C.b(p0.f2334c.g(j3, abstractC0143z));
                    i5 = iB + i3;
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    i3 = i5 * 53;
                    iB = p0.f2334c.f(j3, abstractC0143z);
                    i5 = iB + i3;
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    i3 = i5 * 53;
                    iB = C.b(p0.f2334c.g(j3, abstractC0143z));
                    i5 = iB + i3;
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i3 = i5 * 53;
                    iB = p0.f2334c.f(j3, abstractC0143z);
                    i5 = iB + i3;
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i4 = i5 * 53;
                    boolean zC = p0.f2334c.c(j3, abstractC0143z);
                    Charset charset = C.f2218a;
                    if (zC) {
                        i8 = 1231;
                    }
                    i5 = i8 + i4;
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    i3 = i5 * 53;
                    iB = ((String) p0.f2334c.h(j3, abstractC0143z)).hashCode();
                    i5 = iB + i3;
                    break;
                case 9:
                    Object objH = p0.f2334c.h(j3, abstractC0143z);
                    if (objH != null) {
                        iHashCode = objH.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case 10:
                    i3 = i5 * 53;
                    iB = p0.f2334c.h(j3, abstractC0143z).hashCode();
                    i5 = iB + i3;
                    break;
                case 11:
                    i3 = i5 * 53;
                    iB = p0.f2334c.f(j3, abstractC0143z);
                    i5 = iB + i3;
                    break;
                case 12:
                    i3 = i5 * 53;
                    iB = p0.f2334c.f(j3, abstractC0143z);
                    i5 = iB + i3;
                    break;
                case 13:
                    i3 = i5 * 53;
                    iB = p0.f2334c.f(j3, abstractC0143z);
                    i5 = iB + i3;
                    break;
                case 14:
                    i3 = i5 * 53;
                    iB = C.b(p0.f2334c.g(j3, abstractC0143z));
                    i5 = iB + i3;
                    break;
                case 15:
                    i3 = i5 * 53;
                    iB = p0.f2334c.f(j3, abstractC0143z);
                    i5 = iB + i3;
                    break;
                case 16:
                    i3 = i5 * 53;
                    iB = C.b(p0.f2334c.g(j3, abstractC0143z));
                    i5 = iB + i3;
                    break;
                case 17:
                    Object objH2 = p0.f2334c.h(j3, abstractC0143z);
                    if (objH2 != null) {
                        iHashCode = objH2.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i5 * 53;
                    iB = p0.f2334c.h(j3, abstractC0143z).hashCode();
                    i5 = iB + i3;
                    break;
                case 50:
                    i3 = i5 * 53;
                    iB = p0.f2334c.h(j3, abstractC0143z).hashCode();
                    i5 = iB + i3;
                    break;
                case 51:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = C.b(Double.doubleToLongBits(((Double) p0.f2334c.h(j3, abstractC0143z)).doubleValue()));
                        i5 = iB + i3;
                    }
                    break;
                case 52:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = Float.floatToIntBits(((Float) p0.f2334c.h(j3, abstractC0143z)).floatValue());
                        i5 = iB + i3;
                    }
                    break;
                case 53:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = C.b(A(j3, abstractC0143z));
                        i5 = iB + i3;
                    }
                    break;
                case 54:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = C.b(A(j3, abstractC0143z));
                        i5 = iB + i3;
                    }
                    break;
                case 55:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = z(j3, abstractC0143z);
                        i5 = iB + i3;
                    }
                    break;
                case 56:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = C.b(A(j3, abstractC0143z));
                        i5 = iB + i3;
                    }
                    break;
                case 57:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = z(j3, abstractC0143z);
                        i5 = iB + i3;
                    }
                    break;
                case 58:
                    if (q(abstractC0143z, i7, i6)) {
                        i4 = i5 * 53;
                        boolean zBooleanValue = ((Boolean) p0.f2334c.h(j3, abstractC0143z)).booleanValue();
                        Charset charset2 = C.f2218a;
                        if (zBooleanValue) {
                            i8 = 1231;
                        }
                        i5 = i8 + i4;
                    }
                    break;
                case 59:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = ((String) p0.f2334c.h(j3, abstractC0143z)).hashCode();
                        i5 = iB + i3;
                    }
                    break;
                case 60:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = p0.f2334c.h(j3, abstractC0143z).hashCode();
                        i5 = iB + i3;
                    }
                    break;
                case 61:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = p0.f2334c.h(j3, abstractC0143z).hashCode();
                        i5 = iB + i3;
                    }
                    break;
                case 62:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = z(j3, abstractC0143z);
                        i5 = iB + i3;
                    }
                    break;
                case 63:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = z(j3, abstractC0143z);
                        i5 = iB + i3;
                    }
                    break;
                case 64:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = z(j3, abstractC0143z);
                        i5 = iB + i3;
                    }
                    break;
                case 65:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = C.b(A(j3, abstractC0143z));
                        i5 = iB + i3;
                    }
                    break;
                case 66:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = z(j3, abstractC0143z);
                        i5 = iB + i3;
                    }
                    break;
                case 67:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = C.b(A(j3, abstractC0143z));
                        i5 = iB + i3;
                    }
                    break;
                case 68:
                    if (q(abstractC0143z, i7, i6)) {
                        i3 = i5 * 53;
                        iB = p0.f2334c.h(j3, abstractC0143z).hashCode();
                        i5 = iB + i3;
                    }
                    break;
            }
        }
        this.f2256l.getClass();
        return abstractC0143z.unknownFields.hashCode() + (i5 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final int f(AbstractC0143z abstractC0143z) {
        int i3;
        int i4;
        int i5;
        int iJ;
        int iH;
        int i6;
        int iX;
        int iZ;
        Unsafe unsafe = f2245o;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f2246a;
            if (i10 >= iArr.length) {
                this.f2256l.getClass();
                return abstractC0143z.unknownFields.b() + i11;
            }
            int iM = M(i10);
            int iL = L(iM);
            int i12 = iArr[i10];
            int i13 = iArr[i10 + 2];
            int i14 = i13 & i7;
            if (iL <= 17) {
                if (i14 != i8) {
                    i9 = i14 == i7 ? 0 : unsafe.getInt(abstractC0143z, i14);
                    i8 = i14;
                }
                i3 = i8;
                i4 = i9;
                i5 = 1 << (i13 >>> 20);
            } else {
                i3 = i8;
                i4 = i9;
                i5 = 0;
            }
            long j3 = iM & i7;
            if (iL >= EnumC0138u.e.a()) {
                EnumC0138u.f2347f.a();
            }
            switch (iL) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.j(i12);
                        i11 += iJ;
                    }
                    break;
                case 1:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.n(i12);
                        i11 += iJ;
                    }
                    break;
                case 2:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.q(unsafe.getLong(abstractC0143z, j3), i12);
                        i11 += iJ;
                    }
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.A(unsafe.getLong(abstractC0143z, j3), i12);
                        i11 += iJ;
                    }
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.p(i12, unsafe.getInt(abstractC0143z, j3));
                        i11 += iJ;
                    }
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.m(i12);
                        i11 += iJ;
                    }
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.l(i12);
                        i11 += iJ;
                    }
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.g(i12);
                        i11 += iJ;
                    }
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        Object object = unsafe.getObject(abstractC0143z, j3);
                        iH = object instanceof C0126h ? C0132n.h(i12, (C0126h) object) : C0132n.v((String) object, i12);
                        i11 = iH + i11;
                    }
                    break;
                case 9:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = d0.o(i12, unsafe.getObject(abstractC0143z, j3), m(i10));
                        i11 += iJ;
                    }
                    break;
                case 10:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.h(i12, (C0126h) unsafe.getObject(abstractC0143z, j3));
                        i11 += iJ;
                    }
                    break;
                case 11:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.y(i12, unsafe.getInt(abstractC0143z, j3));
                        i11 += iJ;
                    }
                    break;
                case 12:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.k(i12, unsafe.getInt(abstractC0143z, j3));
                        i11 += iJ;
                    }
                    break;
                case 13:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.r(i12);
                        i11 += iJ;
                    }
                    break;
                case 14:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.s(i12);
                        i11 += iJ;
                    }
                    break;
                case 15:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.t(i12, unsafe.getInt(abstractC0143z, j3));
                        i11 += iJ;
                    }
                    break;
                case 16:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.u(unsafe.getLong(abstractC0143z, j3), i12);
                        i11 += iJ;
                    }
                    break;
                case 17:
                    if (o(abstractC0143z, i10, i3, i4, i5)) {
                        iJ = C0132n.o(i12, (AbstractC0119a) unsafe.getObject(abstractC0143z, j3), m(i10));
                        i11 += iJ;
                    }
                    break;
                case 18:
                    iJ = d0.h(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 19:
                    iJ = d0.f(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 20:
                    iJ = d0.m(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 21:
                    iJ = d0.x(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 22:
                    iJ = d0.k(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 23:
                    iJ = d0.h(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 24:
                    iJ = d0.f(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 25:
                    iJ = d0.a(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 26:
                    iJ = d0.u(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 27:
                    iJ = d0.p(i12, (List) unsafe.getObject(abstractC0143z, j3), m(i10));
                    i11 += iJ;
                    break;
                case 28:
                    iJ = d0.c(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 29:
                    iJ = d0.v(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 30:
                    iJ = d0.d(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 31:
                    iJ = d0.f(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 32:
                    iJ = d0.h(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 33:
                    iJ = d0.q(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 34:
                    iJ = d0.s(i12, (List) unsafe.getObject(abstractC0143z, j3));
                    i11 += iJ;
                    break;
                case 35:
                    i6 = d0.i((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 36:
                    i6 = d0.g((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 37:
                    i6 = d0.n((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 38:
                    i6 = d0.y((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 39:
                    i6 = d0.l((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 40:
                    i6 = d0.i((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 41:
                    i6 = d0.g((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 42:
                    i6 = d0.b((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 43:
                    i6 = d0.w((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 44:
                    i6 = d0.e((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 45:
                    i6 = d0.g((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 46:
                    i6 = d0.i((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 47:
                    i6 = d0.r((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 48:
                    i6 = d0.t((List) unsafe.getObject(abstractC0143z, j3));
                    if (i6 > 0) {
                        iX = C0132n.x(i12);
                        iZ = C0132n.z(i6);
                        i11 += iZ + iX + i6;
                    }
                    break;
                case 49:
                    iJ = d0.j(i12, (List) unsafe.getObject(abstractC0143z, j3), m(i10));
                    i11 += iJ;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(abstractC0143z, j3);
                    Object obj = this.f2247b[(i10 / 3) * 2];
                    this.f2257m.getClass();
                    iJ = P.a(i12, object2, obj);
                    i11 += iJ;
                    break;
                case 51:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.j(i12);
                        i11 += iJ;
                    }
                    break;
                case 52:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.n(i12);
                        i11 += iJ;
                    }
                    break;
                case 53:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.q(A(j3, abstractC0143z), i12);
                        i11 += iJ;
                    }
                    break;
                case 54:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.A(A(j3, abstractC0143z), i12);
                        i11 += iJ;
                    }
                    break;
                case 55:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.p(i12, z(j3, abstractC0143z));
                        i11 += iJ;
                    }
                    break;
                case 56:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.m(i12);
                        i11 += iJ;
                    }
                    break;
                case 57:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.l(i12);
                        i11 += iJ;
                    }
                    break;
                case 58:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.g(i12);
                        i11 += iJ;
                    }
                    break;
                case 59:
                    if (q(abstractC0143z, i12, i10)) {
                        Object object3 = unsafe.getObject(abstractC0143z, j3);
                        iH = object3 instanceof C0126h ? C0132n.h(i12, (C0126h) object3) : C0132n.v((String) object3, i12);
                        i11 = iH + i11;
                    }
                    break;
                case 60:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = d0.o(i12, unsafe.getObject(abstractC0143z, j3), m(i10));
                        i11 += iJ;
                    }
                    break;
                case 61:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.h(i12, (C0126h) unsafe.getObject(abstractC0143z, j3));
                        i11 += iJ;
                    }
                    break;
                case 62:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.y(i12, z(j3, abstractC0143z));
                        i11 += iJ;
                    }
                    break;
                case 63:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.k(i12, z(j3, abstractC0143z));
                        i11 += iJ;
                    }
                    break;
                case 64:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.r(i12);
                        i11 += iJ;
                    }
                    break;
                case 65:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.s(i12);
                        i11 += iJ;
                    }
                    break;
                case 66:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.t(i12, z(j3, abstractC0143z));
                        i11 += iJ;
                    }
                    break;
                case 67:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.u(A(j3, abstractC0143z), i12);
                        i11 += iJ;
                    }
                    break;
                case 68:
                    if (q(abstractC0143z, i12, i10)) {
                        iJ = C0132n.o(i12, (AbstractC0119a) unsafe.getObject(abstractC0143z, j3), m(i10));
                        i11 += iJ;
                    }
                    break;
            }
            i10 += 3;
            i8 = i3;
            i9 = i4;
            i7 = 1048575;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.c0
    public final AbstractC0143z g() {
        this.f2254j.getClass();
        return ((AbstractC0143z) this.e).k();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0080 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.c0
    public final void h(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0143z) {
                AbstractC0143z abstractC0143z = (AbstractC0143z) obj;
                abstractC0143z.d();
                abstractC0143z.c();
                abstractC0143z.j();
            }
            int[] iArr = this.f2246a;
            int length = iArr.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int iM = M(i3);
                long j3 = 1048575 & iM;
                int iL = L(iM);
                if (iL != 9) {
                    if (iL != 60 && iL != 68) {
                        switch (iL) {
                            case 17:
                                if (n(i3, obj)) {
                                    m(i3).h(f2245o.getObject(obj, j3));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f2255k.getClass();
                                H.a(j3, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f2245o;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    this.f2257m.getClass();
                                    P.c(object);
                                    unsafe.putObject(obj, j3, object);
                                }
                                break;
                        }
                    } else if (q(obj, iArr[i3], i3)) {
                        m(i3).h(f2245o.getObject(obj, j3));
                    }
                } else if (n(i3, obj)) {
                    m(i3).h(f2245o.getObject(obj, j3));
                }
            }
            this.f2256l.getClass();
            k0.b(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.c0
    public final boolean i(AbstractC0143z abstractC0143z, Object obj) {
        int[] iArr = this.f2246a;
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            boolean zB = true;
            if (i3 >= length) {
                this.f2256l.getClass();
                return abstractC0143z.unknownFields.equals(((AbstractC0143z) obj).unknownFields);
            }
            int iM = M(i3);
            long j3 = iM & 1048575;
            switch (L(iM)) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var = p0.f2334c;
                        if (Double.doubleToLongBits(o0Var.d(j3, abstractC0143z)) != Double.doubleToLongBits(o0Var.d(j3, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 1:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var2 = p0.f2334c;
                        if (Float.floatToIntBits(o0Var2.e(j3, abstractC0143z)) != Float.floatToIntBits(o0Var2.e(j3, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 2:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var3 = p0.f2334c;
                        if (o0Var3.g(j3, abstractC0143z) != o0Var3.g(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var4 = p0.f2334c;
                        if (o0Var4.g(j3, abstractC0143z) != o0Var4.g(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var5 = p0.f2334c;
                        if (o0Var5.f(j3, abstractC0143z) != o0Var5.f(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var6 = p0.f2334c;
                        if (o0Var6.g(j3, abstractC0143z) != o0Var6.g(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var7 = p0.f2334c;
                        if (o0Var7.f(j3, abstractC0143z) != o0Var7.f(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var8 = p0.f2334c;
                        if (o0Var8.c(j3, abstractC0143z) != o0Var8.c(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var9 = p0.f2334c;
                        if (!d0.B(o0Var9.h(j3, abstractC0143z), o0Var9.h(j3, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 9:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var10 = p0.f2334c;
                        if (!d0.B(o0Var10.h(j3, abstractC0143z), o0Var10.h(j3, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 10:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var11 = p0.f2334c;
                        if (!d0.B(o0Var11.h(j3, abstractC0143z), o0Var11.h(j3, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 11:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var12 = p0.f2334c;
                        if (o0Var12.f(j3, abstractC0143z) != o0Var12.f(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 12:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var13 = p0.f2334c;
                        if (o0Var13.f(j3, abstractC0143z) != o0Var13.f(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 13:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var14 = p0.f2334c;
                        if (o0Var14.f(j3, abstractC0143z) != o0Var14.f(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 14:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var15 = p0.f2334c;
                        if (o0Var15.g(j3, abstractC0143z) != o0Var15.g(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 15:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var16 = p0.f2334c;
                        if (o0Var16.f(j3, abstractC0143z) != o0Var16.f(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 16:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var17 = p0.f2334c;
                        if (o0Var17.g(j3, abstractC0143z) != o0Var17.g(j3, obj)) {
                            zB = false;
                        }
                    }
                    break;
                case 17:
                    if (!j(abstractC0143z, obj, i3)) {
                        zB = false;
                    } else {
                        o0 o0Var18 = p0.f2334c;
                        if (!d0.B(o0Var18.h(j3, abstractC0143z), o0Var18.h(j3, obj))) {
                            zB = false;
                        }
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    o0 o0Var19 = p0.f2334c;
                    zB = d0.B(o0Var19.h(j3, abstractC0143z), o0Var19.h(j3, obj));
                    break;
                case 50:
                    o0 o0Var20 = p0.f2334c;
                    zB = d0.B(o0Var20.h(j3, abstractC0143z), o0Var20.h(j3, obj));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j4 = iArr[i3 + 2] & 1048575;
                    o0 o0Var21 = p0.f2334c;
                    if (o0Var21.f(j4, abstractC0143z) != o0Var21.f(j4, obj) || !d0.B(o0Var21.h(j3, abstractC0143z), o0Var21.h(j3, obj))) {
                        zB = false;
                    }
                    break;
            }
            if (!zB) {
                return false;
            }
            i3 += 3;
        }
    }

    public final boolean j(AbstractC0143z abstractC0143z, Object obj, int i3) {
        return n(i3, abstractC0143z) == n(i3, obj);
    }

    public final void k(int i3, Object obj, Object obj2) {
        int i4 = this.f2246a[i3];
        if (p0.f2334c.h(M(i3) & 1048575, obj) == null) {
            return;
        }
        l(i3);
    }

    public final void l(int i3) {
        if (this.f2247b[((i3 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final c0 m(int i3) {
        int i4 = (i3 / 3) * 2;
        Object[] objArr = this.f2247b;
        c0 c0Var = (c0) objArr[i4];
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0VarA = Z.f2263c.a((Class) objArr[i4 + 1]);
        objArr[i4] = c0VarA;
        return c0VarA;
    }

    public final boolean n(int i3, Object obj) {
        int i4 = this.f2246a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 != 1048575) {
            return ((1 << (i4 >>> 20)) & p0.f2334c.f(j3, obj)) != 0;
        }
        int iM = M(i3);
        long j4 = iM & 1048575;
        switch (L(iM)) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return Double.doubleToRawLongBits(p0.f2334c.d(j4, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(p0.f2334c.e(j4, obj)) != 0;
            case 2:
                return p0.f2334c.g(j4, obj) != 0;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return p0.f2334c.g(j4, obj) != 0;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                return p0.f2334c.f(j4, obj) != 0;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                return p0.f2334c.g(j4, obj) != 0;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return p0.f2334c.f(j4, obj) != 0;
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return p0.f2334c.c(j4, obj);
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                Object objH = p0.f2334c.h(j4, obj);
                if (objH instanceof String) {
                    return !((String) objH).isEmpty();
                }
                if (objH instanceof C0126h) {
                    return !C0126h.f2295f.equals(objH);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.f2334c.h(j4, obj) != null;
            case 10:
                return !C0126h.f2295f.equals(p0.f2334c.h(j4, obj));
            case 11:
                return p0.f2334c.f(j4, obj) != 0;
            case 12:
                return p0.f2334c.f(j4, obj) != 0;
            case 13:
                return p0.f2334c.f(j4, obj) != 0;
            case 14:
                return p0.f2334c.g(j4, obj) != 0;
            case 15:
                return p0.f2334c.f(j4, obj) != 0;
            case 16:
                return p0.f2334c.g(j4, obj) != 0;
            case 17:
                return p0.f2334c.h(j4, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean o(Object obj, int i3, int i4, int i5, int i6) {
        if (i4 == 1048575) {
            return n(i3, obj);
        }
        return (i5 & i6) != 0;
    }

    public final boolean q(Object obj, int i3, int i4) {
        return p0.f2334c.f((long) (this.f2246a[i4 + 2] & 1048575), obj) == i3;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0646 A[Catch: all -> 0x025a, TryCatch #4 {all -> 0x025a, blocks: (B:67:0x0255, B:120:0x0641, B:122:0x0646, B:123:0x064b, B:70:0x025d, B:71:0x0270, B:72:0x0283, B:73:0x0296, B:74:0x02a9, B:75:0x02c2, B:76:0x02d5, B:77:0x02e8, B:78:0x02fb, B:79:0x030e, B:80:0x0321, B:81:0x0334, B:82:0x0347, B:83:0x035a, B:84:0x036d, B:85:0x0380, B:86:0x0393, B:87:0x03a6, B:88:0x03b9, B:89:0x03d2, B:90:0x03e5, B:91:0x03f8, B:92:0x040c, B:93:0x0414, B:94:0x0427, B:95:0x043a, B:96:0x044d, B:97:0x0460, B:98:0x0473, B:99:0x0486, B:100:0x0499, B:101:0x04ac, B:102:0x04c5, B:103:0x04db, B:104:0x04f1, B:105:0x0508, B:106:0x051f, B:107:0x0538, B:108:0x054e, B:109:0x0561, B:110:0x057a, B:111:0x0585, B:112:0x059d, B:113:0x05b4, B:114:0x05cb, B:115:0x05e1, B:116:0x05f7, B:117:0x060c, B:118:0x0624), top: B:144:0x0255 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0655 A[LOOP:2: B:126:0x0653->B:127:0x0655, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x065f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0651 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    public final void r(k0 k0Var, Object obj, C0130l c0130l, C0135q c0135q) throws Throwable {
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f2251g;
        int i6 = this.f2253i;
        int i7 = this.f2252h;
        j0 j0VarA = null;
        while (true) {
            try {
                int iA = c0130l.a();
                int iB = B(iA);
                if (iB >= 0) {
                    int iM = M(iB);
                    try {
                        int iL = L(iM);
                        AbstractC0129k abstractC0129k = c0130l.f2319a;
                        H h3 = this.f2255k;
                        switch (iL) {
                            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                                i3 = i7;
                                long jY = y(iM);
                                c0130l.w(1);
                                p0.f2334c.l(obj, jY, abstractC0129k.h());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 1:
                                i3 = i7;
                                long jY2 = y(iM);
                                c0130l.w(5);
                                p0.f2334c.m(obj, jY2, abstractC0129k.l());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 2:
                                i3 = i7;
                                long jY3 = y(iM);
                                c0130l.w(0);
                                p0.n(obj, jY3, abstractC0129k.n());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                                i3 = i7;
                                long jY4 = y(iM);
                                c0130l.w(0);
                                p0.n(obj, jY4, abstractC0129k.w());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case M.k.LONG_FIELD_NUMBER /* 4 */:
                                i3 = i7;
                                long jY5 = y(iM);
                                c0130l.w(0);
                                p0.m(obj, jY5, abstractC0129k.m());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case M.k.STRING_FIELD_NUMBER /* 5 */:
                                i3 = i7;
                                long jY6 = y(iM);
                                c0130l.w(1);
                                p0.n(obj, jY6, abstractC0129k.k());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                i3 = i7;
                                long jY7 = y(iM);
                                c0130l.w(5);
                                p0.m(obj, jY7, abstractC0129k.j());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                i3 = i7;
                                long jY8 = y(iM);
                                c0130l.w(0);
                                p0.f2334c.j(obj, jY8, abstractC0129k.f());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                                i3 = i7;
                                E(iM, c0130l, obj);
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 9:
                                i3 = i7;
                                AbstractC0119a abstractC0119a = (AbstractC0119a) v(iB, obj);
                                c0 c0VarM = m(iB);
                                c0130l.w(2);
                                c0130l.c(abstractC0119a, c0VarM, c0135q);
                                J(obj, iB, abstractC0119a);
                                i7 = i3;
                                break;
                            case 10:
                                i3 = i7;
                                p0.o(obj, y(iM), c0130l.e());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 11:
                                i3 = i7;
                                long jY9 = y(iM);
                                c0130l.w(0);
                                p0.m(obj, jY9, abstractC0129k.v());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 12:
                                i3 = i7;
                                c0130l.w(0);
                                int i8 = abstractC0129k.i();
                                l(iB);
                                p0.m(obj, y(iM), i8);
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 13:
                                i3 = i7;
                                long jY10 = y(iM);
                                c0130l.w(5);
                                p0.m(obj, jY10, abstractC0129k.o());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 14:
                                i3 = i7;
                                long jY11 = y(iM);
                                c0130l.w(1);
                                p0.n(obj, jY11, abstractC0129k.p());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 15:
                                i3 = i7;
                                long jY12 = y(iM);
                                c0130l.w(0);
                                p0.m(obj, jY12, abstractC0129k.q());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 16:
                                i3 = i7;
                                long jY13 = y(iM);
                                c0130l.w(0);
                                p0.n(obj, jY13, abstractC0129k.r());
                                H(iB, obj);
                                i7 = i3;
                                break;
                            case 17:
                                i3 = i7;
                                AbstractC0119a abstractC0119a2 = (AbstractC0119a) v(iB, obj);
                                c0 c0VarM2 = m(iB);
                                c0130l.w(3);
                                c0130l.b(abstractC0119a2, c0VarM2, c0135q);
                                J(obj, iB, abstractC0119a2);
                                i7 = i3;
                                break;
                            case 18:
                                i3 = i7;
                                long jY14 = y(iM);
                                h3.getClass();
                                c0130l.g(H.b(jY14, obj));
                                i7 = i3;
                                break;
                            case 19:
                                i3 = i7;
                                long jY15 = y(iM);
                                h3.getClass();
                                c0130l.l(H.b(jY15, obj));
                                i7 = i3;
                                break;
                            case 20:
                                i3 = i7;
                                long jY16 = y(iM);
                                h3.getClass();
                                c0130l.n(H.b(jY16, obj));
                                i7 = i3;
                                break;
                            case 21:
                                i3 = i7;
                                long jY17 = y(iM);
                                h3.getClass();
                                c0130l.u(H.b(jY17, obj));
                                i7 = i3;
                                break;
                            case 22:
                                i3 = i7;
                                long jY18 = y(iM);
                                h3.getClass();
                                c0130l.m(H.b(jY18, obj));
                                i7 = i3;
                                break;
                            case 23:
                                i3 = i7;
                                long jY19 = y(iM);
                                h3.getClass();
                                c0130l.k(H.b(jY19, obj));
                                i7 = i3;
                                break;
                            case 24:
                                i3 = i7;
                                long jY20 = y(iM);
                                h3.getClass();
                                c0130l.j(H.b(jY20, obj));
                                i7 = i3;
                                break;
                            case 25:
                                i3 = i7;
                                long jY21 = y(iM);
                                h3.getClass();
                                c0130l.d(H.b(jY21, obj));
                                i7 = i3;
                                break;
                            case 26:
                                i3 = i7;
                                F(iM, c0130l, obj);
                                i7 = i3;
                                break;
                            case 27:
                                i3 = i7;
                                D(obj, iM, c0130l, m(iB), c0135q);
                                i7 = i3;
                                break;
                            case 28:
                                i3 = i7;
                                long jY22 = y(iM);
                                h3.getClass();
                                c0130l.f(H.b(jY22, obj));
                                i7 = i3;
                                break;
                            case 29:
                                i3 = i7;
                                long jY23 = y(iM);
                                h3.getClass();
                                c0130l.t(H.b(jY23, obj));
                                i7 = i3;
                                break;
                            case 30:
                                i3 = i7;
                                long jY24 = y(iM);
                                h3.getClass();
                                B b3 = H.b(jY24, obj);
                                c0130l.h(b3);
                                l(iB);
                                d0.z(obj, iA, b3, j0VarA, k0Var);
                                i7 = i3;
                                break;
                            case 31:
                                i3 = i7;
                                long jY25 = y(iM);
                                h3.getClass();
                                c0130l.o(H.b(jY25, obj));
                                i7 = i3;
                                break;
                            case 32:
                                i3 = i7;
                                long jY26 = y(iM);
                                h3.getClass();
                                c0130l.p(H.b(jY26, obj));
                                i7 = i3;
                                break;
                            case 33:
                                i3 = i7;
                                long jY27 = y(iM);
                                h3.getClass();
                                c0130l.q(H.b(jY27, obj));
                                i7 = i3;
                                break;
                            case 34:
                                i3 = i7;
                                long jY28 = y(iM);
                                h3.getClass();
                                c0130l.r(H.b(jY28, obj));
                                i7 = i3;
                                break;
                            case 35:
                                i3 = i7;
                                long jY29 = y(iM);
                                h3.getClass();
                                c0130l.g(H.b(jY29, obj));
                                i7 = i3;
                                break;
                            case 36:
                                i3 = i7;
                                long jY30 = y(iM);
                                h3.getClass();
                                c0130l.l(H.b(jY30, obj));
                                i7 = i3;
                                break;
                            case 37:
                                i3 = i7;
                                long jY31 = y(iM);
                                h3.getClass();
                                c0130l.n(H.b(jY31, obj));
                                i7 = i3;
                                break;
                            case 38:
                                i3 = i7;
                                long jY32 = y(iM);
                                h3.getClass();
                                c0130l.u(H.b(jY32, obj));
                                i7 = i3;
                                break;
                            case 39:
                                i3 = i7;
                                long jY33 = y(iM);
                                h3.getClass();
                                c0130l.m(H.b(jY33, obj));
                                i7 = i3;
                                break;
                            case 40:
                                i3 = i7;
                                long jY34 = y(iM);
                                h3.getClass();
                                c0130l.k(H.b(jY34, obj));
                                i7 = i3;
                                break;
                            case 41:
                                i3 = i7;
                                long jY35 = y(iM);
                                h3.getClass();
                                c0130l.j(H.b(jY35, obj));
                                i7 = i3;
                                break;
                            case 42:
                                i3 = i7;
                                long jY36 = y(iM);
                                h3.getClass();
                                c0130l.d(H.b(jY36, obj));
                                i7 = i3;
                                break;
                            case 43:
                                i3 = i7;
                                long jY37 = y(iM);
                                h3.getClass();
                                c0130l.t(H.b(jY37, obj));
                                i7 = i3;
                                break;
                            case 44:
                                i3 = i7;
                                long jY38 = y(iM);
                                h3.getClass();
                                B b4 = H.b(jY38, obj);
                                c0130l.h(b4);
                                l(iB);
                                d0.z(obj, iA, b4, j0VarA, k0Var);
                                i7 = i3;
                                break;
                            case 45:
                                i3 = i7;
                                long jY39 = y(iM);
                                h3.getClass();
                                c0130l.o(H.b(jY39, obj));
                                i7 = i3;
                                break;
                            case 46:
                                i3 = i7;
                                long jY40 = y(iM);
                                h3.getClass();
                                c0130l.p(H.b(jY40, obj));
                                i7 = i3;
                                break;
                            case 47:
                                i3 = i7;
                                long jY41 = y(iM);
                                h3.getClass();
                                c0130l.q(H.b(jY41, obj));
                                i7 = i3;
                                break;
                            case 48:
                                i3 = i7;
                                long jY42 = y(iM);
                                h3.getClass();
                                c0130l.r(H.b(jY42, obj));
                                i7 = i3;
                                break;
                            case 49:
                                i3 = i7;
                                i4 = 0;
                                try {
                                    try {
                                        C(obj, y(iM), c0130l, m(iB), c0135q);
                                    } catch (D unused) {
                                        k0Var.getClass();
                                        if (j0VarA == null) {
                                            j0VarA = k0.a(obj);
                                        }
                                        if (!k0.c(i4, c0130l, j0VarA)) {
                                            for (i5 = i3; i5 < i6; i5++) {
                                                k(iArr[i5], obj, j0VarA);
                                            }
                                            if (j0VarA != null) {
                                                ((AbstractC0143z) obj).unknownFields = j0VarA;
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    i7 = i3;
                                } catch (Throwable th) {
                                    th = th;
                                    for (int i9 = i3; i9 < i6; i9++) {
                                        k(iArr[i9], obj, j0VarA);
                                    }
                                    if (j0VarA != null) {
                                        k0Var.getClass();
                                        ((AbstractC0143z) obj).unknownFields = j0VarA;
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                try {
                                    s(obj, iB, this.f2247b[(iB / 3) * 2], c0135q, c0130l);
                                    i3 = i7;
                                } catch (D unused2) {
                                    i3 = i7;
                                    i4 = 0;
                                    k0Var.getClass();
                                    if (j0VarA == null) {
                                        j0VarA = k0.a(obj);
                                    }
                                    if (!k0.c(i4, c0130l, j0VarA)) {
                                        while (i5 < i6) {
                                            k(iArr[i5], obj, j0VarA);
                                        }
                                        if (j0VarA != null) {
                                            ((AbstractC0143z) obj).unknownFields = j0VarA;
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i7 = i3;
                                break;
                            case 51:
                                long jY43 = y(iM);
                                c0130l.w(1);
                                p0.o(obj, jY43, Double.valueOf(abstractC0129k.h()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 52:
                                long jY44 = y(iM);
                                c0130l.w(5);
                                p0.o(obj, jY44, Float.valueOf(abstractC0129k.l()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 53:
                                long jY45 = y(iM);
                                c0130l.w(0);
                                p0.o(obj, jY45, Long.valueOf(abstractC0129k.n()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 54:
                                long jY46 = y(iM);
                                c0130l.w(0);
                                p0.o(obj, jY46, Long.valueOf(abstractC0129k.w()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 55:
                                long jY47 = y(iM);
                                c0130l.w(0);
                                p0.o(obj, jY47, Integer.valueOf(abstractC0129k.m()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 56:
                                long jY48 = y(iM);
                                c0130l.w(1);
                                p0.o(obj, jY48, Long.valueOf(abstractC0129k.k()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 57:
                                long jY49 = y(iM);
                                c0130l.w(5);
                                p0.o(obj, jY49, Integer.valueOf(abstractC0129k.j()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 58:
                                long jY50 = y(iM);
                                c0130l.w(0);
                                p0.o(obj, jY50, Boolean.valueOf(abstractC0129k.f()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 59:
                                E(iM, c0130l, obj);
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 60:
                                AbstractC0119a abstractC0119a3 = (AbstractC0119a) w(obj, iA, iB);
                                c0 c0VarM3 = m(iB);
                                c0130l.w(2);
                                c0130l.c(abstractC0119a3, c0VarM3, c0135q);
                                K(obj, iA, iB, abstractC0119a3);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 61:
                                p0.o(obj, y(iM), c0130l.e());
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 62:
                                long jY51 = y(iM);
                                c0130l.w(0);
                                p0.o(obj, jY51, Integer.valueOf(abstractC0129k.v()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 63:
                                c0130l.w(0);
                                int i10 = abstractC0129k.i();
                                l(iB);
                                p0.o(obj, y(iM), Integer.valueOf(i10));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 64:
                                long jY52 = y(iM);
                                c0130l.w(5);
                                p0.o(obj, jY52, Integer.valueOf(abstractC0129k.o()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 65:
                                long jY53 = y(iM);
                                c0130l.w(1);
                                p0.o(obj, jY53, Long.valueOf(abstractC0129k.p()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 66:
                                long jY54 = y(iM);
                                c0130l.w(0);
                                p0.o(obj, jY54, Integer.valueOf(abstractC0129k.q()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 67:
                                long jY55 = y(iM);
                                c0130l.w(0);
                                p0.o(obj, jY55, Long.valueOf(abstractC0129k.r()));
                                I(obj, iA, iB);
                                i3 = i7;
                                i7 = i3;
                                break;
                            case 68:
                                AbstractC0119a abstractC0119a4 = (AbstractC0119a) w(obj, iA, iB);
                                c0 c0VarM4 = m(iB);
                                c0130l.w(3);
                                c0130l.b(abstractC0119a4, c0VarM4, c0135q);
                                K(obj, iA, iB, abstractC0119a4);
                                i3 = i7;
                                i7 = i3;
                                break;
                            default:
                                if (j0VarA == null) {
                                    k0Var.getClass();
                                    j0VarA = k0.a(obj);
                                }
                                k0Var.getClass();
                                if (!k0.c(0, c0130l, j0VarA)) {
                                    while (i7 < i6) {
                                        k(iArr[i7], obj, j0VarA);
                                        i7++;
                                    }
                                    if (j0VarA != null) {
                                        ((AbstractC0143z) obj).unknownFields = j0VarA;
                                        return;
                                    }
                                    return;
                                }
                                i3 = i7;
                                i7 = i3;
                                break;
                        }
                    } catch (D unused3) {
                    }
                } else {
                    if (iA == Integer.MAX_VALUE) {
                        while (i7 < i6) {
                            k(iArr[i7], obj, j0VarA);
                            i7++;
                        }
                        if (j0VarA != null) {
                            k0Var.getClass();
                            ((AbstractC0143z) obj).unknownFields = j0VarA;
                            return;
                        }
                        return;
                    }
                    k0Var.getClass();
                    if (j0VarA == null) {
                        j0VarA = k0.a(obj);
                    }
                    if (!k0.c(0, c0130l, j0VarA)) {
                        while (i7 < i6) {
                            k(iArr[i7], obj, j0VarA);
                            i7++;
                        }
                        if (j0VarA != null) {
                            ((AbstractC0143z) obj).unknownFields = j0VarA;
                            return;
                        }
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                i3 = i7;
            }
        }
    }

    public final void s(Object obj, int i3, Object obj2, C0135q c0135q, C0130l c0130l) throws D {
        long jM = M(i3) & 1048575;
        Object objH = p0.f2334c.h(jM, obj);
        P p3 = this.f2257m;
        if (objH == null) {
            p3.getClass();
            objH = O.e.b();
            p0.o(obj, jM, objH);
        } else {
            p3.getClass();
            if (!((O) objH).f2240d) {
                O oB = O.e.b();
                P.b(oB, objH);
                p0.o(obj, jM, oB);
                objH = oB;
            }
        }
        p3.getClass();
        O o3 = (O) objH;
        M m3 = ((N) obj2).f2239a;
        c0130l.w(2);
        AbstractC0129k abstractC0129k = c0130l.f2319a;
        int iE = abstractC0129k.e(abstractC0129k.v());
        Object objI = "";
        M.k kVar = m3.f2238c;
        Object objI2 = kVar;
        while (true) {
            try {
                int iA = c0130l.a();
                if (iA == Integer.MAX_VALUE || abstractC0129k.c()) {
                    break;
                }
                if (iA == 1) {
                    objI = c0130l.i(m3.f2236a, null, null);
                } else if (iA != 2) {
                    try {
                        if (!c0130l.x()) {
                            throw new E("Unable to parse map entry.");
                        }
                    } catch (D unused) {
                        if (!c0130l.x()) {
                            throw new E("Unable to parse map entry.");
                        }
                    }
                } else {
                    objI2 = c0130l.i(m3.f2237b, kVar.getClass(), c0135q);
                }
            } catch (Throwable th) {
                abstractC0129k.d(iE);
                throw th;
            }
        }
        o3.put(objI, objI2);
        abstractC0129k.d(iE);
    }

    public final void t(int i3, Object obj, Object obj2) {
        if (n(i3, obj2)) {
            long jM = M(i3) & 1048575;
            Unsafe unsafe = f2245o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f2246a[i3] + " is present but null: " + obj2);
            }
            c0 c0VarM = m(i3);
            if (!n(i3, obj)) {
                if (p(object)) {
                    AbstractC0143z abstractC0143zG = c0VarM.g();
                    c0VarM.c(abstractC0143zG, object);
                    unsafe.putObject(obj, jM, abstractC0143zG);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                H(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0143z abstractC0143zG2 = c0VarM.g();
                c0VarM.c(abstractC0143zG2, object2);
                unsafe.putObject(obj, jM, abstractC0143zG2);
                object2 = abstractC0143zG2;
            }
            c0VarM.c(object2, object);
        }
    }

    public final void u(int i3, Object obj, Object obj2) {
        int[] iArr = this.f2246a;
        int i4 = iArr[i3];
        if (q(obj2, i4, i3)) {
            long jM = M(i3) & 1048575;
            Unsafe unsafe = f2245o;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2);
            }
            c0 c0VarM = m(i3);
            if (!q(obj, i4, i3)) {
                if (p(object)) {
                    AbstractC0143z abstractC0143zG = c0VarM.g();
                    c0VarM.c(abstractC0143zG, object);
                    unsafe.putObject(obj, jM, abstractC0143zG);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                I(obj, i4, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!p(object2)) {
                AbstractC0143z abstractC0143zG2 = c0VarM.g();
                c0VarM.c(abstractC0143zG2, object2);
                unsafe.putObject(obj, jM, abstractC0143zG2);
                object2 = abstractC0143zG2;
            }
            c0VarM.c(object2, object);
        }
    }

    public final Object v(int i3, Object obj) {
        c0 c0VarM = m(i3);
        long jM = M(i3) & 1048575;
        if (!n(i3, obj)) {
            return c0VarM.g();
        }
        Object object = f2245o.getObject(obj, jM);
        if (p(object)) {
            return object;
        }
        AbstractC0143z abstractC0143zG = c0VarM.g();
        if (object != null) {
            c0VarM.c(abstractC0143zG, object);
        }
        return abstractC0143zG;
    }

    public final Object w(Object obj, int i3, int i4) {
        c0 c0VarM = m(i4);
        if (!q(obj, i3, i4)) {
            return c0VarM.g();
        }
        Object object = f2245o.getObject(obj, M(i4) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0143z abstractC0143zG = c0VarM.g();
        if (object != null) {
            c0VarM.c(abstractC0143zG, object);
        }
        return abstractC0143zG;
    }
}
