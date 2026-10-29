package R1;

import android.util.Log;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1482c;

    public /* synthetic */ i(int i3, Object obj, Object obj2) {
        this.f1480a = i3;
        this.f1482c = obj;
        this.f1481b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f1480a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((K1.g) this.f1481b).a(((S1.n) ((E0.n) ((A0.g) this.f1482c).f19f).f237f).f(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((K1.g) this.f1481b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f1480a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((j) this.f1482c).f1484b = (byte[]) this.f1481b;
                break;
            default:
                ((K1.g) this.f1481b).a(((S1.n) ((E0.n) ((A0.g) this.f1482c).f19f).f237f).a(obj));
                break;
        }
    }
}
