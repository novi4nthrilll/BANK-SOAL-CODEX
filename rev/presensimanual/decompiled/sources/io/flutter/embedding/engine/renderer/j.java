package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4629d;
    public final FlutterJNI e;

    public j(long j3, FlutterJNI flutterJNI) {
        this.f4629d = j3;
        this.e = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.e;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f4629d);
        }
    }
}
