package N0;

import O0.C0090d;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class x implements p033j1.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0083d f1117d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0081b f1118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1120h;

    public x(C0083d c0083d, int i3, C0081b c0081b, long j3, long j4) {
        this.f1117d = c0083d;
        this.e = i3;
        this.f1118f = c0081b;
        this.f1119g = j3;
        this.f1120h = j4;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0032 A[RETURN] */
    public static C0090d a(r rVar, com.google.android.gms.common.internal.a aVar, int i3) {
        O0.A a3 = aVar.f2731u;
        C0090d c0090d = a3 == null ? null : a3.f1226d;
        if (c0090d != null && c0090d.f1250b) {
            int[] iArr = c0090d.f1252d;
            int i4 = 0;
            if (iArr == null) {
                int[] iArr2 = c0090d.f1253f;
                if (iArr2 != null) {
                    while (i4 < iArr2.length) {
                        if (iArr2[i4] != i3) {
                            i4++;
                        }
                    }
                }
                if (rVar.f1105m < c0090d.e) {
                    return c0090d;
                }
                return null;
            }
            while (i4 < iArr.length) {
                if (iArr[i4] == i3) {
                    if (rVar.f1105m < c0090d.e) {
                        return c0090d;
                    }
                    return null;
                }
                i4++;
            }
        }
        return null;
    }

    @Override // p033j1.a
    public final void d(p033j1.k kVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        long j3;
        long j4;
        int iElapsedRealtime;
        if (this.f1117d.a()) {
            O0.k kVar2 = (O0.k) O0.j.b().f1284a;
            if (kVar2 == null || kVar2.f1286b) {
                r rVar = (r) this.f1117d.f1077j.get(this.f1118f);
                if (rVar != null) {
                    M0.c cVar = rVar.f1096c;
                    if (cVar instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                        int i7 = 0;
                        boolean z2 = this.f1119g > 0;
                        int i8 = aVar.f2726p;
                        if (kVar2 != null) {
                            z2 &= kVar2.f1287c;
                            int i9 = kVar2.f1288d;
                            int i10 = kVar2.e;
                            i3 = kVar2.f1285a;
                            if (aVar.f2731u != null && !aVar.a()) {
                                C0090d c0090dA = a(rVar, aVar, this.e);
                                if (c0090dA == null) {
                                    return;
                                }
                                boolean z3 = c0090dA.f1251c && this.f1119g > 0;
                                i10 = c0090dA.e;
                                z2 = z3;
                            }
                            i4 = i9;
                            i5 = i10;
                        } else {
                            i3 = 0;
                            i4 = 5000;
                            i5 = 100;
                        }
                        C0083d c0083d = this.f1117d;
                        if (kVar.f()) {
                            i6 = 0;
                        } else {
                            if (kVar.f5000d) {
                                i7 = 100;
                            } else {
                                Exception excC = kVar.c();
                                if (excC instanceof M0.d) {
                                    Status status = ((M0.d) excC).f964d;
                                    int i11 = status.f2707a;
                                    L0.a aVar2 = status.f2710d;
                                    if (aVar2 == null) {
                                        i7 = i11;
                                    } else {
                                        i6 = aVar2.f861b;
                                        i7 = i11;
                                    }
                                } else {
                                    i7 = 101;
                                }
                            }
                            i6 = -1;
                        }
                        if (z2) {
                            long j5 = this.f1119g;
                            long j6 = this.f1120h;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j6);
                            j4 = jCurrentTimeMillis;
                            j3 = j5;
                        } else {
                            j3 = 0;
                            j4 = 0;
                            iElapsedRealtime = -1;
                        }
                        c0083d.getClass();
                        y yVar = new y(new O0.i(this.e, i7, i6, j3, j4, null, null, i8, iElapsedRealtime), i3, i4, i5);
                        Z0.f fVar = c0083d.f1080m;
                        fVar.sendMessage(fVar.obtainMessage(18, yVar));
                    }
                }
            }
        }
    }
}
