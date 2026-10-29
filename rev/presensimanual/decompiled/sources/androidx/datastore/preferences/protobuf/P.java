package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class P {
    public static int a(int i3, Object obj, Object obj2) {
        O o3 = (O) obj;
        N n3 = (N) obj2;
        int iZ = 0;
        if (!o3.isEmpty()) {
            for (Map.Entry entry : o3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                n3.getClass();
                int iX = C0132n.x(i3);
                int iA = N.a(n3.f2239a, key, value);
                iZ += C0132n.z(iA) + iA + iX;
            }
        }
        return iZ;
    }

    public static O b(Object obj, Object obj2) {
        O oB = (O) obj;
        O o3 = (O) obj2;
        if (!o3.isEmpty()) {
            if (!oB.f2240d) {
                oB = oB.b();
            }
            oB.a();
            if (!o3.isEmpty()) {
                oB.putAll(o3);
            }
        }
        return oB;
    }

    public static void c(Object obj) {
        ((O) obj).f2240d = false;
    }
}
