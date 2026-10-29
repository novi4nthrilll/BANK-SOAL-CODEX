package p013d1;

import B2.h;
import H2.a;
import R2.b;

/* JADX INFO: renamed from: d1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0546x {
    public static b a(String str) {
        byte[] bytes = str.getBytes(a.f330a);
        h.d(bytes, "this as java.lang.String).getBytes(charset)");
        b bVar = new b(bytes);
        bVar.f1514f = str;
        return bVar;
    }
}
