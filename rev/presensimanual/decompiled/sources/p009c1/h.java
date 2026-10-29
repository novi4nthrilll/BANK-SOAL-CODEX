package p009c1;

import java.util.AbstractMap;
import java.util.Objects;
import p013d1.B2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f2653f;

    public h(i iVar) {
        this.f2653f = iVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i3) {
        i iVar = this.f2653f;
        B2.a(i3, iVar.f2656h);
        int i4 = i3 + i3;
        Object[] objArr = iVar.f2655g;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2653f.f2656h;
    }
}
