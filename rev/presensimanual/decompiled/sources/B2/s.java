package B2;

import p013d1.I;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static void a(int i3, Object obj) {
        if (obj == null || b(i3, obj)) {
            return;
        }
        String strF = I.f("kotlin.jvm.functions.Function", i3);
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + strF);
        h.f(classCastException, s.class.getName());
        throw classCastException;
    }

    public static boolean b(int i3, Object obj) {
        int iD;
        if (!(obj instanceof p055q2.a)) {
            return false;
        }
        if (obj instanceof f) {
            iD = ((f) obj).d();
        } else if (obj instanceof A2.a) {
            iD = 0;
        } else if (obj instanceof A2.l) {
            iD = 1;
        } else if (obj instanceof A2.p) {
            iD = 2;
        } else {
            iD = obj instanceof A2.q ? 3 : -1;
        }
        return iD == i3;
    }
}
