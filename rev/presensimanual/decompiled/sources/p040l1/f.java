package p040l1;

import java.util.Collections;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p058r1.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f5307b = new f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f5308c = new f(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5309a;

    public /* synthetic */ f(int i3) {
        this.f5309a = i3;
    }

    @Override // p058r1.a
    public final Object get() {
        switch (this.f5309a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return Collections.emptySet();
            default:
                return null;
        }
    }
}
