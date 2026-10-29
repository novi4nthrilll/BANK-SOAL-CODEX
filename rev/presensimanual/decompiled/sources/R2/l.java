package R2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {
    public static final String e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f1532d;

    static {
        String str = File.separator;
        B2.h.d(str, "separator");
        e = str;
    }

    public l(b bVar) {
        B2.h.e(bVar, "bytes");
        this.f1532d = bVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = S2.b.a(this);
        b bVar = this.f1532d;
        if (iA == -1) {
            iA = 0;
        } else if (iA < bVar.b() && bVar.g(iA) == 92) {
            iA++;
        }
        int iB = bVar.b();
        int i3 = iA;
        while (iA < iB) {
            if (bVar.g(iA) == 47 || bVar.g(iA) == 92) {
                arrayList.add(bVar.l(i3, iA));
                i3 = iA + 1;
            }
            iA++;
        }
        if (i3 < bVar.b()) {
            arrayList.add(bVar.l(i3, bVar.b()));
        }
        return arrayList;
    }

    public final String b() {
        b bVar = S2.b.f1601a;
        b bVar2 = S2.b.f1601a;
        b bVarM = this.f1532d;
        int i3 = b.i(bVarM, bVar2);
        if (i3 == -1) {
            i3 = b.i(bVarM, S2.b.f1602b);
        }
        if (i3 != -1) {
            bVarM = b.m(bVarM, i3 + 1, 0, 2);
        } else if (g() != null && bVarM.b() == 2) {
            bVarM = b.f1512g;
        }
        return bVarM.n();
    }

    public final l c() {
        b bVar = S2.b.f1604d;
        b bVar2 = this.f1532d;
        if (B2.h.a(bVar2, bVar)) {
            return null;
        }
        b bVar3 = S2.b.f1601a;
        if (B2.h.a(bVar2, bVar3)) {
            return null;
        }
        b bVar4 = S2.b.f1602b;
        if (B2.h.a(bVar2, bVar4)) {
            return null;
        }
        b bVar5 = S2.b.e;
        bVar2.getClass();
        B2.h.e(bVar5, "suffix");
        int iB = bVar2.b();
        byte[] bArr = bVar5.f1513d;
        if (bVar2.j(iB - bArr.length, bVar5, bArr.length) && (bVar2.b() == 2 || bVar2.j(bVar2.b() - 3, bVar3, 1) || bVar2.j(bVar2.b() - 3, bVar4, 1))) {
            return null;
        }
        int i3 = b.i(bVar2, bVar3);
        if (i3 == -1) {
            i3 = b.i(bVar2, bVar4);
        }
        if (i3 == 2 && g() != null) {
            if (bVar2.b() == 3) {
                return null;
            }
            return new l(b.m(bVar2, 0, 3, 1));
        }
        if (i3 == 1) {
            B2.h.e(bVar4, "prefix");
            if (bVar2.j(0, bVar4, bVar4.f1513d.length)) {
                return null;
            }
        }
        if (i3 != -1 || g() == null) {
            if (i3 == -1) {
                return new l(bVar);
            }
            return i3 == 0 ? new l(b.m(bVar2, 0, 1, 1)) : new l(b.m(bVar2, 0, i3, 1));
        }
        if (bVar2.b() == 2) {
            return null;
        }
        return new l(b.m(bVar2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        B2.h.e(lVar, "other");
        return this.f1532d.compareTo(lVar.f1532d);
    }

    public final l d(String str) {
        B2.h.e(str, "child");
        a aVar = new a();
        aVar.p(str);
        return S2.b.b(this, S2.b.d(aVar, false), false);
    }

    public final File e() {
        return new File(this.f1532d.n());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && B2.h.a(((l) obj).f1532d, this.f1532d);
    }

    public final Path f() {
        Path path = Paths.get(this.f1532d.n(), new String[0]);
        B2.h.d(path, "get(toString())");
        return path;
    }

    public final Character g() {
        b bVar = S2.b.f1601a;
        b bVar2 = this.f1532d;
        if (b.e(bVar2, bVar) != -1 || bVar2.b() < 2 || bVar2.g(1) != 58) {
            return null;
        }
        char cG = (char) bVar2.g(0);
        if (('a' > cG || cG >= '{') && ('A' > cG || cG >= '[')) {
            return null;
        }
        return Character.valueOf(cG);
    }

    public final int hashCode() {
        return this.f1532d.hashCode();
    }

    public final String toString() {
        return this.f1532d.n();
    }
}
