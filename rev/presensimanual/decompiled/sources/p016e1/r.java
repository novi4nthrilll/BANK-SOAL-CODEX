package p016e1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC0611i implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4297d;
    public final C0605h e;

    public r(Object obj, C0605h c0605h) {
        this.f4297d = obj;
        this.e = c0605h;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4297d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
