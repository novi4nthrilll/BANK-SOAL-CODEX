package p046n2;

import J.C0069o;
import L2.e;
import L2.n;
import M.k;
import N.b;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.AbstractC0449g3;
import p055q2.g;
import p063s2.d;
import t2.a;

/* JADX INFO: renamed from: n2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0782n implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5462d;
    public final /* synthetic */ e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5463f;

    public /* synthetic */ C0782n(e eVar, N.e eVar2, int i3) {
        this.f5462d = i3;
        this.e = eVar;
        this.f5463f = eVar2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:89:0x0171  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // L2.e
    public final Object c(Object obj, d dVar) {
        C0781m c0781m;
        s sVar;
        w wVar;
        y yVar;
        n nVar;
        Object obj2;
        Object obj3;
        C0782n c0782n;
        switch (this.f5462d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (dVar instanceof C0781m) {
                    c0781m = (C0781m) dVar;
                    int i3 = c0781m.f5460h;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0781m.f5460h = i3 - Integer.MIN_VALUE;
                    } else {
                        c0781m = new C0781m(this, dVar);
                    }
                } else {
                    c0781m = new C0781m(this, dVar);
                }
                Object obj4 = c0781m.f5459g;
                a aVar = a.f5737d;
                int i4 = c0781m.f5460h;
                if (i4 == 0) {
                    AbstractC0449g3.b(obj4);
                    Object objC = ((b) obj).c((N.e) this.f5463f);
                    c0781m.f5460h = 1;
                    if (this.e.c(objC, c0781m) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj4);
                }
                return g.f5603a;
            case 1:
                if (dVar instanceof s) {
                    sVar = (s) dVar;
                    int i5 = sVar.f5480h;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sVar.f5480h = i5 - Integer.MIN_VALUE;
                    } else {
                        sVar = new s(this, dVar);
                    }
                } else {
                    sVar = new s(this, dVar);
                }
                Object obj5 = sVar.f5479g;
                a aVar2 = a.f5737d;
                int i6 = sVar.f5480h;
                if (i6 == 0) {
                    AbstractC0449g3.b(obj5);
                    Object objC2 = ((b) obj).c((N.e) this.f5463f);
                    sVar.f5480h = 1;
                    if (this.e.c(objC2, sVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj5);
                }
                return g.f5603a;
            case 2:
                if (dVar instanceof w) {
                    wVar = (w) dVar;
                    int i7 = wVar.f5499h;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        wVar.f5499h = i7 - Integer.MIN_VALUE;
                    } else {
                        wVar = new w(this, dVar);
                    }
                } else {
                    wVar = new w(this, dVar);
                }
                Object obj6 = wVar.f5498g;
                a aVar3 = a.f5737d;
                int i8 = wVar.f5499h;
                if (i8 == 0) {
                    AbstractC0449g3.b(obj6);
                    Object objC3 = ((b) obj).c((N.e) this.f5463f);
                    wVar.f5499h = 1;
                    if (this.e.c(objC3, wVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj6);
                }
                return g.f5603a;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                if (dVar instanceof y) {
                    yVar = (y) dVar;
                    int i9 = yVar.f5507h;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        yVar.f5507h = i9 - Integer.MIN_VALUE;
                    } else {
                        yVar = new y(this, dVar);
                    }
                } else {
                    yVar = new y(this, dVar);
                }
                Object obj7 = yVar.f5506g;
                a aVar4 = a.f5737d;
                int i10 = yVar.f5507h;
                if (i10 == 0) {
                    AbstractC0449g3.b(obj7);
                    Object objC4 = ((b) obj).c((N.e) this.f5463f);
                    yVar.f5507h = 1;
                    if (this.e.c(objC4, yVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0449g3.b(obj7);
                }
                return g.f5603a;
            default:
                if (dVar instanceof n) {
                    nVar = (n) dVar;
                    int i11 = nVar.f932i;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nVar.f932i = i11 - Integer.MIN_VALUE;
                    } else {
                        nVar = new n(this, dVar);
                    }
                } else {
                    nVar = new n(this, dVar);
                }
                Object obj8 = nVar.f931h;
                a aVar5 = a.f5737d;
                int i12 = nVar.f932i;
                boolean z2 = true;
                if (i12 != 0) {
                    if (i12 == 1) {
                        Object obj9 = nVar.f934k;
                        C0782n c0782n2 = nVar.f930g;
                        AbstractC0449g3.b(obj8);
                        obj3 = obj9;
                        c0782n = c0782n2;
                        obj2 = obj8;
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0782n = nVar.f930g;
                        AbstractC0449g3.b(obj8);
                    }
                    if (z2) {
                        return g.f5603a;
                    }
                    throw new M2.a(c0782n);
                }
                AbstractC0449g3.b(obj8);
                nVar.f930g = this;
                nVar.f934k = obj;
                nVar.f932i = 1;
                Object objH = ((C0069o) this.f5463f).h(obj, nVar);
                if (objH == aVar5) {
                    return aVar5;
                }
                obj2 = objH;
                obj3 = obj;
                c0782n = this;
                if (((Boolean) obj2).booleanValue()) {
                    e eVar = c0782n.e;
                    nVar.f930g = c0782n;
                    nVar.f934k = null;
                    nVar.f932i = 2;
                    if (eVar.c(obj3, nVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    return g.f5603a;
                }
                throw new M2.a(c0782n);
        }
    }

    public C0782n(C0069o c0069o, e eVar) {
        this.f5462d = 4;
        this.f5463f = c0069o;
        this.e = eVar;
    }
}
