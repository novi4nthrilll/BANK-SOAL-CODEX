package K1;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class g implements S1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f761c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int i3) {
        this.f759a = flutterJNI;
        this.f760b = i3;
    }

    @Override // S1.e
    public final void a(ByteBuffer byteBuffer) {
        if (this.f761c.getAndSet(true)) {
            throw new IllegalStateException("Reply already submitted");
        }
        int i3 = this.f760b;
        FlutterJNI flutterJNI = this.f759a;
        if (byteBuffer == null) {
            flutterJNI.invokePlatformMessageEmptyResponseCallback(i3);
        } else {
            flutterJNI.invokePlatformMessageResponseCallback(i3, byteBuffer, byteBuffer.position());
        }
    }
}
