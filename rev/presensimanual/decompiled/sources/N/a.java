package N;

import A2.l;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a extends B2.i implements l {
    public static final a e = new a(1);

    @Override // A2.l
    public final Object i(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        B2.h.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            B2.h.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i3 = 0;
            for (byte b3 : bArr) {
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b3));
            }
            sb.append((CharSequence) "]");
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((e) entry.getKey()).f1032a + " = " + strValueOf;
    }
}
