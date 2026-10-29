package L2;

import I2.C0035f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q extends M2.b implements d, e, M2.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f947h = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f948g;

    public q(Object obj) {
        this._state = obj;
    }

    @Override // M2.j
    public final d b(p063s2.i iVar, int i3, int i4) {
        return ((((i3 < 0 || i3 >= 2) && i3 != -2) || i4 != 2) && !((i3 == 0 || i3 == -3) && i4 == 1)) ? new M2.h(this, iVar, i3, i4) : this;
    }

    @Override // L2.e
    public final Object c(Object obj, p063s2.d dVar) {
        d(obj);
        return p055q2.g.f5603a;
    }

    public final void d(Object obj) {
        if (obj == null) {
            obj = M2.l.f1013a;
        }
        e(null, obj);
    }

    public final boolean e(Object obj, Object obj2) {
        int i3;
        M2.c[] cVarArr;
        A0.f fVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f947h;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !B2.h.a(obj3, obj)) {
                return false;
            }
            if (B2.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.f948g;
            if ((i4 & 1) != 0) {
                this.f948g = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.f948g = i5;
            M2.c[] cVarArr2 = this.f996d;
            while (true) {
                s[] sVarArr = (s[]) cVarArr2;
                if (sVarArr != null) {
                    for (s sVar : sVarArr) {
                        if (sVar != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f951a;
                                Object obj4 = atomicReferenceFieldUpdater2.get(sVar);
                                if (obj4 == null || obj4 == (fVar = r.f950b)) {
                                    break;
                                }
                                A0.f fVar2 = r.f949a;
                                if (obj4 != fVar2) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, fVar2)) {
                                            ((C0035f) obj4).l(p055q2.g.f5603a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(sVar) == obj4);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, fVar)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(sVar) == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f948g;
                    if (i3 == i5) {
                        this.f948g = i5 + 1;
                        return true;
                    }
                    cVarArr = this.f996d;
                }
                cVarArr2 = cVarArr;
                i5 = i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:89:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:89:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0117 -> B:50:0x00cc). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // L2.d
    public final java.lang.Object q(L2.e r17, p063s2.d r18) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.q.q(L2.e, s2.d):java.lang.Object");
    }
}
