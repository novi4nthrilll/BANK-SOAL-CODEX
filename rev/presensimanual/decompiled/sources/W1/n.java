package W1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1775d;
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1776f;

    public /* synthetic */ n(Object obj, int i3, int i4) {
        this.f1775d = i4;
        this.f1776f = obj;
        this.e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f1776f;
        int i3 = this.e;
        switch (this.f1775d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                D0.b bVar = (D0.b) obj;
                int iB = M.j.b(i3);
                z zVar = z.PORTRAIT_UP;
                if (iB != 0) {
                    if (iB == 1) {
                        zVar = z.PORTRAIT_DOWN;
                    } else if (iB == 2) {
                        zVar = z.LANDSCAPE_LEFT;
                    } else if (iB == 3) {
                        zVar = z.LANDSCAPE_RIGHT;
                    }
                }
                new E0.n((S1.f) ((A0.f) bVar.f182f).e, "dev.flutter.pigeon.camera_android.CameraGlobalEventApi.deviceOrientationChanged", v.f1790d, null, false).d(new ArrayList(Collections.singletonList(zVar)), new t(new p065t0.e(), "dev.flutter.pigeon.camera_android.CameraGlobalEventApi.deviceOrientationChanged", 3));
                break;
            default:
                int i4 = i3 & 4;
                E0.h hVar = ((io.flutter.plugin.platform.c) obj).f4709b;
                if (i4 != 0) {
                    A0.g gVar = (A0.g) hVar.f214g;
                    gVar.getClass();
                    ((E0.n) gVar.e).b("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                } else {
                    A0.g gVar2 = (A0.g) hVar.f214g;
                    gVar2.getClass();
                    ((E0.n) gVar2.e).b("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                }
                break;
        }
    }
}
