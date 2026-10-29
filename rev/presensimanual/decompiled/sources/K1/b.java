package K1;

import B.C0006g;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements S1.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FlutterJNI f744d;
    public final AssetManager e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A0.f f747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f748i;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j3) {
        this.f748i = false;
        C0006g c0006g = new C0006g(7, this);
        this.f744d = flutterJNI;
        this.e = assetManager;
        this.f745f = j3;
        j jVar = new j(flutterJNI);
        this.f746g = jVar;
        jVar.c("flutter/isolate", c0006g, null);
        this.f747h = new A0.f(8, jVar);
        if (flutterJNI.isAttached()) {
            this.f748i = true;
        }
    }

    public final void a(a aVar, List list) {
        if (this.f748i) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        o2.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(aVar);
            this.f744d.runBundleAndSnapshotFromLibrary(aVar.f741a, aVar.f743c, aVar.f742b, this.e, list, this.f745f);
            this.f748i = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // S1.f
    public final void c(String str, S1.d dVar, p074x1.a aVar) {
        this.f747h.c(str, dVar, aVar);
    }

    @Override // S1.f
    public final void e(String str, S1.d dVar) {
        this.f747h.e(str, dVar);
    }

    @Override // S1.f
    public final void f(String str, ByteBuffer byteBuffer) {
        this.f747h.f(str, byteBuffer);
    }

    @Override // S1.f
    public final void h(String str, ByteBuffer byteBuffer, S1.e eVar) {
        this.f747h.h(str, byteBuffer, eVar);
    }

    @Override // S1.f
    public final p074x1.a l() {
        return ((j) this.f747h.e).b(new S1.k());
    }
}
