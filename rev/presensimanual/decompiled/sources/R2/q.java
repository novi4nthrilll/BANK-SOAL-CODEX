package R2;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1542d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q f1543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q f1544g;

    public q() {
        this.f1539a = new byte[8192];
        this.e = true;
        this.f1542d = false;
    }

    public final q a() {
        q qVar = this.f1543f;
        if (qVar == this) {
            qVar = null;
        }
        q qVar2 = this.f1544g;
        B2.h.b(qVar2);
        qVar2.f1543f = this.f1543f;
        q qVar3 = this.f1543f;
        B2.h.b(qVar3);
        qVar3.f1544g = this.f1544g;
        this.f1543f = null;
        this.f1544g = null;
        return qVar;
    }

    public final void b(q qVar) {
        B2.h.e(qVar, "segment");
        qVar.f1544g = this;
        qVar.f1543f = this.f1543f;
        q qVar2 = this.f1543f;
        B2.h.b(qVar2);
        qVar2.f1544g = qVar;
        this.f1543f = qVar;
    }

    public final q c() {
        this.f1542d = true;
        return new q(this.f1539a, this.f1540b, this.f1541c, true);
    }

    public final void d(q qVar, int i3) {
        B2.h.e(qVar, "sink");
        if (!qVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = qVar.f1541c;
        int i5 = i4 + i3;
        byte[] bArr = qVar.f1539a;
        if (i5 > 8192) {
            if (qVar.f1542d) {
                throw new IllegalArgumentException();
            }
            int i6 = qVar.f1540b;
            if (i5 - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            p059r2.c.a(0, i6, i4, bArr, bArr);
            qVar.f1541c -= qVar.f1540b;
            qVar.f1540b = 0;
        }
        int i7 = qVar.f1541c;
        int i8 = this.f1540b;
        p059r2.c.a(i7, i8, i8 + i3, this.f1539a, bArr);
        qVar.f1541c += i3;
        this.f1540b += i3;
    }

    public q(byte[] bArr, int i3, int i4, boolean z2) {
        B2.h.e(bArr, "data");
        this.f1539a = bArr;
        this.f1540b = i3;
        this.f1541c = i4;
        this.f1542d = z2;
        this.e = false;
    }
}
