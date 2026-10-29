package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Map, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3441d;
    public final transient Object[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient AbstractCollection f3442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient AbstractCollection f3443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient AbstractCollection f3444h;

    public /* synthetic */ r(int i3, Object[] objArr) {
        this.f3441d = i3;
        this.e = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                return get(obj) != null;
            case 1:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0310q c0310q = (C0310q) this.f3444h;
                if (c0310q == null) {
                    c0310q = new C0310q(1, this.e);
                    this.f3444h = c0310q;
                }
                return c0310q.contains(obj);
            case 1:
                p013d1.Y4 y4 = (p013d1.Y4) this.f3444h;
                if (y4 == null) {
                    y4 = new p013d1.Y4(1, this.e);
                    this.f3444h = y4;
                }
                return y4.contains(obj);
            default:
                p016e1.D d3 = (p016e1.D) this.f3444h;
                if (d3 == null) {
                    d3 = new p016e1.D(1, this.e);
                    this.f3444h = d3;
                }
                return d3.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0290o c0290o = (C0290o) this.f3442f;
                if (c0290o != null) {
                    return c0290o;
                }
                C0290o c0290o2 = new C0290o(this, this.e);
                this.f3442f = c0290o2;
                return c0290o2;
            case 1:
                p013d1.W4 w4 = (p013d1.W4) this.f3442f;
                if (w4 != null) {
                    return w4;
                }
                p013d1.W4 w5 = new p013d1.W4(this, this.e);
                this.f3442f = w5;
                return w5;
            default:
                p016e1.B b3 = (p016e1.B) this.f3442f;
                if (b3 != null) {
                    return b3;
                }
                p016e1.B b4 = new p016e1.B(this, this.e);
                this.f3442f = b4;
                return b4;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:6:0x0008  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                if (obj == null) {
                    obj2 = null;
                } else {
                    Object[] objArr = this.e;
                    Object obj5 = objArr[0];
                    Objects.requireNonNull(obj5);
                    if (obj5.equals(obj)) {
                        obj2 = objArr[1];
                        Objects.requireNonNull(obj2);
                    } else {
                        obj2 = null;
                    }
                }
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            case 1:
                if (obj == null) {
                    obj3 = null;
                } else {
                    Object[] objArr2 = this.e;
                    Object obj6 = objArr2[0];
                    obj6.getClass();
                    if (obj6.equals(obj)) {
                        obj3 = objArr2[1];
                        obj3.getClass();
                    } else {
                        obj3 = null;
                    }
                }
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            default:
                if (obj == null) {
                    obj4 = null;
                } else {
                    Object[] objArr3 = this.e;
                    Object obj7 = objArr3[0];
                    obj7.getClass();
                    if (obj7.equals(obj)) {
                        obj4 = objArr3[1];
                        obj4.getClass();
                    } else {
                        obj4 = null;
                    }
                }
                if (obj4 == null) {
                    return null;
                }
                return obj4;
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            default:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0290o c0290o = (C0290o) this.f3442f;
                if (c0290o == null) {
                    c0290o = new C0290o(this, this.e);
                    this.f3442f = c0290o;
                }
                Iterator it = c0290o.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            case 1:
                p013d1.W4 w4 = (p013d1.W4) this.f3442f;
                if (w4 == null) {
                    w4 = new p013d1.W4(this, this.e);
                    this.f3442f = w4;
                }
                Iterator it2 = w4.iterator();
                int iHashCode2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode2 += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode2;
            default:
                p016e1.B b3 = (p016e1.B) this.f3442f;
                if (b3 == null) {
                    b3 = new p016e1.B(this, this.e);
                    this.f3442f = b3;
                }
                Iterator it3 = b3.iterator();
                int iHashCode3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    iHashCode3 += next3 != null ? next3.hashCode() : 0;
                }
                return iHashCode3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f3441d) {
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0300p c0300p = (C0300p) this.f3443g;
                if (c0300p != null) {
                    return c0300p;
                }
                C0300p c0300p2 = new C0300p(this, new C0310q(0, this.e));
                this.f3443g = c0300p2;
                return c0300p2;
            case 1:
                p013d1.X4 x4 = (p013d1.X4) this.f3443g;
                if (x4 != null) {
                    return x4;
                }
                p013d1.X4 x5 = new p013d1.X4(this, new p013d1.Y4(0, this.e));
                this.f3443g = x5;
                return x5;
            default:
                p016e1.C c3 = (p016e1.C) this.f3443g;
                if (c3 != null) {
                    return c3;
                }
                p016e1.C c4 = new p016e1.C(this, new p016e1.D(0, this.e));
                this.f3443g = c4;
                return c4;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f3441d) {
        }
        return 1;
    }

    public final String toString() {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                boolean z2 = true;
                StringBuilder sb = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb.append('{');
                for (Map.Entry entry : (C0290o) entrySet()) {
                    if (!z2) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z2 = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                boolean z3 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb2.append('{');
                for (Map.Entry entry2 : (p013d1.W4) entrySet()) {
                    if (!z3) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z3 = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                boolean z4 = true;
                StringBuilder sb3 = new StringBuilder((int) Math.min(((long) 1) * 8, 1073741824L));
                sb3.append('{');
                for (Map.Entry entry3 : (p016e1.B) entrySet()) {
                    if (!z4) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z4 = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f3441d) {
            case NnApiDelegate.Options.EXECUTION_PREFERENCE_LOW_POWER /* 0 */:
                C0310q c0310q = (C0310q) this.f3444h;
                if (c0310q != null) {
                    return c0310q;
                }
                C0310q c0310q2 = new C0310q(1, this.e);
                this.f3444h = c0310q2;
                return c0310q2;
            case 1:
                p013d1.Y4 y4 = (p013d1.Y4) this.f3444h;
                if (y4 != null) {
                    return y4;
                }
                p013d1.Y4 y5 = new p013d1.Y4(1, this.e);
                this.f3444h = y5;
                return y5;
            default:
                p016e1.D d3 = (p016e1.D) this.f3444h;
                if (d3 != null) {
                    return d3;
                }
                p016e1.D d4 = new p016e1.D(1, this.e);
                this.f3444h = d4;
                return d4;
        }
    }
}
