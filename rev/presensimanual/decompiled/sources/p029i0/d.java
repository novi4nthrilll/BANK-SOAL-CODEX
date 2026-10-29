package p029i0;

import A2.a;
import B2.h;
import B2.i;
import B2.q;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.core.util.function.Consumer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.U2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements a {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f4574f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i3) {
        super(0);
        this.e = i3;
        this.f4574f = eVar;
    }

    @Override // A2.a
    public final Object a() throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsB = null;
        e eVar = this.f4574f;
        boolean z2 = false;
        switch (this.e) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Class<?> clsLoadClass = eVar.f4575a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                h.d(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
                Method method = clsLoadClass.getMethod("getBounds", null);
                Method method2 = clsLoadClass.getMethod("getType", null);
                Method method3 = clsLoadClass.getMethod("getState", null);
                h.d(method, "getBoundsMethod");
                if (U2.a(method, q.a(Rect.class)) && Modifier.isPublic(method.getModifiers())) {
                    h.d(method2, "getTypeMethod");
                    Class cls = Integer.TYPE;
                    if (U2.a(method2, q.a(cls)) && Modifier.isPublic(method2.getModifiers())) {
                        h.d(method3, "getStateMethod");
                        if (U2.a(method3, q.a(cls)) && Modifier.isPublic(method3.getModifiers())) {
                            z2 = true;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 1:
                try {
                    clsB = eVar.f4576b.b();
                    break;
                } catch (ClassNotFoundException unused) {
                }
                if (clsB == null) {
                    return Boolean.FALSE;
                }
                Class<?> clsLoadClass2 = eVar.f4575a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(clsLoadClass2, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method4 = clsLoadClass2.getMethod("addWindowLayoutInfoListener", Activity.class, clsB);
                Method method5 = clsLoadClass2.getMethod("removeWindowLayoutInfoListener", clsB);
                h.d(method4, "addListenerMethod");
                if (Modifier.isPublic(method4.getModifiers())) {
                    h.d(method5, "removeListenerMethod");
                    if (Modifier.isPublic(method5.getModifiers())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 2:
                Class<?> clsLoadClass3 = eVar.f4575a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(clsLoadClass3, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                Method method6 = clsLoadClass3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
                Method method7 = clsLoadClass3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
                h.d(method6, "addListenerMethod");
                if (Modifier.isPublic(method6.getModifiers())) {
                    h.d(method7, "removeListenerMethod");
                    if (Modifier.isPublic(method7.getModifiers())) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                Class<?> clsLoadClass4 = eVar.f4577c.f3925a.loadClass("androidx.window.extensions.WindowExtensions");
                h.d(clsLoadClass4, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Method method8 = clsLoadClass4.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass5 = eVar.f4575a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                h.d(clsLoadClass5, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
                h.d(method8, "getWindowLayoutComponentMethod");
                if (Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(clsLoadClass5)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
