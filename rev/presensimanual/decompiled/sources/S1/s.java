package S1;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class s implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f1597a;

    static {
        r rVar = r.f1594a;
        f1597a = new s();
    }

    @Override // S1.n
    public final ByteBuffer a(Object obj) throws IOException {
        q qVar = new q();
        qVar.write(0);
        r.f1594a.k(qVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(qVar.size());
        byteBufferAllocateDirect.put(qVar.a(), 0, qVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // S1.n
    public final A0.g b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        r rVar = r.f1594a;
        Object objE = rVar.e(byteBuffer);
        Object objE2 = rVar.e(byteBuffer);
        if (!(objE instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new A0.g(26, (String) objE, objE2);
    }

    @Override // S1.n
    public final Object c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b3 = byteBuffer.get();
        if (b3 != 0) {
            if (b3 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objE = r.f1594a.e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objE;
        }
        r rVar = r.f1594a;
        Object objE2 = rVar.e(byteBuffer);
        Object objE3 = rVar.e(byteBuffer);
        Object objE4 = rVar.e(byteBuffer);
        if ((objE2 instanceof String) && ((objE3 == null || (objE3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new i((String) objE2, (String) objE3, objE4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // S1.n
    public final ByteBuffer d(A0.g gVar) {
        q qVar = new q();
        r rVar = r.f1594a;
        rVar.k(qVar, (String) gVar.e);
        rVar.k(qVar, gVar.f19f);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(qVar.size());
        byteBufferAllocateDirect.put(qVar.a(), 0, qVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // S1.n
    public final ByteBuffer e(String str, String str2) throws IOException {
        q qVar = new q();
        qVar.write(1);
        r rVar = r.f1594a;
        rVar.k(qVar, "error");
        rVar.k(qVar, str);
        qVar.write(0);
        rVar.k(qVar, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(qVar.size());
        byteBufferAllocateDirect.put(qVar.a(), 0, qVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // S1.n
    public final ByteBuffer f(String str, String str2, Object obj) throws IOException {
        q qVar = new q();
        qVar.write(1);
        r rVar = r.f1594a;
        rVar.k(qVar, str);
        rVar.k(qVar, str2);
        if (obj instanceof Throwable) {
            rVar.k(qVar, Log.getStackTraceString((Throwable) obj));
        } else {
            rVar.k(qVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(qVar.size());
        byteBufferAllocateDirect.put(qVar.a(), 0, qVar.size());
        return byteBufferAllocateDirect;
    }
}
