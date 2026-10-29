package I2;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: I2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0046q extends B2.i implements A2.p {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0046q f493f = new C0046q(2, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0046q f494g = new C0046q(2, 1);
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0046q(int i3, int i4) {
        super(i3);
        this.e = i4;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((p063s2.i) obj).h((p063s2.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((p063s2.i) obj).h((p063s2.g) obj2);
        }
    }
}
