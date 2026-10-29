package Y;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1836a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1837b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1838c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1839d;
    public final /* synthetic */ StaggeredGridLayoutManager e;

    public J(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.e = staggeredGridLayoutManager;
        this.f1839d = i3;
    }

    public final int a(int i3) {
        int i4 = this.f1838c;
        if (i4 != Integer.MIN_VALUE) {
            return i4;
        }
        if (this.f1836a.size() == 0) {
            return i3;
        }
        ArrayList arrayList = this.f1836a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        G g3 = (G) view.getLayoutParams();
        this.f1838c = this.e.f2495j.d(view);
        g3.getClass();
        return this.f1838c;
    }
}
