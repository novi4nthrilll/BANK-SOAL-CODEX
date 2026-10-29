package p045n;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5372d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5374g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f5375h;

    public g(k kVar, int i3) {
        this.f5375h = kVar;
        this.f5372d = i3;
        this.e = kVar.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5373f < this.e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objC = this.f5375h.c(this.f5373f, this.f5372d);
        this.f5373f++;
        this.f5374g = true;
        return objC;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5374g) {
            throw new IllegalStateException();
        }
        int i3 = this.f5373f - 1;
        this.f5373f = i3;
        this.e--;
        this.f5374g = false;
        this.f5375h.i(i3);
    }
}
