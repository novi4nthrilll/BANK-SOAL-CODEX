package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0379x implements n1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3485a;

    @Override // n1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f3485a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                n1.e eVar = (n1.e) obj2;
                eVar.c(C0389y.f3491g, entry.getKey());
                eVar.c(C0389y.f3492h, entry.getValue());
                return;
            default:
                throw new n1.b("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
