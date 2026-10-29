package Z;

import B2.h;
import android.os.Bundle;
import androidx.lifecycle.D;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1937d;
    public final Object e;

    public /* synthetic */ a(int i3, Object obj) {
        this.f1937d = i3;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [Z.e, java.lang.Object] */
    @Override // androidx.lifecycle.o
    public final void f(q qVar, j jVar) {
        switch (this.f1937d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (jVar != j.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                qVar.b().a(this);
                Bundle bundleA = this.e.a().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                Iterator<String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(next, false, a.class.getClassLoader()).asSubclass(c.class);
                        h.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                h.d(declaredConstructor.newInstance(null), "{\n                constr…wInstance()\n            }");
                                throw new ClassCastException();
                            } catch (Exception e) {
                                throw new RuntimeException(I.g("Failed to instantiate ", next), e);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException("Class " + next + " wasn't found", e4);
                    }
                }
                return;
            case 1:
                new HashMap();
                g[] gVarArr = (g[]) this.e;
                if (gVarArr.length > 0) {
                    g gVar = gVarArr[0];
                    throw null;
                }
                if (gVarArr.length <= 0) {
                    return;
                }
                g gVar2 = gVarArr[0];
                throw null;
            default:
                if (jVar != j.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + jVar).toString());
                }
                qVar.b().a(this);
                D d3 = (D) this.e;
                if (d3.f2370b) {
                    return;
                }
                Bundle bundleA2 = d3.f2369a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = d3.f2371c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (bundleA2 != null) {
                    bundle.putAll(bundleA2);
                }
                d3.f2371c = bundle;
                d3.f2370b = true;
                return;
        }
    }
}
