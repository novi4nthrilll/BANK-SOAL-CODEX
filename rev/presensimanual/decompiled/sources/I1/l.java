package I1;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class l extends TextureView implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f383d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Surface f385g;

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a(io.flutter.embedding.engine.renderer.l lVar) {
        io.flutter.embedding.engine.renderer.l lVar2 = this.f384f;
        if (lVar2 != null) {
            lVar2.c();
        }
        this.f384f = lVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f384f == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.e = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c() {
        if (this.f384f == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.l lVar = this.f384f;
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.c();
            Surface surface = this.f385g;
            if (surface != null) {
                surface.release();
                this.f385g = null;
            }
        }
        this.f384f = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        if (this.f384f == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f383d) {
            e();
        }
        this.e = false;
    }

    public final void e() {
        if (this.f384f == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f385g;
        if (surface != null) {
            surface.release();
            this.f385g = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f385g = surface2;
        io.flutter.embedding.engine.renderer.l lVar = this.f384f;
        boolean z2 = this.e;
        if (!z2) {
            lVar.c();
        }
        lVar.f4649c = surface2;
        FlutterJNI flutterJNI = lVar.f4647a;
        if (z2) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public io.flutter.embedding.engine.renderer.l getAttachedRenderer() {
        return this.f384f;
    }

    public void setRenderSurface(Surface surface) {
        this.f385g = surface;
    }
}
