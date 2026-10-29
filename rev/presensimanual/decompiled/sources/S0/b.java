package S0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ b f1583a = new b();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        L0.c cVar = (L0.c) obj;
        L0.c cVar2 = (L0.c) obj2;
        return !cVar.f866a.equals(cVar2.f866a) ? cVar.f866a.compareTo(cVar2.f866a) : (cVar.a() > cVar2.a() ? 1 : (cVar.a() == cVar2.a() ? 0 : -1));
    }
}
