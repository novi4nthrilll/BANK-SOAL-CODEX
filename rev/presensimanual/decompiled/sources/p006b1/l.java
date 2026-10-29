package p006b1;

import G.i;
import O0.C0089c;
import O0.u;
import P0.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.location.LocationRequest;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p013d1.AbstractC0522t;
import p023g1.j;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new i(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationRequest f2537a;

    /* JADX WARN: Code duplicated, block: B:104:0x016a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0177  */
    /* JADX WARN: Code duplicated, block: B:108:0x017b  */
    /* JADX WARN: Code duplicated, block: B:110:0x017f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0181  */
    /* JADX WARN: Code duplicated, block: B:113:0x0185  */
    /* JADX WARN: Code duplicated, block: B:116:0x0190  */
    /* JADX WARN: Code duplicated, block: B:118:0x0196  */
    /* JADX WARN: Code duplicated, block: B:120:0x019c  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114  */
    /* JADX WARN: Code duplicated, block: B:86:0x0138  */
    public l(LocationRequest locationRequest, ArrayList arrayList, boolean z2, boolean z3, boolean z4, boolean z5, long j3) {
        long j4;
        int i3;
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        boolean z7;
        j jVar;
        long j5;
        long j6;
        int i8;
        WorkSource workSource;
        boolean z8;
        long jMin;
        long j7;
        boolean z9;
        WorkSource workSource2;
        Iterator it;
        C0089c c0089c;
        int i9;
        Method method;
        long j8;
        Method method2;
        String str;
        int i10 = locationRequest.f3515a;
        long j9 = locationRequest.f3516b;
        u.a("intervalMillis must be greater than or equal to 0", j9 >= 0);
        j.a(i10);
        long j10 = locationRequest.f3517c;
        u.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j10 == -1 || j10 >= 0);
        long j11 = locationRequest.f3518d;
        u.a("maxUpdateDelayMillis must be greater than or equal to 0", j11 >= 0);
        long j12 = locationRequest.e;
        u.a("durationMillis must be greater than 0", j12 > 0);
        int i11 = locationRequest.f3519f;
        u.a("maxUpdates must be greater than 0", i11 > 0);
        float f3 = locationRequest.f3520g;
        u.a("minUpdateDistanceMeters must be greater than or equal to 0", f3 >= 0.0f);
        boolean z10 = locationRequest.f3521h;
        long j13 = locationRequest.f3522i;
        u.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", j13 == -1 || j13 >= 0);
        int i12 = locationRequest.f3523j;
        if (i12 != 0) {
            j4 = j13;
            i3 = 1;
            if (i12 != 1) {
                if (i12 == 2) {
                    z6 = true;
                    i4 = 2;
                } else {
                    i4 = i12;
                    z6 = false;
                }
            }
            i5 = i12;
            Object[] objArr = new Object[i3];
            objArr[0] = Integer.valueOf(i4);
            u.b(z6, "granularity %d must be a Granularity.GRANULARITY_* constant", objArr);
            i6 = locationRequest.f3524k;
            if (i6 == 0 && i6 != i3) {
                if (i6 == 2) {
                    i7 = 2;
                } else {
                    i7 = i6;
                    z7 = false;
                }
                Object[] objArr2 = new Object[i3];
                objArr2[0] = Integer.valueOf(i7);
                u.b(z7, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr2);
                jVar = locationRequest.f3527n;
                if (jVar == null && jVar.f2532f != null) {
                    throw new IllegalArgumentException();
                }
                if (arrayList == null) {
                    j5 = j12;
                    j6 = j11;
                    i8 = i6;
                    workSource = locationRequest.f3526m;
                } else if (arrayList.isEmpty()) {
                    workSource = null;
                    j5 = j12;
                    j6 = j11;
                    i8 = i6;
                } else {
                    workSource2 = new WorkSource();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        c0089c = (C0089c) it.next();
                        i9 = c0089c.f1247a;
                        method = U0.a.f1628b;
                        int i13 = i6;
                        long j14 = j12;
                        if (method != null) {
                            str = c0089c.f1248b;
                            str = str == null ? "" : str;
                            try {
                                j8 = j11;
                                try {
                                    Object[] objArr3 = new Object[2];
                                    objArr3[0] = Integer.valueOf(i9);
                                    try {
                                        objArr3[1] = str;
                                        method.invoke(workSource2, objArr3);
                                    } catch (Exception e) {
                                        e = e;
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                    i6 = i13;
                                    j12 = j14;
                                    j11 = j8;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                j8 = j11;
                            }
                        } else {
                            j8 = j11;
                            method2 = U0.a.f1627a;
                            if (method2 != null) {
                                try {
                                    try {
                                        Object[] objArr4 = new Object[1];
                                        try {
                                            objArr4[0] = Integer.valueOf(i9);
                                            method2.invoke(workSource2, objArr4);
                                        } catch (Exception e5) {
                                            e = e5;
                                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                                        i6 = i13;
                                        j12 = j14;
                                        j11 = j8;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                }
                            }
                            i6 = i13;
                            j12 = j14;
                            j11 = j8;
                        }
                        i6 = i13;
                        j12 = j14;
                        j11 = j8;
                    }
                    j5 = j12;
                    j6 = j11;
                    i8 = i6;
                    workSource = workSource2;
                }
                i5 = z2 ? 1 : i5;
                i8 = z3 ? 2 : i8;
                if (z4) {
                    z8 = true;
                } else {
                    z8 = locationRequest.f3525l;
                }
                z10 = z5 ? true : z10;
                if (j3 != Long.MAX_VALUE) {
                    if (j3 != -1 || j3 >= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    u.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z9);
                    j4 = j3;
                }
                if (j10 == -1) {
                    jMin = j9;
                } else if (i10 == 105) {
                    jMin = j10;
                } else {
                    jMin = Math.min(j10, j9);
                }
                long jMax = Math.max(j6, j9);
                if (j4 == -1) {
                    j7 = j9;
                } else {
                    j7 = j4;
                }
                this.f2537a = new LocationRequest(i10, j9, jMin, jMax, Long.MAX_VALUE, j5, i11, f3, z10, j7, i5, i8, z8, new WorkSource(workSource), null);
            }
            i7 = i6;
            z7 = true;
            Object[] objArr5 = new Object[i3];
            objArr5[0] = Integer.valueOf(i7);
            u.b(z7, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr5);
            jVar = locationRequest.f3527n;
            if (jVar == null) {
            }
            if (arrayList == null) {
                j5 = j12;
                j6 = j11;
                i8 = i6;
                workSource = locationRequest.f3526m;
            } else if (arrayList.isEmpty()) {
                workSource = null;
                j5 = j12;
                j6 = j11;
                i8 = i6;
            } else {
                workSource2 = new WorkSource();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c0089c = (C0089c) it.next();
                    i9 = c0089c.f1247a;
                    method = U0.a.f1628b;
                    int i14 = i6;
                    long j15 = j12;
                    if (method != null) {
                        str = c0089c.f1248b;
                        if (str == null) {
                        }
                        j8 = j11;
                        Object[] objArr6 = new Object[2];
                        objArr6[0] = Integer.valueOf(i9);
                        objArr6[1] = str;
                        method.invoke(workSource2, objArr6);
                    } else {
                        j8 = j11;
                        method2 = U0.a.f1627a;
                        if (method2 != null) {
                            Object[] objArr7 = new Object[1];
                            objArr7[0] = Integer.valueOf(i9);
                            method2.invoke(workSource2, objArr7);
                        }
                        i6 = i14;
                        j12 = j15;
                        j11 = j8;
                    }
                    i6 = i14;
                    j12 = j15;
                    j11 = j8;
                }
                j5 = j12;
                j6 = j11;
                i8 = i6;
                workSource = workSource2;
            }
            if (z2) {
            }
            if (z3) {
            }
            if (z4) {
                z8 = true;
            } else {
                z8 = locationRequest.f3525l;
            }
            if (z5) {
            }
            if (j3 != Long.MAX_VALUE) {
                if (j3 != -1) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                u.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z9);
                j4 = j3;
            }
            if (j10 == -1) {
                jMin = j9;
            } else if (i10 == 105) {
                jMin = j10;
            } else {
                jMin = Math.min(j10, j9);
            }
            long jMax2 = Math.max(j6, j9);
            if (j4 == -1) {
                j7 = j9;
            } else {
                j7 = j4;
            }
            this.f2537a = new LocationRequest(i10, j9, jMin, jMax2, Long.MAX_VALUE, j5, i11, f3, z10, j7, i5, i8, z8, new WorkSource(workSource), null);
        }
        j4 = j13;
        i3 = 1;
        i4 = i12;
        z6 = true;
        i5 = i12;
        Object[] objArr8 = new Object[i3];
        objArr8[0] = Integer.valueOf(i4);
        u.b(z6, "granularity %d must be a Granularity.GRANULARITY_* constant", objArr8);
        i6 = locationRequest.f3524k;
        if (i6 == 0) {
            i7 = i6;
            z7 = true;
        } else {
            i7 = i6;
            z7 = true;
        }
        Object[] objArr9 = new Object[i3];
        objArr9[0] = Integer.valueOf(i7);
        u.b(z7, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", objArr9);
        jVar = locationRequest.f3527n;
        if (jVar == null) {
        }
        if (arrayList == null) {
            j5 = j12;
            j6 = j11;
            i8 = i6;
            workSource = locationRequest.f3526m;
        } else if (arrayList.isEmpty()) {
            workSource = null;
            j5 = j12;
            j6 = j11;
            i8 = i6;
        } else {
            workSource2 = new WorkSource();
            it = arrayList.iterator();
            while (it.hasNext()) {
                c0089c = (C0089c) it.next();
                i9 = c0089c.f1247a;
                method = U0.a.f1628b;
                int i15 = i6;
                long j16 = j12;
                if (method != null) {
                    str = c0089c.f1248b;
                    if (str == null) {
                    }
                    j8 = j11;
                    Object[] objArr10 = new Object[2];
                    objArr10[0] = Integer.valueOf(i9);
                    objArr10[1] = str;
                    method.invoke(workSource2, objArr10);
                } else {
                    j8 = j11;
                    method2 = U0.a.f1627a;
                    if (method2 != null) {
                        Object[] objArr11 = new Object[1];
                        objArr11[0] = Integer.valueOf(i9);
                        method2.invoke(workSource2, objArr11);
                    }
                    i6 = i15;
                    j12 = j16;
                    j11 = j8;
                }
                i6 = i15;
                j12 = j16;
                j11 = j8;
            }
            j5 = j12;
            j6 = j11;
            i8 = i6;
            workSource = workSource2;
        }
        if (z2) {
        }
        if (z3) {
        }
        if (z4) {
            z8 = true;
        } else {
            z8 = locationRequest.f3525l;
        }
        if (z5) {
        }
        if (j3 != Long.MAX_VALUE) {
            if (j3 != -1) {
                z9 = true;
            } else {
                z9 = true;
            }
            u.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z9);
            j4 = j3;
        }
        if (j10 == -1) {
            jMin = j9;
        } else if (i10 == 105) {
            jMin = j10;
        } else {
            jMin = Math.min(j10, j9);
        }
        long jMax3 = Math.max(j6, j9);
        if (j4 == -1) {
            j7 = j9;
        } else {
            j7 = j4;
        }
        this.f2537a = new LocationRequest(i10, j9, jMin, jMax3, Long.MAX_VALUE, j5, i11, f3, z10, j7, i5, i8, z8, new WorkSource(workSource), null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return u.i(this.f2537a, ((l) obj).f2537a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2537a.hashCode();
    }

    public final String toString() {
        return this.f2537a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.b(parcel, 1, this.f2537a, i3);
        AbstractC0522t.g(parcel, iF);
    }
}
