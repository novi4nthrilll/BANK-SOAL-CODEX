package S2;

import A2.p;
import B2.i;
import B2.m;
import B2.o;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements p {
    public final /* synthetic */ m e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f1613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f1614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ R2.p f1615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f1616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f1617j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, long j3, o oVar, R2.p pVar, o oVar2, o oVar3) {
        super(2);
        this.e = mVar;
        this.f1613f = j3;
        this.f1614g = oVar;
        this.f1615h = pVar;
        this.f1616i = oVar2;
        this.f1617j = oVar3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            m mVar = this.e;
            if (mVar.f125d) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            mVar.f125d = true;
            if (jLongValue < this.f1613f) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            o oVar = this.f1614g;
            long jB = oVar.f127d;
            R2.p pVar = this.f1615h;
            if (jB == 4294967295L) {
                jB = pVar.b();
            }
            oVar.f127d = jB;
            o oVar2 = this.f1616i;
            oVar2.f127d = oVar2.f127d == 4294967295L ? pVar.b() : 0L;
            o oVar3 = this.f1617j;
            oVar3.f127d = oVar3.f127d == 4294967295L ? pVar.b() : 0L;
        }
        return p055q2.g.f5603a;
    }
}
