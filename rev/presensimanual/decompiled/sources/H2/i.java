package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends h {
    public static final int a(CharSequence charSequence) {
        B2.h.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int b(int i3, String str, String str2, boolean z2) {
        char upperCase;
        char upperCase2;
        B2.h.e(str2, "string");
        if (!z2) {
            return str.indexOf(str2, i3);
        }
        int length = str.length();
        if (i3 < 0) {
            i3 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        E2.c cVar = new E2.c(i3, length, 1);
        boolean z3 = str instanceof String;
        int i4 = cVar.f243f;
        int i5 = cVar.e;
        int i6 = cVar.f242d;
        if (z3 && (str2 instanceof String)) {
            if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
                while (!f(0, i6, str2.length(), str2, str, z2)) {
                    if (i6 != i5) {
                        i6 += i4;
                    }
                }
                return i6;
            }
            return -1;
        }
        if ((i4 > 0 && i6 <= i5) || (i4 < 0 && i5 <= i6)) {
            loop1: while (true) {
                int length3 = str2.length();
                B2.h.e(str, "other");
                if (i6 >= 0 && str2.length() - length3 >= 0 && i6 <= str.length() - length3) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length3) {
                            break loop1;
                        }
                        char cCharAt = str2.charAt(i7);
                        char cCharAt2 = str.charAt(i6 + i7);
                        if (cCharAt != cCharAt2 && (!z2 || ((upperCase = Character.toUpperCase(cCharAt)) != (upperCase2 = Character.toUpperCase(cCharAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                            break;
                        }
                        i7++;
                    }
                }
                if (i6 != i5) {
                    i6 += i4;
                }
            }
            return i6;
        }
        return -1;
    }

    public static /* synthetic */ int c(int i3, String str, String str2, boolean z2) {
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        return b(0, str, str2, z2);
    }

    public static int d(String str, char c3, boolean z2, int i3) {
        char upperCase;
        char upperCase2;
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        if (!z2) {
            return str.indexOf(c3, 0);
        }
        char[] cArr = {c3};
        if (!z2) {
            return str.indexOf(cArr[0], 0);
        }
        int iA = a(str);
        if (iA >= 0) {
            int i4 = 0;
            while (true) {
                char cCharAt = str.charAt(i4);
                char c4 = cArr[0];
                if (c4 == cCharAt || (z2 && ((upperCase = Character.toUpperCase(c4)) == (upperCase2 = Character.toUpperCase(cCharAt)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                    break;
                }
                if (i4 != iA) {
                    i4++;
                }
            }
            return i4;
        }
        return -1;
    }

    public static boolean e(CharSequence charSequence) {
        B2.h.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            char cCharAt = charSequence.charAt(i3);
            if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean f(int i3, int i4, int i5, String str, String str2, boolean z2) {
        B2.h.e(str, "<this>");
        B2.h.e(str2, "other");
        return !z2 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z2, i3, str2, i4, i5);
    }

    public static String g(String str, String str2, String str3) {
        int iB = b(0, str, str2, false);
        if (iB < 0) {
            return str;
        }
        int length = str2.length();
        int i3 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i4 = 0;
        do {
            sb.append((CharSequence) str, i4, iB);
            sb.append(str3);
            i4 = iB + length;
            if (iB >= str.length()) {
                break;
            }
            iB = b(iB + i3, str, str2, false);
        } while (iB > 0);
        sb.append((CharSequence) str, i4, str.length());
        String string = sb.toString();
        B2.h.d(string, "toString(...)");
        return string;
    }

    public static boolean h(String str, String str2) {
        B2.h.e(str, "<this>");
        B2.h.e(str2, "prefix");
        return str.startsWith(str2);
    }

    public static String i(String str, String str2) {
        B2.h.e(str2, "delimiter");
        int iC = c(6, str, str2, false);
        if (iC == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iC, str.length());
        B2.h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String j(String str, String str2) {
        B2.h.e(str2, "missingDelimiterValue");
        int iLastIndexOf = str.lastIndexOf(46, a(str));
        if (iLastIndexOf == -1) {
            return str2;
        }
        String strSubstring = str.substring(iLastIndexOf + 1, str.length());
        B2.h.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}
