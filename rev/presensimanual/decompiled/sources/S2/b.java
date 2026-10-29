package S2;

import B2.h;
import R2.l;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import p013d1.AbstractC0546x;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R2.b f1601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final R2.b f1602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R2.b f1603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final R2.b f1604d;
    public static final R2.b e;

    static {
        R2.b bVar = R2.b.f1512g;
        f1601a = AbstractC0546x.a("/");
        f1602b = AbstractC0546x.a("\\");
        f1603c = AbstractC0546x.a("/\\");
        f1604d = AbstractC0546x.a(".");
        e = AbstractC0546x.a("..");
    }

    public static final int a(l lVar) {
        if (lVar.f1532d.b() == 0) {
            return -1;
        }
        R2.b bVar = lVar.f1532d;
        if (bVar.g(0) != 47) {
            if (bVar.g(0) != 92) {
                if (bVar.b() <= 2 || bVar.g(1) != 58 || bVar.g(2) != 92) {
                    return -1;
                }
                char cG = (char) bVar.g(0);
                return (('a' > cG || cG >= '{') && ('A' > cG || cG >= '[')) ? -1 : 3;
            }
            if (bVar.b() > 2 && bVar.g(1) == 92) {
                R2.b bVar2 = f1602b;
                h.e(bVar2, "other");
                int iD = bVar.d(bVar2.f1513d, 2);
                return iD == -1 ? bVar.b() : iD;
            }
        }
        return 1;
    }

    public static final l b(l lVar, l lVar2, boolean z2) {
        h.e(lVar, "<this>");
        h.e(lVar2, "child");
        if (a(lVar2) != -1 || lVar2.g() != null) {
            return lVar2;
        }
        R2.b bVarC = c(lVar);
        if (bVarC == null && (bVarC = c(lVar2)) == null) {
            bVarC = f(l.e);
        }
        R2.a aVar = new R2.a();
        aVar.m(lVar.f1532d);
        if (aVar.e > 0) {
            aVar.m(bVarC);
        }
        aVar.m(lVar2.f1532d);
        return d(aVar, z2);
    }

    public static final R2.b c(l lVar) {
        R2.b bVar = lVar.f1532d;
        R2.b bVar2 = f1601a;
        if (R2.b.e(bVar, bVar2) != -1) {
            return bVar2;
        }
        R2.b bVar3 = f1602b;
        if (R2.b.e(lVar.f1532d, bVar3) != -1) {
            return bVar3;
        }
        return null;
    }

    public static final l d(R2.a aVar, boolean z2) throws EOFException {
        R2.b bVar;
        R2.b bVar2;
        char cA;
        R2.b bVarG;
        R2.a aVar2 = new R2.a();
        R2.b bVarE = null;
        int i3 = 0;
        while (true) {
            if (!aVar.c(f1601a)) {
                bVar = f1602b;
                if (!aVar.c(bVar)) {
                    break;
                }
            }
            byte bD = aVar.d();
            if (bVarE == null) {
                bVarE = e(bD);
            }
            i3++;
        }
        boolean z3 = i3 >= 2 && h.a(bVarE, bVar);
        R2.b bVar3 = f1603c;
        if (z3) {
            h.b(bVarE);
            aVar2.m(bVarE);
            aVar2.m(bVarE);
        } else if (i3 > 0) {
            h.b(bVarE);
            aVar2.m(bVarE);
        } else {
            long jB = aVar.b(bVar3);
            if (bVarE == null) {
                bVarE = jB == -1 ? f(l.e) : e(aVar.a(jB));
            }
            if (h.a(bVarE, bVar)) {
                bVar2 = bVarE;
                if (aVar.e >= 2 && aVar.a(1L) == 58 && (('a' <= (cA = (char) aVar.a(0L)) && cA < '{') || ('A' <= cA && cA < '['))) {
                    if (jB == 2) {
                        aVar2.l(aVar, 3L);
                    } else {
                        aVar2.l(aVar, 2L);
                    }
                }
            } else {
                bVar2 = bVarE;
            }
            bVarE = bVar2;
        }
        boolean z4 = aVar2.e > 0;
        ArrayList arrayList = new ArrayList();
        while (true) {
            boolean z5 = aVar.e == 0;
            R2.b bVar4 = f1604d;
            if (z5) {
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (i4 > 0) {
                        aVar2.m(bVarE);
                    }
                    aVar2.m((R2.b) arrayList.get(i4));
                }
                if (aVar2.e == 0) {
                    aVar2.m(bVar4);
                }
                return new l(aVar2.g(aVar2.e));
            }
            long jB2 = aVar.b(bVar3);
            if (jB2 == -1) {
                bVarG = aVar.g(aVar.e);
            } else {
                bVarG = aVar.g(jB2);
                aVar.d();
            }
            R2.b bVar5 = e;
            if (h.a(bVarG, bVar5)) {
                if (!z4 || !arrayList.isEmpty()) {
                    if (z2) {
                        if (!z4) {
                            if (!arrayList.isEmpty()) {
                                if (arrayList.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                if (h.a(arrayList.get(arrayList.size() - 1), bVar5)) {
                                }
                            }
                            arrayList.add(bVarG);
                        }
                        if ((!z3 || arrayList.size() != 1) && !arrayList.isEmpty()) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    } else {
                        arrayList.add(bVarG);
                    }
                }
            } else if (!h.a(bVarG, bVar4) && !h.a(bVarG, R2.b.f1512g)) {
                arrayList.add(bVarG);
            }
        }
    }

    public static final R2.b e(byte b3) {
        if (b3 == 47) {
            return f1601a;
        }
        if (b3 == 92) {
            return f1602b;
        }
        throw new IllegalArgumentException(I.f("not a directory separator: ", b3));
    }

    public static final R2.b f(String str) {
        if (h.a(str, "/")) {
            return f1601a;
        }
        if (h.a(str, "\\")) {
            return f1602b;
        }
        throw new IllegalArgumentException(I.g("not a directory separator: ", str));
    }
}
