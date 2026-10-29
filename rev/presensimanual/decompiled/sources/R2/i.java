package R2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class i extends f {
    @Override // R2.f
    public e b(l lVar) {
        B2.h.e(lVar, "path");
        File fileE = lVar.e();
        boolean zIsFile = fileE.isFile();
        boolean zIsDirectory = fileE.isDirectory();
        long jLastModified = fileE.lastModified();
        long length = fileE.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileE.exists()) {
            return new e(zIsFile, zIsDirectory, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    public void c(l lVar, l lVar2) throws IOException {
        B2.h.e(lVar2, "target");
        if (lVar.e().renameTo(lVar2.e())) {
            return;
        }
        throw new IOException("failed to move " + lVar + " to " + lVar2);
    }

    public final void d(l lVar) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileE = lVar.e();
        if (fileE.delete() || !fileE.exists()) {
            return;
        }
        throw new IOException("failed to delete " + lVar);
    }

    public final h e(l lVar) {
        return new h(false, new RandomAccessFile(lVar.e(), "r"));
    }

    public final t f(l lVar) {
        B2.h.e(lVar, "file");
        File fileE = lVar.e();
        int i3 = k.f1531a;
        return new g(new FileInputStream(fileE));
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
