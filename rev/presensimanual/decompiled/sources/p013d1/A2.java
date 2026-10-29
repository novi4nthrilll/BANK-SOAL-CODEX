package p013d1;

/* JADX INFO: loaded from: classes.dex */
public abstract class A2 {
    public static void a(int i3, Object[] objArr) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (objArr[i4] == null) {
                throw new NullPointerException(I.f("at index ", i4));
            }
        }
    }
}
