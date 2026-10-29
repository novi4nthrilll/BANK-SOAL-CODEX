package R1;

import S1.s;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f1484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E0.n f1485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f1486d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1487f;

    public j(K1.b bVar, boolean z2) {
        E0.n nVar = new E0.n(bVar, "flutter/restoration", s.f1597a, null, false);
        this.e = false;
        this.f1487f = false;
        A0.f fVar = new A0.f(20, this);
        this.f1485c = nVar;
        this.f1483a = z2;
        nVar.f(fVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap map = new HashMap();
        map.put("enabled", Boolean.TRUE);
        map.put("data", bArr);
        return map;
    }
}
