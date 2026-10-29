package I1;

import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes.dex */
public final class i implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f378a;

    public i(j jVar) {
        this.f378a = jVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        j jVar = this.f378a;
        io.flutter.embedding.engine.renderer.l lVar = jVar.f380f;
        if (lVar == null || jVar.e) {
            return;
        }
        if (lVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        lVar.f4647a.onSurfaceChanged(i4, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j jVar = this.f378a;
        jVar.f379d = true;
        if ((jVar.f380f == null || jVar.e) ? false : true) {
            jVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j jVar = this.f378a;
        boolean z2 = false;
        jVar.f379d = false;
        io.flutter.embedding.engine.renderer.l lVar = jVar.f380f;
        if (lVar != null && !jVar.e) {
            z2 = true;
        }
        if (z2) {
            if (lVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            lVar.c();
        }
    }
}
