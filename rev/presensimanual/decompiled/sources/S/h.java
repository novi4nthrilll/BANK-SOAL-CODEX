package S;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f1572a;

    public List a() {
        ArrayList arrayList;
        if (this.f1572a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1572a) {
            arrayList = new ArrayList(this.f1572a);
        }
        return arrayList;
    }
}
