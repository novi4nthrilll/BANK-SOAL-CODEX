package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0137t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2344c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f2345a = e0.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2346b;

    static {
        new C0137t(0);
    }

    public C0137t() {
    }

    public static void b(C0132n c0132n, x0 x0Var, int i3, Object obj) {
        if (x0Var == x0.f2355g) {
            c0132n.R(i3, 3);
            ((AbstractC0119a) obj).b(c0132n);
            c0132n.R(i3, 4);
            return;
        }
        c0132n.R(i3, x0Var.e);
        switch (x0Var.ordinal()) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                c0132n.M(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0132n.K(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0132n.V(((Long) obj).longValue());
                break;
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                c0132n.V(((Long) obj).longValue());
                break;
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                c0132n.O(((Integer) obj).intValue());
                break;
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                c0132n.M(((Long) obj).longValue());
                break;
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0132n.K(((Integer) obj).intValue());
                break;
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0132n.E(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                if (!(obj instanceof C0126h)) {
                    c0132n.Q((String) obj);
                } else {
                    c0132n.I((C0126h) obj);
                }
                break;
            case 9:
                ((AbstractC0119a) obj).b(c0132n);
                break;
            case 10:
                AbstractC0119a abstractC0119a = (AbstractC0119a) obj;
                c0132n.getClass();
                c0132n.T(((AbstractC0143z) abstractC0119a).a(null));
                abstractC0119a.b(c0132n);
                break;
            case 11:
                if (!(obj instanceof C0126h)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0132n.T(length);
                    c0132n.F(bArr, 0, length);
                } else {
                    c0132n.I((C0126h) obj);
                }
                break;
            case 12:
                c0132n.T(((Integer) obj).intValue());
                break;
            case 13:
                c0132n.O(((Integer) obj).intValue());
                break;
            case 14:
                c0132n.K(((Integer) obj).intValue());
                break;
            case 15:
                c0132n.M(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0132n.T((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0132n.V((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f2346b) {
            return;
        }
        e0 e0Var = this.f2345a;
        int size = e0Var.f2282d.size();
        for (int i3 = 0; i3 < size; i3++) {
            Map.Entry entryC = e0Var.c(i3);
            if (entryC.getValue() instanceof AbstractC0143z) {
                AbstractC0143z abstractC0143z = (AbstractC0143z) entryC.getValue();
                abstractC0143z.getClass();
                Z z2 = Z.f2263c;
                z2.getClass();
                z2.a(abstractC0143z.getClass()).h(abstractC0143z);
                abstractC0143z.j();
            }
        }
        if (!e0Var.f2283f) {
            if (e0Var.f2282d.size() > 0) {
                e0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = e0Var.d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!e0Var.f2283f) {
            e0Var.e = e0Var.e.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(e0Var.e);
            e0Var.f2285h = e0Var.f2285h.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(e0Var.f2285h);
            e0Var.f2283f = true;
        }
        this.f2346b = true;
    }

    public final Object clone() {
        C0137t c0137t = new C0137t();
        e0 e0Var = this.f2345a;
        if (e0Var.f2282d.size() > 0) {
            Map.Entry entryC = e0Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = e0Var.d().iterator();
        if (!it.hasNext()) {
            return c0137t;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0137t) {
            return this.f2345a.equals(((C0137t) obj).f2345a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2345a.hashCode();
    }

    public C0137t(int i3) {
        a();
        a();
    }
}
