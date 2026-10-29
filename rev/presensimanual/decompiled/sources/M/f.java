package M;

import androidx.datastore.preferences.protobuf.AbstractC0141x;
import androidx.datastore.preferences.protobuf.AbstractC0143z;
import androidx.datastore.preferences.protobuf.C0128j;
import androidx.datastore.preferences.protobuf.C0130l;
import androidx.datastore.preferences.protobuf.C0135q;
import androidx.datastore.preferences.protobuf.C0142y;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.Z;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.i0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0143z {
    private static final f DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private O preferences_ = O.e;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0143z.l(f.class, fVar);
    }

    public static O n(f fVar) {
        O o3 = fVar.preferences_;
        if (!o3.f2240d) {
            fVar.preferences_ = o3.b();
        }
        return fVar.preferences_;
    }

    public static d p() {
        return (d) ((AbstractC0141x) DEFAULT_INSTANCE.e(5));
    }

    public static f q(InputStream inputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0128j c0128j = new C0128j(inputStream);
        C0135q c0135qA = C0135q.a();
        AbstractC0143z abstractC0143zK = fVar.k();
        try {
            Z z2 = Z.f2263c;
            z2.getClass();
            c0 c0VarA = z2.a(abstractC0143zK.getClass());
            C0130l c0130l = c0128j.f2318b;
            if (c0130l == null) {
                c0130l = new C0130l(c0128j);
            }
            c0VarA.b(abstractC0143zK, c0130l, c0135qA);
            c0VarA.h(abstractC0143zK);
            if (AbstractC0143z.h(abstractC0143zK, true)) {
                return (f) abstractC0143zK;
            }
            throw new E(new i0().getMessage());
        } catch (E e) {
            if (e.f2220d) {
                throw new E(e.getMessage(), e);
            }
            throw e;
        } catch (i0 e3) {
            throw new E(e3.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof E) {
                throw ((E) e4.getCause());
            }
            throw new E(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof E) {
                throw ((E) e5.getCause());
            }
            throw e5;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0143z
    public final Object e(int i3) {
        switch (j.b(i3)) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f961a});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new f();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new d(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Y c0142y = PARSER;
                if (c0142y == null) {
                    synchronized (f.class) {
                        try {
                            c0142y = PARSER;
                            if (c0142y == null) {
                                c0142y = new C0142y();
                                PARSER = c0142y;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return c0142y;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
