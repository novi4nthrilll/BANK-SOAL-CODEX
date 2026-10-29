package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0130l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0129k f2319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2322d = 0;

    public C0130l(AbstractC0129k abstractC0129k) {
        Charset charset = C.f2218a;
        this.f2319a = abstractC0129k;
        abstractC0129k.f2318b = this;
    }

    public static void y(int i3) throws E {
        if ((i3 & 3) != 0) {
            throw new E("Failed to parse the message.");
        }
    }

    public static void z(int i3) throws E {
        if ((i3 & 7) != 0) {
            throw new E("Failed to parse the message.");
        }
    }

    public final int a() {
        int i3 = this.f2322d;
        if (i3 != 0) {
            this.f2320b = i3;
            this.f2322d = 0;
        } else {
            this.f2320b = this.f2319a.u();
        }
        int i4 = this.f2320b;
        if (i4 == 0 || i4 == this.f2321c) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public final void b(Object obj, c0 c0Var, C0135q c0135q) {
        int i3 = this.f2321c;
        this.f2321c = ((this.f2320b >>> 3) << 3) | 4;
        try {
            c0Var.b(obj, this, c0135q);
            if (this.f2320b != this.f2321c) {
                throw new E("Failed to parse the message.");
            }
            this.f2321c = i3;
        } catch (Throwable th) {
            this.f2321c = i3;
            throw th;
        }
    }

    public final void c(Object obj, c0 c0Var, C0135q c0135q) throws E {
        AbstractC0129k abstractC0129k = this.f2319a;
        int iV = abstractC0129k.v();
        if (abstractC0129k.f2317a >= 100) {
            throw new E("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = abstractC0129k.e(iV);
        abstractC0129k.f2317a++;
        c0Var.b(obj, this, c0135q);
        abstractC0129k.a(0);
        abstractC0129k.f2317a--;
        abstractC0129k.d(iE);
    }

    public final void d(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 0) {
            do {
                b3.add(Boolean.valueOf(abstractC0129k.f()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iB = abstractC0129k.b() + abstractC0129k.v();
        do {
            b3.add(Boolean.valueOf(abstractC0129k.f()));
        } while (abstractC0129k.b() < iB);
        v(iB);
    }

    public final C0126h e() throws D {
        w(2);
        return this.f2319a.g();
    }

    public final void f(B b3) throws D {
        int iU;
        if ((this.f2320b & 7) != 2) {
            throw E.b();
        }
        do {
            b3.add(e());
            AbstractC0129k abstractC0129k = this.f2319a;
            if (abstractC0129k.c()) {
                return;
            } else {
                iU = abstractC0129k.u();
            }
        } while (iU == this.f2320b);
        this.f2322d = iU;
    }

    public final void g(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 1) {
            do {
                b3.add(Double.valueOf(abstractC0129k.h()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iV = abstractC0129k.v();
        z(iV);
        int iB = abstractC0129k.b() + iV;
        do {
            b3.add(Double.valueOf(abstractC0129k.h()));
        } while (abstractC0129k.b() < iB);
    }

    public final void h(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 0) {
            do {
                b3.add(Integer.valueOf(abstractC0129k.i()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iB = abstractC0129k.b() + abstractC0129k.v();
        do {
            b3.add(Integer.valueOf(abstractC0129k.i()));
        } while (abstractC0129k.b() < iB);
        v(iB);
    }

    public final Object i(x0 x0Var, Class cls, C0135q c0135q) throws E {
        int iOrdinal = x0Var.ordinal();
        AbstractC0129k abstractC0129k = this.f2319a;
        switch (iOrdinal) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                w(1);
                return Double.valueOf(abstractC0129k.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0129k.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0129k.n());
            case M.k.INTEGER_FIELD_NUMBER /* 3 */:
                w(0);
                return Long.valueOf(abstractC0129k.w());
            case M.k.LONG_FIELD_NUMBER /* 4 */:
                w(0);
                return Integer.valueOf(abstractC0129k.m());
            case M.k.STRING_FIELD_NUMBER /* 5 */:
                w(1);
                return Long.valueOf(abstractC0129k.k());
            case M.k.STRING_SET_FIELD_NUMBER /* 6 */:
                w(5);
                return Integer.valueOf(abstractC0129k.j());
            case M.k.DOUBLE_FIELD_NUMBER /* 7 */:
                w(0);
                return Boolean.valueOf(abstractC0129k.f());
            case M.k.BYTES_FIELD_NUMBER /* 8 */:
                w(2);
                return abstractC0129k.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                c0 c0VarA = Z.f2263c.a(cls);
                AbstractC0143z abstractC0143zG = c0VarA.g();
                c(abstractC0143zG, c0VarA, c0135q);
                c0VarA.h(abstractC0143zG);
                return abstractC0143zG;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0129k.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0129k.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0129k.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0129k.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0129k.q());
            case 17:
                w(0);
                return Long.valueOf(abstractC0129k.r());
        }
    }

    public final void j(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 2) {
            int iV = abstractC0129k.v();
            y(iV);
            int iB = abstractC0129k.b() + iV;
            do {
                b3.add(Integer.valueOf(abstractC0129k.j()));
            } while (abstractC0129k.b() < iB);
            return;
        }
        if (i3 != 5) {
            throw E.b();
        }
        do {
            b3.add(Integer.valueOf(abstractC0129k.j()));
            if (abstractC0129k.c()) {
                return;
            } else {
                iU = abstractC0129k.u();
            }
        } while (iU == this.f2320b);
        this.f2322d = iU;
    }

    public final void k(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 1) {
            do {
                b3.add(Long.valueOf(abstractC0129k.k()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iV = abstractC0129k.v();
        z(iV);
        int iB = abstractC0129k.b() + iV;
        do {
            b3.add(Long.valueOf(abstractC0129k.k()));
        } while (abstractC0129k.b() < iB);
    }

    public final void l(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 2) {
            int iV = abstractC0129k.v();
            y(iV);
            int iB = abstractC0129k.b() + iV;
            do {
                b3.add(Float.valueOf(abstractC0129k.l()));
            } while (abstractC0129k.b() < iB);
            return;
        }
        if (i3 != 5) {
            throw E.b();
        }
        do {
            b3.add(Float.valueOf(abstractC0129k.l()));
            if (abstractC0129k.c()) {
                return;
            } else {
                iU = abstractC0129k.u();
            }
        } while (iU == this.f2320b);
        this.f2322d = iU;
    }

    public final void m(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 0) {
            do {
                b3.add(Integer.valueOf(abstractC0129k.m()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iB = abstractC0129k.b() + abstractC0129k.v();
        do {
            b3.add(Integer.valueOf(abstractC0129k.m()));
        } while (abstractC0129k.b() < iB);
        v(iB);
    }

    public final void n(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 0) {
            do {
                b3.add(Long.valueOf(abstractC0129k.n()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iB = abstractC0129k.b() + abstractC0129k.v();
        do {
            b3.add(Long.valueOf(abstractC0129k.n()));
        } while (abstractC0129k.b() < iB);
        v(iB);
    }

    public final void o(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 2) {
            int iV = abstractC0129k.v();
            y(iV);
            int iB = abstractC0129k.b() + iV;
            do {
                b3.add(Integer.valueOf(abstractC0129k.o()));
            } while (abstractC0129k.b() < iB);
            return;
        }
        if (i3 != 5) {
            throw E.b();
        }
        do {
            b3.add(Integer.valueOf(abstractC0129k.o()));
            if (abstractC0129k.c()) {
                return;
            } else {
                iU = abstractC0129k.u();
            }
        } while (iU == this.f2320b);
        this.f2322d = iU;
    }

    public final void p(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 1) {
            do {
                b3.add(Long.valueOf(abstractC0129k.p()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iV = abstractC0129k.v();
        z(iV);
        int iB = abstractC0129k.b() + iV;
        do {
            b3.add(Long.valueOf(abstractC0129k.p()));
        } while (abstractC0129k.b() < iB);
    }

    public final void q(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 0) {
            do {
                b3.add(Integer.valueOf(abstractC0129k.q()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iB = abstractC0129k.b() + abstractC0129k.v();
        do {
            b3.add(Integer.valueOf(abstractC0129k.q()));
        } while (abstractC0129k.b() < iB);
        v(iB);
    }

    public final void r(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 0) {
            do {
                b3.add(Long.valueOf(abstractC0129k.r()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iB = abstractC0129k.b() + abstractC0129k.v();
        do {
            b3.add(Long.valueOf(abstractC0129k.r()));
        } while (abstractC0129k.b() < iB);
        v(iB);
    }

    public final void s(B b3, boolean z2) throws D {
        String strS;
        int iU;
        if ((this.f2320b & 7) != 2) {
            throw E.b();
        }
        do {
            AbstractC0129k abstractC0129k = this.f2319a;
            if (z2) {
                w(2);
                strS = abstractC0129k.t();
            } else {
                w(2);
                strS = abstractC0129k.s();
            }
            b3.add(strS);
            if (abstractC0129k.c()) {
                return;
            } else {
                iU = abstractC0129k.u();
            }
        } while (iU == this.f2320b);
        this.f2322d = iU;
    }

    public final void t(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 0) {
            do {
                b3.add(Integer.valueOf(abstractC0129k.v()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iB = abstractC0129k.b() + abstractC0129k.v();
        do {
            b3.add(Integer.valueOf(abstractC0129k.v()));
        } while (abstractC0129k.b() < iB);
        v(iB);
    }

    public final void u(B b3) throws E {
        int iU;
        int i3 = this.f2320b & 7;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (i3 == 0) {
            do {
                b3.add(Long.valueOf(abstractC0129k.w()));
                if (abstractC0129k.c()) {
                    return;
                } else {
                    iU = abstractC0129k.u();
                }
            } while (iU == this.f2320b);
            this.f2322d = iU;
            return;
        }
        if (i3 != 2) {
            throw E.b();
        }
        int iB = abstractC0129k.b() + abstractC0129k.v();
        do {
            b3.add(Long.valueOf(abstractC0129k.w()));
        } while (abstractC0129k.b() < iB);
        v(iB);
    }

    public final void v(int i3) throws E {
        if (this.f2319a.b() != i3) {
            throw E.e();
        }
    }

    public final void w(int i3) throws D {
        if ((this.f2320b & 7) != i3) {
            throw E.b();
        }
    }

    public final boolean x() {
        int i3;
        AbstractC0129k abstractC0129k = this.f2319a;
        if (abstractC0129k.c() || (i3 = this.f2320b) == this.f2321c) {
            return false;
        }
        return abstractC0129k.x(i3);
    }
}
