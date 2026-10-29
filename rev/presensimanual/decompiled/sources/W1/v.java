package W1;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v extends S1.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f1790d = new v();

    @Override // S1.r
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        switch (b3) {
            case -127:
                Object objE = e(byteBuffer);
                if (objE == null) {
                    return null;
                }
                return x.values()[((Long) objE).intValue()];
            case -126:
                Object objE2 = e(byteBuffer);
                if (objE2 == null) {
                    return null;
                }
                return z.values()[((Long) objE2).intValue()];
            case -125:
                Object objE3 = e(byteBuffer);
                if (objE3 == null) {
                    return null;
                }
                return A.values()[((Long) objE3).intValue()];
            case -124:
                Object objE4 = e(byteBuffer);
                if (objE4 == null) {
                    return null;
                }
                return C.values()[((Long) objE4).intValue()];
            case -123:
                Object objE5 = e(byteBuffer);
                if (objE5 == null) {
                    return null;
                }
                return G.values()[((Long) objE5).intValue()];
            case -122:
                Object objE6 = e(byteBuffer);
                if (objE6 == null) {
                    return null;
                }
                return D.values()[((Long) objE6).intValue()];
            case -121:
                Object objE7 = e(byteBuffer);
                if (objE7 == null) {
                    return null;
                }
                return B.values()[((Long) objE7).intValue()];
            case -120:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                w wVar = new w();
                String str = (String) arrayList.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                }
                wVar.f1791a = str;
                x xVar = (x) arrayList.get(1);
                if (xVar == null) {
                    throw new IllegalStateException("Nonnull field \"lensDirection\" is null.");
                }
                wVar.f1792b = xVar;
                Long l3 = (Long) arrayList.get(2);
                if (l3 == null) {
                    throw new IllegalStateException("Nonnull field \"sensorOrientation\" is null.");
                }
                wVar.f1793c = l3;
                return wVar;
            case -119:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                y yVar = new y();
                H h3 = (H) arrayList2.get(0);
                if (h3 == null) {
                    throw new IllegalStateException("Nonnull field \"previewSize\" is null.");
                }
                yVar.f1798a = h3;
                A a3 = (A) arrayList2.get(1);
                if (a3 == null) {
                    throw new IllegalStateException("Nonnull field \"exposureMode\" is null.");
                }
                yVar.f1799b = a3;
                C c3 = (C) arrayList2.get(2);
                if (c3 == null) {
                    throw new IllegalStateException("Nonnull field \"focusMode\" is null.");
                }
                yVar.f1800c = c3;
                Boolean bool = (Boolean) arrayList2.get(3);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"exposurePointSupported\" is null.");
                }
                yVar.f1801d = bool;
                Boolean bool2 = (Boolean) arrayList2.get(4);
                if (bool2 == null) {
                    throw new IllegalStateException("Nonnull field \"focusPointSupported\" is null.");
                }
                yVar.e = bool2;
                return yVar;
            case -118:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                H h4 = new H();
                Double d3 = (Double) arrayList3.get(0);
                if (d3 == null) {
                    throw new IllegalStateException("Nonnull field \"width\" is null.");
                }
                h4.f1703a = d3;
                Double d4 = (Double) arrayList3.get(1);
                if (d4 == null) {
                    throw new IllegalStateException("Nonnull field \"height\" is null.");
                }
                h4.f1704b = d4;
                return h4;
            case -117:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                F f3 = new F();
                Double d5 = (Double) arrayList4.get(0);
                if (d5 == null) {
                    throw new IllegalStateException("Nonnull field \"x\" is null.");
                }
                f3.f1700a = d5;
                Double d6 = (Double) arrayList4.get(1);
                if (d6 == null) {
                    throw new IllegalStateException("Nonnull field \"y\" is null.");
                }
                f3.f1701b = d6;
                return f3;
            case -116:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                E e = new E();
                G g3 = (G) arrayList5.get(0);
                if (g3 == null) {
                    throw new IllegalStateException("Nonnull field \"resolutionPreset\" is null.");
                }
                e.f1696a = g3;
                e.f1697b = (Long) arrayList5.get(1);
                e.f1698c = (Long) arrayList5.get(2);
                e.f1699d = (Long) arrayList5.get(3);
                Boolean bool3 = (Boolean) arrayList5.get(4);
                if (bool3 == null) {
                    throw new IllegalStateException("Nonnull field \"enableAudio\" is null.");
                }
                e.e = bool3;
                return e;
            default:
                return super.f(b3, byteBuffer);
        }
    }

    @Override // S1.r
    public final void k(S1.q qVar, Object obj) {
        if (obj instanceof x) {
            qVar.write(129);
            k(qVar, obj != null ? Integer.valueOf(((x) obj).f1797d) : null);
            return;
        }
        if (obj instanceof z) {
            qVar.write(130);
            k(qVar, obj != null ? Integer.valueOf(((z) obj).f1806d) : null);
            return;
        }
        if (obj instanceof A) {
            qVar.write(131);
            k(qVar, obj != null ? Integer.valueOf(((A) obj).f1690d) : null);
            return;
        }
        if (obj instanceof C) {
            qVar.write(132);
            k(qVar, obj != null ? Integer.valueOf(((C) obj).f1694d) : null);
            return;
        }
        if (obj instanceof G) {
            qVar.write(133);
            k(qVar, obj != null ? Integer.valueOf(((G) obj).f1702d) : null);
            return;
        }
        if (obj instanceof D) {
            qVar.write(134);
            k(qVar, obj != null ? Integer.valueOf(((D) obj).f1695d) : null);
            return;
        }
        if (obj instanceof B) {
            qVar.write(135);
            k(qVar, obj != null ? Integer.valueOf(((B) obj).f1691d) : null);
            return;
        }
        if (obj instanceof w) {
            qVar.write(136);
            w wVar = (w) obj;
            wVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(wVar.f1791a);
            arrayList.add(wVar.f1792b);
            arrayList.add(wVar.f1793c);
            k(qVar, arrayList);
            return;
        }
        if (obj instanceof y) {
            qVar.write(137);
            y yVar = (y) obj;
            yVar.getClass();
            ArrayList arrayList2 = new ArrayList(5);
            arrayList2.add(yVar.f1798a);
            arrayList2.add(yVar.f1799b);
            arrayList2.add(yVar.f1800c);
            arrayList2.add(yVar.f1801d);
            arrayList2.add(yVar.e);
            k(qVar, arrayList2);
            return;
        }
        if (obj instanceof H) {
            qVar.write(138);
            H h3 = (H) obj;
            h3.getClass();
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(h3.f1703a);
            arrayList3.add(h3.f1704b);
            k(qVar, arrayList3);
            return;
        }
        if (obj instanceof F) {
            qVar.write(139);
            F f3 = (F) obj;
            f3.getClass();
            ArrayList arrayList4 = new ArrayList(2);
            arrayList4.add(f3.f1700a);
            arrayList4.add(f3.f1701b);
            k(qVar, arrayList4);
            return;
        }
        if (!(obj instanceof E)) {
            super.k(qVar, obj);
            return;
        }
        qVar.write(140);
        E e = (E) obj;
        e.getClass();
        ArrayList arrayList5 = new ArrayList(5);
        arrayList5.add(e.f1696a);
        arrayList5.add(e.f1697b);
        arrayList5.add(e.f1698c);
        arrayList5.add(e.f1699d);
        arrayList5.add(e.e);
        k(qVar, arrayList5);
    }
}
