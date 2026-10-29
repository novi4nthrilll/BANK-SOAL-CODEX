package E2;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f242d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f243f;

    public a(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f242d = i3;
        if (i5 > 0) {
            if (i3 < i4) {
                int i6 = i4 % i5;
                int i7 = i3 % i5;
                int i8 = ((i6 < 0 ? i6 + i5 : i6) - (i7 < 0 ? i7 + i5 : i7)) % i5;
                i4 -= i8 < 0 ? i8 + i5 : i8;
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i3 > i4) {
                int i9 = -i5;
                int i10 = i3 % i9;
                int i11 = i4 % i9;
                int i12 = ((i10 < 0 ? i10 + i9 : i10) - (i11 < 0 ? i11 + i9 : i11)) % i9;
                i4 += i12 < 0 ? i12 + i9 : i12;
            }
        }
        this.e = i4;
        this.f243f = i5;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f242d != aVar.f242d || this.e != aVar.e || this.f243f != aVar.f243f) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f242d * 31) + this.e) * 31) + this.f243f;
    }

    public boolean isEmpty() {
        int i3 = this.f243f;
        int i4 = this.e;
        int i5 = this.f242d;
        if (i3 > 0) {
            if (i5 <= i4) {
                return false;
            }
        } else if (i5 >= i4) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f242d, this.e, this.f243f);
    }

    public String toString() {
        StringBuilder sb;
        int i3 = this.e;
        int i4 = this.f242d;
        int i5 = this.f243f;
        if (i5 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i3);
            sb.append(" step ");
            sb.append(i5);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i3);
            sb.append(" step ");
            sb.append(-i5);
        }
        return sb.toString();
    }
}
