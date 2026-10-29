package J;

import B.C0006g;
import I2.AbstractC0052x;
import I2.C0041l;
import I2.InterfaceC0050v;
import java.util.concurrent.atomic.AtomicInteger;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class J extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.f f555k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(P p3, A2.p pVar, p063s2.d dVar) {
        super(2, dVar);
        this.f554j = p3;
        this.f555k = (u2.f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [A2.p, u2.f] */
    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        J j3 = new J(this.f554j, this.f555k, dVar);
        j3.f553i = obj;
        return j3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((J) b((InterfaceC0050v) obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [A2.p, u2.f] */
    @Override // u2.b
    public final Object j(Object obj) throws Throwable {
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f552h;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            InterfaceC0050v interfaceC0050v = (InterfaceC0050v) this.f553i;
            C0041l c0041l = new C0041l(true);
            c0041l.H(null);
            P p3 = this.f554j;
            S s3 = new S(this.f555k, c0041l, p3.f577k.h(), interfaceC0050v.j());
            E0.n nVar = p3.f581o;
            Object objI = ((K2.b) nVar.f237f).i(s3);
            if (objI instanceof K2.g) {
                K2.g gVar = objI instanceof K2.g ? (K2.g) objI : null;
                Throwable th = gVar != null ? gVar.f810a : null;
                if (th == null) {
                    throw new K2.l("Channel was closed normally");
                }
                throw th;
            }
            if (objI instanceof K2.h) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((C0006g) nVar.f238g).e).getAndIncrement() == 0) {
                AbstractC0052x.g((InterfaceC0050v) nVar.f236d, new V(nVar, null));
            }
            this.f552h = 1;
            obj = c0041l.U(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0449g3.b(obj);
        }
        return obj;
    }
}
