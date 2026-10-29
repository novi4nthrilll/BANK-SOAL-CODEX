package p016e1;

import java.util.AbstractMap;
import p013d1.H2;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0682u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B f3926f;

    public A(B b3) {
        this.f3926f = b3;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i3) {
        B b3 = this.f3926f;
        H2.a(i3, b3.f3932h);
        int i4 = i3 + i3;
        Object[] objArr = b3.f3931g;
        Object obj = objArr[i4];
        obj.getClass();
        Object obj2 = objArr[i4 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3926f.f3932h;
    }
}
