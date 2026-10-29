package B2;

import I2.C0051w;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l implements F2.c, A2.l {
    @Override // B2.c
    public final F2.a b() {
        q.f129a.getClass();
        return this;
    }

    public final void f() {
        if (this.f124j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        F2.a aVarE = e();
        if (aVarE == this) {
            throw new C0051w("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((k) ((F2.c) aVarE)).f();
    }

    @Override // A2.l
    public final Object i(Object obj) {
        f();
        throw null;
    }
}
