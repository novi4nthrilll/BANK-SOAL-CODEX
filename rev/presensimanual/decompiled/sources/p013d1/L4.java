package p013d1;

import D0.b;
import M.k;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p016e1.U4;
import p040l1.d;
import p040l1.m;
import p058r1.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L4 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3610b;

    public /* synthetic */ L4(int i3, Object obj) {
        this.f3609a = i3;
        this.f3610b = obj;
    }

    @Override // p058r1.a
    public final Object get() {
        switch (this.f3609a) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return ((b) this.f3610b).E(new p070w0.b("json"), P4.e);
            case 1:
                return ((b) this.f3610b).E(new p070w0.b("proto"), P4.f3629d);
            case 2:
                return ((b) this.f3610b).E(new p070w0.b("json"), U4.e);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return ((b) this.f3610b).E(new p070w0.b("proto"), U4.f4135d);
            default:
                String str = (String) this.f3610b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (d.class.isAssignableFrom(cls)) {
                        return (d) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new m("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new m("Could not instantiate " + str + ".", e);
                } catch (InstantiationException e3) {
                    throw new m("Could not instantiate " + str + ".", e3);
                } catch (NoSuchMethodException e4) {
                    throw new m(I.g("Could not instantiate ", str), e4);
                } catch (InvocationTargetException e5) {
                    throw new m(I.g("Could not instantiate ", str), e5);
                }
        }
    }
}
