package Q;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
import k.AbstractC0742m;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class h extends O.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1375a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f1376b;

    public h(SwitchCompat switchCompat) {
        this.f1376b = new WeakReference(switchCompat);
    }

    @Override // O.f
    public void a() {
        switch (this.f1375a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.f1376b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // O.f
    public final void b() {
        switch (this.f1375a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                i.a((EditText) this.f1376b.get(), 1);
                break;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.f1376b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    public h(AbstractC0742m abstractC0742m) {
        this.f1376b = new WeakReference(abstractC0742m);
    }
}
