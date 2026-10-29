package p013d1;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
public final class V4 extends S4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W4 f3656f;

    public V4(W4 w4) {
        this.f3656f = w4;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i3) {
        W4 w4 = this.f3656f;
        E2.a(i3, w4.f3662h);
        int i4 = i3 + i3;
        Object[] objArr = w4.f3661g;
        Object obj = objArr[i4];
        obj.getClass();
        Object obj2 = objArr[i4 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3656f.f3662h;
    }
}
