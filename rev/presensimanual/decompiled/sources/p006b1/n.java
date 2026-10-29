package p006b1;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f2544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final StringBuilder f2545b;

    static {
        Locale locale = Locale.ROOT;
        f2544a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f2545b = new StringBuilder(33);
    }

    public static void a(long j3, StringBuilder sb) {
        if (j3 == 0) {
            sb.append("0s");
            return;
        }
        sb.ensureCapacity(sb.length() + 27);
        boolean z2 = false;
        if (j3 < 0) {
            sb.append("-");
            if (j3 != Long.MIN_VALUE) {
                j3 = -j3;
            } else {
                j3 = Long.MAX_VALUE;
                z2 = true;
            }
        }
        if (j3 >= 86400000) {
            sb.append(j3 / 86400000);
            sb.append("d");
            j3 %= 86400000;
        }
        if (true == z2) {
            j3 = 25975808;
        }
        if (j3 >= 3600000) {
            sb.append(j3 / 3600000);
            sb.append("h");
            j3 %= 3600000;
        }
        if (j3 >= 60000) {
            sb.append(j3 / 60000);
            sb.append("m");
            j3 %= 60000;
        }
        if (j3 >= 1000) {
            sb.append(j3 / 1000);
            sb.append("s");
            j3 %= 1000;
        }
        if (j3 > 0) {
            sb.append(j3);
            sb.append("ms");
        }
    }
}
