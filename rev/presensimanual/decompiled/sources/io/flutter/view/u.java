package io.flutter.view;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f4865b;

    public u(v vVar, long j3) {
        this.f4865b = vVar;
        this.f4864a = j3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        long jNanoTime = System.nanoTime() - j3;
        long j4 = jNanoTime < 0 ? 0L : jNanoTime;
        v vVar = this.f4865b;
        vVar.f4868b.onVsync(j4, vVar.f4867a, this.f4864a);
        vVar.f4869c = this;
    }
}
