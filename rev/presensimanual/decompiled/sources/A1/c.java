package A1;

import M0.j;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface c extends Closeable, p, j {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @v(androidx.lifecycle.j.ON_DESTROY)
    void close();
}
