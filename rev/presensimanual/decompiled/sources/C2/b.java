package C2;

import java.util.Random;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f174a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return new Random();
            default:
                return 0L;
        }
    }
}
