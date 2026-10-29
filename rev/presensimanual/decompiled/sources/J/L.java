package J;

import I2.C0043n;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class L extends B2.i implements A2.p {
    public static final L e = new L(2);

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        S s3 = (S) obj;
        Throwable cancellationException = (Throwable) obj2;
        B2.h.e(s3, "msg");
        if (cancellationException == null) {
            cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        s3.f584b.K(new C0043n(cancellationException, false));
        return p055q2.g.f5603a;
    }
}
