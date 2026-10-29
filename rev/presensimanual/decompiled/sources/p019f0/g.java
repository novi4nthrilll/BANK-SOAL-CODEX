package p019f0;

import A2.l;
import B2.h;
import H2.i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static String b(Object obj, String str) {
        h.e(obj, "value");
        return str + " value: " + obj;
    }

    public static i c(String str) {
        String strGroup;
        if (str != null && !i.e(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (strGroup = matcher.group(1)) != null) {
                int i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                if (strGroup2 != null) {
                    int i4 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    if (strGroup3 != null) {
                        int i5 = Integer.parseInt(strGroup3);
                        String strGroup4 = matcher.group(4) != null ? matcher.group(4) : "";
                        h.d(strGroup4, "description");
                        return new i(i3, i4, i5, strGroup4);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract g d(String str, l lVar);
}
