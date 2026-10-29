package C1;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import java.util.concurrent.atomic.AtomicReference;
import p016e1.C0639m3;
import p016e1.EnumC0609h3;
import p016e1.EnumC0615i3;
import p016e1.EnumC0627k3;
import p016e1.EnumC0633l3;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f165a = new AtomicReference();

    public static C0639m3 a(A1.d dVar) {
        EnumC0627k3 enumC0627k3;
        EnumC0609h3 enumC0609h3;
        EnumC0633l3 enumC0633l3;
        EnumC0615i3 enumC0615i3;
        E0.k kVar = new E0.k();
        int i3 = dVar.f34a;
        if (i3 != 1) {
            enumC0627k3 = i3 != 2 ? EnumC0627k3.UNKNOWN_LANDMARKS : EnumC0627k3.ALL_LANDMARKS;
        } else {
            enumC0627k3 = EnumC0627k3.NO_LANDMARKS;
        }
        kVar.f226d = enumC0627k3;
        int i4 = dVar.f36c;
        if (i4 != 1) {
            enumC0609h3 = i4 != 2 ? EnumC0609h3.UNKNOWN_CLASSIFICATIONS : EnumC0609h3.ALL_CLASSIFICATIONS;
        } else {
            enumC0609h3 = EnumC0609h3.NO_CLASSIFICATIONS;
        }
        kVar.e = enumC0609h3;
        int i5 = dVar.f37d;
        if (i5 != 1) {
            enumC0633l3 = i5 != 2 ? EnumC0633l3.UNKNOWN_PERFORMANCE : EnumC0633l3.ACCURATE;
        } else {
            enumC0633l3 = EnumC0633l3.FAST;
        }
        kVar.f227f = enumC0633l3;
        int i6 = dVar.f35b;
        if (i6 != 1) {
            enumC0615i3 = i6 != 2 ? EnumC0615i3.UNKNOWN_CONTOURS : EnumC0615i3.ALL_CONTOURS;
        } else {
            enumC0615i3 = EnumC0615i3.NO_CONTOURS;
        }
        kVar.f228g = enumC0615i3;
        kVar.f229h = Boolean.valueOf(dVar.e);
        kVar.f230i = Float.valueOf(dVar.f38f);
        return new C0639m3(kVar);
    }

    public static boolean b() {
        AtomicReference atomicReference = f165a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z2 = Y0.e.a(p071w1.f.c().b(), ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z2));
        return z2;
    }
}
