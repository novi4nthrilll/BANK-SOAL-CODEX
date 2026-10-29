package p013d1;

import java.util.ArrayList;
import p064t.f;

/* JADX INFO: renamed from: d1.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0491n3 {
    public static boolean a(f[] fVarArr, f[] fVarArr2) {
        if (fVarArr == null || fVarArr2 == null || fVarArr.length != fVarArr2.length) {
            return false;
        }
        for (int i3 = 0; i3 < fVarArr.length; i3++) {
            f fVar = fVarArr[i3];
            char c3 = fVar.f5677a;
            f fVar2 = fVarArr2[i3];
            if (c3 != fVar2.f5677a || fVar.f5678b.length != fVar2.f5678b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] b(float[] fArr, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i3, length);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3 A[Catch: NumberFormatException -> 0x00ac, TryCatch #0 {NumberFormatException -> 0x00ac, blocks: (B:22:0x0056, B:25:0x006a, B:27:0x0070, B:31:0x007c, B:44:0x0098, B:46:0x009e, B:52:0x00b3, B:53:0x00b6), top: B:68:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e4 A[SYNTHETIC] */
    public static f[] c(String str) {
        int i3;
        String strTrim;
        float[] fArrB;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int i5 = 1;
        int i6 = 0;
        while (i5 < str.length()) {
            while (i5 < str.length()) {
                char cCharAt = str.charAt(i5);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i6, i5).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i4) != 'z' || strTrim.charAt(i4) == 'Z') {
                                fArrB = new float[i4];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i7 = 1;
                                    int i8 = 0;
                                    while (i7 < length) {
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        boolean z5 = false;
                                        for (int i9 = i7; i9 < strTrim.length(); i9++) {
                                            char cCharAt2 = strTrim.charAt(i9);
                                            if (cCharAt2 == ' ') {
                                                z2 = false;
                                                z4 = true;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        z2 = false;
                                                        z4 = true;
                                                        break;
                                                    case '-':
                                                        if (i9 == i7 || z2) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (z3) {
                                                            z2 = false;
                                                            z4 = true;
                                                            z5 = true;
                                                        } else {
                                                            z2 = false;
                                                            z3 = true;
                                                        }
                                                        break;
                                                    default:
                                                        z2 = false;
                                                        break;
                                                }
                                            } else {
                                                z2 = true;
                                            }
                                            if (z4) {
                                                if (i7 < i9) {
                                                    fArr[i8] = Float.parseFloat(strTrim.substring(i7, i9));
                                                    i8++;
                                                }
                                                if (z5) {
                                                    i7 = i9;
                                                } else {
                                                    i7 = i9 + 1;
                                                }
                                            }
                                        }
                                        if (i7 < i9) {
                                            fArr[i8] = Float.parseFloat(strTrim.substring(i7, i9));
                                            i8++;
                                        }
                                        if (z5) {
                                            i7 = i9;
                                        } else {
                                            i7 = i9 + 1;
                                        }
                                    }
                                    fArrB = b(fArr, i8);
                                    i4 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException("error in parsing \"" + strTrim + "\"", e);
                                }
                            }
                            arrayList.add(new f(strTrim.charAt(i4), fArrB));
                        }
                        i6 = i5;
                        i5++;
                        i4 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i5++;
            }
            strTrim = str.substring(i6, i5).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i4) != 'z') {
                    fArrB = new float[i4];
                } else {
                    fArrB = new float[i4];
                }
                arrayList.add(new f(strTrim.charAt(i4), fArrB));
            }
            i6 = i5;
            i5++;
            i4 = 0;
        }
        if (i5 - i6 != 1 || i6 >= str.length()) {
            i3 = 0;
        } else {
            i3 = 0;
            arrayList.add(new f(str.charAt(i6), new float[0]));
        }
        return (f[]) arrayList.toArray(new f[i3]);
    }

    public static f[] d(f[] fVarArr) {
        f[] fVarArr2 = new f[fVarArr.length];
        for (int i3 = 0; i3 < fVarArr.length; i3++) {
            fVarArr2[i3] = new f(fVarArr[i3]);
        }
        return fVarArr2;
    }
}
