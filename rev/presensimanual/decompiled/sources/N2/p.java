package N2;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class p extends B2.i implements A2.l {
    public final /* synthetic */ A2.l e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p063s2.i f1161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(A2.l lVar, Object obj, p063s2.i iVar) {
        super(1);
        this.e = lVar;
        this.f1160f = obj;
        this.f1161g = iVar;
    }

    @Override // A2.l
    public final Object i(Object obj) throws IllegalAccessException, InvocationTargetException {
        a.a(this.e, this.f1160f, this.f1161g);
        return p055q2.g.f5603a;
    }
}
