package p013d1;

/* JADX INFO: renamed from: d1.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0555y2 {
    public static void a(int i3, int i4) {
        String strA;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                strA = AbstractC0561z2.a("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15);
                    sb.append("negative size: ");
                    sb.append(i4);
                    throw new IllegalArgumentException(sb.toString());
                }
                strA = AbstractC0561z2.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
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
                strC = (i4 < 0 || i4 > i5) ? c("end index", i4, i5) : AbstractC0561z2.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static String c(String str, int i3, int i4) {
        if (i3 < 0) {
            return AbstractC0561z2.a("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return AbstractC0561z2.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 15);
        sb.append("negative size: ");
        sb.append(i4);
        throw new IllegalArgumentException(sb.toString());
    }
}
