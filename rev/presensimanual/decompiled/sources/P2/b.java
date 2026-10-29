package P2;

import I1.w;
import I2.AbstractC0052x;
import N2.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1331k = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1332l = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1333m = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final A0.f f1334n = new A0.f(10, "NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1335d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f1338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f1339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f1340j;
    private volatile long parkedWorkersStack;

    public b(int i3, int i4, long j3, String str) {
        this.f1335d = i3;
        this.e = i4;
        this.f1336f = j3;
        this.f1337g = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(A0.c.h("Max pool size ", i4, " should be greater than or equals to core pool size ", i3).toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f1338h = new e();
        this.f1339i = new e();
        this.f1340j = new s((i3 + 1) * 2);
        this.controlState = ((long) i3) << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f1340j) {
            try {
                if (f1333m.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1332l;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f1335d) {
                    return 0;
                }
                if (i3 >= this.e) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f1340j.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f1340j.c(i5, aVar);
                if (i5 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i6 = i4 + 1;
                aVar.start();
                return i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, w wVar, boolean z2) {
        h iVar;
        int i3;
        j.f1352f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f1346d = jNanoTime;
            iVar.e = wVar;
        } else {
            iVar = new i(runnable, jNanoTime, wVar);
        }
        boolean z3 = false;
        boolean z4 = iVar.e.f427d == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1332l;
        long jAddAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !B2.h.a(aVar.f1330k, this)) {
            aVar = null;
        }
        if (aVar != null && (i3 = aVar.f1325f) != 5 && (iVar.e.f427d != 0 || i3 != 2)) {
            aVar.f1329j = true;
            l lVar = aVar.f1324d;
            if (z2) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f1356b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.e.f427d == 1 ? this.f1339i.a(iVar) : this.f1338h.a(iVar))) {
                throw new RejectedExecutionException(I.h(new StringBuilder(), this.f1337g, " was terminated"));
            }
        }
        if (z2 && aVar != null) {
            z3 = true;
        }
        if (z4) {
            if (z3 || f() || d(jAddAndGet)) {
                return;
            }
            f();
            return;
        }
        if (z3 || f() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        f();
    }

    public final void c(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f1331k.get(this);
            int iB = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (iB == i3) {
                if (i4 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f1334n) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        iB = aVar2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = aVar2.c();
                        }
                    }
                } else {
                    iB = i4;
                }
            }
            if (iB >= 0) {
                if (f1331k.compareAndSet(this, j3, j4 | ((long) iB))) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i3;
        h hVarA;
        if (f1333m.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !B2.h.a(aVar.f1330k, this)) {
                aVar = null;
            }
            synchronized (this.f1340j) {
                i3 = (int) (f1332l.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    Object objB = this.f1340j.b(i4);
                    B2.h.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f1324d;
                        e eVar = this.f1339i;
                        lVar.getClass();
                        h hVar = (h) l.f1356b.getAndSet(lVar, null);
                        if (hVar != null) {
                            eVar.a(hVar);
                        }
                        while (true) {
                            h hVarB = lVar.b();
                            if (hVarB == null) {
                                break;
                            } else {
                                eVar.a(hVarB);
                            }
                        }
                    }
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f1339i.b();
            this.f1338h.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.f1338h.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.f1338h.d();
                    if (hVarA == null && (hVarA = (h) this.f1339i.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f1331k.set(this, 0L);
            f1332l.set(this, 0L);
        }
    }

    public final boolean d(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f1335d;
        if (i3 < i4) {
            int iA = a();
            if (iA == 1 && i4 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, j.f1353g, false);
    }

    public final boolean f() {
        A0.f fVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1331k;
            long j3 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f1340j.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    fVar = f1334n;
                    if (objC == fVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | ((long) iB))) {
                    aVar.g(fVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f1323l.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f1340j;
        int iA = sVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < iA; i8++) {
            a aVar = (a) sVar.b(i8);
            if (aVar != null) {
                l lVar = aVar.f1324d;
                lVar.getClass();
                int i9 = l.f1356b.get(lVar) != null ? (l.f1357c.get(lVar) - l.f1358d.get(lVar)) + 1 : l.f1357c.get(lVar) - l.f1358d.get(lVar);
                int iB = M.j.b(aVar.f1325f);
                if (iB == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i9);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iB == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i9);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iB == 2) {
                    i5++;
                } else if (iB == 3) {
                    i6++;
                    if (i9 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i9);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iB == 4) {
                    i7++;
                }
            }
        }
        long j3 = f1332l.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f1337g);
        sb4.append('@');
        sb4.append(AbstractC0052x.b(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f1335d;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.e);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i5);
        sb4.append(", dormant = ");
        sb4.append(i6);
        sb4.append(", terminated = ");
        sb4.append(i7);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f1338h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f1339i.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
