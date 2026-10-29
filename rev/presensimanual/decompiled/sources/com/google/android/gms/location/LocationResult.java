package com.google.android.gms.location;

import O0.u;
import P0.a;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p006b1.n;
import p013d1.AbstractC0522t;
import p023g1.g;
import p023g1.h;

/* JADX INFO: loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f3528b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new g(0);

    public LocationResult(List list) {
        this.f3529a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i3 = Build.VERSION.SDK_INT;
        List<Location> list = this.f3529a;
        if (i3 >= 31) {
            return list.equals(locationResult.f3529a);
        }
        if (list.size() != locationResult.f3529a.size()) {
            return false;
        }
        Iterator it = locationResult.f3529a.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !u.i(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3529a});
    }

    public final String toString() {
        String string;
        boolean zD;
        boolean zE;
        float fB;
        boolean zF;
        float fC;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = h.f4501a;
        List<Location> list = this.f3529a;
        int i3 = 100;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z2 = false;
        for (Location location : list) {
            sb.ensureCapacity(i3);
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (location.isFromMockProvider()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat2 = h.f4501a;
                sb.append(decimalFormat2.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat2.format(location.getLongitude()));
                boolean zHasAccuracy = location.hasAccuracy();
                DecimalFormat decimalFormat3 = h.f4502b;
                if (zHasAccuracy) {
                    sb.append("±");
                    sb.append(decimalFormat3.format(location.getAccuracy()));
                    sb.append("m");
                }
                float fA = 0.0f;
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat3.format(location.getAltitude()));
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 26) {
                        zF = p069w.a.f(location);
                    } else {
                        Bundle extras = location.getExtras();
                        zF = extras != null && extras.containsKey("verticalAccuracy");
                    }
                    if (zF) {
                        sb.append("±");
                        if (i4 >= 26) {
                            fC = p069w.a.c(location);
                        } else {
                            Bundle extras2 = location.getExtras();
                            fC = extras2 == null ? 0.0f : extras2.getFloat("verticalAccuracy", 0.0f);
                        }
                        sb.append(decimalFormat3.format(fC));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat3.format(location.getSpeed()));
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 26) {
                        zE = p069w.a.e(location);
                    } else {
                        Bundle extras3 = location.getExtras();
                        zE = extras3 != null && extras3.containsKey("speedAccuracy");
                    }
                    if (zE) {
                        sb.append("±");
                        if (i5 >= 26) {
                            fB = p069w.a.b(location);
                        } else {
                            Bundle extras4 = location.getExtras();
                            fB = extras4 == null ? 0.0f : extras4.getFloat("speedAccuracy", 0.0f);
                        }
                        sb.append(decimalFormat3.format(fB));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat3.format(location.getBearing()));
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 26) {
                        zD = p069w.a.d(location);
                    } else {
                        Bundle extras5 = location.getExtras();
                        zD = extras5 != null && extras5.containsKey("bearingAccuracy");
                    }
                    if (zD) {
                        sb.append("±");
                        if (i6 >= 26) {
                            fA = p069w.a.a(location);
                        } else {
                            Bundle extras6 = location.getExtras();
                            if (extras6 != null) {
                                fA = extras6.getFloat("bearingAccuracy", 0.0f);
                            }
                        }
                        sb.append(decimalFormat3.format(fA));
                    }
                    sb.append("°");
                }
                Bundle extras7 = location.getExtras();
                String string2 = extras7 != null ? extras7.getString("floorLabel") : null;
                if (string2 != null) {
                    sb.append(", fl=");
                    sb.append(string2);
                }
                Bundle extras8 = location.getExtras();
                String string3 = extras8 != null ? extras8.getString("levelId") : null;
                if (string3 != null) {
                    sb.append(", lv=");
                    sb.append(string3);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + jCurrentTimeMillis;
                if (millis >= 0) {
                    string = n.f2544a.format(new Date(millis));
                } else {
                    SimpleDateFormat simpleDateFormat = n.f2544a;
                    string = Long.toString(millis);
                }
                sb.append(string);
                sb.append('}');
            }
            sb.append(", ");
            i3 = 100;
            z2 = true;
        }
        if (z2) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF = AbstractC0522t.f(parcel, 20293);
        AbstractC0522t.e(parcel, 1, this.f3529a);
        AbstractC0522t.g(parcel, iF);
    }
}
