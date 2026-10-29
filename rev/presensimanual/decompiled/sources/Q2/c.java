package Q2;

import A2.l;
import I2.C0035f;
import I2.InterfaceC0034e;
import I2.n0;
import N2.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0034e, n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0035f f1385d;
    public final /* synthetic */ d e;

    public c(d dVar, C0035f c0035f) {
        this.e = dVar;
        this.f1385d = c0035f;
    }

    @Override // I2.n0
    public final void a(u uVar, int i3) {
        this.f1385d.a(uVar, i3);
    }

    @Override // p063s2.d
    public final p063s2.i g() {
        return this.f1385d.f477h;
    }

    @Override // I2.InterfaceC0034e
    public final void k(Object obj, l lVar) {
        p055q2.g gVar = p055q2.g.f5603a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1386g;
        d dVar = this.e;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f1385d.k(gVar, new b(0, dVar, this));
    }

    @Override // p063s2.d
    public final void l(Object obj) {
        this.f1385d.l(obj);
    }

    @Override // I2.InterfaceC0034e
    public final A0.f m(Object obj, l lVar) {
        d dVar = this.e;
        b bVar = new b(1, dVar, this);
        A0.f fVarM = this.f1385d.m((p055q2.g) obj, bVar);
        if (fVarM != null) {
            d.f1386g.set(dVar, null);
        }
        return fVarM;
    }

    @Override // I2.InterfaceC0034e
    public final void o(Object obj) {
        this.f1385d.o(obj);
    }
}
