package io.flutter.plugin.platform;

import B.C0006g;
import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J1.h f4710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f4711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I1.p f4712c;
    public C0006g e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FlutterJNI f4713d = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Surface f4719k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SurfaceControl f4720l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p006b1.c f4721m = new p006b1.c(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f4714f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray f4715g = new SparseArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f4716h = new SparseArray();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f4717i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f4718j = new ArrayList();

    public h() {
        if (A0.g.f16g == null) {
            A0.g.f16g = new A0.g(6);
        }
    }

    @Override // io.flutter.plugin.platform.f
    public final void a() {
        this.f4714f.f4706a = null;
    }

    @Override // io.flutter.plugin.platform.f
    public final void b(io.flutter.view.m mVar) {
        this.f4714f.f4706a = mVar;
    }

    @Override // io.flutter.plugin.platform.f
    public final boolean c(int i3) {
        return false;
    }

    @Override // io.flutter.plugin.platform.f
    public final void d(int i3) {
        if (this.f4715g.get(i3) != null) {
            throw new ClassCastException();
        }
    }
}
