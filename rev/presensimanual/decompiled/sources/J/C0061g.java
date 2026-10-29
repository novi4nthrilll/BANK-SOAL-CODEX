package J;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013d1.AbstractC0449g3;

/* JADX INFO: renamed from: J.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0061g extends u2.f implements A2.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Iterator f623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f628m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0061g(List list, ArrayList arrayList, p063s2.d dVar) {
        super(2, dVar);
        this.f627l = list;
        this.f628m = arrayList;
    }

    @Override // u2.b
    public final p063s2.d b(Object obj, p063s2.d dVar) {
        C0061g c0061g = new C0061g(this.f627l, this.f628m, dVar);
        c0061g.f626k = obj;
        return c0061g;
    }

    @Override // A2.p
    public final Object h(Object obj, Object obj2) {
        return ((C0061g) b(obj, (p063s2.d) obj2)).j(p055q2.g.f5603a);
    }

    @Override // u2.b
    public final Object j(Object obj) {
        Iterator it;
        List list;
        int i3 = this.f625j;
        if (i3 == 0) {
            AbstractC0449g3.b(obj);
            obj = this.f626k;
            it = this.f627l.iterator();
            list = this.f628m;
        } else if (i3 == 1) {
            Object obj2 = this.f624i;
            Iterator it2 = this.f623h;
            List list2 = (List) this.f626k;
            AbstractC0449g3.b(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0060f(1, null));
                this.f626k = list2;
                this.f623h = it2;
                this.f624i = null;
                this.f625j = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f623h;
            list = (List) this.f626k;
            AbstractC0449g3.b(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f626k = list;
        this.f623h = it;
        this.f624i = obj;
        this.f625j = 1;
        throw null;
    }
}
