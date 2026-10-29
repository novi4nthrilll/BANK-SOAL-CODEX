package p016e1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: e1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0694w implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f4340d;

    public C0694w(Iterator it) {
        it.getClass();
        this.f4340d = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4340d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return ((Map.Entry) this.f4340d.next()).getValue();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f4340d.remove();
    }
}
