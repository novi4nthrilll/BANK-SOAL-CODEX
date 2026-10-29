package C2;

import B2.h;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f175f = new b(0);

    @Override // C2.a
    public final Random a() {
        Object obj = this.f175f.get();
        h.d(obj, "get(...)");
        return (Random) obj;
    }
}
