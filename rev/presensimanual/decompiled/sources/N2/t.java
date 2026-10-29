package N2;

import I2.AbstractC0030a;
import I2.AbstractC0052x;
import p013d1.AbstractC0514r3;

/* JADX INFO: loaded from: classes.dex */
public class t extends AbstractC0030a implements u2.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p063s2.d f1163g;

    public t(p063s2.d dVar, p063s2.i iVar) {
        super(iVar, true);
        this.f1163g = dVar;
    }

    @Override // I2.b0
    public final boolean J() {
        return true;
    }

    @Override // u2.c
    public final u2.c e() {
        p063s2.d dVar = this.f1163g;
        if (dVar instanceof u2.c) {
            return (u2.c) dVar;
        }
        return null;
    }

    @Override // I2.b0
    public void q(Object obj) {
        a.i(AbstractC0514r3.a(this.f1163g), AbstractC0052x.h(obj), null);
    }

    @Override // I2.b0
    public void r(Object obj) {
        this.f1163g.l(AbstractC0052x.h(obj));
    }
}
