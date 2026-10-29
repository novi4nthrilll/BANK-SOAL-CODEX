package p009c1;

import E0.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p013d1.B2;
import p013d1.D2;
import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Map, Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f2662j = new l(null, new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient i f2663d;
    public transient j e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient k f2664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient Object f2665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Object[] f2666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f2667i;

    public l(Object obj, Object[] objArr, int i3) {
        this.f2665g = obj;
        this.f2666h = objArr;
        this.f2667i = i3;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    public static l a(int i3, Object[] objArr, i iVar) {
        int iHighestOneBit;
        short[] sArr;
        char c3;
        char c4;
        ?? r4;
        ?? r5;
        boolean z2;
        ?? r6;
        Object[] objArr2;
        e eVar;
        int i4 = i3;
        Object[] objArrCopyOf = objArr;
        if (i4 == 0) {
            return f2662j;
        }
        int i5 = 1;
        e eVar2 = null;
        ?? r7 = 0;
        e eVar3 = null;
        e eVar4 = null;
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new l(null, objArrCopyOf, 1);
        }
        B2.b(i4, objArrCopyOf.length >> 1);
        int iMax = Math.max(i4, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i4 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            i4 = 1;
        } else {
            int i6 = iHighestOneBit - 1;
            byte b3 = -1;
            if (iHighestOneBit > 128) {
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i7 = 0;
                    for (int i8 = 0; i8 < i4; i8++) {
                        int i9 = i7 + i7;
                        int i10 = i8 + i8;
                        Object obj = objArrCopyOf[i10];
                        Objects.requireNonNull(obj);
                        Object obj2 = objArrCopyOf[i10 ^ 1];
                        Objects.requireNonNull(obj2);
                        int iA = D2.a(obj.hashCode());
                        while (true) {
                            int i11 = iA & i6;
                            char c5 = (char) sArr[i11];
                            if (c5 == 65535) {
                                sArr[i11] = (short) i9;
                                if (i7 < i8) {
                                    objArrCopyOf[i9] = obj;
                                    objArrCopyOf[i9 ^ 1] = obj2;
                                }
                                i7++;
                                break;
                            }
                            if (obj.equals(objArrCopyOf[c5])) {
                                int i12 = c5 ^ 1;
                                Object obj3 = objArrCopyOf[i12 == true ? 1 : 0];
                                Objects.requireNonNull(obj3);
                                e eVar5 = new e(obj, obj2, obj3);
                                objArrCopyOf[i12 == true ? 1 : 0] = obj2;
                                eVar4 = eVar5;
                                break;
                            }
                            iA = i11 + 1;
                        }
                    }
                    if (i7 != i4) {
                        c4 = 2;
                        r5 = new Object[]{sArr, Integer.valueOf(i7), eVar4};
                    }
                    c3 = 1;
                    r4 = r5;
                    z2 = r4 instanceof Object[];
                    r6 = r4;
                    if (z2) {
                        objArr2 = (Object[]) r4;
                        eVar = (e) objArr2[c4];
                        if (iVar == null) {
                            throw eVar.a();
                        }
                        iVar.f219g = eVar;
                        Object obj4 = objArr2[0];
                        int iIntValue = ((Integer) objArr2[c3]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                        r6 = obj4;
                        i4 = iIntValue;
                    }
                    return new l(r6, objArrCopyOf, i4);
                }
                int i13 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i14 = 0;
                int i15 = 0;
                while (i14 < i4) {
                    int i16 = i15 + i15;
                    int i17 = i14 + i14;
                    Object obj5 = objArrCopyOf[i17];
                    Objects.requireNonNull(obj5);
                    Object obj6 = objArrCopyOf[i17 ^ i13];
                    Objects.requireNonNull(obj6);
                    int iA2 = D2.a(obj5.hashCode());
                    while (true) {
                        int i18 = iA2 & i6;
                        ?? r15 = sArr[i18];
                        if (r15 == b3) {
                            sArr[i18] = i16;
                            if (i15 < i14) {
                                objArrCopyOf[i16] = obj5;
                                objArrCopyOf[i16 ^ 1] = obj6;
                            }
                            i15++;
                            break;
                        }
                        if (obj5.equals(objArrCopyOf[r15])) {
                            int i19 = r15 ^ 1;
                            Object obj7 = objArrCopyOf[i19 == true ? 1 : 0];
                            Objects.requireNonNull(obj7);
                            e eVar6 = new e(obj5, obj6, obj7);
                            objArrCopyOf[i19 == true ? 1 : 0] = obj6;
                            eVar2 = eVar6;
                            break;
                        }
                        iA2 = i18 + 1;
                        b3 = -1;
                    }
                    i14++;
                    b3 = -1;
                    i13 = 1;
                }
                if (i15 != i4) {
                    c3 = 1;
                    c4 = 2;
                    r4 = new Object[]{sArr, Integer.valueOf(i15), eVar2};
                }
                z2 = r4 instanceof Object[];
                r6 = r4;
                if (z2) {
                    objArr2 = (Object[]) r4;
                    eVar = (e) objArr2[c4];
                    if (iVar == null) {
                        throw eVar.a();
                    }
                    iVar.f219g = eVar;
                    Object obj8 = objArr2[0];
                    int iIntValue2 = ((Integer) objArr2[c3]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
                    r6 = obj8;
                    i4 = iIntValue2;
                }
                return new l(r6, objArrCopyOf, i4);
            }
            byte[] bArr = new byte[iHighestOneBit];
            Arrays.fill(bArr, (byte) -1);
            int i20 = 0;
            int i21 = 0;
            while (i20 < i4) {
                int i22 = i21 + i21;
                int i23 = i20 + i20;
                Object obj9 = objArrCopyOf[i23];
                Objects.requireNonNull(obj9);
                Object obj10 = objArrCopyOf[i23 ^ i5];
                Objects.requireNonNull(obj10);
                int iA3 = D2.a(obj9.hashCode());
                while (true) {
                    int i24 = iA3 & i6;
                    int i25 = bArr[i24] & 255;
                    if (i25 == 255) {
                        bArr[i24] = (byte) i22;
                        if (i21 < i20) {
                            objArrCopyOf[i22] = obj9;
                            objArrCopyOf[i22 ^ 1] = obj10;
                        }
                        i21++;
                        break;
                    }
                    if (obj9.equals(objArrCopyOf[i25 == true ? 1 : 0])) {
                        int i26 = ~i25;
                        Object obj11 = objArrCopyOf[i26 == true ? 1 : 0];
                        Objects.requireNonNull(obj11);
                        eVar3 = new e(obj9, obj10, obj11);
                        objArrCopyOf[i26 == true ? 1 : 0] = obj10;
                        break;
                    }
                    iA3 = i24 + 1;
                }
                i20++;
                i5 = 1;
            }
            if (i21 == i4) {
                r7 = bArr;
            } else {
                sArr = new Object[]{bArr, Integer.valueOf(i21), eVar3};
            }
            r7 = sArr;
        }
        c4 = 2;
        r5 = r7;
        c3 = 1;
        r4 = r5;
        z2 = r4 instanceof Object[];
        r6 = r4;
        if (z2) {
            objArr2 = (Object[]) r4;
            eVar = (e) objArr2[c4];
            if (iVar == null) {
                throw eVar.a();
            }
            iVar.f219g = eVar;
            Object obj12 = objArr2[0];
            int iIntValue3 = ((Integer) objArr2[c3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue3 + iIntValue3);
            r6 = obj12;
            i4 = iIntValue3;
        }
        return new l(r6, objArrCopyOf, i4);
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        k kVar = this.f2664f;
        if (kVar == null) {
            kVar = new k(this.f2666h, 1, this.f2667i);
            this.f2664f = kVar;
        }
        return kVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i iVar = this.f2663d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, this.f2666h, this.f2667i);
        this.f2663d = iVar2;
        return iVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i3 = this.f2667i;
            Object[] objArr = this.f2666h;
            if (i3 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f2665g;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = D2.a(obj.hashCode());
                    while (true) {
                        int i4 = iA & length;
                        int i5 = bArr[i4] & 255;
                        if (i5 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i5])) {
                            obj2 = objArr[i5 ^ 1];
                        } else {
                            iA = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = D2.a(obj.hashCode());
                    while (true) {
                        int i6 = iA2 & length2;
                        char c3 = (char) sArr[i6];
                        if (c3 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c3])) {
                            obj2 = objArr[c3 ^ 1];
                        } else {
                            iA2 = i6 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = D2.a(obj.hashCode());
                    while (true) {
                        int i7 = iA3 & length3;
                        int i8 = iArr[i7];
                        if (i8 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i8])) {
                            obj2 = objArr[i8 ^ 1];
                        } else {
                            iA3 = i7 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        i iVar = this.f2663d;
        if (iVar == null) {
            iVar = new i(this, this.f2666h, this.f2667i);
            this.f2663d = iVar;
        }
        Iterator it = iVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        j jVar = this.e;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, new k(this.f2666h, 0, this.f2667i));
        this.e = jVar2;
        return jVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2667i;
    }

    public final String toString() {
        int i3 = this.f2667i;
        if (i3 < 0) {
            throw new IllegalArgumentException(I.f("size cannot be negative but was: ", i3));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i3) * 8, 1073741824L));
        sb.append('{');
        boolean z2 = true;
        for (Map.Entry entry : (i) entrySet()) {
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
    }

    @Override // java.util.Map
    public final Collection values() {
        k kVar = this.f2664f;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this.f2666h, 1, this.f2667i);
        this.f2664f = kVar2;
        return kVar2;
    }
}
