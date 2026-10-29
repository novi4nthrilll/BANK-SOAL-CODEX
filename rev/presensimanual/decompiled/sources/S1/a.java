package S1;

import android.util.Log;
import java.nio.ByteBuffer;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1588c;

    public /* synthetic */ a(int i3, Object obj, Object obj2) {
        this.f1586a = i3;
        this.f1588c = obj;
        this.f1587b = obj2;
    }

    @Override // S1.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f1586a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                E0.n nVar = (E0.n) this.f1588c;
                try {
                    ((c) this.f1587b).e(((l) nVar.f237f).a(byteBuffer));
                } catch (RuntimeException e) {
                    Log.e("BasicMessageChannel#" + ((String) nVar.e), "Failed to handle message reply", e);
                    return;
                }
                break;
            default:
                E0.n nVar2 = (E0.n) this.f1588c;
                R1.i iVar = (R1.i) this.f1587b;
                try {
                    if (byteBuffer == null) {
                        iVar.getClass();
                    } else {
                        try {
                            iVar.c(((n) nVar2.f237f).c(byteBuffer));
                        } catch (i e3) {
                            iVar.a(e3.f1591d, e3.getMessage(), e3.e);
                        }
                    }
                } catch (RuntimeException e4) {
                    Log.e("MethodChannel#" + ((String) nVar2.e), "Failed to handle method call result", e4);
                    return;
                }
                break;
        }
    }
}
