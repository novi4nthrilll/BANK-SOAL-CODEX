package R2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f1545a = new q(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f1546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f1547c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f1546b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i3 = 0; i3 < iHighestOneBit; i3++) {
            atomicReferenceArr[i3] = new AtomicReference();
        }
        f1547c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        B2.h.e(qVar, "segment");
        if (qVar.f1543f != null || qVar.f1544g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.f1542d) {
            return;
        }
        AtomicReference atomicReference = f1547c[(int) (Thread.currentThread().getId() & (((long) f1546b) - 1))];
        q qVar2 = f1545a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i3 = qVar3 != null ? qVar3.f1541c : 0;
        if (i3 >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f1543f = qVar3;
        qVar.f1540b = 0;
        qVar.f1541c = i3 + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f1547c[(int) (Thread.currentThread().getId() & (((long) f1546b) - 1))];
        q qVar = f1545a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f1543f);
        qVar2.f1543f = null;
        qVar2.f1541c = 0;
        return qVar2;
    }
}
