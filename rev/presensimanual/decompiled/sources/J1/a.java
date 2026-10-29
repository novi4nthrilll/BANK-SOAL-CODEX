package J1;

import android.util.SparseArray;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f692a;

    public a(c cVar) {
        this.f692a = cVar;
    }

    @Override // J1.b
    public final void a() {
        c cVar = this.f692a;
        Iterator it = cVar.f713t.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.i iVar = cVar.f711r;
            SparseArray sparseArray = iVar.f4730j;
            if (sparseArray.size() <= 0) {
                break;
            }
            iVar.f4740t.m(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.h hVar = cVar.f712s;
            SparseArray sparseArray2 = hVar.f4715g;
            if (sparseArray2.size() <= 0) {
                cVar.f704k.f1484b = null;
                return;
            } else {
                hVar.f4721m.f(sparseArray2.keyAt(0));
            }
        }
    }

    @Override // J1.b
    public final void b() {
    }
}
