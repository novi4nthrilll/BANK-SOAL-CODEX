package p009c1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient l f2657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient k f2658g;

    public j(l lVar, k kVar) {
        this.f2657f = lVar;
        this.f2658g = kVar;
    }

    @Override // p009c1.a
    public final int c(Object[] objArr) {
        return this.f2658g.c(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2657f.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f2658g.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2657f.f2667i;
    }
}
