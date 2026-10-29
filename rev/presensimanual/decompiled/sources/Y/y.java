package Y;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1918d;
    public x e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1919f;

    public y(RecyclerView recyclerView) {
        this.f1919f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1915a = arrayList;
        this.f1916b = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f1917c = 2;
        this.f1918d = 2;
    }

    public final void a() {
        ArrayList arrayList = this.f1916b;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
            int[] iArr = RecyclerView.f2438k0;
            throw null;
        }
        arrayList.clear();
        if (RecyclerView.f2440m0) {
            C0112g c0112g = this.f1919f.f2462W;
            c0112g.getClass();
            c0112g.f1883c = 0;
        }
    }

    public final void b(int i3) {
        RecyclerView recyclerView = this.f1919f;
        if (i3 < 0 || i3 >= recyclerView.f2463a0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i3 + "(" + i3 + "). Item count:" + recyclerView.f2463a0.a() + recyclerView.h());
        }
        B b3 = recyclerView.f2463a0;
        boolean z2 = b3.f1813c;
        ArrayList arrayList = this.f1915a;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f2471g.f183g;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = this.f1916b;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int iA = recyclerView.f2469f.A(i3, 0);
        if (iA >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i3 + "(offset:" + iA + ").state:" + b3.a() + recyclerView.h());
    }

    public final void c() {
        s sVar = this.f1919f.f2479l;
        this.f1918d = this.f1917c;
        ArrayList arrayList = this.f1916b;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f1918d) {
            return;
        }
        if (arrayList.get(size) != null) {
            throw new ClassCastException();
        }
        int[] iArr = RecyclerView.f2438k0;
        throw null;
    }
}
