package com.google.android.gms.internal.mlkit_vision_face_bundled;

import androidx.datastore.preferences.protobuf.C0131m;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class G8 implements N8 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f2792l = new int[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Unsafe f2793m = Y8.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f2795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2797d;
    public final U7 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f2799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final H7 f2802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H7 f2803k;

    public G8(int[] iArr, Object[] objArr, int i3, int i4, U7 u7, int[] iArr2, int i5, int i6, H7 h7, H7 h8) {
        this.f2794a = iArr;
        this.f2795b = objArr;
        this.f2796c = i3;
        this.f2797d = i4;
        boolean z2 = false;
        if (h8 != null && (u7 instanceof AbstractC0269l8)) {
            z2 = true;
        }
        this.f2798f = z2;
        this.f2799g = iArr2;
        this.f2800h = i5;
        this.f2801i = i6;
        this.f2802j = h7;
        this.f2803k = h8;
        this.e = u7;
    }

    public static long A(long j3, Object obj) {
        return ((Long) Y8.i(j3, obj)).longValue();
    }

    public static Field F(Class cls, String str) {
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

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0299o8) {
            return ((AbstractC0299o8) obj).i();
        }
        return true;
    }

    public static S8 u(Object obj) {
        AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) obj;
        S8 s8 = abstractC0299o8.zzc;
        if (s8 != S8.f2908f) {
            return s8;
        }
        S8 s8B = S8.b();
        abstractC0299o8.zzc = s8B;
        return s8B;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0264  */
    /* JADX WARN: Code duplicated, block: B:127:0x0269  */
    /* JADX WARN: Code duplicated, block: B:130:0x027f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0282  */
    public static G8 v(M8 m8, H7 h7, H7 h8) {
        int i3;
        int iCharAt;
        int iCharAt2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
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
        int iObjectFieldOffset;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        Field fieldF;
        int i21;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldF2;
        int i27;
        Object obj2;
        Field fieldF3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        if (!(m8 instanceof M8)) {
            A0.c.n(m8);
            throw null;
        }
        String strC = m8.c();
        int length = strC.length();
        char c3 = 55296;
        if (strC.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i3 = i32 + 1;
                if (strC.charAt(i32) < 55296) {
                    break;
                }
                i32 = i3;
            }
        } else {
            i3 = 1;
        }
        int i33 = i3 + 1;
        int iCharAt3 = strC.charAt(i3);
        if (iCharAt3 >= 55296) {
            int i34 = iCharAt3 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt13 = strC.charAt(i33);
                if (cCharAt13 < 55296) {
                    break;
                }
                i34 |= (cCharAt13 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt3 = i34 | (cCharAt13 << i35);
            i33 = i31;
        }
        if (iCharAt3 == 0) {
            iArr = f2792l;
            i8 = 0;
            i5 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i4 = 0;
            i7 = 0;
            i6 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt4 = strC.charAt(i33);
            if (iCharAt4 >= 55296) {
                int i37 = iCharAt4 & 8191;
                int i38 = 13;
                while (true) {
                    i16 = i36 + 1;
                    cCharAt8 = strC.charAt(i36);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt8 & 8191) << i38;
                    i38 += 13;
                    i36 = i16;
                }
                iCharAt4 = i37 | (cCharAt8 << i38);
                i36 = i16;
            }
            int i39 = i36 + 1;
            int iCharAt5 = strC.charAt(i36);
            if (iCharAt5 >= 55296) {
                int i40 = iCharAt5 & 8191;
                int i41 = 13;
                while (true) {
                    i15 = i39 + 1;
                    cCharAt7 = strC.charAt(i39);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt7 & 8191) << i41;
                    i41 += 13;
                    i39 = i15;
                }
                iCharAt5 = i40 | (cCharAt7 << i41);
                i39 = i15;
            }
            int i42 = i39 + 1;
            int iCharAt6 = strC.charAt(i39);
            if (iCharAt6 >= 55296) {
                int i43 = iCharAt6 & 8191;
                int i44 = 13;
                while (true) {
                    i14 = i42 + 1;
                    cCharAt6 = strC.charAt(i42);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i43 |= (cCharAt6 & 8191) << i44;
                    i44 += 13;
                    i42 = i14;
                }
                iCharAt6 = i43 | (cCharAt6 << i44);
                i42 = i14;
            }
            int i45 = i42 + 1;
            int iCharAt7 = strC.charAt(i42);
            if (iCharAt7 >= 55296) {
                int i46 = iCharAt7 & 8191;
                int i47 = 13;
                while (true) {
                    i13 = i45 + 1;
                    cCharAt5 = strC.charAt(i45);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i46 |= (cCharAt5 & 8191) << i47;
                    i47 += 13;
                    i45 = i13;
                }
                iCharAt7 = i46 | (cCharAt5 << i47);
                i45 = i13;
            }
            int i48 = i45 + 1;
            iCharAt = strC.charAt(i45);
            if (iCharAt >= 55296) {
                int i49 = iCharAt & 8191;
                int i50 = 13;
                while (true) {
                    i12 = i48 + 1;
                    cCharAt4 = strC.charAt(i48);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i49 |= (cCharAt4 & 8191) << i50;
                    i50 += 13;
                    i48 = i12;
                }
                iCharAt = i49 | (cCharAt4 << i50);
                i48 = i12;
            }
            int i51 = i48 + 1;
            iCharAt2 = strC.charAt(i48);
            if (iCharAt2 >= 55296) {
                int i52 = iCharAt2 & 8191;
                int i53 = 13;
                while (true) {
                    i11 = i51 + 1;
                    cCharAt3 = strC.charAt(i51);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i52 |= (cCharAt3 & 8191) << i53;
                    i53 += 13;
                    i51 = i11;
                }
                iCharAt2 = i52 | (cCharAt3 << i53);
                i51 = i11;
            }
            int i54 = i51 + 1;
            int iCharAt8 = strC.charAt(i51);
            if (iCharAt8 >= 55296) {
                int i55 = iCharAt8 & 8191;
                int i56 = 13;
                while (true) {
                    i10 = i54 + 1;
                    cCharAt2 = strC.charAt(i54);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i55 |= (cCharAt2 & 8191) << i56;
                    i56 += 13;
                    i54 = i10;
                }
                iCharAt8 = i55 | (cCharAt2 << i56);
                i54 = i10;
            }
            int i57 = i54 + 1;
            int iCharAt9 = strC.charAt(i54);
            if (iCharAt9 >= 55296) {
                int i58 = iCharAt9 & 8191;
                int i59 = 13;
                while (true) {
                    i9 = i57 + 1;
                    cCharAt = strC.charAt(i57);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i58 |= (cCharAt & 8191) << i59;
                    i59 += 13;
                    i57 = i9;
                }
                iCharAt9 = i58 | (cCharAt << i59);
                i57 = i9;
            }
            int i60 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i4 = iCharAt6;
            i5 = i60;
            i6 = iCharAt9;
            i7 = iCharAt7;
            i8 = iCharAt4;
            i33 = i57;
            iArr = iArr2;
        }
        Unsafe unsafe = f2793m;
        Object[] objArrD = m8.d();
        Class<?> cls = m8.a().getClass();
        int i61 = i6 + iCharAt2;
        int i62 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i62];
        int i63 = i6;
        int i64 = i61;
        int i65 = 0;
        int i66 = 0;
        while (i33 < length) {
            int i67 = i33 + 1;
            int iCharAt10 = strC.charAt(i33);
            if (iCharAt10 >= c3) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = strC.charAt(i69);
                    if (cCharAt12 < c3) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i17 = i30;
            } else {
                i17 = i67;
            }
            int i71 = i17 + 1;
            int iCharAt11 = strC.charAt(i17);
            if (iCharAt11 >= c3) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = strC.charAt(i73);
                    if (cCharAt11 < c3) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i18 = i29;
            } else {
                i18 = i71;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            int i75 = iCharAt11 & 255;
            int i76 = iCharAt11 & 2048;
            int i77 = length;
            if (i75 >= 51) {
                int i78 = i18 + 1;
                int iCharAt12 = strC.charAt(i18);
                char c4 = 55296;
                if (iCharAt12 >= 55296) {
                    int i79 = 13;
                    int i80 = iCharAt12 & 8191;
                    int i81 = i78;
                    while (true) {
                        i28 = i81 + 1;
                        cCharAt10 = strC.charAt(i81);
                        if (cCharAt10 < c4) {
                            break;
                        }
                        i80 |= (cCharAt10 & 8191) << i79;
                        i79 += 13;
                        i81 = i28;
                        c4 = 55296;
                    }
                    iCharAt12 = i80 | (cCharAt10 << i79);
                    i24 = i28;
                } else {
                    i24 = i78;
                }
                int i82 = i24;
                int i83 = i75 - 51;
                if (i83 == 9 || i83 == 17) {
                    i25 = i5 + 1;
                    int i84 = i66 / 3;
                    objArr[i84 + i84 + 1] = objArrD[i5];
                } else {
                    if (i83 == 12) {
                        if (m8.b() == 1 || i76 != 0) {
                            i25 = i5 + 1;
                            int i85 = i66 / 3;
                            objArr[i85 + i85 + 1] = objArrD[i5];
                        } else {
                            i76 = 0;
                        }
                    }
                    i26 = iCharAt12 + iCharAt12;
                    obj = objArrD[i26];
                    if (obj instanceof Field) {
                        fieldF2 = (Field) obj;
                    } else {
                        fieldF2 = F(cls, (String) obj);
                        objArrD[i26] = fieldF2;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF2);
                    i27 = i26 + 1;
                    obj2 = objArrD[i27];
                    if (obj2 instanceof Field) {
                        fieldF3 = (Field) obj2;
                    } else {
                        fieldF3 = F(cls, (String) obj2);
                        objArrD[i27] = fieldF3;
                    }
                    i76 = i76;
                    strC = strC;
                    iCharAt10 = iCharAt10;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF3);
                    i33 = i82;
                    i20 = 0;
                }
                i5 = i25;
                i26 = iCharAt12 + iCharAt12;
                obj = objArrD[i26];
                if (obj instanceof Field) {
                    fieldF2 = (Field) obj;
                } else {
                    fieldF2 = F(cls, (String) obj);
                    objArrD[i26] = fieldF2;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldF2);
                i27 = i26 + 1;
                obj2 = objArrD[i27];
                if (obj2 instanceof Field) {
                    fieldF3 = (Field) obj2;
                } else {
                    fieldF3 = F(cls, (String) obj2);
                    objArrD[i27] = fieldF3;
                }
                i76 = i76;
                strC = strC;
                iCharAt10 = iCharAt10;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF3);
                i33 = i82;
                i20 = 0;
            } else {
                int i86 = i5 + 1;
                Field fieldF4 = F(cls, (String) objArrD[i5]);
                if (i75 == 9 || i75 == 17) {
                    iCharAt10 = iCharAt10;
                    int i87 = i66 / 3;
                    objArr[i87 + i87 + 1] = fieldF4.getType();
                } else {
                    if (i75 == 27) {
                        i22 = 1;
                        i23 = i5 + 2;
                    } else if (i75 == 49) {
                        i23 = i5 + 2;
                        i22 = 1;
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        iCharAt10 = iCharAt10;
                        if (m8.b() == 1 || i76 != 0) {
                            i23 = i5 + 2;
                            int i88 = i66 / 3;
                            objArr[i88 + i88 + 1] = objArrD[i86];
                            i86 = i23;
                        } else {
                            i76 = 0;
                        }
                    } else {
                        if (i75 == 50) {
                            int i89 = i5 + 2;
                            int i90 = i63 + 1;
                            iArr[i63] = i66;
                            int i91 = i66 / 3;
                            int i92 = i91 + i91;
                            objArr[i92] = objArrD[i86];
                            if (i76 != 0) {
                                i86 = i5 + 3;
                                objArr[i92 + 1] = objArrD[i89];
                                i63 = i90;
                            } else {
                                i86 = i89;
                                i63 = i90;
                                i76 = 0;
                            }
                        }
                        iCharAt10 = iCharAt10;
                    }
                    int i93 = i66 / 3;
                    objArr[i93 + i93 + i22] = objArrD[i86];
                    i86 = i23;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldF4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 0 || i75 > 17) {
                    i19 = i18;
                    i20 = 0;
                } else {
                    i19 = i18 + 1;
                    int iCharAt13 = strC.charAt(i18);
                    if (iCharAt13 >= 55296) {
                        int i94 = iCharAt13 & 8191;
                        int i95 = 13;
                        while (true) {
                            i21 = i19 + 1;
                            cCharAt9 = strC.charAt(i19);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i94 |= (cCharAt9 & 8191) << i95;
                            i95 += 13;
                            i19 = i21;
                        }
                        iCharAt13 = i94 | (cCharAt9 << i95);
                        i19 = i21;
                    }
                    int i96 = (iCharAt13 / 32) + i8 + i8;
                    Object obj3 = objArrD[i96];
                    if (obj3 instanceof Field) {
                        fieldF = (Field) obj3;
                    } else {
                        fieldF = F(cls, (String) obj3);
                        objArrD[i96] = fieldF;
                    }
                    i20 = iCharAt13 % 32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldF);
                }
                if (i75 >= 18 && i75 <= 49) {
                    iArr[i64] = iObjectFieldOffset3;
                    i64++;
                }
                i33 = i19;
                i5 = i86;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i97 = i66 + 1;
            iArr3[i66] = iCharAt10;
            int i98 = i66 + 2;
            iArr3[i97] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i76 != 0 ? Integer.MIN_VALUE : 0) | (i75 << 20) | iObjectFieldOffset2;
            i66 += 3;
            iArr3[i98] = (i20 << 20) | iObjectFieldOffset;
            strC = strC;
            length = i77;
            i7 = i7;
            i4 = i4;
            c3 = 55296;
        }
        return new G8(iArr3, objArr, i4, i7, m8.a(), iArr, i6, i61, h7, h8);
    }

    public static int w(long j3, Object obj) {
        return ((Integer) Y8.i(j3, obj)).intValue();
    }

    public static int y(int i3) {
        return (i3 >>> 20) & 255;
    }

    public final InterfaceC0328r8 B(int i3) {
        int i4 = i3 / 3;
        return (InterfaceC0328r8) this.f2795b[i4 + i4 + 1];
    }

    public final N8 C(int i3) {
        int i4 = i3 / 3;
        int i5 = i4 + i4;
        Object[] objArr = this.f2795b;
        N8 n8 = (N8) objArr[i5];
        if (n8 != null) {
            return n8;
        }
        N8 n8A = K8.f2835c.a((Class) objArr[i5 + 1]);
        objArr[i5] = n8A;
        return n8A;
    }

    public final Object D(int i3, Object obj) {
        N8 n8C = C(i3);
        int iZ = z(i3) & 1048575;
        if (!p(i3, obj)) {
            return n8C.b();
        }
        Object object = f2793m.getObject(obj, iZ);
        if (r(object)) {
            return object;
        }
        Object objB = n8C.b();
        if (object != null) {
            n8C.e(objB, object);
        }
        return objB;
    }

    public final Object E(Object obj, int i3, int i4) {
        N8 n8C = C(i4);
        if (!s(obj, i3, i4)) {
            return n8C.b();
        }
        Object object = f2793m.getObject(obj, z(i4) & 1048575);
        if (r(object)) {
            return object;
        }
        Object objB = n8C.b();
        if (object != null) {
            n8C.e(objB, object);
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        int i3 = 0;
        if (obj instanceof AbstractC0299o8) {
            AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) obj;
            abstractC0299o8.g();
            abstractC0299o8.zza = 0;
            abstractC0299o8.e();
        }
        while (true) {
            int[] iArr = this.f2794a;
            if (i3 >= iArr.length) {
                this.f2802j.getClass();
                H7.g(obj);
                if (this.f2798f) {
                    this.f2803k.getClass();
                    H7.f(obj);
                    return;
                }
                return;
            }
            int iZ = z(i3);
            int i4 = 1048575 & iZ;
            int iY = y(iZ);
            long j3 = i4;
            if (iY != 9) {
                if (iY != 60 && iY != 68) {
                    switch (iY) {
                        case 17:
                            if (p(i3, obj)) {
                                C(i3).a(f2793m.getObject(obj, j3));
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
                            ((V7) ((InterfaceC0338s8) Y8.i(j3, obj))).d();
                            break;
                        case 50:
                            Unsafe unsafe = f2793m;
                            Object object = unsafe.getObject(obj, j3);
                            if (object != null) {
                                ((B8) object).c();
                                unsafe.putObject(obj, j3, object);
                            }
                            break;
                    }
                } else if (s(obj, iArr[i3], i3)) {
                    C(i3).a(f2793m.getObject(obj, j3));
                }
            } else if (p(i3, obj)) {
                C(i3).a(f2793m.getObject(obj, j3));
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final Object b() {
        return (AbstractC0299o8) ((AbstractC0299o8) this.e).k(4, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0238  */
    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:102:0x0256  */
    /* JADX WARN: Code duplicated, block: B:103:0x0265  */
    /* JADX WARN: Code duplicated, block: B:104:0x0274  */
    /* JADX WARN: Code duplicated, block: B:105:0x0283  */
    /* JADX WARN: Code duplicated, block: B:106:0x0292  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:111:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:113:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:114:0x030a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0319  */
    /* JADX WARN: Code duplicated, block: B:116:0x0328  */
    /* JADX WARN: Code duplicated, block: B:117:0x0336  */
    /* JADX WARN: Code duplicated, block: B:118:0x0348  */
    /* JADX WARN: Code duplicated, block: B:119:0x0356  */
    /* JADX WARN: Code duplicated, block: B:120:0x0365  */
    /* JADX WARN: Code duplicated, block: B:121:0x0374  */
    /* JADX WARN: Code duplicated, block: B:122:0x0383  */
    /* JADX WARN: Code duplicated, block: B:123:0x0392  */
    /* JADX WARN: Code duplicated, block: B:124:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:126:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:129:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:130:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:132:0x040e  */
    /* JADX WARN: Code duplicated, block: B:133:0x0417  */
    /* JADX WARN: Code duplicated, block: B:135:0x042b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0434  */
    /* JADX WARN: Code duplicated, block: B:138:0x0448  */
    /* JADX WARN: Code duplicated, block: B:139:0x0451  */
    /* JADX WARN: Code duplicated, block: B:141:0x0465  */
    /* JADX WARN: Code duplicated, block: B:142:0x046e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0482  */
    /* JADX WARN: Code duplicated, block: B:145:0x048b  */
    /* JADX WARN: Code duplicated, block: B:147:0x049f  */
    /* JADX WARN: Code duplicated, block: B:148:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:150:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:151:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:153:0x04db  */
    /* JADX WARN: Code duplicated, block: B:154:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:156:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:158:0x0504  */
    /* JADX WARN: Code duplicated, block: B:159:0x050f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0516  */
    /* JADX WARN: Code duplicated, block: B:162:0x052a  */
    /* JADX WARN: Code duplicated, block: B:163:0x0533  */
    /* JADX WARN: Code duplicated, block: B:165:0x0547  */
    /* JADX WARN: Code duplicated, block: B:166:0x0550  */
    /* JADX WARN: Code duplicated, block: B:168:0x0564  */
    /* JADX WARN: Code duplicated, block: B:169:0x056d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0581  */
    /* JADX WARN: Code duplicated, block: B:172:0x058a  */
    /* JADX WARN: Code duplicated, block: B:174:0x059e  */
    /* JADX WARN: Code duplicated, block: B:175:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:177:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:178:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:180:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:181:0x05df  */
    /* JADX WARN: Code duplicated, block: B:183:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:194:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x012c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0152  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161  */
    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x017f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185  */
    /* JADX WARN: Code duplicated, block: B:78:0x018e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX WARN: Code duplicated, block: B:80:0x0194  */
    /* JADX WARN: Code duplicated, block: B:81:0x019d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x020b  */
    /* JADX WARN: Code duplicated, block: B:98:0x021a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0229  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final void c(Object obj, A8 a8) throws C0131m {
        Map.Entry entry;
        Iterator it;
        int i3;
        Map.Entry entry2;
        int i4;
        long j3;
        Map.Entry entry3;
        Object object;
        Object object2;
        if (this.f2798f) {
            C0229h8 c0229h8 = ((AbstractC0269l8) obj).zzb;
            if (c0229h8.f3082a.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itC = c0229h8.c();
                entry = (Map.Entry) itC.next();
                it = itC;
            }
        } else {
            entry = null;
            it = null;
        }
        Unsafe unsafe = f2793m;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f2794a;
            int length = iArr.length;
            H7 h7 = this.f2803k;
            if (i7 >= length) {
                while (entry != null) {
                    h7.getClass();
                    H7.h(a8, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                ((AbstractC0299o8) obj).zzc.d(a8);
                return;
            }
            int iZ = z(i7);
            int iY = y(iZ);
            int i8 = iArr[i7];
            if (iY <= 17) {
                int i9 = iArr[i7 + 2];
                Map.Entry entry4 = entry;
                int i10 = i9 & 1048575;
                if (i10 != i5) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                } else {
                    iArr = iArr;
                }
                int i11 = 1 << (i9 >>> 20);
                i3 = i5;
                i4 = i11;
                entry2 = entry4;
            } else {
                iArr = iArr;
                i3 = i5;
                entry2 = entry;
                i4 = 0;
            }
            int i12 = i6;
            while (entry2 != null) {
                if (i8 >= 202056002) {
                    h7.getClass();
                    H7.h(a8, entry2);
                    entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                } else {
                    j3 = iZ & 1048575;
                    switch (iY) {
                        case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.i(i8, Y8.d(j3, obj));
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 1:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.m(i8, Y8.e(j3, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 2:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.p(unsafe.getLong(obj, j3), i8);
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.f(unsafe.getLong(obj, j3), i8);
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case M.k.LONG_FIELD_NUMBER /* 4 */:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.o(i8, unsafe.getInt(obj, j3));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case M.k.STRING_FIELD_NUMBER /* 5 */:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.l(unsafe.getLong(obj, j3), i8);
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.k(i8, unsafe.getInt(obj, j3));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.g(i8, Y8.t(j3, obj));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case M.k.BYTES_FIELD_NUMBER /* 8 */:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                object = unsafe.getObject(obj, j3);
                                if (object instanceof String) {
                                    ((C0179c8) a8.f2742a).i((String) object, i8);
                                } else {
                                    a8.h(i8, (AbstractC0169b8) object);
                                }
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 9:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.q(i8, unsafe.getObject(obj, j3), C(i7));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 10:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.h(i8, (AbstractC0169b8) unsafe.getObject(obj, j3));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 11:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.e(i8, unsafe.getInt(obj, j3));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 12:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.j(i8, unsafe.getInt(obj, j3));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 13:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.r(i8, unsafe.getInt(obj, j3));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 14:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.s(unsafe.getLong(obj, j3), i8);
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 15:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.c(i8, unsafe.getInt(obj, j3));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 16:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.d(unsafe.getLong(obj, j3), i8);
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 17:
                            entry3 = entry2;
                            if (q(obj, i7, i3, i12, i4)) {
                                a8.n(i8, unsafe.getObject(obj, j3), C(i7));
                            } else {
                                continue;
                                continue;
                            }
                            i7 += 3;
                            i5 = i3;
                            entry = entry3;
                            i6 = i12;
                            break;
                        case 18:
                            O8.z(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 19:
                            O8.D(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 20:
                            O8.G(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 21:
                            O8.h(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 22:
                            O8.F(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 23:
                            O8.C(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 24:
                            O8.B(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 25:
                            O8.x(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 26:
                            O8.f(iArr[i7], (List) unsafe.getObject(obj, j3), a8);
                            break;
                        case 27:
                            O8.a(iArr[i7], (List) unsafe.getObject(obj, j3), a8, C(i7));
                            break;
                        case 28:
                            O8.y(iArr[i7], (List) unsafe.getObject(obj, j3), a8);
                            break;
                        case 29:
                            O8.g(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 30:
                            O8.A(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 31:
                            O8.b(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 32:
                            O8.c(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 33:
                            O8.d(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 34:
                            O8.e(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                            break;
                        case 35:
                            O8.z(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 36:
                            O8.D(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 37:
                            O8.G(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 38:
                            O8.h(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 39:
                            O8.F(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 40:
                            O8.C(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 41:
                            O8.B(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 42:
                            O8.x(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 43:
                            O8.g(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 44:
                            O8.A(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 45:
                            O8.b(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 46:
                            O8.c(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 47:
                            O8.d(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 48:
                            O8.e(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                            break;
                        case 49:
                            O8.E(iArr[i7], (List) unsafe.getObject(obj, j3), a8, C(i7));
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j3) != null) {
                                int i13 = i7 / 3;
                                A0.c.o(this.f2795b[i13 + i13]);
                                throw null;
                            }
                            break;
                        case 51:
                            if (s(obj, i8, i7)) {
                                a8.i(i8, ((Double) Y8.i(j3, obj)).doubleValue());
                            }
                            break;
                        case 52:
                            if (s(obj, i8, i7)) {
                                a8.m(i8, ((Float) Y8.i(j3, obj)).floatValue());
                            }
                            break;
                        case 53:
                            if (s(obj, i8, i7)) {
                                a8.p(A(j3, obj), i8);
                            }
                            break;
                        case 54:
                            if (s(obj, i8, i7)) {
                                a8.f(A(j3, obj), i8);
                            }
                            break;
                        case 55:
                            if (s(obj, i8, i7)) {
                                a8.o(i8, w(j3, obj));
                            }
                            break;
                        case 56:
                            if (s(obj, i8, i7)) {
                                a8.l(A(j3, obj), i8);
                            }
                            break;
                        case 57:
                            if (s(obj, i8, i7)) {
                                a8.k(i8, w(j3, obj));
                            }
                            break;
                        case 58:
                            if (s(obj, i8, i7)) {
                                a8.g(i8, ((Boolean) Y8.i(j3, obj)).booleanValue());
                            }
                            break;
                        case 59:
                            if (s(obj, i8, i7)) {
                                object2 = unsafe.getObject(obj, j3);
                                if (object2 instanceof String) {
                                    a8.h(i8, (AbstractC0169b8) object2);
                                } else {
                                    ((C0179c8) a8.f2742a).i((String) object2, i8);
                                }
                            }
                            break;
                        case 60:
                            if (s(obj, i8, i7)) {
                                a8.q(i8, unsafe.getObject(obj, j3), C(i7));
                            }
                            break;
                        case 61:
                            if (s(obj, i8, i7)) {
                                a8.h(i8, (AbstractC0169b8) unsafe.getObject(obj, j3));
                            }
                            break;
                        case 62:
                            if (s(obj, i8, i7)) {
                                a8.e(i8, w(j3, obj));
                            }
                            break;
                        case 63:
                            if (s(obj, i8, i7)) {
                                a8.j(i8, w(j3, obj));
                            }
                            break;
                        case 64:
                            if (s(obj, i8, i7)) {
                                a8.r(i8, w(j3, obj));
                            }
                            break;
                        case 65:
                            if (s(obj, i8, i7)) {
                                a8.s(A(j3, obj), i8);
                            }
                            break;
                        case 66:
                            if (s(obj, i8, i7)) {
                                a8.c(i8, w(j3, obj));
                            }
                            break;
                        case 67:
                            if (s(obj, i8, i7)) {
                                a8.d(A(j3, obj), i8);
                            }
                            break;
                        case 68:
                            if (s(obj, i8, i7)) {
                                a8.n(i8, unsafe.getObject(obj, j3), C(i7));
                            }
                            break;
                    }
                    entry3 = entry2;
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                }
            }
            j3 = iZ & 1048575;
            switch (iY) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.i(i8, Y8.d(j3, obj));
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 1:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.m(i8, Y8.e(j3, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 2:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.p(unsafe.getLong(obj, j3), i8);
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.f(unsafe.getLong(obj, j3), i8);
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.o(i8, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.l(unsafe.getLong(obj, j3), i8);
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.k(i8, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.g(i8, Y8.t(j3, obj));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((C0179c8) a8.f2742a).i((String) object, i8);
                        } else {
                            a8.h(i8, (AbstractC0169b8) object);
                        }
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 9:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.q(i8, unsafe.getObject(obj, j3), C(i7));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 10:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.h(i8, (AbstractC0169b8) unsafe.getObject(obj, j3));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 11:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.e(i8, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 12:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.j(i8, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 13:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.r(i8, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 14:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.s(unsafe.getLong(obj, j3), i8);
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 15:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.c(i8, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 16:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.d(unsafe.getLong(obj, j3), i8);
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 17:
                    entry3 = entry2;
                    if (q(obj, i7, i3, i12, i4)) {
                        a8.n(i8, unsafe.getObject(obj, j3), C(i7));
                    } else {
                        continue;
                        continue;
                    }
                    i7 += 3;
                    i5 = i3;
                    entry = entry3;
                    i6 = i12;
                    break;
                case 18:
                    O8.z(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 19:
                    O8.D(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 20:
                    O8.G(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 21:
                    O8.h(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 22:
                    O8.F(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 23:
                    O8.C(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 24:
                    O8.B(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 25:
                    O8.x(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 26:
                    O8.f(iArr[i7], (List) unsafe.getObject(obj, j3), a8);
                    break;
                case 27:
                    O8.a(iArr[i7], (List) unsafe.getObject(obj, j3), a8, C(i7));
                    break;
                case 28:
                    O8.y(iArr[i7], (List) unsafe.getObject(obj, j3), a8);
                    break;
                case 29:
                    O8.g(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 30:
                    O8.A(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 31:
                    O8.b(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 32:
                    O8.c(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 33:
                    O8.d(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 34:
                    O8.e(iArr[i7], (List) unsafe.getObject(obj, j3), a8, false);
                    break;
                case 35:
                    O8.z(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 36:
                    O8.D(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 37:
                    O8.G(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 38:
                    O8.h(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 39:
                    O8.F(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 40:
                    O8.C(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 41:
                    O8.B(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 42:
                    O8.x(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 43:
                    O8.g(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 44:
                    O8.A(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 45:
                    O8.b(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 46:
                    O8.c(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 47:
                    O8.d(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 48:
                    O8.e(iArr[i7], (List) unsafe.getObject(obj, j3), a8, true);
                    break;
                case 49:
                    O8.E(iArr[i7], (List) unsafe.getObject(obj, j3), a8, C(i7));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j3) != null) {
                        int i14 = i7 / 3;
                        A0.c.o(this.f2795b[i14 + i14]);
                        throw null;
                    }
                    break;
                case 51:
                    if (s(obj, i8, i7)) {
                        a8.i(i8, ((Double) Y8.i(j3, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (s(obj, i8, i7)) {
                        a8.m(i8, ((Float) Y8.i(j3, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (s(obj, i8, i7)) {
                        a8.p(A(j3, obj), i8);
                    }
                    break;
                case 54:
                    if (s(obj, i8, i7)) {
                        a8.f(A(j3, obj), i8);
                    }
                    break;
                case 55:
                    if (s(obj, i8, i7)) {
                        a8.o(i8, w(j3, obj));
                    }
                    break;
                case 56:
                    if (s(obj, i8, i7)) {
                        a8.l(A(j3, obj), i8);
                    }
                    break;
                case 57:
                    if (s(obj, i8, i7)) {
                        a8.k(i8, w(j3, obj));
                    }
                    break;
                case 58:
                    if (s(obj, i8, i7)) {
                        a8.g(i8, ((Boolean) Y8.i(j3, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (s(obj, i8, i7)) {
                        object2 = unsafe.getObject(obj, j3);
                        if (object2 instanceof String) {
                            a8.h(i8, (AbstractC0169b8) object2);
                        } else {
                            ((C0179c8) a8.f2742a).i((String) object2, i8);
                        }
                    }
                    break;
                case 60:
                    if (s(obj, i8, i7)) {
                        a8.q(i8, unsafe.getObject(obj, j3), C(i7));
                    }
                    break;
                case 61:
                    if (s(obj, i8, i7)) {
                        a8.h(i8, (AbstractC0169b8) unsafe.getObject(obj, j3));
                    }
                    break;
                case 62:
                    if (s(obj, i8, i7)) {
                        a8.e(i8, w(j3, obj));
                    }
                    break;
                case 63:
                    if (s(obj, i8, i7)) {
                        a8.j(i8, w(j3, obj));
                    }
                    break;
                case 64:
                    if (s(obj, i8, i7)) {
                        a8.r(i8, w(j3, obj));
                    }
                    break;
                case 65:
                    if (s(obj, i8, i7)) {
                        a8.s(A(j3, obj), i8);
                    }
                    break;
                case 66:
                    if (s(obj, i8, i7)) {
                        a8.c(i8, w(j3, obj));
                    }
                    break;
                case 67:
                    if (s(obj, i8, i7)) {
                        a8.d(A(j3, obj), i8);
                    }
                    break;
                case 68:
                    if (s(obj, i8, i7)) {
                        a8.n(i8, unsafe.getObject(obj, j3), C(i7));
                    }
                    break;
            }
            entry3 = entry2;
            i7 += 3;
            i5 = i3;
            entry = entry3;
            i6 = i12;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final boolean d(AbstractC0299o8 abstractC0299o8, Object obj) {
        boolean zI;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2794a;
            if (i3 >= iArr.length) {
                if (!abstractC0299o8.zzc.equals(((AbstractC0299o8) obj).zzc)) {
                    return false;
                }
                if (this.f2798f) {
                    return ((AbstractC0269l8) abstractC0299o8).zzb.equals(((AbstractC0269l8) obj).zzb);
                }
                return true;
            }
            int iZ = z(i3);
            long j3 = iZ & 1048575;
            switch (y(iZ)) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    if (o(abstractC0299o8, obj, i3)) {
                        X8 x8 = Y8.f2967c;
                        if (Double.doubleToLongBits(x8.a(j3, abstractC0299o8)) == Double.doubleToLongBits(x8.a(j3, obj))) {
                            continue;
                            i3 += 3;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (o(abstractC0299o8, obj, i3)) {
                        X8 x9 = Y8.f2967c;
                        if (Float.floatToIntBits(x9.b(j3, abstractC0299o8)) == Float.floatToIntBits(x9.b(j3, obj))) {
                            continue;
                            i3 += 3;
                            break;
                        }
                    }
                    return false;
                case 2:
                    if (!o(abstractC0299o8, obj, i3) || Y8.g(j3, abstractC0299o8) != Y8.g(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (!o(abstractC0299o8, obj, i3) || Y8.g(j3, abstractC0299o8) != Y8.g(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    if (!o(abstractC0299o8, obj, i3) || Y8.f(j3, abstractC0299o8) != Y8.f(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    if (!o(abstractC0299o8, obj, i3) || Y8.g(j3, abstractC0299o8) != Y8.g(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!o(abstractC0299o8, obj, i3) || Y8.f(j3, abstractC0299o8) != Y8.f(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (o(abstractC0299o8, obj, i3)) {
                        X8 x10 = Y8.f2967c;
                        if (x10.g(j3, abstractC0299o8) == x10.g(j3, obj)) {
                            continue;
                            i3 += 3;
                            break;
                        }
                    }
                    return false;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (!o(abstractC0299o8, obj, i3) || !O8.i(Y8.i(j3, abstractC0299o8), Y8.i(j3, obj))) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 9:
                    if (!o(abstractC0299o8, obj, i3) || !O8.i(Y8.i(j3, abstractC0299o8), Y8.i(j3, obj))) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 10:
                    if (!o(abstractC0299o8, obj, i3) || !O8.i(Y8.i(j3, abstractC0299o8), Y8.i(j3, obj))) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 11:
                    if (!o(abstractC0299o8, obj, i3) || Y8.f(j3, abstractC0299o8) != Y8.f(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 12:
                    if (!o(abstractC0299o8, obj, i3) || Y8.f(j3, abstractC0299o8) != Y8.f(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 13:
                    if (!o(abstractC0299o8, obj, i3) || Y8.f(j3, abstractC0299o8) != Y8.f(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 14:
                    if (!o(abstractC0299o8, obj, i3) || Y8.g(j3, abstractC0299o8) != Y8.g(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 15:
                    if (!o(abstractC0299o8, obj, i3) || Y8.f(j3, abstractC0299o8) != Y8.f(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 16:
                    if (!o(abstractC0299o8, obj, i3) || Y8.g(j3, abstractC0299o8) != Y8.g(j3, obj)) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                case 17:
                    if (!o(abstractC0299o8, obj, i3) || !O8.i(Y8.i(j3, abstractC0299o8), Y8.i(j3, obj))) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
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
                    zI = O8.i(Y8.i(j3, abstractC0299o8), Y8.i(j3, obj));
                    break;
                case 50:
                    zI = O8.i(Y8.i(j3, abstractC0299o8), Y8.i(j3, obj));
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
                    if (Y8.f(j4, abstractC0299o8) != Y8.f(j4, obj) || !O8.i(Y8.i(j3, abstractC0299o8), Y8.i(j3, obj))) {
                        return false;
                    }
                    continue;
                    i3 += 3;
                    break;
                    break;
                default:
                    continue;
                    i3 += 3;
                    break;
            }
            if (!zI) {
                return false;
            }
            i3 += 3;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final void e(Object obj, Object obj2) {
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f2794a;
            if (i3 >= iArr.length) {
                O8.w(obj, obj2);
                if (this.f2798f) {
                    O8.v(obj, obj2);
                    return;
                }
                return;
            }
            int iZ = z(i3);
            int i4 = iZ & 1048575;
            int iY = y(iZ);
            int i5 = iArr[i3];
            long j3 = i4;
            switch (iY) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    if (p(i3, obj2)) {
                        Y8.l(obj, j3, Y8.f2967c.a(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 1:
                    if (p(i3, obj2)) {
                        Y8.m(obj, j3, Y8.f2967c.b(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 2:
                    if (p(i3, obj2)) {
                        Y8.o(obj, j3, Y8.g(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (p(i3, obj2)) {
                        Y8.o(obj, j3, Y8.g(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    if (p(i3, obj2)) {
                        Y8.n(obj, j3, Y8.f(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    if (p(i3, obj2)) {
                        Y8.o(obj, j3, Y8.g(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (p(i3, obj2)) {
                        Y8.n(obj, j3, Y8.f(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (p(i3, obj2)) {
                        Y8.k(obj, j3, Y8.f2967c.g(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    if (p(i3, obj2)) {
                        Y8.p(obj, j3, Y8.i(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 9:
                    j(i3, obj, obj2);
                    break;
                case 10:
                    if (p(i3, obj2)) {
                        Y8.p(obj, j3, Y8.i(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 11:
                    if (p(i3, obj2)) {
                        Y8.n(obj, j3, Y8.f(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 12:
                    if (p(i3, obj2)) {
                        Y8.n(obj, j3, Y8.f(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 13:
                    if (p(i3, obj2)) {
                        Y8.n(obj, j3, Y8.f(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 14:
                    if (p(i3, obj2)) {
                        Y8.o(obj, j3, Y8.g(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 15:
                    if (p(i3, obj2)) {
                        Y8.n(obj, j3, Y8.f(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 16:
                    if (p(i3, obj2)) {
                        Y8.o(obj, j3, Y8.g(j3, obj2));
                        l(i3, obj);
                    }
                    break;
                case 17:
                    j(i3, obj, obj2);
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
                    InterfaceC0338s8 interfaceC0338s8F = (InterfaceC0338s8) Y8.i(j3, obj);
                    InterfaceC0338s8 interfaceC0338s8 = (InterfaceC0338s8) Y8.i(j3, obj2);
                    int size = interfaceC0338s8F.size();
                    int size2 = interfaceC0338s8.size();
                    if (size > 0 && size2 > 0) {
                        if (!((V7) interfaceC0338s8F).f2935d) {
                            interfaceC0338s8F = ((L8) interfaceC0338s8F).f(size2 + size);
                        }
                        interfaceC0338s8F.addAll(interfaceC0338s8);
                    }
                    if (size > 0) {
                        interfaceC0338s8 = interfaceC0338s8F;
                    }
                    Y8.p(obj, j3, interfaceC0338s8);
                    break;
                case 50:
                    H7 h7 = O8.f2874a;
                    Y8.p(obj, j3, H7.d(Y8.i(j3, obj), Y8.i(j3, obj2)));
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
                    if (s(obj2, i5, i3)) {
                        Y8.p(obj, j3, Y8.i(j3, obj2));
                        Y8.n(obj, iArr[i3 + 2] & 1048575, i5);
                    }
                    break;
                case 60:
                    k(i3, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (s(obj2, i5, i3)) {
                        Y8.p(obj, j3, Y8.i(j3, obj2));
                        Y8.n(obj, iArr[i3 + 2] & 1048575, i5);
                    }
                    break;
                case 68:
                    k(i3, obj, obj2);
                    break;
            }
            i3 += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0397  */
    /* JADX WARN: Code duplicated, block: B:191:0x04d9  */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final int f(AbstractC0299o8 abstractC0299o8) {
        int i3;
        int i4;
        int i5;
        int iR;
        int iA;
        int iR2;
        int iE;
        int iR3;
        int iQ;
        int iR4;
        int size;
        int iU;
        int iR5;
        int iR6;
        int iR7;
        int iO;
        Unsafe unsafe = f2793m;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int iD = 0;
        while (true) {
            int[] iArr = this.f2794a;
            if (i9 < iArr.length) {
                int iZ = z(i9);
                int iY = y(iZ);
                int i10 = iArr[i9];
                int i11 = iArr[i9 + 2];
                int i12 = i11 & i6;
                if (iY <= 17) {
                    if (i12 != i7) {
                        i8 = i12 == i6 ? 0 : unsafe.getInt(abstractC0299o8, i12);
                        i7 = i12;
                    }
                    i3 = i7;
                    i4 = i8;
                    i5 = 1 << (i11 >>> 20);
                } else {
                    i3 = i7;
                    i4 = i8;
                    i5 = 0;
                }
                int i13 = iZ & i6;
                if (iY >= EnumC0239i8.e.a()) {
                    EnumC0239i8.f3091f.getClass();
                }
                long j3 = i13;
                switch (iY) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iD = A0.c.d(i10 << 3, 8, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 1:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iD = A0.c.d(i10 << 3, 4, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 2:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            long j4 = unsafe.getLong(abstractC0299o8, j3);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a(j4);
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            long j5 = unsafe.getLong(abstractC0299o8, j3);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a(j5);
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case M.k.LONG_FIELD_NUMBER /* 4 */:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            long j6 = unsafe.getInt(abstractC0299o8, j3);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a(j6);
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case M.k.STRING_FIELD_NUMBER /* 5 */:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iD = A0.c.d(i10 << 3, 8, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iD = A0.c.d(i10 << 3, 4, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iD = A0.c.d(i10 << 3, 1, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case M.k.BYTES_FIELD_NUMBER /* 8 */:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            int i14 = i10 << 3;
                            Object object = unsafe.getObject(abstractC0299o8, j3);
                            if (object instanceof AbstractC0169b8) {
                                iR2 = C0179c8.r(i14);
                                iE = ((AbstractC0169b8) object).e();
                                iR3 = C0179c8.r(iE);
                                iD += iR3 + iE + iR2;
                            } else {
                                iR = C0179c8.r(i14);
                                iA = C0179c8.q((String) object);
                                iD += iA + iR;
                            }
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 9:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iQ = O8.q(i10, unsafe.getObject(abstractC0299o8, j3), C(i9));
                            iD += iQ;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 10:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            AbstractC0169b8 abstractC0169b8 = (AbstractC0169b8) unsafe.getObject(abstractC0299o8, j3);
                            iR2 = C0179c8.r(i10 << 3);
                            iE = abstractC0169b8.e();
                            iR3 = C0179c8.r(iE);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 11:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iD = A0.c.d(unsafe.getInt(abstractC0299o8, j3), C0179c8.r(i10 << 3), iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 12:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            long j7 = unsafe.getInt(abstractC0299o8, j3);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a(j7);
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 13:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iD = A0.c.d(i10 << 3, 4, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 14:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iD = A0.c.d(i10 << 3, 8, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 15:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            int i15 = unsafe.getInt(abstractC0299o8, j3);
                            iD = A0.c.d((i15 >> 31) ^ (i15 + i15), C0179c8.r(i10 << 3), iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 16:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            long j8 = unsafe.getLong(abstractC0299o8, j3);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a((j8 >> 63) ^ (j8 + j8));
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 17:
                        if (q(abstractC0299o8, i9, i3, i4, i5)) {
                            iQ = C0179c8.o(i10, (U7) unsafe.getObject(abstractC0299o8, j3), C(i9));
                            iD += iQ;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 18:
                        iQ = O8.m(i10, (List) unsafe.getObject(abstractC0299o8, j3));
                        iD += iQ;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 19:
                        iQ = O8.k(i10, (List) unsafe.getObject(abstractC0299o8, j3));
                        iD += iQ;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 20:
                        List list = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h7 = O8.f2874a;
                        if (list.size() == 0) {
                            iR4 = 0;
                        } else {
                            iR4 = (C0179c8.r(i10 << 3) * list.size()) + O8.p(list);
                        }
                        iD += iR4;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 21:
                        List list2 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h8 = O8.f2874a;
                        size = list2.size();
                        if (size == 0) {
                            iR6 = 0;
                        } else {
                            iU = O8.u(list2);
                            iR5 = C0179c8.r(i10 << 3);
                            iR6 = (iR5 * size) + iU;
                        }
                        iD += iR6;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 22:
                        List list3 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h9 = O8.f2874a;
                        size = list3.size();
                        if (size == 0) {
                            iR6 = 0;
                        } else {
                            iU = O8.o(list3);
                            iR5 = C0179c8.r(i10 << 3);
                            iR6 = (iR5 * size) + iU;
                        }
                        iD += iR6;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 23:
                        iQ = O8.m(i10, (List) unsafe.getObject(abstractC0299o8, j3));
                        iD += iQ;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 24:
                        iQ = O8.k(i10, (List) unsafe.getObject(abstractC0299o8, j3));
                        iD += iQ;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 25:
                        List list4 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h10 = O8.f2874a;
                        int size2 = list4.size();
                        if (size2 == 0) {
                            iR4 = 0;
                        } else {
                            iR4 = (C0179c8.r(i10 << 3) + 1) * size2;
                        }
                        iD += iR4;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 26:
                        List list5 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h11 = O8.f2874a;
                        int size3 = list5.size();
                        if (size3 == 0) {
                            iR6 = 0;
                        } else {
                            iR6 = C0179c8.r(i10 << 3) * size3;
                            if (list5 instanceof InterfaceC0388x8) {
                                InterfaceC0388x8 interfaceC0388x8 = (InterfaceC0388x8) list5;
                                for (int i16 = 0; i16 < size3; i16++) {
                                    Object objA = interfaceC0388x8.a();
                                    if (objA instanceof AbstractC0169b8) {
                                        int iE2 = ((AbstractC0169b8) objA).e();
                                        iR6 = A0.c.d(iE2, iE2, iR6);
                                    } else {
                                        iR6 = C0179c8.q((String) objA) + iR6;
                                    }
                                }
                            } else {
                                for (int i17 = 0; i17 < size3; i17++) {
                                    Object obj = list5.get(i17);
                                    if (obj instanceof AbstractC0169b8) {
                                        int iE3 = ((AbstractC0169b8) obj).e();
                                        iR6 = A0.c.d(iE3, iE3, iR6);
                                    } else {
                                        iR6 = C0179c8.q((String) obj) + iR6;
                                    }
                                }
                            }
                        }
                        iD += iR6;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 27:
                        List list6 = (List) unsafe.getObject(abstractC0299o8, j3);
                        N8 n8C = C(i9);
                        H7 h12 = O8.f2874a;
                        int size4 = list6.size();
                        if (size4 == 0) {
                            iR7 = 0;
                        } else {
                            iR7 = C0179c8.r(i10 << 3) * size4;
                            for (int i18 = 0; i18 < size4; i18++) {
                                iR7 += C0179c8.p((U7) list6.get(i18), n8C);
                            }
                        }
                        iD += iR7;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 28:
                        List list7 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h13 = O8.f2874a;
                        int size5 = list7.size();
                        if (size5 == 0) {
                            iR6 = 0;
                        } else {
                            iR6 = C0179c8.r(i10 << 3) * size5;
                            for (int i19 = 0; i19 < list7.size(); i19++) {
                                int iE4 = ((AbstractC0169b8) list7.get(i19)).e();
                                iR6 = A0.c.d(iE4, iE4, iR6);
                            }
                        }
                        iD += iR6;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 29:
                        List list8 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h14 = O8.f2874a;
                        size = list8.size();
                        if (size == 0) {
                            iR6 = 0;
                        } else {
                            iU = O8.t(list8);
                            iR5 = C0179c8.r(i10 << 3);
                            iR6 = (iR5 * size) + iU;
                        }
                        iD += iR6;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 30:
                        List list9 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h15 = O8.f2874a;
                        size = list9.size();
                        if (size == 0) {
                            iR6 = 0;
                        } else {
                            iU = O8.j(list9);
                            iR5 = C0179c8.r(i10 << 3);
                            iR6 = (iR5 * size) + iU;
                        }
                        iD += iR6;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 31:
                        iQ = O8.k(i10, (List) unsafe.getObject(abstractC0299o8, j3));
                        iD += iQ;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 32:
                        iQ = O8.m(i10, (List) unsafe.getObject(abstractC0299o8, j3));
                        iD += iQ;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 33:
                        List list10 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h16 = O8.f2874a;
                        size = list10.size();
                        if (size == 0) {
                            iR6 = 0;
                        } else {
                            iU = O8.r(list10);
                            iR5 = C0179c8.r(i10 << 3);
                            iR6 = (iR5 * size) + iU;
                        }
                        iD += iR6;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 34:
                        List list11 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h17 = O8.f2874a;
                        size = list11.size();
                        if (size == 0) {
                            iR6 = 0;
                        } else {
                            iU = O8.s(list11);
                            iR5 = C0179c8.r(i10 << 3);
                            iR6 = (iR5 * size) + iU;
                        }
                        iD += iR6;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 35:
                        iR2 = O8.n((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 36:
                        iR2 = O8.l((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 37:
                        iR2 = O8.p((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 38:
                        iR2 = O8.u((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 39:
                        iR2 = O8.o((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 40:
                        iR2 = O8.n((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 41:
                        iR2 = O8.l((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 42:
                        List list12 = (List) unsafe.getObject(abstractC0299o8, j3);
                        H7 h18 = O8.f2874a;
                        iR2 = list12.size();
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 43:
                        iR2 = O8.t((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 44:
                        iR2 = O8.j((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 45:
                        iR2 = O8.l((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 46:
                        iR2 = O8.n((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 47:
                        iR2 = O8.r((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 48:
                        iR2 = O8.s((List) unsafe.getObject(abstractC0299o8, j3));
                        if (iR2 > 0) {
                            iE = C0179c8.r(i10 << 3);
                            iR3 = C0179c8.r(iR2);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 49:
                        List list13 = (List) unsafe.getObject(abstractC0299o8, j3);
                        N8 n8C2 = C(i9);
                        H7 h19 = O8.f2874a;
                        int size6 = list13.size();
                        if (size6 == 0) {
                            iO = 0;
                        } else {
                            iO = 0;
                            for (int i20 = 0; i20 < size6; i20++) {
                                iO += C0179c8.o(i10, (U7) list13.get(i20), n8C2);
                            }
                        }
                        iD += iO;
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 50:
                        int i21 = i9 / 3;
                        B8 b8 = (B8) unsafe.getObject(abstractC0299o8, j3);
                        A0.c.o(this.f2795b[i21 + i21]);
                        if (b8.isEmpty()) {
                            continue;
                        } else {
                            Iterator it = b8.entrySet().iterator();
                            if (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getKey();
                                entry.getValue();
                                throw null;
                            }
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                    case 51:
                        if (s(abstractC0299o8, i10, i9)) {
                            iD = A0.c.d(i10 << 3, 8, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 52:
                        if (s(abstractC0299o8, i10, i9)) {
                            iD = A0.c.d(i10 << 3, 4, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 53:
                        if (s(abstractC0299o8, i10, i9)) {
                            long jA = A(j3, abstractC0299o8);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a(jA);
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 54:
                        if (s(abstractC0299o8, i10, i9)) {
                            long jA2 = A(j3, abstractC0299o8);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a(jA2);
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 55:
                        if (s(abstractC0299o8, i10, i9)) {
                            long jW = w(j3, abstractC0299o8);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a(jW);
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 56:
                        if (s(abstractC0299o8, i10, i9)) {
                            iD = A0.c.d(i10 << 3, 8, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 57:
                        if (s(abstractC0299o8, i10, i9)) {
                            iD = A0.c.d(i10 << 3, 4, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 58:
                        if (s(abstractC0299o8, i10, i9)) {
                            iD = A0.c.d(i10 << 3, 1, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 59:
                        if (s(abstractC0299o8, i10, i9)) {
                            int i22 = i10 << 3;
                            Object object2 = unsafe.getObject(abstractC0299o8, j3);
                            if (object2 instanceof AbstractC0169b8) {
                                iR2 = C0179c8.r(i22);
                                iE = ((AbstractC0169b8) object2).e();
                                iR3 = C0179c8.r(iE);
                                iD += iR3 + iE + iR2;
                            } else {
                                iR = C0179c8.r(i22);
                                iA = C0179c8.q((String) object2);
                                iD += iA + iR;
                            }
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 60:
                        if (s(abstractC0299o8, i10, i9)) {
                            iQ = O8.q(i10, unsafe.getObject(abstractC0299o8, j3), C(i9));
                            iD += iQ;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 61:
                        if (s(abstractC0299o8, i10, i9)) {
                            AbstractC0169b8 abstractC0169b9 = (AbstractC0169b8) unsafe.getObject(abstractC0299o8, j3);
                            iR2 = C0179c8.r(i10 << 3);
                            iE = abstractC0169b9.e();
                            iR3 = C0179c8.r(iE);
                            iD += iR3 + iE + iR2;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 62:
                        if (s(abstractC0299o8, i10, i9)) {
                            iD = A0.c.d(w(j3, abstractC0299o8), C0179c8.r(i10 << 3), iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 63:
                        if (s(abstractC0299o8, i10, i9)) {
                            long jW2 = w(j3, abstractC0299o8);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a(jW2);
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 64:
                        if (s(abstractC0299o8, i10, i9)) {
                            iD = A0.c.d(i10 << 3, 4, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 65:
                        if (s(abstractC0299o8, i10, i9)) {
                            iD = A0.c.d(i10 << 3, 8, iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 66:
                        if (s(abstractC0299o8, i10, i9)) {
                            int iW = w(j3, abstractC0299o8);
                            iD = A0.c.d((iW >> 31) ^ (iW + iW), C0179c8.r(i10 << 3), iD);
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 67:
                        if (s(abstractC0299o8, i10, i9)) {
                            long jA3 = A(j3, abstractC0299o8);
                            iR = C0179c8.r(i10 << 3);
                            iA = C0179c8.a((jA3 >> 63) ^ (jA3 + jA3));
                            iD += iA + iR;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    case 68:
                        if (s(abstractC0299o8, i10, i9)) {
                            iQ = C0179c8.o(i10, (U7) unsafe.getObject(abstractC0299o8, j3), C(i9));
                            iD += iQ;
                        }
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                    default:
                        i9 += 3;
                        i7 = i3;
                        i8 = i4;
                        i6 = 1048575;
                        break;
                }
            } else {
                int iA2 = abstractC0299o8.zzc.a() + iD;
                if (!this.f2798f) {
                    return iA2;
                }
                C0229h8 c0229h8 = ((AbstractC0269l8) abstractC0299o8).zzb;
                int iA3 = c0229h8.f3082a.a();
                int i23 = 0;
                int iA4 = 0;
                while (true) {
                    P8 p8 = c0229h8.f3082a;
                    if (i23 >= iA3) {
                        for (Map.Entry entry2 : p8.b()) {
                            iA4 = C0229h8.a((C0279m8) entry2.getKey(), entry2.getValue()) + iA4;
                        }
                        return iA2 + iA4;
                    }
                    Q8 q8D = p8.d(i23);
                    iA4 = C0229h8.a((C0279m8) q8D.a(), q8D.getValue()) + iA4;
                    i23++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final void g(Object obj, byte[] bArr, int i3, int i4, X7 x7) throws C0368v8 {
        t(obj, bArr, i3, i4, 0, x7);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[LOOP:1: B:45:0x00bb->B:50:0x00cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final boolean h(Object obj) {
        int i3;
        int i4;
        List list;
        N8 n8C;
        int i5;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f2800h) {
            int i9 = this.f2799g[i8];
            int[] iArr = this.f2794a;
            int i10 = iArr[i9];
            int iZ = z(i9);
            int i11 = iArr[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f2793m.getInt(obj, i12);
                }
                i4 = i7;
                i3 = i12;
            } else {
                i3 = i6;
                i4 = i7;
            }
            if ((268435456 & iZ) != 0 && !q(obj, i9, i3, i4, i13)) {
                return false;
            }
            int iY = y(iZ);
            if (iY == 9 || iY == 17) {
                if (q(obj, i9, i3, i4, i13) && !C(i9).h(Y8.i(iZ & 1048575, obj))) {
                    return false;
                }
            } else if (iY == 27) {
                list = (List) Y8.i(iZ & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    n8C = C(i9);
                    for (i5 = 0; i5 < list.size(); i5++) {
                        if (!n8C.h(list.get(i5))) {
                            return false;
                        }
                    }
                }
            } else if (iY == 60 || iY == 68) {
                if (s(obj, i10, i9) && !C(i9).h(Y8.i(iZ & 1048575, obj))) {
                    return false;
                }
            } else if (iY == 49) {
                list = (List) Y8.i(iZ & 1048575, obj);
                if (list.isEmpty()) {
                    n8C = C(i9);
                    while (i5 < list.size()) {
                        if (!n8C.h(list.get(i5))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iY == 50 && !((B8) Y8.i(iZ & 1048575, obj)).isEmpty()) {
                int i14 = i9 / 3;
                A0.c.o(this.f2795b[i14 + i14]);
                throw null;
            }
            i8++;
            i6 = i3;
            i7 = i4;
        }
        return !this.f2798f || ((AbstractC0269l8) obj).zzb.g();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01eb, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.N8
    public final int i(AbstractC0299o8 abstractC0299o8) {
        int i3;
        long jDoubleToLongBits;
        int i4;
        int iFloatToIntBits;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f2794a;
            if (i7 >= iArr.length) {
                int iHashCode = abstractC0299o8.zzc.hashCode() + (i8 * 53);
                if (!this.f2798f) {
                    return iHashCode;
                }
                return ((AbstractC0269l8) abstractC0299o8).zzb.f3082a.hashCode() + (iHashCode * 53);
            }
            int iZ = z(i7);
            int i9 = 1048575 & iZ;
            int iY = y(iZ);
            int i10 = iArr[i7];
            long j3 = i9;
            int i11 = 1237;
            int iHashCode2 = 37;
            switch (iY) {
                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    i3 = i8 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(Y8.f2967c.a(j3, abstractC0299o8));
                    Charset charset = AbstractC0348t8.f3460a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i4 = i8 * 53;
                    iFloatToIntBits = Float.floatToIntBits(Y8.f2967c.b(j3, abstractC0299o8));
                    i8 = iFloatToIntBits + i4;
                    break;
                case 2:
                    i3 = i8 * 53;
                    jDoubleToLongBits = Y8.g(j3, abstractC0299o8);
                    Charset charset2 = AbstractC0348t8.f3460a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                    i3 = i8 * 53;
                    jDoubleToLongBits = Y8.g(j3, abstractC0299o8);
                    Charset charset3 = AbstractC0348t8.f3460a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case M.k.LONG_FIELD_NUMBER /* 4 */:
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.f(j3, abstractC0299o8);
                    i8 = iFloatToIntBits + i4;
                    break;
                case M.k.STRING_FIELD_NUMBER /* 5 */:
                    i3 = i8 * 53;
                    jDoubleToLongBits = Y8.g(j3, abstractC0299o8);
                    Charset charset4 = AbstractC0348t8.f3460a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.f(j3, abstractC0299o8);
                    i8 = iFloatToIntBits + i4;
                    break;
                case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    i5 = i8 * 53;
                    boolean zG = Y8.f2967c.g(j3, abstractC0299o8);
                    Charset charset5 = AbstractC0348t8.f3460a;
                    if (zG) {
                        i11 = 1231;
                    }
                    i8 = i11 + i5;
                    break;
                case M.k.BYTES_FIELD_NUMBER /* 8 */:
                    i4 = i8 * 53;
                    iFloatToIntBits = ((String) Y8.i(j3, abstractC0299o8)).hashCode();
                    i8 = iFloatToIntBits + i4;
                    break;
                case 9:
                    i6 = i8 * 53;
                    Object objI = Y8.i(j3, abstractC0299o8);
                    if (objI != null) {
                        iHashCode2 = objI.hashCode();
                    }
                    i8 = i6 + iHashCode2;
                    break;
                case 10:
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.i(j3, abstractC0299o8).hashCode();
                    i8 = iFloatToIntBits + i4;
                    break;
                case 11:
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.f(j3, abstractC0299o8);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 12:
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.f(j3, abstractC0299o8);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 13:
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.f(j3, abstractC0299o8);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 14:
                    i3 = i8 * 53;
                    jDoubleToLongBits = Y8.g(j3, abstractC0299o8);
                    Charset charset6 = AbstractC0348t8.f3460a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.f(j3, abstractC0299o8);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 16:
                    i3 = i8 * 53;
                    jDoubleToLongBits = Y8.g(j3, abstractC0299o8);
                    Charset charset7 = AbstractC0348t8.f3460a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i6 = i8 * 53;
                    Object objI2 = Y8.i(j3, abstractC0299o8);
                    if (objI2 != null) {
                        iHashCode2 = objI2.hashCode();
                    }
                    i8 = i6 + iHashCode2;
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
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.i(j3, abstractC0299o8).hashCode();
                    i8 = iFloatToIntBits + i4;
                    break;
                case 50:
                    i4 = i8 * 53;
                    iFloatToIntBits = Y8.i(j3, abstractC0299o8).hashCode();
                    i8 = iFloatToIntBits + i4;
                    break;
                case 51:
                    if (s(abstractC0299o8, i10, i7)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) Y8.i(j3, abstractC0299o8)).doubleValue());
                        Charset charset8 = AbstractC0348t8.f3460a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) Y8.i(j3, abstractC0299o8)).floatValue());
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 53:
                    if (s(abstractC0299o8, i10, i7)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = A(j3, abstractC0299o8);
                        Charset charset9 = AbstractC0348t8.f3460a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (s(abstractC0299o8, i10, i7)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = A(j3, abstractC0299o8);
                        Charset charset10 = AbstractC0348t8.f3460a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = w(j3, abstractC0299o8);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 56:
                    if (s(abstractC0299o8, i10, i7)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = A(j3, abstractC0299o8);
                        Charset charset11 = AbstractC0348t8.f3460a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = w(j3, abstractC0299o8);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 58:
                    if (s(abstractC0299o8, i10, i7)) {
                        i5 = i8 * 53;
                        boolean zBooleanValue = ((Boolean) Y8.i(j3, abstractC0299o8)).booleanValue();
                        Charset charset12 = AbstractC0348t8.f3460a;
                        if (zBooleanValue) {
                            i11 = 1231;
                        }
                        i8 = i11 + i5;
                    }
                    break;
                case 59:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = ((String) Y8.i(j3, abstractC0299o8)).hashCode();
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 60:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = Y8.i(j3, abstractC0299o8).hashCode();
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 61:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = Y8.i(j3, abstractC0299o8).hashCode();
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 62:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = w(j3, abstractC0299o8);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 63:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = w(j3, abstractC0299o8);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 64:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = w(j3, abstractC0299o8);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 65:
                    if (s(abstractC0299o8, i10, i7)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = A(j3, abstractC0299o8);
                        Charset charset13 = AbstractC0348t8.f3460a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = w(j3, abstractC0299o8);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 67:
                    if (s(abstractC0299o8, i10, i7)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = A(j3, abstractC0299o8);
                        Charset charset14 = AbstractC0348t8.f3460a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (s(abstractC0299o8, i10, i7)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = Y8.i(j3, abstractC0299o8).hashCode();
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
            }
            i7 += 3;
        }
    }

    public final void j(int i3, Object obj, Object obj2) {
        if (p(i3, obj2)) {
            int iZ = z(i3) & 1048575;
            Unsafe unsafe = f2793m;
            long j3 = iZ;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f2794a[i3] + " is present but null: " + obj2.toString());
            }
            N8 n8C = C(i3);
            if (!p(i3, obj)) {
                if (r(object)) {
                    Object objB = n8C.b();
                    n8C.e(objB, object);
                    unsafe.putObject(obj, j3, objB);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                l(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!r(object2)) {
                Object objB2 = n8C.b();
                n8C.e(objB2, object2);
                unsafe.putObject(obj, j3, objB2);
                object2 = objB2;
            }
            n8C.e(object2, object);
        }
    }

    public final void k(int i3, Object obj, Object obj2) {
        int[] iArr = this.f2794a;
        int i4 = iArr[i3];
        if (s(obj2, i4, i3)) {
            int iZ = z(i3) & 1048575;
            Unsafe unsafe = f2793m;
            long j3 = iZ;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2.toString());
            }
            N8 n8C = C(i3);
            if (!s(obj, i4, i3)) {
                if (r(object)) {
                    Object objB = n8C.b();
                    n8C.e(objB, object);
                    unsafe.putObject(obj, j3, objB);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                Y8.n(obj, iArr[i3 + 2] & 1048575, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!r(object2)) {
                Object objB2 = n8C.b();
                n8C.e(objB2, object2);
                unsafe.putObject(obj, j3, objB2);
                object2 = objB2;
            }
            n8C.e(object2, object);
        }
    }

    public final void l(int i3, Object obj) {
        int i4 = this.f2794a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        Y8.n(obj, j3, (1 << (i4 >>> 20)) | Y8.f(j3, obj));
    }

    public final void m(int i3, Object obj, Object obj2) {
        f2793m.putObject(obj, z(i3) & 1048575, obj2);
        l(i3, obj);
    }

    public final void n(int i3, int i4, Object obj, Object obj2) {
        f2793m.putObject(obj, z(i4) & 1048575, obj2);
        Y8.n(obj, this.f2794a[i4 + 2] & 1048575, i3);
    }

    public final boolean o(AbstractC0299o8 abstractC0299o8, Object obj, int i3) {
        return p(i3, abstractC0299o8) == p(i3, obj);
    }

    public final boolean p(int i3, Object obj) {
        int i4 = this.f2794a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 != 1048575) {
            return ((1 << (i4 >>> 20)) & Y8.f(j3, obj)) != 0;
        }
        int iZ = z(i3);
        long j4 = iZ & 1048575;
        switch (y(iZ)) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return Double.doubleToRawLongBits(Y8.f2967c.a(j4, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(Y8.f2967c.b(j4, obj)) != 0;
            case 2:
                return Y8.g(j4, obj) != 0;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                return Y8.g(j4, obj) != 0;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                return Y8.f(j4, obj) != 0;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                return Y8.g(j4, obj) != 0;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return Y8.f(j4, obj) != 0;
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return Y8.f2967c.g(j4, obj);
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                Object objI = Y8.i(j4, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof AbstractC0169b8) {
                    return !AbstractC0169b8.e.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return Y8.i(j4, obj) != null;
            case 10:
                return !AbstractC0169b8.e.equals(Y8.i(j4, obj));
            case 11:
                return Y8.f(j4, obj) != 0;
            case 12:
                return Y8.f(j4, obj) != 0;
            case 13:
                return Y8.f(j4, obj) != 0;
            case 14:
                return Y8.g(j4, obj) != 0;
            case 15:
                return Y8.f(j4, obj) != 0;
            case 16:
                return Y8.g(j4, obj) != 0;
            case 17:
                return Y8.i(j4, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean q(Object obj, int i3, int i4, int i5, int i6) {
        if (i4 == 1048575) {
            return p(i3, obj);
        }
        return (i5 & i6) != 0;
    }

    public final boolean s(Object obj, int i3, int i4) {
        return Y8.f((long) (this.f2794a[i4 + 2] & 1048575), obj) == i3;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ee A[LOOP:8: B:88:0x02ba->B:100:0x02ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x030c  */
    /* JADX WARN: Code duplicated, block: B:112:0x032a  */
    /* JADX WARN: Code duplicated, block: B:441:0x0b70 A[PHI: r10 r11 r12 r13 r27
      0x0b70: PHI (r10v91 int) = 
      (r10v68 int)
      (r10v69 int)
      (r10v70 int)
      (r10v71 int)
      (r10v72 int)
      (r10v73 int)
      (r10v75 int)
      (r10v76 int)
      (r10v84 int)
      (r10v92 int)
     binds: [B:439:0x0b58, B:436:0x0b36, B:433:0x0b19, B:430:0x0afd, B:427:0x0ae1, B:424:0x0ac4, B:416:0x0a9e, B:402:0x0a61, B:381:0x09b6, B:370:0x0955] A[DONT_GENERATE, DONT_INLINE]
      0x0b70: PHI (r11v57 int) = 
      (r11v36 int)
      (r11v37 int)
      (r11v38 int)
      (r11v39 int)
      (r11v40 int)
      (r11v41 int)
      (r11v43 int)
      (r11v44 int)
      (r11v50 int)
      (r11v58 int)
     binds: [B:439:0x0b58, B:436:0x0b36, B:433:0x0b19, B:430:0x0afd, B:427:0x0ae1, B:424:0x0ac4, B:416:0x0a9e, B:402:0x0a61, B:381:0x09b6, B:370:0x0955] A[DONT_GENERATE, DONT_INLINE]
      0x0b70: PHI (r12v94 int) = 
      (r12v72 int)
      (r12v73 int)
      (r12v74 int)
      (r12v75 int)
      (r12v76 int)
      (r12v77 int)
      (r12v79 int)
      (r12v80 int)
      (r12v86 int)
      (r12v95 int)
     binds: [B:439:0x0b58, B:436:0x0b36, B:433:0x0b19, B:430:0x0afd, B:427:0x0ae1, B:424:0x0ac4, B:416:0x0a9e, B:402:0x0a61, B:381:0x09b6, B:370:0x0955] A[DONT_GENERATE, DONT_INLINE]
      0x0b70: PHI (r13v86 com.google.android.gms.internal.mlkit_vision_face_bundled.X7) = 
      (r13v64 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v65 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v66 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v67 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v68 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v69 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v71 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v72 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v78 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
      (r13v87 com.google.android.gms.internal.mlkit_vision_face_bundled.X7)
     binds: [B:439:0x0b58, B:436:0x0b36, B:433:0x0b19, B:430:0x0afd, B:427:0x0ae1, B:424:0x0ac4, B:416:0x0a9e, B:402:0x0a61, B:381:0x09b6, B:370:0x0955] A[DONT_GENERATE, DONT_INLINE]
      0x0b70: PHI (r27v23 int) = 
      (r27v8 int)
      (r27v9 int)
      (r27v10 int)
      (r27v11 int)
      (r27v12 int)
      (r27v13 int)
      (r27v15 int)
      (r27v16 int)
      (r27v18 int)
      (r27v24 int)
     binds: [B:439:0x0b58, B:436:0x0b36, B:433:0x0b19, B:430:0x0afd, B:427:0x0ae1, B:424:0x0ac4, B:416:0x0a9e, B:402:0x0a61, B:381:0x09b6, B:370:0x0955] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:458:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:539:0x08c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0b73 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0320 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x08dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x0b89 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:630:0x034c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:0x0308 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x02e2 A[EDGE_INSN: B:638:0x02e2->B:634:0x02e2 BREAK  A[LOOP:9: B:92:0x02cf->B:95:0x02d9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d9 A[LOOP:9: B:92:0x02cf->B:95:0x02d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int t(Object obj, byte[] bArr, int i3, int i4, int i5, X7 x7) throws C0368v8 {
        Object[] objArr;
        Object obj2;
        Unsafe unsafe;
        int[] iArr;
        int i6;
        G8 g8;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        X7 x8;
        Object obj3;
        Object obj4;
        int i13;
        int i14;
        int i15;
        X7 x9;
        int i16;
        int i17;
        Unsafe unsafe2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iJ;
        int i23;
        int i24;
        int i25;
        byte b3;
        byte b4;
        int i26;
        int i27;
        int i28;
        V7 v7;
        byte[] bArr2;
        int i29;
        int i30;
        int i31;
        G8 g9;
        int iJ2;
        byte[] bArr3;
        int i32;
        int i33;
        int iM;
        int i34;
        int i35;
        int iJ3;
        G8 g10 = this;
        Object obj5 = obj;
        byte[] bArr4 = bArr;
        i4 = i4;
        i5 = i5;
        X7 x10 = x7;
        int i36 = 3;
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        Unsafe unsafe3 = f2793m;
        int i37 = i3;
        int i38 = -1;
        int i39 = 0;
        int i40 = 1048575;
        int i41 = 0;
        int i42 = 0;
        while (true) {
            int[] iArr2 = g10.f2794a;
            objArr = g10.f2795b;
            if (i37 < i4) {
                int iK = i37 + 1;
                int i43 = bArr4[i37];
                if (i43 < 0) {
                    iK = B.k(i43, bArr4, iK, x10);
                    i43 = x10.f2951a;
                }
                int i44 = i43 >>> 3;
                int i45 = g10.f2797d;
                int i46 = g10.f2796c;
                int iX = i44 > i38 ? (i44 < i46 || i44 > i45) ? -1 : g10.x(i44, i39 / i36) : (i44 < i46 || i44 > i45) ? -1 : g10.x(i44, 0);
                if (iX == -1) {
                    i7 = i5;
                    objArr = objArr;
                    unsafe = unsafe3;
                    i10 = i44;
                    iArr = iArr2;
                    i6 = i40;
                    i11 = 0;
                    i12 = iK;
                    x8 = x10;
                    obj3 = obj5;
                    i9 = i43;
                } else {
                    int i47 = i43 & 7;
                    int i48 = iArr2[iX + 1];
                    int iY = y(i48);
                    long j3 = i48 & 1048575;
                    if (iY <= 17) {
                        int i49 = iArr2[iX + 2];
                        int i50 = 1 << (i49 >>> 20);
                        int i51 = i43;
                        int i52 = i49 & 1048575;
                        iArr = iArr2;
                        int i53 = i40;
                        if (i52 != i53) {
                            if (i53 != 1048575) {
                                unsafe3.putInt(obj5, i53, i41);
                            }
                            i15 = i52 == 1048575 ? 0 : unsafe3.getInt(obj5, i52);
                            i40 = i52;
                        } else {
                            i15 = i41;
                            i40 = i53;
                        }
                        switch (iY) {
                            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                                x9 = x7;
                                i12 = iK;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 1) {
                                    int i54 = i15 | i50;
                                    Y8.l(obj5, j3, Double.longBitsToDouble(B.q(bArr4, i12)));
                                    g10 = this;
                                    i37 = i12 + 8;
                                    i5 = i5;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i40 = i40;
                                    i42 = i17 == true ? 1 : 0;
                                    i38 = i16;
                                    i36 = 3;
                                    i41 = i54;
                                } else {
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case 1:
                                x9 = x7;
                                i12 = iK;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 5) {
                                    i19 = i12 + 4;
                                    i20 = i15 | i50;
                                    Y8.m(obj5, j3, Float.intBitsToFloat(B.c(bArr4, i12)));
                                    i37 = i19;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i42 = i17;
                                    i38 = i16;
                                    g10 = this;
                                    i41 = i20;
                                    i36 = 3;
                                } else {
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case 2:
                            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                                i4 = i4;
                                x9 = x7;
                                i12 = iK;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 0) {
                                    i22 = i15 | i50;
                                    int iM2 = B.m(bArr4, i12, x9);
                                    unsafe2.putLong(obj, j3, x9.f2952b);
                                    i37 = iM2;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i40 = i40;
                                    i42 = i17;
                                    i38 = i16;
                                    i36 = 3;
                                    i41 = i22;
                                    g10 = this;
                                } else {
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case M.k.LONG_FIELD_NUMBER /* 4 */:
                            case 11:
                                x9 = x7;
                                i12 = iK;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 0) {
                                    i22 = i15 | i50;
                                    iJ = B.j(bArr4, i12, x9);
                                    unsafe2.putInt(obj5, j3, x9.f2951a);
                                    i37 = iJ;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i40 = i40;
                                    i42 = i17;
                                    i38 = i16;
                                    i36 = 3;
                                    i41 = i22;
                                    g10 = this;
                                } else {
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case M.k.STRING_FIELD_NUMBER /* 5 */:
                            case 14:
                                x9 = x7;
                                i12 = iK;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 1) {
                                    i23 = i15 | i50;
                                    unsafe2.putLong(obj, j3, B.q(bArr4, i12));
                                    i37 = i12 + 8;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i42 = i17 == true ? 1 : 0;
                                    i36 = 3;
                                    g10 = this;
                                    i41 = i23;
                                    i38 = i16;
                                } else {
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            case 13:
                                x9 = x7;
                                i12 = iK;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 5) {
                                    i19 = i12 + 4;
                                    i20 = i15 | i50;
                                    unsafe2.putInt(obj5, j3, B.c(bArr4, i12));
                                    i37 = i19;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i42 = i17;
                                    i38 = i16;
                                    g10 = this;
                                    i41 = i20;
                                    i36 = 3;
                                } else {
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                x9 = x7;
                                i12 = iK;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 0) {
                                    int i55 = i15 | i50;
                                    int iM3 = B.m(bArr4, i12, x9);
                                    Y8.k(obj5, j3, x9.f2952b != 0);
                                    g10 = this;
                                    i5 = i5;
                                    i37 = iM3;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i40 = i40;
                                    i42 = i17 == true ? 1 : 0;
                                    i38 = i16;
                                    i36 = 3;
                                    i41 = i55;
                                } else {
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                                x9 = x7;
                                i12 = iK;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 2) {
                                    if ((i48 & 536870912) != 0) {
                                        int iJ4 = B.j(bArr4, i12, x9);
                                        int i56 = x9.f2951a;
                                        if (i56 < 0) {
                                            throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i57 = i15 | i50;
                                        if (i56 == 0) {
                                            x9.f2953c = "";
                                            i24 = i57;
                                        } else {
                                            int length = bArr4.length;
                                            int i58 = a9.f2990a;
                                            if ((iJ4 | i56 | ((length - iJ4) - i56)) < 0) {
                                                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iJ4), Integer.valueOf(i56)));
                                            }
                                            int i59 = iJ4 + i56;
                                            char[] cArr = new char[i56];
                                            int i60 = 0;
                                            while (iJ4 < i59) {
                                                byte b5 = bArr4[iJ4];
                                                if (K.d(b5)) {
                                                    iJ4++;
                                                    cArr[i60] = (char) b5;
                                                    i60++;
                                                } else {
                                                    while (true) {
                                                        while (true) {
                                                            if (iJ4 < i59) {
                                                                i25 = iJ4 + 1;
                                                                b3 = bArr4[iJ4];
                                                                if (K.d(b3)) {
                                                                    cArr[i60] = (char) b3;
                                                                    i60++;
                                                                    iJ4 = i25;
                                                                    while (iJ4 < i59) {
                                                                        b4 = bArr4[iJ4];
                                                                        if (K.d(b4)) {
                                                                        }
                                                                        iJ4++;
                                                                        cArr[i60] = (char) b4;
                                                                        i60++;
                                                                        break;
                                                                    }
                                                                } else {
                                                                    i26 = i57;
                                                                    if (b3 < -32) {
                                                                        if (i25 < i59) {
                                                                            throw new C0368v8("Protocol message had invalid UTF-8.");
                                                                        }
                                                                        iJ4 += 2;
                                                                        K.c(b3, bArr4[i25], cArr, i60);
                                                                        i60++;
                                                                        i57 = i26;
                                                                    } else if (b3 < -16) {
                                                                        if (i25 < i59 - 1) {
                                                                            throw new C0368v8("Protocol message had invalid UTF-8.");
                                                                        }
                                                                        int i61 = iJ4 + 2;
                                                                        iJ4 += 3;
                                                                        K.b(b3, bArr4[i25], bArr4[i61], cArr, i60);
                                                                        i57 = i26;
                                                                        i60++;
                                                                    } else {
                                                                        if (i25 < i59 - 2) {
                                                                            throw new C0368v8("Protocol message had invalid UTF-8.");
                                                                        }
                                                                        byte b6 = bArr4[i25];
                                                                        int i62 = iJ4 + 3;
                                                                        byte b7 = bArr4[iJ4 + 2];
                                                                        iJ4 += 4;
                                                                        K.a(b3, b6, b7, bArr4[i62], cArr, i60);
                                                                        i60 += 2;
                                                                        i57 = i26;
                                                                    }
                                                                }
                                                            } else {
                                                                i24 = i57;
                                                                x9.f2953c = new String(cArr, 0, i60);
                                                                iJ4 = i59;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            while (true) {
                                                while (true) {
                                                    if (iJ4 < i59) {
                                                        i25 = iJ4 + 1;
                                                        b3 = bArr4[iJ4];
                                                        if (K.d(b3)) {
                                                            cArr[i60] = (char) b3;
                                                            i60++;
                                                            iJ4 = i25;
                                                            while (iJ4 < i59) {
                                                                b4 = bArr4[iJ4];
                                                                if (K.d(b4)) {
                                                                }
                                                                iJ4++;
                                                                cArr[i60] = (char) b4;
                                                                i60++;
                                                                break;
                                                            }
                                                        } else {
                                                            i26 = i57;
                                                            if (b3 < -32) {
                                                                if (i25 < i59) {
                                                                    throw new C0368v8("Protocol message had invalid UTF-8.");
                                                                }
                                                                iJ4 += 2;
                                                                K.c(b3, bArr4[i25], cArr, i60);
                                                                i60++;
                                                                i57 = i26;
                                                            } else if (b3 < -16) {
                                                                if (i25 < i59 - 1) {
                                                                    throw new C0368v8("Protocol message had invalid UTF-8.");
                                                                }
                                                                int i63 = iJ4 + 2;
                                                                iJ4 += 3;
                                                                K.b(b3, bArr4[i25], bArr4[i63], cArr, i60);
                                                                i57 = i26;
                                                                i60++;
                                                            } else {
                                                                if (i25 < i59 - 2) {
                                                                    throw new C0368v8("Protocol message had invalid UTF-8.");
                                                                }
                                                                byte b8 = bArr4[i25];
                                                                int i64 = iJ4 + 3;
                                                                byte b9 = bArr4[iJ4 + 2];
                                                                iJ4 += 4;
                                                                K.a(b3, b8, b9, bArr4[i64], cArr, i60);
                                                                i60 += 2;
                                                                i57 = i26;
                                                            }
                                                        }
                                                    } else {
                                                        i24 = i57;
                                                        x9.f2953c = new String(cArr, 0, i60);
                                                        iJ4 = i59;
                                                    }
                                                }
                                            }
                                        }
                                        i22 = i24;
                                        iJ = iJ4;
                                    } else {
                                        i22 = i15 | i50;
                                        iJ = B.h(bArr4, i12, x9);
                                    }
                                    unsafe2.putObject(obj5, j3, x9.f2953c);
                                    i37 = iJ;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i40 = i40;
                                    i42 = i17;
                                    i38 = i16;
                                    i36 = 3;
                                    i41 = i22;
                                    g10 = this;
                                } else {
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case 9:
                                x9 = x7;
                                i16 = i44;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 2) {
                                    i23 = i15 | i50;
                                    Object objD = g10.D(i18, obj5);
                                    int iO = B.o(objD, g10.C(i18), bArr, iK, i4, x7);
                                    g10.m(i18, obj5, objD);
                                    i37 = iO;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i42 = i51 == true ? 1 : 0;
                                    i36 = 3;
                                    i41 = i23;
                                    i38 = i16;
                                } else {
                                    i17 = i51 == true ? 1 : 0;
                                    i12 = iK;
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case 10:
                                x9 = x7;
                                i16 = i44;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 2) {
                                    int iA = B.a(bArr4, iK, x9);
                                    unsafe2.putObject(obj5, j3, x9.f2953c);
                                    i42 = i51 == true ? 1 : 0;
                                    i5 = i5;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    i40 = i40;
                                    i38 = i16;
                                    i36 = 3;
                                    i37 = iA;
                                    i41 = i15 | i50;
                                    x10 = x9;
                                } else {
                                    i17 = i51 == true ? 1 : 0;
                                    i12 = iK;
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case 12:
                                x9 = x7;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 0) {
                                    int iJ5 = B.j(bArr4, iK, x9);
                                    int i65 = x9.f2951a;
                                    InterfaceC0328r8 interfaceC0328r8B = g10.B(i18);
                                    if ((i48 & Integer.MIN_VALUE) == 0 || interfaceC0328r8B == null || interfaceC0328r8B.a(i65)) {
                                        i21 = i17 == true ? 1 : 0;
                                        i15 |= i50;
                                        unsafe2.putInt(obj5, j3, i65);
                                    } else {
                                        S8 s8U = u(obj);
                                        Long lValueOf = Long.valueOf(i65);
                                        i21 = i17 == true ? 1 : 0;
                                        s8U.c(i21 == true ? 1 : 0, lValueOf);
                                    }
                                    i42 = i21;
                                    i5 = i5;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    i40 = i40;
                                    i38 = i16;
                                    i37 = iJ5;
                                    i41 = i15;
                                    x10 = x9;
                                    i36 = 3;
                                } else {
                                    i12 = iK;
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case 15:
                                x9 = x7;
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                i18 = iX;
                                if (i47 == 0) {
                                    int i66 = i15 | i50;
                                    int iJ6 = B.j(bArr4, iK, x9);
                                    unsafe2.putInt(obj5, j3, H.a(x9.f2951a));
                                    i5 = i5;
                                    i4 = i4;
                                    i39 = i18;
                                    unsafe3 = unsafe2;
                                    x10 = x9;
                                    i40 = i40;
                                    i42 = i17 == true ? 1 : 0;
                                    i38 = i16;
                                    i41 = i66;
                                    i37 = iJ6;
                                    i36 = 3;
                                } else {
                                    i12 = iK;
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            case 16:
                                i16 = i44;
                                i17 = i51 == true ? 1 : 0;
                                unsafe2 = unsafe3;
                                if (i47 == 0) {
                                    int i67 = i15 | i50;
                                    int iM4 = B.m(bArr4, iK, x7);
                                    int i68 = iX;
                                    unsafe2.putLong(obj, j3, H.b(x7.f2952b));
                                    i5 = i5;
                                    i4 = i4;
                                    i39 = i68;
                                    unsafe3 = unsafe2;
                                    x10 = x7;
                                    i40 = i40;
                                    i42 = i17 == true ? 1 : 0;
                                    i38 = i16;
                                    i36 = 3;
                                    i41 = i67;
                                    i37 = iM4;
                                } else {
                                    x9 = x7;
                                    i18 = iX;
                                    i12 = iK;
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                            default:
                                if (i47 == 3) {
                                    i20 = i15 | i50;
                                    Object objD2 = g10.D(iX, obj5);
                                    i37 = B.n(objD2, g10.C(iX), bArr, iK, i4, (i44 << 3) | 4, x7);
                                    g10.m(iX, obj5, objD2);
                                    x10 = x7;
                                    unsafe3 = unsafe3;
                                    i39 = iX;
                                    i42 = i51 == true ? 1 : 0;
                                    i38 = i44;
                                    i41 = i20;
                                    i36 = 3;
                                } else {
                                    i16 = i44;
                                    unsafe2 = unsafe3;
                                    x9 = x7;
                                    i12 = iK;
                                    i18 = iX;
                                    i17 = i51 == true ? 1 : 0;
                                    i7 = i5;
                                    objArr = objArr;
                                    i11 = i18;
                                    unsafe = unsafe2;
                                    x8 = x9;
                                    i6 = i40;
                                    i9 = i17;
                                    i10 = i16;
                                    i41 = i15;
                                    obj3 = obj5;
                                }
                                break;
                        }
                    } else {
                        int i69 = iK;
                        int i70 = i43;
                        iArr = iArr2;
                        i6 = i40;
                        Unsafe unsafe4 = unsafe3;
                        int i71 = iX;
                        if (iY != 27) {
                            unsafe = unsafe4;
                            if (iY <= 49) {
                                long j4 = i48;
                                Unsafe unsafe5 = f2793m;
                                V7 v8 = (V7) ((InterfaceC0338s8) unsafe5.getObject(obj5, j3));
                                if (v8.e()) {
                                    objArr = objArr;
                                    v7 = v8;
                                } else {
                                    L8 l8 = (L8) v8;
                                    int size = l8.size();
                                    L8 l8F = l8.f(size == 0 ? 10 : size + size);
                                    unsafe5.putObject(obj5, j3, l8F);
                                    v7 = l8F;
                                }
                                switch (iY) {
                                    case 18:
                                    case 35:
                                        bArr2 = bArr;
                                        i29 = i69;
                                        objArr = objArr;
                                        i30 = i70 == true ? 1 : 0;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        if (i47 == 2) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        if (i47 == 1) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 19:
                                    case 36:
                                        bArr2 = bArr;
                                        i29 = i69;
                                        objArr = objArr;
                                        i30 = i70 == true ? 1 : 0;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        if (i47 == 2) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        if (i47 == 5) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        bArr2 = bArr;
                                        i29 = i69;
                                        objArr = objArr;
                                        i30 = i70 == true ? 1 : 0;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        if (i47 == 2) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        if (i47 == 0) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        bArr2 = bArr;
                                        i29 = i69;
                                        objArr = objArr;
                                        i30 = i70 == true ? 1 : 0;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        if (i47 == 2) {
                                            B.g(bArr2, i29, v7, x8);
                                            throw null;
                                        }
                                        if (i47 == 0) {
                                            B.l(bArr2, i29, v7, x8);
                                            throw null;
                                        }
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        bArr2 = bArr;
                                        i29 = i69;
                                        objArr = objArr;
                                        i30 = i70 == true ? 1 : 0;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        if (i47 == 2) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        if (i47 == 1) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        bArr2 = bArr;
                                        i29 = i69;
                                        objArr = objArr;
                                        i30 = i70 == true ? 1 : 0;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        if (i47 == 2) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        if (i47 == 5) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 25:
                                    case 42:
                                        bArr2 = bArr;
                                        i29 = i69;
                                        objArr = objArr;
                                        i30 = i70 == true ? 1 : 0;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        if (i47 == 2) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        if (i47 == 0) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 26:
                                        bArr2 = bArr;
                                        i29 = i69;
                                        objArr = objArr;
                                        i30 = i70 == true ? 1 : 0;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        if (i47 == 2) {
                                            if ((j4 & 536870912) == 0) {
                                                iJ2 = B.j(bArr2, i29, x8);
                                                int i72 = x8.f2951a;
                                                if (i72 < 0) {
                                                    throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i72 == 0) {
                                                    ((L8) v7).add("");
                                                } else {
                                                    ((L8) v7).add(new String(bArr2, iJ2, i72, AbstractC0348t8.f3460a));
                                                    iJ2 += i72;
                                                }
                                                while (iJ2 < i4) {
                                                    int iJ7 = B.j(bArr2, iJ2, x8);
                                                    if (i30 == x8.f2951a) {
                                                        iJ2 = B.j(bArr2, iJ7, x8);
                                                        int i73 = x8.f2951a;
                                                        if (i73 < 0) {
                                                            throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i73 == 0) {
                                                            ((L8) v7).add("");
                                                        } else {
                                                            ((L8) v7).add(new String(bArr2, iJ2, i73, AbstractC0348t8.f3460a));
                                                            iJ2 += i73;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iJ2 = B.j(bArr2, i29, x8);
                                                int i74 = x8.f2951a;
                                                if (i74 < 0) {
                                                    throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                }
                                                if (i74 == 0) {
                                                    ((L8) v7).add("");
                                                } else {
                                                    int i75 = iJ2 + i74;
                                                    if (!a9.d(bArr2, iJ2, i75)) {
                                                        throw new C0368v8("Protocol message had invalid UTF-8.");
                                                    }
                                                    ((L8) v7).add(new String(bArr2, iJ2, i74, AbstractC0348t8.f3460a));
                                                    iJ2 = i75;
                                                }
                                                while (iJ2 < i4) {
                                                    int iJ8 = B.j(bArr2, iJ2, x8);
                                                    if (i30 == x8.f2951a) {
                                                        iJ2 = B.j(bArr2, iJ8, x8);
                                                        int i76 = x8.f2951a;
                                                        if (i76 < 0) {
                                                            throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        }
                                                        if (i76 == 0) {
                                                            ((L8) v7).add("");
                                                        } else {
                                                            int i77 = iJ2 + i76;
                                                            if (!a9.d(bArr2, iJ2, i77)) {
                                                                throw new C0368v8("Protocol message had invalid UTF-8.");
                                                            }
                                                            ((L8) v7).add(new String(bArr2, iJ2, i76, AbstractC0348t8.f3460a));
                                                            iJ2 = i77;
                                                        }
                                                    }
                                                }
                                            }
                                            i37 = iJ2;
                                            if (i37 != i29) {
                                                obj5 = obj;
                                                i5 = i5;
                                                bArr4 = bArr2;
                                                i42 = i30;
                                                i39 = i31;
                                                x10 = x8;
                                                i40 = i6;
                                                i38 = i44;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                                i4 = i4;
                                                g10 = g9;
                                            } else {
                                                obj3 = obj;
                                                i7 = i5;
                                                i12 = i37;
                                                i11 = i31;
                                                i10 = i44;
                                                i9 = i30;
                                            }
                                        }
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                    case 27:
                                        bArr3 = bArr;
                                        i29 = i69;
                                        i32 = i70 == true ? 1 : 0;
                                        if (i47 == 2) {
                                            N8 n8C = C(i71);
                                            bArr2 = bArr3;
                                            i30 = i32 == true ? 1 : 0;
                                            objArr = objArr;
                                            i37 = B.f(n8C, i32 == true ? 1 : 0, bArr, i29, i4, v7, x7);
                                            x8 = x7;
                                            g9 = this;
                                            i31 = i71;
                                            if (i37 != i29) {
                                                obj5 = obj;
                                                i5 = i5;
                                                bArr4 = bArr2;
                                                i42 = i30;
                                                i39 = i31;
                                                x10 = x8;
                                                i40 = i6;
                                                i38 = i44;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                                i4 = i4;
                                                g10 = g9;
                                            } else {
                                                obj3 = obj;
                                                i7 = i5;
                                                i12 = i37;
                                                i11 = i31;
                                                i10 = i44;
                                                i9 = i30;
                                            }
                                        }
                                        bArr2 = bArr3;
                                        i30 = i32;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                    case 28:
                                        bArr3 = bArr;
                                        i29 = i69;
                                        i32 = i70 == true ? 1 : 0;
                                        if (i47 == 2) {
                                            int iJ9 = B.j(bArr3, i29, x7);
                                            int i78 = x7.f2951a;
                                            if (i78 < 0) {
                                                throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i78 > bArr3.length - iJ9) {
                                                throw new C0368v8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i78 == 0) {
                                                ((L8) v7).add(AbstractC0169b8.e);
                                            } else {
                                                ((L8) v7).add(AbstractC0169b8.g(bArr3, iJ9, i78));
                                                iJ9 += i78;
                                            }
                                            while (iJ9 < i4) {
                                                int iJ10 = B.j(bArr3, iJ9, x7);
                                                if (i32 != x7.f2951a) {
                                                    i37 = iJ9;
                                                    bArr2 = bArr3;
                                                    i30 = i32 == true ? 1 : 0;
                                                    x8 = x7;
                                                    i31 = i71;
                                                    g9 = this;
                                                    if (i37 != i29) {
                                                        obj5 = obj;
                                                        i5 = i5;
                                                        bArr4 = bArr2;
                                                        i42 = i30;
                                                        i39 = i31;
                                                        x10 = x8;
                                                        i40 = i6;
                                                        i38 = i44;
                                                        unsafe3 = unsafe;
                                                        i36 = 3;
                                                        i4 = i4;
                                                        g10 = g9;
                                                    } else {
                                                        obj3 = obj;
                                                        i7 = i5;
                                                        i12 = i37;
                                                        i11 = i31;
                                                        i10 = i44;
                                                        i9 = i30;
                                                    }
                                                    break;
                                                } else {
                                                    iJ9 = B.j(bArr3, iJ10, x7);
                                                    int i79 = x7.f2951a;
                                                    if (i79 < 0) {
                                                        throw new C0368v8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i79 > bArr3.length - iJ9) {
                                                        throw new C0368v8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i79 == 0) {
                                                        ((L8) v7).add(AbstractC0169b8.e);
                                                    } else {
                                                        ((L8) v7).add(AbstractC0169b8.g(bArr3, iJ9, i79));
                                                        iJ9 += i79;
                                                    }
                                                }
                                            }
                                            i37 = iJ9;
                                            bArr2 = bArr3;
                                            i30 = i32 == true ? 1 : 0;
                                            x8 = x7;
                                            i31 = i71;
                                            g9 = this;
                                            if (i37 != i29) {
                                                obj5 = obj;
                                                i5 = i5;
                                                bArr4 = bArr2;
                                                i42 = i30;
                                                i39 = i31;
                                                x10 = x8;
                                                i40 = i6;
                                                i38 = i44;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                                i4 = i4;
                                                g10 = g9;
                                            } else {
                                                obj3 = obj;
                                                i7 = i5;
                                                i12 = i37;
                                                i11 = i31;
                                                i10 = i44;
                                                i9 = i30;
                                            }
                                        }
                                        bArr2 = bArr3;
                                        i30 = i32;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        bArr3 = bArr;
                                        i29 = i69;
                                        i32 = i70 == true ? 1 : 0;
                                        if (i47 == 2) {
                                            B.g(bArr3, i29, v7, x7);
                                            throw null;
                                        }
                                        if (i47 == 0) {
                                            B.l(bArr3, i29, v7, x7);
                                            throw null;
                                        }
                                        bArr2 = bArr3;
                                        i30 = i32;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 33:
                                    case 47:
                                        bArr3 = bArr;
                                        i29 = i69;
                                        i32 = i70 == true ? 1 : 0;
                                        if (i47 == 2) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        if (i47 == 0) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        bArr2 = bArr3;
                                        i30 = i32;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    case 34:
                                    case 48:
                                        bArr3 = bArr;
                                        i29 = i69;
                                        i32 = i70 == true ? 1 : 0;
                                        if (i47 == 2) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        if (i47 == 0) {
                                            A0.c.m(v7);
                                            throw null;
                                        }
                                        bArr2 = bArr3;
                                        i30 = i32;
                                        x8 = x7;
                                        i31 = i71;
                                        g9 = this;
                                        i37 = i29;
                                        if (i37 != i29) {
                                            obj5 = obj;
                                            i5 = i5;
                                            bArr4 = bArr2;
                                            i42 = i30;
                                            i39 = i31;
                                            x10 = x8;
                                            i40 = i6;
                                            i38 = i44;
                                            unsafe3 = unsafe;
                                            i36 = 3;
                                            i4 = i4;
                                            g10 = g9;
                                        } else {
                                            obj3 = obj;
                                            i7 = i5;
                                            i12 = i37;
                                            i11 = i31;
                                            i10 = i44;
                                            i9 = i30;
                                        }
                                        break;
                                        break;
                                    default:
                                        if (i47 == 3) {
                                            int i80 = ((i70 == true ? 1 : 0) & (-8)) | 4;
                                            N8 n8C2 = C(i71);
                                            i29 = i69;
                                            int iD = B.d(n8C2, bArr, i69, i4, i80, x7);
                                            L8 l9 = (L8) v7;
                                            l9.add(x7.f2953c);
                                            while (iD < i4) {
                                                int iJ11 = B.j(bArr, iD, x7);
                                                if (i70 != x7.f2951a) {
                                                    i37 = iD;
                                                    bArr2 = bArr;
                                                    i30 = i70 == true ? 1 : 0;
                                                    x8 = x7;
                                                    i31 = i71;
                                                    g9 = this;
                                                    if (i37 != i29) {
                                                        obj5 = obj;
                                                        i5 = i5;
                                                        bArr4 = bArr2;
                                                        i42 = i30;
                                                        i39 = i31;
                                                        x10 = x8;
                                                        i40 = i6;
                                                        i38 = i44;
                                                        unsafe3 = unsafe;
                                                        i36 = 3;
                                                        i4 = i4;
                                                        g10 = g9;
                                                    } else {
                                                        obj3 = obj;
                                                        i7 = i5;
                                                        i12 = i37;
                                                        i11 = i31;
                                                        i10 = i44;
                                                        i9 = i30;
                                                    }
                                                } else {
                                                    iD = B.d(n8C2, bArr, iJ11, i4, i80, x7);
                                                    l9.add(x7.f2953c);
                                                }
                                                break;
                                            }
                                            i37 = iD;
                                            bArr2 = bArr;
                                            i30 = i70 == true ? 1 : 0;
                                            x8 = x7;
                                            i31 = i71;
                                            g9 = this;
                                            if (i37 != i29) {
                                                obj5 = obj;
                                                i5 = i5;
                                                bArr4 = bArr2;
                                                i42 = i30;
                                                i39 = i31;
                                                x10 = x8;
                                                i40 = i6;
                                                i38 = i44;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                                i4 = i4;
                                                g10 = g9;
                                            } else {
                                                obj3 = obj;
                                                i7 = i5;
                                                i12 = i37;
                                                i11 = i31;
                                                i10 = i44;
                                                i9 = i30;
                                            }
                                        } else {
                                            i29 = i69;
                                            bArr2 = bArr;
                                            i30 = i70 == true ? 1 : 0;
                                            x8 = x7;
                                            i31 = i71;
                                            g9 = this;
                                            i37 = i29;
                                            if (i37 != i29) {
                                                obj5 = obj;
                                                i5 = i5;
                                                bArr4 = bArr2;
                                                i42 = i30;
                                                i39 = i31;
                                                x10 = x8;
                                                i40 = i6;
                                                i38 = i44;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                                i4 = i4;
                                                g10 = g9;
                                            } else {
                                                obj3 = obj;
                                                i7 = i5;
                                                i12 = i37;
                                                i11 = i31;
                                                i10 = i44;
                                                i9 = i30;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                byte[] bArr5 = bArr;
                                objArr = objArr;
                                i28 = i70 == true ? 1 : 0;
                                x8 = x7;
                                i71 = i71;
                                if (iY != 50) {
                                    obj3 = obj;
                                    Unsafe unsafe6 = f2793m;
                                    long j5 = iArr[i71 + 2] & 1048575;
                                    switch (iY) {
                                        case 51:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 1) {
                                                iM = i33 + 8;
                                                unsafe6.putObject(obj3, j3, Double.valueOf(Double.longBitsToDouble(B.q(bArr5, i33))));
                                                unsafe6.putInt(obj3, j5, i10);
                                                i37 = iM;
                                            } else {
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 52:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 5) {
                                                iM = i33 + 4;
                                                unsafe6.putObject(obj3, j3, Float.valueOf(Float.intBitsToFloat(B.c(bArr5, i33))));
                                                unsafe6.putInt(obj3, j5, i10);
                                                i37 = iM;
                                            } else {
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 0) {
                                                iM = B.m(bArr5, i33, x8);
                                                unsafe6.putObject(obj3, j3, Long.valueOf(x8.f2952b));
                                                unsafe6.putInt(obj3, j5, i10);
                                                i37 = iM;
                                            } else {
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 0) {
                                                iM = B.j(bArr5, i33, x8);
                                                unsafe6.putObject(obj3, j3, Integer.valueOf(x8.f2951a));
                                                unsafe6.putInt(obj3, j5, i10);
                                                i37 = iM;
                                            } else {
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 1) {
                                                iM = i33 + 8;
                                                unsafe6.putObject(obj3, j3, Long.valueOf(B.q(bArr5, i33)));
                                                unsafe6.putInt(obj3, j5, i10);
                                                i37 = iM;
                                            } else {
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 5) {
                                                iM = i33 + 4;
                                                unsafe6.putObject(obj3, j3, Integer.valueOf(B.c(bArr5, i33)));
                                                unsafe6.putInt(obj3, j5, i10);
                                                i37 = iM;
                                            } else {
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 58:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 0) {
                                                iM = B.m(bArr5, i33, x8);
                                                unsafe6.putObject(obj3, j3, Boolean.valueOf(x8.f2952b != 0));
                                                unsafe6.putInt(obj3, j5, i10);
                                                i37 = iM;
                                            } else {
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 59:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 2) {
                                                int iJ12 = B.j(bArr5, i33, x8);
                                                int i81 = x8.f2951a;
                                                if (i81 == 0) {
                                                    unsafe6.putObject(obj3, j3, "");
                                                } else {
                                                    int i82 = iJ12 + i81;
                                                    if ((i48 & 536870912) != 0 && !a9.d(bArr5, iJ12, i82)) {
                                                        throw new C0368v8("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe6.putObject(obj3, j3, new String(bArr5, iJ12, i81, AbstractC0348t8.f3460a));
                                                    iJ12 = i82;
                                                }
                                                unsafe6.putInt(obj3, j5, i10);
                                                i37 = iJ12;
                                            } else {
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 60:
                                            x8 = x7;
                                            i34 = i71;
                                            i35 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 2) {
                                                Object objE = E(obj3, i35, i34);
                                                int iO2 = B.o(objE, C(i34), bArr, i33, i4, x7);
                                                n(i35, i34, obj3, objE);
                                                i11 = i34;
                                                i10 = i35;
                                                i37 = iO2;
                                            } else {
                                                i11 = i34;
                                                i10 = i35;
                                                i37 = i33;
                                            }
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 61:
                                            x8 = x7;
                                            i34 = i71;
                                            i35 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 2) {
                                                int iA2 = B.a(bArr5, i33, x8);
                                                unsafe6.putObject(obj3, j3, x8.f2953c);
                                                unsafe6.putInt(obj3, j5, i35);
                                                i37 = iA2;
                                                i11 = i34;
                                                i10 = i35;
                                                if (i37 != i33) {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    g10 = this;
                                                    i4 = i4;
                                                    i5 = i5;
                                                    bArr4 = bArr5;
                                                    obj5 = obj3;
                                                    i38 = i10;
                                                    i42 = i9 == true ? 1 : 0;
                                                    x10 = x8;
                                                    i40 = i6;
                                                    i39 = i11;
                                                    unsafe3 = unsafe;
                                                    i36 = 3;
                                                } else {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    i7 = i5;
                                                    i12 = i37;
                                                }
                                            }
                                            i11 = i34;
                                            i10 = i35;
                                            i37 = i33;
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 63:
                                            x8 = x7;
                                            i34 = i71;
                                            i35 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 0) {
                                                iJ3 = B.j(bArr5, i33, x8);
                                                int i83 = x8.f2951a;
                                                InterfaceC0328r8 interfaceC0328r8B2 = B(i34);
                                                if (interfaceC0328r8B2 == null || interfaceC0328r8B2.a(i83)) {
                                                    unsafe6.putObject(obj3, j3, Integer.valueOf(i83));
                                                    unsafe6.putInt(obj3, j5, i35);
                                                } else {
                                                    u(obj).c(i9 == true ? 1 : 0, Long.valueOf(i83));
                                                }
                                                i37 = iJ3;
                                                i11 = i34;
                                                i10 = i35;
                                                if (i37 != i33) {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    g10 = this;
                                                    i4 = i4;
                                                    i5 = i5;
                                                    bArr4 = bArr5;
                                                    obj5 = obj3;
                                                    i38 = i10;
                                                    i42 = i9 == true ? 1 : 0;
                                                    x10 = x8;
                                                    i40 = i6;
                                                    i39 = i11;
                                                    unsafe3 = unsafe;
                                                    i36 = 3;
                                                } else {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    i7 = i5;
                                                    i12 = i37;
                                                }
                                            }
                                            i11 = i34;
                                            i10 = i35;
                                            i37 = i33;
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 66:
                                            x8 = x7;
                                            i34 = i71;
                                            i35 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            if (i47 == 0) {
                                                iJ3 = B.j(bArr5, i33, x8);
                                                unsafe6.putObject(obj3, j3, Integer.valueOf(H.a(x8.f2951a)));
                                                unsafe6.putInt(obj3, j5, i35);
                                                i37 = iJ3;
                                                i11 = i34;
                                                i10 = i35;
                                                if (i37 != i33) {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    g10 = this;
                                                    i4 = i4;
                                                    i5 = i5;
                                                    bArr4 = bArr5;
                                                    obj5 = obj3;
                                                    i38 = i10;
                                                    i42 = i9 == true ? 1 : 0;
                                                    x10 = x8;
                                                    i40 = i6;
                                                    i39 = i11;
                                                    unsafe3 = unsafe;
                                                    i36 = 3;
                                                } else {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    i7 = i5;
                                                    i12 = i37;
                                                }
                                            }
                                            i11 = i34;
                                            i10 = i35;
                                            i37 = i33;
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                        case 67:
                                            x8 = x7;
                                            i34 = i71;
                                            i35 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            if (i47 == 0) {
                                                i33 = i69;
                                                int iM5 = B.m(bArr5, i33, x8);
                                                unsafe6.putObject(obj3, j3, Long.valueOf(H.b(x8.f2952b)));
                                                unsafe6.putInt(obj3, j5, i35);
                                                i37 = iM5;
                                                i11 = i34;
                                                i10 = i35;
                                                if (i37 != i33) {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    g10 = this;
                                                    i4 = i4;
                                                    i5 = i5;
                                                    bArr4 = bArr5;
                                                    obj5 = obj3;
                                                    i38 = i10;
                                                    i42 = i9 == true ? 1 : 0;
                                                    x10 = x8;
                                                    i40 = i6;
                                                    i39 = i11;
                                                    unsafe3 = unsafe;
                                                    i36 = 3;
                                                } else {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    i7 = i5;
                                                    i12 = i37;
                                                }
                                            } else {
                                                i33 = i69;
                                                i11 = i34;
                                                i10 = i35;
                                                i37 = i33;
                                                if (i37 != i33) {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    g10 = this;
                                                    i4 = i4;
                                                    i5 = i5;
                                                    bArr4 = bArr5;
                                                    obj5 = obj3;
                                                    i38 = i10;
                                                    i42 = i9 == true ? 1 : 0;
                                                    x10 = x8;
                                                    i40 = i6;
                                                    i39 = i11;
                                                    unsafe3 = unsafe;
                                                    i36 = 3;
                                                } else {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    i7 = i5;
                                                    i12 = i37;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (i47 != 3) {
                                                break;
                                            } else {
                                                int i84 = ((i28 == true ? 1 : 0) & (-8)) | 4;
                                                i35 = i44;
                                                Object objE2 = E(obj3, i35, i71);
                                                i33 = i69;
                                                i37 = B.n(objE2, C(i71), bArr, i33, i4, i84, x7);
                                                n(i35, i71, obj3, objE2);
                                                i9 = i28 == true ? 1 : 0;
                                                i11 = i71;
                                                x8 = x7;
                                                i10 = i35;
                                                if (i37 != i33) {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    g10 = this;
                                                    i4 = i4;
                                                    i5 = i5;
                                                    bArr4 = bArr5;
                                                    obj5 = obj3;
                                                    i38 = i10;
                                                    i42 = i9 == true ? 1 : 0;
                                                    x10 = x8;
                                                    i40 = i6;
                                                    i39 = i11;
                                                    unsafe3 = unsafe;
                                                    i36 = 3;
                                                } else {
                                                    bArr5 = bArr5;
                                                    obj3 = obj3;
                                                    i7 = i5;
                                                    i12 = i37;
                                                }
                                                break;
                                            }
                                        default:
                                            x8 = x7;
                                            i11 = i71;
                                            i10 = i44;
                                            i9 = i28 == true ? 1 : 0;
                                            i33 = i69;
                                            i37 = i33;
                                            if (i37 != i33) {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                g10 = this;
                                                i4 = i4;
                                                i5 = i5;
                                                bArr4 = bArr5;
                                                obj5 = obj3;
                                                i38 = i10;
                                                i42 = i9 == true ? 1 : 0;
                                                x10 = x8;
                                                i40 = i6;
                                                i39 = i11;
                                                unsafe3 = unsafe;
                                                i36 = 3;
                                            } else {
                                                bArr5 = bArr5;
                                                obj3 = obj3;
                                                i7 = i5;
                                                i12 = i37;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i47 == 2) {
                                        Unsafe unsafe7 = f2793m;
                                        int i85 = i71 / 3;
                                        Object obj6 = objArr[i85 + i85];
                                        Object object = unsafe7.getObject(obj, j3);
                                        if (!((B8) object).d()) {
                                            B8 b8B = B8.a().b();
                                            H7.d(b8B, object);
                                            unsafe7.putObject(obj, j3, b8B);
                                        }
                                        A0.c.o(obj6);
                                        throw null;
                                    }
                                    obj3 = obj;
                                    i27 = i69;
                                }
                            }
                        } else if (i47 == 2) {
                            V7 v7F = (V7) ((InterfaceC0338s8) unsafe4.getObject(obj5, j3));
                            if (!v7F.e()) {
                                L8 l10 = (L8) v7F;
                                int size2 = l10.size();
                                v7F = l10.f(size2 == 0 ? 10 : size2 + size2);
                                unsafe4.putObject(obj5, j3, v7F);
                            }
                            i37 = B.f(C(i71), i70 == true ? 1 : 0, bArr, i69, i4, v7F, x7);
                            bArr4 = bArr;
                            i4 = i4;
                            g10 = this;
                            i39 = i71;
                            i40 = i6;
                            i42 = i70 == true ? 1 : 0;
                            i38 = i44;
                            unsafe3 = unsafe4;
                            i5 = i5;
                            x10 = x7;
                            i36 = 3;
                        } else {
                            unsafe = unsafe4;
                            x8 = x7;
                            i27 = i69;
                            obj3 = obj5;
                            objArr = objArr;
                            i28 = i70 == true ? 1 : 0;
                        }
                        i7 = i5;
                        i12 = i27;
                        i11 = i71;
                        i10 = i44;
                        i9 = i28;
                    }
                }
                if (i9 != i7 || i7 == 0) {
                    if (this.f2798f) {
                        C0209f8 c0209f8 = C0209f8.f3066b;
                        K8 k8 = K8.f2835c;
                        C0209f8 c0209f9 = C0209f8.f3066b;
                        C0209f8 c0209f10 = x8.f2954d;
                        if (c0209f10 != c0209f9) {
                            C0289n8 c0289n8A = c0209f10.a(this.e, i10);
                            if (c0289n8A == null) {
                                obj4 = obj3;
                                i37 = B.i((i9 == true ? 1 : 0) == true ? 1 : 0, bArr, i12, i4, u(obj), x7);
                                i10 = i10;
                                i13 = i9 == true ? 1 : 0;
                            } else {
                                obj4 = obj3;
                                AbstractC0269l8 abstractC0269l8 = (AbstractC0269l8) obj4;
                                abstractC0269l8.o();
                                Object[] objArr2 = i9 == true ? 1 : 0;
                                i13 = i9 == true ? 1 : 0;
                                i14 = B.b(objArr2 == true ? 1 : 0, bArr, i12, i4, abstractC0269l8, c0289n8A, x7);
                            }
                        } else {
                            obj4 = obj3;
                            i13 = i9 == true ? 1 : 0;
                            i14 = B.i(i13 == true ? 1 : 0, bArr, i12, i4, u(obj), x7);
                        }
                        i37 = i14;
                    } else {
                        obj4 = obj3;
                        i13 = i9 == true ? 1 : 0;
                        i14 = B.i(i13 == true ? 1 : 0, bArr, i12, i4, u(obj), x7);
                        i37 = i14;
                    }
                    i4 = i4;
                    x10 = x7;
                    i5 = i7;
                    g10 = this;
                    obj5 = obj4;
                    i38 = i10;
                    i42 = i13;
                    i40 = i6;
                    i39 = i11;
                    unsafe3 = unsafe;
                    i36 = 3;
                    bArr4 = bArr;
                } else {
                    g8 = this;
                    obj2 = obj3;
                    i37 = i12;
                    i8 = i41;
                }
            } else {
                obj2 = obj5;
                objArr = objArr;
                unsafe = unsafe3;
                iArr = iArr2;
                i6 = i40;
                g8 = g10;
                i7 = i5;
                i8 = i41;
                i9 = i42;
            }
        }
        int i86 = i6;
        if (i86 != 1048575) {
            unsafe.putInt(obj2, i86, i8);
        }
        for (int i87 = g8.f2800h; i87 < g8.f2801i; i87++) {
            int i88 = g8.f2799g[i87];
            int i89 = iArr[i88];
            Object objI = Y8.i(g8.z(i88) & 1048575, obj2);
            if (objI != null && g8.B(i88) != null) {
                int i90 = i88 / 3;
                A0.c.o(objArr[i90 + i90]);
                throw null;
            }
        }
        if (i7 == 0) {
            if (i37 != i4) {
                throw new C0368v8("Failed to parse the message.");
            }
        } else if (i37 > i4 || i9 != i7) {
            throw new C0368v8("Failed to parse the message.");
        }
        return i37;
    }

    public final int x(int i3, int i4) {
        int[] iArr = this.f2794a;
        int length = (iArr.length / 3) - 1;
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

    public final int z(int i3) {
        return this.f2794a[i3 + 1];
    }
}
