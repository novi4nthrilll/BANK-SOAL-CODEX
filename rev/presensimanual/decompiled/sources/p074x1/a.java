package p074x1;

import A0.g;
import B0.b;
import E0.h;
import M.k;
import N0.o;
import R1.i;
import S1.m;
import W.e;
import Y.C0112g;
import Y0.d;
import android.content.Context;
import android.util.Log;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import p009c1.t;
import p040l1.c;
import p040l1.s;

/* JADX INFO: loaded from: classes.dex */
public final class a implements m, e, d, c, b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5837d;

    public /* synthetic */ a(int i3) {
        this.f5837d = i3;
    }

    @Override // S1.m
    public void a(g gVar, i iVar) {
        iVar.c(null);
    }

    @Override // Y0.d
    public C0112g c(Context context, String str, Y0.c cVar) {
        C0112g c0112g = new C0112g();
        int iB = cVar.b(context, str, true);
        c0112g.f1882b = iB;
        if (iB != 0) {
            c0112g.f1883c = 1;
        } else {
            int iA = cVar.a(context, str);
            c0112g.f1881a = iA;
            if (iA != 0) {
                c0112g.f1883c = -1;
            }
        }
        return c0112g;
    }

    @Override // W.e
    public void d(int i3, Serializable serializable) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case k.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case k.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 == 6 || i3 == 7 || i3 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // W.e
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p053p2.a
    public Object get() {
        return new o(4, Executors.newSingleThreadExecutor());
    }

    @Override // p040l1.c
    public Object h(s sVar) {
        switch (this.f5837d) {
            case 9:
                return new a(0);
            default:
                synchronized (t.class) {
                    byte b3 = (byte) (((byte) 1) | 2);
                    try {
                        if (b3 != 3) {
                            StringBuilder sb = new StringBuilder();
                            if ((b3 & 1) == 0) {
                                sb.append(" enableFirelog");
                            }
                            if ((b3 & 2) == 0) {
                                sb.append(" firelogEventType");
                            }
                            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        t.b(new p009c1.o());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new p067u1.a();
        }
    }

    public a(D0.b bVar) {
        this.f5837d = 6;
    }

    public a(h hVar) {
        this.f5837d = 4;
        this.f5837d = 4;
        new CopyOnWriteArrayList();
    }
}
