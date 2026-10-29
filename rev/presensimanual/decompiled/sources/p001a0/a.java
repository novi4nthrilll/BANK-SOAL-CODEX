package p001a0;

import I2.C0045p;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import id.go.bangkalankab.simpeg.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p013d1.AbstractC0549x2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f1954d;
    public static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1957c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f1956b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f1955a = new HashMap();

    public a(Context context) {
        this.f1957c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1954d == null) {
            synchronized (e) {
                try {
                    if (f1954d == null) {
                        f1954d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1954d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1957c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f1956b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new C0045p(e3);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        boolean zC;
        Object objB;
        boolean zBooleanValue = false;
        if (Build.VERSION.SDK_INT >= 29) {
            zC = p005b0.a.c();
        } else {
            try {
                if (AbstractC0549x2.f3915b == null) {
                    AbstractC0549x2.f3914a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    AbstractC0549x2.f3915b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                zBooleanValue = ((Boolean) AbstractC0549x2.f3915b.invoke(null, Long.valueOf(AbstractC0549x2.f3914a))).booleanValue();
            } catch (Exception e3) {
                AbstractC0549x2.a("isTagEnabled", e3);
            }
            zC = zBooleanValue;
        }
        if (zC) {
            try {
                Trace.beginSection(AbstractC0549x2.b(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f1955a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f1957c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new C0045p(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
