package com.google.android.gms.location;

import G.i;
import O0.u;
import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.lang.reflect.Method;
import java.util.Arrays;
import p006b1.j;
import p006b1.n;
import p013d1.AbstractC0522t;

/* JADX INFO: loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new i(29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3518d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f3520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3522i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f3523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3524k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3525l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WorkSource f3526m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f3527n;

    public LocationRequest(int i3, long j3, long j4, long j5, long j6, long j7, int i4, float f3, boolean z2, long j8, int i5, int i6, boolean z3, WorkSource workSource, j jVar) {
        long j9;
        this.f3515a = i3;
        if (i3 == 105) {
            this.f3516b = Long.MAX_VALUE;
            j9 = j3;
        } else {
            j9 = j3;
            this.f3516b = j9;
        }
        this.f3517c = j4;
        this.f3518d = j5;
        this.e = j6 == Long.MAX_VALUE ? j7 : Math.min(Math.max(1L, j6 - SystemClock.elapsedRealtime()), j7);
        this.f3519f = i4;
        this.f3520g = f3;
        this.f3521h = z2;
        this.f3522i = j8 != -1 ? j8 : j9;
        this.f3523j = i5;
        this.f3524k = i6;
        this.f3525l = z3;
        this.f3526m = workSource;
        this.f3527n = jVar;
    }

    public static String b(long j3) {
        String string;
        if (j3 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = n.f2545b;
        synchronized (sb) {
            sb.setLength(0);
            n.a(j3, sb);
            string = sb.toString();
        }
        return string;
    }

    public final boolean a() {
        long j3 = this.f3518d;
        return j3 > 0 && (j3 >> 1) >= this.f3516b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i3 = this.f3515a;
            if (i3 == locationRequest.f3515a && ((i3 == 105 || this.f3516b == locationRequest.f3516b) && this.f3517c == locationRequest.f3517c && a() == locationRequest.a() && ((!a() || this.f3518d == locationRequest.f3518d) && this.e == locationRequest.e && this.f3519f == locationRequest.f3519f && this.f3520g == locationRequest.f3520g && this.f3521h == locationRequest.f3521h && this.f3523j == locationRequest.f3523j && this.f3524k == locationRequest.f3524k && this.f3525l == locationRequest.f3525l && this.f3526m.equals(locationRequest.f3526m) && u.i(this.f3527n, locationRequest.f3527n)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3515a), Long.valueOf(this.f3516b), Long.valueOf(this.f3517c), this.f3526m});
    }

    /* JADX WARN: Code duplicated, block: B:85:0x0155  */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    /* JADX WARN: Code duplicated, block: B:95:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final String toString() {
        Method method;
        int iIntValue;
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i3 = this.f3515a;
        boolean zBooleanValue = false;
        boolean z2 = i3 == 105;
        long j3 = this.f3518d;
        if (z2) {
            sb.append(p023g1.j.b(i3));
            if (j3 > 0) {
                sb.append("/");
                n.a(j3, sb);
            }
        } else {
            sb.append("@");
            if (a()) {
                n.a(this.f3516b, sb);
                sb.append("/");
                n.a(j3, sb);
            } else {
                n.a(this.f3516b, sb);
            }
            sb.append(" ");
            sb.append(p023g1.j.b(this.f3515a));
        }
        if (this.f3515a == 105 || this.f3517c != this.f3516b) {
            sb.append(", minUpdateInterval=");
            sb.append(b(this.f3517c));
        }
        if (this.f3520g > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f3520g);
        }
        if (!(this.f3515a == 105) ? this.f3522i != this.f3516b : this.f3522i != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(b(this.f3522i));
        }
        long j4 = this.e;
        if (j4 != Long.MAX_VALUE) {
            sb.append(", duration=");
            n.a(j4, sb);
        }
        int i4 = this.f3519f;
        if (i4 != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(i4);
        }
        int i5 = this.f3524k;
        if (i5 != 0) {
            sb.append(", ");
            if (i5 == 0) {
                str2 = "THROTTLE_BACKGROUND";
            } else if (i5 == 1) {
                str2 = "THROTTLE_ALWAYS";
            } else {
                if (i5 != 2) {
                    throw new IllegalArgumentException();
                }
                str2 = "THROTTLE_NEVER";
            }
            sb.append(str2);
        }
        int i6 = this.f3523j;
        if (i6 != 0) {
            sb.append(", ");
            if (i6 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i6 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i6 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            sb.append(str);
        }
        if (this.f3521h) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.f3525l) {
            sb.append(", bypass");
        }
        Method method2 = U0.a.f1630d;
        WorkSource workSource = this.f3526m;
        if (method2 != null) {
            try {
                Object objInvoke = method2.invoke(workSource, null);
                u.f(objInvoke);
                zBooleanValue = ((Boolean) objInvoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
                method = U0.a.f1629c;
                if (method != null) {
                    try {
                        Object objInvoke2 = method.invoke(workSource, null);
                        u.f(objInvoke2);
                        iIntValue = ((Integer) objInvoke2).intValue();
                    } catch (Exception e3) {
                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
                        iIntValue = 0;
                    }
                } else {
                    iIntValue = 0;
                }
                if (iIntValue == 0) {
                    zBooleanValue = true;
                }
            }
        } else {
            method = U0.a.f1629c;
            if (method != null) {
                Object objInvoke3 = method.invoke(workSource, null);
                u.f(objInvoke3);
                iIntValue = ((Integer) objInvoke3).intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                zBooleanValue = true;
            }
        }
        if (!zBooleanValue) {
            sb.append(", ");
            sb.append(workSource);
        }
        j jVar = this.f3527n;
        if (jVar != null) {
            sb.append(", impersonation=");
            sb.append(jVar);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        int i4 = this.f3515a;
        AbstractC0522t.h(parcel, 1, 4);
        parcel.writeInt(i4);
        long j3 = this.f3516b;
        AbstractC0522t.h(parcel, 2, 8);
        parcel.writeLong(j3);
        long j4 = this.f3517c;
        AbstractC0522t.h(parcel, 3, 8);
        parcel.writeLong(j4);
        AbstractC0522t.h(parcel, 6, 4);
        parcel.writeInt(this.f3519f);
        float f3 = this.f3520g;
        AbstractC0522t.h(parcel, 7, 4);
        parcel.writeFloat(f3);
        AbstractC0522t.h(parcel, 8, 8);
        parcel.writeLong(this.f3518d);
        AbstractC0522t.h(parcel, 9, 4);
        parcel.writeInt(this.f3521h ? 1 : 0);
        AbstractC0522t.h(parcel, 10, 8);
        parcel.writeLong(this.e);
        long j5 = this.f3522i;
        AbstractC0522t.h(parcel, 11, 8);
        parcel.writeLong(j5);
        AbstractC0522t.h(parcel, 12, 4);
        parcel.writeInt(this.f3523j);
        AbstractC0522t.h(parcel, 13, 4);
        parcel.writeInt(this.f3524k);
        AbstractC0522t.h(parcel, 15, 4);
        parcel.writeInt(this.f3525l ? 1 : 0);
        AbstractC0522t.b(parcel, 16, this.f3526m, i3);
        AbstractC0522t.b(parcel, 17, this.f3527n, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
