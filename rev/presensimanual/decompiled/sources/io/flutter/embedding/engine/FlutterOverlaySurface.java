package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FlutterOverlaySurface {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f4608id;
    private final Surface surface;

    public FlutterOverlaySurface(int i3, Surface surface) {
        this.f4608id = i3;
        this.surface = surface;
    }

    public int getId() {
        return this.f4608id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
