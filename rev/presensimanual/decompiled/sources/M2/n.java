package M2;

import I2.C0049u;
import I2.S;
import I2.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013d1.AbstractC0473k3;

/* JADX INFO: loaded from: classes.dex */
public final class n extends u2.b implements L2.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final L2.e f1014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p063s2.i f1015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p063s2.i f1017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p063s2.d f1018k;

    public n(L2.e eVar, p063s2.i iVar) {
        super(k.f1012d, p063s2.j.f5670d);
        this.f1014g = eVar;
        this.f1015h = iVar;
        this.f1016i = ((Number) iVar.c(0, m.e)).intValue();
    }

    @Override // L2.e
    public final Object c(Object obj, p063s2.d dVar) {
        try {
            Object objP = p(dVar, obj);
            return objP == t2.a.f5737d ? objP : p055q2.g.f5603a;
        } catch (Throwable th) {
            this.f1017j = new i(th, dVar.g());
            throw th;
        }
    }

    @Override // u2.b, u2.c
    public final u2.c e() {
        p063s2.d dVar = this.f1018k;
        if (dVar instanceof u2.c) {
            return (u2.c) dVar;
        }
        return null;
    }

    @Override // u2.b
    public final StackTraceElement f() {
        return null;
    }

    @Override // u2.b, p063s2.d
    public final p063s2.i g() {
        p063s2.i iVar = this.f1017j;
        return iVar == null ? p063s2.j.f5670d : iVar;
    }

    @Override // u2.b
    public final Object j(Object obj) {
        Throwable thA = p055q2.d.a(obj);
        if (thA != null) {
            this.f1017j = new i(thA, g());
        }
        p063s2.d dVar = this.f1018k;
        if (dVar != null) {
            dVar.l(obj);
        }
        return t2.a.f5737d;
    }

    public final Object p(p063s2.d dVar, Object obj) {
        List listA;
        Comparable comparable;
        String strSubstring;
        p063s2.i iVarG = dVar.g();
        S s3 = (S) iVarG.f(C0049u.e);
        if (s3 != null && !s3.b()) {
            throw ((b0) s3).A();
        }
        p063s2.i iVar = this.f1017j;
        if (iVar != iVarG) {
            int i3 = 0;
            if (iVar instanceof i) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f1011d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                B2.h.e(str, "<this>");
                H2.b bVar = new H2.b(str);
                if (bVar.hasNext()) {
                    Object next = bVar.next();
                    if (bVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (bVar.hasNext()) {
                            arrayList.add(bVar.next());
                        }
                        listA = arrayList;
                    } else {
                        listA = AbstractC0473k3.a(next);
                    }
                } else {
                    listA = p059r2.l.f5624d;
                }
                List list = listA;
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!H2.i.e((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(p059r2.f.c(arrayList2));
                for (String str2 : arrayList2) {
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList3.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listA.size();
                int size = listA.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str3 = (String) obj3;
                    if ((i3 == 0 || i3 == size) && H2.i.e(str3)) {
                        strSubstring = null;
                    } else {
                        B2.h.e(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + iIntValue + " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        B2.h.d(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList4.add(strSubstring);
                    }
                    i3 = i4;
                }
                StringBuilder sb = new StringBuilder(length3);
                p059r2.d.d(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) iVarG.c(0, new q(this))).intValue() != this.f1016i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1015h + ",\n\t\tbut emission happened in " + iVarG + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f1017j = iVarG;
        }
        this.f1018k = dVar;
        o oVar = p.f1020a;
        L2.e eVar = this.f1014g;
        B2.h.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object objC = eVar.c(obj, this);
        if (!B2.h.a(objC, t2.a.f5737d)) {
            this.f1018k = null;
        }
        return objC;
    }
}
