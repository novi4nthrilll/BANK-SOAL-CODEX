package p013d1;

import P.b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: d1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0499p {
    public static b a(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j3;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i3 = byteBufferDuplicate.getShort() & 65535;
        if (i3 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                j3 = -1;
                break;
            }
            int i5 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i5) {
                break;
            }
            i4++;
        }
        if (j3 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j3 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j4 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i6 = 0; i6 < j4; i6++) {
                int i7 = byteBufferDuplicate.getInt();
                long j5 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i7 || 1701669481 == i7) {
                    byteBufferDuplicate.position((int) (j5 + j3));
                    b bVar = new b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f100d = byteBufferDuplicate;
                    bVar.f97a = iPosition;
                    int i8 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f98b = i8;
                    bVar.f99c = ((ByteBuffer) bVar.f100d).getShort(i8);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
