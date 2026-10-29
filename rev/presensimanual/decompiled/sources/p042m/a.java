package p042m;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f5335h = new HashMap();

    @Override // p042m.f
    public final c c(Object obj) {
        return (c) this.f5335h.get(obj);
    }

    @Override // p042m.f
    public final Object d(Object obj) {
        Object objD = super.d(obj);
        this.f5335h.remove(obj);
        return objD;
    }
}
