package S2;

import B2.h;
import B2.m;
import B2.o;
import H2.i;
import R2.l;
import R2.p;
import R2.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import p013d1.AbstractC0469k;
import p013d1.AbstractC0479l3;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f1600a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final LinkedHashMap a(ArrayList arrayList) {
        List<d> listAsList;
        String str = l.e;
        l lVarE = p065t0.e.e("/", false);
        p055q2.b[] bVarArr = {new p055q2.b(lVarE, new d(lVarE))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0479l3.a(1));
        p055q2.b bVar = bVarArr[0];
        linkedHashMap.put(bVar.f5598d, bVar.e);
        e eVar = new e(0);
        if (arrayList.size() <= 1) {
            listAsList = p059r2.d.g(arrayList);
        } else {
            Object[] array = arrayList.toArray(new Object[0]);
            h.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, eVar);
            }
            listAsList = Arrays.asList(array);
            h.d(listAsList, "asList(...)");
        }
        for (d dVar : listAsList) {
            if (((d) linkedHashMap.put(dVar.f1607a, dVar)) == null) {
                while (true) {
                    l lVar = dVar.f1607a;
                    l lVarC = lVar.c();
                    if (lVarC == null) {
                        break;
                    }
                    d dVar2 = (d) linkedHashMap.get(lVarC);
                    if (dVar2 != null) {
                        dVar2.f1611f.add(lVar);
                        break;
                    }
                    d dVar3 = new d(lVarC);
                    linkedHashMap.put(lVarC, dVar3);
                    dVar3.f1611f.add(lVar);
                    dVar = dVar3;
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(int i3) {
        AbstractC0469k.a(16);
        String string = Integer.toString(i3, 16);
        h.d(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    public static final d c(p pVar) throws IOException {
        Long lValueOf;
        int iA = pVar.a();
        if (iA != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(iA));
        }
        pVar.g(4L);
        short sC = pVar.c();
        int i3 = sC & 65535;
        if ((sC & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i3));
        }
        int iC = pVar.c() & 65535;
        short sC2 = pVar.c();
        int i4 = sC2 & 65535;
        short sC3 = pVar.c();
        int i5 = sC3 & 65535;
        if (i4 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i5 >> 9) & 127) + 1980, ((i5 >> 5) & 15) - 1, sC3 & 31, (i4 >> 11) & 31, (i4 >> 5) & 63, (sC2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l3 = lValueOf;
        pVar.a();
        o oVar = new o();
        oVar.f127d = ((long) pVar.a()) & 4294967295L;
        o oVar2 = new o();
        oVar2.f127d = ((long) pVar.a()) & 4294967295L;
        int iC2 = pVar.c() & 65535;
        int iC3 = pVar.c() & 65535;
        int iC4 = pVar.c() & 65535;
        pVar.g(8L);
        o oVar3 = new o();
        oVar3.f127d = ((long) pVar.a()) & 4294967295L;
        String strD = pVar.d(iC2);
        if (i.d(strD, (char) 0, false, 2) >= 0) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j3 = oVar2.f127d == 4294967295L ? 8 : 0L;
        if (oVar.f127d == 4294967295L) {
            j3 += (long) 8;
        }
        if (oVar3.f127d == 4294967295L) {
            j3 += (long) 8;
        }
        long j4 = j3;
        m mVar = new m();
        d(pVar, iC3, new f(mVar, j4, oVar2, pVar, oVar, oVar3));
        if (j4 > 0 && !mVar.f125d) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strD2 = pVar.d(iC4);
        String str = l.e;
        return new d(p065t0.e.e("/", false).d(strD), strD.endsWith("/"), strD2, oVar.f127d, oVar2.f127d, iC, l3, oVar3.f127d);
    }

    public static final void d(p pVar, int i3, A2.p pVar2) throws IOException {
        long j3 = i3;
        while (j3 != 0) {
            if (j3 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iC = pVar.c() & 65535;
            long jC = ((long) pVar.c()) & 65535;
            long j4 = j3 - ((long) 4);
            if (j4 < jC) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            pVar.f(jC);
            R2.a aVar = pVar.e;
            long j5 = aVar.e;
            pVar2.h(Integer.valueOf(iC), Long.valueOf(jC));
            long j6 = (aVar.e + jC) - j5;
            if (j6 < 0) {
                throw new IOException(I.f("unsupported zip: too many bytes processed for ", iC));
            }
            if (j6 > 0) {
                aVar.i(j6);
            }
            j3 = j4 - jC;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public static final int e(s sVar, int i3) {
        int i4;
        h.e(sVar, "<this>");
        int i5 = i3 + 1;
        int length = sVar.f1548h.length;
        int[] iArr = sVar.f1549i;
        h.e(iArr, "<this>");
        int i6 = length - 1;
        int i7 = 0;
        while (i7 <= i6) {
            i4 = (i7 + i6) >>> 1;
            int i8 = iArr[i4];
            if (i8 < i5) {
                i7 = i4 + 1;
            } else {
                if (i8 <= i5) {
                    if (i4 >= 0) {
                        return i4;
                    }
                    return ~i4;
                }
                i6 = i4 - 1;
            }
        }
        i4 = (-i7) - 1;
        if (i4 >= 0) {
            return i4;
        }
        return ~i4;
    }
}
