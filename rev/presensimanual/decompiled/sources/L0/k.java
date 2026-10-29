package L0;

import O0.s;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends Z0.b implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f881c;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f881c = Arrays.hashCode(bArr);
    }

    public static byte[] n(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof s)) {
            try {
                s sVar = (s) obj;
                if (((k) sVar).f881c != this.f881c) {
                    return false;
                }
                return Arrays.equals(o(), (byte[]) X0.b.o(new X0.b(((k) sVar).o())));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f881c;
    }

    @Override // Z0.b
    public final boolean l(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            X0.b bVar = new X0.b(o());
            parcel2.writeNoException();
            p002a1.a.c(parcel2, bVar);
        } else {
            if (i3 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f881c);
        }
        return true;
    }

    public abstract byte[] o();
}
