package p013d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class B2 {
    public static void a(int i3, int i4) {
        String strA;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                strA = C2.a("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(I.f("negative size: ", i4));
                }
                strA = C2.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void b(int i3, int i4) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(d("index", i3, i4));
        }
    }

    public static void c(int i3, int i4, int i5) {
        String strD;
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            if (i3 < 0 || i3 > i5) {
                strD = d("start index", i3, i5);
            } else {
                strD = (i4 < 0 || i4 > i5) ? d("end index", i4, i5) : C2.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static String d(String str, int i3, int i4) {
        if (i3 < 0) {
            return C2.a("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return C2.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(I.f("negative size: ", i4));
    }
}
