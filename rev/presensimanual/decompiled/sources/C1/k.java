package C1;

import O0.u;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p013d1.A3;
import p013d1.AbstractC0522t;
import p013d1.AbstractC0562z3;
import p016e1.AbstractC0700x;
import p016e1.C0621j3;
import p016e1.D3;
import p016e1.EnumC0704x3;
import p016e1.EnumC0710y3;
import p016e1.InterfaceC0568a4;
import p016e1.K0;
import p016e1.L1;
import p016e1.L2;
import p016e1.S4;

/* JADX INFO: loaded from: classes.dex */
public final class k implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A1.d f170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f171d;
    public final S4 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public L2 f172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L2 f173g;

    public k(Context context, A1.d dVar, S4 s4) {
        this.f169b = context;
        this.f170c = dVar;
        L0.e.f872b.getClass();
        this.f171d = L0.e.a(context);
        this.e = s4;
    }

    @Override // C1.c
    public final boolean a() throws p062s1.a {
        InterfaceC0568a4 c0621j3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Context context = this.f169b;
        A1.d dVar = this.f170c;
        if (this.f172f != null || this.f173g != null) {
            return false;
        }
        try {
            IBinder iBinderB = Y0.e.c(context, Y0.e.f1920b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
            int i9 = D3.f4029c;
            if (iBinderB == null) {
                c0621j3 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                c0621j3 = iInterfaceQueryLocalInterface instanceof InterfaceC0568a4 ? (InterfaceC0568a4) iInterfaceQueryLocalInterface : new C0621j3(iBinderB, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", 3);
            }
            X0.b bVar = new X0.b(context);
            int i10 = dVar.f35b;
            int i11 = dVar.f34a;
            int i12 = dVar.f37d;
            int i13 = dVar.f36c;
            if (i10 == 2) {
                if (this.f173g == null) {
                    this.f173g = ((C0621j3) c0621j3).m(bVar, new L1(2, 2, 0, true, false, dVar.f38f));
                }
                if ((i11 == 2 || i13 == 2 || i12 == 2) && this.f172f == null) {
                    if (i12 == 1) {
                        i6 = 0;
                    } else {
                        if (i12 != 2) {
                            throw new IllegalArgumentException("Invalid mode type: " + i12);
                        }
                        i6 = 1;
                    }
                    if (i11 == 1) {
                        i7 = 0;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalArgumentException("Invalid landmark type: " + i11);
                        }
                        i7 = 1;
                    }
                    if (i13 == 1) {
                        i8 = 0;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalArgumentException("Invalid classification type: " + i13);
                        }
                        i8 = 1;
                    }
                    this.f172f = ((C0621j3) c0621j3).m(bVar, new L1(i6, i7, i8, false, dVar.e, dVar.f38f));
                }
            } else if (this.f172f == null) {
                if (i12 == 1) {
                    i3 = 0;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("Invalid mode type: " + i12);
                    }
                    i3 = 1;
                }
                if (i11 == 1) {
                    i4 = 0;
                } else {
                    if (i11 != 2) {
                        throw new IllegalArgumentException("Invalid landmark type: " + i11);
                    }
                    i4 = 1;
                }
                if (i13 == 1) {
                    i5 = 0;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Invalid classification type: " + i13);
                    }
                    i5 = 1;
                }
                this.f172f = ((C0621j3) c0621j3).m(bVar, new L1(i3, i4, i5, false, dVar.e, dVar.f38f));
            }
            if (this.f172f == null && this.f173g == null && !this.f168a) {
                Log.d("LegacyFaceDelegate", "Request face optional module download.");
                p071w1.h.a(context, "barcode");
                this.f168a = true;
            }
            EnumC0704x3 enumC0704x3 = EnumC0704x3.NO_ERROR;
            AtomicReference atomicReference = i.f165a;
            this.e.b(new h(false, enumC0704x3), EnumC0710y3.ON_DEVICE_FACE_LOAD);
            return false;
        } catch (Y0.b e) {
            throw new p062s1.a("Failed to load deprecated vision dynamite module.", 13, e);
        } catch (RemoteException e3) {
            throw new p062s1.a("Failed to create legacy face detector.", 13, e3);
        }
    }

    @Override // C1.c
    public final void b() {
        L2 l3 = this.f172f;
        if (l3 != null) {
            try {
                l3.l(l3.g(), 3);
            } catch (RemoteException e) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e);
            }
            this.f172f = null;
        }
        L2 l4 = this.f173g;
        if (l4 != null) {
            try {
                l4.l(l4.g(), 3);
            } catch (RemoteException e3) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e3);
            }
            this.f173g = null;
        }
    }

    @Override // C1.c
    public final Pair c(p077y1.a aVar) throws p062s1.a {
        ArrayList arrayListD;
        if (this.f172f == null && this.f173g == null) {
            a();
        }
        L2 l3 = this.f172f;
        if (l3 == null && this.f173g == null) {
            throw new p062s1.a("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        ArrayList arrayListD2 = null;
        if (l3 != null) {
            arrayListD = d(l3, aVar);
            if (!this.f170c.e) {
                g.n(arrayListD);
            }
        } else {
            arrayListD = null;
        }
        L2 l4 = this.f173g;
        if (l4 != null) {
            arrayListD2 = d(l4, aVar);
            g.n(arrayListD2);
        }
        return new Pair(arrayListD, arrayListD2);
    }

    public final ArrayList d(L2 l3, p077y1.a aVar) throws p062s1.a {
        try {
            int i3 = aVar.f5924c;
            int i4 = aVar.f5925d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int iA = AbstractC0562z3.a(aVar.e);
            if (aVar.f5926f == 35 && this.f171d >= 201500000) {
                u.f(null);
                throw null;
            }
            X0.b bVar = new X0.b(A3.a(aVar));
            Parcel parcelG = l3.g();
            AbstractC0700x.a(parcelG, bVar);
            parcelG.writeInt(1);
            int iF = AbstractC0522t.f(parcelG, 20293);
            AbstractC0522t.h(parcelG, 2, 4);
            parcelG.writeInt(i3);
            AbstractC0522t.h(parcelG, 3, 4);
            parcelG.writeInt(i4);
            AbstractC0522t.h(parcelG, 4, 4);
            parcelG.writeInt(0);
            AbstractC0522t.h(parcelG, 5, 8);
            parcelG.writeLong(jElapsedRealtime);
            AbstractC0522t.h(parcelG, 6, 4);
            parcelG.writeInt(iA);
            AbstractC0522t.g(parcelG, iF);
            Parcel parcelK = l3.k(parcelG, 1);
            K0[] k0Arr = (K0[]) parcelK.createTypedArray(K0.CREATOR);
            parcelK.recycle();
            ArrayList arrayList = new ArrayList();
            for (K0 k3 : k0Arr) {
                arrayList.add(new A1.a(k3));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new p062s1.a("Failed to detect with legacy face detector", 13, e);
        }
    }
}
