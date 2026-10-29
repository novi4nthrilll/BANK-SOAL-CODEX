package W;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f1646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f1648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f1649d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1650f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c[] f1651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f1652h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f1646a = executor;
        this.f1647b = eVar;
        this.e = str;
        this.f1649d = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 >= 24 && i3 <= 34) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = f.f1667h;
                    break;
                case 26:
                    bArr = f.f1666g;
                    break;
                case 27:
                    bArr = f.f1665f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f.e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = f.f1664d;
                    break;
            }
        }
        this.f1648c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1647b.g();
            }
            return null;
        }
    }

    public final void b(final int i3, final Serializable serializable) {
        this.f1646a.execute(new Runnable() { // from class: W.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f1644d.f1647b.d(i3, serializable);
            }
        });
    }
}
