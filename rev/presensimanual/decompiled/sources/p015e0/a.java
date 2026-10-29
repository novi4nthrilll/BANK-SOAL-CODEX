package p015e0;

import B2.e;
import B2.h;
import android.app.Activity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import p019f0.c;
import p019f0.d;
import p035k0.b;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f3925a;

    public /* synthetic */ a(ClassLoader classLoader) {
        this.f3925a = classLoader;
    }

    public d a(Object obj, e eVar, Activity activity, b bVar) throws IllegalAccessException, InvocationTargetException {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f3925a, new Class[]{b()}, new c(eVar, bVar));
        h.d(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, objNewProxyInstance);
        return new d(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, objNewProxyInstance);
    }

    public Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f3925a.loadClass("java.util.function.Consumer");
        h.d(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }
}
