package O;

import android.os.Trace;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1194d;

    public /* synthetic */ m(int i3) {
        this.f1194d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1194d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                try {
                    int i3 = p072x.j.f5820a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (h.f1179j != null) {
                        h.a().c();
                        break;
                    }
                    return;
                } finally {
                    int i4 = p072x.j.f5820a;
                    Trace.endSection();
                }
            default:
                return;
        }
    }

    private final void a() {
    }
}
