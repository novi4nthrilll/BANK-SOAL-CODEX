package p013d1;

import A2.l;
import B2.p;
import J.C0059e;
import J.C0061g;
import J.C0065k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p055q2.g;
import t2.a;
import u2.b;

/* JADX INFO: renamed from: d1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0475l {
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0067->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    public static final Object a(List list, C0065k c0065k, b bVar) throws Throwable {
        C0059e c0059e;
        List list2;
        p pVar;
        Iterator it;
        Throwable th;
        l lVar;
        if (bVar instanceof C0059e) {
            c0059e = (C0059e) bVar;
            int i3 = c0059e.f621j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0059e.f621j = i3 - Integer.MIN_VALUE;
            } else {
                c0059e = new C0059e(bVar);
            }
        } else {
            c0059e = new C0059e(bVar);
        }
        Object obj = c0059e.f620i;
        Object obj2 = a.f5737d;
        int i4 = c0059e.f621j;
        if (i4 != 0) {
            if (i4 == 1) {
                list2 = (List) c0059e.f618g;
                AbstractC0449g3.b(obj);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = c0059e.f619h;
                pVar = (p) c0059e.f618g;
                try {
                    AbstractC0449g3.b(obj);
                } catch (Throwable th2) {
                    Object obj3 = pVar.f128d;
                    if (obj3 == null) {
                        pVar.f128d = th2;
                    } else {
                        AbstractC0443f3.a((Throwable) obj3, th2);
                    }
                }
            }
            while (it.hasNext()) {
                lVar = (l) it.next();
                c0059e.f618g = pVar;
                c0059e.f619h = it;
                c0059e.f621j = 2;
                if (lVar.i(c0059e) == obj2) {
                    return obj2;
                }
            }
            th = (Throwable) pVar.f128d;
            if (th == null) {
                return g.f5603a;
            }
            throw th;
        }
        AbstractC0449g3.b(obj);
        ArrayList arrayList = new ArrayList();
        C0061g c0061g = new C0061g(list, arrayList, null);
        c0059e.f618g = arrayList;
        c0059e.f621j = 1;
        if (c0065k.a(c0061g, c0059e) == obj2) {
            return obj2;
        }
        list2 = arrayList;
        pVar = new p();
        it = list2.iterator();
        while (it.hasNext()) {
            lVar = (l) it.next();
            c0059e.f618g = pVar;
            c0059e.f619h = it;
            c0059e.f621j = 2;
            if (lVar.i(c0059e) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) pVar.f128d;
        if (th == null) {
            return g.f5603a;
        }
        throw th;
    }
}
