package A;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f5b = new char[24];

    public static void a(long j3, String str) {
        if (j3 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too low)"));
        }
        if (j3 <= Long.MAX_VALUE) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str.concat(" is out of range of [0, 9223372036854775807] (too high)"));
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void c(long j3, StringBuilder sb) {
        synchronized (f4a) {
            sb.append(f5b, 0, d(j3));
        }
    }

    public static int d(long j3) {
        char c3;
        int i3;
        int i4;
        int i5;
        int i6;
        if (f5b.length < 0) {
            f5b = new char[0];
        }
        char[] cArr = f5b;
        if (j3 == 0) {
            cArr[0] = '0';
            return 1;
        }
        if (j3 > 0) {
            c3 = '+';
        } else {
            j3 = -j3;
            c3 = '-';
        }
        int i7 = (int) (j3 % 1000);
        int iFloor = (int) Math.floor(j3 / 1000);
        if (iFloor > 86400) {
            i3 = iFloor / 86400;
            iFloor -= 86400 * i3;
        } else {
            i3 = 0;
        }
        if (iFloor > 3600) {
            i4 = iFloor / 3600;
            iFloor -= i4 * 3600;
        } else {
            i4 = 0;
        }
        if (iFloor > 60) {
            int i8 = iFloor / 60;
            i5 = iFloor - (i8 * 60);
            i6 = i8;
        } else {
            i5 = iFloor;
            i6 = 0;
        }
        cArr[0] = c3;
        int iE = e(cArr, i3, 'd', 1, false, 0);
        int iE2 = e(cArr, i4, 'h', iE, iE != 1, 0);
        int iE3 = e(cArr, i6, 'm', iE2, iE2 != 1, 0);
        int iE4 = e(cArr, i7, 'm', e(cArr, i5, 's', iE3, iE3 != 1, 0), true, 0);
        cArr[iE4] = 's';
        return iE4 + 1;
    }

    public static int e(char[] cArr, int i3, char c3, int i4, boolean z2, int i5) {
        int i6;
        if (!z2 && i3 <= 0) {
            return i4;
        }
        if ((!z2 || i5 < 3) && i3 <= 99) {
            i6 = i4;
        } else {
            int i7 = i3 / 100;
            cArr[i4] = (char) (i7 + 48);
            i6 = i4 + 1;
            i3 -= i7 * 100;
        }
        if ((z2 && i5 >= 2) || i3 > 9 || i4 != i6) {
            int i8 = i3 / 10;
            cArr[i6] = (char) (i8 + 48);
            i6++;
            i3 -= i8 * 10;
        }
        cArr[i6] = (char) (i3 + 48);
        cArr[i6 + 1] = c3;
        return i6 + 2;
    }
}
