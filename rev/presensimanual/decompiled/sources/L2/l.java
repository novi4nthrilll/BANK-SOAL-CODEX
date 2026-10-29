package L2;

import J.C0070p;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0449g3;
import p046n2.J;
import p046n2.K;

/* JADX INFO: loaded from: classes.dex */
public final class l implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f923d = 0;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f925g;

    public l(B2.m mVar, e eVar, C0070p c0070p) {
        this.e = mVar;
        this.f924f = eVar;
        this.f925g = c0070p;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // L2.e
    public final Object c(Object obj, p063s2.d dVar) {
        k kVar;
        l lVar;
        p046n2.q qVar;
        switch (this.f923d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (dVar instanceof k) {
                    kVar = (k) dVar;
                    int i3 = kVar.f922k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kVar.f922k = i3 - Integer.MIN_VALUE;
                    } else {
                        kVar = new k(this, dVar);
                    }
                } else {
                    kVar = new k(this, dVar);
                }
                Object objH = kVar.f920i;
                t2.a aVar = t2.a.f5737d;
                int i4 = kVar.f922k;
                p055q2.g gVar = p055q2.g.f5603a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            obj = kVar.f919h;
                            lVar = kVar.f918g;
                            AbstractC0449g3.b(objH);
                            if (!((Boolean) objH).booleanValue()) {
                                ((B2.m) lVar.e).f125d = true;
                                kVar.f918g = null;
                                kVar.f919h = null;
                                kVar.f922k = 3;
                                if (((e) lVar.f924f).c(obj, kVar) == aVar) {
                                    return aVar;
                                }
                            }
                        } else if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    AbstractC0449g3.b(objH);
                } else {
                    AbstractC0449g3.b(objH);
                    if (((B2.m) this.e).f125d) {
                        kVar.f922k = 1;
                        if (((e) this.f924f).c(obj, kVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        kVar.f918g = this;
                        kVar.f919h = obj;
                        kVar.f922k = 2;
                        objH = ((C0070p) this.f925g).h(obj, kVar);
                        if (objH == aVar) {
                            return aVar;
                        }
                        lVar = this;
                        if (!((Boolean) objH).booleanValue()) {
                            ((B2.m) lVar.e).f125d = true;
                            kVar.f918g = null;
                            kVar.f919h = null;
                            kVar.f922k = 3;
                            if (((e) lVar.f924f).c(obj, kVar) == aVar) {
                                return aVar;
                            }
                        }
                    }
                }
                return gVar;
            case 1:
                Object objB = M2.l.b((p063s2.i) this.e, obj, this.f924f, (M2.t) this.f925g, dVar);
                return objB == t2.a.f5737d ? objB : p055q2.g.f5603a;
            default:
                if (dVar instanceof p046n2.q) {
                    qVar = (p046n2.q) dVar;
                    int i5 = qVar.f5472h;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qVar.f5472h = i5 - Integer.MIN_VALUE;
                    } else {
                        qVar = new p046n2.q(this, dVar);
                    }
                } else {
                    qVar = new p046n2.q(this, dVar);
                }
                Object obj2 = qVar.f5471g;
                t2.a aVar2 = t2.a.f5737d;
                int i6 = qVar.f5472h;
                if (i6 == 0) {
                    AbstractC0449g3.b(obj2);
                    Double d3 = (Double) K.c(((N.b) obj).c((N.e) this.e), ((J) this.f925g).f5429f);
                    qVar.f5472h = 1;
                    if (((e) this.f924f).c(d3, qVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj2);
                }
                return p055q2.g.f5603a;
        }
    }

    public l(e eVar, N.e eVar2, J j3) {
        this.f924f = eVar;
        this.e = eVar2;
        this.f925g = j3;
    }

    public l(e eVar, p063s2.i iVar) {
        this.e = iVar;
        this.f924f = N2.a.l(iVar);
        this.f925g = new M2.t(eVar, null);
    }
}
