package N2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1153f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final A0.f f1154g = new A0.f(10, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f1158d;

    public n(int i3, boolean z2) {
        this.f1155a = i3;
        this.f1156b = z2;
        int i4 = i3 - 1;
        this.f1157c = i4;
        this.f1158d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1153f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j3) != 0) {
                return (2305843009213693952L & j3) != 0 ? 2 : 1;
            }
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            int i5 = this.f1157c;
            if (((i4 + 2) & i5) == (i3 & i5)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1158d;
            if (!this.f1156b && atomicReferenceArray.get(i4 & i5) != null) {
                int i6 = this.f1155a;
                if (i6 < 1024 || ((i4 - i3) & 1073741823) > (i6 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j3, ((-1152921503533105153L) & j3) | (((long) ((i4 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i4 & i5, runnable);
                n nVarC = this;
                while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                    nVarC = nVarC.c();
                    AtomicReferenceArray atomicReferenceArray2 = nVarC.f1158d;
                    int i7 = nVarC.f1157c & i4;
                    Object obj = atomicReferenceArray2.get(i7);
                    if ((obj instanceof m) && ((m) obj).f1152a == i4) {
                        atomicReferenceArray2.set(i7, runnable);
                    } else {
                        nVarC = null;
                    }
                    if (nVarC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f1153f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        while (true) {
            atomicLongFieldUpdater = f1153f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                break;
            }
            long j4 = j3 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j4)) {
                j3 = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f1155a * 2, this.f1156b);
            int i3 = (int) (1073741823 & j3);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int i5 = this.f1157c;
                int i6 = i3 & i5;
                if (i6 == (i5 & i4)) {
                    break;
                }
                Object mVar = this.f1158d.get(i6);
                if (mVar == null) {
                    mVar = new m(i3);
                }
                nVar2.f1158d.set(nVar2.f1157c & i3, mVar);
                i3++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1153f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return f1154g;
            }
            int i3 = (int) (j3 & 1073741823);
            int i4 = (int) ((1152921503533105152L & j3) >> 30);
            int i5 = this.f1157c;
            int i6 = i3 & i5;
            if ((i4 & i5) == i6) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1158d;
            Object obj = atomicReferenceArray.get(i6);
            boolean z2 = this.f1156b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j4 = (i3 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j3, (j3 & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(i6, null);
                    return obj;
                }
                if (z2) {
                    n nVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1153f;
                        long j5 = atomicLongFieldUpdater2.get(nVarC);
                        int i7 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            nVarC = nVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVarC, j5, (j5 & (-1073741824)) | j4)) {
                                nVarC.f1158d.set(nVarC.f1157c & i7, null);
                                nVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
