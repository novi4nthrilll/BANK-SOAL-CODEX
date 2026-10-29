package M;

import androidx.datastore.preferences.protobuf.AbstractC0120b;
import androidx.datastore.preferences.protobuf.AbstractC0141x;
import androidx.datastore.preferences.protobuf.AbstractC0143z;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0142y;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0143z {
    private static final h DEFAULT_INSTANCE;
    private static volatile Y PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private B strings_ = a0.f2266g;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0143z.l(h.class, hVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void n(h hVar, Set set) {
        B b3 = hVar.strings_;
        if (!((AbstractC0120b) b3).f2268d) {
            int size = b3.size();
            hVar.strings_ = ((a0) b3).e(size == 0 ? 10 : size * 2);
        }
        List list = hVar.strings_;
        Charset charset = C.f2218a;
        set.getClass();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(set.size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g q() {
        return (g) ((AbstractC0141x) DEFAULT_INSTANCE.e(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0143z
    public final Object e(int i3) {
        switch (j.b(i3)) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new b0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new h();
            case k.LONG_FIELD_NUMBER /* 4 */:
                return new g(DEFAULT_INSTANCE);
            case k.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                Y c0142y = PARSER;
                if (c0142y == null) {
                    synchronized (h.class) {
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

    public final B p() {
        return this.strings_;
    }
}
