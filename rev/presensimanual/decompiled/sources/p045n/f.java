package p045n;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5371d;
    public int e;

    public f(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f5370c = i3;
        this.f5368a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f5368a.get(obj);
                if (obj2 != null) {
                    this.f5371d++;
                    return obj2;
                }
                this.e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f5369b++;
                objPut = this.f5368a.put(obj, obj2);
                if (objPut != null) {
                    this.f5369b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c(this.f5370c);
        return objPut;
    }

    public final void c(int i3) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f5369b < 0 || (this.f5368a.isEmpty() && this.f5369b != 0)) {
                        break;
                    }
                    if (this.f5369b > i3 && !this.f5368a.isEmpty()) {
                        Map.Entry entry = (Map.Entry) this.f5368a.entrySet().iterator().next();
                        Object key = entry.getKey();
                        entry.getValue();
                        this.f5368a.remove(key);
                        this.f5369b--;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i3;
        int i4;
        int i5;
        try {
            i3 = this.f5371d;
            i4 = this.e;
            int i6 = i3 + i4;
            i5 = i6 != 0 ? (i3 * 100) / i6 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f5370c + ",hits=" + i3 + ",misses=" + i4 + ",hitRate=" + i5 + "%]";
    }
}
