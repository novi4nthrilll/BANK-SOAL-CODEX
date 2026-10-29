package P2;

import B2.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1323l = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f1324d;
    public final p e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f1326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f1327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1328i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f1330k;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    public a(b bVar, int i3) {
        this.f1330k = bVar;
        setDaemon(true);
        this.f1324d = new l();
        this.e = new p();
        this.f1325f = 4;
        this.nextParkedWorker = b.f1334n;
        C2.e.f176d.getClass();
        this.f1328i = C2.e.e.a().nextInt();
        f(i3);
    }

    public final h a(boolean z2) {
        h hVarE;
        h hVarE2;
        b bVar;
        long j3;
        int i3 = this.f1325f;
        h hVar = null;
        l lVar = this.f1324d;
        b bVar2 = this.f1330k;
        if (i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1332l;
            do {
                bVar = this.f1330k;
                j3 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1356b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null || hVar2.e.f427d != 1) {
                            int i4 = l.f1358d.get(lVar);
                            int i5 = l.f1357c.get(lVar);
                            while (i4 != i5 && l.e.get(lVar) != 0) {
                                i5--;
                                h hVarC = lVar.c(i5, true);
                                if (hVarC != null) {
                                    hVar = hVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                hVar = hVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar2);
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar2.f1339i.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f1332l.compareAndSet(bVar, j3, j3 - 4398046511104L));
            this.f1325f = 1;
        }
        if (z2) {
            boolean z3 = d(bVar2.f1335d * 2) == 0;
            if (z3 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            lVar.getClass();
            h hVarB = (h) l.f1356b.getAndSet(lVar, null);
            if (hVarB == null) {
                hVarB = lVar.b();
            }
            if (hVarB != null) {
                return hVarB;
            }
            if (!z3 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i4 = this.f1328i;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f1328i = i7;
        int i8 = i3 - 1;
        return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f1330k;
        if (iD == 0) {
            h hVar = (h) bVar.f1338h.d();
            return hVar != null ? hVar : (h) bVar.f1339i.d();
        }
        h hVar2 = (h) bVar.f1339i.d();
        return hVar2 != null ? hVar2 : (h) bVar.f1338h.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1330k.f1337g);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i3) {
        int i4 = this.f1325f;
        boolean z2 = i4 == 1;
        if (z2) {
            b.f1332l.addAndGet(this.f1330k, 4398046511104L);
        }
        if (i4 != i3) {
            this.f1325f = i3;
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00df A[SYNTHETIC] */
    public final h i(int i3) {
        int i4;
        h hVarC;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f1332l;
        b bVar = this.f1330k;
        int i5 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar = null;
        if (i5 < 2) {
            return null;
        }
        int iD = d(i5);
        int i6 = 0;
        long jMin = Long.MAX_VALUE;
        while (i6 < i5) {
            int i7 = iD + 1;
            if (i7 > i5) {
                i7 = 1;
            }
            a aVar = (a) bVar.f1340j.b(i7);
            if (aVar == null || aVar == this) {
                i4 = i7;
            } else {
                l lVar = aVar.f1324d;
                if (i3 != 3) {
                    lVar.getClass();
                    int i8 = l.f1358d.get(lVar);
                    int i9 = l.f1357c.get(lVar);
                    boolean z2 = i3 == 1;
                    while (true) {
                        if (i8 != i9 && (!z2 || l.e.get(lVar) != 0)) {
                            int i10 = i8 + 1;
                            hVarC = lVar.c(i8, z2);
                            if (hVarC != null) {
                                break;
                            }
                            i8 = i10;
                        } else {
                            hVarC = hVar;
                            break;
                        }
                    }
                } else {
                    hVarC = lVar.b();
                }
                p pVar = this.e;
                if (hVarC != null) {
                    pVar.f128d = hVarC;
                    i4 = i7;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f1356b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 != null) {
                            if (((hVar2.e.f427d == 1 ? 1 : 2) & i3) != 0) {
                                j.f1352f.getClass();
                                i4 = i7;
                                long jNanoTime = System.nanoTime() - hVar2.f1346d;
                                long j4 = j.f1349b;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    hVar = null;
                                    break;
                                }
                                while (true) {
                                    hVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                        pVar.f128d = hVar2;
                                    } else if (atomicReferenceFieldUpdater.get(lVar) != hVar2) {
                                        i7 = i4;
                                        hVar = null;
                                    }
                                }
                            }
                        }
                        i4 = i7;
                        j3 = -2;
                        break;
                    }
                    if (j3 == -1) {
                        h hVar3 = (h) pVar.f128d;
                        pVar.f128d = hVar;
                        return hVar3;
                    }
                    if (j3 > 0) {
                        jMin = Math.min(jMin, j3);
                    }
                }
                j3 = -1;
                if (j3 == -1) {
                    h hVar4 = (h) pVar.f128d;
                    pVar.f128d = hVar;
                    return hVar4;
                }
                if (j3 > 0) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i6++;
            iD = i4;
            hVar = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f1327h = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        int i3;
        loop0: while (true) {
            boolean z2 = false;
            while (true) {
                b bVar = this.f1330k;
                bVar.getClass();
                int i4 = 5;
                if (b.f1333m.get(bVar) != 0 || this.f1325f == 5) {
                    break loop0;
                }
                h hVarA = a(this.f1329j);
                int i5 = 3;
                if (hVarA == null) {
                    this.f1329j = false;
                    if (this.f1327h == 0) {
                        Object obj = this.nextParkedWorker;
                        A0.f fVar = b.f1334n;
                        if (obj != fVar) {
                            f1323l.set(this, -1);
                            while (this.nextParkedWorker != b.f1334n) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1323l;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                b bVar2 = this.f1330k;
                                bVar2.getClass();
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f1333m;
                                if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f1325f == i4) {
                                    break;
                                }
                                h(i5);
                                Thread.interrupted();
                                if (this.f1326g == 0) {
                                    this.f1326g = System.nanoTime() + this.f1330k.f1336f;
                                }
                                LockSupport.parkNanos(this.f1330k.f1336f);
                                if (System.nanoTime() - this.f1326g >= 0) {
                                    this.f1326g = 0L;
                                    b bVar3 = this.f1330k;
                                    synchronized (bVar3.f1340j) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f1332l;
                                                if (((int) (atomicLongFieldUpdater2.get(bVar3) & 2097151)) > bVar3.f1335d) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i6 = this.indexInArray;
                                                        f(0);
                                                        bVar3.c(this, i6, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(bVar3) & 2097151);
                                                        if (andDecrement != i6) {
                                                            Object objB = bVar3.f1340j.b(andDecrement);
                                                            B2.h.b(objB);
                                                            a aVar = (a) objB;
                                                            bVar3.f1340j.c(i6, aVar);
                                                            aVar.f(i6);
                                                            bVar3.c(aVar, andDecrement, i6);
                                                        }
                                                        bVar3.f1340j.c(andDecrement, null);
                                                        this.f1325f = 5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                i4 = 5;
                                i5 = 3;
                            }
                        } else {
                            b bVar4 = this.f1330k;
                            bVar4.getClass();
                            if (this.nextParkedWorker == fVar) {
                                do {
                                    atomicLongFieldUpdater = b.f1331k;
                                    j3 = atomicLongFieldUpdater.get(bVar4);
                                    i3 = this.indexInArray;
                                    this.nextParkedWorker = bVar4.f1340j.b((int) (j3 & 2097151));
                                } while (!atomicLongFieldUpdater.compareAndSet(bVar4, j3, ((j3 + 2097152) & (-2097152)) | ((long) i3)));
                            }
                        }
                    } else {
                        if (z2) {
                            h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f1327h);
                            this.f1327h = 0L;
                            break;
                        }
                        z2 = true;
                    }
                } else {
                    this.f1327h = 0L;
                    int i7 = hVarA.e.f427d;
                    this.f1326g = 0L;
                    if (this.f1325f == 3) {
                        this.f1325f = 2;
                    }
                    b bVar5 = this.f1330k;
                    if (i7 != 0 && h(2) && !bVar5.f() && !bVar5.d(b.f1332l.get(bVar5))) {
                        bVar5.f();
                    }
                    bVar5.getClass();
                    try {
                        hVarA.run();
                    } catch (Throwable th2) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                    }
                    if (i7 != 0) {
                        b.f1332l.addAndGet(bVar5, -2097152L);
                        if (this.f1325f == 5) {
                            break;
                        }
                        this.f1325f = 4;
                        break;
                    }
                    break;
                }
            }
        }
        h(5);
    }
}
