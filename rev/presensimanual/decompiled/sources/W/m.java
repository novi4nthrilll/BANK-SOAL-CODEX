package W;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1677d;

    public m(int i3, int i4, long j3, long j4) {
        this.f1674a = i3;
        this.f1675b = i4;
        this.f1676c = j3;
        this.f1677d = j4;
    }

    public static m a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            m mVar = new m(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return mVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1674a);
            dataOutputStream.writeInt(this.f1675b);
            dataOutputStream.writeLong(this.f1676c);
            dataOutputStream.writeLong(this.f1677d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f1675b == mVar.f1675b && this.f1676c == mVar.f1676c && this.f1674a == mVar.f1674a && this.f1677d == mVar.f1677d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1675b), Long.valueOf(this.f1676c), Integer.valueOf(this.f1674a), Long.valueOf(this.f1677d));
    }
}
