package p013d1;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class G4 implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f3580i = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3581d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3583g = 2147483647L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3584h = -2147483648L;

    public G4(String str) {
    }

    public void a() {
        this.e = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j4 = this.f3582f;
        if (j4 != 0 && jElapsedRealtimeNanos - j4 >= 1000000) {
            this.f3581d = 0;
            this.e = 0L;
            this.f3583g = 2147483647L;
            this.f3584h = -2147483648L;
        }
        this.f3582f = jElapsedRealtimeNanos;
        this.f3581d++;
        this.f3583g = Math.min(this.f3583g, j3);
        this.f3584h = Math.max(this.f3584h, j3);
        if (this.f3581d % 50 == 0) {
            Locale locale = Locale.US;
            P4.b();
        }
        if (this.f3581d % 500 == 0) {
            this.f3581d = 0;
            this.e = 0L;
            this.f3583g = 2147483647L;
            this.f3584h = -2147483648L;
        }
    }

    public void c(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j3 = this.e;
        if (j3 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        c(j3);
    }
}
