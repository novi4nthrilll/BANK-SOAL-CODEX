package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Q8 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparable f2893d;
    public Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P8 f2894f;

    public Q8(P8 p8, Comparable comparable, Object obj) {
        this.f2894f = p8;
        this.f2893d = comparable;
        this.e = obj;
    }

    public final Comparable a() {
        return this.f2893d;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2893d.compareTo(((Q8) obj).f2893d);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f2893d;
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.e;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f2893d;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2893d;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.e;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2894f.h();
        Object obj2 = this.e;
        this.e = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f2893d) + "=" + String.valueOf(this.e);
    }
}
