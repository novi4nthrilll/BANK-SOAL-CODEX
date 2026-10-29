package p065t0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5723d;

    public h(int i3, long j3, long j4, boolean z2) {
        this.f5720a = i3;
        this.f5721b = j3;
        this.f5722c = j4;
        this.f5723d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    public static h a(Map map) {
        int i3;
        if (map == null) {
            return new h(5, 0L, 5000L, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        if (num == null) {
            i3 = 5;
        } else {
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                i3 = 1;
            } else if (iIntValue != 1) {
                i3 = 3;
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        i3 = 4;
                    } else if (iIntValue != 5) {
                        i3 = 5;
                    } else {
                        i3 = 6;
                    }
                }
            } else {
                i3 = 2;
            }
        }
        return new h(i3, num2 != null ? num2.intValue() : 0L, num3 != null ? num3.intValue() : 5000L, bool != null && bool.booleanValue());
    }
}
