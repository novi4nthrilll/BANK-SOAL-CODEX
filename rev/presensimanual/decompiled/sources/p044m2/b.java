package p044m2;

import S1.q;
import S1.r;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5348d = new b();

    @Override // S1.r
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        if (b3 != -127) {
            return super.f(b3, byteBuffer);
        }
        Object objE = e(byteBuffer);
        if (objE == null) {
            return null;
        }
        return c.values()[((Long) objE).intValue()];
    }

    @Override // S1.r
    public final void k(q qVar, Object obj) {
        if (!(obj instanceof c)) {
            super.k(qVar, obj);
        } else {
            qVar.write(129);
            k(qVar, obj == null ? null : Integer.valueOf(((c) obj).f5349d));
        }
    }
}
