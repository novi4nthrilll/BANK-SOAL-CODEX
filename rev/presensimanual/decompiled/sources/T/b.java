package T;

import Y.C0118m;
import Y.s;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1622a;

    public b(int i3) {
        switch (i3) {
            case 2:
                this.f1622a = new HashMap();
                break;
            default:
                this.f1622a = new LinkedHashMap();
                break;
        }
    }

    public static b b(s sVar, int i3) {
        if (i3 == 0) {
            return new C0118m(sVar, 0);
        }
        if (i3 == 1) {
            return new C0118m(sVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract Object a(Object obj);

    public Object c(Object obj) {
        synchronized (((HashMap) this.f1622a)) {
            try {
                if (((HashMap) this.f1622a).containsKey(obj)) {
                    return ((HashMap) this.f1622a).get(obj);
                }
                Object objA = a(obj);
                ((HashMap) this.f1622a).put(obj, objA);
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public b(s sVar) {
        new Rect();
        this.f1622a = sVar;
    }
}
