package p063s2;

import A2.p;
import B2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements i, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f5670d = new j();

    @Override // p063s2.i
    public final g f(h hVar) {
        h.e(hVar, "key");
        return null;
    }

    @Override // p063s2.i
    public final i h(i iVar) {
        h.e(iVar, "context");
        return iVar;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // p063s2.i
    public final i n(h hVar) {
        h.e(hVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // p063s2.i
    public final Object c(Object obj, p pVar) {
        return obj;
    }
}
