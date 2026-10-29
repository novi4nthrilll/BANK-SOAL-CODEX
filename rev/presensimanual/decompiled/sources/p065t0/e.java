package p065t0;

import B2.h;
import H0.a;
import N0.j;
import R2.b;
import R2.l;
import W1.I;
import W1.u;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import id.go.bangkalankab.simpeg.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import p006b1.f;
import p006b1.i;
import p006b1.k;
import p006b1.m;
import p006b1.y;
import p040l1.c;
import p040l1.s;
import p071w1.d;
import p071w1.g;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a, V.a, I, c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f5709d;
    public static e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static e f5710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ e f5711g = new e();

    public static l e(String str, boolean z2) {
        h.e(str, "<this>");
        b bVar = S2.b.f1601a;
        R2.a aVar = new R2.a();
        aVar.p(str);
        return S2.b.d(aVar, z2);
    }

    public static l f(File file) {
        String str = l.e;
        String string = file.toString();
        h.d(string, "toString()");
        return e(string, false);
    }

    public static synchronized e g() {
        try {
            if (f5709d == null) {
                f5709d = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5709d;
    }

    @Override // V.a
    public CharSequence a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f2419d.getString(R.string.not_set);
        }
        return null;
    }

    @Override // H0.a
    public long b() {
        return System.currentTimeMillis();
    }

    public String d(List list) throws IOException {
        h.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        h.d(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    @Override // p040l1.c
    public Object h(s sVar) {
        return new d(sVar.b(g.class));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0003, B:6:0x000e, B:7:0x0013, B:11:0x0019, B:13:0x0026, B:16:0x002d, B:18:0x0030, B:21:0x003e, B:24:0x0044, B:26:0x004e, B:29:0x00bd, B:27:0x0095, B:28:0x00b8), top: B:33:0x0003 }] */
    public void i(i iVar, N0.h hVar, boolean z2, p033j1.e eVar) {
        synchronized (iVar.f2527z) {
            try {
                p006b1.h hVar2 = (p006b1.h) iVar.f2527z.remove(hVar);
                if (hVar2 == null) {
                    eVar.a(Boolean.FALSE);
                    return;
                }
                j jVarC = hVar2.f2524c.c();
                L0.c cVar = null;
                jVarC.f1085b = null;
                jVarC.f1086c = null;
                if (z2) {
                    L0.c[] cVarArrB = iVar.b();
                    if (cVarArrB != null) {
                        for (L0.c cVar2 : cVarArrB) {
                            if ("location_updates_with_callback".equals(cVar2.f866a)) {
                                cVar = cVar2;
                                break;
                            }
                        }
                        if (cVar != null && cVar.a() >= 1) {
                            y yVar = (y) iVar.q();
                            int iIdentityHashCode = System.identityHashCode(hVar2);
                            StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                            sb.append("ILocationCallback@");
                            sb.append(iIdentityHashCode);
                            k kVar = new k(2, null, hVar2, null, sb.toString());
                            f fVar = new f(Boolean.TRUE, eVar);
                            Parcel parcelG = yVar.g();
                            p006b1.b.b(parcelG, kVar);
                            parcelG.writeStrongBinder(fVar);
                            yVar.l(parcelG, 89);
                        } else {
                            y yVar2 = (y) iVar.q();
                            m mVar = new m(2, null, null, hVar2, null, new p006b1.g(eVar), null);
                            Parcel parcelG2 = yVar2.g();
                            p006b1.b.b(parcelG2, mVar);
                            yVar2.l(parcelG2, 59);
                        }
                    } else {
                        y yVar3 = (y) iVar.q();
                        m mVar2 = new m(2, null, null, hVar2, null, new p006b1.g(eVar), null);
                        Parcel parcelG3 = yVar3.g();
                        p006b1.b.b(parcelG3, mVar2);
                        yVar3.l(parcelG3, 59);
                    }
                } else {
                    eVar.a(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W1.I
    public void c(u uVar) {
    }
}
