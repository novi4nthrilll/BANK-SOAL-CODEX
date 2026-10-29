package p016e1;

import java.util.Map;
import p013d1.M2;

/* JADX INFO: renamed from: e1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0641n extends AbstractC0611i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4251d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0653p f4252f;

    public C0641n(C0653p c0653p, int i3) {
        this.f4252f = c0653p;
        Object[] objArr = c0653p.f4274f;
        objArr.getClass();
        this.f4251d = objArr[i3];
        this.e = i3;
    }

    public final void a() {
        int i3 = this.e;
        Object obj = this.f4251d;
        C0653p c0653p = this.f4252f;
        if (i3 != -1 && i3 < c0653p.size()) {
            int i4 = this.e;
            Object[] objArr = c0653p.f4274f;
            objArr.getClass();
            if (M2.a(obj, objArr[i4])) {
                return;
            }
        }
        Object obj2 = C0653p.f4272m;
        this.e = c0653p.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4251d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0653p c0653p = this.f4252f;
        Map mapA = c0653p.a();
        if (mapA != null) {
            return mapA.get(this.f4251d);
        }
        a();
        int i3 = this.e;
        if (i3 == -1) {
            return null;
        }
        Object[] objArr = c0653p.f4275g;
        objArr.getClass();
        return objArr[i3];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0653p c0653p = this.f4252f;
        Map mapA = c0653p.a();
        Object obj2 = this.f4251d;
        if (mapA != null) {
            return mapA.put(obj2, obj);
        }
        a();
        int i3 = this.e;
        if (i3 == -1) {
            c0653p.put(obj2, obj);
            return null;
        }
        Object[] objArr = c0653p.f4275g;
        objArr.getClass();
        Object obj3 = objArr[i3];
        int i4 = this.e;
        Object[] objArr2 = c0653p.f4275g;
        objArr2.getClass();
        objArr2[i4] = obj;
        return obj3;
    }
}
