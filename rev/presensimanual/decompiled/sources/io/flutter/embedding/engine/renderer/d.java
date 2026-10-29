package io.flutter.embedding.engine.renderer;

import io.flutter.view.q;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4616d;
    public final /* synthetic */ q e;

    public /* synthetic */ d(q qVar, int i3) {
        this.f4616d = i3;
        this.e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4616d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                ((FlutterRenderer$ImageReaderSurfaceProducer) this.e).lambda$dequeueImage$0();
                break;
            default:
                ((i) this.e).getClass();
                break;
        }
    }
}
