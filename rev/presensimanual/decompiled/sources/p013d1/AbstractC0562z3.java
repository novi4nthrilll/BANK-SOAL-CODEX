package p013d1;

/* JADX INFO: renamed from: d1.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0562z3 {
    public static int a(int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 90) {
            return 1;
        }
        if (i3 == 180) {
            return 2;
        }
        if (i3 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(I.f("Invalid rotation: ", i3));
    }
}
