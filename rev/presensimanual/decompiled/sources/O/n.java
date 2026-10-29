package O;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f1195d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E0.n f1197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f1198c = 0;

    public n(E0.n nVar, int i3) {
        this.f1197b = nVar;
        this.f1196a = i3;
    }

    public final int a(int i3) {
        P.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarC.f100d;
        int i4 = iA + aVarC.f97a;
        return byteBuffer.getInt((i3 * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    public final int b() {
        P.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i3 = iA + aVarC.f97a;
        return ((ByteBuffer) aVarC.f100d).getInt(((ByteBuffer) aVarC.f100d).getInt(i3) + i3);
    }

    public final P.a c() {
        ThreadLocal threadLocal = f1195d;
        P.a aVar = (P.a) threadLocal.get();
        if (aVar == null) {
            aVar = new P.a();
            threadLocal.set(aVar);
        }
        P.b bVar = (P.b) this.f1197b.f236d;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i3 = iA + bVar.f97a;
            int i4 = (this.f1196a * 4) + ((ByteBuffer) bVar.f100d).getInt(i3) + i3 + 4;
            int i5 = ((ByteBuffer) bVar.f100d).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f100d;
            aVar.f100d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f97a = i5;
                int i6 = i5 - byteBuffer.getInt(i5);
                aVar.f98b = i6;
                aVar.f99c = ((ByteBuffer) aVar.f100d).getShort(i6);
            } else {
                aVar.f97a = 0;
                aVar.f98b = 0;
                aVar.f99c = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        P.a aVarC = c();
        int iA = aVarC.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarC.f100d).getInt(iA + aVarC.f97a) : 0));
        sb.append(", codepoints:");
        int iB = b();
        for (int i3 = 0; i3 < iB; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
