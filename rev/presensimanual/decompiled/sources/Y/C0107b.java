package Y;

import java.util.ArrayList;

/* JADX INFO: renamed from: Y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0107b extends r {
    public ArrayList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f1845f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f1846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f1847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f1848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f1849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f1850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f1851l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f1852m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f1853n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f1854o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // Y.r
    public final void a() {
        ArrayList arrayList = this.f1846g;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            A0.c.o(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            if (arrayList2.get(size2) != null) {
                throw new ClassCastException();
            }
            if (this.f1901a != null) {
                throw null;
            }
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f1845f;
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList4 = this.f1847h;
        int size4 = arrayList4.size() - 1;
        if (size4 >= 0) {
            A0.c.o(arrayList4.get(size4));
            throw null;
        }
        arrayList4.clear();
        if (b()) {
            ArrayList arrayList5 = this.f1849j;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                int size6 = arrayList6.size() - 1;
                if (size6 >= 0) {
                    A0.c.o(arrayList6.get(size6));
                    throw null;
                }
            }
            ArrayList arrayList7 = this.f1848i;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                int size8 = arrayList8.size() - 1;
                if (size8 >= 0) {
                    arrayList8.get(size8).getClass();
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList9 = this.f1850k;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size() - 1;
                if (size10 >= 0) {
                    A0.c.o(arrayList10.get(size10));
                    throw null;
                }
            }
            c(this.f1853n);
            c(this.f1852m);
            c(this.f1851l);
            c(this.f1854o);
            ArrayList arrayList11 = this.f1902b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // Y.r
    public final boolean b() {
        return (this.f1845f.isEmpty() && this.f1847h.isEmpty() && this.f1846g.isEmpty() && this.e.isEmpty() && this.f1852m.isEmpty() && this.f1853n.isEmpty() && this.f1851l.isEmpty() && this.f1854o.isEmpty() && this.f1849j.isEmpty() && this.f1848i.isEmpty() && this.f1850k.isEmpty()) ? false : true;
    }
}
