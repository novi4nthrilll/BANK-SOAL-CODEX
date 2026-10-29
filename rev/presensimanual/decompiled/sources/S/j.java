package S;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Writer {
    public final StringBuilder e = new StringBuilder(128);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1578d = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.e;
        if (sb.length() > 0) {
            Log.d(this.f1578d, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = cArr[i3 + i5];
            if (c3 == '\n') {
                a();
            } else {
                this.e.append(c3);
            }
        }
    }
}
