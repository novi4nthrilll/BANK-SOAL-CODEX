package H2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f331d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f334h;

    public b(String str) {
        this.f331d = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        int i4;
        int i5 = this.e;
        if (i5 != 0) {
            return i5 == 1;
        }
        if (this.f334h < 0) {
            this.e = 2;
            return false;
        }
        String str = this.f331d;
        int length = str.length();
        int length2 = str.length();
        for (int i6 = this.f332f; i6 < length2; i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i3 = (cCharAt == '\r' && (i4 = i6 + 1) < str.length() && str.charAt(i4) == '\n') ? 2 : 1;
                length = i6;
                this.e = 1;
                this.f334h = i3;
                this.f333g = length;
                return true;
            }
        }
        i3 = -1;
        this.e = 1;
        this.f334h = i3;
        this.f333g = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.e = 0;
        int i3 = this.f333g;
        int i4 = this.f332f;
        this.f332f = this.f334h + i3;
        return this.f331d.subSequence(i4, i3).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
