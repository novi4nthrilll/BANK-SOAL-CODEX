package p016e1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: e1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0629l implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4232d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0653p f4234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0653p f4236i;

    public C0629l(C0653p c0653p, int i3) {
        this.f4235h = i3;
        this.f4236i = c0653p;
        this.f4234g = c0653p;
        this.f4232d = c0653p.f4276h;
        this.e = c0653p.isEmpty() ? -1 : 0;
        this.f4233f = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c0641n;
        C0653p c0653p = this.f4234g;
        if (c0653p.f4276h != this.f4232d) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.e;
        this.f4233f = i3;
        switch (this.f4235h) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Object[] objArr = this.f4236i.f4274f;
                objArr.getClass();
                c0641n = objArr[i3];
                break;
            case 1:
                c0641n = new C0641n(this.f4236i, i3);
                break;
            default:
                Object[] objArr2 = this.f4236i.f4275g;
                objArr2.getClass();
                c0641n = objArr2[i3];
                break;
        }
        int i4 = this.e + 1;
        if (i4 >= c0653p.f4277i) {
            i4 = -1;
        }
        this.e = i4;
        return c0641n;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C0653p c0653p = this.f4234g;
        int i3 = c0653p.f4276h;
        int i4 = this.f4232d;
        if (i3 != i4) {
            throw new ConcurrentModificationException();
        }
        int i5 = this.f4233f;
        if (!(i5 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f4232d = i4 + 32;
        Object[] objArr = c0653p.f4274f;
        objArr.getClass();
        c0653p.remove(objArr[i5]);
        this.e--;
        this.f4233f = -1;
    }
}
