package p069w;

import A.d;
import android.location.LocationRequest;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p013d1.AbstractC0538v3;
import p034j2.b;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f5770d;

    public h(long j3, int i3, long j4, float f3) {
        this.f5768b = j3;
        this.f5767a = i3;
        this.f5769c = j4;
        this.f5770d = f3;
    }

    public final LocationRequest a(String str) {
        long j3 = this.f5768b;
        if (Build.VERSION.SDK_INT >= 31) {
            return g.a(this);
        }
        Object obj = null;
        try {
            if (AbstractC0538v3.f3906a == null) {
                AbstractC0538v3.f3906a = Class.forName("android.location.LocationRequest");
            }
            if (AbstractC0538v3.f3907b == null) {
                Method declaredMethod = AbstractC0538v3.f3906a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                AbstractC0538v3.f3907b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            Object objInvoke = AbstractC0538v3.f3907b.invoke(null, str, Long.valueOf(j3), Float.valueOf(this.f5770d), Boolean.FALSE);
            if (objInvoke != null) {
                if (AbstractC0538v3.f3908c == null) {
                    Method declaredMethod2 = AbstractC0538v3.f3906a.getDeclaredMethod("setQuality", Integer.TYPE);
                    AbstractC0538v3.f3908c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                AbstractC0538v3.f3908c.invoke(objInvoke, Integer.valueOf(this.f5767a));
                if (AbstractC0538v3.f3909d == null) {
                    Method declaredMethod3 = AbstractC0538v3.f3906a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    AbstractC0538v3.f3909d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Method method = AbstractC0538v3.f3909d;
                long j4 = this.f5769c;
                if (j4 != -1) {
                    j3 = j4;
                }
                method.invoke(objInvoke, Long.valueOf(j3));
                obj = objInvoke;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return b.b(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f5767a == hVar.f5767a && this.f5768b == hVar.f5768b && this.f5769c == hVar.f5769c && Float.compare(hVar.f5770d, this.f5770d) == 0;
    }

    public final int hashCode() {
        int i3 = this.f5767a * 31;
        long j3 = this.f5768b;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f5769c;
        return i4 + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        long j3 = this.f5768b;
        if (j3 != Long.MAX_VALUE) {
            sb.append("@");
            d.c(j3, sb);
            int i3 = this.f5767a;
            if (i3 == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i3 == 102) {
                sb.append(" BALANCED");
            } else if (i3 == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        long j4 = this.f5769c;
        if (j4 != -1 && j4 < j3) {
            sb.append(", minUpdateInterval=");
            d.c(j4, sb);
        }
        float f3 = this.f5770d;
        if (f3 > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(f3);
        }
        if (0 > j3) {
            sb.append(", maxUpdateDelay=");
            d.c(0L, sb);
        }
        sb.append(']');
        return sb.toString();
    }
}
