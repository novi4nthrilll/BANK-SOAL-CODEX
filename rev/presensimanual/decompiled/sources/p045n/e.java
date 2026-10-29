package p045n;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f5364h = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5365d = false;
    public long[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object[] f5366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5367g;

    public e() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 80;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (80 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.e = new long[i6];
        this.f5366f = new Object[i6];
    }

    public final void a(long j3, Long l3) {
        int i3 = this.f5367g;
        if (i3 != 0 && j3 <= this.e[i3 - 1]) {
            e(j3, l3);
            return;
        }
        if (this.f5365d && i3 >= this.e.length) {
            c();
        }
        int i4 = this.f5367g;
        if (i4 >= this.e.length) {
            int i5 = (i4 + 1) * 8;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 8;
            long[] jArr = new long[i8];
            Object[] objArr = new Object[i8];
            long[] jArr2 = this.e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f5366f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.e = jArr;
            this.f5366f = objArr;
        }
        this.e[i4] = j3;
        this.f5366f[i4] = l3;
        this.f5367g = i4 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.e = (long[]) this.e.clone();
            eVar.f5366f = (Object[]) this.f5366f.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void c() {
        int i3 = this.f5367g;
        long[] jArr = this.e;
        Object[] objArr = this.f5366f;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f5364h) {
                if (i5 != i4) {
                    jArr[i4] = jArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f5365d = false;
        this.f5367g = i4;
    }

    public final Object d(long j3, Long l3) {
        Object obj;
        int iB = d.b(this.e, this.f5367g, j3);
        return (iB < 0 || (obj = this.f5366f[iB]) == f5364h) ? l3 : obj;
    }

    public final void e(long j3, Object obj) {
        int iB = d.b(this.e, this.f5367g, j3);
        if (iB >= 0) {
            this.f5366f[iB] = obj;
            return;
        }
        int i3 = ~iB;
        int i4 = this.f5367g;
        if (i3 < i4) {
            Object[] objArr = this.f5366f;
            if (objArr[i3] == f5364h) {
                this.e[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f5365d && i4 >= this.e.length) {
            c();
            i3 = ~d.b(this.e, this.f5367g, j3);
        }
        int i5 = this.f5367g;
        if (i5 >= this.e.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            long[] jArr = new long[i9];
            Object[] objArr2 = new Object[i9];
            long[] jArr2 = this.e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f5366f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = jArr;
            this.f5366f = objArr2;
        }
        int i10 = this.f5367g - i3;
        if (i10 != 0) {
            long[] jArr3 = this.e;
            int i11 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i11, i10);
            Object[] objArr4 = this.f5366f;
            System.arraycopy(objArr4, i3, objArr4, i11, this.f5367g - i3);
        }
        this.e[i3] = j3;
        this.f5366f[i3] = obj;
        this.f5367g++;
    }

    public final String toString() {
        if (this.f5365d) {
            c();
        }
        if (this.f5367g <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5367g * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f5367g; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            if (this.f5365d) {
                c();
            }
            sb.append(this.e[i3]);
            sb.append('=');
            if (this.f5365d) {
                c();
            }
            Object obj = this.f5366f[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
