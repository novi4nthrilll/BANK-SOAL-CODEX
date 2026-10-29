package u2;

import B2.h;
import B2.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends b implements B2.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5759g;

    public f(int i3, p063s2.d dVar) {
        super(dVar);
        this.f5759g = i3;
    }

    @Override // B2.f
    public final int d() {
        return this.f5759g;
    }

    @Override // u2.b
    public final String toString() {
        if (this.f5755d != null) {
            return super.toString();
        }
        q.f129a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        h.d(string, "renderLambdaToString(...)");
        return string;
    }
}
