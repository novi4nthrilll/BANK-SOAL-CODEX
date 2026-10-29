package S2;

import A2.p;
import B2.i;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements p {
    public final /* synthetic */ R2.p e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B2.p f1618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B2.p f1619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B2.p f1620h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(R2.p pVar, B2.p pVar2, B2.p pVar3, B2.p pVar4) {
        super(2);
        this.e = pVar;
        this.f1618f = pVar2;
        this.f1619g = pVar3;
        this.f1620h = pVar4;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 21589) {
            if (jLongValue < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            R2.p pVar = this.e;
            pVar.f(1L);
            byte bD = pVar.e.d();
            boolean z2 = (bD & 1) == 1;
            boolean z3 = (bD & 2) == 2;
            boolean z4 = (bD & 4) == 4;
            long j3 = z2 ? 5L : 1L;
            if (z3) {
                j3 += 4;
            }
            if (z4) {
                j3 += 4;
            }
            if (jLongValue < j3) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z2) {
                this.f1618f.f128d = Long.valueOf(((long) pVar.a()) * 1000);
            }
            if (z3) {
                this.f1619g.f128d = Long.valueOf(((long) pVar.a()) * 1000);
            }
            if (z4) {
                this.f1620h.f128d = Long.valueOf(((long) pVar.a()) * 1000);
            }
        }
        return p055q2.g.f5603a;
    }
}
