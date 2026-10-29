package N2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1133a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f1128a;

    @Override // N2.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1133a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        A0.f fVar = a.f1128a;
        if (obj2 == fVar) {
            A0.f fVarC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == fVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, fVar, fVarC)) {
                    if (atomicReferenceFieldUpdater.get(this) != fVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                    }
                }
                obj2 = fVarC;
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract A0.f c(Object obj);
}
