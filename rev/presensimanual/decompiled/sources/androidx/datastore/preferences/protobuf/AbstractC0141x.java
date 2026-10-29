package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0141x implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0143z f2353d;
    public AbstractC0143z e;

    public AbstractC0141x(AbstractC0143z abstractC0143z) {
        this.f2353d = abstractC0143z;
        if (abstractC0143z.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.e = abstractC0143z.k();
    }

    public final AbstractC0143z a() {
        AbstractC0143z abstractC0143zB = b();
        abstractC0143zB.getClass();
        if (AbstractC0143z.h(abstractC0143zB, true)) {
            return abstractC0143zB;
        }
        throw new i0();
    }

    public final AbstractC0143z b() {
        if (!this.e.i()) {
            return this.e;
        }
        AbstractC0143z abstractC0143z = this.e;
        abstractC0143z.getClass();
        Z z2 = Z.f2263c;
        z2.getClass();
        z2.a(abstractC0143z.getClass()).h(abstractC0143z);
        abstractC0143z.j();
        return this.e;
    }

    public final void c() {
        if (this.e.i()) {
            return;
        }
        AbstractC0143z abstractC0143zK = this.f2353d.k();
        AbstractC0143z abstractC0143z = this.e;
        Z z2 = Z.f2263c;
        z2.getClass();
        z2.a(abstractC0143zK.getClass()).c(abstractC0143zK, abstractC0143z);
        this.e = abstractC0143zK;
    }

    public final Object clone() {
        AbstractC0141x abstractC0141x = (AbstractC0141x) this.f2353d.e(5);
        abstractC0141x.e = b();
        return abstractC0141x;
    }
}
