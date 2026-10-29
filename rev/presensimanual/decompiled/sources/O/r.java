package O;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f1215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f1216b;

    public r(int i3) {
        this.f1215a = new SparseArray(i3);
    }

    public final void a(n nVar, int i3, int i4) {
        int iA = nVar.a(i3);
        SparseArray sparseArray = this.f1215a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(iA);
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(nVar.a(i3), rVar);
        }
        if (i4 > i3) {
            rVar.a(nVar, i3 + 1, i4);
        } else {
            rVar.f1216b = nVar;
        }
    }
}
