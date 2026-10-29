package N;

import I2.C0045p;
import J.C0056b;
import M.j;
import M.k;
import R2.m;
import R2.n;
import R2.o;
import R2.p;
import androidx.datastore.preferences.protobuf.AbstractC0143z;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0126h;
import androidx.datastore.preferences.protobuf.C0132n;
import androidx.datastore.preferences.protobuf.E;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f1037a = new i();

    public final b a(p pVar) throws C0056b {
        byte[] bArr;
        try {
            M.f fVarQ = M.f.q(new o(pVar));
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            B2.h.e(fVarArr, "pairs");
            bVar.b();
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map mapO = fVarQ.o();
            B2.h.d(mapO, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapO.entrySet()) {
                String str = (String) entry.getKey();
                k kVar = (k) entry.getValue();
                B2.h.d(str, "name");
                B2.h.d(kVar, "value");
                int iE = kVar.E();
                switch (iE == 0 ? -1 : h.f1036a[j.b(iE)]) {
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_UNDEFINED /* -1 */:
                        throw new C0056b("Value case is null.", null);
                    case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                    default:
                        throw new C0045p();
                    case 1:
                        bVar.d(new e(str), Boolean.valueOf(kVar.v()));
                        break;
                    case 2:
                        bVar.d(new e(str), Float.valueOf(kVar.z()));
                        break;
                    case k.INTEGER_FIELD_NUMBER /* 3 */:
                        bVar.d(new e(str), Double.valueOf(kVar.y()));
                        break;
                    case k.LONG_FIELD_NUMBER /* 4 */:
                        bVar.d(new e(str), Integer.valueOf(kVar.A()));
                        break;
                    case k.STRING_FIELD_NUMBER /* 5 */:
                        bVar.d(new e(str), Long.valueOf(kVar.B()));
                        break;
                    case k.STRING_SET_FIELD_NUMBER /* 6 */:
                        e eVar = new e(str);
                        String strC = kVar.C();
                        B2.h.d(strC, "value.string");
                        bVar.d(eVar, strC);
                        break;
                    case k.DOUBLE_FIELD_NUMBER /* 7 */:
                        e eVar2 = new e(str);
                        B bP = kVar.D().p();
                        B2.h.d(bP, "value.stringSet.stringsList");
                        bVar.d(eVar2, p059r2.d.i(bP));
                        break;
                    case k.BYTES_FIELD_NUMBER /* 8 */:
                        e eVar3 = new e(str);
                        C0126h c0126hW = kVar.w();
                        int size = c0126hW.size();
                        if (size == 0) {
                            bArr = C.f2219b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c0126hW.f(bArr2, size);
                            bArr = bArr2;
                        }
                        B2.h.d(bArr, "value.bytes.toByteArray()");
                        bVar.d(eVar3, bArr);
                        break;
                    case 9:
                        throw new C0056b("Value not set.", null);
                }
            }
            return new b(new LinkedHashMap(bVar.a()), true);
        } catch (E e) {
            throw new C0056b("Unable to parse preferences proto.", e);
        }
    }

    public final void b(Object obj, n nVar) throws IOException {
        AbstractC0143z abstractC0143zA;
        Map mapA = ((b) obj).a();
        M.d dVarP = M.f.p();
        for (Map.Entry entry : mapA.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f1032a;
            if (value instanceof Boolean) {
                M.i iVarF = k.F();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                iVarF.c();
                k.s((k) iVarF.e, zBooleanValue);
                abstractC0143zA = iVarF.a();
            } else if (value instanceof Float) {
                M.i iVarF2 = k.F();
                float fFloatValue = ((Number) value).floatValue();
                iVarF2.c();
                k.t((k) iVarF2.e, fFloatValue);
                abstractC0143zA = iVarF2.a();
            } else if (value instanceof Double) {
                M.i iVarF3 = k.F();
                double dDoubleValue = ((Number) value).doubleValue();
                iVarF3.c();
                k.q((k) iVarF3.e, dDoubleValue);
                abstractC0143zA = iVarF3.a();
            } else if (value instanceof Integer) {
                M.i iVarF4 = k.F();
                int iIntValue = ((Number) value).intValue();
                iVarF4.c();
                k.u((k) iVarF4.e, iIntValue);
                abstractC0143zA = iVarF4.a();
            } else if (value instanceof Long) {
                M.i iVarF5 = k.F();
                long jLongValue = ((Number) value).longValue();
                iVarF5.c();
                k.n((k) iVarF5.e, jLongValue);
                abstractC0143zA = iVarF5.a();
            } else if (value instanceof String) {
                M.i iVarF6 = k.F();
                iVarF6.c();
                k.o((k) iVarF6.e, (String) value);
                abstractC0143zA = iVarF6.a();
            } else if (value instanceof Set) {
                M.i iVarF7 = k.F();
                M.g gVarQ = M.h.q();
                B2.h.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                gVarQ.c();
                M.h.n((M.h) gVarQ.e, (Set) value);
                iVarF7.c();
                k.p((k) iVarF7.e, (M.h) gVarQ.a());
                abstractC0143zA = iVarF7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                M.i iVarF8 = k.F();
                byte[] bArr = (byte[]) value;
                C0126h c0126h = C0126h.f2295f;
                C0126h c0126hE = C0126h.e(bArr, 0, bArr.length);
                iVarF8.c();
                k.r((k) iVarF8.e, c0126hE);
                abstractC0143zA = iVarF8.a();
            }
            dVarP.getClass();
            str.getClass();
            dVarP.c();
            M.f.n((M.f) dVarP.e).put(str, (k) abstractC0143zA);
        }
        M.f fVar = (M.f) dVarP.a();
        m mVar = new m(nVar);
        int iA = fVar.a(null);
        Logger logger = C0132n.f2324f;
        if (iA > 4096) {
            iA = 4096;
        }
        C0132n c0132n = new C0132n(mVar, iA);
        fVar.b(c0132n);
        if (c0132n.f2329d > 0) {
            c0132n.C();
        }
    }
}
