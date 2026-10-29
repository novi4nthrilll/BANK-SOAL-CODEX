package B2;

import A2.t;
import A2.u;
import A2.v;
import A2.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013d1.AbstractC0479l3;
import p013d1.B3;

/* JADX INFO: loaded from: classes.dex */
public final class e implements F2.b, d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f117d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f118a;

    static {
        List listB = p059r2.e.b(A2.a.class, A2.l.class, A2.p.class, A2.q.class, A2.r.class, A2.s.class, t.class, u.class, v.class, w.class, A2.b.class, A2.c.class, A2.d.class, A2.e.class, A2.f.class, A2.g.class, A2.h.class, A2.i.class, A2.j.class, A2.k.class, A2.m.class, A2.n.class, A2.o.class);
        ArrayList<p055q2.b> arrayList = new ArrayList(p059r2.f.c(listB));
        int i3 = 0;
        for (Object obj : listB) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new p055q2.b((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        Map mapSingletonMap = p059r2.m.f5625d;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                mapSingletonMap = new LinkedHashMap(AbstractC0479l3.a(arrayList.size()));
                for (p055q2.b bVar : arrayList) {
                    mapSingletonMap.put(bVar.f5598d, bVar.e);
                }
            } else {
                p055q2.b bVar2 = (p055q2.b) arrayList.get(0);
                h.e(bVar2, "pair");
                mapSingletonMap = Collections.singletonMap(bVar2.f5598d, bVar2.e);
                h.d(mapSingletonMap, "singletonMap(...)");
            }
        }
        f115b = mapSingletonMap;
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        h.d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            h.b(str);
            sb.append(H2.i.j(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f115b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f116c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0479l3.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            h.b(str2);
            linkedHashMap.put(key, H2.i.j(str2, str2));
        }
        f117d = linkedHashMap;
    }

    public e(Class cls) {
        h.e(cls, "jClass");
        this.f118a = cls;
    }

    @Override // B2.d
    public final Class a() {
        return this.f118a;
    }

    public final String b() {
        String str;
        Class cls = this.f118a;
        h.e(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = f117d;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return H2.i.i(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return H2.i.i(simpleName, enclosingConstructor.getName() + '$');
        }
        int iD = H2.i.d(simpleName, '$', false, 6);
        if (iD == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iD + 1, simpleName.length());
        h.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && B3.a(this).equals(B3.a((F2.b) obj));
    }

    public final int hashCode() {
        return B3.a(this).hashCode();
    }

    public final String toString() {
        return this.f118a + " (Kotlin reflection is not available)";
    }
}
