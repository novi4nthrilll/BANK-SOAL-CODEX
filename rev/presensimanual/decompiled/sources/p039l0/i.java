package p039l0;

import A.a;
import B2.h;
import D0.b;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import p006b1.c;
import p029i0.j;
import p039l0.f;
import p039l0.g;
import p039l0.i;
import p059r2.l;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f5289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5292d;
    public b e;

    public i(Context context) {
        h.e(context, "context");
        SidecarInterface sidecarInterfaceB = g.b(context);
        f fVar = new f();
        this.f5289a = sidecarInterfaceB;
        this.f5290b = fVar;
        this.f5291c = new LinkedHashMap();
        this.f5292d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.f5289a;
    }

    public final j e(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderA = g.a(activity);
        if (iBinderA == null) {
            return new j(l.f5624d);
        }
        SidecarInterface sidecarInterface = this.f5289a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        SidecarInterface sidecarInterface2 = this.f5289a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f5290b.e(windowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        SidecarInterface sidecarInterface;
        IBinder iBinderA = g.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f5289a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        LinkedHashMap linkedHashMap = this.f5292d;
        if (((a) linkedHashMap.get(activity)) != null) {
            linkedHashMap.remove(activity);
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.k(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f5291c;
        boolean z2 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinderA);
        if (!z2 || (sidecarInterface = this.f5289a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final void g(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f5291c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f5289a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f5289a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.N(activity, e(activity));
        }
        this.f5292d.get(activity);
    }

    public final void h(c cVar) {
        this.e = new b(cVar);
        SidecarInterface sidecarInterface = this.f5289a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f5290b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    SidecarInterface sidecarInterfaceD;
                    h.e(sidecarDeviceState, "newDeviceState");
                    Collection<Activity> collectionValues = this.f2510a.f5291c.values();
                    i iVar = this.f2510a;
                    for (Activity activity : collectionValues) {
                        IBinder iBinderA = g.a(activity);
                        SidecarWindowLayoutInfo windowLayoutInfo = null;
                        if (iBinderA != null && (sidecarInterfaceD = iVar.d()) != null) {
                            windowLayoutInfo = sidecarInterfaceD.getWindowLayoutInfo(iBinderA);
                        }
                        b bVar = iVar.e;
                        if (bVar != null) {
                            bVar.N(activity, iVar.f5290b.e(windowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    h.e(iBinder, "windowToken");
                    h.e(sidecarWindowLayoutInfo, "newLayout");
                    Activity activity = (Activity) this.f2510a.f5291c.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    f fVar = this.f2510a.f5290b;
                    SidecarInterface sidecarInterfaceD = this.f2510a.d();
                    if (sidecarInterfaceD == null || (sidecarDeviceState = sidecarInterfaceD.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    j jVarE = fVar.e(sidecarWindowLayoutInfo, sidecarDeviceState);
                    b bVar = this.f2510a.e;
                    if (bVar != null) {
                        bVar.N(activity, jVarE);
                    }
                }
            }));
        }
    }

    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f5289a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!h.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f5289a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f5289a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f5289a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!h.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f5289a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!h.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f5289a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!h.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                h.c(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            h.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                h.c(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!h.a(arrayList, (List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }
}
