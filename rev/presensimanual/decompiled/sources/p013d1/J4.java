package p013d1;

import W1.C0104l;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class J4 implements I4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3592a;

    public J4(Context context, H4 h4) {
        ArrayList arrayList = new ArrayList();
        this.f3592a = arrayList;
        arrayList.add(new M4(context, h4));
    }

    @Override // p013d1.I4
    public final void a(C0104l c0104l) {
        Iterator it = this.f3592a.iterator();
        while (it.hasNext()) {
            ((I4) it.next()).a(c0104l);
        }
    }
}
