package N2;

import I2.i0;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class x extends B2.i implements A2.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f1168f = new x(2, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x f1169g = new x(2, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final x f1170h = new x(2, 2);
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i3, int i4) {
        super(i3);
        this.e = i4;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                p063s2.g gVar = (p063s2.g) obj2;
                if (!(gVar instanceof i0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? gVar : Integer.valueOf(iIntValue + 1);
            case 1:
                i0 i0Var = (i0) obj;
                p063s2.g gVar2 = (p063s2.g) obj2;
                if (i0Var != null) {
                    return i0Var;
                }
                if (gVar2 instanceof i0) {
                    return (i0) gVar2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
