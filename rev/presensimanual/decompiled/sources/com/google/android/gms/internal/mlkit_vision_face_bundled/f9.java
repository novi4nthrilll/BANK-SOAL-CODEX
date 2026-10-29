package com.google.android.gms.internal.mlkit_vision_face_bundled;

import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class f9 extends AbstractC0259k8 implements E8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3068f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9(int i3, AbstractC0299o8 abstractC0299o8) {
        super(abstractC0299o8);
        this.f3068f = i3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0259k8
    public /* bridge */ /* synthetic */ AbstractC0299o8 c() {
        switch (this.f3068f) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return g();
            default:
                return super.c();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0259k8
    public /* bridge */ /* synthetic */ U7 d() {
        switch (this.f3068f) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return g();
            default:
                return super.d();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.AbstractC0259k8
    public void f() {
        switch (this.f3068f) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                super.f();
                AbstractC0299o8 abstractC0299o8 = this.e;
                if (((AbstractC0269l8) abstractC0299o8).zzb != C0229h8.f3081c) {
                    AbstractC0269l8 abstractC0269l8 = (AbstractC0269l8) abstractC0299o8;
                    abstractC0269l8.zzb = abstractC0269l8.zzb.clone();
                }
                break;
            default:
                super.f();
                break;
        }
    }

    public AbstractC0269l8 g() {
        if (!((AbstractC0269l8) this.e).i()) {
            return (AbstractC0269l8) this.e;
        }
        ((AbstractC0269l8) this.e).zzb.e();
        return (AbstractC0269l8) super.c();
    }
}
