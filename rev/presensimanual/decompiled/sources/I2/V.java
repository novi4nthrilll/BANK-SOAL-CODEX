package I2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class V extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f453f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(S s3) {
        super(true);
        boolean z2 = true;
        H(s3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b0.e;
        InterfaceC0038i interfaceC0038i = (InterfaceC0038i) atomicReferenceFieldUpdater.get(this);
        C0039j c0039j = interfaceC0038i instanceof C0039j ? (C0039j) interfaceC0038i : null;
        if (c0039j == null) {
            z2 = false;
            break;
        }
        b0 b0VarN = c0039j.n();
        while (!b0VarN.B()) {
            InterfaceC0038i interfaceC0038i2 = (InterfaceC0038i) atomicReferenceFieldUpdater.get(b0VarN);
            C0039j c0039j2 = interfaceC0038i2 instanceof C0039j ? (C0039j) interfaceC0038i2 : null;
            if (c0039j2 == null) {
                z2 = false;
                break;
            }
            b0VarN = c0039j2.n();
        }
        this.f453f = z2;
    }

    @Override // I2.b0
    public final boolean B() {
        return this.f453f;
    }

    @Override // I2.b0
    public final boolean C() {
        return true;
    }
}
