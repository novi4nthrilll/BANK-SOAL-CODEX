package J;

import p013d1.AbstractC0449g3;

/* JADX INFO: loaded from: classes.dex */
public final class D extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f522h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f523i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ boolean f524j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ P f525k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f526l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(P p3, int i3, p063s2.d dVar) {
        super(2, dVar);
        this.f525k = p3;
        this.f526l = i3;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        D d3 = new D(this.f525k, this.f526l, dVar);
        d3.f524j = ((Boolean) obj).booleanValue();
        return d3;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((D) b(bool, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    @Override // u2.b
    public final Object j(Object obj) {
        Throwable th;
        int iIntValue;
        ?? r3;
        ?? r4;
        a0 a0Var;
        ?? r5;
        t2.a aVar = t2.a.f5737d;
        ?? r6 = this.f523i;
        P p3 = this.f525k;
        try {
            if (r6 == 0) {
                AbstractC0449g3.b(obj);
                boolean z2 = this.f524j;
                this.f524j = z2;
                this.f523i = 1;
                obj = P.g(p3, z2, this);
                r6 = z2;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (r6 != 1) {
                    if (r6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = this.f524j;
                    th = this.f522h;
                    AbstractC0449g3.b(obj);
                    r4 = z3;
                    iIntValue = ((Number) obj).intValue();
                    r3 = r4;
                    T t3 = new T(th, iIntValue);
                    r5 = r3;
                    a0Var = t3;
                    return new p055q2.b(a0Var, Boolean.valueOf((boolean) r5));
                }
                boolean z4 = this.f524j;
                AbstractC0449g3.b(obj);
                r6 = z4;
            }
            a0Var = (a0) obj;
            r5 = r6;
        } catch (Throwable th2) {
            if (r6 != 0) {
                Z zH = p3.h();
                this.f522h = th2;
                this.f524j = r6;
                this.f523i = 2;
                Integer numA = zH.a();
                if (numA == aVar) {
                    return aVar;
                }
                r4 = r6;
                th = th2;
                obj = numA;
            } else {
                ?? r7 = r6;
                th = th2;
                iIntValue = this.f526l;
                r3 = r7 == true ? 1 : 0;
            }
            T t4 = new T(th, iIntValue);
            r5 = r3;
            a0Var = t4;
            return new p055q2.b(a0Var, Boolean.valueOf((boolean) r5));
        }
        return new p055q2.b(a0Var, Boolean.valueOf((boolean) r5));
    }
}
