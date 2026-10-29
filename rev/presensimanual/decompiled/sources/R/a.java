package R;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream implements DataInput {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ByteOrder f1401h = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ByteOrder f1402i = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataInputStream f1403d;
    public ByteOrder e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1405g;

    public a(InputStream inputStream) throws IOException {
        this.e = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1403d = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.f1404f = iAvailable;
        this.f1405g = 0;
        dataInputStream.mark(iAvailable);
    }

    public final void a(long j3) throws IOException {
        int i3 = this.f1405g;
        if (i3 > j3) {
            this.f1405g = 0;
            DataInputStream dataInputStream = this.f1403d;
            dataInputStream.reset();
            dataInputStream.mark(this.f1404f);
        } else {
            j3 -= (long) i3;
        }
        int i4 = (int) j3;
        if (skipBytes(i4) != i4) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1403d.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f1405g++;
        return this.f1403d.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f1405g++;
        return this.f1403d.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        int i3 = this.f1405g + 1;
        this.f1405g = i3;
        if (i3 > this.f1404f) {
            throw new EOFException();
        }
        int i4 = this.f1403d.read();
        if (i4 >= 0) {
            return (byte) i4;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f1405g += 2;
        return this.f1403d.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i3, int i4) throws IOException {
        int i5 = this.f1405g + i4;
        this.f1405g = i5;
        if (i5 > this.f1404f) {
            throw new EOFException();
        }
        if (this.f1403d.read(bArr, i3, i4) != i4) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        int i3 = this.f1405g + 4;
        this.f1405g = i3;
        if (i3 > this.f1404f) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f1403d;
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        if ((i4 | i5 | i6 | i7) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.e;
        if (byteOrder == f1401h) {
            return (i7 << 24) + (i6 << 16) + (i5 << 8) + i4;
        }
        if (byteOrder == f1402i) {
            return (i4 << 24) + (i5 << 16) + (i6 << 8) + i7;
        }
        throw new IOException("Invalid byte order: " + this.e);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        int i3 = this.f1405g + 8;
        this.f1405g = i3;
        if (i3 > this.f1404f) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f1403d;
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i4 | i5 | i6 | i7 | i8 | i9 | i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.e;
        if (byteOrder == f1401h) {
            return (((long) i11) << 56) + (((long) i10) << 48) + (((long) i9) << 40) + (((long) i8) << 32) + (((long) i7) << 24) + (((long) i6) << 16) + (((long) i5) << 8) + ((long) i4);
        }
        if (byteOrder == f1402i) {
            return (((long) i4) << 56) + (((long) i5) << 48) + (((long) i6) << 40) + (((long) i7) << 32) + (((long) i8) << 24) + (((long) i9) << 16) + (((long) i10) << 8) + ((long) i11);
        }
        throw new IOException("Invalid byte order: " + this.e);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i3 = this.f1405g + 2;
        this.f1405g = i3;
        if (i3 > this.f1404f) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f1403d;
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        if ((i4 | i5) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.e;
        if (byteOrder == f1401h) {
            return (short) ((i5 << 8) + i4);
        }
        if (byteOrder == f1402i) {
            return (short) ((i4 << 8) + i5);
        }
        throw new IOException("Invalid byte order: " + this.e);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f1405g += 2;
        return this.f1403d.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f1405g++;
        return this.f1403d.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        int i3 = this.f1405g + 2;
        this.f1405g = i3;
        if (i3 > this.f1404f) {
            throw new EOFException();
        }
        DataInputStream dataInputStream = this.f1403d;
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        if ((i4 | i5) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.e;
        if (byteOrder == f1401h) {
            return (i5 << 8) + i4;
        }
        if (byteOrder == f1402i) {
            return (i4 << 8) + i5;
        }
        throw new IOException("Invalid byte order: " + this.e);
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i3) {
        int iMin = Math.min(i3, this.f1404f - this.f1405g);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.f1403d.skipBytes(iMin - iSkipBytes);
        }
        this.f1405g += iSkipBytes;
        return iSkipBytes;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) throws IOException {
        int i5 = this.f1403d.read(bArr, i3, i4);
        this.f1405g += i5;
        return i5;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        int length = this.f1405g + bArr.length;
        this.f1405g = length;
        if (length <= this.f1404f) {
            if (this.f1403d.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
            return;
        }
        throw new EOFException();
    }

    public a(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }
}
