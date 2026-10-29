package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class B7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2748b;

    public B7(Context context, A7 a7, int i3) {
        this.f2747a = i3;
        switch (i3) {
            case 1:
                p073x0.a aVar = p073x0.a.e;
                p079z0.h.b(context);
                final D0.b bVarC = p079z0.h.a().c(aVar);
                if (p073x0.a.f5822d.contains(new p070w0.b("json"))) {
                    final int i4 = 0;
                    new p040l1.n(new p058r1.a() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.G7
                        @Override // p058r1.a
                        public final Object get() {
                            switch (i4) {
                                case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                                    return bVarC.E(new p070w0.b("json"), new H7(6));
                                default:
                                    return bVarC.E(new p070w0.b("proto"), new H7(5));
                            }
                        }
                    });
                }
                final int i5 = 1;
                this.f2748b = new p040l1.n(new p058r1.a() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.G7
                    @Override // p058r1.a
                    public final Object get() {
                        switch (i5) {
                            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                                return bVarC.E(new p070w0.b("json"), new H7(6));
                            default:
                                return bVarC.E(new p070w0.b("proto"), new H7(5));
                        }
                    }
                });
                break;
            default:
                ArrayList arrayList = new ArrayList();
                this.f2748b = arrayList;
                arrayList.add(new B7(context, a7, 1));
                break;
        }
    }

    public final void a(E0.i iVar) {
        switch (this.f2747a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Iterator it = ((ArrayList) this.f2748b).iterator();
                while (it.hasNext()) {
                    ((B7) it.next()).a(iVar);
                }
                break;
            default:
                ((p079z0.g) ((p040l1.n) this.f2748b).get()).a(iVar.e != 0 ? new p070w0.a(iVar.f(), p070w0.c.f5774d) : new p070w0.a(iVar.f(), p070w0.c.e));
                break;
        }
    }
}
