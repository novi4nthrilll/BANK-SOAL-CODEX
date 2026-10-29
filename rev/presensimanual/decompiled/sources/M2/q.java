package M2;

import I2.C0049u;
import I2.InterfaceC0038i;
import I2.S;
import I2.b0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends B2.i implements A2.p {
    public final /* synthetic */ n e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.e = nVar;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        p063s2.g gVar = (p063s2.g) obj2;
        p063s2.h key = gVar.getKey();
        p063s2.g gVarF = this.e.f1015h.f(key);
        if (key != C0049u.e) {
            return Integer.valueOf(gVar != gVarF ? Integer.MIN_VALUE : iIntValue + 1);
        }
        S s3 = (S) gVarF;
        S parent = (S) gVar;
        while (true) {
            if (parent != null) {
                if (parent == s3 || !(parent instanceof N2.t)) {
                    break;
                }
                InterfaceC0038i interfaceC0038i = (InterfaceC0038i) b0.e.get((b0) parent);
                parent = interfaceC0038i != null ? interfaceC0038i.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent == s3) {
            if (s3 != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + s3 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
