package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static v e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static t f4866f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlutterJNI f4868b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4867a = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f4869c = new u(this, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f4870d = new c(this);

    public v(FlutterJNI flutterJNI) {
        this.f4868b = flutterJNI;
    }

    public static v a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (e == null) {
            e = new v(flutterJNI);
        }
        if (f4866f == null) {
            v vVar = e;
            Objects.requireNonNull(vVar);
            t tVar = new t(vVar, displayManager);
            f4866f = tVar;
            displayManager.registerDisplayListener(tVar, null);
        }
        if (e.f4867a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            e.f4867a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return e;
    }
}
