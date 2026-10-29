package J;

import I2.AbstractC0052x;
import java.io.Serializable;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class G extends u2.f implements A2.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f541h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f542i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ P f543j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f544k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Serializable f546m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(B2.p pVar, P p3, B2.n nVar, p063s2.d dVar) {
        super(1, dVar);
        this.f545l = pVar;
        this.f543j = p3;
        this.f546m = nVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [A2.p, u2.f] */
    @Override // A2.l
    public final Object i(Object obj) {
        p063s2.d dVar = (p063s2.d) obj;
        switch (this.f541h) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new G((B2.p) this.f545l, this.f543j, (B2.n) this.f546m, dVar).j(p055q2.g.f5603a);
            default:
                return new G(this.f543j, (p063s2.i) this.f545l, (A2.p) this.f546m, dVar).j(p055q2.g.f5603a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [A2.p, u2.f] */
    @Override // u2.b
    public final Object j(Object obj) throws Throwable {
        B2.p pVar;
        B2.n nVar;
        C0057c c0057c;
        Object obj2;
        int iHashCode;
        switch (this.f541h) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                t2.a aVar = t2.a.f5737d;
                int i3 = this.f542i;
                B2.n nVar2 = (B2.n) this.f546m;
                B2.p pVar2 = (B2.p) this.f545l;
                P p3 = this.f543j;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            pVar = (B2.p) ((Serializable) this.f544k);
                            AbstractC0449g3.b(obj);
                        } else {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                nVar2 = (B2.n) ((Serializable) this.f544k);
                                AbstractC0449g3.b(obj);
                                nVar2.f126d = ((Number) obj).intValue();
                                return p055q2.g.f5603a;
                            }
                            nVar = (B2.n) ((Serializable) this.f544k);
                            AbstractC0449g3.b(obj);
                        }
                        nVar.f126d = ((Number) obj).intValue();
                        return p055q2.g.f5603a;
                    }
                    AbstractC0449g3.b(obj);
                    this.f544k = pVar2;
                    this.f542i = 1;
                    obj = p3.j(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                    pVar.f128d = obj;
                    Z zH = p3.h();
                    this.f544k = nVar2;
                    this.f542i = 2;
                    obj = zH.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                    nVar = nVar2;
                    nVar.f126d = ((Number) obj).intValue();
                    return p055q2.g.f5603a;
                } catch (C0056b unused) {
                    Object obj3 = pVar2.f128d;
                    this.f544k = nVar2;
                    this.f542i = 3;
                    obj = p3.k(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            default:
                t2.a aVar2 = t2.a.f5737d;
                int i4 = this.f542i;
                P p4 = this.f543j;
                if (i4 != 0) {
                    if (i4 == 1) {
                        AbstractC0449g3.b(obj);
                    } else {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f544k;
                            AbstractC0449g3.b(obj);
                            return obj4;
                        }
                        c0057c = (C0057c) this.f544k;
                        AbstractC0449g3.b(obj);
                    }
                    obj2 = c0057c.f611b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == c0057c.f612c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!B2.h.a(c0057c.f611b, obj)) {
                        this.f544k = obj;
                        this.f542i = 3;
                        if (p4.k(obj, true, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return obj;
                }
                AbstractC0449g3.b(obj);
                this.f542i = 1;
                obj = P.g(p4, true, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                c0057c = (C0057c) obj;
                I i5 = new I((u2.f) this.f546m, c0057c, null);
                this.f544k = c0057c;
                this.f542i = 2;
                obj = AbstractC0052x.n((p063s2.i) this.f545l, i5, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0057c.f611b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == c0057c.f612c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!B2.h.a(c0057c.f611b, obj)) {
                    this.f544k = obj;
                    this.f542i = 3;
                    if (p4.k(obj, true, this) == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(P p3, p063s2.i iVar, A2.p pVar, p063s2.d dVar) {
        super(1, dVar);
        this.f543j = p3;
        this.f545l = iVar;
        this.f546m = (u2.f) pVar;
    }
}
