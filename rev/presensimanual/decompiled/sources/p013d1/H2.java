package p013d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class H2 {
    public static void a(int i3, int i4) {
        String strA;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                strA = I2.a("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(I.f("negative size: ", i4));
                }
                strA = I2.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static void b(int i3, int i4, int i5) {
        String strC;
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            if (i3 < 0 || i3 > i5) {
                strC = c("start index", i3, i5);
            } else {
                strC = (i4 < 0 || i4 > i5) ? c("end index", i4, i5) : I2.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static String c(String str, int i3, int i4) {
        if (i3 < 0) {
            return I2.a("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return I2.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(I.f("negative size: ", i4));
    }
}
