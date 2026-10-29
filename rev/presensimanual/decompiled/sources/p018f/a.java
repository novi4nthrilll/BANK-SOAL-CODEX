package p018f;

import android.graphics.drawable.Animatable;
import c0.e;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.N2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends N2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Animatable f4391b;

    public /* synthetic */ a(Animatable animatable, int i3) {
        this.f4390a = i3;
        this.f4391b = animatable;
    }

    @Override // p013d1.N2
    public final void c() {
        switch (this.f4390a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.f4391b.start();
                break;
            default:
                ((e) this.f4391b).start();
                break;
        }
    }

    @Override // p013d1.N2
    public final void d() {
        switch (this.f4390a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                this.f4391b.stop();
                break;
            default:
                ((e) this.f4391b).stop();
                break;
        }
    }
}
