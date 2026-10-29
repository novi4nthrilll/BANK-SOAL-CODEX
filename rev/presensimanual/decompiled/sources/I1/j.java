package I1;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class j extends SurfaceView implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f379d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0029e f381g;

    public j(AbstractActivityC0028d abstractActivityC0028d, boolean z2) {
        super(abstractActivityC0028d, null);
        this.f379d = false;
        this.e = false;
        i iVar = new i(this);
        this.f381g = new C0029e(1, this);
        if (z2) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(iVar);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f380f;
        if (lVar2 != null) {
            lVar2.c();
            this.f380f.f4647a.removeIsDisplayingFlutterUiListener(this.f381g);
        }
        this.f380f = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f380f == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.e = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f380f == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f380f;
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.c();
        }
        setAlpha(0.0f);
        this.f380f.f4647a.removeIsDisplayingFlutterUiListener(this.f381g);
        this.f380f = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        io.flutter.embedding.engine.renderer.l lVar = this.f380f;
        if (lVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = lVar.f4647a;
        C0029e c0029e = this.f381g;
        flutterJNI.addIsDisplayingFlutterUiListener(c0029e);
        if (lVar.f4650d) {
            c0029e.b();
        }
        if (this.f379d) {
            e();
        }
        this.e = false;
    }

    public final void e() {
        if (this.f380f == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.l lVar = this.f380f;
        Surface surface = getHolder().getSurface();
        boolean z2 = this.e;
        if (!z2) {
            lVar.c();
        }
        lVar.f4649c = surface;
        FlutterJNI flutterJNI = lVar.f4647a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f380f;
    }
}
