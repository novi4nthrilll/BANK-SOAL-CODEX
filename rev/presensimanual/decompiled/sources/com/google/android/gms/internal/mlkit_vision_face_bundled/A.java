package com.google.android.gms.internal.mlkit_vision_face_bundled;

import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.C0439f;

/* JADX INFO: loaded from: classes.dex */
public final class A implements n1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2734b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2735c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n1.c f2736d;
    public final n1.e e;

    public /* synthetic */ A(n1.e eVar, int i3) {
        this.f2733a = i3;
        this.e = eVar;
    }

    @Override // n1.g
    public final n1.g a(String str) {
        switch (this.f2733a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (this.f2734b) {
                    throw new n1.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f2734b = true;
                ((C0389y) this.e).a(this.f2736d, str, this.f2735c);
                return this;
            case 1:
                if (this.f2734b) {
                    throw new n1.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f2734b = true;
                ((C0439f) this.e).a(this.f2736d, str, this.f2735c);
                return this;
            default:
                if (this.f2734b) {
                    throw new n1.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f2734b = true;
                ((p016e1.K) this.e).a(this.f2736d, str, this.f2735c);
                return this;
        }
    }

    @Override // n1.g
    public final n1.g b(boolean z2) {
        switch (this.f2733a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (this.f2734b) {
                    throw new n1.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f2734b = true;
                ((C0389y) this.e).b(this.f2736d, z2 ? 1 : 0, this.f2735c);
                return this;
            case 1:
                if (this.f2734b) {
                    throw new n1.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f2734b = true;
                ((C0439f) this.e).b(this.f2736d, z2 ? 1 : 0, this.f2735c);
                return this;
            default:
                if (this.f2734b) {
                    throw new n1.b("Cannot encode a second value in the ValueEncoderContext");
                }
                this.f2734b = true;
                ((p016e1.K) this.e).b(this.f2736d, z2 ? 1 : 0, this.f2735c);
                return this;
        }
    }
}
