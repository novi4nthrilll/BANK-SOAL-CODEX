package Q2;

import N2.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class j extends u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReferenceArray f1400h;

    public j(long j3, j jVar, int i3) {
        super(j3, jVar, i3);
        this.f1400h = new AtomicReferenceArray(i.f1399f);
    }

    @Override // N2.u
    public final int f() {
        return i.f1399f;
    }

    @Override // N2.u
    public final void g(int i3, p063s2.i iVar) {
        this.f1400h.set(i3, i.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1165f + ", hashCode=" + hashCode() + ']';
    }
}
