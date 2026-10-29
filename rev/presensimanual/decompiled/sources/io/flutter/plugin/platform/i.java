package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.y;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f4723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I1.p f4724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.l f4725d;
    public io.flutter.plugin.editing.h e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public A0.f f4726f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A0.g f4739s;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4734n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4735o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4736p = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f4740t = new y(6, this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J1.h f4722a = new J1.h(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f4728h = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f4727g = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f4729i = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SparseArray f4732l = new SparseArray();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashSet f4737q = new HashSet();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashSet f4738r = new HashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SparseArray f4733m = new SparseArray();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final SparseArray f4730j = new SparseArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SparseArray f4731k = new SparseArray();

    public i() {
        if (A0.g.f16g == null) {
            A0.g.f16g = new A0.g(6);
        }
        this.f4739s = A0.g.f16g;
    }

    @Override // io.flutter.plugin.platform.f
    public final void a() {
        this.f4727g.f4706a = null;
    }

    @Override // io.flutter.plugin.platform.f
    public final void b(io.flutter.view.m mVar) {
        this.f4727g.f4706a = mVar;
    }

    @Override // io.flutter.plugin.platform.f
    public final boolean c(int i3) {
        return this.f4728h.containsKey(Integer.valueOf(i3));
    }

    @Override // io.flutter.plugin.platform.f
    public final void d(int i3) {
        if (c(i3)) {
            ((o) this.f4728h.get(Integer.valueOf(i3))).getClass();
        } else if (this.f4730j.get(i3) != null) {
            throw new ClassCastException();
        }
    }

    public final void e() {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f4732l;
            if (i3 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i3);
            bVar.c();
            bVar.f373d.close();
            i3++;
        }
    }

    public final void f(boolean z2) {
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f4732l;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i3);
            b bVar = (b) sparseArray.valueAt(i3);
            if (this.f4737q.contains(Integer.valueOf(iKeyAt))) {
                J1.c cVar = this.f4724c.f398k;
                if (cVar != null) {
                    bVar.a(cVar.f696b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f4735o) {
                    bVar.c();
                }
                bVar.setVisibility(8);
                this.f4724c.removeView(bVar);
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f4731k;
            if (i4 >= sparseArray2.size()) {
                return;
            }
            int iKeyAt2 = sparseArray2.keyAt(i4);
            View view = (View) sparseArray2.get(iKeyAt2);
            if (!this.f4738r.contains(Integer.valueOf(iKeyAt2)) || (!z2 && this.f4736p)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.n] */
    public final void g() {
        if (!this.f4736p || this.f4735o) {
            return;
        }
        I1.p pVar = this.f4724c;
        pVar.f394g.b();
        I1.h hVar = pVar.f393f;
        if (hVar == null) {
            I1.h hVar2 = new I1.h(pVar.getContext(), pVar.getWidth(), pVar.getHeight(), 1);
            pVar.f393f = hVar2;
            pVar.addView(hVar2);
        } else {
            hVar.g(pVar.getWidth(), pVar.getHeight());
        }
        pVar.f395h = pVar.f394g;
        I1.h hVar3 = pVar.f393f;
        pVar.f394g = hVar3;
        J1.c cVar = pVar.f398k;
        if (cVar != null) {
            hVar3.a(cVar.f696b);
        }
        this.f4735o = true;
    }

    public final int h(double d3) {
        return (int) Math.round(d3 * ((double) this.f4723b.getResources().getDisplayMetrics().density));
    }
}
