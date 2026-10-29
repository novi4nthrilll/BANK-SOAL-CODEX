package p045n;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f5390g = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f5391d;
    public Object[] e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5392f;

    public m() {
        int i3;
        int i4 = 4;
        while (true) {
            i3 = 40;
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (40 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f5391d = new int[i6];
        this.e = new Object[i6];
    }

    public final void a(int i3, Object obj) {
        int i4 = this.f5392f;
        if (i4 != 0 && i3 <= this.f5391d[i4 - 1]) {
            d(i3, obj);
            return;
        }
        if (i4 >= this.f5391d.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr = new Object[i8];
            int[] iArr2 = this.f5391d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5391d = iArr;
            this.e = objArr;
        }
        this.f5391d[i4] = i3;
        this.e[i4] = obj;
        this.f5392f = i4 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.f5391d = (int[]) this.f5391d.clone();
            mVar.e = (Object[]) this.e.clone();
            return mVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object c(int i3, Integer num) {
        Object obj;
        int iA = d.a(this.f5392f, i3, this.f5391d);
        return (iA < 0 || (obj = this.e[iA]) == f5390g) ? num : obj;
    }

    public final void d(int i3, Object obj) {
        int iA = d.a(this.f5392f, i3, this.f5391d);
        if (iA >= 0) {
            this.e[iA] = obj;
            return;
        }
        int i4 = ~iA;
        int i5 = this.f5392f;
        if (i4 < i5) {
            Object[] objArr = this.e;
            if (objArr[i4] == f5390g) {
                this.f5391d[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (i5 >= this.f5391d.length) {
            int i6 = (i5 + 1) * 4;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 4;
            int[] iArr = new int[i9];
            Object[] objArr2 = new Object[i9];
            int[] iArr2 = this.f5391d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5391d = iArr;
            this.e = objArr2;
        }
        int i10 = this.f5392f - i4;
        if (i10 != 0) {
            int[] iArr3 = this.f5391d;
            int i11 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i11, i10);
            Object[] objArr4 = this.e;
            System.arraycopy(objArr4, i4, objArr4, i11, this.f5392f - i4);
        }
        this.f5391d[i4] = i3;
        this.e[i4] = obj;
        this.f5392f++;
    }

    public final String toString() {
        int i3 = this.f5392f;
        if (i3 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i3 * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f5392f; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f5391d[i4]);
            sb.append('=');
            Object obj = this.e[i4];
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
