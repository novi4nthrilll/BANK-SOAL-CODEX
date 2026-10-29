package C1;

import O0.C0092f;
import O0.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p013d1.A3;
import p013d1.AbstractC0522t;
import p013d1.AbstractC0562z3;
import p013d1.I;
import p016e1.AbstractC0700x;
import p016e1.EnumC0704x3;
import p016e1.EnumC0710y3;
import p016e1.S4;
import p016e1.W4;
import p016e1.X4;
import p016e1.Y4;
import p016e1.Z4;
import p016e1.a5;
import p016e1.b5;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f144d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f147h;

    public b(Context context, A1.d dVar, S4 s4) {
        this.f144d = context;
        this.e = dVar;
        this.f145f = s4;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d6 A[LOOP:0: B:22:0x00d0->B:24:0x00d6, LOOP_END] */
    public static ArrayList g(Y4 y4, p077y1.a aVar) throws p062s1.a {
        X0.b bVar;
        X0.b bVar2;
        ArrayList arrayList;
        Iterator it;
        if (aVar.f5926f == -1) {
            ByteBuffer byteBufferA = A3.a(aVar);
            int i3 = aVar.f5924c;
            int i4 = aVar.f5925d;
            int i5 = aVar.e;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            p077y1.a aVar2 = new p077y1.a(byteBufferA, i3, i4, i5, 17);
            p077y1.a.b(17, 3, jElapsedRealtime, i4, i3, byteBufferA.limit(), i5);
            aVar = aVar2;
        }
        int i6 = aVar.f5926f;
        int i7 = aVar.f5924c;
        int i8 = aVar.f5925d;
        int iA = AbstractC0562z3.a(aVar.e);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        p080z1.b.f5958b.getClass();
        int i9 = aVar.f5926f;
        try {
            if (i9 != -1) {
                if (i9 != 17) {
                    if (i9 == 35) {
                        bVar2 = new X0.b(null);
                    } else if (i9 != 842094169) {
                        throw new p062s1.a(I.f("Unsupported image format: ", aVar.f5926f), 3);
                    }
                    Parcel parcelG = y4.g();
                    AbstractC0700x.a(parcelG, bVar2);
                    parcelG.writeInt(1);
                    int iF = AbstractC0522t.f(parcelG, 20293);
                    AbstractC0522t.h(parcelG, 1, 4);
                    parcelG.writeInt(i6);
                    AbstractC0522t.h(parcelG, 2, 4);
                    parcelG.writeInt(i7);
                    AbstractC0522t.h(parcelG, 3, 4);
                    parcelG.writeInt(i8);
                    AbstractC0522t.h(parcelG, 4, 4);
                    parcelG.writeInt(iA);
                    AbstractC0522t.h(parcelG, 5, 8);
                    parcelG.writeLong(jElapsedRealtime2);
                    AbstractC0522t.g(parcelG, iF);
                    Parcel parcelK = y4.k(parcelG, 3);
                    ArrayList arrayListCreateTypedArrayList = parcelK.createTypedArrayList(X4.CREATOR);
                    parcelK.recycle();
                    arrayList = new ArrayList();
                    it = arrayListCreateTypedArrayList.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new A1.a((X4) it.next()));
                    }
                    return arrayList;
                }
                ByteBuffer byteBuffer = aVar.f5923b;
                u.f(byteBuffer);
                bVar = new X0.b(byteBuffer);
            } else {
                Bitmap bitmap = aVar.f5922a;
                u.f(bitmap);
                bVar = new X0.b(bitmap);
            }
            Parcel parcelG2 = y4.g();
            AbstractC0700x.a(parcelG2, bVar2);
            parcelG2.writeInt(1);
            int iF2 = AbstractC0522t.f(parcelG2, 20293);
            AbstractC0522t.h(parcelG2, 1, 4);
            parcelG2.writeInt(i6);
            AbstractC0522t.h(parcelG2, 2, 4);
            parcelG2.writeInt(i7);
            AbstractC0522t.h(parcelG2, 3, 4);
            parcelG2.writeInt(i8);
            AbstractC0522t.h(parcelG2, 4, 4);
            parcelG2.writeInt(iA);
            AbstractC0522t.h(parcelG2, 5, 8);
            parcelG2.writeLong(jElapsedRealtime2);
            AbstractC0522t.g(parcelG2, iF2);
            Parcel parcelK2 = y4.k(parcelG2, 3);
            ArrayList arrayListCreateTypedArrayList2 = parcelK2.createTypedArrayList(X4.CREATOR);
            parcelK2.recycle();
            arrayList = new ArrayList();
            it = arrayListCreateTypedArrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new A1.a((X4) it.next()));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new p062s1.a("Failed to run face detector.", 13, e);
        }
        bVar2 = bVar;
    }

    @Override // C1.c
    public boolean a() throws p062s1.a {
        if (((Y4) this.f147h) != null || ((Y4) this.f146g) != null) {
            return this.f142b;
        }
        Context context = (Context) this.f144d;
        int iA = Y0.e.a(context, ModuleDescriptor.MODULE_ID);
        EnumC0710y3 enumC0710y3 = EnumC0710y3.ON_DEVICE_FACE_LOAD;
        S4 s4 = (S4) this.f145f;
        if (iA > 0) {
            this.f142b = true;
            try {
                e();
            } catch (Y0.b e) {
                throw new p062s1.a("Failed to load the bundled face module.", 13, e);
            } catch (RemoteException e3) {
                throw new p062s1.a("Failed to create thick face detector.", 13, e3);
            }
        } else {
            this.f142b = false;
            try {
                e();
            } catch (Y0.b e4) {
                if (!this.f143c) {
                    p071w1.h.a(context, "face");
                    this.f143c = true;
                }
                boolean z2 = this.f142b;
                EnumC0704x3 enumC0704x3 = EnumC0704x3.OPTIONAL_MODULE_NOT_AVAILABLE;
                AtomicReference atomicReference = i.f165a;
                s4.b(new h(z2, enumC0704x3), enumC0710y3);
                throw new p062s1.a("Waiting for the face module to be downloaded. Please wait.", 14, e4);
            } catch (RemoteException e5) {
                boolean z3 = this.f142b;
                EnumC0704x3 enumC0704x4 = EnumC0704x3.OPTIONAL_MODULE_INIT_ERROR;
                AtomicReference atomicReference2 = i.f165a;
                s4.b(new h(z3, enumC0704x4), enumC0710y3);
                throw new p062s1.a("Failed to create thin face detector.", 13, e5);
            }
        }
        boolean z4 = this.f142b;
        EnumC0704x3 enumC0704x5 = EnumC0704x3.NO_ERROR;
        AtomicReference atomicReference3 = i.f165a;
        s4.b(new h(z4, enumC0704x5), enumC0710y3);
        return this.f142b;
    }

    @Override // C1.c
    public void b() {
        try {
            Y4 y4 = (Y4) this.f147h;
            if (y4 != null) {
                y4.l(y4.g(), 2);
                this.f147h = null;
            }
            Y4 y5 = (Y4) this.f146g;
            if (y5 != null) {
                y5.l(y5.g(), 2);
                this.f146g = null;
            }
        } catch (RemoteException e) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e);
        }
        this.f141a = false;
    }

    @Override // C1.c
    public Pair c(p077y1.a aVar) throws p062s1.a {
        ArrayList arrayListG;
        if (((Y4) this.f147h) == null && ((Y4) this.f146g) == null) {
            a();
        }
        if (!this.f141a) {
            try {
                Y4 y4 = (Y4) this.f147h;
                if (y4 != null) {
                    y4.l(y4.g(), 1);
                }
                Y4 y5 = (Y4) this.f146g;
                if (y5 != null) {
                    y5.l(y5.g(), 1);
                }
                this.f141a = true;
            } catch (RemoteException e) {
                throw new p062s1.a("Failed to init face detector.", 13, e);
            }
        }
        Y4 y6 = (Y4) this.f147h;
        ArrayList arrayListG2 = null;
        if (y6 != null) {
            arrayListG = g(y6, aVar);
            if (!((A1.d) this.e).e) {
                g.n(arrayListG);
            }
        } else {
            arrayListG = null;
        }
        Y4 y7 = (Y4) this.f146g;
        if (y7 != null) {
            arrayListG2 = g(y7, aVar);
            g.n(arrayListG2);
        }
        return new Pair(arrayListG, arrayListG2);
    }

    public Y4 d(Y0.d dVar, String str, String str2, W4 w4) {
        b5 z4;
        Context context = (Context) this.f144d;
        IBinder iBinderB = Y0.e.c(context, dVar, str).b(str2);
        int i3 = a5.f4174c;
        Y4 y4 = null;
        if (iBinderB == null) {
            z4 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
            z4 = iInterfaceQueryLocalInterface instanceof b5 ? (b5) iInterfaceQueryLocalInterface : new Z4(iBinderB, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator", 3);
        }
        X0.b bVar = new X0.b(context);
        Z4 z5 = (Z4) z4;
        Parcel parcelG = z5.g();
        AbstractC0700x.a(parcelG, bVar);
        parcelG.writeInt(1);
        w4.writeToParcel(parcelG, 0);
        Parcel parcelK = z5.k(parcelG, 1);
        IBinder strongBinder = parcelK.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetector");
            y4 = iInterfaceQueryLocalInterface2 instanceof Y4 ? (Y4) iInterfaceQueryLocalInterface2 : new Y4(strongBinder, "com.google.mlkit.vision.face.aidls.IFaceDetector", 3);
        }
        parcelK.recycle();
        return y4;
    }

    public void e() {
        A1.d dVar = (A1.d) this.e;
        if (dVar.f35b != 2) {
            if (((Y4) this.f147h) == null) {
                this.f147h = f(new W4(dVar.f37d, dVar.f34a, dVar.f36c, 1, dVar.e, dVar.f38f));
                return;
            }
            return;
        }
        if (((Y4) this.f146g) == null) {
            this.f146g = f(new W4(dVar.f37d, 1, 1, 2, false, dVar.f38f));
        }
        int i3 = dVar.f34a;
        if ((i3 == 2 || dVar.f36c == 2 || dVar.f37d == 2) && ((Y4) this.f147h) == null) {
            this.f147h = f(new W4(dVar.f37d, i3, dVar.f36c, 1, dVar.e, dVar.f38f));
        }
    }

    public Y4 f(W4 w4) {
        return this.f142b ? d(Y0.e.f1921c, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", w4) : d(Y0.e.f1920b, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", w4);
    }

    public b(String str, String str2, String str3, C0092f c0092f, boolean z2, boolean z3, boolean z4, Integer num) {
        this.f144d = str;
        this.e = str2;
        this.f145f = str3;
        this.f146g = c0092f;
        this.f141a = z2;
        this.f142b = z3;
        this.f143c = z4;
        this.f147h = num;
    }
}
