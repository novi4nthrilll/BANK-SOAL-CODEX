package B2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements f, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f122d;

    public i(int i3) {
        this.f122d = i3;
    }

    @Override // B2.f
    public final int d() {
        return this.f122d;
    }

    public final String toString() {
        q.f129a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        h.d(string, "renderLambdaToString(...)");
        return string;
    }
}
