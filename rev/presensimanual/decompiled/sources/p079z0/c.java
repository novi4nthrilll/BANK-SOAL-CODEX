package p079z0;

import A0.f;
import F0.i;
import java.io.Closeable;
import p053p2.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f5939d;
    public f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f5940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f5941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f5942h;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((i) ((F0.c) this.f5941g.get())).close();
    }
}
