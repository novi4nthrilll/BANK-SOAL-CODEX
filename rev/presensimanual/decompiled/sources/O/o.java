package O;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1199a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f1200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r f1201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f1202d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1203f;

    public o(r rVar) {
        this.f1200b = rVar;
        this.f1201c = rVar;
    }

    public final int a(int i3) {
        SparseArray sparseArray = this.f1201c.f1215a;
        r rVar = sparseArray == null ? null : (r) sparseArray.get(i3);
        int i4 = 1;
        if (this.f1199a == 2) {
            if (rVar != null) {
                this.f1201c = rVar;
                this.f1203f++;
            } else if (i3 == 65038) {
                b();
            } else if (i3 != 65039) {
                r rVar2 = this.f1201c;
                if (rVar2.f1216b != null) {
                    if (this.f1203f != 1) {
                        this.f1202d = rVar2;
                        b();
                    } else if (c()) {
                        this.f1202d = this.f1201c;
                        b();
                    } else {
                        b();
                    }
                    i4 = 3;
                } else {
                    b();
                }
            }
            i4 = 2;
        } else if (rVar == null) {
            b();
        } else {
            this.f1199a = 2;
            this.f1201c = rVar;
            this.f1203f = 1;
            i4 = 2;
        }
        this.e = i3;
        return i4;
    }

    public final void b() {
        this.f1199a = 1;
        this.f1201c = this.f1200b;
        this.f1203f = 0;
    }

    public final boolean c() {
        P.a aVarC = this.f1201c.f1216b.c();
        int iA = aVarC.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarC.f100d).get(iA + aVarC.f97a) == 0) || this.e == 65039;
    }
}
