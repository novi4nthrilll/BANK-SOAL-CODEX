package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.p;
import io.flutter.view.q;

/* JADX INFO: loaded from: classes.dex */
public final class i implements TextureRegistry$SurfaceTextureEntry, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f4626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f4628d;
    public final /* synthetic */ l e;

    public i(l lVar, long j3, SurfaceTexture surfaceTexture) {
        this.e = lVar;
        this.f4625a = j3;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new d(this, 1));
        this.f4626b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i iVar = this.f4624a;
                if (iVar.f4627c) {
                    return;
                }
                l lVar2 = iVar.e;
                if (lVar2.f4647a.isAttached()) {
                    iVar.f4626b.markDirty();
                    lVar2.f4647a.scheduleFrame();
                }
            }
        }, new Handler());
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f4627c) {
                return;
            }
            l lVar = this.e;
            lVar.e.post(new j(this.f4625a, lVar.f4647a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f4625a;
    }

    @Override // io.flutter.view.q
    public final void onTrimMemory(int i3) {
        q qVar = this.f4628d;
        if (qVar != null) {
            qVar.onTrimMemory(i3);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f4627c) {
            return;
        }
        this.f4626b.release();
        l lVar = this.e;
        lVar.f4647a.unregisterTexture(this.f4625a);
        lVar.b(this);
        this.f4627c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(p pVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(q qVar) {
        this.f4628d = qVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f4626b.surfaceTexture();
    }
}
