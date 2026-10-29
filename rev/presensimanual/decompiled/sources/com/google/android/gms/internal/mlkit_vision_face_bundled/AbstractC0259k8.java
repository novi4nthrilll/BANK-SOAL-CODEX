package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_face_bundled.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0259k8 implements Cloneable, E8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0299o8 f3218d;
    public AbstractC0299o8 e;

    public AbstractC0259k8(AbstractC0299o8 abstractC0299o8) {
        this.f3218d = abstractC0299o8;
        if (abstractC0299o8.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.e = (AbstractC0299o8) abstractC0299o8.k(4, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.E8
    public final boolean a() {
        return AbstractC0299o8.h(this.e, false);
    }

    public final AbstractC0299o8 b() {
        AbstractC0299o8 abstractC0299o8C = c();
        if (AbstractC0299o8.h(abstractC0299o8C, true)) {
            return abstractC0299o8C;
        }
        throw new R8();
    }

    public AbstractC0299o8 c() {
        if (!this.e.i()) {
            return this.e;
        }
        AbstractC0299o8 abstractC0299o8 = this.e;
        abstractC0299o8.getClass();
        K8.f2835c.a(abstractC0299o8.getClass()).a(abstractC0299o8);
        abstractC0299o8.e();
        return this.e;
    }

    public final Object clone() {
        AbstractC0259k8 abstractC0259k8 = (AbstractC0259k8) this.f3218d.k(5, null);
        abstractC0259k8.e = c();
        return abstractC0259k8;
    }

    public /* bridge */ U7 d() {
        return c();
    }

    public final void e() {
        if (this.e.i()) {
            return;
        }
        f();
    }

    public void f() {
        AbstractC0299o8 abstractC0299o8 = (AbstractC0299o8) this.f3218d.k(4, null);
        K8.f2835c.a(abstractC0299o8.getClass()).e(abstractC0299o8, this.e);
        this.e = abstractC0299o8;
    }
}
