package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0146c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0146c f2378c = new C0146c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2379a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2380b = new HashMap();

    public static void b(HashMap map, C0145b c0145b, j jVar, Class cls) {
        j jVar2 = (j) map.get(c0145b);
        if (jVar2 == null || jVar == jVar2) {
            if (jVar2 == null) {
                map.put(c0145b, jVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0145b.f2377b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + jVar2 + ", new value " + jVar);
    }

    public final C0144a a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f2379a;
        if (superclass != null) {
            C0144a c0144aA = (C0144a) map2.get(superclass);
            if (c0144aA == null) {
                c0144aA = a(superclass, null);
            }
            map.putAll(c0144aA.f2375b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0144a c0144aA2 = (C0144a) map2.get(cls2);
            if (c0144aA2 == null) {
                c0144aA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0144aA2.f2375b.entrySet()) {
                b(map, (C0145b) entry.getKey(), (j) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            v vVar = (v) method.getAnnotation(v.class);
            if (vVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!q.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                j jVarValue = vVar.value();
                if (parameterTypes.length > 1) {
                    if (!j.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (jVarValue != j.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0145b(i3, method), jVarValue, cls);
                z2 = true;
            }
        }
        C0144a c0144a = new C0144a(map);
        map2.put(cls, c0144a);
        this.f2380b.put(cls, Boolean.valueOf(z2));
        return c0144a;
    }
}
