package o2;

import android.os.Trace;
import p013d1.AbstractC0549x2;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void b(String str) {
        Trace.beginSection(AbstractC0549x2.b(a(str)));
    }
}
