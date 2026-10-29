package p042m;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f5341d;
    public boolean e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f5342f;

    public d(f fVar) {
        this.f5342f = fVar;
    }

    @Override // p042m.e
    public final void a(c cVar) {
        c cVar2 = this.f5341d;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f5340g;
            this.f5341d = cVar3;
            this.e = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e) {
            return this.f5342f.f5343d != null;
        }
        c cVar = this.f5341d;
        return (cVar == null || cVar.f5339f == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.e) {
            this.e = false;
            this.f5341d = this.f5342f.f5343d;
        } else {
            c cVar = this.f5341d;
            this.f5341d = cVar != null ? cVar.f5339f : null;
        }
        return this.f5341d;
    }
}
