package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class F extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ boolean f538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f540l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(P p3, int i3, p063s2.d dVar) {
        super(2, dVar);
        this.f539k = p3;
        this.f540l = i3;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        F f3 = new F(this.f539k, this.f540l, dVar);
        f3.f538j = ((Boolean) obj).booleanValue();
        return f3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) b(bool, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    @Override // u2.b
    public final Object j(Object obj) {
        boolean z2;
        Object obj2;
        int iIntValue;
        int iHashCode;
        t2.a aVar = t2.a.f5737d;
        int i3 = this.f537i;
        P p3 = this.f539k;
        if (i3 != 0) {
            if (i3 == 1) {
                z2 = this.f538j;
                AbstractC0449g3.b(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f536h;
                AbstractC0449g3.b(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C0057c(obj2, iHashCode, iIntValue);
        }
        AbstractC0449g3.b(obj);
        z2 = this.f538j;
        this.f538j = z2;
        this.f537i = 1;
        obj = p3.j(this);
        if (obj == aVar) {
            return aVar;
        }
        if (z2) {
            Z zH = p3.h();
            this.f536h = obj;
            this.f537i = 2;
            Integer numA = zH.a();
            if (numA == aVar) {
                return aVar;
            }
            obj2 = obj;
            obj = numA;
            iIntValue = ((Number) obj).intValue();
        } else {
            obj2 = obj;
            iIntValue = this.f540l;
        }
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C0057c(obj2, iHashCode, iIntValue);
    }
}
