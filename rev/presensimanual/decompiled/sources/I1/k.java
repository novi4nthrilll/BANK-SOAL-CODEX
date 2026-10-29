package I1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public final class k implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f382a;

    public k(l lVar) {
        this.f382a = lVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
        l lVar = this.f382a;
        lVar.f383d = true;
        if ((lVar.f384f == null || lVar.e) ? false : true) {
            lVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l lVar = this.f382a;
        boolean z2 = false;
        lVar.f383d = false;
        io.flutter.embedding.engine.renderer.l lVar2 = lVar.f384f;
        if (lVar2 != null && !lVar.e) {
            z2 = true;
        }
        if (z2) {
            if (lVar2 == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar2.c();
            Surface surface = lVar.f385g;
            if (surface != null) {
                surface.release();
                lVar.f385g = null;
            }
        }
        Surface surface2 = lVar.f385g;
        if (surface2 != null) {
            surface2.release();
            lVar.f385g = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
        l lVar = this.f382a;
        io.flutter.embedding.engine.renderer.l lVar2 = lVar.f384f;
        if (lVar2 == null || lVar.e) {
            return;
        }
        if (lVar2 == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        lVar2.f4647a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
