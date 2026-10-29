package io.flutter.plugin.editing;

import B.C0011l;
import E0.n;
import R1.m;
import R1.o;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.i;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f4691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManager f4692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f4693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A0.g f4694d;
    public C0011l e = new C0011l(1, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f4695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray f4696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f4697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f4699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f4700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final io.flutter.plugin.platform.h f4701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Rect f4702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f4703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f4704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4705p;

    public h(View view, A0.g gVar, A0.f fVar, i iVar, io.flutter.plugin.platform.h hVar) {
        this.f4691a = view;
        this.f4697h = new e(null, view);
        this.f4692b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            this.f4693c = C.f.i(view.getContext().getSystemService(C.f.o()));
        } else {
            this.f4693c = null;
        }
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f4703n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f4694d = gVar;
        gVar.f19f = new p006b1.c(this);
        ((n) gVar.e).b("TextInputClient.requestExistingInputState", null, null);
        this.f4700k = iVar;
        iVar.e = this;
        this.f4701l = hVar;
        hVar.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r10 == r0.e) goto L38;
     */
    @Override // io.flutter.plugin.editing.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r17) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.h.a(boolean):void");
    }

    public final void b() {
        this.f4700k.e = null;
        this.f4701l.getClass();
        this.f4694d.f19f = null;
        c();
        this.f4697h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f4703n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void c() {
        AutofillManager autofillManager;
        m mVar;
        n nVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f4693c) == null || (mVar = this.f4695f) == null || (nVar = mVar.f1501j) == null || this.f4696g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f4691a, ((String) nVar.f236d).hashCode());
    }

    public final void d(m mVar) {
        n nVar;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (mVar == null || (nVar = mVar.f1501j) == null) {
            this.f4696g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f4696g = sparseArray;
        m[] mVarArr = mVar.f1503l;
        if (mVarArr == null) {
            sparseArray.put(((String) nVar.f236d).hashCode(), mVar);
            return;
        }
        for (m mVar2 : mVarArr) {
            n nVar2 = mVar2.f1501j;
            if (nVar2 != null) {
                SparseArray sparseArray2 = this.f4696g;
                String str = (String) nVar2.f236d;
                sparseArray2.put(str.hashCode(), mVar2);
                this.f4693c.notifyValueChanged(this.f4691a, str.hashCode(), AutofillValue.forText(((o) nVar2.f237f).f1507a));
            }
        }
    }
}
