package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.content.Context;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class E7 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static C0260l f2769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f2770k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B7 f2773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p071w1.i f2774d;
    public final p033j1.k e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p033j1.k f2775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f2778i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        Objects.requireNonNull(objArr[0]);
        Objects.requireNonNull(objArr[1]);
        f2770k = new r(0, objArr);
    }

    public E7(Context context, final p071w1.i iVar, B7 b7) {
        new HashMap();
        this.f2771a = context.getPackageName();
        this.f2772b = p071w1.c.a(context);
        this.f2774d = iVar;
        this.f2773c = b7;
        H7.e();
        this.f2776g = "optional-module-face";
        p071w1.e eVarA = p071w1.e.a();
        final int i3 = 0;
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.D7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i3) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        E7 e7 = (E7) this;
                        e7.getClass();
                        return O0.h.f1272c.a(e7.f2776g);
                    default:
                        return ((p071w1.i) this).a();
                }
            }
        };
        eVarA.getClass();
        this.e = p071w1.e.b(callable);
        p071w1.e eVarA2 = p071w1.e.a();
        final int i4 = 1;
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.D7
            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i4) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                        E7 e7 = (E7) iVar;
                        e7.getClass();
                        return O0.h.f1272c.a(e7.f2776g);
                    default:
                        return ((p071w1.i) iVar).a();
                }
            }
        };
        eVarA2.getClass();
        this.f2775f = p071w1.e.b(callable2);
        r rVar = f2770k;
        this.f2777h = rVar.containsKey("optional-module-face") ? Y0.e.d(context, (String) rVar.get("optional-module-face"), false) : -1;
    }
}
