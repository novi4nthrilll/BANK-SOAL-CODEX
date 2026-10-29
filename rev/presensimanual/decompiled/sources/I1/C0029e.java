package I1;

import android.os.Build;
import java.util.Iterator;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: I1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0029e implements io.flutter.embedding.engine.renderer.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f361b;

    public /* synthetic */ C0029e(int i3, Object obj) {
        this.f360a = i3;
        this.f361b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void a() {
        switch (this.f360a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                g gVar = (g) this.f361b;
                gVar.f363a.getClass();
                gVar.f368g = false;
                break;
            case 1:
                break;
            default:
                p pVar = (p) this.f361b;
                pVar.f397j = false;
                Iterator it = pVar.f396i.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).a();
                }
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.m
    public final void b() {
        switch (this.f360a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                g gVar = (g) this.f361b;
                AbstractActivityC0028d abstractActivityC0028d = gVar.f363a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0028d.reportFullyDrawn();
                } else {
                    abstractActivityC0028d.getClass();
                }
                gVar.f368g = true;
                gVar.f369h = true;
                break;
            case 1:
                j jVar = (j) this.f361b;
                jVar.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.l lVar = jVar.f380f;
                if (lVar != null) {
                    lVar.f4647a.removeIsDisplayingFlutterUiListener(this);
                }
                break;
            default:
                p pVar = (p) this.f361b;
                pVar.f397j = true;
                Iterator it = pVar.f396i.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.m) it.next()).b();
                }
                break;
        }
    }

    private final void c() {
    }
}
