package p046n2;

import B2.h;
import S1.q;
import S1.r;
import java.nio.ByteBuffer;
import java.util.List;
import p059r2.e;

/* JADX INFO: renamed from: n2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0770b extends r {
    public static final C0770b e = new C0770b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5440d;

    public /* synthetic */ C0770b(int i3) {
        this.f5440d = i3;
    }

    @Override // S1.r
    public Object f(byte b3, ByteBuffer byteBuffer) {
        switch (this.f5440d) {
            case 1:
                h.e(byteBuffer, "buffer");
                if (b3 == -127) {
                    Long l3 = (Long) e(byteBuffer);
                    if (l3 == null) {
                        return null;
                    }
                    int iLongValue = (int) l3.longValue();
                    L.e.getClass();
                    for (L l4 : L.values()) {
                        if (l4.f5436d == iLongValue) {
                            return l4;
                        }
                    }
                    return null;
                }
                if (b3 == -126) {
                    Object objE = e(byteBuffer);
                    List list = objE instanceof List ? (List) objE : null;
                    if (list == null) {
                        return null;
                    }
                    String str = (String) list.get(0);
                    Object obj = list.get(1);
                    h.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0776h(str, ((Boolean) obj).booleanValue());
                }
                if (b3 != -125) {
                    return super.f(b3, byteBuffer);
                }
                Object objE2 = e(byteBuffer);
                List list2 = objE2 instanceof List ? (List) objE2 : null;
                if (list2 == null) {
                    return null;
                }
                String str2 = (String) list2.get(0);
                Object obj2 = list2.get(1);
                h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                return new N(str2, (L) obj2);
            default:
                return super.f(b3, byteBuffer);
        }
    }

    @Override // S1.r
    public void k(q qVar, Object obj) {
        switch (this.f5440d) {
            case 1:
                if (obj instanceof L) {
                    qVar.write(129);
                    k(qVar, Integer.valueOf(((L) obj).f5436d));
                } else if (obj instanceof C0776h) {
                    qVar.write(130);
                    C0776h c0776h = (C0776h) obj;
                    k(qVar, e.b(c0776h.f5446a, Boolean.valueOf(c0776h.f5447b)));
                } else if (!(obj instanceof N)) {
                    super.k(qVar, obj);
                } else {
                    qVar.write(131);
                    N n3 = (N) obj;
                    k(qVar, e.b(n3.f5437a, n3.f5438b));
                }
                break;
            default:
                super.k(qVar, obj);
                break;
        }
    }
}
