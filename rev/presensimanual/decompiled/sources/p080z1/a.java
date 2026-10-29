package p080z1;

import O0.C0092f;
import O0.u;
import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0092f f5954c = new C0092f("StreamingFormatChecker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f5955a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5956b = -1;

    public final void a(p077y1.a aVar) {
        if (aVar.f5926f != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f5955a;
        linkedList.add(Long.valueOf(jElapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l3 = (Long) linkedList.peekFirst();
            u.f(l3);
            if (jElapsedRealtime - l3.longValue() < 5000) {
                long j3 = this.f5956b;
                if (j3 == -1 || jElapsedRealtime - j3 >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f5956b = jElapsedRealtime;
                    C0092f c0092f = f5954c;
                    if (Log.isLoggable(c0092f.f1269a, 5)) {
                        String str = c0092f.f1270b;
                        Log.w("StreamingFormatChecker", str != null ? str.concat("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.") : "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                    }
                }
            }
        }
    }
}
